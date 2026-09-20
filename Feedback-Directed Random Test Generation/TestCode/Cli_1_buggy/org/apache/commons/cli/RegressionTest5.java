package org.apache.commons.cli;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        java.lang.String[] strArray14 = commandLine0.getOptionValues('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
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
        java.lang.Class<?> wildcardClass16 = commandLine0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        boolean boolean10 = commandLine0.hasOption("");
        commandLine0.addArg("");
        java.util.Iterator iterator13 = commandLine0.iterator();
        java.lang.String str15 = commandLine0.getOptionValue("");
        java.lang.String[] strArray17 = commandLine0.getOptionValues(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str9 = commandLine0.getOptionValue("");
        java.lang.String str12 = commandLine0.getOptionValue("hi!", "hi!");
        java.util.List list13 = commandLine0.getArgList();
        java.lang.String[] strArray14 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        boolean boolean8 = commandLine0.hasOption('a');
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str12 = commandLine0.getOptionValue("", "");
        java.lang.Object obj14 = commandLine0.getOptionObject('4');
        java.util.Iterator iterator15 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.String str11 = commandLine0.getOptionValue("", "hi!");
        java.util.Iterator iterator12 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.String[] strArray7 = commandLine0.getArgs();
        java.lang.String[] strArray9 = commandLine0.getOptionValues("");
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        java.lang.Object obj13 = commandLine0.getOptionObject("");
        java.util.Iterator iterator14 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String str9 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj11 = commandLine0.getOptionObject(' ');
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.lang.String str14 = commandLine0.getOptionValue("");
        java.util.Iterator iterator15 = commandLine0.iterator();
        java.lang.String[] strArray17 = commandLine0.getOptionValues('#');
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray6 = commandLine0.getOptions();
        java.util.List list7 = commandLine0.getArgList();
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray11 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        java.lang.String str16 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj18 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray6);
        org.junit.Assert.assertArrayEquals(optionArray6, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String str10 = commandLine0.getOptionValue("hi!", "");
        boolean boolean12 = commandLine0.hasOption("");
        java.lang.String str15 = commandLine0.getOptionValue(' ', "");
        java.lang.String[] strArray17 = commandLine0.getOptionValues(' ');
        java.lang.Object obj19 = commandLine0.getOptionObject("");
        boolean boolean21 = commandLine0.hasOption('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        boolean boolean7 = commandLine0.hasOption('a');
        java.lang.String[] strArray9 = commandLine0.getOptionValues("");
        boolean boolean11 = commandLine0.hasOption('#');
        java.lang.Object obj13 = commandLine0.getOptionObject("");
        java.lang.String[] strArray15 = commandLine0.getOptionValues("hi!");
        java.util.List list16 = commandLine0.getArgList();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String str9 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj11 = commandLine0.getOptionObject("");
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
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
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues('#');
        boolean boolean14 = commandLine0.hasOption("hi!");
        java.lang.Object obj16 = commandLine0.getOptionObject('#');
        java.lang.String str19 = commandLine0.getOptionValue('a', "");
        java.util.List list20 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        java.lang.String str7 = commandLine0.getOptionValue(' ', "hi!");
        boolean boolean9 = commandLine0.hasOption("");
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
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        java.lang.String[] strArray10 = commandLine0.getArgs();
        java.lang.String str12 = commandLine0.getOptionValue('a');
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String str10 = commandLine0.getOptionValue("");
        java.lang.String str13 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray15 = commandLine0.getOptionValues('#');
        java.lang.Object obj17 = commandLine0.getOptionObject('4');
        java.lang.String str19 = commandLine0.getOptionValue("hi!");
        org.apache.commons.cli.Option option20 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option20);
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
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.util.List list7 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.String str11 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str13 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.util.Iterator iterator10 = commandLine0.iterator();
        java.lang.String[] strArray12 = commandLine0.getOptionValues('a');
        java.lang.String str14 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        java.lang.String str12 = commandLine0.getOptionValue('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        commandLine0.addArg("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = strArray12.getClass();
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
        org.junit.Assert.assertNull(strArray12);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue(' ');
        java.util.List list7 = commandLine0.getArgList();
        java.lang.String str9 = commandLine0.getOptionValue('4');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str9 = commandLine0.getOptionValue("");
        boolean boolean11 = commandLine0.hasOption('a');
        commandLine0.addArg("");
        java.lang.Object obj15 = commandLine0.getOptionObject("");
        java.lang.Object obj17 = commandLine0.getOptionObject("");
        java.lang.Class<?> wildcardClass18 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("hi!");
        java.lang.String str13 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray15 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray17 = commandLine0.getOptionValues('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String str11 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String str13 = commandLine0.getOptionValue("");
        java.util.List list14 = commandLine0.getArgList();
        java.lang.String[] strArray15 = commandLine0.getArgs();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray11 = commandLine0.getOptionValues('a');
        java.lang.String str14 = commandLine0.getOptionValue('4', "hi!");
        java.lang.String str17 = commandLine0.getOptionValue("", "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
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
        java.lang.String[] strArray18 = commandLine0.getOptionValues('a');
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
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
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
        java.lang.String str15 = commandLine0.getOptionValue("");
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
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue('a');
        java.lang.String[] strArray10 = commandLine0.getOptionValues("hi!");
        java.lang.String str12 = commandLine0.getOptionValue(' ');
        java.lang.String str15 = commandLine0.getOptionValue('a', "");
        java.lang.Class<?> wildcardClass16 = commandLine0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        java.util.List list12 = commandLine0.getArgList();
        java.lang.String[] strArray14 = commandLine0.getOptionValues('4');
        java.lang.Object obj16 = commandLine0.getOptionObject("");
        java.util.List list17 = commandLine0.getArgList();
        java.lang.String[] strArray18 = commandLine0.getArgs();
        java.lang.String str20 = commandLine0.getOptionValue('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('4');
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String[] strArray9 = commandLine0.getOptionValues("hi!");
        java.lang.String str11 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        boolean boolean9 = commandLine0.hasOption("hi!");
        java.lang.String str12 = commandLine0.getOptionValue('#', "");
        commandLine0.addArg("hi!");
        java.lang.String[] strArray16 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray18 = commandLine0.getOptionValues(' ');
        java.util.Iterator iterator19 = commandLine0.iterator();
        org.apache.commons.cli.Option[] optionArray20 = commandLine0.getOptions();
        java.lang.String str23 = commandLine0.getOptionValue("hi!", "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(optionArray20);
        org.junit.Assert.assertArrayEquals(optionArray20, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
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
        java.lang.Object obj18 = commandLine0.getOptionObject("");
        java.lang.Object obj20 = commandLine0.getOptionObject("hi!");
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
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str9 = commandLine0.getOptionValue("");
        boolean boolean11 = commandLine0.hasOption('a');
        commandLine0.addArg("");
        java.lang.Object obj15 = commandLine0.getOptionObject("");
        org.apache.commons.cli.Option[] optionArray16 = commandLine0.getOptions();
        java.lang.String str18 = commandLine0.getOptionValue('#');
        java.lang.Class<?> wildcardClass19 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(optionArray16);
        org.junit.Assert.assertArrayEquals(optionArray16, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray11 = commandLine0.getOptionValues('4');
        boolean boolean13 = commandLine0.hasOption('#');
        java.lang.String str16 = commandLine0.getOptionValue(' ', "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        java.lang.String[] strArray10 = commandLine0.getArgs();
        java.lang.String str13 = commandLine0.getOptionValue("", "hi!");
        java.lang.Object obj15 = commandLine0.getOptionObject("hi!");
        boolean boolean17 = commandLine0.hasOption("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        boolean boolean8 = commandLine0.hasOption('a');
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str12 = commandLine0.getOptionValue("", "");
        java.lang.String str14 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray4 = commandLine0.getOptionValues("hi!");
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str9 = commandLine0.getOptionValue("");
        boolean boolean11 = commandLine0.hasOption('4');
        java.lang.String[] strArray13 = commandLine0.getOptionValues("");
        boolean boolean15 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.lang.String str11 = commandLine0.getOptionValue('a', "");
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.lang.String str15 = commandLine0.getOptionValue('a', "");
        java.lang.Object obj17 = commandLine0.getOptionObject("hi!");
        java.lang.Object obj19 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.String str9 = commandLine0.getOptionValue("hi!");
        boolean boolean11 = commandLine0.hasOption("");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.lang.String[] strArray14 = commandLine0.getArgs();
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
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String str10 = commandLine0.getOptionValue("hi!", "");
        boolean boolean12 = commandLine0.hasOption("");
        java.lang.String str15 = commandLine0.getOptionValue(' ', "");
        java.lang.String str18 = commandLine0.getOptionValue("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.util.Iterator iterator5 = commandLine0.iterator();
        java.lang.String[] strArray7 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator8 = commandLine0.iterator();
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String str12 = commandLine0.getOptionValue('#', "");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.lang.String str8 = commandLine0.getOptionValue("", "hi!");
        boolean boolean10 = commandLine0.hasOption('#');
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.lang.Object obj13 = commandLine0.getOptionObject('4');
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
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.String str10 = commandLine0.getOptionValue("", "");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.util.List list13 = commandLine0.getArgList();
        java.lang.Object obj15 = commandLine0.getOptionObject('#');
        java.lang.String str18 = commandLine0.getOptionValue("hi!", "");
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
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
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
        java.lang.Object obj21 = commandLine0.getOptionObject("hi!");
        java.util.List list22 = commandLine0.getArgList();
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
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        java.util.List list12 = commandLine0.getArgList();
        java.lang.String[] strArray14 = commandLine0.getOptionValues('4');
        java.util.List list15 = commandLine0.getArgList();
        java.lang.String str17 = commandLine0.getOptionValue("");
        commandLine0.addArg("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
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
        java.lang.String str22 = commandLine0.getOptionValue("");
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
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        boolean boolean9 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.util.List list12 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
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
        java.lang.Object obj19 = commandLine0.getOptionObject("hi!");
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
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        boolean boolean11 = commandLine0.hasOption("hi!");
        java.util.Iterator iterator12 = commandLine0.iterator();
        java.lang.String[] strArray14 = commandLine0.getOptionValues('a');
        java.lang.String str17 = commandLine0.getOptionValue('#', "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.Object obj10 = commandLine0.getOptionObject('a');
        java.util.Iterator iterator11 = commandLine0.iterator();
        boolean boolean13 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray15 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray17 = commandLine0.getOptionValues('a');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        boolean boolean7 = commandLine0.hasOption('a');
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        boolean boolean11 = commandLine0.hasOption("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
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
        java.lang.String[] strArray21 = commandLine0.getOptionValues('#');
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
        org.junit.Assert.assertNull(strArray21);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
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
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("hi!");
        boolean boolean13 = commandLine0.hasOption("");
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
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
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "");
        java.util.Iterator iterator6 = commandLine0.iterator();
        java.lang.String[] strArray8 = commandLine0.getOptionValues("hi!");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str12 = commandLine0.getOptionValue("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        java.util.List list7 = commandLine0.getArgList();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String str11 = commandLine0.getOptionValue('#');
        java.lang.Object obj13 = commandLine0.getOptionObject('#');
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
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
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
        org.apache.commons.cli.Option[] optionArray15 = commandLine0.getOptions();
        boolean boolean17 = commandLine0.hasOption("hi!");
        java.lang.Class<?> wildcardClass18 = commandLine0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray9 = commandLine0.getOptionValues('#');
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        boolean boolean12 = commandLine0.hasOption('4');
        java.lang.String[] strArray14 = commandLine0.getOptionValues('#');
        java.lang.String[] strArray16 = commandLine0.getOptionValues('#');
        java.lang.String str18 = commandLine0.getOptionValue('#');
        org.apache.commons.cli.Option[] optionArray19 = commandLine0.getOptions();
        java.lang.String str22 = commandLine0.getOptionValue("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(optionArray19);
        org.junit.Assert.assertArrayEquals(optionArray19, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        boolean boolean10 = commandLine0.hasOption("");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String str13 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray14 = commandLine0.getArgs();
        java.lang.String[] strArray16 = commandLine0.getOptionValues('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray8 = commandLine0.getOptionValues(' ');
        java.util.Iterator iterator9 = commandLine0.iterator();
        boolean boolean11 = commandLine0.hasOption("hi!");
        java.util.Iterator iterator12 = commandLine0.iterator();
        java.lang.String[] strArray14 = commandLine0.getOptionValues('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        java.lang.String str8 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String str13 = commandLine0.getOptionValue("", "");
        boolean boolean15 = commandLine0.hasOption('a');
        java.lang.String[] strArray16 = commandLine0.getArgs();
        java.lang.String str18 = commandLine0.getOptionValue('a');
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
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
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
        java.lang.String str24 = commandLine0.getOptionValue('a');
        commandLine0.addArg("hi!");
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
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray9 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray11 = commandLine0.getOptionValues(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.String str6 = commandLine0.getOptionValue("hi!", "");
        java.lang.String[] strArray8 = commandLine0.getOptionValues('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.String str10 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        java.lang.String[] strArray14 = commandLine0.getOptionValues(' ');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
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
        java.lang.String[] strArray22 = commandLine0.getOptionValues("hi!");
        org.apache.commons.cli.Option[] optionArray23 = commandLine0.getOptions();
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
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(optionArray23);
        org.junit.Assert.assertArrayEquals(optionArray23, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String str5 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.lang.String str9 = commandLine0.getOptionValue('4', "hi!");
        boolean boolean11 = commandLine0.hasOption('4');
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('4', "");
        boolean boolean12 = commandLine0.hasOption("");
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String str10 = commandLine0.getOptionValue("hi!", "");
        java.lang.String[] strArray12 = commandLine0.getOptionValues('4');
        java.util.List list13 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.util.List list8 = commandLine0.getArgList();
        boolean boolean10 = commandLine0.hasOption("");
        boolean boolean12 = commandLine0.hasOption('4');
        java.lang.String str14 = commandLine0.getOptionValue("");
        commandLine0.addArg("hi!");
        java.lang.String str19 = commandLine0.getOptionValue("hi!", "hi!");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.util.List list9 = commandLine0.getArgList();
        java.lang.String str11 = commandLine0.getOptionValue('4');
        java.util.Iterator iterator12 = commandLine0.iterator();
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.lang.String str16 = commandLine0.getOptionValue("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        java.lang.String str5 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray7 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator8 = commandLine0.iterator();
        java.lang.String[] strArray10 = commandLine0.getOptionValues(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertArrayEquals(optionArray2, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
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
        java.lang.String str19 = commandLine0.getOptionValue(' ');
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
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        java.lang.String str14 = commandLine0.getOptionValue("hi!");
        java.lang.String str16 = commandLine0.getOptionValue("");
        java.lang.String[] strArray17 = commandLine0.getArgs();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('a');
        java.util.List list11 = commandLine0.getArgList();
        java.util.List list12 = commandLine0.getArgList();
        java.lang.String str15 = commandLine0.getOptionValue("hi!", "hi!");
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
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
        boolean boolean17 = commandLine0.hasOption(' ');
        commandLine0.addArg("hi!");
        java.lang.String[] strArray20 = commandLine0.getArgs();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        java.lang.Object obj14 = commandLine0.getOptionObject(' ');
        java.lang.String[] strArray16 = commandLine0.getOptionValues("hi!");
        boolean boolean18 = commandLine0.hasOption(' ');
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
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
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
        commandLine0.addArg("hi!");
        java.lang.String str26 = commandLine0.getOptionValue('#');
        org.apache.commons.cli.Option option27 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option27);
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
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
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
        java.lang.String[] strArray20 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray21 = commandLine0.getArgs();
        java.lang.Object obj23 = commandLine0.getOptionObject("");
        java.util.Iterator iterator24 = commandLine0.iterator();
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
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(iterator24);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
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
        commandLine0.addArg("");
        java.util.Iterator iterator20 = commandLine0.iterator();
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
        org.junit.Assert.assertNotNull(iterator20);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        boolean boolean7 = commandLine0.hasOption('a');
        java.lang.String[] strArray9 = commandLine0.getOptionValues("");
        java.lang.String[] strArray11 = commandLine0.getOptionValues('#');
        java.lang.String[] strArray12 = commandLine0.getArgs();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray10 = commandLine0.getArgs();
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        java.lang.String str15 = commandLine0.getOptionValue("", "hi!");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('4');
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('#', "");
        boolean boolean12 = commandLine0.hasOption("");
        java.lang.String[] strArray14 = commandLine0.getOptionValues('a');
        java.lang.String str16 = commandLine0.getOptionValue('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
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
        java.lang.String str20 = commandLine0.getOptionValue('a');
        org.apache.commons.cli.Option option21 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option21);
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
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
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
        java.lang.String[] strArray14 = commandLine0.getArgs();
        java.lang.String str17 = commandLine0.getOptionValue('4', "hi!");
        java.util.List list18 = commandLine0.getArgList();
        java.util.Iterator iterator19 = commandLine0.iterator();
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
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(iterator19);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.Object obj11 = commandLine0.getOptionObject(' ');
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.lang.String[] strArray14 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.lang.String[] strArray7 = commandLine0.getArgs();
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("hi!");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("hi!");
        java.lang.String str14 = commandLine0.getOptionValue('4', "");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
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
        java.lang.String str16 = commandLine0.getOptionValue('4', "");
        java.lang.String str19 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray20 = commandLine0.getOptions();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(optionArray20);
        org.junit.Assert.assertArrayEquals(optionArray20, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue('a');
        java.lang.String[] strArray10 = commandLine0.getOptionValues("hi!");
        commandLine0.addArg("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
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
        boolean boolean20 = commandLine0.hasOption("");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        java.lang.String str7 = commandLine0.getOptionValue(' ', "hi!");
        boolean boolean9 = commandLine0.hasOption("");
        java.util.List list10 = commandLine0.getArgList();
        java.lang.String str13 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str15 = commandLine0.getOptionValue('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
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
        boolean boolean21 = commandLine0.hasOption('a');
        java.lang.String[] strArray23 = commandLine0.getOptionValues('#');
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(strArray23);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        boolean boolean9 = commandLine0.hasOption("hi!");
        java.lang.String str12 = commandLine0.getOptionValue('#', "");
        java.lang.Object obj14 = commandLine0.getOptionObject('#');
        java.lang.String str17 = commandLine0.getOptionValue("", "hi!");
        boolean boolean19 = commandLine0.hasOption('a');
        java.lang.String str22 = commandLine0.getOptionValue("", "");
        java.lang.Object obj24 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.Object obj13 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray15 = commandLine0.getOptionValues('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.util.List list10 = commandLine0.getArgList();
        java.util.List list11 = commandLine0.getArgList();
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        commandLine0.addArg("hi!");
        java.lang.String str18 = commandLine0.getOptionValue("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        boolean boolean8 = commandLine0.hasOption("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.util.List list10 = commandLine0.getArgList();
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.lang.String[] strArray13 = commandLine0.getOptionValues('#');
        java.lang.String str15 = commandLine0.getOptionValue('4');
        java.lang.String str17 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String str11 = commandLine0.getOptionValue('#');
        java.util.List list12 = commandLine0.getArgList();
        java.util.List list13 = commandLine0.getArgList();
        java.lang.Object obj15 = commandLine0.getOptionObject('4');
        boolean boolean17 = commandLine0.hasOption(' ');
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
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        java.lang.String str8 = commandLine0.getOptionValue('#');
        java.lang.String str11 = commandLine0.getOptionValue('a', "hi!");
        java.util.List list12 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str12 = commandLine0.getOptionValue("", "");
        commandLine0.addArg("hi!");
        java.util.List list15 = commandLine0.getArgList();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        boolean boolean8 = commandLine0.hasOption('a');
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.Class<?> wildcardClass10 = optionArray9.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.util.Iterator iterator6 = commandLine0.iterator();
        java.util.List list7 = commandLine0.getArgList();
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.String str11 = commandLine0.getOptionValue('a');
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray8 = commandLine0.getOptionValues('#');
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.String str13 = commandLine0.getOptionValue("", "");
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.String str12 = commandLine0.getOptionValue(' ');
        java.util.List list13 = commandLine0.getArgList();
        java.util.Iterator iterator14 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.Object obj12 = commandLine0.getOptionObject('4');
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.lang.String str15 = commandLine0.getOptionValue('4');
        java.util.Iterator iterator16 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
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
        java.lang.String str17 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj19 = commandLine0.getOptionObject("hi!");
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
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.lang.String str11 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj15 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray17 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray19 = commandLine0.getOptionValues('a');
        java.lang.Object obj21 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.lang.String str11 = commandLine0.getOptionValue('a', "");
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.lang.String str15 = commandLine0.getOptionValue('a', "");
        java.lang.Object obj17 = commandLine0.getOptionObject("hi!");
        java.lang.String str19 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        boolean boolean8 = commandLine0.hasOption("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
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
        java.util.List list16 = commandLine0.getArgList();
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
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String str9 = commandLine0.getOptionValue('#');
        java.util.Iterator iterator10 = commandLine0.iterator();
        java.lang.String str12 = commandLine0.getOptionValue('4');
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
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str12 = commandLine0.getOptionValue("", "");
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.lang.Object obj15 = commandLine0.getOptionObject(' ');
        java.lang.Object obj17 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String[] strArray8 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray10 = commandLine0.getOptionValues('#');
        java.util.List list11 = commandLine0.getArgList();
        org.apache.commons.cli.Option option12 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str12 = commandLine0.getOptionValue("", "");
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.lang.String str16 = commandLine0.getOptionValue(' ', "");
        java.util.Iterator iterator17 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
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
        java.lang.String str21 = commandLine0.getOptionValue('4');
        org.apache.commons.cli.Option[] optionArray22 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray23 = commandLine0.getOptions();
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
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(optionArray22);
        org.junit.Assert.assertArrayEquals(optionArray22, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray23);
        org.junit.Assert.assertArrayEquals(optionArray23, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.util.Iterator iterator3 = commandLine0.iterator();
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        boolean boolean6 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray8 = commandLine0.getOptionValues('a');
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray10 = commandLine0.getOptionValues('4');
        java.lang.String[] strArray12 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray14 = commandLine0.getOptionValues('4');
        boolean boolean16 = commandLine0.hasOption('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        boolean boolean12 = commandLine0.hasOption("hi!");
        java.lang.Object obj14 = commandLine0.getOptionObject('4');
        java.util.List list15 = commandLine0.getArgList();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
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
        org.junit.Assert.assertNotNull(iterator23);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.util.Iterator iterator7 = commandLine0.iterator();
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        java.lang.String str12 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray13 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String str5 = commandLine0.getOptionValue('#');
        org.apache.commons.cli.Option[] optionArray6 = commandLine0.getOptions();
        java.lang.String str9 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray10 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(optionArray6);
        org.junit.Assert.assertArrayEquals(optionArray6, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.Object obj11 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        boolean boolean14 = commandLine0.hasOption('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        boolean boolean7 = commandLine0.hasOption("");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.Object obj10 = commandLine0.getOptionObject('a');
        java.lang.Object obj12 = commandLine0.getOptionObject('4');
        java.lang.String str14 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray16 = commandLine0.getOptionValues("");
        boolean boolean18 = commandLine0.hasOption('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
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
        commandLine0.addArg("hi!");
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
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.util.List list8 = commandLine0.getArgList();
        boolean boolean10 = commandLine0.hasOption("");
        boolean boolean12 = commandLine0.hasOption('4');
        java.lang.String[] strArray14 = commandLine0.getOptionValues('4');
        java.lang.String[] strArray15 = commandLine0.getArgs();
        java.util.Iterator iterator16 = commandLine0.iterator();
        java.lang.Class<?> wildcardClass17 = iterator16.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.Object obj9 = commandLine0.getOptionObject("hi!");
        java.lang.String str12 = commandLine0.getOptionValue(' ', "");
        java.lang.String str15 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str17 = commandLine0.getOptionValue('4');
        java.lang.String str20 = commandLine0.getOptionValue("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str3 = commandLine0.getOptionValue('#');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str12 = commandLine0.getOptionValue("", "");
        java.lang.String str14 = commandLine0.getOptionValue("");
        java.lang.String str16 = commandLine0.getOptionValue('a');
        java.lang.String str18 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj20 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray9 = commandLine0.getOptionValues('#');
        java.util.Iterator iterator10 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray8 = commandLine0.getOptionValues('#');
        java.lang.String str10 = commandLine0.getOptionValue("");
        java.lang.Object obj12 = commandLine0.getOptionObject('4');
        boolean boolean14 = commandLine0.hasOption('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
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
        java.util.Iterator iterator21 = commandLine0.iterator();
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
        org.junit.Assert.assertNotNull(iterator21);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray8 = commandLine0.getOptionValues('#');
        java.lang.String[] strArray10 = commandLine0.getOptionValues(' ');
        java.lang.Object obj12 = commandLine0.getOptionObject('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.Object obj10 = commandLine0.getOptionObject('a');
        boolean boolean12 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray14 = commandLine0.getOptionValues('a');
        java.lang.Object obj16 = commandLine0.getOptionObject('a');
        java.lang.Class<?> wildcardClass17 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
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
        boolean boolean26 = commandLine0.hasOption("hi!");
        java.lang.String str29 = commandLine0.getOptionValue("hi!", "");
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.util.List list8 = commandLine0.getArgList();
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.util.Iterator iterator10 = commandLine0.iterator();
        java.lang.String str12 = commandLine0.getOptionValue('4');
        java.lang.Object obj14 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray16 = commandLine0.getOptionValues('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String str12 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str14 = commandLine0.getOptionValue("");
        java.lang.String str16 = commandLine0.getOptionValue(' ');
        java.util.List list17 = commandLine0.getArgList();
        java.lang.String str19 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.String str11 = commandLine0.getOptionValue('#', "");
        java.lang.String[] strArray13 = commandLine0.getOptionValues('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String str12 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str14 = commandLine0.getOptionValue("");
        java.lang.String str16 = commandLine0.getOptionValue(' ');
        java.util.List list17 = commandLine0.getArgList();
        java.lang.String[] strArray19 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(strArray19);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray6 = commandLine0.getOptions();
        java.util.List list7 = commandLine0.getArgList();
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray10 = commandLine0.getArgs();
        boolean boolean12 = commandLine0.hasOption("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray6);
        org.junit.Assert.assertArrayEquals(optionArray6, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
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
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.Object obj10 = commandLine0.getOptionObject('#');
        java.lang.Object obj12 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.lang.String[] strArray15 = commandLine0.getOptionValues("hi!");
        boolean boolean17 = commandLine0.hasOption("hi!");
        boolean boolean19 = commandLine0.hasOption("hi!");
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
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.util.List list8 = commandLine0.getArgList();
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "hi!");
        boolean boolean15 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.String str10 = commandLine0.getOptionValue("", "");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String[] strArray12 = commandLine0.getArgs();
        boolean boolean14 = commandLine0.hasOption('#');
        java.lang.String str16 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray18 = commandLine0.getOptionValues('4');
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
        org.junit.Assert.assertNull(strArray18);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        boolean boolean10 = commandLine0.hasOption("");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String str13 = commandLine0.getOptionValue('4');
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray8 = commandLine0.getOptionValues('#');
        java.lang.String str10 = commandLine0.getOptionValue("");
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "");
        boolean boolean15 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray17 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        boolean boolean11 = commandLine0.hasOption('a');
        boolean boolean13 = commandLine0.hasOption('a');
        java.lang.String str15 = commandLine0.getOptionValue(' ');
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        boolean boolean11 = commandLine0.hasOption("hi!");
        boolean boolean13 = commandLine0.hasOption('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('a');
        java.lang.String str12 = commandLine0.getOptionValue('a');
        java.lang.Object obj14 = commandLine0.getOptionObject('4');
        java.lang.String str16 = commandLine0.getOptionValue('a');
        java.lang.Class<?> wildcardClass17 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str9 = commandLine0.getOptionValue("");
        boolean boolean11 = commandLine0.hasOption('a');
        commandLine0.addArg("");
        commandLine0.addArg("hi!");
        java.lang.String str18 = commandLine0.getOptionValue('4', "hi!");
        commandLine0.addArg("");
        java.lang.String str22 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
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
        java.lang.String[] strArray25 = commandLine0.getOptionValues('#');
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
        org.junit.Assert.assertNull(strArray25);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray8 = commandLine0.getOptionValues(' ');
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String[] strArray11 = commandLine0.getOptionValues('#');
        java.lang.String[] strArray13 = commandLine0.getOptionValues("");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String str9 = commandLine0.getOptionValue('a', "");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray9 = commandLine0.getOptionValues('#');
        java.lang.Object obj11 = commandLine0.getOptionObject(' ');
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray15 = commandLine0.getOptionValues('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = strArray15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.util.Iterator iterator10 = commandLine0.iterator();
        java.lang.String[] strArray12 = commandLine0.getOptionValues('a');
        commandLine0.addArg("");
        commandLine0.addArg("");
        java.lang.String str18 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        boolean boolean9 = commandLine0.hasOption("hi!");
        java.lang.String str12 = commandLine0.getOptionValue('#', "");
        commandLine0.addArg("hi!");
        java.lang.String[] strArray16 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray17 = commandLine0.getArgs();
        java.util.List list18 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray3 = commandLine0.getOptions();
        java.lang.Object obj5 = commandLine0.getOptionObject('4');
        java.lang.String str8 = commandLine0.getOptionValue(' ', "");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        commandLine0.addArg("");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.util.Iterator iterator13 = commandLine0.iterator();
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.String str17 = commandLine0.getOptionValue(' ', "hi!");
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
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.util.List list8 = commandLine0.getArgList();
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.String str12 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
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
        java.util.Iterator iterator20 = commandLine0.iterator();
        boolean boolean22 = commandLine0.hasOption("");
        boolean boolean24 = commandLine0.hasOption("");
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
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.Object obj10 = commandLine0.getOptionObject('#');
        java.lang.Object obj12 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
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
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.Object obj11 = commandLine0.getOptionObject('#');
        commandLine0.addArg("");
        java.lang.String[] strArray15 = commandLine0.getOptionValues('a');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
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
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String str5 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.lang.String str8 = commandLine0.getOptionValue(' ');
        boolean boolean10 = commandLine0.hasOption("");
        boolean boolean12 = commandLine0.hasOption("");
        java.lang.Object obj14 = commandLine0.getOptionObject('a');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.util.List list8 = commandLine0.getArgList();
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "hi!");
        commandLine0.addArg("hi!");
        java.lang.String str18 = commandLine0.getOptionValue(' ', "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.util.List list10 = commandLine0.getArgList();
        java.lang.String str12 = commandLine0.getOptionValue('a');
        java.util.Iterator iterator13 = commandLine0.iterator();
        java.lang.String str16 = commandLine0.getOptionValue('#', "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
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
        java.lang.Class<?> wildcardClass22 = optionArray21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.String[] strArray9 = commandLine0.getOptionValues("");
        java.lang.String str12 = commandLine0.getOptionValue('#', "hi!");
        boolean boolean14 = commandLine0.hasOption("");
        boolean boolean16 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
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
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.util.List list7 = commandLine0.getArgList();
        java.lang.String[] strArray9 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
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
        java.lang.String[] strArray16 = commandLine0.getOptionValues("");
        java.lang.String[] strArray17 = commandLine0.getArgs();
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
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "" });
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.String str13 = commandLine0.getOptionValue('4');
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        java.lang.Class<?> wildcardClass15 = commandLine0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        java.lang.String[] strArray4 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj6 = commandLine0.getOptionObject(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues('#');
        boolean boolean10 = commandLine0.hasOption('#');
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
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertArrayEquals(optionArray2, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('#');
        java.lang.Object obj10 = commandLine0.getOptionObject('a');
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
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String str5 = commandLine0.getOptionValue('a', "hi!");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String str8 = commandLine0.getOptionValue('a');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues(' ');
        org.apache.commons.cli.Option option13 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strArray12);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("hi!");
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
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.String[] strArray9 = commandLine0.getOptionValues('a');
        java.lang.String str11 = commandLine0.getOptionValue(' ');
        boolean boolean13 = commandLine0.hasOption('a');
        java.util.List list14 = commandLine0.getArgList();
        java.lang.String[] strArray16 = commandLine0.getOptionValues(' ');
        java.util.List list17 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('4', "");
        boolean boolean12 = commandLine0.hasOption("");
        java.util.Iterator iterator13 = commandLine0.iterator();
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.String str16 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
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
        java.lang.Class<?> wildcardClass18 = commandLine0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
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
        java.lang.Class<?> wildcardClass18 = commandLine0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        boolean boolean12 = commandLine0.hasOption("");
        java.lang.Class<?> wildcardClass13 = commandLine0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String str9 = commandLine0.getOptionValue('#');
        java.util.Iterator iterator10 = commandLine0.iterator();
        java.lang.String str12 = commandLine0.getOptionValue('4');
        java.lang.Object obj14 = commandLine0.getOptionObject(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        boolean boolean14 = commandLine0.hasOption('a');
        java.lang.Object obj16 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
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
        commandLine0.addArg("hi!");
        java.lang.String[] strArray21 = commandLine0.getArgs();
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
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        boolean boolean6 = commandLine0.hasOption("");
        java.lang.String str9 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str12 = commandLine0.getOptionValue(' ', "");
        java.lang.String str15 = commandLine0.getOptionValue("hi!", "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        boolean boolean16 = commandLine0.hasOption('a');
        java.lang.String[] strArray18 = commandLine0.getOptionValues('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(strArray18);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray3 = commandLine0.getOptions();
        java.lang.Object obj5 = commandLine0.getOptionObject('4');
        java.lang.String[] strArray7 = commandLine0.getOptionValues('a');
        java.lang.String str10 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String str13 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray15 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray16 = commandLine0.getOptions();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(optionArray3);
        org.junit.Assert.assertArrayEquals(optionArray3, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(optionArray16);
        org.junit.Assert.assertArrayEquals(optionArray16, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('4', "");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.util.List list12 = commandLine0.getArgList();
        java.lang.String[] strArray13 = commandLine0.getArgs();
        java.lang.String str16 = commandLine0.getOptionValue("", "");
        commandLine0.addArg("hi!");
        java.lang.String str21 = commandLine0.getOptionValue("", "");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        java.lang.String str7 = commandLine0.getOptionValue(' ', "hi!");
        commandLine0.addArg("");
        java.lang.String str11 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        commandLine0.addArg("");
        java.lang.String str17 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
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
        java.lang.Object obj19 = commandLine0.getOptionObject("");
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
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.lang.String str9 = commandLine0.getOptionValue("", "hi!");
        java.lang.String[] strArray11 = commandLine0.getOptionValues('a');
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        boolean boolean8 = commandLine0.hasOption("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.util.List list10 = commandLine0.getArgList();
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.lang.Object obj13 = commandLine0.getOptionObject("");
        java.lang.String[] strArray15 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        java.util.List list3 = commandLine0.getArgList();
        boolean boolean5 = commandLine0.hasOption("");
        java.lang.String str8 = commandLine0.getOptionValue('#', "");
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.Iterator iterator5 = commandLine0.iterator();
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        boolean boolean9 = commandLine0.hasOption("");
        java.lang.String[] strArray11 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.lang.String[] strArray14 = commandLine0.getOptionValues('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
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
        java.lang.String str18 = commandLine0.getOptionValue("");
        java.lang.String str21 = commandLine0.getOptionValue(' ', "");
        java.util.List list22 = commandLine0.getArgList();
        java.lang.Object obj24 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray26 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray28 = commandLine0.getOptionValues('4');
        java.util.Iterator iterator29 = commandLine0.iterator();
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
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNull(strArray28);
        org.junit.Assert.assertNotNull(iterator29);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.lang.String[] strArray10 = commandLine0.getOptionValues('#');
        java.lang.String str12 = commandLine0.getOptionValue('a');
        java.lang.String[] strArray14 = commandLine0.getOptionValues("");
        boolean boolean16 = commandLine0.hasOption("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.lang.String[] strArray13 = commandLine0.getArgs();
        java.lang.String[] strArray15 = commandLine0.getOptionValues("hi!");
        java.lang.String str18 = commandLine0.getOptionValue("hi!", "");
        java.util.Iterator iterator19 = commandLine0.iterator();
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
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(iterator19);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues(' ');
        boolean boolean4 = commandLine0.hasOption("");
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue('#');
        java.lang.String str11 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String str13 = commandLine0.getOptionValue("");
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.Class<?> wildcardClass15 = commandLine0.getClass();
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String[] strArray10 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.String[] strArray14 = commandLine0.getOptionValues('4');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.util.List list12 = commandLine0.getArgList();
        boolean boolean14 = commandLine0.hasOption("hi!");
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
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String str11 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.lang.String str14 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.util.Iterator iterator10 = commandLine0.iterator();
        java.util.List list11 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
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
        java.util.Iterator iterator19 = commandLine0.iterator();
        boolean boolean21 = commandLine0.hasOption("");
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
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String str11 = commandLine0.getOptionValue('a', "");
        java.lang.String str13 = commandLine0.getOptionValue("");
        java.lang.Object obj15 = commandLine0.getOptionObject('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.Object obj10 = commandLine0.getOptionObject('a');
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.util.Iterator iterator12 = commandLine0.iterator();
        commandLine0.addArg("");
        java.lang.String[] strArray16 = commandLine0.getOptionValues('#');
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
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
        boolean boolean19 = commandLine0.hasOption("");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
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
        java.util.Iterator iterator19 = commandLine0.iterator();
        java.lang.Class<?> wildcardClass20 = commandLine0.getClass();
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
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.String str13 = commandLine0.getOptionValue('a');
        boolean boolean15 = commandLine0.hasOption('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str9 = commandLine0.getOptionValue("");
        boolean boolean11 = commandLine0.hasOption('a');
        commandLine0.addArg("");
        commandLine0.addArg("hi!");
        java.lang.String[] strArray17 = commandLine0.getOptionValues('4');
        java.lang.String str19 = commandLine0.getOptionValue(' ');
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
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray14 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray16 = commandLine0.getOptionValues('a');
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str11 = commandLine0.getOptionValue("");
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('4', "");
        boolean boolean12 = commandLine0.hasOption("");
        java.util.Iterator iterator13 = commandLine0.iterator();
        java.lang.String[] strArray15 = commandLine0.getOptionValues('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray6 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        boolean boolean9 = commandLine0.hasOption('a');
        java.lang.String str11 = commandLine0.getOptionValue('a');
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
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.lang.String str11 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray14 = commandLine0.getArgs();
        java.lang.String[] strArray15 = commandLine0.getArgs();
        boolean boolean17 = commandLine0.hasOption(' ');
        java.lang.String str19 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
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
        org.apache.commons.cli.Option option21 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option21);
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
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.util.Iterator iterator2 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator2);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        boolean boolean8 = commandLine0.hasOption("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.util.Iterator iterator10 = commandLine0.iterator();
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.Class<?> wildcardClass12 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.util.List list8 = commandLine0.getArgList();
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.Object obj11 = commandLine0.getOptionObject('4');
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        boolean boolean16 = commandLine0.hasOption("");
        boolean boolean18 = commandLine0.hasOption("");
        java.lang.String str20 = commandLine0.getOptionValue('a');
        java.util.List list21 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.Object obj11 = commandLine0.getOptionObject("");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj4 = commandLine0.getOptionObject("hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.Iterator iterator5 = commandLine0.iterator();
        java.lang.Object obj7 = commandLine0.getOptionObject('4');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String str10 = commandLine0.getOptionValue("");
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
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        java.lang.String[] strArray4 = commandLine0.getOptionValues("hi!");
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str9 = commandLine0.getOptionValue("");
        boolean boolean11 = commandLine0.hasOption('a');
        java.lang.String[] strArray13 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertArrayEquals(optionArray2, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        java.util.Iterator iterator8 = commandLine0.iterator();
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String str11 = commandLine0.getOptionValue(' ');
        java.util.Iterator iterator12 = commandLine0.iterator();
        boolean boolean14 = commandLine0.hasOption('4');
        commandLine0.addArg("");
        java.lang.String[] strArray17 = commandLine0.getArgs();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "" });
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
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
        java.lang.String str21 = commandLine0.getOptionValue("hi!");
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
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption("");
        java.lang.String str10 = commandLine0.getOptionValue("hi!");
        java.lang.String str12 = commandLine0.getOptionValue(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String[] strArray6 = commandLine0.getOptionValues("");
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.Object obj10 = commandLine0.getOptionObject('#');
        java.util.List list11 = commandLine0.getArgList();
        boolean boolean13 = commandLine0.hasOption(' ');
        java.util.List list14 = commandLine0.getArgList();
        java.lang.String str17 = commandLine0.getOptionValue("", "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.util.List list10 = commandLine0.getArgList();
        java.util.List list11 = commandLine0.getArgList();
        java.lang.String[] strArray12 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.String str17 = commandLine0.getOptionValue(' ', "hi!");
        java.lang.String str19 = commandLine0.getOptionValue(' ');
        java.lang.Object obj21 = commandLine0.getOptionObject(' ');
        boolean boolean23 = commandLine0.hasOption('4');
        java.lang.Object obj25 = commandLine0.getOptionObject("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray3 = commandLine0.getOptions();
        java.lang.String[] strArray5 = commandLine0.getOptionValues(' ');
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String[] strArray7 = commandLine0.getArgs();
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray3);
        org.junit.Assert.assertArrayEquals(optionArray3, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
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
        boolean boolean24 = commandLine0.hasOption("");
        java.lang.String str27 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String str29 = commandLine0.getOptionValue('a');
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
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
        java.lang.String[] strArray14 = commandLine0.getArgs();
        java.util.Iterator iterator15 = commandLine0.iterator();
        java.lang.String str17 = commandLine0.getOptionValue('4');
        java.lang.Class<?> wildcardClass18 = commandLine0.getClass();
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
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        java.util.Iterator iterator10 = commandLine0.iterator();
        boolean boolean12 = commandLine0.hasOption('4');
        java.lang.Object obj14 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray16 = commandLine0.getOptionValues("");
        boolean boolean18 = commandLine0.hasOption("");
        java.lang.String[] strArray19 = commandLine0.getArgs();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] {});
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String str10 = commandLine0.getOptionValue("");
        java.lang.String str13 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray15 = commandLine0.getOptionValues('#');
        java.lang.Object obj17 = commandLine0.getOptionObject('4');
        java.lang.String str19 = commandLine0.getOptionValue("hi!");
        java.util.List list20 = commandLine0.getArgList();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray7 = commandLine0.getArgs();
        java.lang.String str9 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray7 = commandLine0.getArgs();
        java.lang.String str9 = commandLine0.getOptionValue("hi!");
        java.util.List list10 = commandLine0.getArgList();
        java.lang.Object obj12 = commandLine0.getOptionObject('4');
        java.lang.String str15 = commandLine0.getOptionValue("", "hi!");
        java.lang.Object obj17 = commandLine0.getOptionObject("hi!");
        java.lang.Object obj19 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str10 = commandLine0.getOptionValue('#', "hi!");
        java.lang.String str12 = commandLine0.getOptionValue("");
        java.lang.Object obj14 = commandLine0.getOptionObject('a');
        java.lang.String str17 = commandLine0.getOptionValue("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
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
        java.lang.String[] strArray16 = commandLine0.getArgs();
        java.lang.String str19 = commandLine0.getOptionValue(' ', "hi!");
        java.lang.Object obj21 = commandLine0.getOptionObject("hi!");
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
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "");
        commandLine0.addArg("");
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.String str17 = commandLine0.getOptionValue("", "");
        java.lang.Object obj19 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String str10 = commandLine0.getOptionValue('#');
        java.lang.String str12 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray14 = commandLine0.getOptionValues("hi!");
        java.lang.String str17 = commandLine0.getOptionValue("hi!", "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.util.Iterator iterator8 = commandLine0.iterator();
        java.lang.String str10 = commandLine0.getOptionValue("");
        java.lang.String[] strArray11 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str10 = commandLine0.getOptionValue('#', "hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        java.lang.String str14 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj16 = commandLine0.getOptionObject(' ');
        java.lang.String str19 = commandLine0.getOptionValue('4', "");
        org.apache.commons.cli.Option[] optionArray20 = commandLine0.getOptions();
        java.lang.String str22 = commandLine0.getOptionValue('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(optionArray20);
        org.junit.Assert.assertArrayEquals(optionArray20, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "hi!");
        java.util.Iterator iterator12 = commandLine0.iterator();
        boolean boolean14 = commandLine0.hasOption("");
        java.lang.String str16 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.lang.String[] strArray10 = commandLine0.getOptionValues('#');
        java.lang.String str12 = commandLine0.getOptionValue('a');
        boolean boolean14 = commandLine0.hasOption(' ');
        java.util.List list15 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.Object obj11 = commandLine0.getOptionObject("");
        boolean boolean13 = commandLine0.hasOption("hi!");
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.String[] strArray15 = commandLine0.getArgs();
        java.lang.String[] strArray17 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String str12 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String[] strArray14 = commandLine0.getOptionValues("hi!");
        java.lang.String str17 = commandLine0.getOptionValue("hi!", "hi!");
        boolean boolean19 = commandLine0.hasOption('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
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
        org.apache.commons.cli.Option[] optionArray17 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(optionArray17);
        org.junit.Assert.assertArrayEquals(optionArray17, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "");
        commandLine0.addArg("");
        java.util.Iterator iterator14 = commandLine0.iterator();
        org.apache.commons.cli.Option option15 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.String[] strArray10 = commandLine0.getOptionValues('#');
        boolean boolean12 = commandLine0.hasOption('#');
        java.lang.Object obj14 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray16 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
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
        java.lang.String str23 = commandLine0.getOptionValue('a', "");
        java.util.List list24 = commandLine0.getArgList();
        java.lang.String[] strArray26 = commandLine0.getOptionValues('4');
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNull(strArray26);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray9 = commandLine0.getOptionValues("hi!");
        commandLine0.addArg("hi!");
        java.lang.String[] strArray13 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray14 = commandLine0.getArgs();
        boolean boolean16 = commandLine0.hasOption(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray9 = commandLine0.getOptionValues('#');
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        java.lang.String str12 = commandLine0.getOptionValue('#');
        boolean boolean14 = commandLine0.hasOption(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.String str9 = commandLine0.getOptionValue('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
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
        java.lang.String[] strArray21 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray23 = commandLine0.getOptionValues("");
        java.lang.String[] strArray25 = commandLine0.getOptionValues('#');
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
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNull(strArray25);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
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
        java.lang.Object obj16 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String str13 = commandLine0.getOptionValue("", "hi!");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        java.lang.String str8 = commandLine0.getOptionValue('#');
        boolean boolean10 = commandLine0.hasOption("hi!");
        java.lang.String str13 = commandLine0.getOptionValue("", "");
        java.lang.Object obj15 = commandLine0.getOptionObject("");
        java.lang.String str17 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.Object obj8 = commandLine0.getOptionObject('a');
        commandLine0.addArg("hi!");
        java.util.List list11 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.String[] strArray9 = commandLine0.getOptionValues('a');
        java.lang.String str11 = commandLine0.getOptionValue(' ');
        boolean boolean13 = commandLine0.hasOption('a');
        java.util.List list14 = commandLine0.getArgList();
        java.lang.String str16 = commandLine0.getOptionValue(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray9 = commandLine0.getOptionValues('#');
        java.lang.String str12 = commandLine0.getOptionValue('a', "");
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.lang.Class<?> wildcardClass14 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        java.lang.String str11 = commandLine0.getOptionValue('a');
        java.lang.String str13 = commandLine0.getOptionValue('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
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
        java.lang.String str24 = commandLine0.getOptionValue("", "hi!");
        boolean boolean26 = commandLine0.hasOption("hi!");
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.String str10 = commandLine0.getOptionValue("", "");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String[] strArray12 = commandLine0.getArgs();
        boolean boolean14 = commandLine0.hasOption('#');
        java.lang.String[] strArray16 = commandLine0.getOptionValues('#');
        java.lang.String str18 = commandLine0.getOptionValue('#');
        java.lang.String str20 = commandLine0.getOptionValue('#');
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
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.util.List list8 = commandLine0.getArgList();
        java.util.Iterator iterator9 = commandLine0.iterator();
        boolean boolean11 = commandLine0.hasOption('a');
        java.lang.String[] strArray13 = commandLine0.getOptionValues('4');
        boolean boolean15 = commandLine0.hasOption(' ');
        boolean boolean17 = commandLine0.hasOption(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.util.List list9 = commandLine0.getArgList();
        java.lang.String str12 = commandLine0.getOptionValue('#', "hi!");
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        java.lang.String[] strArray4 = commandLine0.getOptionValues("hi!");
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str9 = commandLine0.getOptionValue("hi!");
        java.util.List list10 = commandLine0.getArgList();
        java.lang.String str12 = commandLine0.getOptionValue('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertArrayEquals(optionArray2, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('a');
        org.apache.commons.cli.Option[] optionArray3 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.lang.String str8 = commandLine0.getOptionValue(' ');
        java.lang.String str11 = commandLine0.getOptionValue("", "");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(optionArray3);
        org.junit.Assert.assertArrayEquals(optionArray3, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        java.util.Iterator iterator10 = commandLine0.iterator();
        boolean boolean12 = commandLine0.hasOption('4');
        java.lang.Object obj14 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray15 = commandLine0.getArgs();
        java.lang.Object obj17 = commandLine0.getOptionObject(' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
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
        commandLine0.addArg("");
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
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String str9 = commandLine0.getOptionValue('#');
        java.util.Iterator iterator10 = commandLine0.iterator();
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.lang.String[] strArray13 = commandLine0.getOptionValues('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
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
        org.apache.commons.cli.Option[] optionArray19 = commandLine0.getOptions();
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
        org.junit.Assert.assertNotNull(optionArray19);
        org.junit.Assert.assertArrayEquals(optionArray19, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
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
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.String[] strArray9 = commandLine0.getOptionValues('a');
        java.lang.String str11 = commandLine0.getOptionValue(' ');
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.util.Iterator iterator13 = commandLine0.iterator();
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.String str16 = commandLine0.getOptionValue('4');
        java.lang.Class<?> wildcardClass17 = commandLine0.getClass();
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
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.String str7 = commandLine0.getOptionValue(' ');
        java.util.Iterator iterator8 = commandLine0.iterator();
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String str11 = commandLine0.getOptionValue('a', "");
        commandLine0.addArg("");
        boolean boolean15 = commandLine0.hasOption('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
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
        java.lang.Object obj18 = commandLine0.getOptionObject("");
        java.util.List list19 = commandLine0.getArgList();
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
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.lang.String str8 = commandLine0.getOptionValue("", "hi!");
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        boolean boolean12 = commandLine0.hasOption('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        java.util.Iterator iterator10 = commandLine0.iterator();
        boolean boolean12 = commandLine0.hasOption('4');
        java.lang.String[] strArray14 = commandLine0.getOptionValues('4');
        java.util.List list15 = commandLine0.getArgList();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String str10 = commandLine0.getOptionValue('#');
        java.lang.String str12 = commandLine0.getOptionValue("hi!");
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
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str6 = commandLine0.getOptionValue('a', "hi!");
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
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
        org.apache.commons.cli.Option[] optionArray24 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray25 = commandLine0.getOptions();
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
        org.junit.Assert.assertNotNull(optionArray24);
        org.junit.Assert.assertArrayEquals(optionArray24, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray25);
        org.junit.Assert.assertArrayEquals(optionArray25, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str11 = commandLine0.getOptionValue(' ');
        java.lang.String str13 = commandLine0.getOptionValue("hi!");
        java.lang.String str16 = commandLine0.getOptionValue('#', "");
        boolean boolean18 = commandLine0.hasOption("hi!");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.util.List list9 = commandLine0.getArgList();
        java.lang.Object obj11 = commandLine0.getOptionObject("");
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        java.util.List list14 = commandLine0.getArgList();
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
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String str5 = commandLine0.getOptionValue('a', "hi!");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.Object obj8 = commandLine0.getOptionObject("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = obj8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        boolean boolean6 = commandLine0.hasOption("");
        java.lang.String str9 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str12 = commandLine0.getOptionValue(' ', "");
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('4', "");
        java.util.Iterator iterator11 = commandLine0.iterator();
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String str5 = commandLine0.getOptionValue('a', "hi!");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String str8 = commandLine0.getOptionValue('a');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues(' ');
        java.lang.Object obj14 = commandLine0.getOptionObject(' ');
        commandLine0.addArg("");
        boolean boolean18 = commandLine0.hasOption("hi!");
        java.lang.Class<?> wildcardClass19 = commandLine0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.String str6 = commandLine0.getOptionValue(' ', "");
        boolean boolean8 = commandLine0.hasOption(' ');
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        java.lang.String str12 = commandLine0.getOptionValue(' ');
        java.lang.Object obj14 = commandLine0.getOptionObject('a');
        java.lang.Object obj16 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray17 = commandLine0.getArgs();
        java.lang.Class<?> wildcardClass18 = strArray17.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        boolean boolean10 = commandLine0.hasOption(' ');
        boolean boolean12 = commandLine0.hasOption("");
        java.util.Iterator iterator13 = commandLine0.iterator();
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String[] strArray11 = commandLine0.getOptionValues(' ');
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        boolean boolean14 = commandLine0.hasOption("");
        java.util.Iterator iterator15 = commandLine0.iterator();
        boolean boolean17 = commandLine0.hasOption('a');
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
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        java.lang.String str11 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj13 = commandLine0.getOptionObject("");
        commandLine0.addArg("");
        java.lang.String str17 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray19 = commandLine0.getOptionValues(' ');
        boolean boolean21 = commandLine0.hasOption('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        java.lang.String str16 = commandLine0.getOptionValue("hi!", "");
        org.apache.commons.cli.Option[] optionArray17 = commandLine0.getOptions();
        java.lang.Object obj19 = commandLine0.getOptionObject('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(optionArray17);
        org.junit.Assert.assertArrayEquals(optionArray17, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
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
        java.lang.String str21 = commandLine0.getOptionValue("");
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
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray6 = commandLine0.getOptions();
        java.util.List list7 = commandLine0.getArgList();
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray11 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        java.lang.String str16 = commandLine0.getOptionValue("hi!", "");
        java.lang.String[] strArray17 = commandLine0.getArgs();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray6);
        org.junit.Assert.assertArrayEquals(optionArray6, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String str5 = commandLine0.getOptionValue("");
        boolean boolean7 = commandLine0.hasOption("hi!");
        java.lang.String str10 = commandLine0.getOptionValue("", "hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("");
        java.lang.Object obj14 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray16 = commandLine0.getOptionValues("");
        java.lang.Object obj18 = commandLine0.getOptionObject("hi!");
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
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
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
        commandLine0.addArg("hi!");
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
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.String str13 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray14 = commandLine0.getArgs();
        java.lang.String str17 = commandLine0.getOptionValue(' ', "hi!");
        java.lang.Object obj19 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String str11 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        java.lang.String str16 = commandLine0.getOptionValue("", "");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue('a');
        java.lang.String[] strArray10 = commandLine0.getOptionValues("hi!");
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "");
        commandLine0.addArg("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        java.lang.String str11 = commandLine0.getOptionValue("hi!");
        java.lang.String str13 = commandLine0.getOptionValue('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues(' ');
        boolean boolean4 = commandLine0.hasOption("");
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue('#');
        java.lang.String str11 = commandLine0.getOptionValue('a', "hi!");
        java.lang.Object obj13 = commandLine0.getOptionObject('4');
        java.lang.Object obj15 = commandLine0.getOptionObject(' ');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('a');
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        boolean boolean13 = commandLine0.hasOption('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue("", "hi!");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.lang.String str9 = commandLine0.getOptionValue('#', "hi!");
        boolean boolean11 = commandLine0.hasOption("hi!");
        java.lang.String str14 = commandLine0.getOptionValue("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String str10 = commandLine0.getOptionValue('#');
        java.lang.String str12 = commandLine0.getOptionValue("hi!");
        boolean boolean14 = commandLine0.hasOption("");
        java.util.List list15 = commandLine0.getArgList();
        java.lang.Object obj17 = commandLine0.getOptionObject(' ');
        org.apache.commons.cli.Option[] optionArray18 = commandLine0.getOptions();
        java.lang.String str20 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(optionArray18);
        org.junit.Assert.assertArrayEquals(optionArray18, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        boolean boolean7 = commandLine0.hasOption("");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.Object obj10 = commandLine0.getOptionObject('a');
        java.lang.Object obj12 = commandLine0.getOptionObject('4');
        java.lang.Class<?> wildcardClass13 = commandLine0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue('a');
        boolean boolean10 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
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
        java.lang.String str21 = commandLine0.getOptionValue('a');
        java.lang.String str23 = commandLine0.getOptionValue("hi!");
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
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        boolean boolean10 = commandLine0.hasOption("");
        java.lang.Object obj12 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
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
        java.lang.String[] strArray15 = commandLine0.getOptionValues(' ');
        java.util.List list16 = commandLine0.getArgList();
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
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.lang.String str11 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        java.util.Iterator iterator14 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray7 = commandLine0.getArgs();
        java.lang.String str9 = commandLine0.getOptionValue("hi!");
        java.util.List list10 = commandLine0.getArgList();
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
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
        commandLine0.addArg("");
        java.util.Iterator iterator25 = commandLine0.iterator();
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
        org.junit.Assert.assertNotNull(iterator25);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        java.util.List list10 = commandLine0.getArgList();
        java.lang.String[] strArray11 = commandLine0.getArgs();
        java.util.List list12 = commandLine0.getArgList();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String str13 = commandLine0.getOptionValue("", "");
        java.lang.String str16 = commandLine0.getOptionValue('4', "");
        java.lang.String str18 = commandLine0.getOptionValue('4');
        java.lang.String str21 = commandLine0.getOptionValue("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
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
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        java.lang.String str12 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String str15 = commandLine0.getOptionValue('#', "hi!");
        java.util.Iterator iterator16 = commandLine0.iterator();
        java.lang.String[] strArray18 = commandLine0.getOptionValues('#');
        java.lang.Object obj20 = commandLine0.getOptionObject("");
        boolean boolean22 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
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
        java.util.Iterator iterator24 = commandLine0.iterator();
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
        org.junit.Assert.assertNotNull(iterator24);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        boolean boolean10 = commandLine0.hasOption("");
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String str14 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.List list17 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "");
        commandLine0.addArg("");
        java.lang.Object obj15 = commandLine0.getOptionObject("hi!");
        org.apache.commons.cli.Option[] optionArray16 = commandLine0.getOptions();
        java.lang.String str19 = commandLine0.getOptionValue('a', "");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(optionArray16);
        org.junit.Assert.assertArrayEquals(optionArray16, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray12 = commandLine0.getOptionValues('a');
        java.lang.String str14 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray15 = commandLine0.getArgs();
        boolean boolean17 = commandLine0.hasOption(' ');
        boolean boolean19 = commandLine0.hasOption('4');
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
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String[] strArray8 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String str11 = commandLine0.getOptionValue('a');
        java.lang.String[] strArray13 = commandLine0.getOptionValues('a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String[] strArray6 = commandLine0.getOptionValues("");
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.Object obj10 = commandLine0.getOptionObject('#');
        java.lang.Object obj12 = commandLine0.getOptionObject('#');
        java.util.List list13 = commandLine0.getArgList();
        java.lang.String str16 = commandLine0.getOptionValue('a', "hi!");
        java.lang.Object obj18 = commandLine0.getOptionObject("hi!");
        java.lang.Object obj20 = commandLine0.getOptionObject('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        java.lang.String str7 = commandLine0.getOptionValue(' ', "hi!");
        commandLine0.addArg("");
        java.lang.String str11 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        java.lang.String str17 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray19 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(strArray19);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str8 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String str12 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj14 = commandLine0.getOptionObject(' ');
        java.util.List list15 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.util.Iterator iterator18 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(iterator18);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('4', "");
        java.lang.String str13 = commandLine0.getOptionValue("", "hi!");
        java.util.List list14 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray15 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(optionArray15);
        org.junit.Assert.assertArrayEquals(optionArray15, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
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
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
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
        java.util.List list18 = commandLine0.getArgList();
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
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String str10 = commandLine0.getOptionValue("");
        java.lang.Object obj12 = commandLine0.getOptionObject('4');
        java.lang.Object obj14 = commandLine0.getOptionObject("hi!");
        java.util.List list15 = commandLine0.getArgList();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("");
        java.lang.String str16 = commandLine0.getOptionValue("", "");
        java.lang.Class<?> wildcardClass17 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
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
        java.lang.String[] strArray17 = commandLine0.getOptionValues('a');
        java.lang.String str20 = commandLine0.getOptionValue(' ', "hi!");
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
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.String str10 = commandLine0.getOptionValue('4');
        commandLine0.addArg("hi!");
        java.lang.String str15 = commandLine0.getOptionValue("hi!", "hi!");
        boolean boolean17 = commandLine0.hasOption(' ');
        java.util.Iterator iterator18 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator18);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.Object obj10 = commandLine0.getOptionObject('a');
        java.util.Iterator iterator11 = commandLine0.iterator();
        java.lang.String str14 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray16 = commandLine0.getOptionValues('a');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.Object obj11 = commandLine0.getOptionObject("");
        boolean boolean13 = commandLine0.hasOption("hi!");
        java.util.Iterator iterator14 = commandLine0.iterator();
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
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
        java.lang.String[] strArray16 = commandLine0.getArgs();
        java.util.Iterator iterator17 = commandLine0.iterator();
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
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String str5 = commandLine0.getOptionValue('a', "hi!");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String str8 = commandLine0.getOptionValue('a');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray12 = commandLine0.getOptionValues(' ');
        java.lang.String str15 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray16 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray17 = commandLine0.getOptions();
        java.util.List list18 = commandLine0.getArgList();
        java.util.Iterator iterator19 = commandLine0.iterator();
        java.lang.Object obj21 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(optionArray17);
        org.junit.Assert.assertArrayEquals(optionArray17, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray8 = commandLine0.getOptionValues(' ');
        commandLine0.addArg("");
        java.lang.String str12 = commandLine0.getOptionValue('4');
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
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.lang.String str11 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        java.lang.Object obj15 = commandLine0.getOptionObject('4');
        commandLine0.addArg("hi!");
        java.lang.String str19 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('#');
        boolean boolean11 = commandLine0.hasOption('4');
        boolean boolean13 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.util.List list8 = commandLine0.getArgList();
        boolean boolean10 = commandLine0.hasOption('4');
        java.lang.String[] strArray12 = commandLine0.getOptionValues('4');
        java.lang.String str14 = commandLine0.getOptionValue("");
        java.util.List list15 = commandLine0.getArgList();
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
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("");
        java.lang.String str13 = commandLine0.getOptionValue("", "");
        java.lang.String str16 = commandLine0.getOptionValue("hi!", "hi!");
        boolean boolean18 = commandLine0.hasOption('4');
        java.lang.Object obj20 = commandLine0.getOptionObject("hi!");
        org.apache.commons.cli.Option[] optionArray21 = commandLine0.getOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(optionArray21);
        org.junit.Assert.assertArrayEquals(optionArray21, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("hi!");
        java.lang.Object obj8 = commandLine0.getOptionObject("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.Object obj13 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        boolean boolean10 = commandLine0.hasOption(' ');
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
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
        java.lang.Object obj20 = commandLine0.getOptionObject("");
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
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
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
        org.apache.commons.cli.Option[] optionArray16 = commandLine0.getOptions();
        java.util.List list17 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(optionArray16);
        org.junit.Assert.assertArrayEquals(optionArray16, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        commandLine0.addArg("hi!");
        java.lang.String str12 = commandLine0.getOptionValue('a');
        boolean boolean14 = commandLine0.hasOption('#');
        java.util.List list15 = commandLine0.getArgList();
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String[] strArray8 = commandLine0.getOptionValues(' ');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        java.lang.Class<?> wildcardClass11 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject('a');
        boolean boolean9 = commandLine0.hasOption('#');
        java.util.Iterator iterator10 = commandLine0.iterator();
        java.lang.String str13 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String str16 = commandLine0.getOptionValue(' ', "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String str10 = commandLine0.getOptionValue("");
        java.lang.String str13 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray15 = commandLine0.getOptionValues('#');
        java.lang.String[] strArray16 = commandLine0.getArgs();
        java.lang.Class<?> wildcardClass17 = commandLine0.getClass();
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
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
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
        java.lang.String[] strArray17 = commandLine0.getOptionValues("hi!");
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
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String str10 = commandLine0.getOptionValue("");
        java.lang.Object obj12 = commandLine0.getOptionObject('4');
        java.lang.String str15 = commandLine0.getOptionValue("", "");
        java.lang.String str17 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray19 = commandLine0.getOptionValues("");
        commandLine0.addArg("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strArray19);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String str9 = commandLine0.getOptionValue('#');
        java.util.Iterator iterator10 = commandLine0.iterator();
        java.lang.String str12 = commandLine0.getOptionValue('4');
        java.lang.Class<?> wildcardClass13 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
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
        java.util.List list14 = commandLine0.getArgList();
        java.lang.String str16 = commandLine0.getOptionValue("hi!");
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
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        java.lang.String str13 = commandLine0.getOptionValue('#', "");
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        java.util.List list15 = commandLine0.getArgList();
        java.lang.String[] strArray17 = commandLine0.getOptionValues(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
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
        boolean boolean17 = commandLine0.hasOption('#');
        java.lang.String str19 = commandLine0.getOptionValue("");
        java.util.List list20 = commandLine0.getArgList();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String str6 = commandLine0.getOptionValue('#');
        java.lang.String str8 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        java.lang.String str13 = commandLine0.getOptionValue('#', "");
        org.apache.commons.cli.Option[] optionArray14 = commandLine0.getOptions();
        java.util.List list15 = commandLine0.getArgList();
        boolean boolean17 = commandLine0.hasOption("hi!");
        org.apache.commons.cli.Option[] optionArray18 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(optionArray18);
        org.junit.Assert.assertArrayEquals(optionArray18, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
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
        java.lang.String[] strArray17 = commandLine0.getOptionValues('4');
        java.util.Iterator iterator18 = commandLine0.iterator();
        java.lang.String str20 = commandLine0.getOptionValue("");
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
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        boolean boolean6 = commandLine0.hasOption("");
        java.lang.Object obj8 = commandLine0.getOptionObject("");
        boolean boolean10 = commandLine0.hasOption(' ');
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.util.List list13 = commandLine0.getArgList();
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
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray11 = commandLine0.getArgs();
        boolean boolean13 = commandLine0.hasOption(' ');
        java.lang.String str15 = commandLine0.getOptionValue("hi!");
        java.lang.String str18 = commandLine0.getOptionValue("hi!", "");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        commandLine0.addArg("hi!");
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        boolean boolean14 = commandLine0.hasOption('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str10 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        commandLine0.addArg("");
        java.lang.Object obj16 = commandLine0.getOptionObject("");
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
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
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
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("hi!");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        boolean boolean10 = commandLine0.hasOption('a');
        org.apache.commons.cli.Option option11 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String str5 = commandLine0.getOptionValue("");
        boolean boolean7 = commandLine0.hasOption("hi!");
        boolean boolean9 = commandLine0.hasOption("");
        commandLine0.addArg("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.String str10 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray12 = commandLine0.getOptionValues('#');
        java.lang.String str15 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str17 = commandLine0.getOptionValue(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.lang.String str8 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str12 = commandLine0.getOptionValue("", "");
        java.lang.String str14 = commandLine0.getOptionValue("");
        java.lang.String[] strArray16 = commandLine0.getOptionValues('a');
        java.lang.String str18 = commandLine0.getOptionValue('#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
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
        java.lang.Class<?> wildcardClass26 = commandLine0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
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
        java.lang.Object obj16 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray18 = commandLine0.getOptionValues("");
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
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(strArray18);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
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
        java.util.List list19 = commandLine0.getArgList();
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
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str11 = commandLine0.getOptionValue(' ');
        java.lang.String str14 = commandLine0.getOptionValue("hi!", "");
        java.util.List list15 = commandLine0.getArgList();
        java.lang.Object obj17 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.String[] strArray9 = commandLine0.getOptionValues("hi!");
        java.lang.String str11 = commandLine0.getOptionValue("hi!");
        java.lang.String str14 = commandLine0.getOptionValue('4', "");
        java.lang.String str17 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray18 = commandLine0.getOptions();
        java.lang.String str21 = commandLine0.getOptionValue('#', "hi!");
        boolean boolean23 = commandLine0.hasOption("");
        java.lang.String str25 = commandLine0.getOptionValue('a');
        java.lang.Object obj27 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(optionArray18);
        org.junit.Assert.assertArrayEquals(optionArray18, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
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
        java.lang.String str20 = commandLine0.getOptionValue('#');
        java.util.Iterator iterator21 = commandLine0.iterator();
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
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(iterator21);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
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
        java.lang.String str22 = commandLine0.getOptionValue('#');
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
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
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
        java.lang.String[] strArray18 = commandLine0.getOptionValues("");
        boolean boolean20 = commandLine0.hasOption('4');
        java.lang.String[] strArray22 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray23 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(optionArray23);
        org.junit.Assert.assertArrayEquals(optionArray23, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.util.List list11 = commandLine0.getArgList();
        java.lang.String[] strArray13 = commandLine0.getOptionValues('a');
        java.lang.String str16 = commandLine0.getOptionValue('4', "");
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String str11 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
        java.lang.String str15 = commandLine0.getOptionValue('#', "hi!");
        java.lang.String[] strArray17 = commandLine0.getOptionValues("");
        java.lang.String[] strArray18 = commandLine0.getArgs();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "" });
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        java.lang.Object obj9 = commandLine0.getOptionObject('#');
        java.lang.Object obj11 = commandLine0.getOptionObject("");
        java.lang.String[] strArray13 = commandLine0.getOptionValues("hi!");
        java.util.List list14 = commandLine0.getArgList();
        java.util.List list15 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String str11 = commandLine0.getOptionValue('#');
        java.lang.Object obj13 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray15 = commandLine0.getOptionValues("hi!");
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("hi!");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        boolean boolean5 = commandLine0.hasOption("");
        org.apache.commons.cli.Option option6 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandLine0.addOption(option6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Option.hashCode()\" because \"opt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        commandLine0.addArg("hi!");
        java.lang.String[] strArray13 = commandLine0.getOptionValues('4');
        java.lang.String[] strArray15 = commandLine0.getOptionValues("");
        java.lang.Object obj17 = commandLine0.getOptionObject(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String[] strArray6 = commandLine0.getOptionValues("");
        java.lang.String[] strArray8 = commandLine0.getOptionValues('4');
        java.lang.String[] strArray10 = commandLine0.getOptionValues('#');
        java.lang.String[] strArray11 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray12 = commandLine0.getOptions();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray12);
        org.junit.Assert.assertArrayEquals(optionArray12, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
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
        java.util.Iterator iterator21 = commandLine0.iterator();
        java.lang.Class<?> wildcardClass22 = commandLine0.getClass();
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
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        commandLine0.addArg("");
        boolean boolean8 = commandLine0.hasOption('4');
        boolean boolean10 = commandLine0.hasOption("");
        commandLine0.addArg("");
        boolean boolean14 = commandLine0.hasOption('#');
        java.lang.String[] strArray16 = commandLine0.getOptionValues(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.util.Iterator iterator7 = commandLine0.iterator();
        boolean boolean9 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.String str13 = commandLine0.getOptionValue('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray14 = commandLine0.getArgs();
        java.lang.String str16 = commandLine0.getOptionValue('a');
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
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
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
        commandLine0.addArg("hi!");
        java.lang.Object obj19 = commandLine0.getOptionObject('#');
        java.lang.String str21 = commandLine0.getOptionValue("");
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
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.util.List list8 = commandLine0.getArgList();
        java.lang.String str10 = commandLine0.getOptionValue('#');
        java.lang.String str12 = commandLine0.getOptionValue("hi!");
        boolean boolean14 = commandLine0.hasOption("");
        java.util.List list15 = commandLine0.getArgList();
        boolean boolean17 = commandLine0.hasOption("hi!");
        java.lang.Class<?> wildcardClass18 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
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
        java.lang.Class<?> wildcardClass24 = commandLine0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        java.lang.String str10 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj12 = commandLine0.getOptionObject(' ');
        boolean boolean14 = commandLine0.hasOption(' ');
        org.apache.commons.cli.Option[] optionArray15 = commandLine0.getOptions();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(optionArray15);
        org.junit.Assert.assertArrayEquals(optionArray15, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "");
        commandLine0.addArg("");
        java.lang.String[] strArray15 = commandLine0.getOptionValues("hi!");
        java.lang.String str17 = commandLine0.getOptionValue('4');
        boolean boolean19 = commandLine0.hasOption('#');
        boolean boolean21 = commandLine0.hasOption('4');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray8 = commandLine0.getOptionValues(' ');
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String str12 = commandLine0.getOptionValue("", "hi!");
        boolean boolean14 = commandLine0.hasOption("");
        java.lang.String[] strArray16 = commandLine0.getOptionValues('#');
        java.lang.String[] strArray17 = commandLine0.getArgs();
        java.util.Iterator iterator18 = commandLine0.iterator();
        commandLine0.addArg("");
        java.lang.Object obj22 = commandLine0.getOptionObject("hi!");
        java.util.List list23 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray8 = commandLine0.getOptionValues('#');
        java.lang.String str10 = commandLine0.getOptionValue("");
        java.lang.String str13 = commandLine0.getOptionValue("", "");
        commandLine0.addArg("hi!");
        java.lang.String[] strArray17 = commandLine0.getOptionValues('4');
        java.util.Iterator iterator18 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNotNull(iterator18);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.Object obj13 = commandLine0.getOptionObject(' ');
        java.lang.String str16 = commandLine0.getOptionValue('#', "hi!");
        java.util.Iterator iterator17 = commandLine0.iterator();
        java.lang.String[] strArray18 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "" });
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String str9 = commandLine0.getOptionValue('#', "");
        java.lang.String str11 = commandLine0.getOptionValue('4');
        java.lang.Object obj13 = commandLine0.getOptionObject('4');
        java.lang.String[] strArray15 = commandLine0.getOptionValues('a');
        boolean boolean17 = commandLine0.hasOption("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String str10 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray11 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
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
        java.lang.String str18 = commandLine0.getOptionValue("hi!", "");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
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
        java.util.List list20 = commandLine0.getArgList();
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
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        boolean boolean10 = commandLine0.hasOption('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
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
        java.lang.String[] strArray25 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray26 = commandLine0.getOptions();
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
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertNotNull(optionArray26);
        org.junit.Assert.assertArrayEquals(optionArray26, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str9 = commandLine0.getOptionValue("");
        boolean boolean11 = commandLine0.hasOption('4');
        java.lang.String[] strArray13 = commandLine0.getOptionValues('a');
        boolean boolean15 = commandLine0.hasOption(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.Iterator iterator5 = commandLine0.iterator();
        java.lang.Object obj7 = commandLine0.getOptionObject('4');
        boolean boolean9 = commandLine0.hasOption("");
        java.util.List list10 = commandLine0.getArgList();
        boolean boolean12 = commandLine0.hasOption('a');
        java.lang.String str15 = commandLine0.getOptionValue('#', "");
        java.lang.String str18 = commandLine0.getOptionValue('4', "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
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
        java.lang.String str17 = commandLine0.getOptionValue(' ', "hi!");
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
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String str5 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.lang.String str9 = commandLine0.getOptionValue('4', "hi!");
        boolean boolean11 = commandLine0.hasOption('4');
        java.lang.String str13 = commandLine0.getOptionValue('#');
        java.lang.Object obj15 = commandLine0.getOptionObject("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String str9 = commandLine0.getOptionValue('#');
        java.lang.String str11 = commandLine0.getOptionValue('a');
        boolean boolean13 = commandLine0.hasOption('4');
        java.lang.Object obj15 = commandLine0.getOptionObject('a');
        java.util.List list16 = commandLine0.getArgList();
        java.lang.Class<?> wildcardClass17 = commandLine0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray10 = commandLine0.getOptionValues("hi!");
        java.lang.String str13 = commandLine0.getOptionValue("", "");
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
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray8 = commandLine0.getOptionValues('#');
        java.lang.String str10 = commandLine0.getOptionValue("");
        java.lang.String str13 = commandLine0.getOptionValue("", "");
        java.lang.String str16 = commandLine0.getOptionValue("hi!", "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
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
        java.lang.Object obj27 = commandLine0.getOptionObject("hi!");
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
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.lang.String[] strArray11 = commandLine0.getArgs();
        java.lang.String str14 = commandLine0.getOptionValue('4', "");
        java.lang.String[] strArray16 = commandLine0.getOptionValues('4');
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
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.String str8 = commandLine0.getOptionValue("");
        java.lang.Object obj10 = commandLine0.getOptionObject('#');
        boolean boolean12 = commandLine0.hasOption("");
        commandLine0.addArg("");
        java.lang.String str17 = commandLine0.getOptionValue(' ', "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray9 = commandLine0.getOptionValues('#');
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        java.util.List list11 = commandLine0.getArgList();
        java.lang.Object obj13 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.lang.String[] strArray10 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray11 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str4 = commandLine0.getOptionValue("");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.String str7 = commandLine0.getOptionValue(' ');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.Object obj10 = commandLine0.getOptionObject("");
        java.util.List list11 = commandLine0.getArgList();
        java.lang.String str14 = commandLine0.getOptionValue("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        commandLine0.addArg("hi!");
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String str11 = commandLine0.getOptionValue('#');
        boolean boolean13 = commandLine0.hasOption('a');
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
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
        java.lang.String[] strArray19 = commandLine0.getOptionValues(' ');
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
        org.junit.Assert.assertNull(strArray19);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray2 = commandLine0.getOptions();
        boolean boolean4 = commandLine0.hasOption("");
        java.lang.Object obj6 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray2);
        org.junit.Assert.assertArrayEquals(optionArray2, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
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
        java.lang.String str21 = commandLine0.getOptionValue("");
        java.lang.String[] strArray23 = commandLine0.getOptionValues('#');
        java.lang.String[] strArray25 = commandLine0.getOptionValues("hi!");
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
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNull(strArray25);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.Object obj10 = commandLine0.getOptionObject('a');
        boolean boolean12 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray14 = commandLine0.getOptionValues('a');
        java.lang.Object obj16 = commandLine0.getOptionObject('a');
        java.util.List list17 = commandLine0.getArgList();
        java.lang.Object obj19 = commandLine0.getOptionObject('a');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
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
        java.lang.String str16 = commandLine0.getOptionValue('a');
        java.lang.String str19 = commandLine0.getOptionValue("", "hi!");
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
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
        org.apache.commons.cli.Option[] optionArray19 = commandLine0.getOptions();
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
        org.junit.Assert.assertNotNull(optionArray19);
        org.junit.Assert.assertArrayEquals(optionArray19, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
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
        java.lang.String str23 = commandLine0.getOptionValue("hi!", "");
        boolean boolean25 = commandLine0.hasOption("");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String str5 = commandLine0.getOptionValue('#');
        java.lang.String[] strArray7 = commandLine0.getOptionValues("");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
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
        java.lang.String str18 = commandLine0.getOptionValue("hi!", "hi!");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String str5 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        java.util.Iterator iterator7 = commandLine0.iterator();
        commandLine0.addArg("");
        commandLine0.addArg("hi!");
        commandLine0.addArg("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.Iterator iterator5 = commandLine0.iterator();
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        boolean boolean9 = commandLine0.hasOption("");
        java.lang.String[] strArray11 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.lang.String[] strArray14 = commandLine0.getOptionValues('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.Iterator iterator5 = commandLine0.iterator();
        commandLine0.addArg("hi!");
        boolean boolean9 = commandLine0.hasOption('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.Object obj9 = commandLine0.getOptionObject('a');
        java.lang.String str12 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String str15 = commandLine0.getOptionValue('#', "hi!");
        java.lang.String[] strArray17 = commandLine0.getOptionValues("");
        java.lang.String str19 = commandLine0.getOptionValue('a');
        java.util.List list20 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray21 = commandLine0.getOptions();
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
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(optionArray21);
        org.junit.Assert.assertArrayEquals(optionArray21, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.String str11 = commandLine0.getOptionValue("");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.lang.String str14 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray15 = commandLine0.getArgs();
        java.lang.String[] strArray17 = commandLine0.getOptionValues('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
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
        java.lang.String str17 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj19 = commandLine0.getOptionObject("hi!");
        java.lang.String str22 = commandLine0.getOptionValue('a', "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        java.util.Iterator iterator6 = commandLine0.iterator();
        java.util.List list7 = commandLine0.getArgList();
        java.lang.Object obj9 = commandLine0.getOptionObject('4');
        java.util.List list10 = commandLine0.getArgList();
        java.lang.String str12 = commandLine0.getOptionValue('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues(' ');
        boolean boolean4 = commandLine0.hasOption("");
        java.util.List list5 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray6 = commandLine0.getOptions();
        java.lang.String str9 = commandLine0.getOptionValue('#', "hi!");
        java.lang.String str11 = commandLine0.getOptionValue(' ');
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(optionArray6);
        org.junit.Assert.assertArrayEquals(optionArray6, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
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
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
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
        java.lang.Object obj21 = commandLine0.getOptionObject("");
        java.util.List list22 = commandLine0.getArgList();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
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
        java.lang.String str20 = commandLine0.getOptionValue(' ', "");
        boolean boolean22 = commandLine0.hasOption("hi!");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        java.lang.Object obj8 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray11 = commandLine0.getOptions();
        java.lang.String[] strArray13 = commandLine0.getOptionValues(' ');
        java.lang.String[] strArray15 = commandLine0.getOptionValues("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray11);
        org.junit.Assert.assertArrayEquals(optionArray11, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.Object obj10 = commandLine0.getOptionObject('a');
        boolean boolean12 = commandLine0.hasOption("");
        java.lang.Object obj14 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        boolean boolean12 = commandLine0.hasOption('a');
        java.util.Iterator iterator13 = commandLine0.iterator();
        java.lang.String[] strArray14 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue("");
        java.lang.String str8 = commandLine0.getOptionValue("hi!");
        java.lang.String str11 = commandLine0.getOptionValue('4', "");
        java.lang.String str13 = commandLine0.getOptionValue("");
        boolean boolean15 = commandLine0.hasOption(' ');
        java.lang.String str17 = commandLine0.getOptionValue('a');
        java.lang.Object obj19 = commandLine0.getOptionObject(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        java.lang.String[] strArray12 = commandLine0.getArgs();
        java.lang.String[] strArray13 = commandLine0.getArgs();
        java.lang.String[] strArray15 = commandLine0.getOptionValues("hi!");
        java.lang.String str18 = commandLine0.getOptionValue("hi!", "");
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
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
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
        org.apache.commons.cli.Option[] optionArray19 = commandLine0.getOptions();
        java.lang.String str22 = commandLine0.getOptionValue('#', "");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(optionArray19);
        org.junit.Assert.assertArrayEquals(optionArray19, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
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
        java.lang.String str18 = commandLine0.getOptionValue("hi!");
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
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
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
        java.lang.Object obj16 = commandLine0.getOptionObject(' ');
        java.util.List list17 = commandLine0.getArgList();
        java.lang.Class<?> wildcardClass18 = list17.getClass();
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
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
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
        org.apache.commons.cli.Option[] optionArray18 = commandLine0.getOptions();
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
        org.junit.Assert.assertNotNull(optionArray18);
        org.junit.Assert.assertArrayEquals(optionArray18, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray6 = commandLine0.getOptionValues(' ');
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.Object obj9 = commandLine0.getOptionObject("");
        java.util.Iterator iterator10 = commandLine0.iterator();
        java.lang.String str12 = commandLine0.getOptionValue("hi!");
        java.lang.String str14 = commandLine0.getOptionValue('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
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
        java.lang.String str17 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        java.lang.String[] strArray8 = commandLine0.getOptionValues(' ');
        java.lang.String str10 = commandLine0.getOptionValue('a');
        java.lang.String str12 = commandLine0.getOptionValue(' ');
        java.util.Iterator iterator13 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.util.List list8 = commandLine0.getArgList();
        boolean boolean10 = commandLine0.hasOption("");
        boolean boolean12 = commandLine0.hasOption('4');
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.lang.Object obj15 = commandLine0.getOptionObject("hi!");
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
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String str8 = commandLine0.getOptionValue('a');
        java.lang.String str11 = commandLine0.getOptionValue("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
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
        java.lang.String[] strArray16 = commandLine0.getOptionValues("hi!");
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
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('4');
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('#', "");
        boolean boolean12 = commandLine0.hasOption("");
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.util.List list14 = commandLine0.getArgList();
        java.lang.String[] strArray16 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
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
        java.lang.String str18 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj20 = commandLine0.getOptionObject('a');
        java.lang.String str22 = commandLine0.getOptionValue('4');
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.util.Iterator iterator5 = commandLine0.iterator();
        java.lang.String str8 = commandLine0.getOptionValue("", "");
        boolean boolean10 = commandLine0.hasOption('#');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.lang.Object obj7 = commandLine0.getOptionObject("");
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        boolean boolean12 = commandLine0.hasOption('a');
        java.util.List list13 = commandLine0.getArgList();
        java.lang.String str16 = commandLine0.getOptionValue("", "");
        java.util.Iterator iterator17 = commandLine0.iterator();
        java.lang.Class<?> wildcardClass18 = iterator17.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('#');
        org.apache.commons.cli.Option[] optionArray10 = commandLine0.getOptions();
        java.util.Iterator iterator11 = commandLine0.iterator();
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(optionArray10);
        org.junit.Assert.assertArrayEquals(optionArray10, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('4');
        java.lang.String[] strArray7 = commandLine0.getArgs();
        java.lang.String[] strArray9 = commandLine0.getOptionValues("");
        java.lang.Object obj11 = commandLine0.getOptionObject("");
        java.lang.String str14 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.String[] strArray16 = commandLine0.getOptionValues('4');
        java.lang.Object obj18 = commandLine0.getOptionObject("");
        java.lang.String str21 = commandLine0.getOptionValue("hi!", "hi!");
        java.lang.Object obj23 = commandLine0.getOptionObject('a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
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
        java.lang.String str17 = commandLine0.getOptionValue('4');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(optionArray14);
        org.junit.Assert.assertArrayEquals(optionArray14, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray15);
        org.junit.Assert.assertArrayEquals(optionArray15, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        java.lang.Object obj5 = commandLine0.getOptionObject("hi!");
        boolean boolean7 = commandLine0.hasOption('4');
        java.lang.String[] strArray8 = commandLine0.getArgs();
        java.lang.String[] strArray10 = commandLine0.getOptionValues('a');
        java.lang.String[] strArray12 = commandLine0.getOptionValues('a');
        java.util.Iterator iterator13 = commandLine0.iterator();
        java.util.List list14 = commandLine0.getArgList();
        java.lang.Class<?> wildcardClass15 = list14.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
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
        java.util.Iterator iterator16 = commandLine0.iterator();
        java.lang.String str18 = commandLine0.getOptionValue("hi!");
        java.util.List list19 = commandLine0.getArgList();
        java.lang.String str21 = commandLine0.getOptionValue("hi!");
        java.lang.String[] strArray23 = commandLine0.getOptionValues('#');
        commandLine0.addArg("");
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
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(strArray23);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
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
        java.lang.String str20 = commandLine0.getOptionValue('4', "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
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
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strArray19);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray2 = commandLine0.getOptionValues(' ');
        boolean boolean4 = commandLine0.hasOption("");
        java.util.List list5 = commandLine0.getArgList();
        org.apache.commons.cli.Option[] optionArray6 = commandLine0.getOptions();
        java.lang.String str9 = commandLine0.getOptionValue('a', "");
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(optionArray6);
        org.junit.Assert.assertArrayEquals(optionArray6, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        boolean boolean7 = commandLine0.hasOption("");
        java.lang.String str9 = commandLine0.getOptionValue("hi!");
        java.lang.Object obj11 = commandLine0.getOptionObject(' ');
        java.lang.Object obj13 = commandLine0.getOptionObject("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        java.lang.String[] strArray9 = commandLine0.getOptionValues("hi!");
        java.lang.String str11 = commandLine0.getOptionValue("hi!");
        java.lang.String str14 = commandLine0.getOptionValue('4', "");
        java.lang.String str17 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray18 = commandLine0.getOptions();
        boolean boolean20 = commandLine0.hasOption("hi!");
        java.lang.String[] strArray21 = commandLine0.getArgs();
        java.lang.String str23 = commandLine0.getOptionValue('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(optionArray18);
        org.junit.Assert.assertArrayEquals(optionArray18, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "" });
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String[] strArray5 = commandLine0.getOptionValues('4');
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('#', "");
        boolean boolean12 = commandLine0.hasOption("");
        org.apache.commons.cli.Option[] optionArray13 = commandLine0.getOptions();
        java.lang.String str15 = commandLine0.getOptionValue("hi!");
        java.util.List list16 = commandLine0.getArgList();
        java.lang.String[] strArray18 = commandLine0.getOptionValues("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(optionArray13);
        org.junit.Assert.assertArrayEquals(optionArray13, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(strArray18);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.lang.String[] strArray4 = commandLine0.getOptionValues('4');
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str9 = commandLine0.getOptionValue("");
        boolean boolean11 = commandLine0.hasOption('a');
        commandLine0.addArg("");
        java.util.Iterator iterator14 = commandLine0.iterator();
        java.lang.Object obj16 = commandLine0.getOptionObject('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str10 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray12 = commandLine0.getOptionValues("hi!");
        java.lang.String[] strArray14 = commandLine0.getOptionValues('4');
        java.lang.String[] strArray15 = commandLine0.getArgs();
        boolean boolean17 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
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
        java.util.Iterator iterator16 = commandLine0.iterator();
        java.lang.String[] strArray18 = commandLine0.getOptionValues("");
        java.lang.String str21 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str24 = commandLine0.getOptionValue("", "hi!");
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
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
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
        java.lang.String[] strArray21 = commandLine0.getOptionValues('4');
        java.lang.Object obj23 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.util.List list5 = commandLine0.getArgList();
        java.util.List list6 = commandLine0.getArgList();
        java.lang.String str9 = commandLine0.getOptionValue("", "hi!");
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        java.lang.String str14 = commandLine0.getOptionValue("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        java.lang.String str5 = commandLine0.getOptionValue('a', "");
        java.util.List list6 = commandLine0.getArgList();
        commandLine0.addArg("");
        java.util.List list9 = commandLine0.getArgList();
        java.lang.String str11 = commandLine0.getOptionValue('4');
        java.util.Iterator iterator12 = commandLine0.iterator();
        java.lang.String str15 = commandLine0.getOptionValue('a', "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        commandLine0.addArg("");
        java.lang.String[] strArray10 = commandLine0.getOptionValues('#');
        java.util.List list11 = commandLine0.getArgList();
        java.lang.String[] strArray13 = commandLine0.getOptionValues("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.util.List list5 = commandLine0.getArgList();
        java.lang.String str7 = commandLine0.getOptionValue("");
        java.lang.Object obj9 = commandLine0.getOptionObject("hi!");
        java.lang.Object obj11 = commandLine0.getOptionObject("hi!");
        boolean boolean13 = commandLine0.hasOption('#');
        boolean boolean15 = commandLine0.hasOption(' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        java.util.Iterator iterator3 = commandLine0.iterator();
        java.lang.String str5 = commandLine0.getOptionValue('#');
        java.lang.String str8 = commandLine0.getOptionValue('a', "");
        java.lang.String[] strArray9 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('a');
        java.lang.String str5 = commandLine0.getOptionValue("hi!", "");
        java.lang.Object obj7 = commandLine0.getOptionObject('4');
        java.lang.Object obj9 = commandLine0.getOptionObject(' ');
        java.lang.String[] strArray11 = commandLine0.getOptionValues("");
        boolean boolean13 = commandLine0.hasOption('a');
        java.lang.Object obj15 = commandLine0.getOptionObject('a');
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String str5 = commandLine0.getOptionValue('a', "hi!");
        java.lang.String[] strArray6 = commandLine0.getArgs();
        org.apache.commons.cli.Option[] optionArray7 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray8 = commandLine0.getOptions();
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(optionArray7);
        org.junit.Assert.assertArrayEquals(optionArray7, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray8);
        org.junit.Assert.assertArrayEquals(optionArray8, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
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
        commandLine0.addArg("");
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
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        org.apache.commons.cli.Option[] optionArray5 = commandLine0.getOptions();
        java.lang.Object obj7 = commandLine0.getOptionObject("hi!");
        java.lang.String str10 = commandLine0.getOptionValue('4', "");
        boolean boolean12 = commandLine0.hasOption("");
        java.lang.Object obj14 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray15 = commandLine0.getArgs();
        java.lang.String str17 = commandLine0.getOptionValue('4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(optionArray5);
        org.junit.Assert.assertArrayEquals(optionArray5, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        commandLine0.addArg("");
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String str6 = commandLine0.getOptionValue('#');
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String str6 = commandLine0.getOptionValue('4');
        java.lang.String[] strArray8 = commandLine0.getOptionValues(' ');
        java.util.Iterator iterator9 = commandLine0.iterator();
        java.lang.String str12 = commandLine0.getOptionValue("", "hi!");
        boolean boolean14 = commandLine0.hasOption("");
        java.lang.String[] strArray16 = commandLine0.getOptionValues('#');
        java.lang.String[] strArray17 = commandLine0.getArgs();
        java.util.Iterator iterator18 = commandLine0.iterator();
        commandLine0.addArg("");
        java.lang.Object obj22 = commandLine0.getOptionObject("hi!");
        java.lang.String str25 = commandLine0.getOptionValue("hi!", "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
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
        java.lang.String str20 = commandLine0.getOptionValue('4');
        java.lang.String str22 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.String[] strArray8 = commandLine0.getOptionValues("");
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        boolean boolean11 = commandLine0.hasOption('4');
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        commandLine0.addArg("");
        java.util.Iterator iterator7 = commandLine0.iterator();
        java.lang.String str9 = commandLine0.getOptionValue('a');
        commandLine0.addArg("hi!");
        java.util.Iterator iterator12 = commandLine0.iterator();
        java.lang.String str14 = commandLine0.getOptionValue("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.String str7 = commandLine0.getOptionValue(' ', "");
        java.lang.String[] strArray9 = commandLine0.getOptionValues('a');
        java.util.List list10 = commandLine0.getArgList();
        java.lang.String str12 = commandLine0.getOptionValue("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.util.Iterator iterator3 = commandLine0.iterator();
        org.apache.commons.cli.Option[] optionArray4 = commandLine0.getOptions();
        java.lang.String str7 = commandLine0.getOptionValue('4', "hi!");
        java.lang.String[] strArray8 = commandLine0.getArgs();
        boolean boolean10 = commandLine0.hasOption("hi!");
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(optionArray4);
        org.junit.Assert.assertArrayEquals(optionArray4, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        commandLine0.addArg("");
        java.lang.String[] strArray3 = commandLine0.getArgs();
        java.lang.String str6 = commandLine0.getOptionValue('#', "");
        boolean boolean8 = commandLine0.hasOption('a');
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str12 = commandLine0.getOptionValue("", "");
        java.lang.String[] strArray14 = commandLine0.getOptionValues('4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(strArray14);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
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
        java.lang.Class<?> wildcardClass15 = commandLine0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
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
        java.lang.String[] strArray23 = commandLine0.getOptionValues("hi!");
        java.lang.String str26 = commandLine0.getOptionValue("", "hi!");
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
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.Object obj2 = commandLine0.getOptionObject('a');
        java.lang.String[] strArray4 = commandLine0.getOptionValues('a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = strArray4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(strArray4);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('4');
        java.lang.String[] strArray8 = commandLine0.getOptionValues('a');
        java.lang.Object obj10 = commandLine0.getOptionObject("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
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
        java.lang.Object obj16 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray17 = commandLine0.getArgs();
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
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "" });
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
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
        java.lang.String[] strArray21 = commandLine0.getOptionValues('4');
        java.util.List list22 = commandLine0.getArgList();
        boolean boolean24 = commandLine0.hasOption("");
        commandLine0.addArg("");
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        boolean boolean2 = commandLine0.hasOption('a');
        boolean boolean4 = commandLine0.hasOption("hi!");
        java.lang.String str7 = commandLine0.getOptionValue("hi!", "");
        java.lang.String str10 = commandLine0.getOptionValue('#', "hi!");
        java.lang.String str12 = commandLine0.getOptionValue('#');
        java.lang.Object obj14 = commandLine0.getOptionObject("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = obj14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
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
        java.util.List list16 = commandLine0.getArgList();
        commandLine0.addArg("hi!");
        boolean boolean20 = commandLine0.hasOption("");
        java.util.Iterator iterator21 = commandLine0.iterator();
        org.apache.commons.cli.Option[] optionArray22 = commandLine0.getOptions();
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
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(optionArray22);
        org.junit.Assert.assertArrayEquals(optionArray22, new org.apache.commons.cli.Option[] {});
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
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
        java.lang.Object obj18 = commandLine0.getOptionObject("hi!");
        java.lang.Object obj20 = commandLine0.getOptionObject("");
        java.lang.String str22 = commandLine0.getOptionValue('#');
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
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.lang.String[] strArray1 = commandLine0.getArgs();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        java.lang.String[] strArray6 = commandLine0.getOptionValues("");
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        java.lang.Object obj10 = commandLine0.getOptionObject('#');
        java.util.List list11 = commandLine0.getArgList();
        boolean boolean13 = commandLine0.hasOption(' ');
        java.lang.String str16 = commandLine0.getOptionValue("", "hi!");
        java.lang.String[] strArray17 = commandLine0.getArgs();
        java.lang.String str20 = commandLine0.getOptionValue('4', "hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String[] strArray2 = commandLine0.getArgs();
        boolean boolean4 = commandLine0.hasOption('a');
        java.lang.Object obj6 = commandLine0.getOptionObject('#');
        java.lang.String[] strArray7 = commandLine0.getArgs();
        java.lang.String[] strArray8 = commandLine0.getArgs();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        org.apache.commons.cli.CommandLine commandLine0 = new org.apache.commons.cli.CommandLine();
        java.util.Iterator iterator1 = commandLine0.iterator();
        java.lang.String str4 = commandLine0.getOptionValue("", "hi!");
        boolean boolean6 = commandLine0.hasOption('#');
        java.lang.Object obj8 = commandLine0.getOptionObject('4');
        org.apache.commons.cli.Option[] optionArray9 = commandLine0.getOptions();
        java.lang.String str12 = commandLine0.getOptionValue('a', "hi!");
        boolean boolean14 = commandLine0.hasOption("");
        java.lang.String str16 = commandLine0.getOptionValue("");
        java.util.Iterator iterator17 = commandLine0.iterator();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(optionArray9);
        org.junit.Assert.assertArrayEquals(optionArray9, new org.apache.commons.cli.Option[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(iterator17);
    }
}

