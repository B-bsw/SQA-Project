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
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String str11 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj15 = commandLine0.getOptionObject('#');
        java.lang.String str18 = commandLine0.getOptionValue(' ', "");
        java.lang.Object obj20 = commandLine0.getOptionObject("");
        java.lang.Object obj22 = commandLine0.getOptionObject('4');
        boolean boolean24 = commandLine0.hasOption('4');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
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
        boolean boolean19 = commandLine0.hasOption("");
        java.util.List list20 = commandLine0.getArgList();
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
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        java.lang.String[] strArray4 = commandLine0.getOptionValues("hi!");
        java.util.List list5 = commandLine0.getArgList();
        commandLine0.addArg("");
        boolean boolean9 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray10 = commandLine0.getArgs();
        java.util.List list11 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertArrayEquals(optionArray2, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String str10 = commandLine0.getOptionValue("hi!", "");
        boolean boolean12 = commandLine0.hasOption("");
        java.lang.String str15 = commandLine0.getOptionValue(' ', "");
        java.lang.String[] strArray17 = commandLine0.getOptionValues('#');
        org.apache.commons.cli.Option[] optionArray18 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNotNull(optionArray18);
        org.junit.Assert.assertArrayEquals(optionArray18, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.util.List list8 = commandLine0.getArgList();
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.String str13 = commandLine0.getOptionValue('#', "hi!");
        java.lang.String[] strArray15 = commandLine0.getOptionValues('4');
        java.lang.String str17 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str10 = commandLine0.getOptionValue("");
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "hi!");
        commandLine0.addArg("");
        java.lang.String str17 = commandLine0.getOptionValue('#');
        java.util.List list18 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('a');
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.lang.Class<?> wildcardClass12 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray11 = commandLine0.getOptionValues('4');
        boolean boolean13 = commandLine0.hasOption('a');
        java.lang.String str15 = commandLine0.getOptionValue("hi!");
        java.lang.String str18 = commandLine0.getOptionValue("", "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
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
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue('#', "hi!");
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray11 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.lang.String[] strArray14 = commandLine0.getOptionValues("");
        java.util.List list15 = commandLine0.getArgList();
        boolean boolean17 = commandLine0.hasOption(' ');
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray16 = commandLine0.getOptionValues('4');
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
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(optionArray17);
        org.junit.Assert.assertArrayEquals(optionArray17, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
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
        java.lang.Object obj25 = commandLine0.getOptionObject("");
        java.lang.String str28 = commandLine0.getOptionValue('#', "");
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
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        boolean boolean12 = commandLine0.hasOption('#');
        java.lang.String[] strArray14 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray15 = commandLine0.getOptions();
        java.lang.String str17 = commandLine0.getOptionValue('#');
        java.lang.Object obj19 = commandLine0.getOptionObject('4');
        java.lang.String str21 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(optionArray15);
        org.junit.Assert.assertArrayEquals(optionArray15, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        boolean boolean11 = commandLine0.hasOption("hi!");
        java.util.Iterator iterator12 = commandLine0.iterator();
        java.lang.String[] strArray14 = commandLine0.getOptionValues('a');
        java.util.Iterator iterator15 = commandLine0.iterator();
        java.lang.String[] strArray17 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray18 = commandLine0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNotNull(optionArray18);
        org.junit.Assert.assertArrayEquals(optionArray18, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        boolean boolean9 = commandLine0.hasOption("hi!");
        java.lang.String str12 = commandLine0.getOptionValue('#', "");
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray15 = commandLine0.getOptions();
        java.util.List list16 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(optionArray15);
        org.junit.Assert.assertArrayEquals(optionArray15, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("hi!");
        java.lang.String str11 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.util.Iterator iterator13 = commandLine0.iterator();
        java.lang.String str15 = commandLine0.getOptionValue('4');
        java.lang.String str17 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray19 = commandLine0.getOptionValues('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strArray19);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.lang.Object obj6 = commandLine0.getOptionObject("");
        java.lang.String[] strArray7 = commandLine0.getArgs();
        java.lang.String[] strArray9 = commandLine0.getOptionValues("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        boolean boolean8 = commandLine0.hasOption(' ');
        java.lang.String str10 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.util.List list8 = commandLine0.getArgList();
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.util.Iterator iterator10 = commandLine0.iterator();
        java.lang.String str12 = commandLine0.getOptionValue("hi!");
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.lang.String[] strArray15 = commandLine0.getOptionValues("hi!");
        java.lang.String str18 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray19 = commandLine0.getOptions();
        java.lang.String str22 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.Class<?> wildcardClass23 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(optionArray19);
        org.junit.Assert.assertArrayEquals(optionArray19, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray3 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String str8 = commandLine0.getOptionValue('a');
        boolean boolean10 = commandLine0.hasOption('a');
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(optionArray3);
        org.junit.Assert.assertArrayEquals(optionArray3, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strArray12);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str12 = commandLine0.getOptionValue("", "");
        commandLine0.addArg("hi!");
        boolean boolean16 = commandLine0.hasOption("hi!");
        boolean boolean18 = commandLine0.hasOption("");
        java.lang.String str20 = commandLine0.getOptionValue(' ');
        java.lang.String str22 = commandLine0.getOptionValue("");
        java.util.List list23 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        java.util.Iterator iterator8 = commandLine0.iterator();
        java.lang.String str10 = commandLine0.getOptionValue('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String str9 = commandLine0.getOptionValue('#', "");
        java.lang.String str11 = commandLine0.getOptionValue('4');
        java.lang.Object obj13 = commandLine0.getOptionObject('4');
        java.lang.Object obj15 = commandLine0.getOptionObject('a');
        java.lang.String str17 = commandLine0.getOptionValue('a');
        boolean boolean19 = commandLine0.hasOption("");
        java.lang.Class<?> wildcardClass20 = commandLine0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        commandLine0.addArg("hi!");
        java.lang.String[] strArray13 = commandLine0.getOptionValues('4');
        java.lang.String[] strArray15 = commandLine0.getOptionValues("");
        commandLine0.addArg("hi!");
        boolean boolean19 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
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
        java.lang.String str18 = commandLine0.getOptionValue("");
        java.lang.Object obj20 = commandLine0.getOptionObject("");
        boolean boolean22 = commandLine0.hasOption(' ');
        java.lang.Object obj24 = commandLine0.getOptionObject('4');
        java.lang.String str26 = commandLine0.getOptionValue("");
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
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.String str6 = commandLine0.getOptionValue(' ', "");
        boolean boolean8 = commandLine0.hasOption(' ');
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        java.lang.String str12 = commandLine0.getOptionValue(' ');
        java.lang.String str14 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj16 = commandLine0.getOptionObject("hi!");
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
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
        java.lang.String str17 = commandLine0.getOptionValue('4');
        java.lang.String str20 = commandLine0.getOptionValue(' ', "hi!");
        org.apache.commons.cli.Option[] optionArray21 = commandLine0.getOptions();
        java.util.Iterator iterator22 = commandLine0.iterator();
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
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(optionArray21);
        org.junit.Assert.assertArrayEquals(optionArray21, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator22);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
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
        java.util.Iterator iterator17 = commandLine0.iterator();
        java.lang.Object obj19 = commandLine0.getOptionObject("");
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
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.util.List list9 = commandLine0.getArgList();
        java.lang.String str11 = commandLine0.getOptionValue("hi!");
        java.util.List list12 = commandLine0.getArgList();
        java.lang.Object obj14 = commandLine0.getOptionObject("");
        java.lang.String str16 = commandLine0.getOptionValue('4');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str11 = commandLine0.getOptionValue("", "");
        java.lang.String str13 = commandLine0.getOptionValue(' ');
        java.lang.String str16 = commandLine0.getOptionValue('a', "hi!");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.util.Iterator iterator6 = commandLine0.iterator();
        java.util.List list7 = commandLine0.getArgList();
        java.lang.Object obj9 = commandLine0.getOptionObject('4');
        boolean boolean11 = commandLine0.hasOption("");
        java.util.List list12 = commandLine0.getArgList();
        java.lang.String str14 = commandLine0.getOptionValue('#');
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
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
        org.apache.commons.cli.Option[] optionArray20 = commandLine0.getOptions();
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
        org.junit.Assert.assertNotNull(optionArray20);
        org.junit.Assert.assertArrayEquals(optionArray20, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
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
        java.lang.String[] strArray21 = commandLine0.getOptionValues("");
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
        org.junit.Assert.assertNull(strArray21);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String str11 = commandLine0.getOptionValue('a', "");
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('4');
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('#', "");
        java.util.List list11 = commandLine0.getArgList();
        java.util.List list12 = commandLine0.getArgList();
        java.util.List list13 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('a');
        java.util.List list11 = commandLine0.getArgList();
        java.util.List list12 = commandLine0.getArgList();
        java.util.List list13 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('4');
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('#', "");
        java.lang.String str12 = commandLine0.getOptionValue('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.util.Iterator iterator6 = commandLine0.iterator();
        java.util.List list7 = commandLine0.getArgList();
        java.lang.Object obj9 = commandLine0.getOptionObject('4');
        boolean boolean11 = commandLine0.hasOption("");
        commandLine0.addArg("");
        java.lang.String str16 = commandLine0.getOptionValue('4', "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
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
        org.apache.commons.cli.Option[] optionArray20 = commandLine0.getOptions();
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
        org.junit.Assert.assertNotNull(optionArray20);
        org.junit.Assert.assertArrayEquals(optionArray20, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        boolean boolean11 = commandLine0.hasOption("");
        java.lang.String str13 = commandLine0.getOptionValue("");
        java.lang.Object obj15 = commandLine0.getOptionObject('4');
        org.apache.commons.cli.Option[] optionArray16 = commandLine0.getOptions();
        java.lang.String str18 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(optionArray16);
        org.junit.Assert.assertArrayEquals(optionArray16, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String str10 = commandLine0.getOptionValue("");
        java.lang.Object obj12 = commandLine0.getOptionObject('4');
        java.lang.String str15 = commandLine0.getOptionValue("", "");
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray18 = commandLine0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(optionArray18);
        org.junit.Assert.assertArrayEquals(optionArray18, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.util.List list9 = commandLine0.getArgList();
        java.lang.Object obj11 = commandLine0.getOptionObject("");
        java.util.Iterator iterator12 = commandLine0.iterator();
        java.lang.String str14 = commandLine0.getOptionValue("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        commandLine0.addArg("");
        java.lang.Object obj14 = commandLine0.getOptionObject('#');
        java.lang.String str16 = commandLine0.getOptionValue('a');
        java.lang.String str18 = commandLine0.getOptionValue("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
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
        java.lang.Object obj27 = commandLine0.getOptionObject("");
        java.lang.String str30 = commandLine0.getOptionValue(' ', "hi!");
        java.lang.String[] strArray32 = commandLine0.getOptionValues('#');
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
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNull(strArray32);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "hi!");
        boolean boolean15 = commandLine0.hasOption('a');
        java.lang.String[] strArray17 = commandLine0.getOptionValues('4');
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
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray15 = commandLine0.getOptionValues("");
        java.lang.String str18 = commandLine0.getOptionValue("", "hi!");
        java.util.List list19 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String str11 = commandLine0.getOptionValue('a', "");
        java.lang.Object obj13 = commandLine0.getOptionObject('#');
        java.util.List list14 = commandLine0.getArgList();
        boolean boolean16 = commandLine0.hasOption('a');
        java.lang.String[] strArray18 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray20 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNull(strArray20);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.util.Iterator iterator7 = commandLine0.iterator();
        boolean boolean9 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("");
        java.lang.String str15 = commandLine0.getOptionValue('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue('#', "hi!");
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray11 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.lang.String str15 = commandLine0.getOptionValue(' ', "");
        java.lang.String[] strArray16 = commandLine0.getArgs();
        java.lang.String str18 = commandLine0.getOptionValue("");
        java.util.Iterator iterator19 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(iterator19);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.lang.String str11 = commandLine0.getOptionValue('4', "");
        java.lang.String str13 = commandLine0.getOptionValue("");
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.Object obj16 = commandLine0.getOptionObject('4');
        java.util.List list17 = commandLine0.getArgList();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.util.Iterator iterator7 = commandLine0.iterator();
        commandLine0.addArg("hi!");
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("");
        java.lang.Object obj15 = commandLine0.getOptionObject("hi!");
        java.lang.Object obj17 = commandLine0.getOptionObject('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String str11 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray13 = commandLine0.getOptionValues(' ');
        java.util.List list14 = commandLine0.getArgList();
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String str9 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj11 = commandLine0.getOptionObject("");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue("hi!");
        commandLine0.addArg("hi!");
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String str11 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String str13 = commandLine0.getOptionValue("");
        commandLine0.addArg("");
        java.lang.String str18 = commandLine0.getOptionValue('4', "");
        java.lang.String[] strArray20 = commandLine0.getOptionValues('#');
        java.lang.Object obj22 = commandLine0.getOptionObject('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.util.Iterator iterator6 = commandLine0.iterator();
        commandLine0.addArg("hi!");
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        java.lang.String[] strArray14 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.lang.String str11 = commandLine0.getOptionValue('4', "");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray15 = commandLine0.getOptionValues(' ');
        java.util.List list16 = commandLine0.getArgList();
        java.lang.String str18 = commandLine0.getOptionValue("");
        java.util.Iterator iterator19 = commandLine0.iterator();
        java.lang.String[] strArray21 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNull(strArray21);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.lang.Object obj10 = commandLine0.getOptionObject('#');
        java.lang.String str12 = commandLine0.getOptionValue('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.util.List list9 = commandLine0.getArgList();
        java.lang.String str11 = commandLine0.getOptionValue('4');
        java.util.Iterator iterator12 = commandLine0.iterator();
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.lang.String str16 = commandLine0.getOptionValue('#', "");
        java.util.Iterator iterator17 = commandLine0.iterator();
        commandLine0.addArg("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue("", "hi!");
        boolean boolean10 = commandLine0.hasOption("");
        java.lang.String str13 = commandLine0.getOptionValue('4', "hi!");
        java.lang.String[] strArray14 = commandLine0.getArgs();
        boolean boolean16 = commandLine0.hasOption('a');
        boolean boolean18 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        boolean boolean11 = commandLine0.hasOption("hi!");
        java.util.Iterator iterator12 = commandLine0.iterator();
        java.lang.String[] strArray14 = commandLine0.getOptionValues('a');
        java.lang.String str16 = commandLine0.getOptionValue("");
        java.lang.String str19 = commandLine0.getOptionValue("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("hi!");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        boolean boolean11 = commandLine0.hasOption("hi!");
        java.lang.Class<?> wildcardClass12 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String str11 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray15 = commandLine0.getOptionValues("");
        java.lang.Object obj17 = commandLine0.getOptionObject('a');
        java.lang.String str20 = commandLine0.getOptionValue('a', "");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.String str10 = commandLine0.getOptionValue("", "");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.util.List list13 = commandLine0.getArgList();
        commandLine0.addArg("hi!");
        boolean boolean17 = commandLine0.hasOption("");
        java.lang.String[] strArray18 = commandLine0.getArgs();
        boolean boolean20 = commandLine0.hasOption('#');
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
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        java.lang.Object obj14 = commandLine0.getOptionObject(' ');
        java.lang.String[] strArray16 = commandLine0.getOptionValues("");
        java.lang.String str18 = commandLine0.getOptionValue('#');
        java.lang.String str20 = commandLine0.getOptionValue("hi!");
        java.lang.String str22 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.Class<?> wildcardClass10 = optionArray9.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String str9 = commandLine0.getOptionValue('#');
        java.util.Iterator iterator10 = commandLine0.iterator();
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.lang.String[] strArray13 = commandLine0.getOptionValues("");
        java.lang.String str15 = commandLine0.getOptionValue("");
        java.lang.String[] strArray17 = commandLine0.getOptionValues('4');
        java.lang.String str19 = commandLine0.getOptionValue('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.util.List list6 = commandLine0.getArgList();
        boolean boolean8 = commandLine0.hasOption('4');
        java.util.List list9 = commandLine0.getArgList();
        boolean boolean11 = commandLine0.hasOption("hi!");
        boolean boolean13 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
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
        java.lang.String str18 = commandLine0.getOptionValue("");
        java.lang.Object obj20 = commandLine0.getOptionObject("");
        boolean boolean22 = commandLine0.hasOption(' ');
        java.util.Iterator iterator23 = commandLine0.iterator();
        java.lang.String[] strArray25 = commandLine0.getOptionValues("");
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
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNull(strArray25);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str13 = commandLine0.getOptionValue('a');
        java.lang.Object obj15 = commandLine0.getOptionObject("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
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
        boolean boolean21 = commandLine0.hasOption('a');
        java.lang.String str23 = commandLine0.getOptionValue('a');
        java.lang.String str26 = commandLine0.getOptionValue('a', "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
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
        java.lang.String str23 = commandLine0.getOptionValue('a');
        java.lang.String str26 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str28 = commandLine0.getOptionValue("");
        java.lang.String str31 = commandLine0.getOptionValue('4', "hi!");
        boolean boolean33 = commandLine0.hasOption("");
        java.lang.String[] strArray35 = commandLine0.getOptionValues('#');
        java.lang.String str37 = commandLine0.getOptionValue("hi!");
        java.lang.String str39 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.lang.String str8 = commandLine0.getOptionValue('4');
        java.lang.String str10 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        java.lang.String str15 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String[] strArray17 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
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
        java.util.Iterator iterator19 = commandLine0.iterator();
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
        org.junit.Assert.assertNotNull(iterator19);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
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
        java.lang.String str20 = commandLine0.getOptionValue('a', "hi!");
        boolean boolean22 = commandLine0.hasOption("hi!");
        java.lang.Object obj24 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray26 = commandLine0.getOptionValues("hi!");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(strArray26);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String str10 = commandLine0.getOptionValue("");
        java.lang.String str13 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray15 = commandLine0.getOptionValues('#');
        java.lang.Object obj17 = commandLine0.getOptionObject('4');
        java.lang.String str20 = commandLine0.getOptionValue('#', "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String str9 = commandLine0.getOptionValue('#');
        java.util.Iterator iterator10 = commandLine0.iterator();
        java.lang.String str12 = commandLine0.getOptionValue('4');
        java.lang.String str14 = commandLine0.getOptionValue('#');
        boolean boolean16 = commandLine0.hasOption('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        boolean boolean7 = commandLine0.hasOption('a');
        java.lang.String[] strArray9 = commandLine0.getOptionValues("");
        commandLine0.addArg("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        boolean boolean10 = commandLine0.hasOption(' ');
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj14 = commandLine0.getOptionObject("hi!");
        org.apache.commons.cli.Option[] optionArray15 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(optionArray15);
        org.junit.Assert.assertArrayEquals(optionArray15, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.String[] strArray4 = commandLine0.getArgs();
        java.lang.String[] strArray5 = commandLine0.getArgs();
        java.lang.String str8 = commandLine0.getOptionValue('#', "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        boolean boolean6 = commandLine0.hasOption("");
        java.lang.Object obj8 = commandLine0.getOptionObject("");
        boolean boolean10 = commandLine0.hasOption(' ');
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String str14 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String[] strArray16 = commandLine0.getOptionValues("");
        java.lang.Object obj18 = commandLine0.getOptionObject('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        java.lang.String[] strArray10 = commandLine0.getArgs();
        java.lang.String str12 = commandLine0.getOptionValue('a');
        java.lang.String[] strArray13 = commandLine0.getArgs();
        java.util.List list14 = commandLine0.getArgList();
        java.lang.String str16 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.util.Iterator iterator7 = commandLine0.iterator();
        boolean boolean9 = commandLine0.hasOption("hi!");
        java.util.Iterator iterator10 = commandLine0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.lang.String str11 = commandLine0.getOptionValue('4', "");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        java.lang.String str16 = commandLine0.getOptionValue("", "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str10 = commandLine0.getOptionValue("");
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "hi!");
        commandLine0.addArg("");
        java.lang.String str17 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray19 = commandLine0.getOptionValues('4');
        commandLine0.addArg("");
        java.util.List list22 = commandLine0.getArgList();
        java.lang.Object obj24 = commandLine0.getOptionObject(' ');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.Object obj10 = commandLine0.getOptionObject('a');
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.util.Iterator iterator12 = commandLine0.iterator();
        commandLine0.addArg("hi!");
        java.lang.String str16 = commandLine0.getOptionValue('#');
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
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.lang.String[] strArray13 = commandLine0.getArgs();
        java.lang.Object obj15 = commandLine0.getOptionObject('a');
        java.lang.String str18 = commandLine0.getOptionValue(' ', "");
        java.lang.Object obj20 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray22 = commandLine0.getOptionValues(' ');
        org.apache.commons.cli.Option[] optionArray23 = commandLine0.getOptions();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(optionArray23);
        org.junit.Assert.assertArrayEquals(optionArray23, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
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
        java.lang.Object obj25 = commandLine0.getOptionObject(' ');
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
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.lang.String str14 = commandLine0.getOptionValue('4');
        java.lang.String str16 = commandLine0.getOptionValue('a');
        java.lang.Object obj18 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray3 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(optionArray3);
        org.junit.Assert.assertArrayEquals(optionArray3, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.util.List list8 = commandLine0.getArgList();
        java.util.List list9 = commandLine0.getArgList();
        java.util.List list10 = commandLine0.getArgList();
        java.util.Iterator iterator11 = commandLine0.iterator();
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
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        boolean boolean9 = commandLine0.hasOption("hi!");
        boolean boolean11 = commandLine0.hasOption('4');
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        java.util.List list14 = commandLine0.getArgList();
        java.lang.Object obj16 = commandLine0.getOptionObject("hi!");
        java.lang.Object obj18 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
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
        java.lang.Class<?> wildcardClass17 = commandLine0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
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
        java.lang.String[] strArray16 = commandLine0.getOptionValues("");
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
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.lang.String str11 = commandLine0.getOptionValue('4', "");
        java.lang.String str13 = commandLine0.getOptionValue("");
        boolean boolean15 = commandLine0.hasOption(' ');
        java.util.List list16 = commandLine0.getArgList();
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
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
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
        boolean boolean18 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        commandLine0.addArg("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        java.util.Iterator iterator10 = commandLine0.iterator();
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.lang.String str14 = commandLine0.getOptionValue("", "hi!");
        java.lang.String[] strArray16 = commandLine0.getOptionValues("hi!");
        java.util.List list17 = commandLine0.getArgList();
        java.lang.String str20 = commandLine0.getOptionValue(' ', "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        java.util.List list3 = commandLine0.getArgList();
        java.lang.String str6 = commandLine0.getOptionValue('a', "");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        java.lang.String str15 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option[] optionArray16 = commandLine0.getOptions();
        boolean boolean18 = commandLine0.hasOption("hi!");
        boolean boolean20 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(optionArray16);
        org.junit.Assert.assertArrayEquals(optionArray16, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        java.lang.String str10 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        java.lang.String str15 = commandLine0.getOptionValue("", "");
        java.lang.Object obj17 = commandLine0.getOptionObject(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String str5 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray7 = commandLine0.getOptionValues("");
        java.lang.Object obj9 = commandLine0.getOptionObject("hi!");
        boolean boolean11 = commandLine0.hasOption(' ');
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
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        java.lang.String[] strArray4 = commandLine0.getOptionValues("hi!");
        java.lang.String str6 = commandLine0.getOptionValue("hi!");
        java.lang.String str9 = commandLine0.getOptionValue("hi!", "");
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertArrayEquals(optionArray2, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
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
        java.lang.Object obj17 = commandLine0.getOptionObject(' ');
        java.util.List list18 = commandLine0.getArgList();
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray7 = commandLine0.getOptionValues('4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(strArray7);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray4 = commandLine0.getOptionValues("hi!");
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str9 = commandLine0.getOptionValue("");
        java.lang.String[] strArray11 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        java.util.List list11 = commandLine0.getArgList();
        java.lang.String str14 = commandLine0.getOptionValue("", "hi!");
        java.lang.String[] strArray16 = commandLine0.getOptionValues('a');
        java.lang.Object obj18 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
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
        boolean boolean23 = commandLine0.hasOption("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        java.lang.String str14 = commandLine0.getOptionValue('#');
        java.lang.String str17 = commandLine0.getOptionValue('4', "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.Object obj10 = commandLine0.getOptionObject('#');
        java.lang.Object obj12 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.util.Iterator iterator14 = commandLine0.iterator();
        commandLine0.addArg("hi!");
        java.lang.String str18 = commandLine0.getOptionValue('a');
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
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        java.lang.String[] strArray4 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj6 = commandLine0.getOptionObject(' ');
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        java.lang.String str14 = commandLine0.getOptionValue('4', "");
        java.util.List list15 = commandLine0.getArgList();
        java.lang.Class<?> wildcardClass16 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertArrayEquals(optionArray2, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('a');
        java.lang.String str12 = commandLine0.getOptionValue('a');
        java.util.List list13 = commandLine0.getArgList();
        java.lang.String str15 = commandLine0.getOptionValue("");
        java.util.List list16 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray17 = commandLine0.getOptions();
        boolean boolean19 = commandLine0.hasOption("");
        java.util.Iterator iterator20 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(optionArray17);
        org.junit.Assert.assertArrayEquals(optionArray17, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator20);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
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
        java.lang.String[] strArray17 = commandLine0.getArgs();
        java.lang.String[] strArray19 = commandLine0.getOptionValues("");
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
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray19);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        boolean boolean11 = commandLine0.hasOption("");
        java.lang.String str13 = commandLine0.getOptionValue("");
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.Object obj16 = commandLine0.getOptionObject('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray3 = commandLine0.getOptions();
        java.lang.Object obj5 = commandLine0.getOptionObject('4');
        java.lang.String str8 = commandLine0.getOptionValue(' ', "");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String str12 = commandLine0.getOptionValue('#', "");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(optionArray3);
        org.junit.Assert.assertArrayEquals(optionArray3, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String str11 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        java.lang.String str16 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str18 = commandLine0.getOptionValue('4');
        java.lang.String str20 = commandLine0.getOptionValue('4');
        java.lang.String str23 = commandLine0.getOptionValue('a', "");
        java.lang.String str26 = commandLine0.getOptionValue('a', "hi!");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("hi!");
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "");
        java.util.List list14 = commandLine0.getArgList();
        java.lang.String[] strArray15 = commandLine0.getArgs();
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str12 = commandLine0.getOptionValue("", "");
        commandLine0.addArg("hi!");
        boolean boolean16 = commandLine0.hasOption("hi!");
        java.lang.String str18 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
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
        org.apache.commons.cli.Option[] optionArray17 = commandLine0.getOptions();
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
        org.junit.Assert.assertNotNull(optionArray17);
        org.junit.Assert.assertArrayEquals(optionArray17, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.util.Iterator iterator13 = commandLine0.iterator();
        java.lang.String[] strArray15 = commandLine0.getOptionValues("");
        java.lang.Object obj17 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray18 = commandLine0.getArgs();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        boolean boolean11 = commandLine0.hasOption('4');
        java.lang.Object obj13 = commandLine0.getOptionObject(' ');
        java.lang.Object obj15 = commandLine0.getOptionObject("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.util.List list8 = commandLine0.getArgList();
        boolean boolean10 = commandLine0.hasOption("");
        boolean boolean12 = commandLine0.hasOption('4');
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.lang.Object obj15 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray16 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(optionArray16);
        org.junit.Assert.assertArrayEquals(optionArray16, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str9 = commandLine0.getOptionValue("");
        boolean boolean11 = commandLine0.hasOption('a');
        commandLine0.addArg("");
        commandLine0.addArg("hi!");
        java.lang.String[] strArray17 = commandLine0.getOptionValues('a');
        java.lang.String str19 = commandLine0.getOptionValue('#');
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
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues(' ');
        boolean boolean4 = commandLine0.hasOption("");
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption('#');
        java.lang.Object obj9 = commandLine0.getOptionObject("hi!");
        java.lang.Object obj11 = commandLine0.getOptionObject('#');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        java.lang.String str13 = commandLine0.getOptionValue("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue('a');
        boolean boolean10 = commandLine0.hasOption('#');
        java.util.Iterator iterator11 = commandLine0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.util.Iterator iterator7 = commandLine0.iterator();
        commandLine0.addArg("");
        java.lang.String[] strArray11 = commandLine0.getOptionValues(' ');
        java.lang.String str13 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.util.Iterator iterator10 = commandLine0.iterator();
        java.lang.String str12 = commandLine0.getOptionValue(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
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
        java.lang.String str17 = commandLine0.getOptionValue(' ');
        java.lang.String str20 = commandLine0.getOptionValue("", "hi!");
        boolean boolean22 = commandLine0.hasOption("");
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
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String str12 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String[] strArray14 = commandLine0.getOptionValues("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = strArray14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        boolean boolean10 = commandLine0.hasOption('a');
        java.lang.String[] strArray11 = commandLine0.getArgs();
        boolean boolean13 = commandLine0.hasOption('a');
        java.lang.String str15 = commandLine0.getOptionValue('#');
        org.apache.commons.cli.Option[] optionArray16 = commandLine0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(optionArray16);
        org.junit.Assert.assertArrayEquals(optionArray16, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        boolean boolean4 = commandLine0.hasOption('4');
        java.util.List list5 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertArrayEquals(optionArray2, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray8 = commandLine0.getOptionValues(' ');
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String str12 = commandLine0.getOptionValue("", "hi!");
        boolean boolean14 = commandLine0.hasOption("");
        java.lang.String[] strArray16 = commandLine0.getOptionValues('#');
        java.lang.String str19 = commandLine0.getOptionValue('#', "");
        org.apache.commons.cli.Option[] optionArray20 = commandLine0.getOptions();
        java.util.List list21 = commandLine0.getArgList();
        java.lang.String str24 = commandLine0.getOptionValue('#', "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(optionArray20);
        org.junit.Assert.assertArrayEquals(optionArray20, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        boolean boolean11 = commandLine0.hasOption("");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        commandLine0.addArg("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue("");
        java.lang.Object obj10 = commandLine0.getOptionObject('#');
        java.lang.String str13 = commandLine0.getOptionValue('4', "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.Object obj11 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        java.lang.String str15 = commandLine0.getOptionValue("hi!");
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
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        boolean boolean10 = commandLine0.hasOption("");
        java.lang.Object obj12 = commandLine0.getOptionObject("");
        java.util.List list13 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('4');
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String[] strArray9 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj11 = commandLine0.getOptionObject('#');
        java.lang.String str13 = commandLine0.getOptionValue("hi!");
        java.lang.String str15 = commandLine0.getOptionValue('4');
        java.lang.String str17 = commandLine0.getOptionValue("");
        java.util.List list18 = commandLine0.getArgList();
        java.lang.Class<?> wildcardClass19 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
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
        java.lang.String[] strArray22 = commandLine0.getOptionValues('a');
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
        org.junit.Assert.assertNull(strArray22);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
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
        java.lang.String str23 = commandLine0.getOptionValue('a');
        java.lang.String str26 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str28 = commandLine0.getOptionValue("");
        java.lang.String str31 = commandLine0.getOptionValue('4', "hi!");
        boolean boolean33 = commandLine0.hasOption("");
        java.lang.String[] strArray35 = commandLine0.getOptionValues('#');
        java.util.List list36 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(list36);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        boolean boolean12 = commandLine0.hasOption("hi!");
        java.lang.String str15 = commandLine0.getOptionValue(' ', "");
        java.lang.String str17 = commandLine0.getOptionValue("");
        java.lang.String[] strArray19 = commandLine0.getOptionValues("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strArray19);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("hi!");
        java.lang.String str13 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray15 = commandLine0.getOptionValues('a');
        org.apache.commons.cli.Option[] optionArray16 = commandLine0.getOptions();
        java.lang.Class<?> wildcardClass17 = commandLine0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(optionArray16);
        org.junit.Assert.assertArrayEquals(optionArray16, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "");
        org.apache.commons.cli.Option[] optionArray6 = commandLine0.getOptions();
        java.lang.String str8 = commandLine0.getOptionValue(' ');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(optionArray6);
        org.junit.Assert.assertArrayEquals(optionArray6, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
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
        java.lang.String str21 = commandLine0.getOptionValue("");
        java.lang.String[] strArray22 = commandLine0.getArgs();
        java.util.List list23 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String str12 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj14 = commandLine0.getOptionObject('#');
        java.lang.String str16 = commandLine0.getOptionValue('4');
        boolean boolean18 = commandLine0.hasOption('a');
        java.lang.String[] strArray20 = commandLine0.getOptionValues(' ');
        org.apache.commons.cli.Option[] optionArray21 = commandLine0.getOptions();
        java.lang.String[] strArray22 = commandLine0.getArgs();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNotNull(optionArray21);
        org.junit.Assert.assertArrayEquals(optionArray21, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "" });
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.String str11 = commandLine0.getOptionValue('4', "");
        java.lang.String str14 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String[] strArray16 = commandLine0.getOptionValues("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        commandLine0.addArg("hi!");
        boolean boolean12 = commandLine0.hasOption(' ');
        java.lang.String[] strArray14 = commandLine0.getOptionValues("");
        java.lang.String str16 = commandLine0.getOptionValue("hi!");
        java.lang.String str18 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
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
        java.lang.Object obj18 = commandLine0.getOptionObject(' ');
        java.lang.String str20 = commandLine0.getOptionValue('#');
        boolean boolean22 = commandLine0.hasOption("");
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
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.lang.String str11 = commandLine0.getOptionValue('a', "");
        java.lang.String str13 = commandLine0.getOptionValue("");
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.Object obj16 = commandLine0.getOptionObject('4');
        java.lang.Object obj18 = commandLine0.getOptionObject('a');
        java.lang.Object obj20 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray21 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("hi!");
        java.lang.String str11 = commandLine0.getOptionValue('a', "hi!");
        java.lang.Object obj13 = commandLine0.getOptionObject("");
        java.lang.String str15 = commandLine0.getOptionValue("hi!");
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str11 = commandLine0.getOptionValue(' ');
        java.lang.String str13 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray15 = commandLine0.getOptionValues('4');
        java.lang.String[] strArray17 = commandLine0.getOptionValues('#');
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
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        boolean boolean10 = commandLine0.hasOption('a');
        java.lang.String[] strArray11 = commandLine0.getArgs();
        boolean boolean13 = commandLine0.hasOption(' ');
        java.lang.String[] strArray15 = commandLine0.getOptionValues('4');
        java.lang.String str17 = commandLine0.getOptionValue('#');
        java.lang.String str20 = commandLine0.getOptionValue("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.Object obj16 = commandLine0.getOptionObject("");
        java.lang.String str19 = commandLine0.getOptionValue(' ', "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String str13 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str16 = commandLine0.getOptionValue("", "");
        java.util.List list17 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str10 = commandLine0.getOptionValue("");
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "hi!");
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.Object obj16 = commandLine0.getOptionObject('a');
        java.lang.String str19 = commandLine0.getOptionValue("hi!", "");
        java.util.Iterator iterator20 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(iterator20);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.lang.String str11 = commandLine0.getOptionValue('4', "");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        java.lang.String str16 = commandLine0.getOptionValue('#', "");
        java.lang.String str19 = commandLine0.getOptionValue(' ', "");
        java.lang.String str22 = commandLine0.getOptionValue('a', "hi!");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray4 = commandLine0.getOptionValues("hi!");
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str9 = commandLine0.getOptionValue("");
        java.lang.Object obj11 = commandLine0.getOptionObject("");
        java.lang.String str13 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String str4 = commandLine0.getOptionValue('a');
        boolean boolean6 = commandLine0.hasOption('a');
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        boolean boolean12 = commandLine0.hasOption('a');
        java.util.Iterator iterator13 = commandLine0.iterator();
        java.lang.String[] strArray15 = commandLine0.getOptionValues("");
        java.lang.String[] strArray17 = commandLine0.getOptionValues("hi!");
        java.lang.String str19 = commandLine0.getOptionValue("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.util.Iterator iterator6 = commandLine0.iterator();
        java.util.List list7 = commandLine0.getArgList();
        java.lang.Object obj9 = commandLine0.getOptionObject('4');
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.Iterator iterator5 = commandLine0.iterator();
        java.lang.Object obj7 = commandLine0.getOptionObject('4');
        boolean boolean9 = commandLine0.hasOption("");
        java.util.List list10 = commandLine0.getArgList();
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "");
        java.lang.String[] strArray14 = commandLine0.getArgs();
        java.lang.String[] strArray15 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.util.Iterator iterator6 = commandLine0.iterator();
        java.lang.String[] strArray8 = commandLine0.getOptionValues('4');
        commandLine0.addArg("");
        java.util.Iterator iterator11 = commandLine0.iterator();
        boolean boolean13 = commandLine0.hasOption("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        java.lang.String str16 = commandLine0.getOptionValue(' ', "");
        java.lang.String str18 = commandLine0.getOptionValue('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.String str8 = commandLine0.getOptionValue("");
        java.lang.Object obj10 = commandLine0.getOptionObject('#');
        java.lang.Object obj12 = commandLine0.getOptionObject("");
        java.lang.String[] strArray14 = commandLine0.getOptionValues('4');
        boolean boolean16 = commandLine0.hasOption('a');
        java.lang.String str18 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj9 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray10 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String[] strArray11 = commandLine0.getOptionValues('a');
        java.lang.String str14 = commandLine0.getOptionValue('#', "hi!");
        boolean boolean16 = commandLine0.hasOption('#');
        boolean boolean18 = commandLine0.hasOption('a');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
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
        org.apache.commons.cli.Option[] optionArray18 = commandLine0.getOptions();
        java.util.List list19 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String str24 = commandLine0.getOptionValue('a', "hi!");
        java.util.Iterator iterator25 = commandLine0.iterator();
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
        org.junit.Assert.assertNotNull(optionArray18);
        org.junit.Assert.assertArrayEquals(optionArray18, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(iterator25);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        java.util.Iterator iterator10 = commandLine0.iterator();
        java.lang.String[] strArray12 = commandLine0.getOptionValues('a');
        java.lang.Object obj14 = commandLine0.getOptionObject("");
        java.util.Iterator iterator15 = commandLine0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String str10 = commandLine0.getOptionValue('a', "hi!");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
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
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.Iterator iterator5 = commandLine0.iterator();
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String str9 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str11 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
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
        java.lang.String str20 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str22 = commandLine0.getOptionValue("");
        java.lang.String str24 = commandLine0.getOptionValue('a');
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.Object obj9 = commandLine0.getOptionObject("hi!");
        java.lang.String str12 = commandLine0.getOptionValue(' ', "");
        java.lang.String str15 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str17 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray19 = commandLine0.getOptionValues('#');
        java.util.List list20 = commandLine0.getArgList();
        java.lang.String[] strArray22 = commandLine0.getOptionValues('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNull(strArray22);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.util.List list9 = commandLine0.getArgList();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        java.lang.String[] strArray12 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray14 = commandLine0.getOptionValues("hi!");
        boolean boolean16 = commandLine0.hasOption("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        java.lang.Object obj11 = commandLine0.getOptionObject("");
        java.lang.String str14 = commandLine0.getOptionValue(' ', "");
        boolean boolean16 = commandLine0.hasOption("");
        java.lang.String str18 = commandLine0.getOptionValue('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.lang.String str8 = commandLine0.getOptionValue("", "hi!");
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.Object obj13 = commandLine0.getOptionObject('4');
        java.lang.String str16 = commandLine0.getOptionValue(' ', "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.Object obj11 = commandLine0.getOptionObject('#');
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
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.util.List list10 = commandLine0.getArgList();
        java.util.List list11 = commandLine0.getArgList();
        boolean boolean13 = commandLine0.hasOption('a');
        java.lang.Object obj15 = commandLine0.getOptionObject('4');
        java.lang.Object obj17 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.String str10 = commandLine0.getOptionValue('4');
        commandLine0.addArg("hi!");
        java.lang.String str14 = commandLine0.getOptionValue('#');
        java.lang.Object obj16 = commandLine0.getOptionObject('a');
        java.lang.String str18 = commandLine0.getOptionValue('#');
        boolean boolean20 = commandLine0.hasOption("hi!");
        java.lang.Object obj22 = commandLine0.getOptionObject("hi!");
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray10 = commandLine0.getArgs();
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        boolean boolean14 = commandLine0.hasOption('#');
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
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String str5 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.lang.String str9 = commandLine0.getOptionValue('4', "hi!");
        boolean boolean11 = commandLine0.hasOption('4');
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        boolean boolean15 = commandLine0.hasOption(' ');
        boolean boolean17 = commandLine0.hasOption("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        boolean boolean6 = commandLine0.hasOption('#');
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.String[] strArray8 = commandLine0.getArgs();
        commandLine0.addArg("hi!");
        java.lang.String str13 = commandLine0.getOptionValue('#', "");
        java.lang.Object obj15 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray17 = commandLine0.getOptionValues(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = strArray17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        boolean boolean10 = commandLine0.hasOption("");
        commandLine0.addArg("");
        boolean boolean14 = commandLine0.hasOption("hi!");
        java.lang.Object obj16 = commandLine0.getOptionObject("hi!");
        org.apache.commons.cli.Option[] optionArray17 = commandLine0.getOptions();
        java.lang.Object obj19 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(optionArray17);
        org.junit.Assert.assertArrayEquals(optionArray17, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
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
        java.lang.String[] strArray22 = commandLine0.getArgs();
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
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "" });
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray11 = commandLine0.getArgs();
        java.lang.String str14 = commandLine0.getOptionValue(' ', "");
        java.lang.String str16 = commandLine0.getOptionValue("hi!");
        java.lang.String str19 = commandLine0.getOptionValue(' ', "hi!");
        org.apache.commons.cli.Option[] optionArray20 = commandLine0.getOptions();
        java.util.List list21 = commandLine0.getArgList();
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(optionArray20);
        org.junit.Assert.assertArrayEquals(optionArray20, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String str13 = commandLine0.getOptionValue("", "");
        java.lang.String str16 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String[] strArray17 = commandLine0.getArgs();
        java.lang.Class<?> wildcardClass18 = strArray17.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.Object obj6 = commandLine0.getOptionObject(' ');
        java.lang.String str8 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.Class<?> wildcardClass10 = optionArray9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        java.lang.String str12 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String[] strArray13 = commandLine0.getArgs();
        boolean boolean15 = commandLine0.hasOption(' ');
        boolean boolean17 = commandLine0.hasOption("");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str10 = commandLine0.getOptionValue('#', "hi!");
        java.lang.String str12 = commandLine0.getOptionValue("");
        java.lang.String str15 = commandLine0.getOptionValue('a', "hi!");
        java.util.Iterator iterator16 = commandLine0.iterator();
        boolean boolean18 = commandLine0.hasOption("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.Iterator iterator5 = commandLine0.iterator();
        java.lang.Object obj7 = commandLine0.getOptionObject('4');
        java.lang.String str10 = commandLine0.getOptionValue("hi!", "");
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.lang.String str13 = commandLine0.getOptionValue('#');
        java.lang.Object obj15 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
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
        java.lang.Object obj23 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray24 = commandLine0.getArgs();
        java.util.List list25 = commandLine0.getArgList();
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
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(list25);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.String[] strArray9 = commandLine0.getOptionValues("");
        java.lang.String[] strArray11 = commandLine0.getOptionValues('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        boolean boolean6 = commandLine0.hasOption('#');
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String str10 = commandLine0.getOptionValue('a');
        java.lang.Object obj12 = commandLine0.getOptionObject(' ');
        java.lang.String str15 = commandLine0.getOptionValue(' ', "");
        java.lang.Object obj17 = commandLine0.getOptionObject("");
        commandLine0.addArg("hi!");
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
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.Iterator iterator5 = commandLine0.iterator();
        java.lang.Object obj7 = commandLine0.getOptionObject('4');
        java.lang.String str10 = commandLine0.getOptionValue("hi!", "");
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.util.List list12 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        boolean boolean10 = commandLine0.hasOption("");
        commandLine0.addArg("");
        java.lang.String str15 = commandLine0.getOptionValue("hi!", "");
        java.lang.String[] strArray17 = commandLine0.getOptionValues(' ');
        java.lang.String str20 = commandLine0.getOptionValue('#', "hi!");
        java.lang.Object obj22 = commandLine0.getOptionObject('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        boolean boolean10 = commandLine0.hasOption("");
        commandLine0.addArg("");
        java.util.Iterator iterator13 = commandLine0.iterator();
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray15 = commandLine0.getOptions();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray15);
        org.junit.Assert.assertArrayEquals(optionArray15, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str12 = commandLine0.getOptionValue("", "");
        java.lang.String str14 = commandLine0.getOptionValue("");
        boolean boolean16 = commandLine0.hasOption("hi!");
        java.lang.String str18 = commandLine0.getOptionValue('a');
        java.lang.String str21 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str24 = commandLine0.getOptionValue('a', "");
        java.util.List list25 = commandLine0.getArgList();
        java.lang.Class<?> wildcardClass26 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        boolean boolean6 = commandLine0.hasOption('#');
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.String[] strArray8 = commandLine0.getArgs();
        boolean boolean10 = commandLine0.hasOption("hi!");
        boolean boolean12 = commandLine0.hasOption('4');
        java.lang.String[] strArray13 = commandLine0.getArgs();
        java.lang.String str16 = commandLine0.getOptionValue('a', "hi!");
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
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('a');
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj7 = commandLine0.getOptionObject('4');
        java.lang.String str10 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray11 = commandLine0.getArgs();
        java.util.Iterator iterator12 = commandLine0.iterator();
        java.lang.String str14 = commandLine0.getOptionValue('#');
        java.lang.String str16 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("hi!");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("hi!");
        java.lang.String str14 = commandLine0.getOptionValue(' ', "");
        java.util.List list15 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.util.List list6 = commandLine0.getArgList();
        boolean boolean8 = commandLine0.hasOption('4');
        java.util.Iterator iterator9 = commandLine0.iterator();
        boolean boolean11 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str15 = commandLine0.getOptionValue("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
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
        java.lang.Object obj23 = commandLine0.getOptionObject('#');
        boolean boolean25 = commandLine0.hasOption(' ');
        java.lang.String[] strArray27 = commandLine0.getOptionValues("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(strArray27);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        java.lang.String str11 = commandLine0.getOptionValue(' ');
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        boolean boolean12 = commandLine0.hasOption('4');
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.String str17 = commandLine0.getOptionValue("", "hi!");
        boolean boolean19 = commandLine0.hasOption(' ');
        java.lang.String[] strArray20 = commandLine0.getArgs();
        java.lang.String[] strArray22 = commandLine0.getOptionValues(' ');
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
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray22);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.String str11 = commandLine0.getOptionValue('#', "");
        java.util.List list12 = commandLine0.getArgList();
        boolean boolean14 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray15 = commandLine0.getArgs();
        java.lang.String str18 = commandLine0.getOptionValue('4', "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue('a');
        java.lang.String str11 = commandLine0.getOptionValue('4', "hi!");
        java.lang.String str14 = commandLine0.getOptionValue('a', "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
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
        java.lang.String str18 = commandLine0.getOptionValue("", "hi!");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray10 = commandLine0.getOptionValues(' ');
        java.lang.Object obj12 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray14 = commandLine0.getOptionValues("");
        boolean boolean16 = commandLine0.hasOption("hi!");
        java.lang.Class<?> wildcardClass17 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.util.Iterator iterator9 = commandLine0.iterator();
        boolean boolean11 = commandLine0.hasOption("");
        java.lang.String str14 = commandLine0.getOptionValue('a', "");
        java.util.List list15 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.Object obj10 = commandLine0.getOptionObject('a');
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.util.Iterator iterator12 = commandLine0.iterator();
        java.lang.Object obj14 = commandLine0.getOptionObject(' ');
        boolean boolean16 = commandLine0.hasOption("");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String str11 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray13 = commandLine0.getOptionValues('a');
        commandLine0.addArg("");
        java.lang.Object obj17 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        boolean boolean8 = commandLine0.hasOption(' ');
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.util.Iterator iterator11 = commandLine0.iterator();
        boolean boolean13 = commandLine0.hasOption("");
        java.lang.Object obj15 = commandLine0.getOptionObject('a');
        boolean boolean17 = commandLine0.hasOption('4');
        java.lang.Object obj19 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray21 = commandLine0.getOptionValues("");
        java.util.Iterator iterator22 = commandLine0.iterator();
        java.lang.String[] strArray23 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        boolean boolean14 = commandLine0.hasOption('4');
        boolean boolean16 = commandLine0.hasOption(' ');
        org.apache.commons.cli.Option[] optionArray17 = commandLine0.getOptions();
        java.util.List list18 = commandLine0.getArgList();
        java.lang.Class<?> wildcardClass19 = commandLine0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(optionArray17);
        org.junit.Assert.assertArrayEquals(optionArray17, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        boolean boolean6 = commandLine0.hasOption("");
        java.lang.String str9 = commandLine0.getOptionValue("hi!", "");
        commandLine0.addArg("");
        java.lang.String str13 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String str11 = commandLine0.getOptionValue('4', "");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue('#', "hi!");
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.lang.String str12 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj14 = commandLine0.getOptionObject('a');
        java.lang.Object obj16 = commandLine0.getOptionObject("");
        boolean boolean18 = commandLine0.hasOption(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
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
        org.apache.commons.cli.Option[] optionArray19 = commandLine0.getOptions();
        java.lang.String[] strArray21 = commandLine0.getOptionValues('a');
        java.lang.String str24 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str27 = commandLine0.getOptionValue("hi!", "");
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
        org.junit.Assert.assertNotNull(optionArray19);
        org.junit.Assert.assertArrayEquals(optionArray19, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
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
        java.lang.Object obj19 = commandLine0.getOptionObject('a');
        boolean boolean21 = commandLine0.hasOption('4');
        java.lang.String[] strArray23 = commandLine0.getOptionValues('#');
        commandLine0.addArg("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(strArray23);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.String str14 = commandLine0.getOptionValue('#', "");
        java.util.List list15 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray16 = commandLine0.getOptions();
        commandLine0.addArg("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(optionArray16);
        org.junit.Assert.assertArrayEquals(optionArray16, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.lang.String str14 = commandLine0.getOptionValue(' ');
        commandLine0.addArg("");
        java.lang.String str18 = commandLine0.getOptionValue('a');
        java.lang.String[] strArray20 = commandLine0.getOptionValues('a');
        java.lang.String str22 = commandLine0.getOptionValue(' ');
        java.lang.String str25 = commandLine0.getOptionValue("hi!", "");
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
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.util.Iterator iterator3 = commandLine0.iterator();
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String str7 = commandLine0.getOptionValue('4', "hi!");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str12 = commandLine0.getOptionValue("", "hi!");
        boolean boolean14 = commandLine0.hasOption(' ');
        org.apache.commons.cli.Option[] optionArray15 = commandLine0.getOptions();
        java.lang.String str17 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option[] optionArray18 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(optionArray15);
        org.junit.Assert.assertArrayEquals(optionArray15, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(optionArray18);
        org.junit.Assert.assertArrayEquals(optionArray18, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
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
        java.lang.Object obj27 = commandLine0.getOptionObject('#');
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
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "");
        org.apache.commons.cli.Option[] optionArray6 = commandLine0.getOptions();
        java.util.List list7 = commandLine0.getArgList();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(optionArray6);
        org.junit.Assert.assertArrayEquals(optionArray6, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
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
        java.lang.Object obj20 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray22 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray24 = commandLine0.getOptionValues('4');
        boolean boolean26 = commandLine0.hasOption("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.util.List list12 = commandLine0.getArgList();
        java.util.Iterator iterator13 = commandLine0.iterator();
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str12 = commandLine0.getOptionValue("", "");
        java.lang.String str14 = commandLine0.getOptionValue("");
        boolean boolean16 = commandLine0.hasOption("hi!");
        java.lang.String str18 = commandLine0.getOptionValue('a');
        boolean boolean20 = commandLine0.hasOption('a');
        org.apache.commons.cli.Option[] optionArray21 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(optionArray21);
        org.junit.Assert.assertArrayEquals(optionArray21, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.util.List list8 = commandLine0.getArgList();
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.util.Iterator iterator10 = commandLine0.iterator();
        java.lang.String str12 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray14 = commandLine0.getOptionValues("hi!");
        commandLine0.addArg("");
        java.lang.String[] strArray17 = commandLine0.getArgs();
        java.lang.String[] strArray18 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String str10 = commandLine0.getOptionValue("");
        java.lang.String str13 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray15 = commandLine0.getOptionValues('#');
        java.lang.Object obj17 = commandLine0.getOptionObject('4');
        java.lang.String[] strArray19 = commandLine0.getOptionValues('#');
        java.util.List list20 = commandLine0.getArgList();
        boolean boolean22 = commandLine0.hasOption('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str9 = commandLine0.getOptionValue("");
        boolean boolean11 = commandLine0.hasOption('4');
        java.util.Iterator iterator12 = commandLine0.iterator();
        java.lang.String str15 = commandLine0.getOptionValue("", "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.Object obj12 = commandLine0.getOptionObject('4');
        boolean boolean14 = commandLine0.hasOption('4');
        java.lang.String str16 = commandLine0.getOptionValue("");
        java.lang.Object obj18 = commandLine0.getOptionObject(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue('a');
        java.lang.String str11 = commandLine0.getOptionValue('4', "");
        java.lang.Object obj13 = commandLine0.getOptionObject('#');
        java.lang.String str15 = commandLine0.getOptionValue(' ');
        org.apache.commons.cli.Option[] optionArray16 = commandLine0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(optionArray16);
        org.junit.Assert.assertArrayEquals(optionArray16, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.String str8 = commandLine0.getOptionValue("");
        java.lang.Object obj10 = commandLine0.getOptionObject('#');
        boolean boolean12 = commandLine0.hasOption("");
        java.lang.String str14 = commandLine0.getOptionValue(' ');
        java.lang.String str17 = commandLine0.getOptionValue("", "hi!");
        java.util.List list18 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray19 = commandLine0.getOptions();
        java.lang.String str22 = commandLine0.getOptionValue('#', "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(optionArray19);
        org.junit.Assert.assertArrayEquals(optionArray19, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.util.List list9 = commandLine0.getArgList();
        java.lang.String str12 = commandLine0.getOptionValue('#', "hi!");
        java.lang.String str14 = commandLine0.getOptionValue("hi!");
        java.lang.String str17 = commandLine0.getOptionValue("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        boolean boolean10 = commandLine0.hasOption("");
        commandLine0.addArg("hi!");
        java.util.List list13 = commandLine0.getArgList();
        java.lang.Object obj15 = commandLine0.getOptionObject("hi!");
        java.lang.String str18 = commandLine0.getOptionValue('a', "hi!");
        org.apache.commons.cli.Option[] optionArray19 = commandLine0.getOptions();
        java.lang.String str22 = commandLine0.getOptionValue('4', "");
        java.lang.Object obj24 = commandLine0.getOptionObject("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = obj24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(optionArray19);
        org.junit.Assert.assertArrayEquals(optionArray19, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String[] strArray7 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray9 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        java.lang.String str13 = commandLine0.getOptionValue('#', "hi!");
        java.lang.Object obj15 = commandLine0.getOptionObject("hi!");
        java.lang.Object obj17 = commandLine0.getOptionObject("hi!");
        org.apache.commons.cli.Option[] optionArray18 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(optionArray18);
        org.junit.Assert.assertArrayEquals(optionArray18, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String str10 = commandLine0.getOptionValue("hi!", "");
        commandLine0.addArg("");
        java.util.Iterator iterator13 = commandLine0.iterator();
        boolean boolean15 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.lang.String[] strArray13 = commandLine0.getArgs();
        boolean boolean15 = commandLine0.hasOption("");
        java.lang.String str18 = commandLine0.getOptionValue(' ', "");
        java.lang.String str20 = commandLine0.getOptionValue("hi!");
        java.util.Iterator iterator21 = commandLine0.iterator();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(iterator21);
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
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
        java.lang.Object obj17 = commandLine0.getOptionObject("");
        java.lang.String[] strArray19 = commandLine0.getOptionValues('a');
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
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(strArray19);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.util.List list7 = commandLine0.getArgList();
        boolean boolean9 = commandLine0.hasOption('#');
        boolean boolean11 = commandLine0.hasOption("");
        java.lang.String str13 = commandLine0.getOptionValue('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.util.Iterator iterator7 = commandLine0.iterator();
        commandLine0.addArg("");
        boolean boolean11 = commandLine0.hasOption('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        boolean boolean13 = commandLine0.hasOption("");
        java.lang.String str16 = commandLine0.getOptionValue(' ', "hi!");
        org.apache.commons.cli.Option[] optionArray17 = commandLine0.getOptions();
        java.util.List list18 = commandLine0.getArgList();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(optionArray17);
        org.junit.Assert.assertArrayEquals(optionArray17, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        java.lang.String[] strArray4 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj6 = commandLine0.getOptionObject(' ');
        commandLine0.addArg("");
        java.lang.String[] strArray10 = commandLine0.getOptionValues('#');
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray14 = commandLine0.getOptionValues("hi!");
        java.lang.String str17 = commandLine0.getOptionValue('4', "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertArrayEquals(optionArray2, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String str9 = commandLine0.getOptionValue('#', "");
        java.lang.String str11 = commandLine0.getOptionValue('4');
        java.lang.Object obj13 = commandLine0.getOptionObject('4');
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.String[] strArray15 = commandLine0.getArgs();
        java.lang.Object obj17 = commandLine0.getOptionObject("hi!");
        java.lang.String str20 = commandLine0.getOptionValue('4', "hi!");
        commandLine0.addArg("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray16 = commandLine0.getOptionValues('4');
        java.lang.Class<?> wildcardClass17 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = strArray10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
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
        java.lang.String[] strArray20 = commandLine0.getOptionValues('#');
        java.lang.String[] strArray21 = commandLine0.getArgs();
        java.lang.String[] strArray22 = commandLine0.getArgs();
        java.lang.String str25 = commandLine0.getOptionValue('#', "");
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
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String str12 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str14 = commandLine0.getOptionValue("");
        java.lang.String[] strArray15 = commandLine0.getArgs();
        java.lang.String str18 = commandLine0.getOptionValue("hi!", "hi!");
        org.apache.commons.cli.Option[] optionArray19 = commandLine0.getOptions();
        boolean boolean21 = commandLine0.hasOption('#');
        boolean boolean23 = commandLine0.hasOption(' ');
        org.apache.commons.cli.Option[] optionArray24 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(optionArray19);
        org.junit.Assert.assertArrayEquals(optionArray19, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(optionArray24);
        org.junit.Assert.assertArrayEquals(optionArray24, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String str5 = commandLine0.getOptionValue('a', "hi!");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String str8 = commandLine0.getOptionValue('a');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues(' ');
        java.lang.String str14 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.String[] strArray9 = commandLine0.getOptionValues('a');
        java.lang.String str11 = commandLine0.getOptionValue(' ');
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.lang.Object obj14 = commandLine0.getOptionObject("");
        boolean boolean16 = commandLine0.hasOption('4');
        java.lang.Object obj18 = commandLine0.getOptionObject("hi!");
        java.lang.Object obj20 = commandLine0.getOptionObject("hi!");
        java.lang.String str23 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj25 = commandLine0.getOptionObject('#');
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
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        java.lang.String str12 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj14 = commandLine0.getOptionObject('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str9 = commandLine0.getOptionValue("");
        boolean boolean11 = commandLine0.hasOption('4');
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
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('a');
        java.lang.String str12 = commandLine0.getOptionValue('a');
        java.util.List list13 = commandLine0.getArgList();
        java.lang.String str15 = commandLine0.getOptionValue("");
        java.util.List list16 = commandLine0.getArgList();
        java.lang.String str18 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
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
        commandLine0.addArg("hi!");
        boolean boolean22 = commandLine0.hasOption('4');
        java.lang.Object obj24 = commandLine0.getOptionObject('a');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
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
        java.lang.String str25 = commandLine0.getOptionValue('#', "");
        java.lang.String str27 = commandLine0.getOptionValue("");
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray8 = commandLine0.getOptionValues(' ');
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String str12 = commandLine0.getOptionValue("", "hi!");
        boolean boolean14 = commandLine0.hasOption("");
        java.lang.Object obj16 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        java.util.List list11 = commandLine0.getArgList();
        commandLine0.addArg("hi!");
        boolean boolean15 = commandLine0.hasOption('a');
        java.util.List list16 = commandLine0.getArgList();
        java.lang.Object obj18 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray20 = commandLine0.getOptionValues('a');
        java.lang.String str23 = commandLine0.getOptionValue('a', "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
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
        java.lang.String str16 = commandLine0.getOptionValue("hi!");
        commandLine0.addArg("hi!");
        java.lang.Object obj20 = commandLine0.getOptionObject('4');
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        java.lang.String[] strArray14 = commandLine0.getOptionValues("");
        commandLine0.addArg("hi!");
        java.lang.Object obj18 = commandLine0.getOptionObject('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String str12 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String[] strArray14 = commandLine0.getOptionValues("hi!");
        boolean boolean16 = commandLine0.hasOption('4');
        java.lang.String str18 = commandLine0.getOptionValue(' ');
        java.lang.String[] strArray20 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(strArray20);
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        java.util.Iterator iterator10 = commandLine0.iterator();
        boolean boolean12 = commandLine0.hasOption('4');
        java.lang.Object obj14 = commandLine0.getOptionObject("hi!");
        java.lang.String str17 = commandLine0.getOptionValue("", "");
        java.lang.String str20 = commandLine0.getOptionValue("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('4', "");
        java.lang.String str13 = commandLine0.getOptionValue('4', "hi!");
        java.lang.String str15 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("hi!");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        boolean boolean11 = commandLine0.hasOption("hi!");
        java.lang.Object obj13 = commandLine0.getOptionObject('a');
        java.lang.String str16 = commandLine0.getOptionValue('#', "hi!");
        java.lang.String str18 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        boolean boolean8 = commandLine0.hasOption(' ');
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.util.List list11 = commandLine0.getArgList();
        java.lang.String[] strArray12 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
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
        java.lang.Object obj18 = commandLine0.getOptionObject(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str10 = commandLine0.getOptionValue('#', "hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        commandLine0.addArg("hi!");
        java.lang.String[] strArray16 = commandLine0.getOptionValues('a');
        commandLine0.addArg("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.String str6 = commandLine0.getOptionValue(' ', "");
        boolean boolean8 = commandLine0.hasOption(' ');
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        java.lang.String str12 = commandLine0.getOptionValue(' ');
        java.lang.String str14 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj16 = commandLine0.getOptionObject("hi!");
        java.lang.String str19 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj21 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "");
        commandLine0.addArg("");
        java.lang.String[] strArray15 = commandLine0.getOptionValues("hi!");
        org.apache.commons.cli.Option option16 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        java.util.Iterator iterator10 = commandLine0.iterator();
        boolean boolean12 = commandLine0.hasOption('4');
        java.lang.String[] strArray14 = commandLine0.getOptionValues('4');
        org.apache.commons.cli.Option[] optionArray15 = commandLine0.getOptions();
        java.lang.String[] strArray17 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(optionArray15);
        org.junit.Assert.assertArrayEquals(optionArray15, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
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
        boolean boolean23 = commandLine0.hasOption("");
        java.util.Iterator iterator24 = commandLine0.iterator();
        java.lang.Class<?> wildcardClass25 = iterator24.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
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
        org.apache.commons.cli.Option[] optionArray19 = commandLine0.getOptions();
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
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(optionArray19);
        org.junit.Assert.assertArrayEquals(optionArray19, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str10 = commandLine0.getOptionValue('#', "hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        java.lang.String str14 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj16 = commandLine0.getOptionObject(' ');
        java.lang.String str18 = commandLine0.getOptionValue('a');
        org.apache.commons.cli.Option[] optionArray19 = commandLine0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(optionArray19);
        org.junit.Assert.assertArrayEquals(optionArray19, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str9 = commandLine0.getOptionValue("");
        java.lang.String str12 = commandLine0.getOptionValue("hi!", "hi!");
        java.util.List list13 = commandLine0.getArgList();
        commandLine0.addArg("hi!");
        java.lang.String str18 = commandLine0.getOptionValue("", "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
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
        java.lang.String str28 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str30 = commandLine0.getOptionValue('a');
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        boolean boolean10 = commandLine0.hasOption("");
        java.lang.Object obj12 = commandLine0.getOptionObject(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String str5 = commandLine0.getOptionValue('#');
        java.lang.String str8 = commandLine0.getOptionValue('a', "");
        java.lang.String str10 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('a');
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "hi!");
        java.util.List list12 = commandLine0.getArgList();
        boolean boolean14 = commandLine0.hasOption('#');
        java.lang.String[] strArray16 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray18 = commandLine0.getOptionValues('#');
        java.util.List list19 = commandLine0.getArgList();
        java.lang.String[] strArray21 = commandLine0.getOptionValues("hi!");
        java.lang.String str23 = commandLine0.getOptionValue('#');
        java.util.List list24 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
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
        java.lang.String[] strArray23 = commandLine0.getOptionValues('4');
        java.lang.String str25 = commandLine0.getOptionValue("");
        java.lang.String str27 = commandLine0.getOptionValue('4');
        org.apache.commons.cli.Option option28 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option28);
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
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
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
        java.lang.Object obj20 = commandLine0.getOptionObject(' ');
        java.util.Iterator iterator21 = commandLine0.iterator();
        java.lang.String str23 = commandLine0.getOptionValue("");
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
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String str8 = commandLine0.getOptionValue('a');
        java.lang.String str11 = commandLine0.getOptionValue('a', "");
        boolean boolean13 = commandLine0.hasOption("hi!");
        java.lang.Class<?> wildcardClass14 = commandLine0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        boolean boolean14 = commandLine0.hasOption('4');
        boolean boolean16 = commandLine0.hasOption(' ');
        org.apache.commons.cli.Option[] optionArray17 = commandLine0.getOptions();
        java.util.List list18 = commandLine0.getArgList();
        java.lang.String[] strArray19 = commandLine0.getArgs();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(optionArray17);
        org.junit.Assert.assertArrayEquals(optionArray17, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.util.Iterator iterator7 = commandLine0.iterator();
        commandLine0.addArg("hi!");
        java.util.List list10 = commandLine0.getArgList();
        java.lang.Object obj12 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        java.lang.Object obj16 = commandLine0.getOptionObject('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String str5 = commandLine0.getOptionValue('a', "hi!");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String str8 = commandLine0.getOptionValue('a');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.util.Iterator iterator11 = commandLine0.iterator();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        boolean boolean11 = commandLine0.hasOption("");
        java.lang.String str13 = commandLine0.getOptionValue('#');
        java.lang.String str16 = commandLine0.getOptionValue('#', "hi!");
        java.util.Iterator iterator17 = commandLine0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.String str8 = commandLine0.getOptionValue("");
        java.lang.Object obj10 = commandLine0.getOptionObject('#');
        java.lang.Object obj12 = commandLine0.getOptionObject("");
        java.lang.String str15 = commandLine0.getOptionValue("hi!", "");
        org.apache.commons.cli.Option[] optionArray16 = commandLine0.getOptions();
        boolean boolean18 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray19 = commandLine0.getArgs();
        java.lang.String str22 = commandLine0.getOptionValue("hi!", "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(optionArray16);
        org.junit.Assert.assertArrayEquals(optionArray16, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        java.lang.String str10 = commandLine0.getOptionValue('#', "");
        java.util.List list11 = commandLine0.getArgList();
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String[] strArray10 = commandLine0.getOptionValues('#');
        commandLine0.addArg("hi!");
        boolean boolean14 = commandLine0.hasOption("hi!");
        java.util.Iterator iterator15 = commandLine0.iterator();
        java.lang.Object obj17 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray19 = commandLine0.getOptionValues("");
        java.lang.String str22 = commandLine0.getOptionValue("hi!", "");
        org.apache.commons.cli.Option[] optionArray23 = commandLine0.getOptions();
        java.lang.Object obj25 = commandLine0.getOptionObject('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(optionArray23);
        org.junit.Assert.assertArrayEquals(optionArray23, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.util.List list6 = commandLine0.getArgList();
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.Object obj12 = commandLine0.getOptionObject(' ');
        boolean boolean14 = commandLine0.hasOption('#');
        java.lang.Object obj16 = commandLine0.getOptionObject('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('4');
        boolean boolean7 = commandLine0.hasOption("");
        boolean boolean9 = commandLine0.hasOption("hi!");
        java.lang.String str11 = commandLine0.getOptionValue('a');
        java.lang.Object obj13 = commandLine0.getOptionObject('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str12 = commandLine0.getOptionValue("", "");
        commandLine0.addArg("hi!");
        boolean boolean16 = commandLine0.hasOption("hi!");
        boolean boolean18 = commandLine0.hasOption("");
        java.lang.String str20 = commandLine0.getOptionValue(' ');
        java.lang.Class<?> wildcardClass21 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray12);
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.String str11 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.lang.String str15 = commandLine0.getOptionValue('a', "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        boolean boolean6 = commandLine0.hasOption("");
        java.lang.Object obj8 = commandLine0.getOptionObject("");
        boolean boolean10 = commandLine0.hasOption(' ');
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.lang.String[] strArray14 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        boolean boolean4 = commandLine0.hasOption('#');
        java.util.Iterator iterator5 = commandLine0.iterator();
        java.util.Iterator iterator6 = commandLine0.iterator();
        boolean boolean8 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.util.List list8 = commandLine0.getArgList();
        boolean boolean10 = commandLine0.hasOption('4');
        java.lang.String[] strArray12 = commandLine0.getOptionValues('4');
        java.util.List list13 = commandLine0.getArgList();
        boolean boolean15 = commandLine0.hasOption("");
        java.lang.String str18 = commandLine0.getOptionValue('4', "hi!");
        java.lang.String str20 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
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
        java.lang.String[] strArray17 = commandLine0.getOptionValues('a');
        java.lang.String str20 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str22 = commandLine0.getOptionValue(' ');
        java.lang.Object obj24 = commandLine0.getOptionObject('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.String str12 = commandLine0.getOptionValue('4');
        java.lang.String str15 = commandLine0.getOptionValue("", "");
        org.apache.commons.cli.Option[] optionArray16 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(optionArray16);
        org.junit.Assert.assertArrayEquals(optionArray16, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
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
        java.lang.String str27 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String[] strArray29 = commandLine0.getOptionValues("hi!");
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNull(strArray29);
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.lang.Object obj6 = commandLine0.getOptionObject("");
        java.lang.String[] strArray7 = commandLine0.getArgs();
        boolean boolean9 = commandLine0.hasOption("hi!");
        java.lang.Object obj11 = commandLine0.getOptionObject("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        java.util.List list11 = commandLine0.getArgList();
        boolean boolean13 = commandLine0.hasOption("");
        java.lang.String str15 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray17 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.Iterator iterator5 = commandLine0.iterator();
        java.lang.Object obj7 = commandLine0.getOptionObject('4');
        commandLine0.addArg("");
        commandLine0.addArg("hi!");
        java.lang.Class<?> wildcardClass12 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        commandLine0.addArg("");
        boolean boolean14 = commandLine0.hasOption("");
        org.apache.commons.cli.Option option15 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option15);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String str13 = commandLine0.getOptionValue("", "");
        java.lang.String str16 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String[] strArray17 = commandLine0.getArgs();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray20 = commandLine0.getArgs();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.lang.String str15 = commandLine0.getOptionValue('#', "");
        java.lang.Object obj17 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.String str12 = commandLine0.getOptionValue(' ');
        java.util.List list13 = commandLine0.getArgList();
        java.lang.String[] strArray14 = commandLine0.getArgs();
        java.lang.String str17 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str19 = commandLine0.getOptionValue("hi!");
        java.util.Iterator iterator20 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(iterator20);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str10 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        commandLine0.addArg("");
        java.lang.Object obj16 = commandLine0.getOptionObject("");
        boolean boolean18 = commandLine0.hasOption("");
        java.lang.String str21 = commandLine0.getOptionValue("hi!", "");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String str5 = commandLine0.getOptionValue('#');
        boolean boolean7 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        commandLine0.addArg("hi!");
        java.lang.String str12 = commandLine0.getOptionValue('a');
        java.lang.String str14 = commandLine0.getOptionValue('4');
        boolean boolean16 = commandLine0.hasOption("hi!");
        java.lang.String str18 = commandLine0.getOptionValue('#');
        java.util.Iterator iterator19 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(iterator19);
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.util.List list9 = commandLine0.getArgList();
        java.lang.Object obj11 = commandLine0.getOptionObject("");
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        boolean boolean15 = commandLine0.hasOption("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
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
        java.lang.String str20 = commandLine0.getOptionValue("", "hi!");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.Object obj10 = commandLine0.getOptionObject('a');
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.lang.String[] strArray14 = commandLine0.getOptionValues('#');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue("", "");
        boolean boolean9 = commandLine0.hasOption("");
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String[] strArray11 = commandLine0.getOptionValues('a');
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        boolean boolean11 = commandLine0.hasOption("hi!");
        java.lang.Class<?> wildcardClass12 = commandLine0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        boolean boolean7 = commandLine0.hasOption("");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.Object obj10 = commandLine0.getOptionObject('4');
        boolean boolean12 = commandLine0.hasOption("");
        java.lang.String str14 = commandLine0.getOptionValue('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray10 = commandLine0.getOptionValues("hi!");
        boolean boolean12 = commandLine0.hasOption('4');
        java.util.Iterator iterator13 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        boolean boolean11 = commandLine0.hasOption('a');
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
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.Iterator iterator5 = commandLine0.iterator();
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        boolean boolean9 = commandLine0.hasOption("");
        java.lang.String[] strArray11 = commandLine0.getOptionValues('a');
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String str5 = commandLine0.getOptionValue('a', "hi!");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String str8 = commandLine0.getOptionValue('a');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues(' ');
        java.lang.Object obj14 = commandLine0.getOptionObject(' ');
        commandLine0.addArg("");
        java.lang.String str19 = commandLine0.getOptionValue('#', "hi!");
        java.lang.String str21 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray23 = commandLine0.getOptionValues('4');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(strArray23);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String[] strArray11 = commandLine0.getArgs();
        java.lang.String str14 = commandLine0.getOptionValue("", "");
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
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.Object obj11 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("hi!");
        commandLine0.addArg("hi!");
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        commandLine0.addArg("");
        java.lang.Object obj14 = commandLine0.getOptionObject('#');
        java.lang.String str16 = commandLine0.getOptionValue('a');
        org.apache.commons.cli.Option[] optionArray17 = commandLine0.getOptions();
        java.lang.Class<?> wildcardClass18 = commandLine0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(optionArray17);
        org.junit.Assert.assertArrayEquals(optionArray17, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        boolean boolean9 = commandLine0.hasOption('a');
        boolean boolean11 = commandLine0.hasOption("");
        java.lang.Object obj13 = commandLine0.getOptionObject('a');
        boolean boolean15 = commandLine0.hasOption("");
        java.lang.Object obj17 = commandLine0.getOptionObject("hi!");
        java.lang.String str19 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
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
        java.lang.String str17 = commandLine0.getOptionValue(' ');
        java.lang.String[] strArray19 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray20 = commandLine0.getOptions();
        java.lang.String str22 = commandLine0.getOptionValue("hi!");
        java.lang.String str24 = commandLine0.getOptionValue(' ');
        boolean boolean26 = commandLine0.hasOption("hi!");
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
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNotNull(optionArray20);
        org.junit.Assert.assertArrayEquals(optionArray20, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.util.List list4 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.String[] strArray9 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        boolean boolean13 = commandLine0.hasOption(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        boolean boolean10 = commandLine0.hasOption(' ');
        boolean boolean12 = commandLine0.hasOption("");
        java.util.Iterator iterator13 = commandLine0.iterator();
        java.lang.String[] strArray15 = commandLine0.getOptionValues("");
        java.lang.Object obj17 = commandLine0.getOptionObject('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.util.Iterator iterator10 = commandLine0.iterator();
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String str14 = commandLine0.getOptionValue(' ', "");
        java.lang.String str16 = commandLine0.getOptionValue('#');
        java.util.Iterator iterator17 = commandLine0.iterator();
        boolean boolean19 = commandLine0.hasOption("");
        boolean boolean21 = commandLine0.hasOption('4');
        commandLine0.addArg("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues(' ');
        boolean boolean4 = commandLine0.hasOption("");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue('#');
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String str10 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String[] strArray8 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String str12 = commandLine0.getOptionValue('4', "");
        boolean boolean14 = commandLine0.hasOption("");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
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
        java.lang.Object obj22 = commandLine0.getOptionObject('#');
        java.util.Iterator iterator23 = commandLine0.iterator();
        java.lang.String str25 = commandLine0.getOptionValue('#');
        org.apache.commons.cli.Option option26 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option26);
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
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue("");
        commandLine0.addArg("");
        boolean boolean10 = commandLine0.hasOption('4');
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.Object obj13 = commandLine0.getOptionObject("");
        java.lang.String str16 = commandLine0.getOptionValue("", "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.util.List list8 = commandLine0.getArgList();
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.util.Iterator iterator10 = commandLine0.iterator();
        java.lang.String str12 = commandLine0.getOptionValue("hi!");
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.lang.String[] strArray15 = commandLine0.getOptionValues("hi!");
        java.lang.String str18 = commandLine0.getOptionValue("", "hi!");
        java.lang.String[] strArray19 = commandLine0.getArgs();
        java.lang.String[] strArray21 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray21);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('#');
        java.lang.String[] strArray6 = commandLine0.getOptionValues("hi!");
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.String[] strArray8 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertArrayEquals(optionArray2, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray11 = commandLine0.getArgs();
        java.lang.String str14 = commandLine0.getOptionValue(' ', "");
        java.util.List list15 = commandLine0.getArgList();
        commandLine0.addArg("");
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
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
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
        java.lang.String str20 = commandLine0.getOptionValue("hi!", "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str12 = commandLine0.getOptionValue("", "");
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.lang.String str15 = commandLine0.getOptionValue("");
        java.lang.String[] strArray16 = commandLine0.getArgs();
        java.lang.String str18 = commandLine0.getOptionValue('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('4', "");
        boolean boolean12 = commandLine0.hasOption("");
        java.lang.Object obj14 = commandLine0.getOptionObject('a');
        boolean boolean16 = commandLine0.hasOption("");
        java.util.Iterator iterator17 = commandLine0.iterator();
        java.lang.String[] strArray19 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNull(strArray19);
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("hi!");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        boolean boolean10 = commandLine0.hasOption('a');
        java.lang.Object obj12 = commandLine0.getOptionObject("hi!");
        java.lang.String str14 = commandLine0.getOptionValue("");
        java.util.List list15 = commandLine0.getArgList();
        java.lang.String str18 = commandLine0.getOptionValue('#', "");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String str12 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj14 = commandLine0.getOptionObject('#');
        java.lang.String str16 = commandLine0.getOptionValue('4');
        boolean boolean18 = commandLine0.hasOption('a');
        java.lang.String[] strArray20 = commandLine0.getOptionValues(' ');
        org.apache.commons.cli.Option[] optionArray21 = commandLine0.getOptions();
        java.lang.String str23 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNotNull(optionArray21);
        org.junit.Assert.assertArrayEquals(optionArray21, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.String str11 = commandLine0.getOptionValue("", "hi!");
        boolean boolean13 = commandLine0.hasOption(' ');
        boolean boolean15 = commandLine0.hasOption("");
        java.util.Iterator iterator16 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        boolean boolean10 = commandLine0.hasOption(' ');
        boolean boolean12 = commandLine0.hasOption("");
        java.lang.String str14 = commandLine0.getOptionValue("");
        boolean boolean16 = commandLine0.hasOption('#');
        java.lang.Object obj18 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray11 = commandLine0.getArgs();
        java.lang.String str14 = commandLine0.getOptionValue(' ', "");
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
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String str7 = commandLine0.getOptionValue('a', "");
        java.lang.Class<?> wildcardClass8 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
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
        java.util.List list17 = commandLine0.getArgList();
        java.lang.String[] strArray19 = commandLine0.getOptionValues(' ');
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
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(strArray19);
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        boolean boolean8 = commandLine0.hasOption(' ');
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.util.Iterator iterator12 = commandLine0.iterator();
        java.util.List list13 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.Object obj10 = commandLine0.getOptionObject('a');
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.util.Iterator iterator12 = commandLine0.iterator();
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option[] optionArray15 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(optionArray15);
        org.junit.Assert.assertArrayEquals(optionArray15, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("hi!");
        java.lang.Object obj8 = commandLine0.getOptionObject("");
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.lang.Object obj13 = commandLine0.getOptionObject('a');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
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
        java.lang.String str20 = commandLine0.getOptionValue("");
        java.lang.String str22 = commandLine0.getOptionValue('a');
        java.util.Iterator iterator23 = commandLine0.iterator();
        boolean boolean25 = commandLine0.hasOption('a');
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
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        java.lang.String str5 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray7 = commandLine0.getOptionValues("hi!");
        boolean boolean9 = commandLine0.hasOption("");
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertArrayEquals(optionArray2, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        boolean boolean6 = commandLine0.hasOption("");
        java.lang.Object obj8 = commandLine0.getOptionObject("");
        boolean boolean10 = commandLine0.hasOption(' ');
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String str14 = commandLine0.getOptionValue(' ', "");
        boolean boolean16 = commandLine0.hasOption('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String str9 = commandLine0.getOptionValue('#');
        java.lang.String str11 = commandLine0.getOptionValue('a');
        boolean boolean13 = commandLine0.hasOption("");
        java.lang.String str16 = commandLine0.getOptionValue("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        boolean boolean11 = commandLine0.hasOption("hi!");
        java.util.Iterator iterator12 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
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
        java.lang.Object obj18 = commandLine0.getOptionObject('a');
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
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        boolean boolean11 = commandLine0.hasOption('4');
        boolean boolean13 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray15 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        java.lang.String str12 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String str15 = commandLine0.getOptionValue('#', "hi!");
        org.apache.commons.cli.Option[] optionArray16 = commandLine0.getOptions();
        java.lang.String str19 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String str21 = commandLine0.getOptionValue('4');
        org.apache.commons.cli.Option option22 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option22);
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
        org.junit.Assert.assertNotNull(optionArray16);
        org.junit.Assert.assertArrayEquals(optionArray16, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.String str10 = commandLine0.getOptionValue('4', "");
        java.util.Iterator iterator11 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.String str10 = commandLine0.getOptionValue('4', "");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj14 = commandLine0.getOptionObject(' ');
        java.util.List list15 = commandLine0.getArgList();
        java.lang.String str17 = commandLine0.getOptionValue("hi!");
        boolean boolean19 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        boolean boolean11 = commandLine0.hasOption("");
        boolean boolean13 = commandLine0.hasOption(' ');
        java.lang.String[] strArray15 = commandLine0.getOptionValues('#');
        java.lang.Class<?> wildcardClass16 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
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
        java.util.Iterator iterator20 = commandLine0.iterator();
        java.lang.String str22 = commandLine0.getOptionValue('a');
        java.lang.String str24 = commandLine0.getOptionValue('#');
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
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray7 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "" });
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        commandLine0.addArg("hi!");
        java.lang.String[] strArray13 = commandLine0.getOptionValues('4');
        java.lang.String[] strArray15 = commandLine0.getOptionValues("");
        commandLine0.addArg("hi!");
        java.lang.Object obj19 = commandLine0.getOptionObject("hi!");
        java.lang.String str21 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        boolean boolean11 = commandLine0.hasOption("");
        java.lang.Object obj13 = commandLine0.getOptionObject("");
        java.lang.String[] strArray14 = commandLine0.getArgs();
        java.lang.String[] strArray16 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray18 = commandLine0.getOptionValues('#');
        java.lang.String[] strArray20 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNull(strArray20);
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        java.util.List list9 = commandLine0.getArgList();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String[] strArray6 = commandLine0.getOptionValues('4');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.String[] strArray10 = commandLine0.getOptionValues('#');
        java.lang.Object obj12 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.Object obj12 = commandLine0.getOptionObject(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.String str17 = commandLine0.getOptionValue("hi!", "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray8 = commandLine0.getOptionValues('#');
        java.lang.String str10 = commandLine0.getOptionValue("");
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj15 = commandLine0.getOptionObject("");
        java.lang.Object obj17 = commandLine0.getOptionObject('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        boolean boolean12 = commandLine0.hasOption('a');
        java.util.Iterator iterator13 = commandLine0.iterator();
        java.lang.String[] strArray15 = commandLine0.getOptionValues("");
        java.lang.Object obj17 = commandLine0.getOptionObject('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str9 = commandLine0.getOptionValue("");
        boolean boolean11 = commandLine0.hasOption('4');
        java.lang.String str14 = commandLine0.getOptionValue("", "hi!");
        java.lang.Object obj16 = commandLine0.getOptionObject("");
        java.lang.String str19 = commandLine0.getOptionValue('4', "hi!");
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("hi!");
        java.lang.String[] strArray7 = commandLine0.getArgs();
        java.lang.String str10 = commandLine0.getOptionValue('#', "");
        boolean boolean12 = commandLine0.hasOption('a');
        java.lang.Object obj14 = commandLine0.getOptionObject("hi!");
        java.util.Iterator iterator15 = commandLine0.iterator();
        java.lang.String[] strArray17 = commandLine0.getOptionValues('4');
        boolean boolean19 = commandLine0.hasOption("");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        boolean boolean10 = commandLine0.hasOption('a');
        commandLine0.addArg("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray8 = commandLine0.getOptionValues(' ');
        commandLine0.addArg("");
        java.util.List list11 = commandLine0.getArgList();
        java.lang.String str13 = commandLine0.getOptionValue("hi!");
        java.util.Iterator iterator14 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray9 = commandLine0.getOptionValues('4');
        java.lang.String str12 = commandLine0.getOptionValue('#', "");
        java.lang.String str15 = commandLine0.getOptionValue("", "");
        boolean boolean17 = commandLine0.hasOption("hi!");
        java.lang.Object obj19 = commandLine0.getOptionObject("");
        java.lang.String str22 = commandLine0.getOptionValue("hi!", "hi!");
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
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str9 = commandLine0.getOptionValue("");
        java.lang.String str12 = commandLine0.getOptionValue("hi!", "hi!");
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.lang.String[] strArray15 = commandLine0.getOptionValues("");
        java.lang.String[] strArray17 = commandLine0.getOptionValues('a');
        java.lang.Object obj19 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray21 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray23 = commandLine0.getOptionValues("hi!");
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
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNull(strArray23);
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String str5 = commandLine0.getOptionValue("");
        boolean boolean7 = commandLine0.hasOption("hi!");
        java.lang.String str9 = commandLine0.getOptionValue(' ');
        commandLine0.addArg("hi!");
        java.util.Iterator iterator12 = commandLine0.iterator();
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
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
        org.apache.commons.cli.Option[] optionArray21 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray22 = commandLine0.getOptions();
        java.util.Iterator iterator23 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(optionArray21);
        org.junit.Assert.assertArrayEquals(optionArray21, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray22);
        org.junit.Assert.assertArrayEquals(optionArray22, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator23);
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        boolean boolean8 = commandLine0.hasOption(' ');
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.util.Iterator iterator11 = commandLine0.iterator();
        boolean boolean13 = commandLine0.hasOption('#');
        boolean boolean15 = commandLine0.hasOption("hi!");
        java.util.List list16 = commandLine0.getArgList();
        java.lang.Class<?> wildcardClass17 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.util.Iterator iterator6 = commandLine0.iterator();
        commandLine0.addArg("hi!");
        commandLine0.addArg("hi!");
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.lang.Object obj13 = commandLine0.getOptionObject("");
        java.lang.String str16 = commandLine0.getOptionValue(' ', "");
        java.lang.Object obj18 = commandLine0.getOptionObject('#');
        java.util.List list19 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        commandLine0.addArg("hi!");
        java.lang.String[] strArray13 = commandLine0.getOptionValues('4');
        java.lang.String str15 = commandLine0.getOptionValue("hi!");
        java.lang.String str17 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str12 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.lang.Object obj15 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray17 = commandLine0.getOptionValues("");
        java.util.List list18 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray3 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(optionArray3);
        org.junit.Assert.assertArrayEquals(optionArray3, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray6 = commandLine0.getOptions();
        java.lang.String str8 = commandLine0.getOptionValue("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray6);
        org.junit.Assert.assertArrayEquals(optionArray6, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        boolean boolean8 = commandLine0.hasOption(' ');
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.util.Iterator iterator11 = commandLine0.iterator();
        boolean boolean13 = commandLine0.hasOption('#');
        boolean boolean15 = commandLine0.hasOption("hi!");
        java.util.List list16 = commandLine0.getArgList();
        java.lang.Object obj18 = commandLine0.getOptionObject('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray10 = commandLine0.getOptionValues('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.String str9 = commandLine0.getOptionValue("hi!");
        boolean boolean11 = commandLine0.hasOption("");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.util.Iterator iterator14 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.Iterator iterator5 = commandLine0.iterator();
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        boolean boolean9 = commandLine0.hasOption("");
        java.lang.String str11 = commandLine0.getOptionValue('#');
        java.util.List list12 = commandLine0.getArgList();
        java.lang.String str14 = commandLine0.getOptionValue("hi!");
        java.util.Iterator iterator15 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        java.util.List list12 = commandLine0.getArgList();
        java.lang.Object obj14 = commandLine0.getOptionObject("");
        java.lang.String[] strArray15 = commandLine0.getArgs();
        java.lang.String str17 = commandLine0.getOptionValue(' ');
        java.lang.String[] strArray19 = commandLine0.getOptionValues("");
        commandLine0.addArg("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strArray19);
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String[] strArray12 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        boolean boolean16 = commandLine0.hasOption("");
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
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str9 = commandLine0.getOptionValue("");
        boolean boolean11 = commandLine0.hasOption('4');
        java.lang.String str14 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str17 = commandLine0.getOptionValue('a', "");
        commandLine0.addArg("hi!");
        java.lang.Object obj21 = commandLine0.getOptionObject('4');
        java.util.List list22 = commandLine0.getArgList();
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
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.util.List list9 = commandLine0.getArgList();
        java.lang.String str12 = commandLine0.getOptionValue('#', "hi!");
        java.lang.Object obj14 = commandLine0.getOptionObject('a');
        boolean boolean16 = commandLine0.hasOption(' ');
        java.lang.String str18 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('4', "");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.util.List list12 = commandLine0.getArgList();
        java.lang.String[] strArray13 = commandLine0.getArgs();
        java.util.List list14 = commandLine0.getArgList();
        java.lang.String str17 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String[] strArray18 = commandLine0.getArgs();
        java.util.List list19 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
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
        boolean boolean18 = commandLine0.hasOption('a');
        java.lang.Object obj20 = commandLine0.getOptionObject('4');
        java.lang.String[] strArray21 = commandLine0.getArgs();
        java.lang.String[] strArray23 = commandLine0.getOptionValues('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(strArray23);
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.util.Iterator iterator8 = commandLine0.iterator();
        java.lang.String str10 = commandLine0.getOptionValue(' ');
        java.util.List list11 = commandLine0.getArgList();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.util.Iterator iterator10 = commandLine0.iterator();
        java.lang.Object obj12 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray13 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "" });
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        commandLine0.addArg("hi!");
        commandLine0.addArg("hi!");
        java.lang.String[] strArray14 = commandLine0.getOptionValues('4');
        java.lang.String[] strArray16 = commandLine0.getOptionValues("");
        java.util.Iterator iterator17 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray11 = commandLine0.getArgs();
        java.lang.String str14 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray16 = commandLine0.getOptionValues(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.util.Iterator iterator7 = commandLine0.iterator();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.String str13 = commandLine0.getOptionValue("");
        java.lang.String[] strArray15 = commandLine0.getOptionValues('4');
        boolean boolean17 = commandLine0.hasOption('4');
        java.lang.Class<?> wildcardClass18 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray3 = commandLine0.getOptions();
        java.lang.Object obj5 = commandLine0.getOptionObject('4');
        java.lang.String[] strArray7 = commandLine0.getOptionValues('a');
        java.lang.String str10 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String str13 = commandLine0.getOptionValue('a', "");
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.String[] strArray16 = commandLine0.getOptionValues(' ');
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(optionArray3);
        org.junit.Assert.assertArrayEquals(optionArray3, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray3 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        java.util.List list6 = commandLine0.getArgList();
        boolean boolean8 = commandLine0.hasOption('a');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String str13 = commandLine0.getOptionValue('4', "hi!");
        java.lang.String str15 = commandLine0.getOptionValue(' ');
        java.lang.String[] strArray17 = commandLine0.getOptionValues("");
        java.lang.String str20 = commandLine0.getOptionValue(' ', "");
        java.lang.Object obj22 = commandLine0.getOptionObject("hi!");
        java.lang.String str25 = commandLine0.getOptionValue('a', "");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(optionArray3);
        org.junit.Assert.assertArrayEquals(optionArray3, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue("", "hi!");
        boolean boolean10 = commandLine0.hasOption("");
        java.lang.String str13 = commandLine0.getOptionValue('4', "hi!");
        java.lang.String str15 = commandLine0.getOptionValue("hi!");
        java.lang.String str17 = commandLine0.getOptionValue('#');
        boolean boolean19 = commandLine0.hasOption('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        boolean boolean9 = commandLine0.hasOption("hi!");
        boolean boolean11 = commandLine0.hasOption('4');
        boolean boolean13 = commandLine0.hasOption(' ');
        java.lang.Object obj15 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        boolean boolean10 = commandLine0.hasOption('a');
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
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
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
        java.lang.String[] strArray18 = commandLine0.getArgs();
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
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "" });
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
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
        java.lang.String str25 = commandLine0.getOptionValue("");
        java.lang.String str28 = commandLine0.getOptionValue("", "");
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
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str6 = commandLine0.getOptionValue('a', "hi!");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        java.lang.String str11 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.Iterator iterator5 = commandLine0.iterator();
        java.lang.Object obj7 = commandLine0.getOptionObject('4');
        java.lang.String str10 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str12 = commandLine0.getOptionValue("hi!");
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        boolean boolean10 = commandLine0.hasOption("");
        java.lang.String[] strArray11 = commandLine0.getArgs();
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "");
        commandLine0.addArg("");
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.String str17 = commandLine0.getOptionValue("", "");
        org.apache.commons.cli.Option[] optionArray18 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(optionArray18);
        org.junit.Assert.assertArrayEquals(optionArray18, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.util.List list9 = commandLine0.getArgList();
        java.lang.String str11 = commandLine0.getOptionValue('4');
        java.lang.String str14 = commandLine0.getOptionValue("hi!", "hi!");
        java.util.List list15 = commandLine0.getArgList();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray18 = commandLine0.getArgs();
        java.lang.Object obj20 = commandLine0.getOptionObject("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray6 = commandLine0.getOptions();
        java.lang.String str9 = commandLine0.getOptionValue('a', "");
        boolean boolean11 = commandLine0.hasOption("");
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.lang.String str14 = commandLine0.getOptionValue("hi!");
        java.lang.String str17 = commandLine0.getOptionValue("hi!", "");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue('a');
        java.lang.String str11 = commandLine0.getOptionValue('4', "hi!");
        java.util.Iterator iterator12 = commandLine0.iterator();
        java.util.Iterator iterator13 = commandLine0.iterator();
        java.lang.String str16 = commandLine0.getOptionValue('a', "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        commandLine0.addArg("hi!");
        java.lang.String[] strArray13 = commandLine0.getOptionValues('4');
        boolean boolean15 = commandLine0.hasOption("hi!");
        commandLine0.addArg("hi!");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String str10 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String str12 = commandLine0.getOptionValue('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str12 = commandLine0.getOptionValue("", "");
        java.lang.String str14 = commandLine0.getOptionValue("");
        java.lang.String str16 = commandLine0.getOptionValue('a');
        java.lang.Object obj18 = commandLine0.getOptionObject(' ');
        java.lang.String str21 = commandLine0.getOptionValue("", "hi!");
        boolean boolean23 = commandLine0.hasOption(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
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
        java.util.List list15 = commandLine0.getArgList();
        org.apache.commons.cli.Option option16 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option16);
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
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.util.Iterator iterator6 = commandLine0.iterator();
        commandLine0.addArg("hi!");
        boolean boolean10 = commandLine0.hasOption(' ');
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj14 = commandLine0.getOptionObject('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
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
        java.lang.String[] strArray17 = commandLine0.getOptionValues('a');
        java.lang.String str20 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str22 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.util.Iterator iterator10 = commandLine0.iterator();
        boolean boolean12 = commandLine0.hasOption('#');
        java.lang.String[] strArray14 = commandLine0.getOptionValues(' ');
        java.lang.String str16 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
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
        java.lang.String[] strArray21 = commandLine0.getOptionValues('4');
        boolean boolean23 = commandLine0.hasOption('#');
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
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
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
        java.lang.Object obj19 = commandLine0.getOptionObject('a');
        boolean boolean21 = commandLine0.hasOption('4');
        java.lang.String[] strArray23 = commandLine0.getOptionValues("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(strArray23);
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.util.List list8 = commandLine0.getArgList();
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.Object obj11 = commandLine0.getOptionObject('4');
        boolean boolean13 = commandLine0.hasOption('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        java.lang.String[] strArray10 = commandLine0.getArgs();
        java.lang.String str12 = commandLine0.getOptionValue('a');
        java.lang.String str14 = commandLine0.getOptionValue('#');
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
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        java.util.List list11 = commandLine0.getArgList();
        java.util.List list12 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray6 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        boolean boolean9 = commandLine0.hasOption('a');
        java.util.Iterator iterator10 = commandLine0.iterator();
        java.lang.String[] strArray11 = commandLine0.getArgs();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray6);
        org.junit.Assert.assertArrayEquals(optionArray6, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
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
        java.lang.String str18 = commandLine0.getOptionValue(' ', "");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray9 = commandLine0.getOptionValues('#');
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        boolean boolean12 = commandLine0.hasOption("hi!");
        java.util.Iterator iterator13 = commandLine0.iterator();
        boolean boolean15 = commandLine0.hasOption('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        boolean boolean11 = commandLine0.hasOption("hi!");
        java.util.List list12 = commandLine0.getArgList();
        java.lang.Class<?> wildcardClass13 = list12.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
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
        java.lang.String[] strArray19 = commandLine0.getArgs();
        java.lang.String[] strArray20 = commandLine0.getArgs();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "" });
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
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
        java.util.Iterator iterator17 = commandLine0.iterator();
        java.lang.String str19 = commandLine0.getOptionValue("hi!");
        java.lang.Class<?> wildcardClass20 = commandLine0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
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
        java.lang.Object obj20 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray22 = commandLine0.getOptionValues('#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = strArray22.getClass();
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
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(strArray22);
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.util.List list9 = commandLine0.getArgList();
        java.lang.String str11 = commandLine0.getOptionValue('a');
        java.lang.String str14 = commandLine0.getOptionValue("", "");
        commandLine0.addArg("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.lang.String str11 = commandLine0.getOptionValue('a', "");
        java.lang.String str13 = commandLine0.getOptionValue("");
        java.lang.Object obj15 = commandLine0.getOptionObject("hi!");
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
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String str9 = commandLine0.getOptionValue("", "");
        boolean boolean11 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.String str10 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        commandLine0.addArg("");
        boolean boolean16 = commandLine0.hasOption(' ');
        java.lang.String[] strArray18 = commandLine0.getOptionValues('#');
        java.lang.String[] strArray19 = commandLine0.getArgs();
        java.lang.String str22 = commandLine0.getOptionValue('#', "");
        boolean boolean24 = commandLine0.hasOption("");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        boolean boolean6 = commandLine0.hasOption('#');
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.String[] strArray8 = commandLine0.getArgs();
        boolean boolean10 = commandLine0.hasOption("hi!");
        boolean boolean12 = commandLine0.hasOption('4');
        java.lang.String[] strArray14 = commandLine0.getOptionValues("hi!");
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
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String[] strArray6 = commandLine0.getOptionValues("");
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.lang.String str15 = commandLine0.getOptionValue(' ', "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.Object obj13 = commandLine0.getOptionObject('a');
        boolean boolean15 = commandLine0.hasOption("");
        java.lang.String[] strArray17 = commandLine0.getOptionValues('#');
        java.lang.String[] strArray19 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray21 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNull(strArray21);
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String[] strArray11 = commandLine0.getOptionValues('a');
        java.util.Iterator iterator12 = commandLine0.iterator();
        java.lang.String[] strArray13 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "" });
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        java.lang.String str7 = commandLine0.getOptionValue(' ', "hi!");
        boolean boolean9 = commandLine0.hasOption("");
        java.util.List list10 = commandLine0.getArgList();
        java.lang.String str13 = commandLine0.getOptionValue("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        java.util.List list10 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String str14 = commandLine0.getOptionValue("", "hi!");
        java.lang.String[] strArray16 = commandLine0.getOptionValues("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String str12 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj14 = commandLine0.getOptionObject(' ');
        java.util.List list15 = commandLine0.getArgList();
        java.lang.String[] strArray17 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.util.Iterator iterator6 = commandLine0.iterator();
        commandLine0.addArg("hi!");
        boolean boolean10 = commandLine0.hasOption(' ');
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator13 = commandLine0.iterator();
        boolean boolean15 = commandLine0.hasOption('4');
        java.lang.String str18 = commandLine0.getOptionValue(' ', "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String str9 = commandLine0.getOptionValue('#');
        java.lang.String str11 = commandLine0.getOptionValue('a');
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.lang.String str14 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues(' ');
        boolean boolean4 = commandLine0.hasOption("");
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue('#');
        java.lang.String str10 = commandLine0.getOptionValue("");
        java.util.Iterator iterator11 = commandLine0.iterator();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String str10 = commandLine0.getOptionValue("");
        commandLine0.addArg("hi!");
        commandLine0.addArg("hi!");
        commandLine0.addArg("hi!");
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
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
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
        java.lang.String[] strArray24 = commandLine0.getOptionValues("");
        java.lang.Object obj26 = commandLine0.getOptionObject("");
        java.lang.String[] strArray27 = commandLine0.getArgs();
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
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "" });
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str11 = commandLine0.getOptionValue(' ');
        java.lang.String str13 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray15 = commandLine0.getOptionValues('4');
        java.lang.String str18 = commandLine0.getOptionValue("", "hi!");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.lang.String str8 = commandLine0.getOptionValue("", "hi!");
        boolean boolean10 = commandLine0.hasOption('#');
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.lang.Object obj13 = commandLine0.getOptionObject('a');
        java.util.Iterator iterator14 = commandLine0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
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
        java.lang.String str17 = commandLine0.getOptionValue('4');
        java.lang.String str20 = commandLine0.getOptionValue(' ', "hi!");
        commandLine0.addArg("");
        java.lang.Class<?> wildcardClass23 = commandLine0.getClass();
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
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.Object obj12 = commandLine0.getOptionObject('4');
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        boolean boolean15 = commandLine0.hasOption('4');
        java.lang.Object obj17 = commandLine0.getOptionObject("");
        boolean boolean19 = commandLine0.hasOption("hi!");
        java.lang.String str21 = commandLine0.getOptionValue('4');
        java.lang.String str23 = commandLine0.getOptionValue("");
        java.lang.String str26 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray28 = commandLine0.getOptionValues('a');
        boolean boolean30 = commandLine0.hasOption('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String str9 = commandLine0.getOptionValue('#', "");
        java.lang.String str11 = commandLine0.getOptionValue('4');
        java.lang.Object obj13 = commandLine0.getOptionObject('4');
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.String[] strArray15 = commandLine0.getArgs();
        java.lang.Object obj17 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray18 = commandLine0.getArgs();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue("");
        commandLine0.addArg("");
        java.lang.String str10 = commandLine0.getOptionValue("hi!");
        java.util.List list11 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        boolean boolean6 = commandLine0.hasOption("");
        java.lang.Object obj8 = commandLine0.getOptionObject("");
        boolean boolean10 = commandLine0.hasOption(' ');
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean15 = commandLine0.hasOption('4');
        java.util.List list16 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        java.lang.String str15 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option[] optionArray16 = commandLine0.getOptions();
        boolean boolean18 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option[] optionArray19 = commandLine0.getOptions();
        boolean boolean21 = commandLine0.hasOption('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(optionArray16);
        org.junit.Assert.assertArrayEquals(optionArray16, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(optionArray19);
        org.junit.Assert.assertArrayEquals(optionArray19, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray8 = commandLine0.getOptionValues('#');
        java.lang.String[] strArray9 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String[] strArray8 = commandLine0.getOptionValues("hi!");
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.lang.String[] strArray13 = commandLine0.getArgs();
        java.lang.String str15 = commandLine0.getOptionValue('a');
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
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "");
        commandLine0.addArg("");
        java.lang.String[] strArray15 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator16 = commandLine0.iterator();
        java.lang.String[] strArray17 = commandLine0.getArgs();
        org.apache.commons.cli.Option option18 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.lang.String str8 = commandLine0.getOptionValue("", "hi!");
        boolean boolean10 = commandLine0.hasOption('#');
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.lang.Object obj13 = commandLine0.getOptionObject('4');
        boolean boolean15 = commandLine0.hasOption('4');
        org.apache.commons.cli.Option[] optionArray16 = commandLine0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(optionArray16);
        org.junit.Assert.assertArrayEquals(optionArray16, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        java.lang.String str8 = commandLine0.getOptionValue('#');
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.lang.String str12 = commandLine0.getOptionValue("hi!");
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.lang.String str15 = commandLine0.getOptionValue('#');
        java.lang.Object obj17 = commandLine0.getOptionObject("hi!");
        java.util.List list18 = commandLine0.getArgList();
        java.lang.String[] strArray19 = commandLine0.getArgs();
        java.lang.Object obj21 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray23 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(strArray23);
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String str11 = commandLine0.getOptionValue('#');
        boolean boolean13 = commandLine0.hasOption('4');
        java.lang.String[] strArray14 = commandLine0.getArgs();
        java.lang.String[] strArray15 = commandLine0.getArgs();
        boolean boolean17 = commandLine0.hasOption('4');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray12 = commandLine0.getOptionValues('a');
        java.lang.String str14 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray15 = commandLine0.getArgs();
        boolean boolean17 = commandLine0.hasOption('4');
        boolean boolean19 = commandLine0.hasOption("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.Object obj6 = commandLine0.getOptionObject('#');
        java.lang.String str8 = commandLine0.getOptionValue('4');
        java.lang.String str11 = commandLine0.getOptionValue('4', "");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String str5 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String[] strArray6 = commandLine0.getOptionValues('4');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.String[] strArray10 = commandLine0.getOptionValues('#');
        java.lang.String[] strArray11 = commandLine0.getArgs();
        java.lang.String[] strArray13 = commandLine0.getOptionValues('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        java.lang.String str12 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String str15 = commandLine0.getOptionValue('#', "hi!");
        org.apache.commons.cli.Option[] optionArray16 = commandLine0.getOptions();
        java.lang.String str18 = commandLine0.getOptionValue("");
        boolean boolean20 = commandLine0.hasOption("");
        java.lang.Object obj22 = commandLine0.getOptionObject("hi!");
        java.lang.String str24 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(optionArray16);
        org.junit.Assert.assertArrayEquals(optionArray16, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray8 = commandLine0.getOptionValues('#');
        java.lang.String str10 = commandLine0.getOptionValue("");
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "");
        boolean boolean15 = commandLine0.hasOption("hi!");
        java.lang.String str17 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "");
        commandLine0.addArg("");
        java.lang.String[] strArray15 = commandLine0.getOptionValues("");
        java.lang.Object obj17 = commandLine0.getOptionObject("hi!");
        java.util.List list18 = commandLine0.getArgList();
        java.lang.String[] strArray20 = commandLine0.getOptionValues("hi!");
        java.lang.String str22 = commandLine0.getOptionValue('#');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String str10 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str12 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray14 = commandLine0.getOptionValues(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.util.List list9 = commandLine0.getArgList();
        java.lang.String str11 = commandLine0.getOptionValue("hi!");
        java.lang.String str13 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray15 = commandLine0.getOptionValues('4');
        java.lang.String str18 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str20 = commandLine0.getOptionValue(' ');
        java.lang.String str22 = commandLine0.getOptionValue("hi!");
        java.lang.Class<?> wildcardClass23 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        java.lang.String str12 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String str15 = commandLine0.getOptionValue('#', "hi!");
        java.lang.Object obj17 = commandLine0.getOptionObject('4');
        java.lang.String[] strArray18 = commandLine0.getArgs();
        java.lang.String str20 = commandLine0.getOptionValue(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str9 = commandLine0.getOptionValue("");
        boolean boolean11 = commandLine0.hasOption('a');
        commandLine0.addArg("");
        commandLine0.addArg("hi!");
        java.lang.String[] strArray17 = commandLine0.getOptionValues('#');
        boolean boolean19 = commandLine0.hasOption(' ');
        java.lang.String str22 = commandLine0.getOptionValue("", "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.util.Iterator iterator6 = commandLine0.iterator();
        java.util.List list7 = commandLine0.getArgList();
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray10 = commandLine0.getArgs();
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.String str7 = commandLine0.getOptionValue(' ');
        java.lang.String str9 = commandLine0.getOptionValue("hi!");
        boolean boolean11 = commandLine0.hasOption('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
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
        java.lang.String[] strArray18 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator19 = commandLine0.iterator();
        java.lang.String[] strArray21 = commandLine0.getOptionValues(' ');
        java.lang.String str24 = commandLine0.getOptionValue("hi!", "");
        java.lang.String[] strArray25 = commandLine0.getArgs();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "" });
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String[] strArray6 = commandLine0.getOptionValues('4');
        commandLine0.addArg("");
        java.lang.String str10 = commandLine0.getOptionValue('a');
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.util.List list11 = commandLine0.getArgList();
        java.lang.String str14 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String[] strArray15 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('4');
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String[] strArray9 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj11 = commandLine0.getOptionObject('#');
        java.lang.String str13 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj15 = commandLine0.getOptionObject("hi!");
        boolean boolean17 = commandLine0.hasOption(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
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
        java.lang.Object obj23 = commandLine0.getOptionObject('4');
        boolean boolean25 = commandLine0.hasOption("");
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
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "hi!");
        java.util.Iterator iterator12 = commandLine0.iterator();
        boolean boolean14 = commandLine0.hasOption('#');
        java.lang.String str17 = commandLine0.getOptionValue("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.String str17 = commandLine0.getOptionValue('#', "hi!");
        org.apache.commons.cli.Option[] optionArray18 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(optionArray18);
        org.junit.Assert.assertArrayEquals(optionArray18, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray14 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray15 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray16 = commandLine0.getOptions();
        java.lang.Object obj18 = commandLine0.getOptionObject('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(optionArray16);
        org.junit.Assert.assertArrayEquals(optionArray16, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.String[] strArray4 = commandLine0.getArgs();
        java.lang.String[] strArray5 = commandLine0.getArgs();
        java.lang.String str7 = commandLine0.getOptionValue("hi!");
        java.util.Iterator iterator8 = commandLine0.iterator();
        java.lang.Class<?> wildcardClass9 = iterator8.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String str11 = commandLine0.getOptionValue('#');
        java.lang.Object obj13 = commandLine0.getOptionObject('#');
        java.lang.String str15 = commandLine0.getOptionValue('#');
        java.util.Iterator iterator16 = commandLine0.iterator();
        java.lang.Object obj18 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.util.Iterator iterator7 = commandLine0.iterator();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.String str13 = commandLine0.getOptionValue("");
        java.lang.String[] strArray15 = commandLine0.getOptionValues('4');
        boolean boolean17 = commandLine0.hasOption('4');
        java.lang.String str19 = commandLine0.getOptionValue('a');
        java.lang.String[] strArray21 = commandLine0.getOptionValues('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(strArray21);
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        boolean boolean6 = commandLine0.hasOption("");
        java.lang.String str9 = commandLine0.getOptionValue("hi!", "");
        boolean boolean11 = commandLine0.hasOption('4');
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
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String str11 = commandLine0.getOptionValue('#');
        java.util.List list12 = commandLine0.getArgList();
        java.lang.String[] strArray14 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.util.Iterator iterator7 = commandLine0.iterator();
        boolean boolean9 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray10 = commandLine0.getArgs();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('4');
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('#', "");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray14 = commandLine0.getOptionValues('4');
        boolean boolean16 = commandLine0.hasOption('4');
        java.lang.Object obj18 = commandLine0.getOptionObject('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
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
        java.lang.String str17 = commandLine0.getOptionValue('4');
        java.lang.String str20 = commandLine0.getOptionValue(' ', "hi!");
        commandLine0.addArg("");
        java.lang.String str25 = commandLine0.getOptionValue("", "hi!");
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
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('#');
        boolean boolean11 = commandLine0.hasOption('4');
        boolean boolean13 = commandLine0.hasOption("");
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "");
        commandLine0.addArg("");
        java.lang.String[] strArray15 = commandLine0.getOptionValues("");
        java.lang.String str17 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray19 = commandLine0.getOptionValues("");
        java.lang.String[] strArray21 = commandLine0.getOptionValues("");
        boolean boolean23 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray24 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String str10 = commandLine0.getOptionValue("hi!", "");
        boolean boolean12 = commandLine0.hasOption("");
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.lang.String str15 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.util.List list8 = commandLine0.getArgList();
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.Object obj11 = commandLine0.getOptionObject('4');
        commandLine0.addArg("hi!");
        java.lang.String str16 = commandLine0.getOptionValue("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
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
        java.lang.String str17 = commandLine0.getOptionValue(' ');
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
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        commandLine0.addArg("hi!");
        java.lang.Object obj11 = commandLine0.getOptionObject("");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        java.lang.String str10 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        java.lang.String str14 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray16 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray18 = commandLine0.getOptionValues('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(strArray18);
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject("hi!");
        java.lang.Class<?> wildcardClass5 = commandLine0.getClass();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }
}

