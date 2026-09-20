package org.apache.commons.cli;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
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
        java.lang.String str20 = commandLine0.getOptionValue('4');
        commandLine0.addArg("hi!");
        java.lang.String str25 = commandLine0.getOptionValue("", "hi!");
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        java.lang.String str7 = commandLine0.getOptionValue(' ', "hi!");
        boolean boolean9 = commandLine0.hasOption("");
        java.util.List list10 = commandLine0.getArgList();
        java.lang.String str13 = commandLine0.getOptionValue("", "hi!");
        java.lang.Object obj15 = commandLine0.getOptionObject('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("hi!");
        boolean boolean10 = commandLine0.hasOption('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
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
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String str5 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.lang.String str8 = commandLine0.getOptionValue(' ');
        java.util.List list9 = commandLine0.getArgList();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
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
        boolean boolean20 = commandLine0.hasOption(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues('#');
        java.util.List list13 = commandLine0.getArgList();
        java.util.List list14 = commandLine0.getArgList();
        java.lang.String str17 = commandLine0.getOptionValue("", "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        boolean boolean13 = commandLine0.hasOption("");
        java.util.List list14 = commandLine0.getArgList();
        java.lang.String[] strArray16 = commandLine0.getOptionValues('#');
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
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
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
        boolean boolean22 = commandLine0.hasOption(' ');
        java.lang.Class<?> wildcardClass23 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String[] strArray8 = commandLine0.getOptionValues(' ');
        java.lang.String str10 = commandLine0.getOptionValue('4');
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("");
        java.lang.Object obj15 = commandLine0.getOptionObject("");
        java.lang.String[] strArray17 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
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
        boolean boolean17 = commandLine0.hasOption('a');
        boolean boolean19 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option[] optionArray20 = commandLine0.getOptions();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(optionArray20);
        org.junit.Assert.assertArrayEquals(optionArray20, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
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
        java.lang.Object obj19 = commandLine0.getOptionObject('#');
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
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String str10 = commandLine0.getOptionValue("");
        java.lang.Object obj12 = commandLine0.getOptionObject('4');
        java.lang.String str14 = commandLine0.getOptionValue(' ');
        java.lang.String str16 = commandLine0.getOptionValue("");
        boolean boolean18 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.String str13 = commandLine0.getOptionValue('4', "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.util.Iterator iterator6 = commandLine0.iterator();
        commandLine0.addArg("hi!");
        boolean boolean10 = commandLine0.hasOption(' ');
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.lang.String[] strArray15 = commandLine0.getOptionValues('a');
        java.lang.Object obj17 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.lang.String str11 = commandLine0.getOptionValue('a', "");
        java.lang.String str13 = commandLine0.getOptionValue("");
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.String str17 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues(' ');
        boolean boolean4 = commandLine0.hasOption("");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue('#');
        java.util.List list8 = commandLine0.getArgList();
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.Class<?> wildcardClass11 = commandLine0.getClass();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray3 = commandLine0.getOptions();
        java.lang.Object obj5 = commandLine0.getOptionObject('4');
        java.lang.String[] strArray7 = commandLine0.getOptionValues('a');
        java.lang.String str10 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String str13 = commandLine0.getOptionValue('a', "");
        java.lang.String str15 = commandLine0.getOptionValue('a');
        java.lang.String str18 = commandLine0.getOptionValue('a', "");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(optionArray3);
        org.junit.Assert.assertArrayEquals(optionArray3, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String str13 = commandLine0.getOptionValue(' ', "");
        java.lang.String str15 = commandLine0.getOptionValue("");
        java.lang.Object obj17 = commandLine0.getOptionObject('4');
        boolean boolean19 = commandLine0.hasOption('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
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
        boolean boolean17 = commandLine0.hasOption(' ');
        java.util.Iterator iterator18 = commandLine0.iterator();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray21 = commandLine0.getOptions();
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
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(optionArray21);
        org.junit.Assert.assertArrayEquals(optionArray21, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.String str9 = commandLine0.getOptionValue("hi!");
        boolean boolean11 = commandLine0.hasOption("");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.lang.Class<?> wildcardClass13 = commandLine0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        boolean boolean6 = commandLine0.hasOption('#');
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.String[] strArray8 = commandLine0.getArgs();
        boolean boolean10 = commandLine0.hasOption("hi!");
        boolean boolean12 = commandLine0.hasOption('4');
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String str13 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray15 = commandLine0.getOptions();
        java.lang.String str18 = commandLine0.getOptionValue("hi!", "");
        java.lang.String[] strArray20 = commandLine0.getOptionValues("");
        java.lang.String str22 = commandLine0.getOptionValue(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray15);
        org.junit.Assert.assertArrayEquals(optionArray15, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        java.lang.String[] strArray7 = commandLine0.getArgs();
        boolean boolean9 = commandLine0.hasOption("");
        java.lang.String str11 = commandLine0.getOptionValue("");
        commandLine0.addArg("hi!");
        java.lang.Object obj15 = commandLine0.getOptionObject("");
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
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.String[] strArray9 = commandLine0.getOptionValues('a');
        java.lang.String str11 = commandLine0.getOptionValue(' ');
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray14 = commandLine0.getArgs();
        java.lang.String str16 = commandLine0.getOptionValue('#');
        java.lang.String str18 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
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
        java.util.List list20 = commandLine0.getArgList();
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
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.util.Iterator iterator7 = commandLine0.iterator();
        commandLine0.addArg("hi!");
        java.util.List list10 = commandLine0.getArgList();
        java.lang.Object obj12 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.util.Iterator iterator14 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.util.Iterator iterator6 = commandLine0.iterator();
        java.util.Iterator iterator7 = commandLine0.iterator();
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String str10 = commandLine0.getOptionValue("");
        java.lang.String str13 = commandLine0.getOptionValue("", "");
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option[] optionArray16 = commandLine0.getOptions();
        java.lang.String str18 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(optionArray16);
        org.junit.Assert.assertArrayEquals(optionArray16, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.lang.String str8 = commandLine0.getOptionValue('4');
        java.lang.String str10 = commandLine0.getOptionValue('4');
        java.lang.String str13 = commandLine0.getOptionValue("", "");
        java.lang.Class<?> wildcardClass14 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray8 = commandLine0.getOptionValues(' ');
        commandLine0.addArg("");
        boolean boolean12 = commandLine0.hasOption("");
        java.lang.Object obj14 = commandLine0.getOptionObject("hi!");
        java.lang.Object obj16 = commandLine0.getOptionObject("hi!");
        java.util.Iterator iterator17 = commandLine0.iterator();
        java.lang.String str19 = commandLine0.getOptionValue("hi!");
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        java.lang.String str5 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray7 = commandLine0.getOptionValues("hi!");
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
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertArrayEquals(optionArray2, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.Object obj13 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray14 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray15 = commandLine0.getOptions();
        java.lang.String str18 = commandLine0.getOptionValue('#', "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(optionArray15);
        org.junit.Assert.assertArrayEquals(optionArray15, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('a');
        java.lang.String str12 = commandLine0.getOptionValue('a');
        java.lang.String[] strArray14 = commandLine0.getOptionValues('a');
        java.lang.Object obj16 = commandLine0.getOptionObject('#');
        commandLine0.addArg("hi!");
        java.lang.String[] strArray20 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(strArray20);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        commandLine0.addArg("");
        java.util.List list11 = commandLine0.getArgList();
        java.lang.String str14 = commandLine0.getOptionValue(' ', "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('4');
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        commandLine0.addArg("hi!");
        boolean boolean12 = commandLine0.hasOption('4');
        java.lang.Object obj14 = commandLine0.getOptionObject('#');
        boolean boolean16 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
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
        java.lang.String[] strArray21 = commandLine0.getOptionValues('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNull(strArray21);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.String str13 = commandLine0.getOptionValue(' ', "hi!");
        java.lang.String str16 = commandLine0.getOptionValue("", "hi!");
        java.lang.String[] strArray17 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "" });
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues(' ');
        boolean boolean4 = commandLine0.hasOption("");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        java.lang.String str10 = commandLine0.getOptionValue('a', "hi!");
        boolean boolean12 = commandLine0.hasOption('4');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray12 = commandLine0.getOptionValues('a');
        java.lang.String str14 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray16 = commandLine0.getOptionValues("");
        boolean boolean18 = commandLine0.hasOption("");
        java.lang.Object obj20 = commandLine0.getOptionObject('#');
        boolean boolean22 = commandLine0.hasOption('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String[] strArray10 = commandLine0.getOptionValues('#');
        java.lang.String[] strArray11 = commandLine0.getArgs();
        java.lang.String str14 = commandLine0.getOptionValue(' ', "");
        java.lang.String[] strArray15 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.util.List list9 = commandLine0.getArgList();
        java.lang.String str12 = commandLine0.getOptionValue('#', "hi!");
        java.lang.String str14 = commandLine0.getOptionValue("hi!");
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
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
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
        commandLine0.addArg("hi!");
        boolean boolean20 = commandLine0.hasOption("");
        boolean boolean22 = commandLine0.hasOption('a');
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
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
        boolean boolean22 = commandLine0.hasOption('#');
        java.util.Iterator iterator23 = commandLine0.iterator();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(iterator23);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj15 = commandLine0.getOptionObject("");
        boolean boolean17 = commandLine0.hasOption('a');
        java.util.List list18 = commandLine0.getArgList();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
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
        java.util.List list16 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray17 = commandLine0.getOptions();
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
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(optionArray17);
        org.junit.Assert.assertArrayEquals(optionArray17, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.String[] strArray9 = commandLine0.getOptionValues('a');
        java.lang.String str11 = commandLine0.getOptionValue(' ');
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        boolean boolean15 = commandLine0.hasOption(' ');
        java.lang.String str17 = commandLine0.getOptionValue('4');
        java.lang.String str20 = commandLine0.getOptionValue('a', "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String str9 = commandLine0.getOptionValue('#');
        java.lang.String str11 = commandLine0.getOptionValue('a');
        boolean boolean13 = commandLine0.hasOption('4');
        java.lang.String str16 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str18 = commandLine0.getOptionValue(' ');
        java.lang.Object obj20 = commandLine0.getOptionObject("");
        java.lang.Object obj22 = commandLine0.getOptionObject('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        java.lang.String[] strArray4 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj6 = commandLine0.getOptionObject(' ');
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        java.lang.String str13 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertArrayEquals(optionArray2, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str10 = commandLine0.getOptionValue("", "");
        boolean boolean12 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option option13 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        boolean boolean8 = commandLine0.hasOption(' ');
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.lang.String str14 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String str17 = commandLine0.getOptionValue('a', "hi!");
        boolean boolean19 = commandLine0.hasOption(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        boolean boolean11 = commandLine0.hasOption("");
        java.lang.String str13 = commandLine0.getOptionValue("");
        java.lang.Object obj15 = commandLine0.getOptionObject('4');
        java.util.List list16 = commandLine0.getArgList();
        commandLine0.addArg("hi!");
        boolean boolean20 = commandLine0.hasOption(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        java.lang.String[] strArray7 = commandLine0.getArgs();
        boolean boolean9 = commandLine0.hasOption("");
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.util.List list14 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str12 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray14 = commandLine0.getOptionValues('4');
        boolean boolean16 = commandLine0.hasOption("hi!");
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        java.lang.String str7 = commandLine0.getOptionValue(' ', "hi!");
        boolean boolean9 = commandLine0.hasOption("");
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
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
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
        java.lang.String str19 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray20 = commandLine0.getArgs();
        java.lang.String str22 = commandLine0.getOptionValue("");
        java.util.List list23 = commandLine0.getArgList();
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
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.String str6 = commandLine0.getOptionValue("hi!", "");
        java.lang.String[] strArray8 = commandLine0.getOptionValues('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
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
        java.util.Iterator iterator17 = commandLine0.iterator();
        java.lang.Object obj19 = commandLine0.getOptionObject("hi!");
        java.lang.String str21 = commandLine0.getOptionValue('a');
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
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str9 = commandLine0.getOptionValue("");
        boolean boolean11 = commandLine0.hasOption('a');
        boolean boolean13 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray15 = commandLine0.getOptionValues('a');
        org.apache.commons.cli.Option[] optionArray16 = commandLine0.getOptions();
        java.lang.String str18 = commandLine0.getOptionValue("");
        java.lang.String[] strArray20 = commandLine0.getOptionValues(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(optionArray16);
        org.junit.Assert.assertArrayEquals(optionArray16, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(strArray20);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.Object obj9 = commandLine0.getOptionObject("hi!");
        java.lang.String str12 = commandLine0.getOptionValue(' ', "");
        java.lang.String str15 = commandLine0.getOptionValue('4', "");
        java.util.Iterator iterator16 = commandLine0.iterator();
        java.lang.String str18 = commandLine0.getOptionValue('a');
        boolean boolean20 = commandLine0.hasOption('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues(' ');
        boolean boolean4 = commandLine0.hasOption("");
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue('#');
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        java.lang.Object obj14 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray16 = commandLine0.getOptionValues('4');
        boolean boolean18 = commandLine0.hasOption('4');
        java.lang.String[] strArray20 = commandLine0.getOptionValues(' ');
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
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(strArray20);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
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
        java.util.List list17 = commandLine0.getArgList();
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
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
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
        java.lang.Object obj24 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray26 = commandLine0.getOptionValues("");
        java.util.Iterator iterator27 = commandLine0.iterator();
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
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNotNull(iterator27);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.String[] strArray9 = commandLine0.getOptionValues('a');
        java.lang.String str11 = commandLine0.getOptionValue(' ');
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        boolean boolean15 = commandLine0.hasOption(' ');
        java.lang.String str17 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String[] strArray11 = commandLine0.getOptionValues(' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = strArray11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj15 = commandLine0.getOptionObject("");
        boolean boolean17 = commandLine0.hasOption('a');
        commandLine0.addArg("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
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
        boolean boolean16 = commandLine0.hasOption(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String[] strArray6 = commandLine0.getOptionValues('4');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.util.List list9 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.util.List list8 = commandLine0.getArgList();
        java.util.Iterator iterator9 = commandLine0.iterator();
        boolean boolean11 = commandLine0.hasOption('a');
        java.lang.Object obj13 = commandLine0.getOptionObject('a');
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.String str17 = commandLine0.getOptionValue("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
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
        java.util.List list18 = commandLine0.getArgList();
        java.lang.Object obj20 = commandLine0.getOptionObject("");
        java.lang.Object obj22 = commandLine0.getOptionObject('a');
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
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str12 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray14 = commandLine0.getOptionValues('4');
        boolean boolean16 = commandLine0.hasOption("hi!");
        java.lang.String str19 = commandLine0.getOptionValue("hi!", "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        java.util.Iterator iterator10 = commandLine0.iterator();
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        commandLine0.addArg("");
        java.lang.String str17 = commandLine0.getOptionValue('#', "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String[] strArray6 = commandLine0.getOptionValues('4');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.String str7 = commandLine0.getOptionValue(' ');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        boolean boolean10 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        boolean boolean6 = commandLine0.hasOption('#');
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.String[] strArray8 = commandLine0.getArgs();
        boolean boolean10 = commandLine0.hasOption("hi!");
        boolean boolean12 = commandLine0.hasOption('4');
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
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
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
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
        java.util.Iterator iterator19 = commandLine0.iterator();
        java.lang.String[] strArray21 = commandLine0.getOptionValues('#');
        commandLine0.addArg("");
        java.lang.String[] strArray25 = commandLine0.getOptionValues("");
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
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNull(strArray25);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.String[] strArray9 = commandLine0.getOptionValues('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        boolean boolean8 = commandLine0.hasOption('a');
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        java.lang.Object obj13 = commandLine0.getOptionObject(' ');
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String str11 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String str13 = commandLine0.getOptionValue("");
        commandLine0.addArg("");
        java.lang.String str18 = commandLine0.getOptionValue("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
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
        java.lang.String str19 = commandLine0.getOptionValue('a');
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
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray8 = commandLine0.getOptionValues(' ');
        commandLine0.addArg("");
        boolean boolean12 = commandLine0.hasOption("");
        java.lang.Object obj14 = commandLine0.getOptionObject("hi!");
        boolean boolean16 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray12 = commandLine0.getOptionValues('a');
        java.lang.String str14 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray15 = commandLine0.getArgs();
        boolean boolean17 = commandLine0.hasOption("hi!");
        java.lang.String str20 = commandLine0.getOptionValue("", "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.String str8 = commandLine0.getOptionValue("");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.Class<?> wildcardClass10 = iterator9.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        boolean boolean7 = commandLine0.hasOption('a');
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        commandLine0.addArg("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        java.util.Iterator iterator5 = commandLine0.iterator();
        java.lang.Object obj7 = commandLine0.getOptionObject('#');
        java.lang.String str10 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String[] strArray11 = commandLine0.getArgs();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        java.lang.String str8 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.util.List list11 = commandLine0.getArgList();
        boolean boolean13 = commandLine0.hasOption('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.util.Iterator iterator6 = commandLine0.iterator();
        java.lang.String[] strArray8 = commandLine0.getOptionValues('4');
        boolean boolean10 = commandLine0.hasOption("");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String str14 = commandLine0.getOptionValue("hi!", "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue("", "hi!");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.lang.String str9 = commandLine0.getOptionValue("", "hi!");
        java.lang.Object obj11 = commandLine0.getOptionObject('#');
        java.util.List list12 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.lang.String str16 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str18 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray8 = commandLine0.getOptionValues('#');
        java.lang.String str11 = commandLine0.getOptionValue("", "hi!");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.String str17 = commandLine0.getOptionValue("", "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String str5 = commandLine0.getOptionValue('a', "hi!");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String str8 = commandLine0.getOptionValue('a');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues(' ');
        boolean boolean14 = commandLine0.hasOption('a');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.util.List list6 = commandLine0.getArgList();
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.Object obj12 = commandLine0.getOptionObject(' ');
        boolean boolean14 = commandLine0.hasOption('#');
        java.util.List list15 = commandLine0.getArgList();
        java.lang.Class<?> wildcardClass16 = list15.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.util.Iterator iterator3 = commandLine0.iterator();
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String str7 = commandLine0.getOptionValue('4', "hi!");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.String str10 = commandLine0.getOptionValue(' ');
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "hi!");
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        boolean boolean11 = commandLine0.hasOption("");
        java.lang.String str13 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray15 = commandLine0.getOptionValues('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
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
        java.lang.String[] strArray21 = commandLine0.getOptionValues('#');
        java.lang.Object obj23 = commandLine0.getOptionObject('a');
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
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.String str6 = commandLine0.getOptionValue("hi!", "");
        java.lang.String[] strArray8 = commandLine0.getOptionValues('a');
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.String str10 = commandLine0.getOptionValue('4');
        commandLine0.addArg("hi!");
        java.util.List list13 = commandLine0.getArgList();
        java.lang.Object obj15 = commandLine0.getOptionObject("");
        java.lang.String str18 = commandLine0.getOptionValue(' ', "");
        boolean boolean20 = commandLine0.hasOption('a');
        java.lang.String str22 = commandLine0.getOptionValue('#');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String str10 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strArray12);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String str13 = commandLine0.getOptionValue("", "hi!");
        java.lang.String[] strArray14 = commandLine0.getArgs();
        java.util.Iterator iterator15 = commandLine0.iterator();
        java.lang.String[] strArray17 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray18 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.String[] strArray21 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "", "" });
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray8 = commandLine0.getOptionValues(' ');
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String str12 = commandLine0.getOptionValue("", "hi!");
        boolean boolean14 = commandLine0.hasOption("");
        java.lang.String[] strArray16 = commandLine0.getOptionValues("");
        boolean boolean18 = commandLine0.hasOption('#');
        java.lang.Object obj20 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray22 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(strArray22);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String str11 = commandLine0.getOptionValue("");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.lang.String str14 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray16 = commandLine0.getOptionValues('4');
        java.lang.Object obj18 = commandLine0.getOptionObject("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.String str6 = commandLine0.getOptionValue(' ', "");
        boolean boolean8 = commandLine0.hasOption(' ');
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        java.lang.String str12 = commandLine0.getOptionValue(' ');
        java.lang.Object obj14 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray15 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('a');
        java.lang.String str12 = commandLine0.getOptionValue('a');
        java.util.List list13 = commandLine0.getArgList();
        java.lang.Object obj15 = commandLine0.getOptionObject('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("hi!");
        java.lang.Object obj8 = commandLine0.getOptionObject("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String str13 = commandLine0.getOptionValue(' ');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String str10 = commandLine0.getOptionValue('#');
        java.lang.String str12 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj14 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray9 = commandLine0.getOptionValues('#');
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        boolean boolean12 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray13 = commandLine0.getArgs();
        java.lang.String str16 = commandLine0.getOptionValue("hi!", "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        java.util.Iterator iterator10 = commandLine0.iterator();
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "hi!");
        boolean boolean15 = commandLine0.hasOption("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String[] strArray13 = commandLine0.getOptionValues("");
        commandLine0.addArg("hi!");
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
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String[] strArray8 = commandLine0.getOptionValues("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('#');
        commandLine0.addArg("hi!");
        java.lang.String str14 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.util.List list9 = commandLine0.getArgList();
        java.lang.String str11 = commandLine0.getOptionValue('a');
        java.util.List list12 = commandLine0.getArgList();
        java.lang.Class<?> wildcardClass13 = commandLine0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.util.List list8 = commandLine0.getArgList();
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String str12 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("hi!");
        java.lang.String str11 = commandLine0.getOptionValue('a', "hi!");
        java.lang.Object obj13 = commandLine0.getOptionObject("");
        java.lang.String str15 = commandLine0.getOptionValue("hi!");
        java.lang.String str17 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues(' ');
        boolean boolean4 = commandLine0.hasOption("");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue('#');
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str13 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray15 = commandLine0.getOptionValues('#');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.String str10 = commandLine0.getOptionValue('4');
        commandLine0.addArg("hi!");
        java.util.List list13 = commandLine0.getArgList();
        java.lang.String str15 = commandLine0.getOptionValue('#');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String str10 = commandLine0.getOptionValue("hi!", "");
        boolean boolean12 = commandLine0.hasOption("");
        java.util.Iterator iterator13 = commandLine0.iterator();
        java.lang.String str15 = commandLine0.getOptionValue("hi!");
        boolean boolean17 = commandLine0.hasOption(' ');
        java.lang.String[] strArray18 = commandLine0.getArgs();
        java.lang.String[] strArray20 = commandLine0.getOptionValues('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray20);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.util.List list9 = commandLine0.getArgList();
        java.lang.String[] strArray11 = commandLine0.getOptionValues('a');
        java.lang.Object obj13 = commandLine0.getOptionObject('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
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
        java.util.List list16 = commandLine0.getArgList();
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
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray9 = commandLine0.getOptionValues('#');
        java.lang.Object obj11 = commandLine0.getOptionObject(' ');
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray15 = commandLine0.getOptionValues('4');
        java.lang.String str18 = commandLine0.getOptionValue(' ', "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('4', "");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.util.List list12 = commandLine0.getArgList();
        java.lang.String[] strArray13 = commandLine0.getArgs();
        java.lang.String[] strArray15 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray17 = commandLine0.getOptionValues('4');
        java.lang.String[] strArray19 = commandLine0.getOptionValues('#');
        boolean boolean21 = commandLine0.hasOption("hi!");
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
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        boolean boolean8 = commandLine0.hasOption("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.util.Iterator iterator10 = commandLine0.iterator();
        boolean boolean12 = commandLine0.hasOption("");
        java.lang.String str15 = commandLine0.getOptionValue("", "");
        java.lang.Class<?> wildcardClass16 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
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
        java.lang.String[] strArray20 = commandLine0.getOptionValues("hi!");
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
        org.junit.Assert.assertNull(strArray20);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('#');
        java.lang.String[] strArray6 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String[] strArray9 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertArrayEquals(optionArray2, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        boolean boolean9 = commandLine0.hasOption('4');
        java.lang.String str11 = commandLine0.getOptionValue('4');
        java.util.List list12 = commandLine0.getArgList();
        java.lang.String str15 = commandLine0.getOptionValue('4', "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String str10 = commandLine0.getOptionValue("");
        java.lang.String[] strArray12 = commandLine0.getOptionValues('a');
        java.util.List list13 = commandLine0.getArgList();
        boolean boolean15 = commandLine0.hasOption('a');
        java.lang.Class<?> wildcardClass16 = commandLine0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
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
        java.lang.String str19 = commandLine0.getOptionValue("");
        java.lang.String str22 = commandLine0.getOptionValue("", "hi!");
        java.util.Iterator iterator23 = commandLine0.iterator();
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
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(iterator23);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        boolean boolean12 = commandLine0.hasOption('a');
        java.util.Iterator iterator13 = commandLine0.iterator();
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        boolean boolean16 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray12 = commandLine0.getOptionValues('a');
        java.lang.String str14 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray16 = commandLine0.getOptionValues("");
        boolean boolean18 = commandLine0.hasOption("");
        java.lang.String str21 = commandLine0.getOptionValue('4', "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        boolean boolean11 = commandLine0.hasOption("");
        boolean boolean13 = commandLine0.hasOption(' ');
        java.lang.Object obj15 = commandLine0.getOptionObject('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        boolean boolean13 = commandLine0.hasOption("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.util.Iterator iterator6 = commandLine0.iterator();
        commandLine0.addArg("hi!");
        boolean boolean10 = commandLine0.hasOption(' ');
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray15 = commandLine0.getOptions();
        java.util.List list16 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray15);
        org.junit.Assert.assertArrayEquals(optionArray15, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        boolean boolean7 = commandLine0.hasOption('a');
        java.lang.String[] strArray9 = commandLine0.getOptionValues("");
        boolean boolean11 = commandLine0.hasOption('#');
        java.lang.Object obj13 = commandLine0.getOptionObject("");
        java.lang.String[] strArray15 = commandLine0.getOptionValues("hi!");
        boolean boolean17 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        boolean boolean9 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        boolean boolean12 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray14 = commandLine0.getOptionValues("");
        java.lang.String str17 = commandLine0.getOptionValue('4', "hi!");
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
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
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
        java.lang.String[] strArray21 = commandLine0.getArgs();
        java.lang.String[] strArray23 = commandLine0.getOptionValues('a');
        java.lang.String str26 = commandLine0.getOptionValue("", "");
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
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.Class<?> wildcardClass10 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
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
        java.lang.String[] strArray24 = commandLine0.getOptionValues('a');
        boolean boolean26 = commandLine0.hasOption('4');
        java.lang.String[] strArray28 = commandLine0.getOptionValues(' ');
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
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(strArray28);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue("hi!");
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        java.lang.String[] strArray12 = commandLine0.getOptionValues('#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray12);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        boolean boolean8 = commandLine0.hasOption(' ');
        java.lang.String[] strArray10 = commandLine0.getOptionValues('4');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String str5 = commandLine0.getOptionValue("");
        boolean boolean7 = commandLine0.hasOption("hi!");
        java.lang.String str10 = commandLine0.getOptionValue("", "hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        java.lang.Object obj14 = commandLine0.getOptionObject('a');
        java.lang.Object obj16 = commandLine0.getOptionObject('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray12 = commandLine0.getOptionValues('a');
        java.lang.String str15 = commandLine0.getOptionValue('#', "hi!");
        java.lang.Object obj17 = commandLine0.getOptionObject('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String str11 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray13 = commandLine0.getOptionValues(' ');
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.util.Iterator iterator15 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.util.Iterator iterator7 = commandLine0.iterator();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.String str13 = commandLine0.getOptionValue("");
        java.lang.String[] strArray15 = commandLine0.getOptionValues('4');
        java.lang.String[] strArray17 = commandLine0.getOptionValues(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
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
        java.util.Iterator iterator26 = commandLine0.iterator();
        java.lang.Object obj28 = commandLine0.getOptionObject('a');
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
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
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
        boolean boolean21 = commandLine0.hasOption('#');
        boolean boolean23 = commandLine0.hasOption("hi!");
        java.lang.Object obj25 = commandLine0.getOptionObject("hi!");
        java.lang.Object obj27 = commandLine0.getOptionObject(' ');
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption("");
        java.lang.String str10 = commandLine0.getOptionValue("hi!");
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray3 = commandLine0.getOptions();
        java.lang.Object obj5 = commandLine0.getOptionObject('4');
        java.lang.String str8 = commandLine0.getOptionValue(' ', "");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        commandLine0.addArg("");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.util.Iterator iterator13 = commandLine0.iterator();
        org.apache.commons.cli.Option option14 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(optionArray3);
        org.junit.Assert.assertArrayEquals(optionArray3, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.Object obj10 = commandLine0.getOptionObject('a');
        commandLine0.addArg("hi!");
        java.lang.String str15 = commandLine0.getOptionValue('#', "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.lang.String str15 = commandLine0.getOptionValue('#', "");
        org.apache.commons.cli.Option[] optionArray16 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(optionArray16);
        org.junit.Assert.assertArrayEquals(optionArray16, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
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
        commandLine0.addArg("hi!");
        java.lang.String[] strArray20 = commandLine0.getOptionValues(' ');
        java.lang.String str23 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj25 = commandLine0.getOptionObject("");
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
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("");
        java.lang.String str16 = commandLine0.getOptionValue("", "");
        org.apache.commons.cli.Option[] optionArray17 = commandLine0.getOptions();
        java.util.List list18 = commandLine0.getArgList();
        java.lang.String str20 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(optionArray17);
        org.junit.Assert.assertArrayEquals(optionArray17, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.util.List list8 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        java.lang.String str10 = commandLine0.getOptionValue("", "");
        java.lang.String str13 = commandLine0.getOptionValue('a', "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        commandLine0.addArg("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        java.util.List list13 = commandLine0.getArgList();
        java.lang.String[] strArray15 = commandLine0.getOptionValues('a');
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.Object obj3 = commandLine0.getOptionObject(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        java.lang.Class<?> wildcardClass8 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        boolean boolean10 = commandLine0.hasOption('a');
        java.lang.String[] strArray11 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.String str16 = commandLine0.getOptionValue("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
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
        java.lang.String[] strArray18 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(optionArray16);
        org.junit.Assert.assertArrayEquals(optionArray16, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray18);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
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
        commandLine0.addArg("hi!");
        java.util.List list20 = commandLine0.getArgList();
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
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        boolean boolean10 = commandLine0.hasOption('a');
        java.util.List list11 = commandLine0.getArgList();
        java.lang.String str14 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str16 = commandLine0.getOptionValue(' ');
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        boolean boolean8 = commandLine0.hasOption(' ');
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
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
        java.lang.String str22 = commandLine0.getOptionValue("hi!");
        java.lang.String str25 = commandLine0.getOptionValue("", "");
        java.lang.String str27 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
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
        java.lang.Object obj21 = commandLine0.getOptionObject('#');
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
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
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
        java.lang.String str17 = commandLine0.getOptionValue("");
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
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        boolean boolean8 = commandLine0.hasOption("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.util.List list10 = commandLine0.getArgList();
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.lang.String[] strArray13 = commandLine0.getOptionValues('#');
        boolean boolean15 = commandLine0.hasOption('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
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
        java.lang.Object obj18 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String str5 = commandLine0.getOptionValue('a', "hi!");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String str8 = commandLine0.getOptionValue('a');
        java.lang.String[] strArray10 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('4');
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        commandLine0.addArg("hi!");
        boolean boolean12 = commandLine0.hasOption('4');
        java.lang.String[] strArray14 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str12 = commandLine0.getOptionValue("", "");
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        java.lang.String str17 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
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
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option option20 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option20);
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
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.util.List list8 = commandLine0.getArgList();
        java.util.Iterator iterator9 = commandLine0.iterator();
        boolean boolean11 = commandLine0.hasOption('a');
        java.lang.Object obj13 = commandLine0.getOptionObject('a');
        boolean boolean15 = commandLine0.hasOption("");
        java.util.List list16 = commandLine0.getArgList();
        java.lang.String str18 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray8 = commandLine0.getOptionValues(' ');
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String str12 = commandLine0.getOptionValue("", "hi!");
        boolean boolean14 = commandLine0.hasOption("");
        java.util.Iterator iterator15 = commandLine0.iterator();
        java.lang.Object obj17 = commandLine0.getOptionObject("hi!");
        boolean boolean19 = commandLine0.hasOption('a');
        boolean boolean21 = commandLine0.hasOption(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.util.List list8 = commandLine0.getArgList();
        boolean boolean10 = commandLine0.hasOption('4');
        java.lang.String[] strArray12 = commandLine0.getOptionValues('4');
        java.lang.String str14 = commandLine0.getOptionValue("");
        commandLine0.addArg("hi!");
        boolean boolean18 = commandLine0.hasOption(' ');
        boolean boolean20 = commandLine0.hasOption(' ');
        boolean boolean22 = commandLine0.hasOption("");
        java.lang.String str24 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        java.lang.String[] strArray4 = commandLine0.getOptionValues("hi!");
        java.lang.String str6 = commandLine0.getOptionValue("hi!");
        java.util.List list7 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertArrayEquals(optionArray2, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
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
        java.util.List list19 = commandLine0.getArgList();
        java.lang.String[] strArray21 = commandLine0.getOptionValues(' ');
        java.util.List list22 = commandLine0.getArgList();
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
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
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
        java.lang.String[] strArray26 = commandLine0.getOptionValues("");
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
        org.junit.Assert.assertNull(strArray26);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        java.util.List list12 = commandLine0.getArgList();
        java.lang.Object obj14 = commandLine0.getOptionObject("");
        java.lang.String str17 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
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
        java.util.Iterator iterator19 = commandLine0.iterator();
        java.lang.String str21 = commandLine0.getOptionValue("");
        java.lang.String[] strArray22 = commandLine0.getArgs();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "" });
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
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
        java.lang.String str25 = commandLine0.getOptionValue("");
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
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str9 = commandLine0.getOptionValue("");
        boolean boolean11 = commandLine0.hasOption('a');
        commandLine0.addArg("");
        java.lang.String[] strArray15 = commandLine0.getOptionValues('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
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
        commandLine0.addArg("");
        commandLine0.addArg("hi!");
        java.util.Iterator iterator20 = commandLine0.iterator();
        java.lang.String[] strArray22 = commandLine0.getOptionValues("");
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
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNull(strArray22);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        java.lang.String str12 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String[] strArray13 = commandLine0.getArgs();
        java.lang.String str16 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String[] strArray17 = commandLine0.getArgs();
        java.lang.String[] strArray19 = commandLine0.getOptionValues('4');
        java.lang.Class<?> wildcardClass20 = commandLine0.getClass();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.String str10 = commandLine0.getOptionValue('4');
        commandLine0.addArg("hi!");
        java.util.List list13 = commandLine0.getArgList();
        java.lang.Object obj15 = commandLine0.getOptionObject("");
        java.lang.String str18 = commandLine0.getOptionValue(' ', "");
        boolean boolean20 = commandLine0.hasOption('a');
        java.lang.String[] strArray22 = commandLine0.getOptionValues("hi!");
        java.lang.String str25 = commandLine0.getOptionValue(' ', "hi!");
        commandLine0.addArg("hi!");
        java.lang.String str29 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        boolean boolean12 = commandLine0.hasOption('a');
        java.lang.String str15 = commandLine0.getOptionValue(' ', "");
        java.lang.Object obj17 = commandLine0.getOptionObject('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String str12 = commandLine0.getOptionValue("");
        java.util.List list13 = commandLine0.getArgList();
        java.lang.String[] strArray15 = commandLine0.getOptionValues('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
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
        boolean boolean15 = commandLine0.hasOption('#');
        java.lang.String str17 = commandLine0.getOptionValue("hi!");
        org.apache.commons.cli.Option[] optionArray18 = commandLine0.getOptions();
        java.lang.String[] strArray20 = commandLine0.getOptionValues("");
        java.lang.String str22 = commandLine0.getOptionValue("");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(optionArray18);
        org.junit.Assert.assertArrayEquals(optionArray18, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.lang.String[] strArray13 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.util.Iterator iterator16 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
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
        java.util.Iterator iterator17 = commandLine0.iterator();
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
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.Iterator iterator5 = commandLine0.iterator();
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray9 = commandLine0.getOptionValues('#');
        java.lang.String[] strArray11 = commandLine0.getOptionValues(' ');
        java.lang.String str13 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String str9 = commandLine0.getOptionValue("hi!");
        java.lang.String str12 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.Object obj14 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("hi!");
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str15 = commandLine0.getOptionValue('a');
        java.util.Iterator iterator16 = commandLine0.iterator();
        java.lang.String[] strArray18 = commandLine0.getOptionValues("");
        java.lang.Object obj20 = commandLine0.getOptionObject('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray12 = commandLine0.getOptionValues('a');
        java.lang.String str14 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray15 = commandLine0.getArgs();
        java.lang.String[] strArray17 = commandLine0.getOptionValues("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String str10 = commandLine0.getOptionValue("");
        java.lang.Object obj12 = commandLine0.getOptionObject('4');
        java.lang.String str15 = commandLine0.getOptionValue("", "");
        java.lang.String str17 = commandLine0.getOptionValue('#');
        java.lang.String str20 = commandLine0.getOptionValue("", "");
        org.apache.commons.cli.Option option21 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.util.Iterator iterator6 = commandLine0.iterator();
        commandLine0.addArg("hi!");
        boolean boolean10 = commandLine0.hasOption(' ');
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        boolean boolean16 = commandLine0.hasOption("hi!");
        java.lang.Object obj18 = commandLine0.getOptionObject('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue('#', "hi!");
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.lang.String str12 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj14 = commandLine0.getOptionObject('a');
        commandLine0.addArg("hi!");
        java.lang.String str19 = commandLine0.getOptionValue('4', "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.lang.String str8 = commandLine0.getOptionValue('4');
        java.lang.String str10 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        boolean boolean14 = commandLine0.hasOption("");
        java.lang.String str16 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String str9 = commandLine0.getOptionValue('a', "");
        java.util.List list10 = commandLine0.getArgList();
        java.lang.Object obj12 = commandLine0.getOptionObject("");
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.util.List list9 = commandLine0.getArgList();
        java.lang.Object obj11 = commandLine0.getOptionObject("");
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
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        java.lang.String[] strArray10 = commandLine0.getArgs();
        java.lang.String[] strArray12 = commandLine0.getOptionValues('a');
        commandLine0.addArg("");
        java.lang.String str16 = commandLine0.getOptionValue('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
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
        boolean boolean18 = commandLine0.hasOption(' ');
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.String str13 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        boolean boolean17 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.util.List list10 = commandLine0.getArgList();
        java.lang.String str12 = commandLine0.getOptionValue('a');
        java.lang.Object obj14 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray16 = commandLine0.getOptionValues("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.String str11 = commandLine0.getOptionValue("", "hi!");
        boolean boolean13 = commandLine0.hasOption(' ');
        java.lang.String str16 = commandLine0.getOptionValue("hi!", "hi!");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String str10 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strArray12);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.String[] strArray8 = commandLine0.getOptionValues('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.util.List list8 = commandLine0.getArgList();
        java.util.Iterator iterator9 = commandLine0.iterator();
        boolean boolean11 = commandLine0.hasOption('a');
        java.util.List list12 = commandLine0.getArgList();
        java.lang.String[] strArray14 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray16 = commandLine0.getOptionValues("");
        java.lang.Object obj18 = commandLine0.getOptionObject(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String str10 = commandLine0.getOptionValue("hi!", "");
        commandLine0.addArg("");
        java.util.Iterator iterator13 = commandLine0.iterator();
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option[] optionArray16 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(optionArray16);
        org.junit.Assert.assertArrayEquals(optionArray16, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String str11 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj15 = commandLine0.getOptionObject(' ');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
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
        java.lang.Object obj18 = commandLine0.getOptionObject('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.Iterator iterator5 = commandLine0.iterator();
        java.lang.Object obj7 = commandLine0.getOptionObject('4');
        java.lang.String str9 = commandLine0.getOptionValue("");
        java.lang.String[] strArray10 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String str13 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray15 = commandLine0.getOptionValues('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.Iterator iterator5 = commandLine0.iterator();
        commandLine0.addArg("hi!");
        boolean boolean9 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str10 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj12 = commandLine0.getOptionObject('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = obj12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
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
        java.lang.String str20 = commandLine0.getOptionValue("", "");
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
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue("", "hi!");
        boolean boolean10 = commandLine0.hasOption("");
        java.lang.String str13 = commandLine0.getOptionValue('a', "");
        java.util.List list14 = commandLine0.getArgList();
        java.lang.String str16 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("hi!");
        java.lang.String str8 = commandLine0.getOptionValue("");
        java.lang.String str11 = commandLine0.getOptionValue("", "hi!");
        java.lang.Object obj13 = commandLine0.getOptionObject("");
        commandLine0.addArg("");
        java.lang.String[] strArray16 = commandLine0.getArgs();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "" });
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "");
        boolean boolean13 = commandLine0.hasOption("");
        java.lang.String[] strArray15 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray17 = commandLine0.getOptionValues('a');
        commandLine0.addArg("hi!");
        java.lang.String str22 = commandLine0.getOptionValue('#', "hi!");
        java.lang.String[] strArray23 = commandLine0.getArgs();
        java.lang.String[] strArray24 = commandLine0.getArgs();
        java.util.Iterator iterator25 = commandLine0.iterator();
        java.lang.Object obj27 = commandLine0.getOptionObject("");
        java.lang.String str29 = commandLine0.getOptionValue('4');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String[] strArray10 = commandLine0.getArgs();
        java.util.List list11 = commandLine0.getArgList();
        java.lang.String str14 = commandLine0.getOptionValue("", "hi!");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        commandLine0.addArg("hi!");
        java.lang.String[] strArray13 = commandLine0.getOptionValues('4');
        java.lang.String str15 = commandLine0.getOptionValue("hi!");
        java.util.Iterator iterator16 = commandLine0.iterator();
        java.lang.String str19 = commandLine0.getOptionValue('4', "");
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.Object obj9 = commandLine0.getOptionObject("hi!");
        java.lang.String str12 = commandLine0.getOptionValue(' ', "");
        java.lang.String[] strArray14 = commandLine0.getOptionValues('4');
        org.apache.commons.cli.Option[] optionArray15 = commandLine0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(optionArray15);
        org.junit.Assert.assertArrayEquals(optionArray15, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
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
        java.lang.String[] strArray18 = commandLine0.getArgs();
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
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
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
        commandLine0.addArg("");
        java.lang.Object obj18 = commandLine0.getOptionObject('a');
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
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
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
        java.lang.String[] strArray17 = commandLine0.getOptionValues('#');
        commandLine0.addArg("");
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
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        boolean boolean12 = commandLine0.hasOption("");
        java.lang.Object obj14 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
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
        java.lang.String[] strArray19 = commandLine0.getOptionValues('a');
        java.lang.String str21 = commandLine0.getOptionValue("");
        java.lang.Class<?> wildcardClass22 = commandLine0.getClass();
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
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        boolean boolean6 = commandLine0.hasOption("");
        java.lang.String str9 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str12 = commandLine0.getOptionValue(' ', "");
        java.util.List list13 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.util.Iterator iterator10 = commandLine0.iterator();
        java.lang.String[] strArray11 = commandLine0.getArgs();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        boolean boolean11 = commandLine0.hasOption("");
        boolean boolean13 = commandLine0.hasOption(' ');
        java.lang.String[] strArray14 = commandLine0.getArgs();
        java.lang.String str17 = commandLine0.getOptionValue('a', "");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.util.List list9 = commandLine0.getArgList();
        java.lang.String str12 = commandLine0.getOptionValue('#', "hi!");
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.lang.String[] strArray15 = commandLine0.getOptionValues('#');
        java.lang.String str17 = commandLine0.getOptionValue("hi!");
        java.lang.String str20 = commandLine0.getOptionValue('#', "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String[] strArray8 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String str12 = commandLine0.getOptionValue('4', "");
        java.lang.String str15 = commandLine0.getOptionValue("hi!", "");
        boolean boolean17 = commandLine0.hasOption('a');
        org.apache.commons.cli.Option option18 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        boolean boolean7 = commandLine0.hasOption("");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.Object obj10 = commandLine0.getOptionObject('a');
        java.lang.String str13 = commandLine0.getOptionValue(' ', "hi!");
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        java.util.List list15 = commandLine0.getArgList();
        java.lang.String str18 = commandLine0.getOptionValue("hi!", "");
        java.lang.String[] strArray20 = commandLine0.getOptionValues('#');
        java.lang.Object obj22 = commandLine0.getOptionObject("");
        java.lang.String str25 = commandLine0.getOptionValue('a', "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.Iterator iterator5 = commandLine0.iterator();
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray9 = commandLine0.getOptionValues('#');
        java.lang.String[] strArray11 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray13 = commandLine0.getOptionValues("");
        java.lang.Object obj15 = commandLine0.getOptionObject('4');
        boolean boolean17 = commandLine0.hasOption(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        boolean boolean9 = commandLine0.hasOption("hi!");
        boolean boolean11 = commandLine0.hasOption('4');
        java.lang.String str13 = commandLine0.getOptionValue("");
        java.lang.String[] strArray15 = commandLine0.getOptionValues('a');
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('4', "");
        boolean boolean12 = commandLine0.hasOption("");
        java.lang.Object obj14 = commandLine0.getOptionObject('a');
        boolean boolean16 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray18 = commandLine0.getOptionValues("");
        boolean boolean20 = commandLine0.hasOption("hi!");
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
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        java.lang.String str8 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        boolean boolean12 = commandLine0.hasOption(' ');
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
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
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
        java.util.Iterator iterator15 = commandLine0.iterator();
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
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('#');
        java.lang.String[] strArray6 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertArrayEquals(optionArray2, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
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
        org.apache.commons.cli.Option[] optionArray15 = commandLine0.getOptions();
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
        org.junit.Assert.assertNotNull(optionArray15);
        org.junit.Assert.assertArrayEquals(optionArray15, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        boolean boolean8 = commandLine0.hasOption("hi!");
        commandLine0.addArg("hi!");
        java.util.List list11 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str10 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj12 = commandLine0.getOptionObject('a');
        commandLine0.addArg("hi!");
        java.lang.String str16 = commandLine0.getOptionValue('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String str13 = commandLine0.getOptionValue('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("hi!");
        java.lang.String str8 = commandLine0.getOptionValue("");
        boolean boolean10 = commandLine0.hasOption("");
        java.lang.String[] strArray12 = commandLine0.getOptionValues('#');
        java.lang.String str14 = commandLine0.getOptionValue("");
        java.lang.String[] strArray16 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str12 = commandLine0.getOptionValue("", "");
        commandLine0.addArg("");
        java.lang.String str16 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        java.lang.String str8 = commandLine0.getOptionValue('#');
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.lang.String str13 = commandLine0.getOptionValue("", "");
        java.lang.Object obj15 = commandLine0.getOptionObject("");
        org.apache.commons.cli.Option[] optionArray16 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(optionArray16);
        org.junit.Assert.assertArrayEquals(optionArray16, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues(' ');
        boolean boolean4 = commandLine0.hasOption("");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue('#');
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("hi!");
        boolean boolean12 = commandLine0.hasOption("");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.String str10 = commandLine0.getOptionValue('4');
        commandLine0.addArg("hi!");
        java.util.List list13 = commandLine0.getArgList();
        java.lang.Object obj15 = commandLine0.getOptionObject("");
        java.lang.String str18 = commandLine0.getOptionValue(' ', "");
        java.util.List list19 = commandLine0.getArgList();
        java.lang.String str22 = commandLine0.getOptionValue("", "hi!");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
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
        java.lang.Object obj25 = commandLine0.getOptionObject("hi!");
        org.apache.commons.cli.Option[] optionArray26 = commandLine0.getOptions();
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
        org.junit.Assert.assertNotNull(optionArray26);
        org.junit.Assert.assertArrayEquals(optionArray26, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.util.Iterator iterator3 = commandLine0.iterator();
        boolean boolean5 = commandLine0.hasOption(' ');
        java.lang.String str8 = commandLine0.getOptionValue("", "");
        boolean boolean10 = commandLine0.hasOption("");
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String str9 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj11 = commandLine0.getOptionObject(' ');
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.lang.Class<?> wildcardClass13 = optionArray12.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.util.List list8 = commandLine0.getArgList();
        java.util.Iterator iterator9 = commandLine0.iterator();
        boolean boolean11 = commandLine0.hasOption('a');
        java.util.List list12 = commandLine0.getArgList();
        java.lang.String[] strArray14 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray16 = commandLine0.getOptionValues("");
        boolean boolean18 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String str10 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String str12 = commandLine0.getOptionValue('a');
        java.lang.String str15 = commandLine0.getOptionValue("", "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String str10 = commandLine0.getOptionValue("");
        java.lang.String[] strArray11 = commandLine0.getArgs();
        java.lang.String str13 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.util.Iterator iterator12 = commandLine0.iterator();
        java.util.Iterator iterator13 = commandLine0.iterator();
        java.lang.String str15 = commandLine0.getOptionValue('a');
        java.lang.Object obj17 = commandLine0.getOptionObject(' ');
        java.lang.String str19 = commandLine0.getOptionValue("");
        java.lang.String[] strArray20 = commandLine0.getArgs();
        java.lang.String[] strArray21 = commandLine0.getArgs();
        java.lang.String str23 = commandLine0.getOptionValue('a');
        org.apache.commons.cli.Option option24 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option24);
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
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        java.lang.String str8 = commandLine0.getOptionValue('#');
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.lang.Object obj12 = commandLine0.getOptionObject('#');
        java.lang.String str15 = commandLine0.getOptionValue("", "");
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String str9 = commandLine0.getOptionValue('#');
        java.lang.String str11 = commandLine0.getOptionValue('a');
        java.lang.String str13 = commandLine0.getOptionValue("hi!");
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.String[] strArray16 = commandLine0.getOptionValues(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.util.List list11 = commandLine0.getArgList();
        boolean boolean13 = commandLine0.hasOption('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray3 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        java.util.List list6 = commandLine0.getArgList();
        boolean boolean8 = commandLine0.hasOption('a');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String str13 = commandLine0.getOptionValue('4', "hi!");
        java.lang.String str15 = commandLine0.getOptionValue(' ');
        commandLine0.addArg("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(optionArray3);
        org.junit.Assert.assertArrayEquals(optionArray3, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.lang.String[] strArray13 = commandLine0.getArgs();
        java.lang.String str16 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj18 = commandLine0.getOptionObject("");
        java.lang.String[] strArray19 = commandLine0.getArgs();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        boolean boolean11 = commandLine0.hasOption("");
        boolean boolean13 = commandLine0.hasOption('a');
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.lang.String str11 = commandLine0.getOptionValue('4', "");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray15 = commandLine0.getOptionValues(' ');
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
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        java.util.Iterator iterator12 = commandLine0.iterator();
        java.lang.Class<?> wildcardClass13 = iterator12.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String str9 = commandLine0.getOptionValue('#', "");
        java.lang.String str11 = commandLine0.getOptionValue('4');
        java.lang.Object obj13 = commandLine0.getOptionObject('4');
        java.lang.Object obj15 = commandLine0.getOptionObject("hi!");
        java.lang.Object obj17 = commandLine0.getOptionObject('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
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
        commandLine0.addArg("");
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option[] optionArray20 = commandLine0.getOptions();
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
        org.junit.Assert.assertNotNull(optionArray20);
        org.junit.Assert.assertArrayEquals(optionArray20, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.Object obj11 = commandLine0.getOptionObject("");
        boolean boolean13 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        java.util.List list15 = commandLine0.getArgList();
        java.lang.String[] strArray17 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray19 = commandLine0.getOptionValues('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(strArray19);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
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
        java.lang.String[] strArray25 = commandLine0.getOptionValues(' ');
        java.util.List list26 = commandLine0.getArgList();
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
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String str11 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray13 = commandLine0.getOptionValues(' ');
        java.lang.String str16 = commandLine0.getOptionValue('#', "");
        boolean boolean18 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option[] optionArray19 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(optionArray19);
        org.junit.Assert.assertArrayEquals(optionArray19, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
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
        java.util.List list16 = commandLine0.getArgList();
        java.lang.String[] strArray17 = commandLine0.getArgs();
        java.lang.String str19 = commandLine0.getOptionValue("");
        java.lang.Object obj21 = commandLine0.getOptionObject("");
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
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        commandLine0.addArg("hi!");
        java.lang.String str12 = commandLine0.getOptionValue('a');
        boolean boolean14 = commandLine0.hasOption('#');
        java.lang.String[] strArray16 = commandLine0.getOptionValues('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        boolean boolean10 = commandLine0.hasOption("");
        java.lang.String[] strArray11 = commandLine0.getArgs();
        java.lang.Object obj13 = commandLine0.getOptionObject("");
        java.lang.String str15 = commandLine0.getOptionValue('#');
        java.util.List list16 = commandLine0.getArgList();
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        java.util.List list9 = commandLine0.getArgList();
        java.lang.String[] strArray10 = commandLine0.getArgs();
        java.lang.Object obj12 = commandLine0.getOptionObject('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.lang.String str8 = commandLine0.getOptionValue("", "hi!");
        boolean boolean10 = commandLine0.hasOption('#');
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.lang.Object obj13 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option option14 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray8 = commandLine0.getOptionValues(' ');
        commandLine0.addArg("");
        boolean boolean12 = commandLine0.hasOption("");
        java.lang.Object obj14 = commandLine0.getOptionObject("hi!");
        java.lang.Object obj16 = commandLine0.getOptionObject("hi!");
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        boolean boolean4 = commandLine0.hasOption('#');
        commandLine0.addArg("");
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        boolean boolean9 = commandLine0.hasOption('a');
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        boolean boolean12 = commandLine0.hasOption(' ');
        java.lang.String str14 = commandLine0.getOptionValue("hi!");
        java.util.Iterator iterator15 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String str12 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj14 = commandLine0.getOptionObject('#');
        java.lang.String str16 = commandLine0.getOptionValue('#');
        java.lang.Object obj18 = commandLine0.getOptionObject("hi!");
        org.apache.commons.cli.Option[] optionArray19 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(optionArray19);
        org.junit.Assert.assertArrayEquals(optionArray19, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.String str8 = commandLine0.getOptionValue("");
        java.lang.Object obj10 = commandLine0.getOptionObject('#');
        java.lang.Object obj12 = commandLine0.getOptionObject("");
        java.lang.String str15 = commandLine0.getOptionValue("hi!", "");
        org.apache.commons.cli.Option[] optionArray16 = commandLine0.getOptions();
        java.lang.String str19 = commandLine0.getOptionValue(' ', "");
        java.util.Iterator iterator20 = commandLine0.iterator();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(iterator20);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "");
        commandLine0.addArg("");
        java.lang.String[] strArray15 = commandLine0.getOptionValues("");
        java.lang.Object obj17 = commandLine0.getOptionObject("hi!");
        boolean boolean19 = commandLine0.hasOption(' ');
        java.util.Iterator iterator20 = commandLine0.iterator();
        java.lang.String str23 = commandLine0.getOptionValue("hi!", "hi!");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str12 = commandLine0.getOptionValue("", "");
        commandLine0.addArg("hi!");
        boolean boolean16 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray18 = commandLine0.getOptionValues("");
        java.util.Iterator iterator19 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNotNull(iterator19);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        boolean boolean10 = commandLine0.hasOption("");
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str16 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj18 = commandLine0.getOptionObject('a');
        java.util.List list19 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String str5 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.lang.String[] strArray8 = commandLine0.getOptionValues('a');
        java.lang.String str10 = commandLine0.getOptionValue('a');
        java.lang.Object obj12 = commandLine0.getOptionObject(' ');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.util.List list9 = commandLine0.getArgList();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        boolean boolean12 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        commandLine0.addArg("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        java.util.List list13 = commandLine0.getArgList();
        java.lang.String[] strArray15 = commandLine0.getOptionValues('a');
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
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        java.lang.String str7 = commandLine0.getOptionValue(' ', "hi!");
        boolean boolean9 = commandLine0.hasOption("");
        java.util.List list10 = commandLine0.getArgList();
        java.lang.String str13 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String[] strArray15 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
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
        commandLine0.addArg("");
        java.lang.String str24 = commandLine0.getOptionValue('#', "");
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.Object obj11 = commandLine0.getOptionObject('a');
        java.lang.Object obj13 = commandLine0.getOptionObject('4');
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
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String[] strArray9 = commandLine0.getOptionValues(' ');
        java.lang.Object obj11 = commandLine0.getOptionObject('4');
        java.lang.String str13 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String str10 = commandLine0.getOptionValue('a', "hi!");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.util.List list12 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
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
        java.lang.String[] strArray25 = commandLine0.getOptionValues("");
        commandLine0.addArg("");
        java.lang.Class<?> wildcardClass28 = commandLine0.getClass();
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
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues('#');
        java.util.List list13 = commandLine0.getArgList();
        java.lang.Object obj15 = commandLine0.getOptionObject(' ');
        boolean boolean17 = commandLine0.hasOption('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue("", "hi!");
        boolean boolean10 = commandLine0.hasOption("");
        java.lang.String str13 = commandLine0.getOptionValue('4', "hi!");
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        java.lang.String[] strArray16 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String[] strArray6 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.String[] strArray9 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.util.List list8 = commandLine0.getArgList();
        boolean boolean10 = commandLine0.hasOption("");
        boolean boolean12 = commandLine0.hasOption('4');
        java.lang.Object obj14 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        boolean boolean11 = commandLine0.hasOption("hi!");
        java.util.List list12 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        boolean boolean7 = commandLine0.hasOption("");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.Object obj10 = commandLine0.getOptionObject('4');
        boolean boolean12 = commandLine0.hasOption(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.util.List list10 = commandLine0.getArgList();
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        commandLine0.addArg("");
        java.lang.String str16 = commandLine0.getOptionValue('a');
        java.util.Iterator iterator17 = commandLine0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        java.lang.String str12 = commandLine0.getOptionValue('#', "hi!");
        boolean boolean14 = commandLine0.hasOption(' ');
        java.util.List list15 = commandLine0.getArgList();
        java.lang.String[] strArray16 = commandLine0.getArgs();
        java.lang.String str19 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str22 = commandLine0.getOptionValue('a', "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
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
        java.lang.String str21 = commandLine0.getOptionValue('4');
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
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('a');
        boolean boolean4 = commandLine0.hasOption(' ');
        boolean boolean6 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option option7 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.lang.String str11 = commandLine0.getOptionValue('4', "");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        java.lang.String str16 = commandLine0.getOptionValue('#', "");
        commandLine0.addArg("hi!");
        boolean boolean20 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String str13 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.lang.String str18 = commandLine0.getOptionValue(' ', "");
        java.lang.String[] strArray20 = commandLine0.getOptionValues(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(strArray20);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String str5 = commandLine0.getOptionValue('a', "hi!");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String str8 = commandLine0.getOptionValue('a');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray11 = commandLine0.getArgs();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String str10 = commandLine0.getOptionValue("");
        commandLine0.addArg("hi!");
        boolean boolean14 = commandLine0.hasOption(' ');
        java.util.List list15 = commandLine0.getArgList();
        java.lang.Class<?> wildcardClass16 = list15.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('4');
        java.lang.String[] strArray7 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        boolean boolean10 = commandLine0.hasOption('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String[] strArray11 = commandLine0.getArgs();
        java.lang.Class<?> wildcardClass12 = strArray11.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.Object obj11 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray14 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
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
        boolean boolean17 = commandLine0.hasOption('#');
        org.apache.commons.cli.Option[] optionArray18 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray19 = commandLine0.getOptions();
        java.lang.String[] strArray20 = commandLine0.getArgs();
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
        org.junit.Assert.assertNotNull(optionArray18);
        org.junit.Assert.assertArrayEquals(optionArray18, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray19);
        org.junit.Assert.assertArrayEquals(optionArray19, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "" });
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.util.List list8 = commandLine0.getArgList();
        boolean boolean10 = commandLine0.hasOption("");
        java.util.Iterator iterator11 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        java.lang.String[] strArray7 = commandLine0.getArgs();
        java.lang.String[] strArray9 = commandLine0.getOptionValues('4');
        java.lang.String[] strArray11 = commandLine0.getOptionValues(' ');
        boolean boolean13 = commandLine0.hasOption('#');
        java.util.List list14 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.String[] strArray10 = commandLine0.getOptionValues('#');
        boolean boolean12 = commandLine0.hasOption('#');
        java.lang.String str15 = commandLine0.getOptionValue("", "");
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
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String[] strArray6 = commandLine0.getOptionValues("");
        java.lang.String str9 = commandLine0.getOptionValue('4', "");
        java.util.List list10 = commandLine0.getArgList();
        java.lang.Class<?> wildcardClass11 = list10.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str12 = commandLine0.getOptionValue("", "");
        commandLine0.addArg("hi!");
        boolean boolean16 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray18 = commandLine0.getOptionValues("");
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(strArray18);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.Object obj10 = commandLine0.getOptionObject('a');
        java.lang.Object obj12 = commandLine0.getOptionObject("hi!");
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
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
        java.util.List list17 = commandLine0.getArgList();
        boolean boolean19 = commandLine0.hasOption('4');
        boolean boolean21 = commandLine0.hasOption('#');
        java.lang.Object obj23 = commandLine0.getOptionObject(' ');
        java.lang.String[] strArray25 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(strArray25);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray12 = commandLine0.getOptionValues('a');
        java.lang.String str14 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray15 = commandLine0.getArgs();
        boolean boolean17 = commandLine0.hasOption("hi!");
        java.lang.String str19 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String str8 = commandLine0.getOptionValue('a');
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String str11 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
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
        java.util.List list19 = commandLine0.getArgList();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        boolean boolean14 = commandLine0.hasOption('4');
        boolean boolean16 = commandLine0.hasOption("hi!");
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
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
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
        boolean boolean17 = commandLine0.hasOption('a');
        java.util.Iterator iterator18 = commandLine0.iterator();
        java.lang.String str20 = commandLine0.getOptionValue("");
        java.lang.Object obj22 = commandLine0.getOptionObject(' ');
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
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
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
        java.lang.String str18 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj20 = commandLine0.getOptionObject('a');
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
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.Object obj12 = commandLine0.getOptionObject('4');
        java.lang.Object obj14 = commandLine0.getOptionObject("hi!");
        java.lang.Object obj16 = commandLine0.getOptionObject("");
        commandLine0.addArg("hi!");
        java.lang.String str21 = commandLine0.getOptionValue("", "");
        java.util.List list22 = commandLine0.getArgList();
        java.lang.String str25 = commandLine0.getOptionValue("", "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
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
        java.lang.String[] strArray22 = commandLine0.getOptionValues('#');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(strArray22);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray11 = commandLine0.getArgs();
        java.lang.Object obj13 = commandLine0.getOptionObject('4');
        java.lang.String str15 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        java.lang.String str12 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String[] strArray13 = commandLine0.getArgs();
        java.lang.Object obj15 = commandLine0.getOptionObject(' ');
        java.lang.Object obj17 = commandLine0.getOptionObject('4');
        java.lang.String str20 = commandLine0.getOptionValue("", "");
        java.lang.String str23 = commandLine0.getOptionValue('a', "hi!");
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
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.String str10 = commandLine0.getOptionValue('4', "");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj14 = commandLine0.getOptionObject(' ');
        java.util.List list15 = commandLine0.getArgList();
        java.lang.String str17 = commandLine0.getOptionValue(' ');
        boolean boolean19 = commandLine0.hasOption("");
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
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
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
        java.lang.String[] strArray17 = commandLine0.getOptionValues("");
        java.lang.String str19 = commandLine0.getOptionValue('4');
        boolean boolean21 = commandLine0.hasOption('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray8 = commandLine0.getOptionValues(' ');
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        boolean boolean12 = commandLine0.hasOption("hi!");
        java.lang.Object obj14 = commandLine0.getOptionObject('4');
        java.lang.String[] strArray16 = commandLine0.getOptionValues("");
        java.lang.String str18 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        boolean boolean10 = commandLine0.hasOption('a');
        java.lang.String[] strArray11 = commandLine0.getArgs();
        boolean boolean13 = commandLine0.hasOption(' ');
        java.lang.String[] strArray14 = commandLine0.getArgs();
        java.lang.String[] strArray15 = commandLine0.getArgs();
        java.util.List list16 = commandLine0.getArgList();
        java.lang.String[] strArray18 = commandLine0.getOptionValues('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(strArray18);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.String str8 = commandLine0.getOptionValue(' ');
        java.lang.String str10 = commandLine0.getOptionValue("hi!");
        boolean boolean12 = commandLine0.hasOption("hi!");
        java.util.List list13 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        boolean boolean9 = commandLine0.hasOption('a');
        java.util.Iterator iterator10 = commandLine0.iterator();
        java.util.Iterator iterator11 = commandLine0.iterator();
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        boolean boolean14 = commandLine0.hasOption("hi!");
        java.util.Iterator iterator15 = commandLine0.iterator();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray19 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNull(strArray19);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        java.lang.String str12 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String str15 = commandLine0.getOptionValue('#', "hi!");
        boolean boolean17 = commandLine0.hasOption("");
        java.util.List list18 = commandLine0.getArgList();
        java.lang.String str21 = commandLine0.getOptionValue('#', "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        java.lang.String str12 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String[] strArray13 = commandLine0.getArgs();
        java.lang.String str16 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String[] strArray17 = commandLine0.getArgs();
        java.lang.Object obj19 = commandLine0.getOptionObject(' ');
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.util.List list8 = commandLine0.getArgList();
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "hi!");
        commandLine0.addArg("hi!");
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String str11 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray13 = commandLine0.getOptionValues(' ');
        java.lang.Object obj15 = commandLine0.getOptionObject(' ');
        java.lang.String str17 = commandLine0.getOptionValue('a');
        boolean boolean19 = commandLine0.hasOption(' ');
        java.lang.Object obj21 = commandLine0.getOptionObject("");
        java.util.Iterator iterator22 = commandLine0.iterator();
        java.lang.Object obj24 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.String str10 = commandLine0.getOptionValue('#');
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        boolean boolean13 = commandLine0.hasOption("");
        java.lang.String str16 = commandLine0.getOptionValue('4', "hi!");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray9 = commandLine0.getOptionValues('#');
        java.lang.String str12 = commandLine0.getOptionValue('a', "");
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.lang.Object obj15 = commandLine0.getOptionObject("hi!");
        org.apache.commons.cli.Option[] optionArray16 = commandLine0.getOptions();
        boolean boolean18 = commandLine0.hasOption("");
        java.lang.String str21 = commandLine0.getOptionValue("", "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(optionArray16);
        org.junit.Assert.assertArrayEquals(optionArray16, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        java.util.List list12 = commandLine0.getArgList();
        java.lang.Object obj14 = commandLine0.getOptionObject("");
        java.lang.String str17 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray18 = commandLine0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(optionArray18);
        org.junit.Assert.assertArrayEquals(optionArray18, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.Object obj13 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray14 = commandLine0.getArgs();
        java.lang.String str17 = commandLine0.getOptionValue('4', "");
        boolean boolean19 = commandLine0.hasOption("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.util.Iterator iterator7 = commandLine0.iterator();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        boolean boolean10 = commandLine0.hasOption("");
        java.lang.String str12 = commandLine0.getOptionValue('a');
        java.lang.String[] strArray14 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.String str12 = commandLine0.getOptionValue(' ');
        java.util.Iterator iterator13 = commandLine0.iterator();
        commandLine0.addArg("");
        boolean boolean17 = commandLine0.hasOption(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String str5 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.lang.String str9 = commandLine0.getOptionValue('4', "hi!");
        java.lang.String str12 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String str15 = commandLine0.getOptionValue(' ', "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
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
        java.lang.Object obj22 = commandLine0.getOptionObject("hi!");
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
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
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
        java.lang.Object obj21 = commandLine0.getOptionObject(' ');
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
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.util.List list8 = commandLine0.getArgList();
        boolean boolean10 = commandLine0.hasOption("");
        boolean boolean12 = commandLine0.hasOption('4');
        java.lang.String str14 = commandLine0.getOptionValue("");
        java.lang.Object obj16 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray18 = commandLine0.getOptionValues(' ');
        java.lang.Object obj20 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.Object obj13 = commandLine0.getOptionObject(' ');
        java.lang.String str16 = commandLine0.getOptionValue("", "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.Iterator iterator5 = commandLine0.iterator();
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String str9 = commandLine0.getOptionValue("hi!", "");
        boolean boolean11 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.lang.Class<?> wildcardClass13 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.String str8 = commandLine0.getOptionValue("");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.util.List list10 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('4');
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String[] strArray9 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj11 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray13 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray15 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray16 = commandLine0.getArgs();
        boolean boolean18 = commandLine0.hasOption("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.lang.String str11 = commandLine0.getOptionValue('a', "");
        java.lang.String str13 = commandLine0.getOptionValue(' ');
        java.lang.Object obj15 = commandLine0.getOptionObject('#');
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
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String str8 = commandLine0.getOptionValue('a');
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String str13 = commandLine0.getOptionValue("", "hi!");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        commandLine0.addArg("");
        java.lang.String[] strArray11 = commandLine0.getOptionValues('4');
        java.lang.String str14 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.Object obj16 = commandLine0.getOptionObject("hi!");
        org.apache.commons.cli.Option[] optionArray17 = commandLine0.getOptions();
        boolean boolean19 = commandLine0.hasOption('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(optionArray17);
        org.junit.Assert.assertArrayEquals(optionArray17, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
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
        java.lang.String str18 = commandLine0.getOptionValue("");
        java.lang.String[] strArray20 = commandLine0.getOptionValues(' ');
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
        org.junit.Assert.assertNull(strArray20);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
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
        org.apache.commons.cli.Option[] optionArray21 = commandLine0.getOptions();
        java.lang.String str24 = commandLine0.getOptionValue('#', "hi!");
        java.util.Iterator iterator25 = commandLine0.iterator();
        java.lang.String[] strArray27 = commandLine0.getOptionValues('4');
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
        org.junit.Assert.assertNotNull(optionArray21);
        org.junit.Assert.assertArrayEquals(optionArray21, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNull(strArray27);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("hi!");
        java.lang.String str8 = commandLine0.getOptionValue("");
        boolean boolean10 = commandLine0.hasOption("");
        java.lang.String[] strArray12 = commandLine0.getOptionValues('#');
        java.lang.String str14 = commandLine0.getOptionValue("");
        java.lang.Class<?> wildcardClass15 = commandLine0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.Iterator iterator5 = commandLine0.iterator();
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        boolean boolean9 = commandLine0.hasOption("");
        java.lang.String str11 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.lang.String[] strArray14 = commandLine0.getOptionValues('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        boolean boolean12 = commandLine0.hasOption('4');
        java.lang.String[] strArray14 = commandLine0.getOptionValues('4');
        java.lang.String str17 = commandLine0.getOptionValue('#', "");
        commandLine0.addArg("hi!");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.lang.Object obj14 = commandLine0.getOptionObject("");
        java.lang.String[] strArray16 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj18 = commandLine0.getOptionObject("");
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
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("hi!");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        boolean boolean10 = commandLine0.hasOption('a');
        java.lang.Object obj12 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray13 = commandLine0.getArgs();
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.util.List list15 = commandLine0.getArgList();
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
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        java.util.Iterator iterator14 = commandLine0.iterator();
        boolean boolean16 = commandLine0.hasOption('a');
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "");
        commandLine0.addArg("");
        java.lang.Object obj15 = commandLine0.getOptionObject("hi!");
        boolean boolean17 = commandLine0.hasOption('a');
        java.lang.String str20 = commandLine0.getOptionValue('a', "hi!");
        boolean boolean22 = commandLine0.hasOption('4');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.util.Iterator iterator12 = commandLine0.iterator();
        java.util.Iterator iterator13 = commandLine0.iterator();
        java.lang.String str15 = commandLine0.getOptionValue('a');
        java.lang.Object obj17 = commandLine0.getOptionObject(' ');
        java.lang.String str19 = commandLine0.getOptionValue("");
        java.lang.String[] strArray20 = commandLine0.getArgs();
        java.lang.String[] strArray21 = commandLine0.getArgs();
        java.lang.String str24 = commandLine0.getOptionValue("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.util.Iterator iterator6 = commandLine0.iterator();
        java.lang.String[] strArray8 = commandLine0.getOptionValues('4');
        java.lang.Object obj10 = commandLine0.getOptionObject('#');
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
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
        java.lang.Object obj17 = commandLine0.getOptionObject("hi!");
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
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        java.lang.String str8 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String str13 = commandLine0.getOptionValue("", "hi!");
        java.lang.String[] strArray15 = commandLine0.getOptionValues(' ');
        java.lang.String str18 = commandLine0.getOptionValue('#', "");
        java.lang.Object obj20 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.Object obj13 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray14 = commandLine0.getArgs();
        java.lang.String[] strArray16 = commandLine0.getOptionValues("");
        java.lang.String str18 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
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
        boolean boolean19 = commandLine0.hasOption("");
        java.lang.Object obj21 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('#');
        java.lang.String[] strArray6 = commandLine0.getOptionValues("hi!");
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        boolean boolean9 = commandLine0.hasOption('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertArrayEquals(optionArray2, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.util.List list7 = commandLine0.getArgList();
        boolean boolean9 = commandLine0.hasOption('#');
        boolean boolean11 = commandLine0.hasOption("");
        boolean boolean13 = commandLine0.hasOption(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
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
        java.lang.Object obj23 = commandLine0.getOptionObject("hi!");
        java.lang.String str26 = commandLine0.getOptionValue('a', "");
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
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
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
        java.lang.String[] strArray14 = commandLine0.getArgs();
        java.lang.String[] strArray16 = commandLine0.getOptionValues(' ');
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
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String str9 = commandLine0.getOptionValue('#', "");
        java.lang.String str11 = commandLine0.getOptionValue('4');
        java.lang.Object obj13 = commandLine0.getOptionObject('4');
        java.lang.String[] strArray15 = commandLine0.getOptionValues('a');
        java.lang.Object obj17 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
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
        java.util.Iterator iterator19 = commandLine0.iterator();
        java.lang.String[] strArray21 = commandLine0.getOptionValues('#');
        commandLine0.addArg("");
        boolean boolean25 = commandLine0.hasOption('4');
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
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
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
        java.lang.String str21 = commandLine0.getOptionValue(' ');
        commandLine0.addArg("hi!");
        java.lang.String str25 = commandLine0.getOptionValue('a');
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
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
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
        java.util.List list16 = commandLine0.getArgList();
        java.lang.String[] strArray18 = commandLine0.getOptionValues('a');
        boolean boolean20 = commandLine0.hasOption(' ');
        java.lang.String str22 = commandLine0.getOptionValue(' ');
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
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.Object obj9 = commandLine0.getOptionObject("hi!");
        java.lang.String str12 = commandLine0.getOptionValue(' ', "");
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
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
        commandLine0.addArg("");
        java.lang.Object obj24 = commandLine0.getOptionObject("hi!");
        java.lang.Object obj26 = commandLine0.getOptionObject(' ');
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
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('a');
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj7 = commandLine0.getOptionObject('4');
        java.lang.String str10 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        java.lang.String str14 = commandLine0.getOptionValue(' ');
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        boolean boolean14 = commandLine0.hasOption("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
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
        java.util.List list19 = commandLine0.getArgList();
        commandLine0.addArg("hi!");
        java.lang.String str24 = commandLine0.getOptionValue(' ', "hi!");
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
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
        java.util.Iterator iterator16 = commandLine0.iterator();
        java.lang.Class<?> wildcardClass17 = iterator16.getClass();
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
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
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
        java.lang.String str18 = commandLine0.getOptionValue('#', "");
        java.lang.String str21 = commandLine0.getOptionValue('4', "hi!");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
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
        java.lang.String str16 = commandLine0.getOptionValue('#', "");
        java.lang.String str18 = commandLine0.getOptionValue('a');
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray10 = commandLine0.getArgs();
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.lang.Object obj13 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        java.lang.String str14 = commandLine0.getOptionValue("hi!");
        java.lang.String str16 = commandLine0.getOptionValue(' ');
        java.lang.String[] strArray18 = commandLine0.getOptionValues("hi!");
        commandLine0.addArg("hi!");
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strArray18);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String str5 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.lang.String str8 = commandLine0.getOptionValue(' ');
        boolean boolean10 = commandLine0.hasOption("");
        java.lang.Class<?> wildcardClass11 = commandLine0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
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
        java.lang.String[] strArray24 = commandLine0.getOptionValues('4');
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
        org.junit.Assert.assertNull(strArray24);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String str12 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj14 = commandLine0.getOptionObject(' ');
        java.lang.String[] strArray16 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray17 = commandLine0.getOptions();
        java.lang.Object obj19 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray21 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray23 = commandLine0.getOptionValues('a');
        org.apache.commons.cli.Option[] optionArray24 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(optionArray17);
        org.junit.Assert.assertArrayEquals(optionArray17, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNotNull(optionArray24);
        org.junit.Assert.assertArrayEquals(optionArray24, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray12 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray14 = commandLine0.getOptionValues("hi!");
        java.lang.String str16 = commandLine0.getOptionValue("hi!");
        boolean boolean18 = commandLine0.hasOption("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray10 = commandLine0.getOptionValues(' ');
        java.lang.Object obj12 = commandLine0.getOptionObject("hi!");
        java.lang.String str15 = commandLine0.getOptionValue('#', "");
        java.lang.String str17 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
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
        java.lang.Object obj28 = commandLine0.getOptionObject('#');
        java.lang.Object obj30 = commandLine0.getOptionObject("hi!");
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
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
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
        boolean boolean20 = commandLine0.hasOption("");
        boolean boolean22 = commandLine0.hasOption('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        boolean boolean9 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        boolean boolean15 = commandLine0.hasOption("");
        java.lang.String[] strArray17 = commandLine0.getOptionValues('a');
        java.lang.String str19 = commandLine0.getOptionValue('a');
        java.lang.String[] strArray20 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String str10 = commandLine0.getOptionValue("");
        commandLine0.addArg("hi!");
        boolean boolean14 = commandLine0.hasOption(' ');
        java.lang.String[] strArray16 = commandLine0.getOptionValues('4');
        java.lang.String str19 = commandLine0.getOptionValue(' ', "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        boolean boolean12 = commandLine0.hasOption('a');
        java.util.List list13 = commandLine0.getArgList();
        java.lang.String str15 = commandLine0.getOptionValue('#');
        java.lang.String str18 = commandLine0.getOptionValue(' ', "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String str10 = commandLine0.getOptionValue("");
        java.lang.String[] strArray12 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray14 = commandLine0.getOptionValues("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String str12 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj14 = commandLine0.getOptionObject(' ');
        java.lang.String[] strArray16 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray17 = commandLine0.getOptions();
        java.lang.Object obj19 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray21 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray23 = commandLine0.getOptionValues('a');
        boolean boolean25 = commandLine0.hasOption('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(optionArray17);
        org.junit.Assert.assertArrayEquals(optionArray17, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String str10 = commandLine0.getOptionValue('#');
        java.lang.String str12 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray14 = commandLine0.getOptionValues("hi!");
        org.apache.commons.cli.Option[] optionArray15 = commandLine0.getOptions();
        java.lang.Object obj17 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray19 = commandLine0.getOptionValues("");
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
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(optionArray15);
        org.junit.Assert.assertArrayEquals(optionArray15, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(strArray19);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray3 = commandLine0.getOptions();
        boolean boolean5 = commandLine0.hasOption("");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.lang.String str8 = commandLine0.getOptionValue(' ');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray3);
        org.junit.Assert.assertArrayEquals(optionArray3, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
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
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
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
        java.lang.String[] strArray22 = commandLine0.getOptionValues("hi!");
        boolean boolean24 = commandLine0.hasOption("hi!");
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
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('4', "");
        java.lang.Object obj12 = commandLine0.getOptionObject('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
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
        java.util.List list21 = commandLine0.getArgList();
        java.lang.Class<?> wildcardClass22 = commandLine0.getClass();
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
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String str10 = commandLine0.getOptionValue("");
        java.lang.String str13 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray15 = commandLine0.getOptionValues('#');
        java.lang.String[] strArray16 = commandLine0.getArgs();
        java.lang.Class<?> wildcardClass17 = strArray16.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        boolean boolean9 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        java.util.List list11 = commandLine0.getArgList();
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.util.List list13 = commandLine0.getArgList();
        java.util.Iterator iterator14 = commandLine0.iterator();
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
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.util.List list10 = commandLine0.getArgList();
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        commandLine0.addArg("");
        java.lang.String str16 = commandLine0.getOptionValue('a');
        java.lang.String[] strArray18 = commandLine0.getOptionValues(' ');
        java.lang.String str21 = commandLine0.getOptionValue('4', "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String[] strArray6 = commandLine0.getOptionValues("");
        java.lang.String[] strArray8 = commandLine0.getOptionValues('#');
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('4', "");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String str14 = commandLine0.getOptionValue('a', "hi!");
        java.lang.Object obj16 = commandLine0.getOptionObject('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.Object obj10 = commandLine0.getOptionObject('#');
        java.lang.Object obj12 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        boolean boolean15 = commandLine0.hasOption("");
        java.lang.String[] strArray17 = commandLine0.getOptionValues(' ');
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        boolean boolean12 = commandLine0.hasOption('4');
        java.lang.String[] strArray14 = commandLine0.getOptionValues('4');
        java.lang.String str17 = commandLine0.getOptionValue('#', "");
        commandLine0.addArg("hi!");
        java.util.Iterator iterator20 = commandLine0.iterator();
        java.util.List list21 = commandLine0.getArgList();
        java.lang.String str23 = commandLine0.getOptionValue('4');
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.Iterator iterator5 = commandLine0.iterator();
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues(' ');
        boolean boolean4 = commandLine0.hasOption("");
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue('#');
        java.lang.String str11 = commandLine0.getOptionValue('a', "");
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray6 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        boolean boolean9 = commandLine0.hasOption('a');
        java.lang.String str11 = commandLine0.getOptionValue('#');
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray6);
        org.junit.Assert.assertArrayEquals(optionArray6, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("");
        java.lang.String[] strArray6 = commandLine0.getOptionValues("hi!");
        java.lang.String str9 = commandLine0.getOptionValue('4', "hi!");
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
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
        java.lang.Object obj18 = commandLine0.getOptionObject(' ');
        java.util.Iterator iterator19 = commandLine0.iterator();
        org.apache.commons.cli.Option[] optionArray20 = commandLine0.getOptions();
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
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(optionArray20);
        org.junit.Assert.assertArrayEquals(optionArray20, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj9 = commandLine0.getOptionObject("hi!");
        java.lang.String str11 = commandLine0.getOptionValue('4');
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = obj13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String str5 = commandLine0.getOptionValue("");
        boolean boolean7 = commandLine0.hasOption("hi!");
        boolean boolean9 = commandLine0.hasOption("");
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        java.lang.Class<?> wildcardClass11 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.String str12 = commandLine0.getOptionValue(' ');
        java.util.List list13 = commandLine0.getArgList();
        java.lang.Object obj15 = commandLine0.getOptionObject("");
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String str10 = commandLine0.getOptionValue("hi!", "");
        boolean boolean12 = commandLine0.hasOption("");
        java.util.Iterator iterator13 = commandLine0.iterator();
        java.lang.String str15 = commandLine0.getOptionValue("hi!");
        boolean boolean17 = commandLine0.hasOption(' ');
        java.lang.String[] strArray18 = commandLine0.getArgs();
        java.lang.String[] strArray20 = commandLine0.getOptionValues(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray20);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('4', "");
        boolean boolean12 = commandLine0.hasOption("");
        java.lang.Object obj14 = commandLine0.getOptionObject('a');
        java.util.Iterator iterator15 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        boolean boolean10 = commandLine0.hasOption('#');
        java.lang.String str13 = commandLine0.getOptionValue(' ', "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.Object obj6 = commandLine0.getOptionObject('#');
        java.lang.String str8 = commandLine0.getOptionValue('4');
        java.lang.Object obj10 = commandLine0.getOptionObject('4');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String[] strArray6 = commandLine0.getOptionValues('4');
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue("");
        java.lang.String str11 = commandLine0.getOptionValue('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.lang.String str12 = commandLine0.getOptionValue('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.Iterator iterator5 = commandLine0.iterator();
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String str9 = commandLine0.getOptionValue("hi!", "");
        boolean boolean11 = commandLine0.hasOption("hi!");
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
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
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
        java.lang.String str21 = commandLine0.getOptionValue('a');
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
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        commandLine0.addArg("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues('a');
        java.lang.String str15 = commandLine0.getOptionValue("hi!", "");
        boolean boolean17 = commandLine0.hasOption("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.Object obj3 = commandLine0.getOptionObject(' ');
        java.lang.String[] strArray5 = commandLine0.getOptionValues("hi!");
        org.apache.commons.cli.Option[] optionArray6 = commandLine0.getOptions();
        boolean boolean8 = commandLine0.hasOption("");
        java.lang.String str11 = commandLine0.getOptionValue("", "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(optionArray6);
        org.junit.Assert.assertArrayEquals(optionArray6, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "");
        boolean boolean13 = commandLine0.hasOption("");
        java.lang.String[] strArray15 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray17 = commandLine0.getOptionValues('a');
        commandLine0.addArg("hi!");
        java.lang.String str21 = commandLine0.getOptionValue('4');
        java.lang.String str23 = commandLine0.getOptionValue('4');
        org.apache.commons.cli.Option option24 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
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
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray12 = commandLine0.getOptionValues('a');
        java.lang.String str14 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray16 = commandLine0.getOptionValues("");
        boolean boolean18 = commandLine0.hasOption("");
        java.lang.String[] strArray20 = commandLine0.getOptionValues("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(strArray20);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        java.lang.String str7 = commandLine0.getOptionValue(' ', "hi!");
        java.util.Iterator iterator8 = commandLine0.iterator();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
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
        org.apache.commons.cli.Option[] optionArray23 = commandLine0.getOptions();
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
        org.junit.Assert.assertNotNull(optionArray23);
        org.junit.Assert.assertArrayEquals(optionArray23, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue("", "hi!");
        boolean boolean10 = commandLine0.hasOption("");
        java.lang.String str13 = commandLine0.getOptionValue('a', "");
        java.util.List list14 = commandLine0.getArgList();
        java.util.Iterator iterator15 = commandLine0.iterator();
        java.lang.String str18 = commandLine0.getOptionValue(' ', "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        boolean boolean11 = commandLine0.hasOption("");
        boolean boolean13 = commandLine0.hasOption(' ');
        java.lang.Object obj15 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        boolean boolean11 = commandLine0.hasOption("");
        java.lang.String str13 = commandLine0.getOptionValue("");
        java.lang.Object obj15 = commandLine0.getOptionObject('4');
        java.util.List list16 = commandLine0.getArgList();
        java.lang.String str19 = commandLine0.getOptionValue("", "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
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
        java.lang.String[] strArray21 = commandLine0.getArgs();
        java.lang.String[] strArray23 = commandLine0.getOptionValues('a');
        commandLine0.addArg("");
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
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(strArray23);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
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
        java.lang.String[] strArray17 = commandLine0.getOptionValues(' ');
        java.lang.String str19 = commandLine0.getOptionValue('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.String[] strArray7 = commandLine0.getArgs();
        java.lang.String[] strArray9 = commandLine0.getOptionValues("");
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        java.lang.Object obj13 = commandLine0.getOptionObject("");
        boolean boolean15 = commandLine0.hasOption("hi!");
        java.lang.Object obj17 = commandLine0.getOptionObject(' ');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        java.lang.String str8 = commandLine0.getOptionValue('#');
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.lang.String str13 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray14 = commandLine0.getArgs();
        java.lang.Object obj16 = commandLine0.getOptionObject('a');
        boolean boolean18 = commandLine0.hasOption('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        boolean boolean10 = commandLine0.hasOption("");
        java.util.List list11 = commandLine0.getArgList();
        boolean boolean13 = commandLine0.hasOption('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        java.lang.String str13 = commandLine0.getOptionValue('#', "hi!");
        java.lang.Object obj15 = commandLine0.getOptionObject("hi!");
        java.lang.String str18 = commandLine0.getOptionValue(' ', "");
        boolean boolean20 = commandLine0.hasOption('4');
        boolean boolean22 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.util.Iterator iterator6 = commandLine0.iterator();
        commandLine0.addArg("hi!");
        boolean boolean10 = commandLine0.hasOption(' ');
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj14 = commandLine0.getOptionObject(' ');
        java.lang.String str16 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue('#', "hi!");
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray11 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.lang.String[] strArray14 = commandLine0.getOptionValues("");
        java.lang.String str16 = commandLine0.getOptionValue(' ');
        java.lang.String str18 = commandLine0.getOptionValue(' ');
        java.lang.String str21 = commandLine0.getOptionValue('#', "");
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
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
        boolean boolean16 = commandLine0.hasOption("hi!");
        boolean boolean18 = commandLine0.hasOption('#');
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String str9 = commandLine0.getOptionValue("", "hi!");
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.String str14 = commandLine0.getOptionValue("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
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
        java.util.Iterator iterator19 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(iterator19);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.util.Iterator iterator7 = commandLine0.iterator();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        boolean boolean13 = commandLine0.hasOption('a');
        java.lang.String str15 = commandLine0.getOptionValue(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        boolean boolean12 = commandLine0.hasOption('a');
        java.util.Iterator iterator13 = commandLine0.iterator();
        java.lang.Object obj15 = commandLine0.getOptionObject('a');
        commandLine0.addArg("");
        java.util.Iterator iterator18 = commandLine0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(iterator18);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.lang.String str14 = commandLine0.getOptionValue('4');
        boolean boolean16 = commandLine0.hasOption('4');
        boolean boolean18 = commandLine0.hasOption("hi!");
        java.lang.String str20 = commandLine0.getOptionValue(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.String str8 = commandLine0.getOptionValue(' ');
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String str12 = commandLine0.getOptionValue(' ', "");
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue('a');
        java.lang.String str11 = commandLine0.getOptionValue('4', "");
        java.lang.Object obj13 = commandLine0.getOptionObject('#');
        java.lang.String str15 = commandLine0.getOptionValue(' ');
        java.lang.String[] strArray17 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String[] strArray12 = commandLine0.getOptionValues('a');
        java.util.Iterator iterator13 = commandLine0.iterator();
        java.util.Iterator iterator14 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray3 = commandLine0.getOptions();
        java.lang.Object obj5 = commandLine0.getOptionObject('4');
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        boolean boolean11 = commandLine0.hasOption("hi!");
        java.lang.Object obj13 = commandLine0.getOptionObject('4');
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(optionArray3);
        org.junit.Assert.assertArrayEquals(optionArray3, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String[] strArray8 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String[] strArray11 = commandLine0.getOptionValues('#');
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray8 = commandLine0.getOptionValues(' ');
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String str12 = commandLine0.getOptionValue("", "hi!");
        boolean boolean14 = commandLine0.hasOption("");
        java.lang.String[] strArray16 = commandLine0.getOptionValues("");
        java.lang.String str19 = commandLine0.getOptionValue(' ', "hi!");
        java.util.Iterator iterator20 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(iterator20);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("hi!");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        boolean boolean11 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray13 = commandLine0.getOptionValues('#');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.util.List list8 = commandLine0.getArgList();
        java.util.Iterator iterator9 = commandLine0.iterator();
        boolean boolean11 = commandLine0.hasOption('a');
        java.util.List list12 = commandLine0.getArgList();
        boolean boolean14 = commandLine0.hasOption('a');
        java.lang.Class<?> wildcardClass15 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray6 = commandLine0.getOptions();
        java.util.List list7 = commandLine0.getArgList();
        java.util.List list8 = commandLine0.getArgList();
        java.util.Iterator iterator9 = commandLine0.iterator();
        boolean boolean11 = commandLine0.hasOption(' ');
        java.lang.String[] strArray13 = commandLine0.getOptionValues("");
        java.lang.String str15 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray6);
        org.junit.Assert.assertArrayEquals(optionArray6, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String str14 = commandLine0.getOptionValue('4', "hi!");
        java.lang.String[] strArray15 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray16 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray17 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(optionArray16);
        org.junit.Assert.assertArrayEquals(optionArray16, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray17);
        org.junit.Assert.assertArrayEquals(optionArray17, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String[] strArray8 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String str12 = commandLine0.getOptionValue('4', "");
        java.lang.String str14 = commandLine0.getOptionValue('#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray6 = commandLine0.getOptions();
        java.util.List list7 = commandLine0.getArgList();
        boolean boolean9 = commandLine0.hasOption(' ');
        java.util.Iterator iterator10 = commandLine0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray6);
        org.junit.Assert.assertArrayEquals(optionArray6, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        java.lang.String str12 = commandLine0.getOptionValue('#', "hi!");
        boolean boolean14 = commandLine0.hasOption(' ');
        java.util.List list15 = commandLine0.getArgList();
        boolean boolean17 = commandLine0.hasOption("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.Object obj11 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.lang.String str14 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray16 = commandLine0.getOptionValues("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        boolean boolean11 = commandLine0.hasOption("");
        java.lang.String str13 = commandLine0.getOptionValue("");
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.Object obj16 = commandLine0.getOptionObject(' ');
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
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.util.List list9 = commandLine0.getArgList();
        java.lang.Object obj11 = commandLine0.getOptionObject("");
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        java.util.List list14 = commandLine0.getArgList();
        java.lang.String str17 = commandLine0.getOptionValue('4', "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.util.List list10 = commandLine0.getArgList();
        java.lang.String str12 = commandLine0.getOptionValue('a');
        java.lang.Object obj14 = commandLine0.getOptionObject("hi!");
        java.lang.String str17 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray18 = commandLine0.getArgs();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "" });
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
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
        boolean boolean15 = commandLine0.hasOption('#');
        java.lang.String str18 = commandLine0.getOptionValue(' ', "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption('a');
        java.util.Iterator iterator5 = commandLine0.iterator();
        java.lang.Object obj7 = commandLine0.getOptionObject('#');
        boolean boolean9 = commandLine0.hasOption("hi!");
        java.lang.String str11 = commandLine0.getOptionValue("hi!");
        java.util.List list12 = commandLine0.getArgList();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.String str7 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.Iterator iterator5 = commandLine0.iterator();
        java.lang.Object obj7 = commandLine0.getOptionObject('4');
        boolean boolean9 = commandLine0.hasOption('#');
        java.lang.Object obj11 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
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
        org.apache.commons.cli.Option[] optionArray21 = commandLine0.getOptions();
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
        org.junit.Assert.assertNotNull(optionArray21);
        org.junit.Assert.assertArrayEquals(optionArray21, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.Iterator iterator5 = commandLine0.iterator();
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = obj7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.util.List list8 = commandLine0.getArgList();
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String[] strArray11 = commandLine0.getOptionValues(' ');
        java.lang.String str13 = commandLine0.getOptionValue(' ');
        boolean boolean15 = commandLine0.hasOption('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
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
        java.lang.Object obj17 = commandLine0.getOptionObject('a');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('a');
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "");
        boolean boolean7 = commandLine0.hasOption('#');
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
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
        boolean boolean18 = commandLine0.hasOption('a');
        commandLine0.addArg("");
        java.lang.Object obj22 = commandLine0.getOptionObject('#');
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
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
        java.lang.String[] strArray15 = commandLine0.getOptionValues("hi!");
        java.lang.String str17 = commandLine0.getOptionValue('4');
        boolean boolean19 = commandLine0.hasOption(' ');
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
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        boolean boolean11 = commandLine0.hasOption('4');
        boolean boolean13 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray14 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
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
        boolean boolean21 = commandLine0.hasOption(' ');
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String[] strArray10 = commandLine0.getOptionValues('#');
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.lang.String[] strArray12 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        boolean boolean15 = commandLine0.hasOption("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.lang.String str11 = commandLine0.getOptionValue('4', "");
        boolean boolean13 = commandLine0.hasOption('a');
        java.util.List list14 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "");
        commandLine0.addArg("");
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.String str17 = commandLine0.getOptionValue("", "");
        java.lang.String str19 = commandLine0.getOptionValue('a');
        java.lang.String str22 = commandLine0.getOptionValue('4', "hi!");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
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
        java.lang.String[] strArray17 = commandLine0.getOptionValues('4');
        java.lang.String str20 = commandLine0.getOptionValue('4', "hi!");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray12 = commandLine0.getOptionValues('a');
        java.lang.String str14 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray16 = commandLine0.getOptionValues("");
        boolean boolean18 = commandLine0.hasOption("");
        java.lang.String[] strArray19 = commandLine0.getArgs();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        boolean boolean6 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.String str11 = commandLine0.getOptionValue('#', "");
        java.util.List list12 = commandLine0.getArgList();
        java.util.Iterator iterator13 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        java.lang.String[] strArray13 = commandLine0.getArgs();
        java.lang.String str16 = commandLine0.getOptionValue('#', "");
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
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.lang.String str8 = commandLine0.getOptionValue('4');
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        boolean boolean12 = commandLine0.hasOption("");
        java.lang.Class<?> wildcardClass13 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray8 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String str10 = commandLine0.getOptionValue("");
        commandLine0.addArg("hi!");
        java.lang.String[] strArray14 = commandLine0.getOptionValues("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
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
        java.lang.String str20 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray22 = commandLine0.getOptionValues("");
        java.lang.String[] strArray23 = commandLine0.getArgs();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
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
        java.lang.String str18 = commandLine0.getOptionValue("hi!");
        java.util.Iterator iterator19 = commandLine0.iterator();
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
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(iterator19);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
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
        java.util.Iterator iterator19 = commandLine0.iterator();
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
        org.junit.Assert.assertNotNull(iterator19);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        boolean boolean9 = commandLine0.hasOption("hi!");
        java.lang.String str12 = commandLine0.getOptionValue('#', "");
        java.lang.Object obj14 = commandLine0.getOptionObject('#');
        boolean boolean16 = commandLine0.hasOption("hi!");
        java.lang.String str19 = commandLine0.getOptionValue('#', "");
        java.lang.String str22 = commandLine0.getOptionValue('a', "hi!");
        java.lang.Object obj24 = commandLine0.getOptionObject('#');
        java.lang.Class<?> wildcardClass25 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        boolean boolean10 = commandLine0.hasOption('#');
        java.lang.String str12 = commandLine0.getOptionValue('a');
        java.lang.String str14 = commandLine0.getOptionValue('4');
        java.lang.String str16 = commandLine0.getOptionValue('a');
        java.lang.String str18 = commandLine0.getOptionValue("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        java.lang.String[] strArray7 = commandLine0.getArgs();
        java.lang.String str10 = commandLine0.getOptionValue(' ', "");
        java.lang.Object obj12 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray14 = commandLine0.getOptionValues('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.String[] strArray9 = commandLine0.getOptionValues("hi!");
        java.lang.String str11 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj13 = commandLine0.getOptionObject('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue("", "hi!");
        boolean boolean10 = commandLine0.hasOption("");
        java.lang.String str13 = commandLine0.getOptionValue('4', "hi!");
        java.lang.String[] strArray14 = commandLine0.getArgs();
        boolean boolean16 = commandLine0.hasOption('4');
        java.lang.String str19 = commandLine0.getOptionValue("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.util.List list11 = commandLine0.getArgList();
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
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
        org.apache.commons.cli.Option[] optionArray18 = commandLine0.getOptions();
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
        org.junit.Assert.assertNotNull(optionArray18);
        org.junit.Assert.assertArrayEquals(optionArray18, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        java.util.List list11 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.Class<?> wildcardClass14 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        java.lang.Object obj16 = commandLine0.getOptionObject('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj16);
    }
}

