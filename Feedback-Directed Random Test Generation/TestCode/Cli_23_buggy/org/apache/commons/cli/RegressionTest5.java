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
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setArgName("arg");
        java.lang.String str16 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str17 = helpFormatter0.getOptPrefix();
        java.lang.String str18 = helpFormatter0.defaultOptPrefix;
        java.lang.String str19 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str20 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "--" + "'", str19, "--");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "--" + "'", str20, "--");
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter3 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str5 = helpFormatter3.rtrim("arg");
        java.lang.String str6 = helpFormatter3.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter3.defaultOptPrefix;
        java.util.Comparator comparator8 = helpFormatter3.getOptionComparator();
        helpFormatter0.optionComparator = comparator8;
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str12 = helpFormatter10.rtrim("arg");
        java.lang.String str13 = helpFormatter10.defaultSyntaxPrefix;
        java.util.Comparator comparator14 = helpFormatter10.optionComparator;
        helpFormatter0.setOptionComparator(comparator14);
        helpFormatter0.defaultOptPrefix = "arg";
        java.util.Comparator comparator18 = helpFormatter0.getOptionComparator();
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer23 = helpFormatter0.renderWrappedText(stringBuffer19, 12, 1, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuffer.append(String)\" because \"sb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertNotNull(comparator18);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth(74);
        helpFormatter0.defaultLeftPad = 3;
        java.util.Comparator comparator10 = helpFormatter0.optionComparator;
        java.lang.String str11 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setLeftPadding((int) (short) 1);
        java.util.Comparator comparator10 = helpFormatter0.getOptionComparator();
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str7 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str10 = helpFormatter8.rtrim("arg");
        helpFormatter8.defaultOptPrefix = "--";
        helpFormatter8.setOptPrefix("-");
        helpFormatter8.setDescPadding(1);
        java.util.Comparator comparator17 = null;
        helpFormatter8.optionComparator = comparator17;
        int int22 = helpFormatter8.findWrapPos("hi!", (int) 'a', (int) (byte) -1);
        helpFormatter8.setDescPadding((int) '#');
        org.apache.commons.cli.HelpFormatter helpFormatter25 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str27 = helpFormatter25.rtrim("arg");
        helpFormatter25.defaultOptPrefix = "--";
        helpFormatter25.setOptPrefix("-");
        helpFormatter25.setDescPadding(1);
        helpFormatter25.defaultDescPad = (short) 100;
        java.util.Comparator comparator36 = helpFormatter25.optionComparator;
        java.lang.String str38 = helpFormatter25.rtrim("\n");
        java.util.Comparator comparator39 = helpFormatter25.getOptionComparator();
        helpFormatter8.setOptionComparator(comparator39);
        helpFormatter0.optionComparator = comparator39;
        helpFormatter0.defaultArgName = "                                                                                       ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "arg" + "'", str27, "arg");
        org.junit.Assert.assertNotNull(comparator36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(comparator39);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        java.lang.String str9 = helpFormatter0.getNewLine();
        helpFormatter0.defaultDescPad = '#';
        helpFormatter0.setNewLine("--");
        int int14 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultLeftPad = (short) 10;
        helpFormatter0.setArgName("\n");
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, (int) (short) 1, 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        int int10 = helpFormatter0.getDescPadding();
        java.lang.String str11 = helpFormatter0.getArgName();
        int int12 = helpFormatter0.getDescPadding();
        helpFormatter0.setSyntaxPrefix("                                   ");
        org.apache.commons.cli.HelpFormatter helpFormatter15 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str17 = helpFormatter15.rtrim("arg");
        java.lang.String str18 = helpFormatter15.getNewLine();
        java.lang.String str19 = helpFormatter15.getOptPrefix();
        helpFormatter15.setNewLine("usage: ");
        helpFormatter15.setWidth(3);
        helpFormatter15.defaultLeftPad = (byte) 1;
        helpFormatter15.defaultLongOptPrefix = "arg";
        java.util.Comparator comparator28 = helpFormatter15.optionComparator;
        helpFormatter0.optionComparator = comparator28;
        int int30 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-" + "'", str19, "-");
        org.junit.Assert.assertNotNull(comparator28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        int int9 = helpFormatter0.findWrapPos("-", (int) (short) 100, 74);
        helpFormatter0.setArgName("          ");
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                   ", options13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultDescPad = (short) 100;
        java.util.Comparator comparator11 = helpFormatter0.optionComparator;
        helpFormatter0.setArgName("   ");
        org.apache.commons.cli.HelpFormatter helpFormatter14 = new org.apache.commons.cli.HelpFormatter();
        int int15 = helpFormatter14.defaultDescPad;
        helpFormatter14.defaultSyntaxPrefix = "\n";
        java.lang.String str18 = helpFormatter14.defaultNewLine;
        java.util.Comparator comparator19 = helpFormatter14.getOptionComparator();
        helpFormatter0.optionComparator = comparator19;
        int int21 = helpFormatter0.getWidth();
        int int22 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultOptPrefix = "                                                                                       ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 74 + "'", int21 == 74);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 74 + "'", int22 == 74);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setLongOptPrefix("hi!");
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultLongOptPrefix = "                                   ";
        int int12 = helpFormatter0.defaultWidth;
        java.util.Comparator comparator13 = helpFormatter0.getOptionComparator();
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 0, "--", "         ", options17, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:        --");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
        org.junit.Assert.assertNotNull(comparator13);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.rtrim("--");
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultOptPrefix = "";
        helpFormatter0.setSyntaxPrefix("--");
        java.lang.String str13 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter3 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str5 = helpFormatter3.rtrim("arg");
        java.lang.String str6 = helpFormatter3.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter3.defaultOptPrefix;
        java.util.Comparator comparator8 = helpFormatter3.getOptionComparator();
        helpFormatter0.optionComparator = comparator8;
        int int13 = helpFormatter0.findWrapPos("\n", (int) '#', 1);
        int int14 = helpFormatter0.getWidth();
        helpFormatter0.setLeftPadding((int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        java.lang.String str4 = helpFormatter0.defaultSyntaxPrefix;
        int int8 = helpFormatter0.findWrapPos("-", (int) (short) 100, (int) (short) -1);
        helpFormatter0.defaultSyntaxPrefix = "                                                                         ";
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                         " + "'", str12, "                                                                         ");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter3 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str5 = helpFormatter3.rtrim("arg");
        java.lang.String str6 = helpFormatter3.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter3.defaultOptPrefix;
        java.util.Comparator comparator8 = helpFormatter3.getOptionComparator();
        helpFormatter0.optionComparator = comparator8;
        int int13 = helpFormatter0.findWrapPos("usage: ", 3, (int) (short) 10);
        helpFormatter0.setArgName("   ");
        java.lang.Class<?> wildcardClass16 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultDescPad = (short) 100;
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str13 = helpFormatter11.rtrim("arg");
        java.lang.String str14 = helpFormatter11.defaultSyntaxPrefix;
        java.util.Comparator comparator15 = helpFormatter11.optionComparator;
        helpFormatter0.setOptionComparator(comparator15);
        int int20 = helpFormatter0.findWrapPos("\n", (int) 'a', 0);
        java.lang.String str21 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter22 = null;
        org.apache.commons.cli.Options options24 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter22, 12, options24, 87, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.rtrim("            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.util.Comparator comparator5 = null;
        helpFormatter0.setOptionComparator(comparator5);
        java.lang.String str7 = helpFormatter0.defaultArgName;
        java.lang.String str9 = helpFormatter0.createPadding((int) ' ');
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", options11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                " + "'", str9, "                                ");
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        int int10 = helpFormatter0.findWrapPos("", (int) (byte) 100, (int) (short) 0);
        int int11 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str14 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(" ", "usage:", options17, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.util.Comparator comparator5 = null;
        helpFormatter0.setOptionComparator(comparator5);
        java.lang.String str7 = helpFormatter0.defaultArgName;
        java.lang.String str9 = helpFormatter0.createPadding((int) ' ');
        java.util.Comparator comparator10 = helpFormatter0.getOptionComparator();
        java.lang.String str11 = helpFormatter0.defaultLongOptPrefix;
        int int12 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                " + "'", str9, "                                ");
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setLongOptPrefix("hi!");
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        helpFormatter0.setSyntaxPrefix("\n");
        helpFormatter0.defaultOptPrefix = "";
        int int14 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultArgName = "   ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.getArgName();
        org.apache.commons.cli.HelpFormatter helpFormatter7 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter7.defaultOptPrefix = "hi!";
        int int13 = helpFormatter7.findWrapPos("--", (int) '#', (int) (short) 100);
        helpFormatter7.setArgName("arg");
        helpFormatter7.defaultOptPrefix = "";
        org.apache.commons.cli.HelpFormatter helpFormatter18 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str20 = helpFormatter18.rtrim("arg");
        java.lang.String str21 = helpFormatter18.getNewLine();
        java.lang.String str22 = helpFormatter18.getOptPrefix();
        helpFormatter18.setNewLine("usage: ");
        helpFormatter18.setWidth(3);
        java.lang.String str27 = helpFormatter18.defaultArgName;
        int int28 = helpFormatter18.defaultWidth;
        helpFormatter18.setLongOptPrefix("usage: ");
        org.apache.commons.cli.HelpFormatter helpFormatter31 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str33 = helpFormatter31.rtrim("arg");
        helpFormatter31.defaultWidth = (short) -1;
        java.lang.String str36 = helpFormatter31.defaultArgName;
        helpFormatter31.setSyntaxPrefix("arg");
        helpFormatter31.setSyntaxPrefix("--");
        java.util.Comparator comparator41 = helpFormatter31.optionComparator;
        helpFormatter18.optionComparator = comparator41;
        helpFormatter7.setOptionComparator(comparator41);
        helpFormatter0.setOptionComparator(comparator41);
        java.lang.Class<?> wildcardClass45 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "arg" + "'", str20, "arg");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n" + "'", str21, "\n");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-" + "'", str22, "-");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "arg" + "'", str27, "arg");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "arg" + "'", str33, "arg");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "arg" + "'", str36, "arg");
        org.junit.Assert.assertNotNull(comparator41);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        helpFormatter0.defaultLeftPad = (byte) 1;
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 0;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix("\n");
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setSyntaxPrefix("usage: ");
        helpFormatter0.setDescPadding(100);
        java.lang.String str14 = helpFormatter0.createPadding((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.rtrim("--");
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultOptPrefix = "";
        helpFormatter0.defaultArgName = "                                ";
        helpFormatter0.defaultArgName = "-";
        helpFormatter0.defaultWidth = 2;
        java.util.Comparator comparator17 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertNotNull(comparator17);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.String str9 = helpFormatter0.getArgName();
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = helpFormatter0.renderOptions(stringBuffer10, 3, options12, 45, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setSyntaxPrefix("hi!");
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        int int10 = helpFormatter9.defaultDescPad;
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str13 = helpFormatter11.rtrim("arg");
        java.lang.String str14 = helpFormatter11.defaultSyntaxPrefix;
        helpFormatter11.setNewLine("hi!");
        helpFormatter11.defaultWidth = (byte) 0;
        helpFormatter11.defaultDescPad = (short) 0;
        int int24 = helpFormatter11.findWrapPos("\n", (int) (short) 0, (int) (short) 100);
        org.apache.commons.cli.HelpFormatter helpFormatter25 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str27 = helpFormatter25.rtrim("arg");
        helpFormatter25.defaultWidth = (short) -1;
        java.lang.String str30 = helpFormatter25.defaultArgName;
        java.lang.String str31 = helpFormatter25.defaultArgName;
        java.util.Comparator comparator32 = helpFormatter25.getOptionComparator();
        helpFormatter11.setOptionComparator(comparator32);
        helpFormatter9.optionComparator = comparator32;
        helpFormatter0.optionComparator = comparator32;
        int int36 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "arg" + "'", str27, "arg");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "arg" + "'", str30, "arg");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "arg" + "'", str31, "arg");
        org.junit.Assert.assertNotNull(comparator32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 74 + "'", int36 == 74);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        int int10 = helpFormatter0.getDescPadding();
        java.lang.String str12 = helpFormatter0.rtrim("");
        java.lang.String str14 = helpFormatter0.rtrim("                                   ");
        java.lang.String str16 = helpFormatter0.rtrim("usage: ");
        helpFormatter0.defaultOptPrefix = "\n";
        helpFormatter0.defaultSyntaxPrefix = "                                                    ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage:" + "'", str16, "usage:");
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter3 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str5 = helpFormatter3.rtrim("arg");
        java.lang.String str6 = helpFormatter3.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter3.defaultOptPrefix;
        java.util.Comparator comparator8 = helpFormatter3.getOptionComparator();
        helpFormatter0.optionComparator = comparator8;
        int int13 = helpFormatter0.findWrapPos("usage: ", 3, (int) (short) 10);
        helpFormatter0.defaultArgName = "\n";
        java.lang.String str16 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setArgName("   ");
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str21 = helpFormatter0.getOptPrefix();
        java.util.Comparator comparator22 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-" + "'", str21, "-");
        org.junit.Assert.assertNotNull(comparator22);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.util.Comparator comparator9 = null;
        helpFormatter0.optionComparator = comparator9;
        int int14 = helpFormatter0.findWrapPos("hi!", (int) 'a', (int) (byte) -1);
        int int15 = helpFormatter0.defaultDescPad;
        int int16 = helpFormatter0.defaultDescPad;
        java.lang.String str18 = helpFormatter0.createPadding(74);
        java.lang.String str19 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                          " + "'", str18, "                                                                          ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.rtrim("--");
        int int8 = helpFormatter0.getWidth();
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        helpFormatter0.setLeftPadding((int) (byte) -1);
        helpFormatter0.setNewLine("           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.getArgName();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix("hi!");
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        int int12 = helpFormatter0.defaultDescPad;
        java.lang.String str13 = helpFormatter0.getArgName();
        java.lang.String str14 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter15 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str17 = helpFormatter15.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter18 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str20 = helpFormatter18.rtrim("arg");
        java.lang.String str21 = helpFormatter18.defaultSyntaxPrefix;
        java.lang.String str22 = helpFormatter18.defaultOptPrefix;
        java.util.Comparator comparator23 = helpFormatter18.getOptionComparator();
        helpFormatter15.optionComparator = comparator23;
        org.apache.commons.cli.HelpFormatter helpFormatter25 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str27 = helpFormatter25.rtrim("arg");
        java.lang.String str28 = helpFormatter25.defaultSyntaxPrefix;
        java.util.Comparator comparator29 = helpFormatter25.optionComparator;
        helpFormatter15.setOptionComparator(comparator29);
        helpFormatter15.setDescPadding((int) (byte) 1);
        java.lang.String str33 = helpFormatter15.defaultNewLine;
        helpFormatter15.setNewLine("--");
        org.apache.commons.cli.HelpFormatter helpFormatter36 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter36.defaultOptPrefix = "hi!";
        int int42 = helpFormatter36.findWrapPos("--", (int) '#', (int) (short) 100);
        helpFormatter36.defaultLeftPad = 0;
        java.util.Comparator comparator45 = helpFormatter36.getOptionComparator();
        helpFormatter15.optionComparator = comparator45;
        java.util.Comparator comparator47 = helpFormatter15.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator47);
        java.lang.String str49 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("--");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "arg" + "'", str20, "arg");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "usage: " + "'", str21, "usage: ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-" + "'", str22, "-");
        org.junit.Assert.assertNotNull(comparator23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "arg" + "'", str27, "arg");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "usage: " + "'", str28, "usage: ");
        org.junit.Assert.assertNotNull(comparator29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\n" + "'", str33, "\n");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(comparator45);
        org.junit.Assert.assertNotNull(comparator47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultWidth = 10;
        helpFormatter0.setDescPadding((int) (byte) 0);
        java.lang.String str15 = helpFormatter0.getArgName();
        int int19 = helpFormatter0.findWrapPos("--", 0, (int) 'a');
        helpFormatter0.setOptPrefix("arg");
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        java.lang.String str24 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = 2;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "arg" + "'", str24, "arg");
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getNewLine();
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        helpFormatter0.defaultWidth = (byte) 0;
        helpFormatter0.defaultDescPad = (short) 0;
        int int13 = helpFormatter0.findWrapPos("\n", (int) (short) 0, (int) (short) 100);
        org.apache.commons.cli.HelpFormatter helpFormatter14 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str16 = helpFormatter14.rtrim("arg");
        helpFormatter14.defaultWidth = (short) -1;
        java.lang.String str19 = helpFormatter14.defaultArgName;
        java.lang.String str20 = helpFormatter14.defaultArgName;
        java.util.Comparator comparator21 = helpFormatter14.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator21);
        java.lang.String str23 = helpFormatter0.defaultLongOptPrefix;
        java.util.Comparator comparator24 = helpFormatter0.optionComparator;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "arg" + "'", str20, "arg");
        org.junit.Assert.assertNotNull(comparator21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "--" + "'", str23, "--");
        org.junit.Assert.assertNotNull(comparator24);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        int int9 = helpFormatter0.findWrapPos("-", (int) (short) 100, 74);
        helpFormatter0.setNewLine("usage: ");
        int int15 = helpFormatter0.findWrapPos("                                                    ", 45, (int) (short) 10);
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.setLongOptPrefix("arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setOptPrefix(" ");
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str11 = helpFormatter9.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str14 = helpFormatter12.rtrim("arg");
        java.lang.String str15 = helpFormatter12.defaultSyntaxPrefix;
        java.lang.String str16 = helpFormatter12.defaultOptPrefix;
        java.util.Comparator comparator17 = helpFormatter12.getOptionComparator();
        helpFormatter9.optionComparator = comparator17;
        int int22 = helpFormatter9.findWrapPos("\n", (int) '#', 1);
        java.lang.String str24 = helpFormatter9.createPadding((int) (byte) 10);
        int int25 = helpFormatter9.defaultWidth;
        java.lang.String str26 = helpFormatter9.getOptPrefix();
        java.util.Comparator comparator27 = helpFormatter9.optionComparator;
        helpFormatter0.optionComparator = comparator27;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "usage: " + "'", str15, "usage: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "          " + "'", str24, "          ");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 74 + "'", int25 == 74);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-" + "'", str26, "-");
        org.junit.Assert.assertNotNull(comparator27);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setNewLine("-");
        int int8 = helpFormatter0.defaultDescPad;
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str11 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        java.util.Comparator comparator10 = helpFormatter0.optionComparator;
        helpFormatter0.defaultOptPrefix = "                                                                                                 ";
        java.lang.String str13 = helpFormatter0.getArgName();
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", "", options16, "             ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("\n");
        java.lang.String str10 = helpFormatter0.createPadding((int) (short) 100);
        java.lang.String str12 = helpFormatter0.createPadding((int) 'a');
        helpFormatter0.setWidth((int) (short) 100);
        java.lang.String str15 = helpFormatter0.defaultNewLine;
        java.lang.String str16 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                    " + "'", str10, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                 " + "'", str12, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        int int6 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultLeftPad = (byte) 10;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        java.util.Comparator comparator11 = null;
        helpFormatter0.setOptionComparator(comparator11);
        helpFormatter0.defaultWidth = '4';
        java.lang.String str15 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str16 = helpFormatter0.getSyntaxPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter17 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str19 = helpFormatter17.rtrim("arg");
        helpFormatter17.defaultWidth = (short) -1;
        java.lang.String str22 = helpFormatter17.defaultArgName;
        helpFormatter17.setSyntaxPrefix("arg");
        helpFormatter17.setSyntaxPrefix("--");
        int int27 = helpFormatter17.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter28 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str30 = helpFormatter28.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter31 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str33 = helpFormatter31.rtrim("arg");
        java.lang.String str34 = helpFormatter31.defaultSyntaxPrefix;
        java.lang.String str35 = helpFormatter31.defaultOptPrefix;
        java.util.Comparator comparator36 = helpFormatter31.getOptionComparator();
        helpFormatter28.optionComparator = comparator36;
        org.apache.commons.cli.HelpFormatter helpFormatter38 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str40 = helpFormatter38.rtrim("arg");
        java.lang.String str41 = helpFormatter38.defaultSyntaxPrefix;
        java.util.Comparator comparator42 = helpFormatter38.optionComparator;
        helpFormatter28.setOptionComparator(comparator42);
        helpFormatter28.setDescPadding((int) (byte) 1);
        org.apache.commons.cli.HelpFormatter helpFormatter46 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str48 = helpFormatter46.rtrim("arg");
        helpFormatter46.defaultOptPrefix = "--";
        helpFormatter46.setOptPrefix("-");
        helpFormatter46.setDescPadding(1);
        helpFormatter46.defaultDescPad = (short) 100;
        org.apache.commons.cli.HelpFormatter helpFormatter57 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str59 = helpFormatter57.rtrim("arg");
        java.lang.String str60 = helpFormatter57.defaultSyntaxPrefix;
        java.util.Comparator comparator61 = helpFormatter57.optionComparator;
        helpFormatter46.setOptionComparator(comparator61);
        helpFormatter28.optionComparator = comparator61;
        helpFormatter17.optionComparator = comparator61;
        helpFormatter0.setOptionComparator(comparator61);
        java.io.PrintWriter printWriter66 = null;
        org.apache.commons.cli.Options options68 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter66, (int) 'a', options68, (int) (short) 0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "arg" + "'", str22, "arg");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "arg" + "'", str30, "arg");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "arg" + "'", str33, "arg");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "usage: " + "'", str34, "usage: ");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-" + "'", str35, "-");
        org.junit.Assert.assertNotNull(comparator36);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "arg" + "'", str40, "arg");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "usage: " + "'", str41, "usage: ");
        org.junit.Assert.assertNotNull(comparator42);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "arg" + "'", str48, "arg");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "arg" + "'", str59, "arg");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "usage: " + "'", str60, "usage: ");
        org.junit.Assert.assertNotNull(comparator61);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        helpFormatter0.setLeftPadding((int) '4');
        helpFormatter0.setLongOptPrefix("\n");
        java.util.Comparator comparator11 = helpFormatter0.optionComparator;
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, 0, "                                                                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator11);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        int int9 = helpFormatter0.getWidth();
        helpFormatter0.defaultArgName = "hi!";
        int int12 = helpFormatter0.defaultWidth;
        java.lang.String str14 = helpFormatter0.createPadding((int) (short) 0);
        helpFormatter0.defaultWidth = (byte) 0;
        java.io.PrintWriter printWriter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter17, (int) (byte) 0, 72, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:                                                                         ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        int int9 = helpFormatter0.findWrapPos(" ", (int) (short) 1, 10);
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        int int11 = helpFormatter0.getLeftPadding();
        java.util.Comparator comparator12 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(comparator12);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultLeftPad = (short) 10;
        int int13 = helpFormatter0.findWrapPos("arg", (int) (short) 0, (int) (short) 10);
        helpFormatter0.defaultLeftPad = 10;
        java.lang.String str16 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getNewLine();
        java.lang.String str9 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str12 = helpFormatter10.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str15 = helpFormatter13.rtrim("arg");
        java.lang.String str16 = helpFormatter13.defaultSyntaxPrefix;
        java.lang.String str17 = helpFormatter13.defaultOptPrefix;
        java.util.Comparator comparator18 = helpFormatter13.getOptionComparator();
        helpFormatter10.optionComparator = comparator18;
        int int23 = helpFormatter10.findWrapPos("usage: ", 3, (int) (short) 10);
        java.util.Comparator comparator24 = helpFormatter10.getOptionComparator();
        helpFormatter0.optionComparator = comparator24;
        helpFormatter0.defaultOptPrefix = "            ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertNotNull(comparator18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(comparator24);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter3 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str5 = helpFormatter3.rtrim("arg");
        java.lang.String str6 = helpFormatter3.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter3.defaultOptPrefix;
        java.util.Comparator comparator8 = helpFormatter3.getOptionComparator();
        helpFormatter0.optionComparator = comparator8;
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str12 = helpFormatter10.rtrim("arg");
        java.lang.String str13 = helpFormatter10.defaultSyntaxPrefix;
        java.util.Comparator comparator14 = helpFormatter10.optionComparator;
        helpFormatter0.setOptionComparator(comparator14);
        helpFormatter0.setDescPadding((int) (byte) 1);
        org.apache.commons.cli.HelpFormatter helpFormatter18 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str20 = helpFormatter18.rtrim("arg");
        helpFormatter18.defaultOptPrefix = "--";
        helpFormatter18.setOptPrefix("-");
        helpFormatter18.setDescPadding(1);
        helpFormatter18.defaultDescPad = (short) 100;
        org.apache.commons.cli.HelpFormatter helpFormatter29 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str31 = helpFormatter29.rtrim("arg");
        java.lang.String str32 = helpFormatter29.defaultSyntaxPrefix;
        java.util.Comparator comparator33 = helpFormatter29.optionComparator;
        helpFormatter18.setOptionComparator(comparator33);
        helpFormatter0.optionComparator = comparator33;
        int int36 = helpFormatter0.defaultDescPad;
        int int40 = helpFormatter0.findWrapPos("-", (int) (short) 10, 72);
        helpFormatter0.setSyntaxPrefix("usage: ");
        int int43 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "arg" + "'", str20, "arg");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "arg" + "'", str31, "arg");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "usage: " + "'", str32, "usage: ");
        org.junit.Assert.assertNotNull(comparator33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.setSyntaxPrefix("                                   ");
        int int10 = helpFormatter0.getDescPadding();
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        int int12 = helpFormatter0.defaultLeftPad;
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str15 = helpFormatter13.rtrim("arg");
        java.lang.String str16 = helpFormatter13.defaultSyntaxPrefix;
        java.util.Comparator comparator17 = helpFormatter13.optionComparator;
        helpFormatter13.defaultSyntaxPrefix = "\n";
        int int20 = helpFormatter13.defaultLeftPad;
        java.lang.String str21 = helpFormatter13.defaultSyntaxPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter22 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str24 = helpFormatter22.rtrim("arg");
        java.lang.String str25 = helpFormatter22.getNewLine();
        java.lang.String str26 = helpFormatter22.getOptPrefix();
        helpFormatter22.setNewLine("usage: ");
        helpFormatter22.setWidth(3);
        java.lang.String str31 = helpFormatter22.defaultArgName;
        int int32 = helpFormatter22.defaultWidth;
        helpFormatter22.setLongOptPrefix("usage: ");
        org.apache.commons.cli.HelpFormatter helpFormatter35 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str37 = helpFormatter35.rtrim("arg");
        helpFormatter35.defaultWidth = (short) -1;
        java.lang.String str40 = helpFormatter35.defaultArgName;
        helpFormatter35.setSyntaxPrefix("arg");
        helpFormatter35.setSyntaxPrefix("--");
        java.util.Comparator comparator45 = helpFormatter35.optionComparator;
        helpFormatter22.optionComparator = comparator45;
        helpFormatter13.optionComparator = comparator45;
        helpFormatter0.optionComparator = comparator45;
        java.lang.String str49 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.Options options53 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(10, "usage: ", "                                                                                       ", options53, "                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:                                           usage:");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n" + "'", str21, "\n");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "arg" + "'", str24, "arg");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\n" + "'", str25, "\n");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-" + "'", str26, "-");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "arg" + "'", str31, "arg");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "arg" + "'", str37, "arg");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "arg" + "'", str40, "arg");
        org.junit.Assert.assertNotNull(comparator45);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "--" + "'", str49, "--");
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("");
        int int3 = helpFormatter0.getLeftPadding();
        int int4 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.HelpFormatter helpFormatter5 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter5.defaultOptPrefix = "hi!";
        int int11 = helpFormatter5.findWrapPos("--", (int) '#', (int) (short) 100);
        helpFormatter5.setArgName("arg");
        helpFormatter5.defaultOptPrefix = "";
        org.apache.commons.cli.HelpFormatter helpFormatter16 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str18 = helpFormatter16.rtrim("arg");
        java.lang.String str19 = helpFormatter16.getNewLine();
        java.lang.String str20 = helpFormatter16.getOptPrefix();
        helpFormatter16.setNewLine("usage: ");
        helpFormatter16.setWidth(3);
        java.lang.String str25 = helpFormatter16.defaultArgName;
        int int26 = helpFormatter16.defaultWidth;
        helpFormatter16.setLongOptPrefix("usage: ");
        org.apache.commons.cli.HelpFormatter helpFormatter29 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str31 = helpFormatter29.rtrim("arg");
        helpFormatter29.defaultWidth = (short) -1;
        java.lang.String str34 = helpFormatter29.defaultArgName;
        helpFormatter29.setSyntaxPrefix("arg");
        helpFormatter29.setSyntaxPrefix("--");
        java.util.Comparator comparator39 = helpFormatter29.optionComparator;
        helpFormatter16.optionComparator = comparator39;
        helpFormatter5.setOptionComparator(comparator39);
        helpFormatter0.setOptionComparator(comparator39);
        org.apache.commons.cli.Options options46 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(3, "                                                                                                 ", "                                                                        ", options46, "usage:", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n" + "'", str19, "\n");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-" + "'", str20, "-");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "arg" + "'", str25, "arg");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "arg" + "'", str31, "arg");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "arg" + "'", str34, "arg");
        org.junit.Assert.assertNotNull(comparator39);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setNewLine("-");
        int int8 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) -1, "                                   ", "   ", options12, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 42");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.setSyntaxPrefix("                                   ");
        int int10 = helpFormatter0.getDescPadding();
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        int int12 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLongOptPrefix = "";
        helpFormatter0.defaultDescPad = 10;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str11 = helpFormatter0.defaultOptPrefix;
        java.lang.String str12 = helpFormatter0.defaultArgName;
        helpFormatter0.setLongOptPrefix("          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.util.Comparator comparator9 = null;
        helpFormatter0.optionComparator = comparator9;
        int int14 = helpFormatter0.findWrapPos("hi!", (int) 'a', (int) (byte) -1);
        int int15 = helpFormatter0.getWidth();
        int int19 = helpFormatter0.findWrapPos("--", 3, (int) (short) 10);
        java.lang.String str20 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter21 = null;
        org.apache.commons.cli.Options options24 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter21, (int) (byte) 100, "                                                                   ", options24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "usage: " + "'", str20, "usage: ");
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("");
        int int3 = helpFormatter0.getLeftPadding();
        helpFormatter0.setOptPrefix("--");
        org.apache.commons.cli.HelpFormatter helpFormatter6 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str8 = helpFormatter6.rtrim("arg");
        helpFormatter6.defaultOptPrefix = "--";
        java.lang.String str11 = helpFormatter6.getLongOptPrefix();
        java.lang.String str12 = helpFormatter6.getNewLine();
        java.lang.String str13 = helpFormatter6.getOptPrefix();
        helpFormatter6.defaultLeftPad = (short) 10;
        org.apache.commons.cli.HelpFormatter helpFormatter16 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str18 = helpFormatter16.rtrim("arg");
        java.lang.String str19 = helpFormatter16.defaultSyntaxPrefix;
        java.util.Comparator comparator20 = helpFormatter16.optionComparator;
        java.lang.String str21 = helpFormatter16.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter22 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str24 = helpFormatter22.rtrim("arg");
        helpFormatter22.defaultOptPrefix = "--";
        helpFormatter22.setOptPrefix("-");
        helpFormatter22.setDescPadding(1);
        java.util.Comparator comparator31 = helpFormatter22.getOptionComparator();
        helpFormatter16.optionComparator = comparator31;
        helpFormatter6.optionComparator = comparator31;
        helpFormatter0.optionComparator = comparator31;
        java.lang.String str35 = helpFormatter0.defaultOptPrefix;
        int int36 = helpFormatter0.defaultWidth;
        java.lang.StringBuffer stringBuffer37 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer41 = helpFormatter0.renderWrappedText(stringBuffer37, 87, (int) (byte) 100, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuffer.append(String)\" because \"sb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-" + "'", str21, "-");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "arg" + "'", str24, "arg");
        org.junit.Assert.assertNotNull(comparator31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "--" + "'", str35, "--");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 74 + "'", int36 == 74);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = (byte) 100;
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        int int9 = helpFormatter0.defaultDescPad;
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        java.lang.String str13 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setWidth(11);
        helpFormatter0.setNewLine("                                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultDescPad;
        helpFormatter0.setDescPadding((int) (short) 100);
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                 ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.defaultArgName;
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setDescPadding(0);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "-";
        int int18 = helpFormatter0.findWrapPos("          ", (int) (byte) -1, 1);
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str22 = helpFormatter0.rtrim("   ");
        java.io.PrintWriter printWriter23 = null;
        org.apache.commons.cli.Options options27 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter23, 52, "usage: ", "arg", options27, 11, 100, "         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.defaultWidth = 3;
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        int int11 = helpFormatter0.getDescPadding();
        int int12 = helpFormatter0.defaultLeftPad;
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str15 = helpFormatter13.rtrim("arg");
        helpFormatter13.setSyntaxPrefix("-");
        java.lang.String str18 = helpFormatter13.getOptPrefix();
        helpFormatter13.setNewLine("");
        java.lang.String str21 = helpFormatter13.getLongOptPrefix();
        helpFormatter13.defaultLongOptPrefix = "usage: ";
        java.util.Comparator comparator24 = helpFormatter13.getOptionComparator();
        helpFormatter0.optionComparator = comparator24;
        helpFormatter0.setWidth(35);
        java.io.PrintWriter printWriter28 = null;
        org.apache.commons.cli.Options options31 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter28, (int) (byte) 1, "--", options31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
        org.junit.Assert.assertNotNull(comparator24);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter3 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str5 = helpFormatter3.rtrim("arg");
        java.lang.String str6 = helpFormatter3.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter3.defaultOptPrefix;
        java.util.Comparator comparator8 = helpFormatter3.getOptionComparator();
        helpFormatter0.optionComparator = comparator8;
        int int13 = helpFormatter0.findWrapPos("usage: ", 3, (int) (short) 10);
        helpFormatter0.defaultArgName = "\n";
        java.lang.String str16 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator17 = helpFormatter0.getOptionComparator();
        java.lang.String str18 = helpFormatter0.defaultOptPrefix;
        int int19 = helpFormatter0.getWidth();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 74 + "'", int19 == 74);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter6 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str8 = helpFormatter6.rtrim("arg");
        helpFormatter6.defaultOptPrefix = "--";
        helpFormatter6.setOptPrefix("-");
        helpFormatter6.setDescPadding(1);
        java.util.Comparator comparator15 = helpFormatter6.getOptionComparator();
        helpFormatter0.optionComparator = comparator15;
        helpFormatter0.defaultOptPrefix = "";
        java.lang.String str19 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("\n");
        java.lang.String str10 = helpFormatter0.createPadding((int) (short) 100);
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                        ", options12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                    " + "'", str10, "                                                                                                    ");
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setDescPadding(0);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "-";
        java.lang.String str16 = helpFormatter0.rtrim("--");
        int int17 = helpFormatter0.getDescPadding();
        java.lang.String str18 = helpFormatter0.defaultNewLine;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = helpFormatter0.createPadding((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.util.Comparator comparator5 = null;
        helpFormatter0.setOptionComparator(comparator5);
        helpFormatter0.setLeftPadding((int) (short) -1);
        java.lang.String str9 = helpFormatter0.defaultArgName;
        java.lang.String str11 = helpFormatter0.rtrim(" ");
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", options13);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.rtrim("--");
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultOptPrefix = "";
        helpFormatter0.defaultArgName = "                                ";
        java.lang.String str13 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                " + "'", str13, "                                ");
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.createPadding(32);
        int int10 = helpFormatter0.defaultDescPad;
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter11, 52, (int) (short) 10, "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                " + "'", str9, "                                ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setLongOptPrefix("hi!");
        java.util.Comparator comparator9 = helpFormatter0.optionComparator;
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.defaultDescPad = 3;
        java.lang.String str14 = helpFormatter0.getLongOptPrefix();
        java.io.PrintWriter printWriter15 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter15, (int) (byte) 100, "", options18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        int int9 = helpFormatter0.findWrapPos(" ", (int) (short) 1, 10);
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultNewLine = "                                                                          ";
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str15 = helpFormatter13.rtrim("arg");
        helpFormatter13.defaultWidth = (short) -1;
        java.lang.String str18 = helpFormatter13.defaultArgName;
        helpFormatter13.setSyntaxPrefix("arg");
        helpFormatter13.setSyntaxPrefix("--");
        int int23 = helpFormatter13.getDescPadding();
        java.lang.String str25 = helpFormatter13.rtrim("");
        java.lang.String str27 = helpFormatter13.rtrim("                                   ");
        java.util.Comparator comparator28 = helpFormatter13.optionComparator;
        helpFormatter0.optionComparator = comparator28;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(comparator28);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setDescPadding(0);
        java.lang.String str9 = helpFormatter0.createPadding((int) (short) 10);
        helpFormatter0.defaultNewLine = "                                                                         ";
        java.lang.String str12 = helpFormatter0.getArgName();
        int int13 = helpFormatter0.defaultWidth;
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter14, (int) (short) 100, options16, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "          " + "'", str9, "          ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth(74);
        helpFormatter0.setArgName("-");
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str12 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        java.lang.String str15 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "usage: " + "'", str15, "usage: ");
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        helpFormatter0.defaultWidth = (byte) 0;
        helpFormatter0.defaultDescPad = (short) 0;
        helpFormatter0.setSyntaxPrefix("          ");
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str14 = helpFormatter0.rtrim("");
        helpFormatter0.defaultOptPrefix = "  ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "          " + "'", str12, "          ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        int int6 = helpFormatter0.findWrapPos("--", (int) '#', (int) (short) 100);
        helpFormatter0.setArgName("arg");
        helpFormatter0.defaultOptPrefix = "";
        int int14 = helpFormatter0.findWrapPos("                                                                          ", 1, 10);
        helpFormatter0.setDescPadding(35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.setSyntaxPrefix("                                   ");
        int int10 = helpFormatter0.getDescPadding();
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        int int12 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLongOptPrefix = "";
        java.lang.String str15 = helpFormatter0.defaultNewLine;
        java.lang.String str16 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                   " + "'", str16, "                                   ");
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        int int10 = helpFormatter0.findWrapPos("", (int) (byte) 100, (int) (short) 0);
        java.lang.String str12 = helpFormatter0.rtrim("   ");
        helpFormatter0.setNewLine("                                                                                                    ");
        helpFormatter0.defaultNewLine = "                                                                                       ";
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                    ", options18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "\n";
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter8, (int) (short) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        int int10 = helpFormatter0.getDescPadding();
        int int11 = helpFormatter0.getLeftPadding();
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        int int13 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.HelpFormatter helpFormatter14 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str16 = helpFormatter14.rtrim("arg");
        java.lang.String str17 = helpFormatter14.getNewLine();
        helpFormatter14.defaultArgName = "usage: ";
        int int20 = helpFormatter14.defaultWidth;
        helpFormatter14.setLongOptPrefix("hi!");
        java.util.Comparator comparator23 = helpFormatter14.optionComparator;
        helpFormatter0.setOptionComparator(comparator23);
        int int25 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "hi!";
        java.lang.String str29 = helpFormatter0.rtrim("           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 74 + "'", int20 == 74);
        org.junit.Assert.assertNotNull(comparator23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultDescPad = (byte) 10;
        java.lang.String str10 = helpFormatter0.createPadding((int) '4');
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str13 = helpFormatter11.rtrim("arg");
        java.lang.String str14 = helpFormatter11.defaultOptPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter15 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str17 = helpFormatter15.rtrim("arg");
        java.lang.String str18 = helpFormatter15.getNewLine();
        java.lang.String str19 = helpFormatter15.getOptPrefix();
        helpFormatter15.setOptPrefix("usage: ");
        java.lang.String str22 = helpFormatter15.getNewLine();
        java.lang.String str24 = helpFormatter15.rtrim("hi!");
        int int25 = helpFormatter15.defaultLeftPad;
        java.util.Comparator comparator26 = helpFormatter15.optionComparator;
        helpFormatter11.setOptionComparator(comparator26);
        helpFormatter0.setOptionComparator(comparator26);
        java.io.PrintWriter printWriter29 = null;
        org.apache.commons.cli.Options options31 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter29, 0, options31, (int) '4', 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                    " + "'", str10, "                                                    ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-" + "'", str19, "-");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n" + "'", str22, "\n");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(comparator26);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        int int11 = helpFormatter0.defaultDescPad;
        int int12 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.defaultWidth = ' ';
        helpFormatter0.defaultLongOptPrefix = "          ";
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        helpFormatter0.setArgName("             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix("\n");
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultArgName = "          ";
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setDescPadding(0);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.setWidth(74);
        int int17 = helpFormatter0.getLeftPadding();
        java.lang.String str18 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        int int9 = helpFormatter0.findWrapPos("-", (int) (short) 100, 74);
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setNewLine(" ");
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str15 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str10 = helpFormatter8.rtrim("arg");
        helpFormatter8.defaultOptPrefix = "--";
        helpFormatter8.setOptPrefix("-");
        helpFormatter8.setDescPadding(1);
        helpFormatter8.defaultDescPad = (short) 100;
        org.apache.commons.cli.HelpFormatter helpFormatter19 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str21 = helpFormatter19.rtrim("arg");
        java.lang.String str22 = helpFormatter19.defaultSyntaxPrefix;
        java.util.Comparator comparator23 = helpFormatter19.optionComparator;
        helpFormatter8.setOptionComparator(comparator23);
        helpFormatter0.optionComparator = comparator23;
        int int26 = helpFormatter0.getWidth();
        helpFormatter0.setDescPadding((int) (short) 0);
        java.lang.String str29 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str32 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "usage: " + "'", str22, "usage: ");
        org.junit.Assert.assertNotNull(comparator23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 74 + "'", int26 == 74);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\n" + "'", str29, "\n");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "arg" + "'", str32, "arg");
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int10 = helpFormatter0.getLeftPadding();
        java.lang.String str12 = helpFormatter0.createPadding((int) '4');
        int int16 = helpFormatter0.findWrapPos("                                                                                                    ", 74, 0);
        org.apache.commons.cli.HelpFormatter helpFormatter17 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str19 = helpFormatter17.rtrim("arg");
        helpFormatter17.defaultOptPrefix = "--";
        helpFormatter17.setOptPrefix("-");
        helpFormatter17.setDescPadding(1);
        int int26 = helpFormatter17.getWidth();
        org.apache.commons.cli.HelpFormatter helpFormatter27 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str29 = helpFormatter27.rtrim("arg");
        helpFormatter27.defaultOptPrefix = "--";
        helpFormatter27.setOptPrefix("-");
        helpFormatter27.setDescPadding(1);
        java.util.Comparator comparator36 = helpFormatter27.getOptionComparator();
        helpFormatter17.optionComparator = comparator36;
        helpFormatter0.setOptionComparator(comparator36);
        helpFormatter0.defaultWidth = 100;
        int int41 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                    " + "'", str12, "                                                    ");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 74 + "'", int26 == 74);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "arg" + "'", str29, "arg");
        org.junit.Assert.assertNotNull(comparator36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.setLongOptPrefix("");
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("   ", "             ", options14, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int10 = helpFormatter0.defaultLeftPad;
        int int11 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth(100);
        helpFormatter0.defaultArgName = "  ";
        java.lang.String str16 = helpFormatter0.defaultOptPrefix;
        int int17 = helpFormatter0.getWidth();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        int int9 = helpFormatter0.findWrapPos(" ", (int) (short) 1, 10);
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setLongOptPrefix("                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        int int8 = helpFormatter0.defaultDescPad;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setNewLine("   ");
        int int16 = helpFormatter0.findWrapPos("usage: ", 87, 1);
        helpFormatter0.defaultWidth = ' ';
        helpFormatter0.defaultLongOptPrefix = "";
        helpFormatter0.setArgName("   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.defaultArgName = "                                   ";
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = helpFormatter0.renderWrappedText(stringBuffer11, 73, 0, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuffer.append(String)\" because \"sb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.defaultWidth = 3;
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("   ", "                                ", options13, "                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:         ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setLongOptPrefix("hi!");
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        helpFormatter0.setSyntaxPrefix("\n");
        helpFormatter0.setLeftPadding((int) (byte) 0);
        int int14 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth(74);
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str10 = helpFormatter8.rtrim("arg");
        java.lang.String str11 = helpFormatter8.defaultSyntaxPrefix;
        java.lang.String str12 = helpFormatter8.defaultOptPrefix;
        java.util.Comparator comparator13 = helpFormatter8.getOptionComparator();
        helpFormatter0.optionComparator = comparator13;
        helpFormatter0.setDescPadding((int) (byte) 1);
        int int17 = helpFormatter0.defaultLeftPad;
        int int18 = helpFormatter0.getLeftPadding();
        int int19 = helpFormatter0.getWidth();
        int int20 = helpFormatter0.getDescPadding();
        java.io.PrintWriter printWriter21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter21, (int) (short) -1, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 17");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 74 + "'", int19 == 74);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        int int5 = helpFormatter0.defaultWidth;
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        int int7 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLeftPad = 74;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 0, "", "", options13, "                                                                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.defaultArgName;
        int int10 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter11, 13, "   ", options14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultDescPad = (short) 100;
        java.util.Comparator comparator11 = helpFormatter0.optionComparator;
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setLeftPadding((int) (short) 100);
        java.util.Comparator comparator15 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultLeftPad = (byte) -1;
        int int21 = helpFormatter0.findWrapPos("         ", (int) (short) 0, 12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setNewLine("-");
        int int8 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultOptPrefix = "                                                                                                    ";
        helpFormatter0.setLeftPadding((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        helpFormatter0.setDescPadding(100);
        int int10 = helpFormatter0.findWrapPos("                                                                                                    ", (int) (byte) 0, 3);
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str15 = helpFormatter0.createPadding(0);
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter16, (int) '4', "", "", options20, (int) (short) -1, (int) (byte) -1, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str9 = helpFormatter0.rtrim("hi!");
        int int10 = helpFormatter0.defaultLeftPad;
        java.util.Comparator comparator11 = helpFormatter0.optionComparator;
        java.util.Comparator comparator12 = helpFormatter0.getOptionComparator();
        int int13 = helpFormatter0.defaultLeftPad;
        int int14 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth((int) (byte) -1);
        java.lang.String str17 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage: " + "'", str17, "usage: ");
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultWidth = 10;
        helpFormatter0.setDescPadding((int) (byte) 0);
        java.lang.String str15 = helpFormatter0.getArgName();
        int int19 = helpFormatter0.findWrapPos("--", 0, (int) 'a');
        helpFormatter0.setOptPrefix("arg");
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.defaultNewLine = "usage: ";
        helpFormatter0.setNewLine("          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.util.Comparator comparator9 = null;
        helpFormatter0.optionComparator = comparator9;
        int int14 = helpFormatter0.findWrapPos("hi!", (int) 'a', (int) (byte) -1);
        int int15 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultOptPrefix = "usage: ";
        int int18 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultLeftPad = 3;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.setArgName("--");
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        helpFormatter0.setDescPadding(0);
        helpFormatter0.defaultLongOptPrefix = "--";
        int int12 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter3 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str5 = helpFormatter3.rtrim("arg");
        java.lang.String str6 = helpFormatter3.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter3.defaultOptPrefix;
        java.util.Comparator comparator8 = helpFormatter3.getOptionComparator();
        helpFormatter0.optionComparator = comparator8;
        helpFormatter0.defaultLeftPad = 74;
        helpFormatter0.setArgName(" ");
        java.util.Comparator comparator14 = helpFormatter0.getOptionComparator();
        int int15 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        int int10 = helpFormatter0.getDescPadding();
        java.lang.String str11 = helpFormatter0.getArgName();
        int int12 = helpFormatter0.getDescPadding();
        helpFormatter0.setSyntaxPrefix("                                   ");
        helpFormatter0.setLeftPadding((int) (byte) 100);
        java.io.PrintWriter printWriter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter17, 73, 72, "         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = (byte) 100;
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.lang.String str10 = helpFormatter0.createPadding((int) (short) 100);
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str13 = helpFormatter11.rtrim("arg");
        helpFormatter11.setSyntaxPrefix("-");
        java.util.Comparator comparator16 = null;
        helpFormatter11.setOptionComparator(comparator16);
        helpFormatter11.setLeftPadding((int) (short) -1);
        java.lang.String str20 = helpFormatter11.getArgName();
        java.util.Comparator comparator21 = helpFormatter11.optionComparator;
        helpFormatter0.setOptionComparator(comparator21);
        helpFormatter0.setOptPrefix("            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                    " + "'", str10, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "arg" + "'", str20, "arg");
        org.junit.Assert.assertNotNull(comparator21);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setDescPadding(0);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str15 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str18 = helpFormatter0.getOptPrefix();
        java.lang.String str19 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "--" + "'", str19, "--");
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setDescPadding(0);
        java.lang.String str9 = helpFormatter0.createPadding((int) (short) 10);
        helpFormatter0.defaultNewLine = "                                                                         ";
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setWidth(100);
        helpFormatter0.defaultDescPad = 13;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "          " + "'", str9, "          ");
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        int int11 = helpFormatter0.getLeftPadding();
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultWidth;
        int int8 = helpFormatter0.getLeftPadding();
        int int12 = helpFormatter0.findWrapPos("          ", (int) ' ', 10);
        int int13 = helpFormatter0.getWidth();
        int int14 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultNewLine = "-";
        org.apache.commons.cli.HelpFormatter helpFormatter17 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str19 = helpFormatter17.rtrim("arg");
        helpFormatter17.defaultWidth = (short) -1;
        java.lang.String str22 = helpFormatter17.defaultArgName;
        helpFormatter17.setSyntaxPrefix("arg");
        helpFormatter17.setLeftPadding((int) (short) 1);
        java.util.Comparator comparator27 = helpFormatter17.getOptionComparator();
        helpFormatter0.optionComparator = comparator27;
        java.io.PrintWriter printWriter29 = null;
        org.apache.commons.cli.Options options33 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter29, 3, "", "                                                                                       ", options33, (int) '4', 87, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "arg" + "'", str22, "arg");
        org.junit.Assert.assertNotNull(comparator27);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter3 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str5 = helpFormatter3.rtrim("arg");
        java.lang.String str6 = helpFormatter3.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter3.defaultOptPrefix;
        java.util.Comparator comparator8 = helpFormatter3.getOptionComparator();
        helpFormatter0.optionComparator = comparator8;
        helpFormatter0.defaultLeftPad = 74;
        helpFormatter0.setNewLine("                                                                                                 ");
        java.util.Comparator comparator14 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("-");
        java.io.PrintWriter printWriter17 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter17, (int) '#', options19, 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertNotNull(comparator14);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultWidth = 10;
        helpFormatter0.setDescPadding((int) (byte) 0);
        java.lang.String str15 = helpFormatter0.getArgName();
        int int19 = helpFormatter0.findWrapPos("--", 0, (int) 'a');
        helpFormatter0.setOptPrefix("arg");
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        java.lang.String str24 = helpFormatter0.getArgName();
        helpFormatter0.setDescPadding(100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "arg" + "'", str24, "arg");
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        int int8 = helpFormatter0.getWidth();
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        int int10 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter3 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str5 = helpFormatter3.rtrim("arg");
        java.lang.String str6 = helpFormatter3.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter3.defaultOptPrefix;
        java.util.Comparator comparator8 = helpFormatter3.getOptionComparator();
        helpFormatter0.optionComparator = comparator8;
        java.lang.Class<?> wildcardClass10 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultLeftPad = (short) 10;
        int int13 = helpFormatter0.findWrapPos("arg", (int) (short) 0, (int) (short) 10);
        helpFormatter0.defaultLeftPad = 10;
        java.util.Comparator comparator16 = helpFormatter0.optionComparator;
        java.lang.String str17 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter18 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter18, 100, "                                                                   ", options21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(comparator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        int int10 = helpFormatter0.getDescPadding();
        int int14 = helpFormatter0.findWrapPos("", (int) (byte) 100, 0);
        helpFormatter0.defaultWidth = (byte) 10;
        helpFormatter0.setOptPrefix("                                                                         ");
        java.lang.String str19 = helpFormatter0.defaultOptPrefix;
        int int20 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                                                         " + "'", str19, "                                                                         ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.defaultWidth = 3;
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str12 = helpFormatter10.rtrim("arg");
        helpFormatter10.defaultWidth = (short) -1;
        java.lang.String str15 = helpFormatter10.defaultArgName;
        helpFormatter10.setSyntaxPrefix("arg");
        helpFormatter10.setSyntaxPrefix("--");
        int int20 = helpFormatter10.getDescPadding();
        int int24 = helpFormatter10.findWrapPos("", (int) (byte) 100, 0);
        helpFormatter10.defaultWidth = (byte) 10;
        java.util.Comparator comparator27 = helpFormatter10.getOptionComparator();
        helpFormatter0.optionComparator = comparator27;
        int int29 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(comparator27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultArgName = "                                                                                                    ";
        java.util.Comparator comparator7 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setWidth(74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertNotNull(comparator7);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        int int10 = helpFormatter0.findWrapPos("", (int) (byte) 100, (int) (short) 0);
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        int int12 = helpFormatter0.defaultDescPad;
        java.lang.String str13 = helpFormatter0.getArgName();
        int int14 = helpFormatter0.getWidth();
        java.lang.String str15 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        int int10 = helpFormatter0.findWrapPos("", (int) (byte) 100, (int) (short) 0);
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str11 = helpFormatter9.rtrim("arg");
        java.lang.String str12 = helpFormatter9.defaultSyntaxPrefix;
        java.lang.String str13 = helpFormatter9.defaultOptPrefix;
        java.util.Comparator comparator14 = helpFormatter9.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator14);
        java.lang.String str16 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix(" ");
        java.lang.String str19 = helpFormatter0.defaultSyntaxPrefix;
        int int23 = helpFormatter0.findWrapPos("   ", (int) (byte) 0, 12);
        java.io.PrintWriter printWriter24 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter24, 0, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:   ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " " + "'", str19, " ");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.defaultArgName;
        int int10 = helpFormatter0.getWidth();
        java.lang.String str11 = helpFormatter0.getNewLine();
        java.lang.String str12 = helpFormatter0.defaultArgName;
        int int13 = helpFormatter0.getLeftPadding();
        helpFormatter0.setNewLine("  ");
        java.lang.String str16 = helpFormatter0.getArgName();
        int int17 = helpFormatter0.getWidth();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setSyntaxPrefix("hi!");
        int int9 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = 67;
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter12, 11, "                                                    ", "   ", options16, 9, 12, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int10 = helpFormatter0.getLeftPadding();
        java.lang.String str12 = helpFormatter0.createPadding((int) '4');
        int int13 = helpFormatter0.defaultLeftPad;
        java.util.Comparator comparator14 = helpFormatter0.getOptionComparator();
        java.lang.String str15 = helpFormatter0.getSyntaxPrefix();
        java.util.Comparator comparator16 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                    " + "'", str12, "                                                    ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "usage: " + "'", str15, "usage: ");
        org.junit.Assert.assertNotNull(comparator16);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setNewLine("\n");
        java.lang.String str11 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, 0, 3, "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:    ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setDescPadding((int) (short) -1);
        helpFormatter0.defaultLeftPad = 'a';
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str12 = helpFormatter10.rtrim("arg");
        helpFormatter10.defaultWidth = (short) -1;
        java.lang.String str15 = helpFormatter10.defaultArgName;
        helpFormatter10.setSyntaxPrefix("arg");
        helpFormatter10.setDescPadding((int) '#');
        helpFormatter10.defaultNewLine = "-";
        java.lang.String str22 = helpFormatter10.defaultLongOptPrefix;
        java.util.Comparator comparator23 = helpFormatter10.getOptionComparator();
        helpFormatter0.optionComparator = comparator23;
        int int25 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "--" + "'", str22, "--");
        org.junit.Assert.assertNotNull(comparator23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        int int10 = helpFormatter0.getDescPadding();
        int int14 = helpFormatter0.findWrapPos("", (int) (byte) 100, 0);
        helpFormatter0.defaultWidth = (byte) 10;
        java.util.Comparator comparator17 = helpFormatter0.getOptionComparator();
        int int18 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(35);
        java.lang.String str21 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        java.lang.String str11 = helpFormatter0.rtrim("  ");
        int int12 = helpFormatter0.defaultDescPad;
        java.lang.String str13 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        int int4 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.defaultArgName;
        int int10 = helpFormatter0.getWidth();
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str14 = helpFormatter12.rtrim("arg");
        java.lang.String str15 = helpFormatter12.getNewLine();
        java.lang.String str16 = helpFormatter12.getOptPrefix();
        helpFormatter12.setNewLine("usage: ");
        helpFormatter12.setWidth(3);
        java.lang.String str21 = helpFormatter12.defaultArgName;
        int int22 = helpFormatter12.defaultWidth;
        helpFormatter12.setLongOptPrefix("usage: ");
        org.apache.commons.cli.HelpFormatter helpFormatter25 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str27 = helpFormatter25.rtrim("arg");
        helpFormatter25.defaultWidth = (short) -1;
        java.lang.String str30 = helpFormatter25.defaultArgName;
        helpFormatter25.setSyntaxPrefix("arg");
        helpFormatter25.setSyntaxPrefix("--");
        java.util.Comparator comparator35 = helpFormatter25.optionComparator;
        helpFormatter12.optionComparator = comparator35;
        helpFormatter0.setOptionComparator(comparator35);
        java.lang.String str38 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setSyntaxPrefix("                                                                                       ");
        helpFormatter0.defaultNewLine = "\n";
        org.apache.commons.cli.HelpFormatter helpFormatter43 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str45 = helpFormatter43.rtrim("arg");
        java.lang.String str46 = helpFormatter43.defaultSyntaxPrefix;
        helpFormatter43.setNewLine("hi!");
        helpFormatter43.defaultWidth = (byte) 0;
        helpFormatter43.defaultDescPad = (short) 0;
        int int56 = helpFormatter43.findWrapPos("\n", (int) (short) 0, (int) (short) 100);
        org.apache.commons.cli.HelpFormatter helpFormatter57 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str59 = helpFormatter57.rtrim("arg");
        helpFormatter57.defaultWidth = (short) -1;
        java.lang.String str62 = helpFormatter57.defaultArgName;
        java.lang.String str63 = helpFormatter57.defaultArgName;
        java.util.Comparator comparator64 = helpFormatter57.getOptionComparator();
        helpFormatter43.setOptionComparator(comparator64);
        int int66 = helpFormatter43.defaultDescPad;
        org.apache.commons.cli.HelpFormatter helpFormatter67 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str69 = helpFormatter67.rtrim("arg");
        helpFormatter67.defaultWidth = (short) -1;
        java.lang.String str72 = helpFormatter67.defaultArgName;
        java.lang.String str73 = helpFormatter67.defaultArgName;
        helpFormatter67.setOptPrefix("hi!");
        helpFormatter67.defaultSyntaxPrefix = "usage: ";
        java.lang.String str78 = helpFormatter67.defaultNewLine;
        int int79 = helpFormatter67.defaultDescPad;
        java.lang.String str80 = helpFormatter67.getArgName();
        int int81 = helpFormatter67.defaultLeftPad;
        java.util.Comparator comparator82 = helpFormatter67.optionComparator;
        helpFormatter43.optionComparator = comparator82;
        helpFormatter0.setOptionComparator(comparator82);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "arg" + "'", str27, "arg");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "arg" + "'", str30, "arg");
        org.junit.Assert.assertNotNull(comparator35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "usage: " + "'", str38, "usage: ");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "arg" + "'", str45, "arg");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "usage: " + "'", str46, "usage: ");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "arg" + "'", str59, "arg");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "arg" + "'", str62, "arg");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "arg" + "'", str63, "arg");
        org.junit.Assert.assertNotNull(comparator64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "arg" + "'", str69, "arg");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "arg" + "'", str72, "arg");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "arg" + "'", str73, "arg");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "\n" + "'", str78, "\n");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 3 + "'", int79 == 3);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "arg" + "'", str80, "arg");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertNotNull(comparator82);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultWidth = 10;
        helpFormatter0.setDescPadding((int) (byte) 0);
        java.lang.String str15 = helpFormatter0.getArgName();
        int int19 = helpFormatter0.findWrapPos("--", 0, (int) 'a');
        helpFormatter0.setOptPrefix("arg");
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.setArgName("-");
        java.lang.String str26 = helpFormatter0.defaultArgName;
        helpFormatter0.setLongOptPrefix("   ");
        int int29 = helpFormatter0.getWidth();
        int int30 = helpFormatter0.defaultDescPad;
        java.io.PrintWriter printWriter31 = null;
        org.apache.commons.cli.Options options33 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter31, (int) (short) 1, options33, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-" + "'", str26, "-");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultDescPad;
        java.lang.String str9 = helpFormatter0.rtrim("--");
        helpFormatter0.defaultOptPrefix = "-";
        helpFormatter0.setWidth(9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("");
        int int3 = helpFormatter0.getLeftPadding();
        int int4 = helpFormatter0.defaultWidth;
        int int5 = helpFormatter0.defaultDescPad;
        int int9 = helpFormatter0.findWrapPos(" ", 74, 73);
        java.util.Comparator comparator10 = helpFormatter0.getOptionComparator();
        java.lang.Class<?> wildcardClass11 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        int int8 = helpFormatter0.defaultDescPad;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        helpFormatter0.setLongOptPrefix("                                   ");
        int int12 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str10 = helpFormatter8.rtrim("arg");
        helpFormatter8.defaultOptPrefix = "--";
        helpFormatter8.setOptPrefix("-");
        helpFormatter8.setDescPadding(1);
        helpFormatter8.defaultDescPad = (short) 100;
        org.apache.commons.cli.HelpFormatter helpFormatter19 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str21 = helpFormatter19.rtrim("arg");
        java.lang.String str22 = helpFormatter19.defaultSyntaxPrefix;
        java.util.Comparator comparator23 = helpFormatter19.optionComparator;
        helpFormatter8.setOptionComparator(comparator23);
        helpFormatter0.optionComparator = comparator23;
        int int26 = helpFormatter0.getWidth();
        helpFormatter0.setDescPadding((int) (short) 0);
        helpFormatter0.setDescPadding(35);
        org.apache.commons.cli.Options options33 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", "                                                    ", options33, "             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "usage: " + "'", str22, "usage: ");
        org.junit.Assert.assertNotNull(comparator23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 74 + "'", int26 == 74);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter3 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str5 = helpFormatter3.rtrim("arg");
        java.lang.String str6 = helpFormatter3.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter3.defaultOptPrefix;
        java.util.Comparator comparator8 = helpFormatter3.getOptionComparator();
        helpFormatter0.optionComparator = comparator8;
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str12 = helpFormatter10.rtrim("arg");
        java.lang.String str13 = helpFormatter10.defaultSyntaxPrefix;
        java.util.Comparator comparator14 = helpFormatter10.optionComparator;
        helpFormatter0.setOptionComparator(comparator14);
        helpFormatter0.setDescPadding((int) (byte) 1);
        helpFormatter0.setLeftPadding(0);
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("            ", "arg", options22, "                                             ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertNotNull(comparator14);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setDescPadding(0);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.getArgName();
        helpFormatter0.defaultWidth = (short) 100;
        java.lang.String str15 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLongOptPrefix("                                   ");
        helpFormatter0.defaultArgName = "         ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLongOptPrefix = "\n";
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str10 = helpFormatter8.rtrim("arg");
        helpFormatter8.defaultWidth = (short) -1;
        java.lang.String str13 = helpFormatter8.defaultArgName;
        helpFormatter8.setSyntaxPrefix("arg");
        java.lang.String str16 = helpFormatter8.getLongOptPrefix();
        helpFormatter8.defaultLongOptPrefix = "-";
        java.util.Comparator comparator19 = helpFormatter8.optionComparator;
        helpFormatter0.optionComparator = comparator19;
        helpFormatter0.setSyntaxPrefix("arg");
        java.io.PrintWriter printWriter23 = null;
        org.apache.commons.cli.Options options26 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter23, 0, "usage:", options26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertNotNull(comparator19);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix("hi!");
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.setOptPrefix("hi!");
        helpFormatter0.setNewLine("                                                                                                 ");
        int int15 = helpFormatter0.getWidth();
        helpFormatter0.setLongOptPrefix("                                                                         ");
        helpFormatter0.defaultLeftPad = (-1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        int int6 = helpFormatter0.defaultWidth;
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultLongOptPrefix = "";
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter11, 2, 11, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:            ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setDescPadding(0);
        java.lang.String str9 = helpFormatter0.createPadding((int) (short) 10);
        helpFormatter0.defaultNewLine = "                                                                         ";
        java.lang.String str12 = helpFormatter0.getArgName();
        java.lang.String str14 = helpFormatter0.rtrim("                                ");
        helpFormatter0.defaultLeftPad = 11;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "          " + "'", str9, "          ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultWidth;
        int int8 = helpFormatter0.getLeftPadding();
        int int12 = helpFormatter0.findWrapPos("          ", (int) ' ', 10);
        java.lang.String str13 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter14 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str16 = helpFormatter14.rtrim("arg");
        helpFormatter14.defaultWidth = (short) -1;
        java.lang.String str19 = helpFormatter14.defaultArgName;
        java.lang.String str20 = helpFormatter14.defaultArgName;
        helpFormatter14.setOptPrefix("hi!");
        helpFormatter14.defaultSyntaxPrefix = "usage: ";
        java.lang.String str25 = helpFormatter14.defaultNewLine;
        int int26 = helpFormatter14.defaultDescPad;
        java.lang.String str27 = helpFormatter14.getArgName();
        java.lang.String str28 = helpFormatter14.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter29 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter29.defaultOptPrefix = "hi!";
        int int35 = helpFormatter29.findWrapPos("--", (int) '#', (int) (short) 100);
        helpFormatter29.setArgName("arg");
        helpFormatter29.defaultOptPrefix = "";
        java.lang.String str41 = helpFormatter29.rtrim("                                                                                                 ");
        org.apache.commons.cli.HelpFormatter helpFormatter42 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str44 = helpFormatter42.rtrim("arg");
        helpFormatter42.defaultWidth = (short) -1;
        java.lang.String str47 = helpFormatter42.defaultArgName;
        helpFormatter42.setSyntaxPrefix("arg");
        helpFormatter42.setDescPadding((int) '#');
        helpFormatter42.defaultOptPrefix = "hi!";
        helpFormatter42.setLongOptPrefix("hi!");
        java.util.Comparator comparator56 = helpFormatter42.optionComparator;
        helpFormatter29.setOptionComparator(comparator56);
        helpFormatter14.optionComparator = comparator56;
        helpFormatter0.optionComparator = comparator56;
        java.io.PrintWriter printWriter60 = null;
        org.apache.commons.cli.Options options64 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter60, (int) (short) 10, " ", "   ", options64, (int) (short) 100, (int) 'a', "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "arg" + "'", str20, "arg");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\n" + "'", str25, "\n");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "arg" + "'", str27, "arg");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "arg" + "'", str44, "arg");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "arg" + "'", str47, "arg");
        org.junit.Assert.assertNotNull(comparator56);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding((int) ' ');
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str14 = helpFormatter12.rtrim("arg");
        helpFormatter12.defaultOptPrefix = "--";
        helpFormatter12.defaultNewLine = "arg";
        java.lang.String str19 = helpFormatter12.defaultOptPrefix;
        java.util.Comparator comparator20 = helpFormatter12.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator20);
        java.io.PrintWriter printWriter22 = null;
        org.apache.commons.cli.Options options26 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter22, (int) (byte) 0, "                                                                   ", "--", options26, 0, (int) (byte) 100, "                                                                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:         ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "--" + "'", str19, "--");
        org.junit.Assert.assertNotNull(comparator20);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        java.lang.String str9 = helpFormatter0.createPadding((int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                 " + "'", str9, "                                                                                                 ");
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        int int6 = helpFormatter0.findWrapPos("--", (int) '#', (int) (short) 100);
        java.lang.String str8 = helpFormatter0.createPadding((int) '#');
        helpFormatter0.setOptPrefix("");
        int int11 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setArgName("usage: ");
        helpFormatter0.setLongOptPrefix("                                             ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                   " + "'", str8, "                                   ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int10 = helpFormatter0.getLeftPadding();
        java.lang.String str12 = helpFormatter0.createPadding((int) '4');
        helpFormatter0.setNewLine("usage:");
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", "                                   ", options17, "                                                                          ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                    " + "'", str12, "                                                    ");
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth(74);
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str10 = helpFormatter8.rtrim("arg");
        java.lang.String str11 = helpFormatter8.defaultSyntaxPrefix;
        java.lang.String str12 = helpFormatter8.defaultOptPrefix;
        java.util.Comparator comparator13 = helpFormatter8.getOptionComparator();
        helpFormatter0.optionComparator = comparator13;
        int int15 = helpFormatter0.defaultDescPad;
        java.lang.String str16 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.setOptPrefix("                                   ");
        java.lang.String str22 = helpFormatter0.rtrim("usage:");
        java.lang.String str23 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "usage:" + "'", str22, "usage:");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "                                   " + "'", str23, "                                   ");
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultSyntaxPrefix = "\n";
        helpFormatter0.defaultOptPrefix = "   ";
        helpFormatter0.setArgName("                                                                          ");
        helpFormatter0.defaultArgName = "                                             ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setDescPadding(0);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str15 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                             ", "hi!", options20, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.util.Comparator comparator9 = null;
        helpFormatter0.optionComparator = comparator9;
        int int14 = helpFormatter0.findWrapPos("hi!", (int) 'a', (int) (byte) -1);
        int int15 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultOptPrefix = "usage: ";
        int int18 = helpFormatter0.defaultDescPad;
        java.lang.String str19 = helpFormatter0.getOptPrefix();
        int int20 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix("          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultDescPad = (byte) 0;
        helpFormatter0.setArgName(" ");
        org.apache.commons.cli.HelpFormatter helpFormatter15 = new org.apache.commons.cli.HelpFormatter();
        int int16 = helpFormatter15.defaultDescPad;
        helpFormatter15.defaultSyntaxPrefix = "\n";
        java.lang.String str19 = helpFormatter15.defaultNewLine;
        java.util.Comparator comparator20 = helpFormatter15.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator20);
        java.lang.String str22 = helpFormatter0.getNewLine();
        org.apache.commons.cli.Options options26 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(74, "                                                                   ", " ", options26, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n" + "'", str19, "\n");
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n" + "'", str22, "\n");
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.setSyntaxPrefix("                                   ");
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter10, 11, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:                                    hi!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int10 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultNewLine = "-";
        int int13 = helpFormatter0.getLeftPadding();
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter14, 73, "                                                                         ", "  ", options18, (int) (short) -1, 73, "                                   ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultLeftPad = (short) 10;
        helpFormatter0.defaultOptPrefix = "          ";
        int int12 = helpFormatter0.defaultWidth;
        java.lang.String str13 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.HelpFormatter helpFormatter15 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str17 = helpFormatter15.rtrim("arg");
        helpFormatter15.defaultWidth = (short) -1;
        int int23 = helpFormatter15.findWrapPos("usage: ", 0, (int) '4');
        helpFormatter15.setSyntaxPrefix("");
        helpFormatter15.setDescPadding((int) (short) 1);
        java.util.Comparator comparator28 = helpFormatter15.optionComparator;
        helpFormatter0.optionComparator = comparator28;
        org.apache.commons.cli.HelpFormatter helpFormatter30 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str32 = helpFormatter30.rtrim("arg");
        java.lang.String str33 = helpFormatter30.defaultSyntaxPrefix;
        java.lang.String str34 = helpFormatter30.defaultOptPrefix;
        java.util.Comparator comparator35 = helpFormatter30.getOptionComparator();
        java.lang.String str36 = helpFormatter30.getLongOptPrefix();
        java.lang.String str37 = helpFormatter30.getNewLine();
        java.lang.String str38 = helpFormatter30.getLongOptPrefix();
        java.util.Comparator comparator39 = helpFormatter30.optionComparator;
        helpFormatter0.setOptionComparator(comparator39);
        java.lang.String str41 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(comparator28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "arg" + "'", str32, "arg");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "usage: " + "'", str33, "usage: ");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-" + "'", str34, "-");
        org.junit.Assert.assertNotNull(comparator35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "--" + "'", str36, "--");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\n" + "'", str37, "\n");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "--" + "'", str38, "--");
        org.junit.Assert.assertNotNull(comparator39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "          " + "'", str41, "          ");
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setWidth(3);
        helpFormatter0.setLongOptPrefix("hi!");
        helpFormatter0.defaultLongOptPrefix = "";
        java.lang.String str14 = helpFormatter0.createPadding((int) ' ');
        int int15 = helpFormatter0.getDescPadding();
        int int16 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                " + "'", str14, "                                ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.defaultWidth = ' ';
        java.lang.String str12 = helpFormatter0.getNewLine();
        helpFormatter0.defaultDescPad = (short) -1;
        java.lang.String str15 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultLongOptPrefix = "-";
        int int18 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = (byte) 100;
        java.lang.String str8 = helpFormatter0.getArgName();
        helpFormatter0.setNewLine("-");
        int int11 = helpFormatter0.getLeftPadding();
        java.util.Comparator comparator12 = helpFormatter0.getOptionComparator();
        java.lang.String str13 = helpFormatter0.getNewLine();
        helpFormatter0.setDescPadding(52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter3 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str5 = helpFormatter3.rtrim("arg");
        java.lang.String str6 = helpFormatter3.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter3.defaultOptPrefix;
        java.util.Comparator comparator8 = helpFormatter3.getOptionComparator();
        helpFormatter0.optionComparator = comparator8;
        java.lang.String str10 = helpFormatter0.getArgName();
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultSyntaxPrefix = "             ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertNotNull(comparator11);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix("\n");
        helpFormatter0.defaultLongOptPrefix = "hi!";
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        int int11 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth(74);
        helpFormatter0.setDescPadding(13);
        int int10 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 13 + "'", int10 == 13);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        int int9 = helpFormatter0.findWrapPos(" ", (int) (short) 1, 10);
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultNewLine = "                                                                          ";
        java.lang.Class<?> wildcardClass13 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultArgName = "\n";
        helpFormatter0.defaultOptPrefix = "hi!";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("");
        int int3 = helpFormatter0.getLeftPadding();
        helpFormatter0.setOptPrefix("--");
        org.apache.commons.cli.HelpFormatter helpFormatter6 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str8 = helpFormatter6.rtrim("arg");
        helpFormatter6.defaultOptPrefix = "--";
        java.lang.String str11 = helpFormatter6.getLongOptPrefix();
        java.lang.String str12 = helpFormatter6.getNewLine();
        java.lang.String str13 = helpFormatter6.getOptPrefix();
        helpFormatter6.defaultLeftPad = (short) 10;
        org.apache.commons.cli.HelpFormatter helpFormatter16 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str18 = helpFormatter16.rtrim("arg");
        java.lang.String str19 = helpFormatter16.defaultSyntaxPrefix;
        java.util.Comparator comparator20 = helpFormatter16.optionComparator;
        java.lang.String str21 = helpFormatter16.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter22 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str24 = helpFormatter22.rtrim("arg");
        helpFormatter22.defaultOptPrefix = "--";
        helpFormatter22.setOptPrefix("-");
        helpFormatter22.setDescPadding(1);
        java.util.Comparator comparator31 = helpFormatter22.getOptionComparator();
        helpFormatter16.optionComparator = comparator31;
        helpFormatter6.optionComparator = comparator31;
        helpFormatter0.optionComparator = comparator31;
        java.lang.String str35 = helpFormatter0.defaultOptPrefix;
        int int36 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding(0);
        java.lang.String str39 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-" + "'", str21, "-");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "arg" + "'", str24, "arg");
        org.junit.Assert.assertNotNull(comparator31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "--" + "'", str35, "--");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\n" + "'", str39, "\n");
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        int int7 = helpFormatter0.findWrapPos("arg", 0, (int) ' ');
        helpFormatter0.setLeftPadding(100);
        java.lang.String str10 = helpFormatter0.getNewLine();
        int int11 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultDescPad = 9;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str11 = helpFormatter0.defaultOptPrefix;
        java.lang.String str12 = helpFormatter0.defaultArgName;
        int int13 = helpFormatter0.defaultLeftPad;
        int int14 = helpFormatter0.defaultWidth;
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter15, 12, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.util.Comparator comparator9 = null;
        helpFormatter0.optionComparator = comparator9;
        int int14 = helpFormatter0.findWrapPos("hi!", (int) 'a', (int) (byte) -1);
        int int15 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultOptPrefix = "usage: ";
        int int18 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultSyntaxPrefix = "arg";
        java.lang.String str21 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "usage: " + "'", str21, "usage: ");
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        int int7 = helpFormatter0.findWrapPos("arg", 0, (int) ' ');
        helpFormatter0.setLeftPadding(100);
        java.lang.String str10 = helpFormatter0.getNewLine();
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str13 = helpFormatter11.rtrim("arg");
        helpFormatter11.defaultOptPrefix = "--";
        helpFormatter11.defaultArgName = "                                                                                                    ";
        org.apache.commons.cli.HelpFormatter helpFormatter18 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str20 = helpFormatter18.rtrim("arg");
        java.lang.String str21 = helpFormatter18.getNewLine();
        java.lang.String str22 = helpFormatter18.getOptPrefix();
        helpFormatter18.setNewLine("usage: ");
        helpFormatter18.setWidth(3);
        java.lang.String str27 = helpFormatter18.defaultArgName;
        int int28 = helpFormatter18.defaultWidth;
        helpFormatter18.setLongOptPrefix("usage: ");
        org.apache.commons.cli.HelpFormatter helpFormatter31 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str33 = helpFormatter31.rtrim("arg");
        helpFormatter31.defaultWidth = (short) -1;
        java.lang.String str36 = helpFormatter31.defaultArgName;
        helpFormatter31.setSyntaxPrefix("arg");
        helpFormatter31.setSyntaxPrefix("--");
        java.util.Comparator comparator41 = helpFormatter31.optionComparator;
        helpFormatter18.optionComparator = comparator41;
        helpFormatter11.optionComparator = comparator41;
        helpFormatter0.optionComparator = comparator41;
        helpFormatter0.setDescPadding((int) (byte) 1);
        helpFormatter0.setOptPrefix("                                   ");
        org.apache.commons.cli.Options options51 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("         ", "-", options51, "           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "arg" + "'", str20, "arg");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n" + "'", str21, "\n");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-" + "'", str22, "-");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "arg" + "'", str27, "arg");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "arg" + "'", str33, "arg");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "arg" + "'", str36, "arg");
        org.junit.Assert.assertNotNull(comparator41);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        int int10 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str13 = helpFormatter11.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter14 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str16 = helpFormatter14.rtrim("arg");
        java.lang.String str17 = helpFormatter14.defaultSyntaxPrefix;
        java.lang.String str18 = helpFormatter14.defaultOptPrefix;
        java.util.Comparator comparator19 = helpFormatter14.getOptionComparator();
        helpFormatter11.optionComparator = comparator19;
        org.apache.commons.cli.HelpFormatter helpFormatter21 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str23 = helpFormatter21.rtrim("arg");
        java.lang.String str24 = helpFormatter21.defaultSyntaxPrefix;
        java.util.Comparator comparator25 = helpFormatter21.optionComparator;
        helpFormatter11.setOptionComparator(comparator25);
        helpFormatter11.setDescPadding((int) (byte) 1);
        org.apache.commons.cli.HelpFormatter helpFormatter29 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str31 = helpFormatter29.rtrim("arg");
        helpFormatter29.defaultOptPrefix = "--";
        helpFormatter29.setOptPrefix("-");
        helpFormatter29.setDescPadding(1);
        helpFormatter29.defaultDescPad = (short) 100;
        org.apache.commons.cli.HelpFormatter helpFormatter40 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str42 = helpFormatter40.rtrim("arg");
        java.lang.String str43 = helpFormatter40.defaultSyntaxPrefix;
        java.util.Comparator comparator44 = helpFormatter40.optionComparator;
        helpFormatter29.setOptionComparator(comparator44);
        helpFormatter11.optionComparator = comparator44;
        helpFormatter0.optionComparator = comparator44;
        java.lang.String str48 = helpFormatter0.getNewLine();
        helpFormatter0.setLeftPadding(1);
        java.util.Comparator comparator51 = helpFormatter0.optionComparator;
        java.lang.String str53 = helpFormatter0.createPadding(74);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str55 = helpFormatter0.createPadding((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage: " + "'", str17, "usage: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "arg" + "'", str23, "arg");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "usage: " + "'", str24, "usage: ");
        org.junit.Assert.assertNotNull(comparator25);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "arg" + "'", str31, "arg");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "arg" + "'", str42, "arg");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "usage: " + "'", str43, "usage: ");
        org.junit.Assert.assertNotNull(comparator44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\n" + "'", str48, "\n");
        org.junit.Assert.assertNotNull(comparator51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "                                                                          " + "'", str53, "                                                                          ");
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setWidth(3);
        helpFormatter0.setLongOptPrefix("hi!");
        int int11 = helpFormatter0.defaultDescPad;
        java.lang.Class<?> wildcardClass12 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultWidth = 10;
        helpFormatter0.setDescPadding((int) (byte) 0);
        java.lang.String str15 = helpFormatter0.getArgName();
        int int19 = helpFormatter0.findWrapPos("--", 0, (int) 'a');
        java.lang.String str21 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultNewLine = "arg";
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setLongOptPrefix("                                                    ");
        java.lang.Class<?> wildcardClass28 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        int int6 = helpFormatter0.defaultWidth;
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.defaultOptPrefix = "-";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultOptPrefix = "arg";
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str11 = helpFormatter0.createPadding((int) (byte) 1);
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", "hi!", options14, "         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " " + "'", str11, " ");
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultWidth = 10;
        helpFormatter0.setDescPadding((int) (byte) 0);
        java.lang.String str15 = helpFormatter0.getArgName();
        int int19 = helpFormatter0.findWrapPos("--", 0, (int) 'a');
        helpFormatter0.setOptPrefix("arg");
        int int25 = helpFormatter0.findWrapPos("hi!", (int) (short) 0, (int) 'a');
        java.lang.String str26 = helpFormatter0.defaultNewLine;
        java.lang.String str27 = helpFormatter0.getLongOptPrefix();
        int int28 = helpFormatter0.getDescPadding();
        java.lang.String str29 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\n" + "'", str26, "\n");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "--" + "'", str27, "--");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "arg" + "'", str29, "arg");
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultWidth = (byte) 0;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setDescPadding(0);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "hi!";
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter15, 0, "                                                                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:         ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setLongOptPrefix("hi!");
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        helpFormatter0.setSyntaxPrefix("\n");
        helpFormatter0.defaultOptPrefix = "";
        helpFormatter0.setDescPadding((int) (short) 0);
        helpFormatter0.setOptPrefix("                                   ");
        helpFormatter0.setLongOptPrefix("         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator9);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.setSyntaxPrefix("                                   ");
        java.util.Comparator comparator10 = helpFormatter0.optionComparator;
        java.lang.String str11 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter12, 11, " ", "  ", options16, 11, 2, "                                ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                   " + "'", str11, "                                   ");
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix("\n");
        int int8 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultArgName = "                                                                                                 ";
        java.lang.String str13 = helpFormatter0.rtrim("arg");
        helpFormatter0.setNewLine("                                                                   ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        helpFormatter0.defaultLeftPad = (byte) 1;
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultWidth = 1;
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        java.lang.String str15 = helpFormatter0.getOptPrefix();
        java.lang.String str16 = helpFormatter0.defaultArgName;
        java.lang.String str17 = helpFormatter0.getArgName();
        java.util.Comparator comparator18 = helpFormatter0.getOptionComparator();
        java.util.Comparator comparator19 = helpFormatter0.optionComparator;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
        org.junit.Assert.assertNotNull(comparator18);
        org.junit.Assert.assertNotNull(comparator19);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        int int10 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str13 = helpFormatter11.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter14 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str16 = helpFormatter14.rtrim("arg");
        java.lang.String str17 = helpFormatter14.defaultSyntaxPrefix;
        java.lang.String str18 = helpFormatter14.defaultOptPrefix;
        java.util.Comparator comparator19 = helpFormatter14.getOptionComparator();
        helpFormatter11.optionComparator = comparator19;
        org.apache.commons.cli.HelpFormatter helpFormatter21 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str23 = helpFormatter21.rtrim("arg");
        java.lang.String str24 = helpFormatter21.defaultSyntaxPrefix;
        java.util.Comparator comparator25 = helpFormatter21.optionComparator;
        helpFormatter11.setOptionComparator(comparator25);
        helpFormatter11.setDescPadding((int) (byte) 1);
        org.apache.commons.cli.HelpFormatter helpFormatter29 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str31 = helpFormatter29.rtrim("arg");
        helpFormatter29.defaultOptPrefix = "--";
        helpFormatter29.setOptPrefix("-");
        helpFormatter29.setDescPadding(1);
        helpFormatter29.defaultDescPad = (short) 100;
        org.apache.commons.cli.HelpFormatter helpFormatter40 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str42 = helpFormatter40.rtrim("arg");
        java.lang.String str43 = helpFormatter40.defaultSyntaxPrefix;
        java.util.Comparator comparator44 = helpFormatter40.optionComparator;
        helpFormatter29.setOptionComparator(comparator44);
        helpFormatter11.optionComparator = comparator44;
        helpFormatter0.optionComparator = comparator44;
        java.lang.String str48 = helpFormatter0.getNewLine();
        java.lang.String str49 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultOptPrefix = "                                                                          ";
        helpFormatter0.defaultArgName = "           ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage: " + "'", str17, "usage: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "arg" + "'", str23, "arg");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "usage: " + "'", str24, "usage: ");
        org.junit.Assert.assertNotNull(comparator25);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "arg" + "'", str31, "arg");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "arg" + "'", str42, "arg");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "usage: " + "'", str43, "usage: ");
        org.junit.Assert.assertNotNull(comparator44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\n" + "'", str48, "\n");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "--" + "'", str49, "--");
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultLeftPad = (short) 10;
        int int13 = helpFormatter0.findWrapPos("arg", (int) (short) 0, (int) (short) 10);
        helpFormatter0.setOptPrefix("usage:");
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(0, "          ", "", options19, "                                                    ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:         ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int10 = helpFormatter0.getLeftPadding();
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", "         ", options13, "            ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultDescPad = (short) 100;
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str13 = helpFormatter11.rtrim("arg");
        java.lang.String str14 = helpFormatter11.defaultSyntaxPrefix;
        java.util.Comparator comparator15 = helpFormatter11.optionComparator;
        java.lang.String str16 = helpFormatter11.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter17 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str19 = helpFormatter17.rtrim("arg");
        helpFormatter17.defaultOptPrefix = "--";
        helpFormatter17.setOptPrefix("-");
        helpFormatter17.setDescPadding(1);
        java.util.Comparator comparator26 = helpFormatter17.getOptionComparator();
        helpFormatter11.optionComparator = comparator26;
        java.util.Comparator comparator28 = helpFormatter11.optionComparator;
        helpFormatter0.optionComparator = comparator28;
        helpFormatter0.setLeftPadding(35);
        java.lang.String str32 = helpFormatter0.defaultSyntaxPrefix;
        int int33 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertNotNull(comparator26);
        org.junit.Assert.assertNotNull(comparator28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "usage: " + "'", str32, "usage: ");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLongOptPrefix = "\n";
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str10 = helpFormatter8.rtrim("arg");
        helpFormatter8.defaultWidth = (short) -1;
        java.lang.String str13 = helpFormatter8.defaultArgName;
        helpFormatter8.setSyntaxPrefix("arg");
        java.lang.String str16 = helpFormatter8.getLongOptPrefix();
        helpFormatter8.defaultLongOptPrefix = "-";
        java.util.Comparator comparator19 = helpFormatter8.optionComparator;
        helpFormatter0.optionComparator = comparator19;
        helpFormatter0.setSyntaxPrefix("arg");
        java.lang.String str23 = helpFormatter0.getArgName();
        org.apache.commons.cli.Options options27 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 0, "", "   ", options27, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "arg" + "'", str23, "arg");
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setDescPadding(0);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.getArgName();
        helpFormatter0.defaultWidth = (short) 100;
        helpFormatter0.setArgName("hi!");
        java.io.PrintWriter printWriter17 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter17, 73, "                                   ", "usage: ", options21, 1, 11, "           ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        int int7 = helpFormatter0.findWrapPos("arg", 0, (int) ' ');
        helpFormatter0.setLeftPadding(100);
        java.lang.String str10 = helpFormatter0.getNewLine();
        int int11 = helpFormatter0.defaultDescPad;
        int int12 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        helpFormatter0.setDescPadding(100);
        int int10 = helpFormatter0.findWrapPos("                                                                                                    ", (int) (byte) 0, 3);
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str15 = helpFormatter0.createPadding(0);
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter16, (int) (short) 10, options18, 73, 73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("");
        int int6 = helpFormatter0.findWrapPos("\n", 1, (int) (byte) 100);
        java.lang.String str7 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setSyntaxPrefix("  ");
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "  " + "'", str10, "  ");
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = (byte) 100;
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultWidth = (short) 0;
        helpFormatter0.setWidth((int) (byte) 0);
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", "            ", options15, "  ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultLeftPad = (short) 10;
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str12 = helpFormatter10.rtrim("arg");
        java.lang.String str13 = helpFormatter10.defaultSyntaxPrefix;
        java.util.Comparator comparator14 = helpFormatter10.optionComparator;
        java.lang.String str15 = helpFormatter10.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter16 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str18 = helpFormatter16.rtrim("arg");
        helpFormatter16.defaultOptPrefix = "--";
        helpFormatter16.setOptPrefix("-");
        helpFormatter16.setDescPadding(1);
        java.util.Comparator comparator25 = helpFormatter16.getOptionComparator();
        helpFormatter10.optionComparator = comparator25;
        helpFormatter0.optionComparator = comparator25;
        helpFormatter0.defaultLongOptPrefix = "";
        helpFormatter0.defaultArgName = "";
        int int32 = helpFormatter0.defaultLeftPad;
        java.lang.String str33 = helpFormatter0.defaultArgName;
        helpFormatter0.setDescPadding((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
        org.junit.Assert.assertNotNull(comparator25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        java.util.Comparator comparator7 = helpFormatter0.getOptionComparator();
        helpFormatter0.setArgName("-");
        int int10 = helpFormatter0.getDescPadding();
        int int11 = helpFormatter0.defaultWidth;
        int int12 = helpFormatter0.getWidth();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertNotNull(comparator7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("");
        int int6 = helpFormatter0.findWrapPos("\n", 1, (int) (byte) 100);
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(" ", "   ", options9, "   ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.io.PrintWriter printWriter8 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter8, 9, "\n", "           ", options12, 13, 72, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("");
        int int3 = helpFormatter0.getLeftPadding();
        helpFormatter0.setOptPrefix("--");
        org.apache.commons.cli.HelpFormatter helpFormatter6 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str8 = helpFormatter6.rtrim("arg");
        helpFormatter6.defaultOptPrefix = "--";
        java.lang.String str11 = helpFormatter6.getLongOptPrefix();
        java.lang.String str12 = helpFormatter6.getNewLine();
        java.lang.String str13 = helpFormatter6.getOptPrefix();
        helpFormatter6.defaultLeftPad = (short) 10;
        org.apache.commons.cli.HelpFormatter helpFormatter16 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str18 = helpFormatter16.rtrim("arg");
        java.lang.String str19 = helpFormatter16.defaultSyntaxPrefix;
        java.util.Comparator comparator20 = helpFormatter16.optionComparator;
        java.lang.String str21 = helpFormatter16.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter22 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str24 = helpFormatter22.rtrim("arg");
        helpFormatter22.defaultOptPrefix = "--";
        helpFormatter22.setOptPrefix("-");
        helpFormatter22.setDescPadding(1);
        java.util.Comparator comparator31 = helpFormatter22.getOptionComparator();
        helpFormatter16.optionComparator = comparator31;
        helpFormatter6.optionComparator = comparator31;
        helpFormatter0.optionComparator = comparator31;
        java.lang.String str35 = helpFormatter0.defaultOptPrefix;
        int int36 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultOptPrefix = " ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-" + "'", str21, "-");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "arg" + "'", str24, "arg");
        org.junit.Assert.assertNotNull(comparator31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "--" + "'", str35, "--");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 74 + "'", int36 == 74);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setDescPadding(0);
        java.lang.String str9 = helpFormatter0.createPadding((int) (short) 10);
        helpFormatter0.defaultNewLine = "                                                                         ";
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setWidth(100);
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter16, 1, "  ", "", options20, 87, (int) (byte) 0, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:    ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "          " + "'", str9, "          ");
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.setLongOptPrefix("");
        helpFormatter0.setDescPadding(3);
        int int14 = helpFormatter0.defaultWidth;
        java.lang.Class<?> wildcardClass15 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.getArgName();
        helpFormatter0.setLongOptPrefix("                                   ");
        helpFormatter0.defaultDescPad = (byte) 10;
        java.lang.String str16 = helpFormatter0.defaultArgName;
        java.lang.String str18 = helpFormatter0.createPadding((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "          " + "'", str18, "          ");
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLongOptPrefix("hi!");
        helpFormatter0.defaultDescPad = 35;
        int int12 = helpFormatter0.getLeftPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str15 = helpFormatter13.rtrim("arg");
        java.lang.String str16 = helpFormatter13.getNewLine();
        java.lang.String str17 = helpFormatter13.getOptPrefix();
        helpFormatter13.setOptPrefix("usage: ");
        java.lang.String str20 = helpFormatter13.getNewLine();
        java.lang.String str22 = helpFormatter13.rtrim("hi!");
        helpFormatter13.setWidth(10);
        java.lang.String str25 = helpFormatter13.defaultArgName;
        org.apache.commons.cli.HelpFormatter helpFormatter26 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str28 = helpFormatter26.rtrim("arg");
        helpFormatter26.setSyntaxPrefix("-");
        java.lang.String str31 = helpFormatter26.getOptPrefix();
        java.lang.String str32 = helpFormatter26.defaultSyntaxPrefix;
        int int33 = helpFormatter26.defaultDescPad;
        int int34 = helpFormatter26.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter35 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str37 = helpFormatter35.rtrim("arg");
        java.lang.String str38 = helpFormatter35.defaultSyntaxPrefix;
        java.lang.String str39 = helpFormatter35.defaultOptPrefix;
        java.util.Comparator comparator40 = helpFormatter35.getOptionComparator();
        helpFormatter26.setOptionComparator(comparator40);
        helpFormatter13.optionComparator = comparator40;
        helpFormatter0.setOptionComparator(comparator40);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\n" + "'", str20, "\n");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "arg" + "'", str25, "arg");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "arg" + "'", str28, "arg");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-" + "'", str31, "-");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-" + "'", str32, "-");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "arg" + "'", str37, "arg");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "usage: " + "'", str38, "usage: ");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "-" + "'", str39, "-");
        org.junit.Assert.assertNotNull(comparator40);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = (byte) 100;
        int int8 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLeftPad = (byte) 0;
        helpFormatter0.defaultArgName = "                                   ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultOptPrefix = "arg";
        helpFormatter0.defaultOptPrefix = "arg";
        int int9 = helpFormatter0.defaultWidth;
        java.util.Comparator comparator10 = helpFormatter0.getOptionComparator();
        int int11 = helpFormatter0.getDescPadding();
        int int12 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setLongOptPrefix("hi!");
        java.util.Comparator comparator9 = helpFormatter0.optionComparator;
        helpFormatter0.setOptPrefix("-");
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator13 = helpFormatter0.optionComparator;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertNotNull(comparator13);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        helpFormatter0.defaultWidth = (byte) 0;
        helpFormatter0.defaultDescPad = (short) 0;
        helpFormatter0.defaultLongOptPrefix = "";
        helpFormatter0.setLeftPadding(52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        java.lang.String str8 = helpFormatter0.getNewLine();
        int int12 = helpFormatter0.findWrapPos("          ", 67, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.defaultWidth = ' ';
        helpFormatter0.defaultLongOptPrefix = "          ";
        java.lang.String str14 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setWidth(0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "          " + "'", str14, "          ");
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultArgName = "                                                                                                    ";
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.setWidth((int) (short) 0);
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "  ";
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter13, (int) (short) 0, "\n", "                                                                   ", options17, (int) (byte) 0, (int) (short) -1, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:        ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        int int12 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter13.defaultOptPrefix = "hi!";
        helpFormatter13.setNewLine("\n");
        int int18 = helpFormatter13.getDescPadding();
        helpFormatter13.setOptPrefix("\n");
        java.lang.String str21 = helpFormatter13.defaultSyntaxPrefix;
        java.util.Comparator comparator22 = helpFormatter13.optionComparator;
        helpFormatter0.setOptionComparator(comparator22);
        int int24 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "                                                                                       ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "usage: " + "'", str21, "usage: ");
        org.junit.Assert.assertNotNull(comparator22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultDescPad = (short) 100;
        java.util.Comparator comparator11 = helpFormatter0.optionComparator;
        java.lang.String str13 = helpFormatter0.rtrim("\n");
        java.util.Comparator comparator14 = helpFormatter0.getOptionComparator();
        java.lang.String str15 = helpFormatter0.defaultArgName;
        int int16 = helpFormatter0.getDescPadding();
        java.io.PrintWriter printWriter17 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter17, (int) (byte) 0, options19, (int) (byte) -1, 87);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "-";
        java.util.Comparator comparator11 = helpFormatter0.optionComparator;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(73, "arg", "                                   ", options15, "             ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(comparator11);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("\n");
        java.lang.String str10 = helpFormatter0.createPadding((int) (short) 100);
        java.lang.String str12 = helpFormatter0.createPadding((int) 'a');
        helpFormatter0.setWidth((int) (short) 100);
        java.lang.String str15 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setDescPadding(0);
        java.io.PrintWriter printWriter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter18, 35, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                    " + "'", str10, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                 " + "'", str12, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        int int10 = helpFormatter0.findWrapPos("", (int) (byte) 100, (int) (short) 0);
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        int int13 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultOptPrefix = "arg";
        helpFormatter0.setDescPadding((int) (short) 100);
        helpFormatter0.defaultWidth = (byte) 100;
        java.lang.String str11 = helpFormatter0.defaultLongOptPrefix;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("  ", options13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        int int13 = helpFormatter0.findWrapPos("\n", 0, (int) '4');
        helpFormatter0.defaultDescPad = 67;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", "usage: ", options18, "   ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:                                                                                                            usage:");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.util.Comparator comparator9 = null;
        helpFormatter0.optionComparator = comparator9;
        int int14 = helpFormatter0.findWrapPos("hi!", (int) 'a', (int) (byte) -1);
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        java.lang.String str17 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setOptPrefix("-");
        int int20 = helpFormatter0.getWidth();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 74 + "'", int20 == 74);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        int int6 = helpFormatter0.defaultWidth;
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.defaultDescPad = 73;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultOptPrefix = "arg";
        helpFormatter0.defaultDescPad = (short) 10;
        helpFormatter0.setNewLine("          ");
        int int11 = helpFormatter0.getDescPadding();
        helpFormatter0.setNewLine("arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setLongOptPrefix("hi!");
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultLongOptPrefix = "                                   ";
        helpFormatter0.setArgName("arg");
        helpFormatter0.defaultLeftPad = 67;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator9);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str10 = helpFormatter8.rtrim("arg");
        helpFormatter8.defaultOptPrefix = "--";
        helpFormatter8.setOptPrefix("-");
        helpFormatter8.setDescPadding(1);
        helpFormatter8.defaultDescPad = (short) 100;
        org.apache.commons.cli.HelpFormatter helpFormatter19 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str21 = helpFormatter19.rtrim("arg");
        java.lang.String str22 = helpFormatter19.defaultSyntaxPrefix;
        java.util.Comparator comparator23 = helpFormatter19.optionComparator;
        helpFormatter8.setOptionComparator(comparator23);
        helpFormatter0.optionComparator = comparator23;
        java.lang.String str27 = helpFormatter0.createPadding((int) (short) 0);
        int int28 = helpFormatter0.getLeftPadding();
        int int29 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.HelpFormatter helpFormatter30 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str32 = helpFormatter30.rtrim("arg");
        java.lang.String str33 = helpFormatter30.getNewLine();
        helpFormatter30.defaultArgName = "usage: ";
        helpFormatter30.defaultDescPad = (byte) 100;
        java.lang.String str38 = helpFormatter30.getOptPrefix();
        java.lang.String str39 = helpFormatter30.defaultOptPrefix;
        java.util.Comparator comparator40 = helpFormatter30.optionComparator;
        helpFormatter0.setOptionComparator(comparator40);
        java.lang.String str42 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "usage: " + "'", str22, "usage: ");
        org.junit.Assert.assertNotNull(comparator23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 74 + "'", int29 == 74);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "arg" + "'", str32, "arg");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\n" + "'", str33, "\n");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-" + "'", str38, "-");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "-" + "'", str39, "-");
        org.junit.Assert.assertNotNull(comparator40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\n" + "'", str42, "\n");
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        helpFormatter0.defaultLeftPad = (byte) 1;
        helpFormatter0.defaultLeftPad = (short) 1;
        int int13 = helpFormatter0.getWidth();
        int int14 = helpFormatter0.getWidth();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setDescPadding(0);
        java.lang.String str8 = helpFormatter0.getNewLine();
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str11 = helpFormatter9.rtrim("arg");
        helpFormatter9.defaultOptPrefix = "--";
        int int14 = helpFormatter9.getLeftPadding();
        helpFormatter9.setWidth(74);
        org.apache.commons.cli.HelpFormatter helpFormatter17 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str19 = helpFormatter17.rtrim("arg");
        java.lang.String str20 = helpFormatter17.defaultSyntaxPrefix;
        java.lang.String str21 = helpFormatter17.defaultOptPrefix;
        java.util.Comparator comparator22 = helpFormatter17.getOptionComparator();
        helpFormatter9.optionComparator = comparator22;
        helpFormatter0.setOptionComparator(comparator22);
        helpFormatter0.defaultLeftPad = (short) 1;
        java.lang.String str27 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLongOptPrefix("                                                                         ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "usage: " + "'", str20, "usage: ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-" + "'", str21, "-");
        org.junit.Assert.assertNotNull(comparator22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        java.util.Comparator comparator10 = helpFormatter0.optionComparator;
        java.lang.String str11 = helpFormatter0.defaultArgName;
        int int15 = helpFormatter0.findWrapPos(" ", 3, 3);
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter16, (int) (short) -1, "                                                                   ", "hi!", options20, 45, 11, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 69");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        int int8 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.getWidth();
        helpFormatter0.setOptPrefix("");
        helpFormatter0.defaultSyntaxPrefix = "";
        helpFormatter0.setNewLine("hi!");
        int int16 = helpFormatter0.defaultLeftPad;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", options18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setLongOptPrefix("hi!");
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        int int12 = helpFormatter0.getLeftPadding();
        java.lang.String str13 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.util.Comparator comparator5 = null;
        helpFormatter0.setOptionComparator(comparator5);
        java.lang.String str7 = helpFormatter0.defaultArgName;
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        int int12 = helpFormatter0.findWrapPos("                                                                         ", (int) (byte) 10, (int) '#');
        helpFormatter0.defaultLeftPad = '#';
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 45 + "'", int12 == 45);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setDescPadding(0);
        int int8 = helpFormatter0.defaultWidth;
        java.util.Comparator comparator9 = helpFormatter0.optionComparator;
        java.lang.Class<?> wildcardClass10 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.defaultArgName = "                                   ";
        int int9 = helpFormatter0.defaultDescPad;
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "-";
        java.util.Comparator comparator11 = helpFormatter0.optionComparator;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) -1, "                                                                                                    ", "--", options15, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 103");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(comparator11);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.util.Comparator comparator9 = null;
        helpFormatter0.optionComparator = comparator9;
        int int14 = helpFormatter0.findWrapPos("hi!", (int) 'a', (int) (byte) -1);
        int int15 = helpFormatter0.defaultDescPad;
        helpFormatter0.setOptPrefix("arg");
        int int18 = helpFormatter0.defaultWidth;
        java.io.PrintWriter printWriter19 = null;
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter19, 74, "hi!", "\n", options23, (int) (byte) 1, 11, "   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 74 + "'", int18 == 74);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter3 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str5 = helpFormatter3.rtrim("arg");
        java.lang.String str6 = helpFormatter3.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter3.defaultOptPrefix;
        java.util.Comparator comparator8 = helpFormatter3.getOptionComparator();
        helpFormatter0.optionComparator = comparator8;
        int int13 = helpFormatter0.findWrapPos("usage: ", 3, (int) (short) 10);
        helpFormatter0.defaultNewLine = "                                                    ";
        int int16 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultArgName = "usage: ";
        int int19 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str10 = helpFormatter8.rtrim("arg");
        helpFormatter8.defaultOptPrefix = "--";
        helpFormatter8.setOptPrefix("-");
        helpFormatter8.setDescPadding(1);
        helpFormatter8.defaultDescPad = (short) 100;
        org.apache.commons.cli.HelpFormatter helpFormatter19 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str21 = helpFormatter19.rtrim("arg");
        java.lang.String str22 = helpFormatter19.defaultSyntaxPrefix;
        java.util.Comparator comparator23 = helpFormatter19.optionComparator;
        helpFormatter8.setOptionComparator(comparator23);
        helpFormatter0.optionComparator = comparator23;
        java.lang.String str27 = helpFormatter0.createPadding((int) (short) 0);
        int int28 = helpFormatter0.getLeftPadding();
        int int29 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.HelpFormatter helpFormatter30 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str32 = helpFormatter30.rtrim("arg");
        java.lang.String str33 = helpFormatter30.getNewLine();
        helpFormatter30.defaultArgName = "usage: ";
        helpFormatter30.defaultDescPad = (byte) 100;
        java.lang.String str38 = helpFormatter30.getOptPrefix();
        java.lang.String str39 = helpFormatter30.defaultOptPrefix;
        java.util.Comparator comparator40 = helpFormatter30.optionComparator;
        helpFormatter0.setOptionComparator(comparator40);
        java.io.PrintWriter printWriter42 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter42, (int) (byte) 0, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "usage: " + "'", str22, "usage: ");
        org.junit.Assert.assertNotNull(comparator23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 74 + "'", int29 == 74);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "arg" + "'", str32, "arg");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\n" + "'", str33, "\n");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-" + "'", str38, "-");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "-" + "'", str39, "-");
        org.junit.Assert.assertNotNull(comparator40);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str9 = helpFormatter0.rtrim("hi!");
        int int10 = helpFormatter0.defaultLeftPad;
        int int11 = helpFormatter0.getWidth();
        helpFormatter0.defaultArgName = "";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultDescPad = (byte) 0;
        helpFormatter0.setSyntaxPrefix("            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        helpFormatter0.defaultWidth = (byte) 0;
        helpFormatter0.defaultDescPad = (short) 0;
        helpFormatter0.defaultLongOptPrefix = "";
        int int12 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter13, (int) (byte) -1, "   ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        int int6 = helpFormatter0.findWrapPos("--", (int) '#', (int) (short) 100);
        helpFormatter0.setArgName("arg");
        helpFormatter0.defaultOptPrefix = "";
        java.lang.String str12 = helpFormatter0.rtrim("                                                                                                 ");
        int int13 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLongOptPrefix = "--";
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter16, 0, "--", options19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.getNewLine();
        int int8 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter9, (int) '4', (int) (byte) 10, "                                                                         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        int int8 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.getWidth();
        helpFormatter0.setOptPrefix("");
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultArgName = "                                                                                                    ";
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.setWidth((int) (short) 0);
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("--");
        java.lang.String str13 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultDescPad = (short) 100;
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str13 = helpFormatter11.rtrim("arg");
        java.lang.String str14 = helpFormatter11.defaultSyntaxPrefix;
        java.util.Comparator comparator15 = helpFormatter11.optionComparator;
        java.lang.String str16 = helpFormatter11.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter17 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str19 = helpFormatter17.rtrim("arg");
        helpFormatter17.defaultOptPrefix = "--";
        helpFormatter17.setOptPrefix("-");
        helpFormatter17.setDescPadding(1);
        java.util.Comparator comparator26 = helpFormatter17.getOptionComparator();
        helpFormatter11.optionComparator = comparator26;
        java.util.Comparator comparator28 = helpFormatter11.optionComparator;
        helpFormatter0.optionComparator = comparator28;
        helpFormatter0.setLeftPadding(35);
        java.lang.String str32 = helpFormatter0.getNewLine();
        java.io.PrintWriter printWriter33 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter33, (int) (short) 10, 0, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertNotNull(comparator26);
        org.junit.Assert.assertNotNull(comparator28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\n" + "'", str32, "\n");
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.rtrim("--");
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultOptPrefix = "";
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("             ", options12);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 20");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        int int8 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.getWidth();
        helpFormatter0.setOptPrefix("");
        helpFormatter0.defaultSyntaxPrefix = "";
        helpFormatter0.setNewLine("hi!");
        java.lang.String str16 = helpFormatter0.getNewLine();
        int int17 = helpFormatter0.defaultDescPad;
        java.lang.String str18 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding((int) ' ');
        java.util.Comparator comparator12 = helpFormatter0.getOptionComparator();
        java.lang.String str13 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter14, (int) (byte) 0, "usage:", options17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getNewLine();
        java.lang.String str9 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str12 = helpFormatter10.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str15 = helpFormatter13.rtrim("arg");
        java.lang.String str16 = helpFormatter13.defaultSyntaxPrefix;
        java.lang.String str17 = helpFormatter13.defaultOptPrefix;
        java.util.Comparator comparator18 = helpFormatter13.getOptionComparator();
        helpFormatter10.optionComparator = comparator18;
        int int23 = helpFormatter10.findWrapPos("usage: ", 3, (int) (short) 10);
        java.util.Comparator comparator24 = helpFormatter10.getOptionComparator();
        helpFormatter0.optionComparator = comparator24;
        java.lang.String str26 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("hi!");
        java.io.PrintWriter printWriter29 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter29, 0, 72, "  ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:                                                                         ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertNotNull(comparator18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(comparator24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-" + "'", str26, "-");
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultWidth = 10;
        helpFormatter0.setDescPadding((int) (byte) 0);
        java.lang.String str15 = helpFormatter0.getArgName();
        int int19 = helpFormatter0.findWrapPos("--", 0, (int) 'a');
        helpFormatter0.setOptPrefix("arg");
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.setArgName("-");
        java.lang.String str26 = helpFormatter0.defaultArgName;
        java.lang.String str27 = helpFormatter0.getNewLine();
        java.io.PrintWriter printWriter28 = null;
        org.apache.commons.cli.Options options30 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter28, (int) 'a', options30, 10, 45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-" + "'", str26, "-");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\n" + "'", str27, "\n");
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str10 = helpFormatter8.rtrim("arg");
        helpFormatter8.defaultOptPrefix = "--";
        helpFormatter8.setOptPrefix("-");
        helpFormatter8.setDescPadding(1);
        helpFormatter8.defaultDescPad = (short) 100;
        org.apache.commons.cli.HelpFormatter helpFormatter19 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str21 = helpFormatter19.rtrim("arg");
        java.lang.String str22 = helpFormatter19.defaultSyntaxPrefix;
        java.util.Comparator comparator23 = helpFormatter19.optionComparator;
        helpFormatter8.setOptionComparator(comparator23);
        helpFormatter0.optionComparator = comparator23;
        java.lang.String str27 = helpFormatter0.createPadding((int) (short) 0);
        int int28 = helpFormatter0.getLeftPadding();
        java.lang.String str29 = helpFormatter0.getSyntaxPrefix();
        java.lang.StringBuffer stringBuffer30 = null;
        org.apache.commons.cli.Options options32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer35 = helpFormatter0.renderOptions(stringBuffer30, 87, options32, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "usage: " + "'", str22, "usage: ");
        org.junit.Assert.assertNotNull(comparator23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "usage: " + "'", str29, "usage: ");
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultArgName = "                                                                                                    ";
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter8, (int) '#', "         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultWidth;
        int int8 = helpFormatter0.getLeftPadding();
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        int int9 = helpFormatter0.findWrapPos("-", (int) (short) 100, 74);
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        helpFormatter0.setLongOptPrefix("                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setLongOptPrefix("hi!");
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultLongOptPrefix = "                                   ";
        helpFormatter0.setArgName("arg");
        java.lang.String str14 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.defaultArgName = "                                   ";
        int int9 = helpFormatter0.defaultDescPad;
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str12 = helpFormatter0.createPadding(74);
        int int13 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                          " + "'", str12, "                                                                          ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter3 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str5 = helpFormatter3.rtrim("arg");
        java.lang.String str6 = helpFormatter3.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter3.defaultOptPrefix;
        java.util.Comparator comparator8 = helpFormatter3.getOptionComparator();
        helpFormatter0.optionComparator = comparator8;
        int int13 = helpFormatter0.findWrapPos("\n", (int) '#', 1);
        java.lang.String str15 = helpFormatter0.createPadding((int) (byte) 10);
        helpFormatter0.defaultLongOptPrefix = "hi!";
        java.io.PrintWriter printWriter18 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter18, 74, "             ", options21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "          " + "'", str15, "          ");
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setNewLine("\n");
        int int11 = helpFormatter0.defaultLeftPad;
        java.lang.String str13 = helpFormatter0.createPadding((int) (byte) 100);
        helpFormatter0.defaultNewLine = "                                   ";
        helpFormatter0.setOptPrefix("                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                                                                                    " + "'", str13, "                                                                                                    ");
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        int int9 = helpFormatter0.findWrapPos(" ", (int) (short) 1, 10);
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = 1;
        java.lang.String str14 = helpFormatter0.createPadding(10);
        java.io.PrintWriter printWriter15 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter15, 11, "                                   ", options18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "          " + "'", str14, "          ");
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        helpFormatter0.defaultWidth = (byte) 0;
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str10 = helpFormatter8.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str13 = helpFormatter11.rtrim("arg");
        java.lang.String str14 = helpFormatter11.defaultSyntaxPrefix;
        java.lang.String str15 = helpFormatter11.defaultOptPrefix;
        java.util.Comparator comparator16 = helpFormatter11.getOptionComparator();
        helpFormatter8.optionComparator = comparator16;
        int int21 = helpFormatter8.findWrapPos("usage: ", 3, (int) (short) 10);
        helpFormatter8.defaultArgName = "\n";
        int int24 = helpFormatter8.defaultLeftPad;
        java.util.Comparator comparator25 = helpFormatter8.optionComparator;
        helpFormatter0.optionComparator = comparator25;
        int int27 = helpFormatter0.getWidth();
        org.apache.commons.cli.Options options31 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(52, "                                ", "                                                                         ", options31, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertNotNull(comparator16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(comparator25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.defaultWidth = 3;
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        int int11 = helpFormatter0.getDescPadding();
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultLeftPad = (byte) 0;
        int int15 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setDescPadding(12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setDescPadding(0);
        java.lang.String str8 = helpFormatter0.getNewLine();
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str11 = helpFormatter9.rtrim("arg");
        helpFormatter9.defaultOptPrefix = "--";
        int int14 = helpFormatter9.getLeftPadding();
        helpFormatter9.setWidth(74);
        org.apache.commons.cli.HelpFormatter helpFormatter17 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str19 = helpFormatter17.rtrim("arg");
        java.lang.String str20 = helpFormatter17.defaultSyntaxPrefix;
        java.lang.String str21 = helpFormatter17.defaultOptPrefix;
        java.util.Comparator comparator22 = helpFormatter17.getOptionComparator();
        helpFormatter9.optionComparator = comparator22;
        helpFormatter0.setOptionComparator(comparator22);
        int int25 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "usage: " + "'", str20, "usage: ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-" + "'", str21, "-");
        org.junit.Assert.assertNotNull(comparator22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultNewLine = "arg";
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(0, "                                                                         ", "--", options11, "                                                                                                    ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:         ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultWidth = 10;
        helpFormatter0.defaultNewLine = "                                                                                                 ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setDescPadding(0);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.getArgName();
        helpFormatter0.defaultWidth = (short) 100;
        org.apache.commons.cli.HelpFormatter helpFormatter15 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str17 = helpFormatter15.rtrim("arg");
        java.lang.String str18 = helpFormatter15.getNewLine();
        java.lang.String str19 = helpFormatter15.getOptPrefix();
        helpFormatter15.defaultOptPrefix = "arg";
        org.apache.commons.cli.HelpFormatter helpFormatter22 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str24 = helpFormatter22.rtrim("arg");
        java.lang.String str25 = helpFormatter22.getNewLine();
        java.lang.String str26 = helpFormatter22.getOptPrefix();
        helpFormatter22.setOptPrefix("usage: ");
        java.lang.String str29 = helpFormatter22.getNewLine();
        java.lang.String str31 = helpFormatter22.rtrim("hi!");
        int int32 = helpFormatter22.defaultLeftPad;
        java.util.Comparator comparator33 = helpFormatter22.optionComparator;
        helpFormatter15.setOptionComparator(comparator33);
        helpFormatter0.setOptionComparator(comparator33);
        org.apache.commons.cli.HelpFormatter helpFormatter36 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str38 = helpFormatter36.rtrim("arg");
        helpFormatter36.defaultOptPrefix = "--";
        helpFormatter36.setOptPrefix("-");
        helpFormatter36.setDescPadding(1);
        helpFormatter36.defaultWidth = 1;
        helpFormatter36.defaultWidth = 10;
        helpFormatter36.setDescPadding((int) (byte) 0);
        java.lang.String str51 = helpFormatter36.getArgName();
        int int55 = helpFormatter36.findWrapPos("--", 0, (int) 'a');
        helpFormatter36.setOptPrefix("arg");
        helpFormatter36.defaultSyntaxPrefix = "usage: ";
        java.util.Comparator comparator60 = helpFormatter36.optionComparator;
        java.lang.String str61 = helpFormatter36.getNewLine();
        org.apache.commons.cli.HelpFormatter helpFormatter62 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str64 = helpFormatter62.rtrim("arg");
        helpFormatter62.defaultWidth = (short) -1;
        helpFormatter62.defaultOptPrefix = "--";
        int int69 = helpFormatter62.getWidth();
        helpFormatter62.defaultWidth = 3;
        java.lang.String str72 = helpFormatter62.getLongOptPrefix();
        int int73 = helpFormatter62.getDescPadding();
        int int74 = helpFormatter62.defaultLeftPad;
        org.apache.commons.cli.HelpFormatter helpFormatter75 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str77 = helpFormatter75.rtrim("arg");
        helpFormatter75.setSyntaxPrefix("-");
        java.lang.String str80 = helpFormatter75.getOptPrefix();
        helpFormatter75.setNewLine("");
        java.lang.String str83 = helpFormatter75.getLongOptPrefix();
        helpFormatter75.defaultLongOptPrefix = "usage: ";
        java.util.Comparator comparator86 = helpFormatter75.getOptionComparator();
        helpFormatter62.optionComparator = comparator86;
        helpFormatter36.optionComparator = comparator86;
        helpFormatter0.optionComparator = comparator86;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-" + "'", str19, "-");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "arg" + "'", str24, "arg");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\n" + "'", str25, "\n");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-" + "'", str26, "-");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\n" + "'", str29, "\n");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(comparator33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "arg" + "'", str38, "arg");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "arg" + "'", str51, "arg");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(comparator60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "\n" + "'", str61, "\n");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "arg" + "'", str64, "arg");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "--" + "'", str72, "--");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 3 + "'", int73 == 3);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "arg" + "'", str77, "arg");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "-" + "'", str80, "-");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "--" + "'", str83, "--");
        org.junit.Assert.assertNotNull(comparator86);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultOptPrefix = "                                                                                                    ";
        java.lang.StringBuffer stringBuffer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = helpFormatter0.renderWrappedText(stringBuffer13, 9, 73, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuffer.append(String)\" because \"sb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("\n");
        java.lang.String str10 = helpFormatter0.createPadding((int) (short) 100);
        java.lang.String str12 = helpFormatter0.createPadding((int) 'a');
        helpFormatter0.setWidth((int) (short) 100);
        java.lang.String str15 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter16 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str18 = helpFormatter16.rtrim("arg");
        helpFormatter16.defaultOptPrefix = "--";
        helpFormatter16.defaultArgName = "                                                                                                    ";
        helpFormatter16.setArgName("");
        helpFormatter16.setWidth((int) (byte) 1);
        helpFormatter16.setWidth(32);
        helpFormatter16.setOptPrefix("                                                                          ");
        java.util.Comparator comparator31 = helpFormatter16.optionComparator;
        helpFormatter0.optionComparator = comparator31;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                    " + "'", str10, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                 " + "'", str12, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
        org.junit.Assert.assertNotNull(comparator31);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setDescPadding(0);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.setWidth(74);
        int int17 = helpFormatter0.getLeftPadding();
        java.lang.String str18 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "--" + "'", str18, "--");
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.defaultWidth = 3;
        helpFormatter0.defaultOptPrefix = "";
        helpFormatter0.defaultSyntaxPrefix = "                                                                          ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.setOptPrefix("                                                                                                    ");
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter13, 13, "             ", options16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter10, 67, "                                                                         ", options13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setLongOptPrefix("hi!");
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter10, (int) 'a', "                                                    ", "                                                                                       ", options14, 45, (int) (byte) 1, "\n", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator9);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        int int8 = helpFormatter0.findWrapPos("", (int) (byte) 1, (int) (byte) 0);
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setWidth((int) (short) -1);
        helpFormatter0.setLongOptPrefix("\n");
        java.lang.String str14 = helpFormatter0.getArgName();
        java.lang.String str15 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultWidth = 10;
        helpFormatter0.setDescPadding((int) (byte) 0);
        java.lang.String str15 = helpFormatter0.getArgName();
        int int19 = helpFormatter0.findWrapPos("--", 0, (int) 'a');
        helpFormatter0.setOptPrefix("arg");
        java.io.PrintWriter printWriter22 = null;
        org.apache.commons.cli.Options options26 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter22, 11, "                                                                   ", "            ", options26, 87, 0, "--", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultArgName = "                                                                                                    ";
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.setWidth((int) (short) 0);
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                    ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultLeftPad = (short) 10;
        int int13 = helpFormatter0.findWrapPos("arg", (int) (short) 0, (int) (short) 10);
        int int17 = helpFormatter0.findWrapPos("", 2, (int) (short) 10);
        java.lang.StringBuffer stringBuffer18 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer23 = helpFormatter0.renderOptions(stringBuffer18, (int) (short) 1, options20, 74, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.getNewLine();
        java.util.Comparator comparator13 = helpFormatter0.optionComparator;
        helpFormatter0.setArgName("   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(comparator13);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "\n";
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultLeftPad = (short) 10;
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.defaultWidth = 3;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setWidth(45);
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        java.lang.String str10 = helpFormatter0.defaultArgName;
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultLeftPad = (short) 100;
        java.util.Comparator comparator13 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultOptPrefix = "";
        helpFormatter0.defaultWidth = 9;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertNotNull(comparator13);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.rtrim("--");
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultDescPad = (short) 10;
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str13 = helpFormatter11.rtrim("arg");
        java.lang.String str14 = helpFormatter11.defaultSyntaxPrefix;
        helpFormatter11.setNewLine("hi!");
        helpFormatter11.defaultWidth = (byte) 0;
        helpFormatter11.defaultDescPad = (short) 0;
        int int24 = helpFormatter11.findWrapPos("\n", (int) (short) 0, (int) (short) 100);
        int int25 = helpFormatter11.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter26 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str28 = helpFormatter26.rtrim("arg");
        java.lang.String str29 = helpFormatter26.getNewLine();
        helpFormatter26.defaultArgName = "usage: ";
        helpFormatter26.defaultDescPad = (byte) 100;
        java.lang.String str34 = helpFormatter26.getOptPrefix();
        int int35 = helpFormatter26.defaultDescPad;
        int int36 = helpFormatter26.getWidth();
        helpFormatter26.defaultSyntaxPrefix = "hi!";
        java.lang.String str39 = helpFormatter26.defaultLongOptPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter40 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str42 = helpFormatter40.rtrim("arg");
        java.lang.String str43 = helpFormatter40.defaultSyntaxPrefix;
        java.util.Comparator comparator44 = helpFormatter40.optionComparator;
        helpFormatter40.setDescPadding(100);
        int int50 = helpFormatter40.findWrapPos("                                                                                                    ", (int) (byte) 0, 3);
        java.util.Comparator comparator51 = helpFormatter40.getOptionComparator();
        helpFormatter26.optionComparator = comparator51;
        helpFormatter11.optionComparator = comparator51;
        helpFormatter0.optionComparator = comparator51;
        java.lang.String str55 = helpFormatter0.defaultNewLine;
        java.lang.String str56 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "arg" + "'", str28, "arg");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\n" + "'", str29, "\n");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-" + "'", str34, "-");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 74 + "'", int36 == 74);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "--" + "'", str39, "--");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "arg" + "'", str42, "arg");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "usage: " + "'", str43, "usage: ");
        org.junit.Assert.assertNotNull(comparator44);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 3 + "'", int50 == 3);
        org.junit.Assert.assertNotNull(comparator51);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\n" + "'", str55, "\n");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "arg" + "'", str56, "arg");
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.util.Comparator comparator9 = null;
        helpFormatter0.optionComparator = comparator9;
        int int14 = helpFormatter0.findWrapPos("hi!", (int) 'a', (int) (byte) -1);
        int int15 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultOptPrefix = "usage: ";
        int int18 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultSyntaxPrefix = "arg";
        java.lang.String str21 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        java.lang.String str24 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator25 = helpFormatter0.optionComparator;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "usage: " + "'", str21, "usage: ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "usage: " + "'", str24, "usage: ");
        org.junit.Assert.assertNull(comparator25);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.rtrim("--");
        int int8 = helpFormatter0.getWidth();
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        helpFormatter0.setLeftPadding((int) (byte) -1);
        helpFormatter0.defaultOptPrefix = "  ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setDescPadding(0);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.setArgName("                                                    ");
        java.lang.String str20 = helpFormatter0.rtrim("                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultWidth;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("          ");
        helpFormatter0.setSyntaxPrefix("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setWidth(1);
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultLeftPad = (short) 10;
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str12 = helpFormatter10.rtrim("arg");
        java.lang.String str13 = helpFormatter10.defaultSyntaxPrefix;
        java.util.Comparator comparator14 = helpFormatter10.optionComparator;
        java.lang.String str15 = helpFormatter10.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter16 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str18 = helpFormatter16.rtrim("arg");
        helpFormatter16.defaultOptPrefix = "--";
        helpFormatter16.setOptPrefix("-");
        helpFormatter16.setDescPadding(1);
        java.util.Comparator comparator25 = helpFormatter16.getOptionComparator();
        helpFormatter10.optionComparator = comparator25;
        helpFormatter0.optionComparator = comparator25;
        helpFormatter0.defaultLongOptPrefix = "";
        int int30 = helpFormatter0.getLeftPadding();
        helpFormatter0.setOptPrefix("  ");
        java.lang.String str34 = helpFormatter0.rtrim("--");
        org.apache.commons.cli.Options options38 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 1, "                                ", "--", options38, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:         ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
        org.junit.Assert.assertNotNull(comparator25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "--" + "'", str34, "--");
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        int int9 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultSyntaxPrefix = "\n";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.lang.String str5 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("   ", options8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultSyntaxPrefix = "\n";
        helpFormatter0.defaultOptPrefix = "   ";
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer10 = helpFormatter0.renderWrappedText(stringBuffer6, 45, 0, "                                                                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuffer.append(String)\" because \"sb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultDescPad = (short) 100;
        java.util.Comparator comparator11 = helpFormatter0.optionComparator;
        java.lang.String str13 = helpFormatter0.createPadding((int) (byte) 1);
        java.lang.String str15 = helpFormatter0.createPadding(73);
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter16, (int) (byte) 0, options18, (int) (short) 1, 45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " " + "'", str13, " ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                                                         " + "'", str15, "                                                                         ");
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.defaultDescPad;
        helpFormatter0.setArgName("                                                                                       ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        java.io.PrintWriter printWriter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter5, 52, 3, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        java.util.Comparator comparator12 = helpFormatter0.optionComparator;
        java.lang.String str14 = helpFormatter0.createPadding(9);
        java.lang.String str15 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "         " + "'", str14, "         ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.defaultOptPrefix = "hi!";
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter12, (int) (byte) 1, options14, 2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) ' ');
        helpFormatter0.defaultNewLine = "usage: ";
        helpFormatter0.defaultLongOptPrefix = "hi!";
        int int11 = helpFormatter0.defaultWidth;
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.getWidth();
        int int8 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setArgName("                                   ");
        int int7 = helpFormatter0.defaultWidth;
        helpFormatter0.setWidth(0);
        java.lang.String str10 = helpFormatter0.getNewLine();
        java.lang.String str11 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setNewLine(" ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("");
        int int3 = helpFormatter0.getLeftPadding();
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        int int6 = helpFormatter0.getLeftPadding();
        int int10 = helpFormatter0.findWrapPos("   ", (int) (short) 1, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        int int6 = helpFormatter0.findWrapPos("--", (int) '#', (int) (short) 100);
        helpFormatter0.setArgName("arg");
        helpFormatter0.defaultOptPrefix = "";
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter11, 87, "            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix("hi!");
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        int int11 = helpFormatter0.defaultWidth;
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter12, 35, " ", options15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int10 = helpFormatter0.getLeftPadding();
        java.lang.String str12 = helpFormatter0.createPadding((int) '4');
        int int13 = helpFormatter0.defaultLeftPad;
        java.util.Comparator comparator14 = helpFormatter0.getOptionComparator();
        org.apache.commons.cli.HelpFormatter helpFormatter15 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str17 = helpFormatter15.rtrim("arg");
        helpFormatter15.setSyntaxPrefix("-");
        java.lang.String str20 = helpFormatter15.getOptPrefix();
        java.lang.String str21 = helpFormatter15.defaultSyntaxPrefix;
        int int22 = helpFormatter15.defaultWidth;
        int int23 = helpFormatter15.getLeftPadding();
        int int27 = helpFormatter15.findWrapPos("          ", (int) ' ', 10);
        int int28 = helpFormatter15.getWidth();
        int int29 = helpFormatter15.defaultLeftPad;
        java.lang.String str30 = helpFormatter15.defaultNewLine;
        org.apache.commons.cli.HelpFormatter helpFormatter31 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str33 = helpFormatter31.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter34 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str36 = helpFormatter34.rtrim("arg");
        java.lang.String str37 = helpFormatter34.defaultSyntaxPrefix;
        java.lang.String str38 = helpFormatter34.defaultOptPrefix;
        java.util.Comparator comparator39 = helpFormatter34.getOptionComparator();
        helpFormatter31.optionComparator = comparator39;
        int int44 = helpFormatter31.findWrapPos("usage: ", 3, (int) (short) 10);
        helpFormatter31.defaultArgName = "\n";
        int int47 = helpFormatter31.defaultLeftPad;
        java.util.Comparator comparator48 = helpFormatter31.optionComparator;
        helpFormatter15.optionComparator = comparator48;
        helpFormatter0.setOptionComparator(comparator48);
        int int51 = helpFormatter0.defaultLeftPad;
        int int55 = helpFormatter0.findWrapPos("                                                                   ", 12, (int) (byte) 100);
        java.lang.String str56 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.StringBuffer stringBuffer57 = null;
        org.apache.commons.cli.Options options59 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer62 = helpFormatter0.renderOptions(stringBuffer57, 32, options59, 73, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                    " + "'", str12, "                                                    ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-" + "'", str20, "-");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-" + "'", str21, "-");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 74 + "'", int22 == 74);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 74 + "'", int28 == 74);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\n" + "'", str30, "\n");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "arg" + "'", str33, "arg");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "arg" + "'", str36, "arg");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "usage: " + "'", str37, "usage: ");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-" + "'", str38, "-");
        org.junit.Assert.assertNotNull(comparator39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(comparator48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "usage: " + "'", str56, "usage: ");
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setLongOptPrefix("hi!");
        java.util.Comparator comparator14 = helpFormatter0.getOptionComparator();
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter15, 35, 3, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertNotNull(comparator14);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultArgName = "                                                                                                    ";
        helpFormatter0.defaultLeftPad = 67;
        int int9 = helpFormatter0.defaultWidth;
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setWidth(3);
        helpFormatter0.setLongOptPrefix("hi!");
        helpFormatter0.setSyntaxPrefix("           ");
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        helpFormatter0.defaultWidth = (byte) 0;
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str10 = helpFormatter8.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str13 = helpFormatter11.rtrim("arg");
        java.lang.String str14 = helpFormatter11.defaultSyntaxPrefix;
        java.lang.String str15 = helpFormatter11.defaultOptPrefix;
        java.util.Comparator comparator16 = helpFormatter11.getOptionComparator();
        helpFormatter8.optionComparator = comparator16;
        int int21 = helpFormatter8.findWrapPos("usage: ", 3, (int) (short) 10);
        helpFormatter8.defaultArgName = "\n";
        int int24 = helpFormatter8.defaultLeftPad;
        java.util.Comparator comparator25 = helpFormatter8.optionComparator;
        helpFormatter0.optionComparator = comparator25;
        java.lang.String str28 = helpFormatter0.createPadding(2);
        java.lang.String str29 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator30 = helpFormatter0.getOptionComparator();
        java.lang.Class<?> wildcardClass31 = comparator30.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertNotNull(comparator16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(comparator25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "  " + "'", str28, "  ");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "usage: " + "'", str29, "usage: ");
        org.junit.Assert.assertNotNull(comparator30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("");
        int int3 = helpFormatter0.getLeftPadding();
        helpFormatter0.setOptPrefix("--");
        org.apache.commons.cli.HelpFormatter helpFormatter6 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str8 = helpFormatter6.rtrim("arg");
        helpFormatter6.defaultOptPrefix = "--";
        java.lang.String str11 = helpFormatter6.getLongOptPrefix();
        java.lang.String str12 = helpFormatter6.getNewLine();
        java.lang.String str13 = helpFormatter6.getOptPrefix();
        helpFormatter6.defaultLeftPad = (short) 10;
        org.apache.commons.cli.HelpFormatter helpFormatter16 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str18 = helpFormatter16.rtrim("arg");
        java.lang.String str19 = helpFormatter16.defaultSyntaxPrefix;
        java.util.Comparator comparator20 = helpFormatter16.optionComparator;
        java.lang.String str21 = helpFormatter16.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter22 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str24 = helpFormatter22.rtrim("arg");
        helpFormatter22.defaultOptPrefix = "--";
        helpFormatter22.setOptPrefix("-");
        helpFormatter22.setDescPadding(1);
        java.util.Comparator comparator31 = helpFormatter22.getOptionComparator();
        helpFormatter16.optionComparator = comparator31;
        helpFormatter6.optionComparator = comparator31;
        helpFormatter0.optionComparator = comparator31;
        java.lang.String str35 = helpFormatter0.defaultOptPrefix;
        int int36 = helpFormatter0.defaultWidth;
        java.io.PrintWriter printWriter37 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter37, 12, "           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-" + "'", str21, "-");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "arg" + "'", str24, "arg");
        org.junit.Assert.assertNotNull(comparator31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "--" + "'", str35, "--");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 74 + "'", int36 == 74);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultOptPrefix = "arg";
        helpFormatter0.defaultOptPrefix = "arg";
        int int9 = helpFormatter0.defaultWidth;
        java.util.Comparator comparator10 = helpFormatter0.getOptionComparator();
        helpFormatter0.setArgName("                                                                                                 ");
        java.lang.String str13 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultOptPrefix = "arg";
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setLongOptPrefix("hi!");
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        helpFormatter0.setSyntaxPrefix("\n");
        helpFormatter0.setLongOptPrefix("");
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter15, 72, "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.getArgName();
        org.apache.commons.cli.HelpFormatter helpFormatter6 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str8 = helpFormatter6.rtrim("arg");
        helpFormatter6.defaultWidth = (short) -1;
        java.lang.String str11 = helpFormatter6.defaultArgName;
        helpFormatter6.setSyntaxPrefix("arg");
        helpFormatter6.setSyntaxPrefix("--");
        java.util.Comparator comparator16 = helpFormatter6.optionComparator;
        helpFormatter0.optionComparator = comparator16;
        java.util.Comparator comparator18 = null;
        helpFormatter0.optionComparator = comparator18;
        int int20 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertNotNull(comparator16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setLeftPadding((int) (short) 1);
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.defaultWidth = 74;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix("\n");
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator9 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "\n";
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        java.lang.String str14 = helpFormatter0.createPadding(0);
        java.lang.String str15 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultArgName = "                                                                                                    ";
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.setWidth((int) (short) 0);
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "  ";
        java.lang.Class<?> wildcardClass13 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter3 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str5 = helpFormatter3.rtrim("arg");
        java.lang.String str6 = helpFormatter3.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter3.defaultOptPrefix;
        java.util.Comparator comparator8 = helpFormatter3.getOptionComparator();
        helpFormatter0.optionComparator = comparator8;
        int int13 = helpFormatter0.findWrapPos("usage: ", 3, (int) (short) 10);
        helpFormatter0.defaultArgName = "\n";
        java.lang.String str16 = helpFormatter0.defaultSyntaxPrefix;
        int int17 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLeftPadding(87);
        int int20 = helpFormatter0.getDescPadding();
        int int21 = helpFormatter0.getLeftPadding();
        java.io.PrintWriter printWriter22 = null;
        org.apache.commons.cli.Options options26 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter22, (int) ' ', "           ", "                                             ", options26, 45, (int) (byte) 10, "  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 87 + "'", int21 == 87);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        helpFormatter0.defaultWidth = (byte) 0;
        helpFormatter0.defaultDescPad = (short) 0;
        int int10 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("  ", " ", options13, "");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:         ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setDescPadding(0);
        java.lang.String str9 = helpFormatter0.createPadding((int) (short) 10);
        helpFormatter0.defaultNewLine = "                                                                         ";
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setWidth(100);
        org.apache.commons.cli.HelpFormatter helpFormatter16 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str18 = helpFormatter16.rtrim("arg");
        helpFormatter16.defaultWidth = (short) -1;
        java.lang.String str21 = helpFormatter16.defaultArgName;
        java.lang.String str23 = helpFormatter16.rtrim("--");
        java.lang.String str24 = helpFormatter16.getSyntaxPrefix();
        helpFormatter16.defaultDescPad = (short) 10;
        org.apache.commons.cli.HelpFormatter helpFormatter27 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str29 = helpFormatter27.rtrim("arg");
        java.lang.String str30 = helpFormatter27.defaultSyntaxPrefix;
        helpFormatter27.setNewLine("hi!");
        helpFormatter27.defaultWidth = (byte) 0;
        helpFormatter27.defaultDescPad = (short) 0;
        int int40 = helpFormatter27.findWrapPos("\n", (int) (short) 0, (int) (short) 100);
        int int41 = helpFormatter27.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter42 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str44 = helpFormatter42.rtrim("arg");
        java.lang.String str45 = helpFormatter42.getNewLine();
        helpFormatter42.defaultArgName = "usage: ";
        helpFormatter42.defaultDescPad = (byte) 100;
        java.lang.String str50 = helpFormatter42.getOptPrefix();
        int int51 = helpFormatter42.defaultDescPad;
        int int52 = helpFormatter42.getWidth();
        helpFormatter42.defaultSyntaxPrefix = "hi!";
        java.lang.String str55 = helpFormatter42.defaultLongOptPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter56 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str58 = helpFormatter56.rtrim("arg");
        java.lang.String str59 = helpFormatter56.defaultSyntaxPrefix;
        java.util.Comparator comparator60 = helpFormatter56.optionComparator;
        helpFormatter56.setDescPadding(100);
        int int66 = helpFormatter56.findWrapPos("                                                                                                    ", (int) (byte) 0, 3);
        java.util.Comparator comparator67 = helpFormatter56.getOptionComparator();
        helpFormatter42.optionComparator = comparator67;
        helpFormatter27.optionComparator = comparator67;
        helpFormatter16.optionComparator = comparator67;
        org.apache.commons.cli.HelpFormatter helpFormatter71 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str73 = helpFormatter71.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter74 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str76 = helpFormatter74.rtrim("arg");
        java.lang.String str77 = helpFormatter74.defaultSyntaxPrefix;
        java.lang.String str78 = helpFormatter74.defaultOptPrefix;
        java.util.Comparator comparator79 = helpFormatter74.getOptionComparator();
        helpFormatter71.optionComparator = comparator79;
        int int84 = helpFormatter71.findWrapPos("usage: ", 3, (int) (short) 10);
        helpFormatter71.defaultArgName = "\n";
        int int87 = helpFormatter71.defaultLeftPad;
        java.util.Comparator comparator88 = helpFormatter71.optionComparator;
        helpFormatter16.optionComparator = comparator88;
        helpFormatter0.optionComparator = comparator88;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "          " + "'", str9, "          ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "--" + "'", str23, "--");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "usage: " + "'", str24, "usage: ");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "arg" + "'", str29, "arg");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "usage: " + "'", str30, "usage: ");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "arg" + "'", str44, "arg");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\n" + "'", str45, "\n");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "-" + "'", str50, "-");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 74 + "'", int52 == 74);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "--" + "'", str55, "--");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "arg" + "'", str58, "arg");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "usage: " + "'", str59, "usage: ");
        org.junit.Assert.assertNotNull(comparator60);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 3 + "'", int66 == 3);
        org.junit.Assert.assertNotNull(comparator67);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "arg" + "'", str73, "arg");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "arg" + "'", str76, "arg");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "usage: " + "'", str77, "usage: ");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "-" + "'", str78, "-");
        org.junit.Assert.assertNotNull(comparator79);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertNotNull(comparator88);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.getNewLine();
        java.lang.String str13 = helpFormatter0.rtrim("-");
        int int14 = helpFormatter0.getDescPadding();
        java.lang.String str15 = helpFormatter0.getNewLine();
        helpFormatter0.defaultDescPad = (short) 1;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix("hi!");
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        int int12 = helpFormatter0.defaultDescPad;
        java.lang.String str13 = helpFormatter0.getArgName();
        java.lang.String str14 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter15 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter15.defaultOptPrefix = "hi!";
        int int21 = helpFormatter15.findWrapPos("--", (int) '#', (int) (short) 100);
        helpFormatter15.setArgName("arg");
        helpFormatter15.defaultOptPrefix = "";
        java.lang.String str27 = helpFormatter15.rtrim("                                                                                                 ");
        org.apache.commons.cli.HelpFormatter helpFormatter28 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str30 = helpFormatter28.rtrim("arg");
        helpFormatter28.defaultWidth = (short) -1;
        java.lang.String str33 = helpFormatter28.defaultArgName;
        helpFormatter28.setSyntaxPrefix("arg");
        helpFormatter28.setDescPadding((int) '#');
        helpFormatter28.defaultOptPrefix = "hi!";
        helpFormatter28.setLongOptPrefix("hi!");
        java.util.Comparator comparator42 = helpFormatter28.optionComparator;
        helpFormatter15.setOptionComparator(comparator42);
        helpFormatter0.optionComparator = comparator42;
        org.apache.commons.cli.Options options46 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "arg" + "'", str30, "arg");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "arg" + "'", str33, "arg");
        org.junit.Assert.assertNotNull(comparator42);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setWidth(1);
        helpFormatter0.defaultOptPrefix = "-";
        helpFormatter0.defaultOptPrefix = "";
        java.io.PrintWriter printWriter7 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter7, (int) (short) -1, "         ", "usage:", options11, (int) (short) 100, 3, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultWidth;
        java.lang.String str6 = helpFormatter0.createPadding((int) (short) 10);
        helpFormatter0.defaultDescPad = (byte) -1;
        java.lang.String str9 = helpFormatter0.defaultArgName;
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = helpFormatter0.renderOptions(stringBuffer10, 10, options12, 74, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "          " + "'", str6, "          ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        int int12 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultSyntaxPrefix = "                                ";
        helpFormatter0.setWidth((int) ' ');
        helpFormatter0.setSyntaxPrefix("                                   ");
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(73, "                                                                   ", "\n", options22, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setWidth((int) '4');
        java.lang.String str3 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.setLongOptPrefix("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter3 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str5 = helpFormatter3.rtrim("arg");
        java.lang.String str6 = helpFormatter3.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter3.defaultOptPrefix;
        java.util.Comparator comparator8 = helpFormatter3.getOptionComparator();
        helpFormatter0.optionComparator = comparator8;
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str12 = helpFormatter10.rtrim("arg");
        java.lang.String str13 = helpFormatter10.defaultSyntaxPrefix;
        java.util.Comparator comparator14 = helpFormatter10.optionComparator;
        helpFormatter0.setOptionComparator(comparator14);
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str18 = helpFormatter0.defaultNewLine;
        int int19 = helpFormatter0.defaultWidth;
        java.lang.String str20 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLeftPadding((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 74 + "'", int19 == 74);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-" + "'", str20, "-");
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setWidth(3);
        helpFormatter0.setLongOptPrefix("hi!");
        helpFormatter0.defaultLongOptPrefix = "";
        java.lang.String str14 = helpFormatter0.createPadding((int) ' ');
        java.io.PrintWriter printWriter15 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter15, (int) '#', options17, 45, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                " + "'", str14, "                                ");
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        int int8 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.getWidth();
        helpFormatter0.defaultOptPrefix = "   ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultDescPad;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        int int12 = helpFormatter0.defaultLeftPad;
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        java.lang.String str14 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("\n");
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        int int11 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str14 = helpFormatter12.rtrim("arg");
        java.lang.String str15 = helpFormatter12.getNewLine();
        helpFormatter12.defaultArgName = "usage: ";
        helpFormatter12.defaultDescPad = (byte) 100;
        java.lang.String str20 = helpFormatter12.getOptPrefix();
        java.lang.String str21 = helpFormatter12.defaultOptPrefix;
        java.util.Comparator comparator22 = helpFormatter12.optionComparator;
        helpFormatter0.optionComparator = comparator22;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-" + "'", str20, "-");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-" + "'", str21, "-");
        org.junit.Assert.assertNotNull(comparator22);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultOptPrefix = "arg";
        helpFormatter0.setLeftPadding(2);
        helpFormatter0.defaultLeftPad = 87;
        helpFormatter0.setLeftPadding((int) (byte) -1);
        helpFormatter0.defaultArgName = "                                                                         ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setArgName("                                   ");
        helpFormatter0.defaultOptPrefix = "                                   ";
        helpFormatter0.setLeftPadding((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.defaultNewLine = "-";
        java.lang.String str12 = helpFormatter0.defaultLongOptPrefix;
        java.util.Comparator comparator13 = helpFormatter0.getOptionComparator();
        int int17 = helpFormatter0.findWrapPos("\n", 3, (int) (byte) -1);
        int int18 = helpFormatter0.defaultLeftPad;
        java.lang.Class<?> wildcardClass19 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        int int9 = helpFormatter0.findWrapPos(" ", (int) (short) 1, 10);
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setNewLine("  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setLongOptPrefix("   ");
        helpFormatter0.setOptPrefix("--");
        java.lang.String str9 = helpFormatter0.getArgName();
        helpFormatter0.defaultLeftPad = 10;
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, (int) (byte) 0, (-1), "   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix("hi!");
        int int9 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultSyntaxPrefix = "                                   ";
        helpFormatter0.defaultLongOptPrefix = "arg";
        helpFormatter0.setSyntaxPrefix("   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter3 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str5 = helpFormatter3.rtrim("arg");
        java.lang.String str6 = helpFormatter3.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter3.defaultOptPrefix;
        java.util.Comparator comparator8 = helpFormatter3.getOptionComparator();
        helpFormatter0.optionComparator = comparator8;
        int int13 = helpFormatter0.findWrapPos("usage: ", 3, (int) (short) 10);
        int int14 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str7 = helpFormatter0.defaultArgName;
        int int8 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultOptPrefix = "                                                                          ";
        helpFormatter0.setNewLine("                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultDescPad;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertNotNull(comparator11);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix("\n");
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setSyntaxPrefix("usage: ");
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        int int12 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultWidth;
        int int8 = helpFormatter0.getLeftPadding();
        int int12 = helpFormatter0.findWrapPos("          ", (int) ' ', 10);
        java.lang.String str13 = helpFormatter0.getLongOptPrefix();
        java.lang.String str14 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("         ", options16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultArgName = "                                                                                                    ";
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.setWidth((int) (short) 0);
        helpFormatter0.defaultOptPrefix = "                                                                                       ";
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, 12, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setLeftPadding((int) (byte) -1);
        java.lang.String str12 = helpFormatter0.getArgName();
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter13, 9, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("");
        int int6 = helpFormatter0.findWrapPos("", (int) (short) 1, (int) (byte) 0);
        helpFormatter0.defaultSyntaxPrefix = "                                   ";
        helpFormatter0.defaultArgName = "                                                                          ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int10 = helpFormatter0.getLeftPadding();
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderOptions(stringBuffer11, (int) (byte) -1, options13, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        int int8 = helpFormatter0.defaultDescPad;
        int int9 = helpFormatter0.getDescPadding();
        java.lang.Class<?> wildcardClass10 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix("\n");
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator9 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "\n";
        int int12 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        int int9 = helpFormatter0.findWrapPos(" ", (int) (short) 1, 10);
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultNewLine = "                                                                          ";
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter13, (int) (short) 0, "                                   ", "  ", options17, (-1), 72, "usage:", false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:         ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setNewLine("         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        int int10 = helpFormatter0.getDescPadding();
        java.lang.String str12 = helpFormatter0.rtrim("");
        int int16 = helpFormatter0.findWrapPos("-", 74, 72);
        int int17 = helpFormatter0.getDescPadding();
        java.lang.String str18 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultWidth = 10;
        helpFormatter0.setDescPadding((int) (byte) 0);
        java.lang.String str15 = helpFormatter0.getArgName();
        int int19 = helpFormatter0.findWrapPos("--", 0, (int) 'a');
        helpFormatter0.setOptPrefix("arg");
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.setArgName("-");
        java.lang.String str26 = helpFormatter0.defaultArgName;
        helpFormatter0.setLongOptPrefix("   ");
        int int29 = helpFormatter0.getWidth();
        helpFormatter0.setDescPadding((int) (short) 100);
        helpFormatter0.defaultNewLine = "                                                                         ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-" + "'", str26, "-");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        helpFormatter0.defaultWidth = (byte) 0;
        helpFormatter0.defaultDescPad = (short) 0;
        int int13 = helpFormatter0.findWrapPos("\n", (int) (short) 0, (int) (short) 100);
        java.lang.String str14 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter15 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str17 = helpFormatter15.rtrim("arg");
        java.lang.String str18 = helpFormatter15.getNewLine();
        java.lang.String str19 = helpFormatter15.getLongOptPrefix();
        helpFormatter15.setLongOptPrefix("\n");
        int int25 = helpFormatter15.findWrapPos("          ", 0, (int) 'a');
        java.util.Comparator comparator26 = helpFormatter15.optionComparator;
        helpFormatter0.setOptionComparator(comparator26);
        int int28 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter29 = null;
        org.apache.commons.cli.Options options31 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter29, 87, options31, 1, 74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "--" + "'", str19, "--");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(comparator26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        int int10 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str13 = helpFormatter11.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter14 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str16 = helpFormatter14.rtrim("arg");
        java.lang.String str17 = helpFormatter14.defaultSyntaxPrefix;
        java.lang.String str18 = helpFormatter14.defaultOptPrefix;
        java.util.Comparator comparator19 = helpFormatter14.getOptionComparator();
        helpFormatter11.optionComparator = comparator19;
        org.apache.commons.cli.HelpFormatter helpFormatter21 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str23 = helpFormatter21.rtrim("arg");
        java.lang.String str24 = helpFormatter21.defaultSyntaxPrefix;
        java.util.Comparator comparator25 = helpFormatter21.optionComparator;
        helpFormatter11.setOptionComparator(comparator25);
        helpFormatter11.setDescPadding((int) (byte) 1);
        org.apache.commons.cli.HelpFormatter helpFormatter29 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str31 = helpFormatter29.rtrim("arg");
        helpFormatter29.defaultOptPrefix = "--";
        helpFormatter29.setOptPrefix("-");
        helpFormatter29.setDescPadding(1);
        helpFormatter29.defaultDescPad = (short) 100;
        org.apache.commons.cli.HelpFormatter helpFormatter40 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str42 = helpFormatter40.rtrim("arg");
        java.lang.String str43 = helpFormatter40.defaultSyntaxPrefix;
        java.util.Comparator comparator44 = helpFormatter40.optionComparator;
        helpFormatter29.setOptionComparator(comparator44);
        helpFormatter11.optionComparator = comparator44;
        helpFormatter0.optionComparator = comparator44;
        java.lang.String str48 = helpFormatter0.getNewLine();
        java.lang.String str49 = helpFormatter0.getLongOptPrefix();
        java.lang.String str50 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage: " + "'", str17, "usage: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "arg" + "'", str23, "arg");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "usage: " + "'", str24, "usage: ");
        org.junit.Assert.assertNotNull(comparator25);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "arg" + "'", str31, "arg");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "arg" + "'", str42, "arg");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "usage: " + "'", str43, "usage: ");
        org.junit.Assert.assertNotNull(comparator44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\n" + "'", str48, "\n");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "--" + "'", str49, "--");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "-" + "'", str50, "-");
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultDescPad;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding((int) (byte) 1);
        int int11 = helpFormatter0.getLeftPadding();
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str15 = helpFormatter0.createPadding(73);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                                                         " + "'", str15, "                                                                         ");
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultLeftPad = (short) 10;
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str12 = helpFormatter10.rtrim("arg");
        java.lang.String str13 = helpFormatter10.defaultSyntaxPrefix;
        java.util.Comparator comparator14 = helpFormatter10.optionComparator;
        java.lang.String str15 = helpFormatter10.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter16 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str18 = helpFormatter16.rtrim("arg");
        helpFormatter16.defaultOptPrefix = "--";
        helpFormatter16.setOptPrefix("-");
        helpFormatter16.setDescPadding(1);
        java.util.Comparator comparator25 = helpFormatter16.getOptionComparator();
        helpFormatter10.optionComparator = comparator25;
        helpFormatter0.optionComparator = comparator25;
        java.util.Comparator comparator28 = helpFormatter0.optionComparator;
        java.util.Comparator comparator29 = null;
        helpFormatter0.setOptionComparator(comparator29);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = helpFormatter0.findWrapPos("hi!", (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
        org.junit.Assert.assertNotNull(comparator25);
        org.junit.Assert.assertNotNull(comparator28);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.defaultWidth = 3;
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        int int11 = helpFormatter0.getDescPadding();
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultLeftPad = (byte) 0;
        int int15 = helpFormatter0.defaultLeftPad;
        java.lang.StringBuffer stringBuffer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = helpFormatter0.renderWrappedText(stringBuffer16, 87, 67, "            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuffer.append(String)\" because \"sb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth(74);
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str10 = helpFormatter8.rtrim("arg");
        java.lang.String str11 = helpFormatter8.defaultSyntaxPrefix;
        java.lang.String str12 = helpFormatter8.defaultOptPrefix;
        java.util.Comparator comparator13 = helpFormatter8.getOptionComparator();
        helpFormatter0.optionComparator = comparator13;
        helpFormatter0.setDescPadding((int) (byte) 1);
        int int17 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = 73;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setOptPrefix("--");
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str14 = helpFormatter12.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter15 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str17 = helpFormatter15.rtrim("arg");
        java.lang.String str18 = helpFormatter15.defaultSyntaxPrefix;
        java.lang.String str19 = helpFormatter15.defaultOptPrefix;
        java.util.Comparator comparator20 = helpFormatter15.getOptionComparator();
        helpFormatter12.optionComparator = comparator20;
        org.apache.commons.cli.HelpFormatter helpFormatter22 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str24 = helpFormatter22.rtrim("arg");
        java.lang.String str25 = helpFormatter22.defaultSyntaxPrefix;
        java.util.Comparator comparator26 = helpFormatter22.optionComparator;
        helpFormatter12.setOptionComparator(comparator26);
        helpFormatter12.setDescPadding((int) (byte) 1);
        java.lang.String str30 = helpFormatter12.defaultNewLine;
        helpFormatter12.setNewLine("--");
        org.apache.commons.cli.HelpFormatter helpFormatter33 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter33.defaultOptPrefix = "hi!";
        int int39 = helpFormatter33.findWrapPos("--", (int) '#', (int) (short) 100);
        helpFormatter33.defaultLeftPad = 0;
        java.util.Comparator comparator42 = helpFormatter33.getOptionComparator();
        helpFormatter12.optionComparator = comparator42;
        java.util.Comparator comparator44 = helpFormatter12.getOptionComparator();
        helpFormatter0.optionComparator = comparator44;
        java.io.PrintWriter printWriter46 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter46, (int) '#', "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "usage: " + "'", str18, "usage: ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-" + "'", str19, "-");
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "arg" + "'", str24, "arg");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "usage: " + "'", str25, "usage: ");
        org.junit.Assert.assertNotNull(comparator26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\n" + "'", str30, "\n");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(comparator42);
        org.junit.Assert.assertNotNull(comparator44);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        helpFormatter0.setDescPadding(100);
        int int10 = helpFormatter0.findWrapPos("                                                                                                    ", (int) (byte) 0, 3);
        helpFormatter0.setNewLine("");
        int int13 = helpFormatter0.getLeftPadding();
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter14, 10, "                                             ", "   ", options18, (int) (short) 100, 11, "                                                                         ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setWidth(45);
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultNewLine = "-";
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str14 = helpFormatter12.rtrim("arg");
        java.lang.String str15 = helpFormatter12.defaultSyntaxPrefix;
        java.util.Comparator comparator16 = helpFormatter12.optionComparator;
        java.lang.String str17 = helpFormatter12.getOptPrefix();
        java.lang.String str18 = helpFormatter12.defaultNewLine;
        java.lang.String str19 = helpFormatter12.defaultArgName;
        helpFormatter12.defaultLongOptPrefix = "";
        helpFormatter12.setWidth((int) ' ');
        helpFormatter12.setArgName("usage:");
        java.util.Comparator comparator26 = helpFormatter12.getOptionComparator();
        helpFormatter0.optionComparator = comparator26;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "usage: " + "'", str15, "usage: ");
        org.junit.Assert.assertNotNull(comparator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertNotNull(comparator26);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int10 = helpFormatter0.getLeftPadding();
        java.lang.String str12 = helpFormatter0.createPadding((int) '4');
        helpFormatter0.setLeftPadding((int) '4');
        helpFormatter0.defaultArgName = "                                ";
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) ' ', "           ", "                                                                        ", options20, "   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                    " + "'", str12, "                                                    ");
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultArgName = "                                                                                                    ";
        java.lang.String str7 = helpFormatter0.getArgName();
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str10 = helpFormatter8.rtrim("arg");
        java.lang.String str11 = helpFormatter8.defaultOptPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str14 = helpFormatter12.rtrim("arg");
        java.lang.String str15 = helpFormatter12.getNewLine();
        java.lang.String str16 = helpFormatter12.getOptPrefix();
        helpFormatter12.setOptPrefix("usage: ");
        java.lang.String str19 = helpFormatter12.getNewLine();
        java.lang.String str21 = helpFormatter12.rtrim("hi!");
        int int22 = helpFormatter12.defaultLeftPad;
        java.util.Comparator comparator23 = helpFormatter12.optionComparator;
        helpFormatter8.setOptionComparator(comparator23);
        helpFormatter0.optionComparator = comparator23;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                    " + "'", str7, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n" + "'", str19, "\n");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(comparator23);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        int int10 = helpFormatter0.findWrapPos("", (int) (byte) 100, (int) (short) 0);
        int int11 = helpFormatter0.defaultDescPad;
        helpFormatter0.setSyntaxPrefix("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        int int8 = helpFormatter0.defaultDescPad;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.defaultArgName = "--";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        helpFormatter0.defaultWidth = (byte) 0;
        helpFormatter0.defaultDescPad = (short) 0;
        int int13 = helpFormatter0.findWrapPos("\n", (int) (short) 0, (int) (short) 100);
        int int14 = helpFormatter0.getDescPadding();
        java.lang.String str15 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "usage: " + "'", str15, "usage: ");
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        int int5 = helpFormatter0.getLeftPadding();
        java.lang.String str6 = helpFormatter0.getArgName();
        helpFormatter0.setWidth(10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("\n");
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setLeftPadding(3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultOptPrefix = "\n";
        helpFormatter0.defaultNewLine = "                                                                          ";
        java.util.Comparator comparator16 = helpFormatter0.optionComparator;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertNotNull(comparator16);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        helpFormatter0.defaultWidth = (byte) 0;
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str10 = helpFormatter8.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str13 = helpFormatter11.rtrim("arg");
        java.lang.String str14 = helpFormatter11.defaultSyntaxPrefix;
        java.lang.String str15 = helpFormatter11.defaultOptPrefix;
        java.util.Comparator comparator16 = helpFormatter11.getOptionComparator();
        helpFormatter8.optionComparator = comparator16;
        int int21 = helpFormatter8.findWrapPos("usage: ", 3, (int) (short) 10);
        helpFormatter8.defaultArgName = "\n";
        int int24 = helpFormatter8.defaultLeftPad;
        java.util.Comparator comparator25 = helpFormatter8.optionComparator;
        helpFormatter0.optionComparator = comparator25;
        int int27 = helpFormatter0.getLeftPadding();
        helpFormatter0.setSyntaxPrefix("                                                                                                 ");
        org.apache.commons.cli.Options options33 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(0, "           ", "                                                                                       ", options33, "                                                                                       ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertNotNull(comparator16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(comparator25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.setArgName("--");
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        helpFormatter0.setOptPrefix("");
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setArgName("                                   ");
        helpFormatter0.setLeftPadding(74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str9 = helpFormatter0.rtrim("hi!");
        int int10 = helpFormatter0.defaultLeftPad;
        java.util.Comparator comparator11 = helpFormatter0.optionComparator;
        java.util.Comparator comparator12 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultWidth = (short) 100;
        helpFormatter0.defaultNewLine = "  ";
        java.io.PrintWriter printWriter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter17, (int) (short) -1, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 39");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertNotNull(comparator12);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        int int10 = helpFormatter0.getDescPadding();
        java.lang.String str12 = helpFormatter0.rtrim("");
        int int16 = helpFormatter0.findWrapPos("-", 74, 72);
        helpFormatter0.defaultOptPrefix = "                                                                                                 ";
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("         ", "", options21, "-", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 11");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultWidth;
        java.lang.String str6 = helpFormatter0.rtrim("-");
        java.lang.String str7 = helpFormatter0.getArgName();
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        int int9 = helpFormatter0.defaultLeftPad;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", "--", options12, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("");
        int int3 = helpFormatter0.getLeftPadding();
        helpFormatter0.setOptPrefix("--");
        java.lang.String str6 = helpFormatter0.getArgName();
        helpFormatter0.setLongOptPrefix("--");
        java.lang.String str10 = helpFormatter0.rtrim("          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setNewLine("\n");
        java.lang.String str11 = helpFormatter0.getSyntaxPrefix();
        int int12 = helpFormatter0.getDescPadding();
        java.lang.String str13 = helpFormatter0.getNewLine();
        int int14 = helpFormatter0.defaultDescPad;
        java.lang.String str15 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding((int) (byte) 0);
        java.lang.String str18 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "usage: " + "'", str15, "usage: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int10 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultDescPad = 0;
        int int16 = helpFormatter0.findWrapPos("                                                                                       ", (int) 'a', (int) (short) -1);
        helpFormatter0.setWidth((int) (byte) 0);
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("-", "           ", options21, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:        -");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setWidth(45);
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        int int10 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultNewLine = "                                                                         ";
        java.lang.String str13 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "usage:";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        helpFormatter0.setLeftPadding((int) '4');
        int int9 = helpFormatter0.getWidth();
        helpFormatter0.setArgName("                                                    ");
        java.lang.String str12 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str9 = helpFormatter0.rtrim("hi!");
        int int10 = helpFormatter0.defaultLeftPad;
        java.util.Comparator comparator11 = helpFormatter0.optionComparator;
        java.util.Comparator comparator12 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str16 = helpFormatter0.rtrim("          ");
        java.io.PrintWriter printWriter17 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter17, 87, options19, 13, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setDescPadding((int) (short) -1);
        helpFormatter0.setWidth((int) (byte) 100);
        helpFormatter0.setSyntaxPrefix("usage: ");
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(2, "usage:", "          ", options15, "\n", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultOptPrefix = "";
        helpFormatter0.defaultWidth = '#';
        int int9 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultWidth = (short) 1;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix("usage: ");
        int int11 = helpFormatter0.findWrapPos("hi!", (int) (byte) -1, (int) (byte) 100);
        helpFormatter0.setOptPrefix("usage:");
        helpFormatter0.defaultWidth = 87;
        helpFormatter0.setDescPadding((int) (byte) 10);
        java.lang.String str18 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        java.util.Comparator comparator10 = helpFormatter0.optionComparator;
        helpFormatter0.defaultOptPrefix = "                                                                                                 ";
        helpFormatter0.defaultLeftPad = (byte) 100;
        int int18 = helpFormatter0.findWrapPos("", (int) (short) 0, (int) (short) 100);
        java.io.PrintWriter printWriter19 = null;
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter19, (int) (short) 100, "\n", options22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str9 = helpFormatter0.rtrim("hi!");
        int int10 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = (short) 100;
        helpFormatter0.setArgName("--");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setLongOptPrefix("hi!");
        java.util.Comparator comparator9 = helpFormatter0.optionComparator;
        helpFormatter0.defaultArgName = "usage:";
        java.lang.String str12 = helpFormatter0.defaultArgName;
        int int13 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage:" + "'", str12, "usage:");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setDescPadding((-1));
        helpFormatter0.defaultLongOptPrefix = " ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultDescPad;
        int int8 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLeftPad = (-1);
        int int11 = helpFormatter0.defaultLeftPad;
        int int12 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str7 = helpFormatter0.getNewLine();
        helpFormatter0.setOptPrefix("--");
        helpFormatter0.setDescPadding((int) (byte) 0);
        java.lang.String str12 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultDescPad = 1;
        helpFormatter0.setArgName("--");
        helpFormatter0.setSyntaxPrefix("                                                                                                 ");
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer23 = helpFormatter0.renderWrappedText(stringBuffer19, 45, (int) (short) 1, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuffer.append(String)\" because \"sb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str12 = helpFormatter10.rtrim("arg");
        java.lang.String str13 = helpFormatter10.defaultSyntaxPrefix;
        java.util.Comparator comparator14 = helpFormatter10.optionComparator;
        helpFormatter0.setOptionComparator(comparator14);
        helpFormatter0.defaultSyntaxPrefix = "          ";
        helpFormatter0.setWidth(100);
        java.lang.String str20 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "arg" + "'", str20, "arg");
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        int int9 = helpFormatter0.findWrapPos("-", (int) (short) 100, 74);
        helpFormatter0.setNewLine("usage: ");
        int int15 = helpFormatter0.findWrapPos("                                                    ", 45, (int) (short) 10);
        java.lang.String str16 = helpFormatter0.defaultArgName;
        java.lang.String str17 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "--" + "'", str17, "--");
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.util.Comparator comparator5 = null;
        helpFormatter0.setOptionComparator(comparator5);
        java.lang.String str7 = helpFormatter0.defaultArgName;
        java.lang.String str9 = helpFormatter0.createPadding((int) ' ');
        helpFormatter0.defaultDescPad = 73;
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderWrappedText(stringBuffer12, (int) (byte) -1, (int) (short) 0, "  ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                " + "'", str9, "                                ");
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        helpFormatter0.setOptPrefix("                                ");
        helpFormatter0.defaultDescPad = 35;
        int int10 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultOptPrefix = "arg";
        helpFormatter0.defaultOptPrefix = "arg";
        int int9 = helpFormatter0.defaultWidth;
        java.util.Comparator comparator10 = helpFormatter0.getOptionComparator();
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderWrappedText(stringBuffer12, 67, (int) (byte) 100, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuffer.append(String)\" because \"sb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        java.util.Comparator comparator10 = helpFormatter0.optionComparator;
        java.lang.String str11 = helpFormatter0.defaultArgName;
        int int15 = helpFormatter0.findWrapPos(" ", 3, 3);
        helpFormatter0.setWidth(72);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        java.util.Comparator comparator7 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultSyntaxPrefix = "\n";
        int int10 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter11, 76, (-1), "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertNotNull(comparator7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.defaultArgName = "                                   ";
        int int9 = helpFormatter0.defaultDescPad;
        int int10 = helpFormatter0.defaultWidth;
        helpFormatter0.setDescPadding(52);
        java.lang.String str13 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setWidth(0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str9 = helpFormatter0.rtrim("hi!");
        int int10 = helpFormatter0.defaultLeftPad;
        java.util.Comparator comparator11 = helpFormatter0.optionComparator;
        java.util.Comparator comparator12 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultWidth = (short) 100;
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = helpFormatter0.renderWrappedText(stringBuffer15, 12, (int) (short) 0, "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuffer.append(String)\" because \"sb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertNotNull(comparator12);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        int int6 = helpFormatter0.findWrapPos("--", (int) '#', (int) (short) 100);
        helpFormatter0.setArgName("arg");
        helpFormatter0.defaultOptPrefix = "";
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str13 = helpFormatter11.rtrim("arg");
        java.lang.String str14 = helpFormatter11.getNewLine();
        java.lang.String str15 = helpFormatter11.getOptPrefix();
        helpFormatter11.setNewLine("usage: ");
        helpFormatter11.setWidth(3);
        java.lang.String str20 = helpFormatter11.defaultArgName;
        int int21 = helpFormatter11.defaultWidth;
        helpFormatter11.setLongOptPrefix("usage: ");
        org.apache.commons.cli.HelpFormatter helpFormatter24 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str26 = helpFormatter24.rtrim("arg");
        helpFormatter24.defaultWidth = (short) -1;
        java.lang.String str29 = helpFormatter24.defaultArgName;
        helpFormatter24.setSyntaxPrefix("arg");
        helpFormatter24.setSyntaxPrefix("--");
        java.util.Comparator comparator34 = helpFormatter24.optionComparator;
        helpFormatter11.optionComparator = comparator34;
        helpFormatter0.setOptionComparator(comparator34);
        java.lang.String str37 = helpFormatter0.defaultLongOptPrefix;
        int int38 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding(10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "arg" + "'", str20, "arg");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "arg" + "'", str26, "arg");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "arg" + "'", str29, "arg");
        org.junit.Assert.assertNotNull(comparator34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "--" + "'", str37, "--");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setDescPadding(0);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str15 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "hi!";
        int int21 = helpFormatter0.findWrapPos("arg", (int) (short) -1, 67);
        org.apache.commons.cli.Options options24 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", "-", options24, "   ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setDescPadding(0);
        int int8 = helpFormatter0.getLeftPadding();
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultWidth = 0;
        int int12 = helpFormatter0.getLeftPadding();
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(0, "           ", " ", options16, "                                                                        ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:         ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultWidth = 10;
        java.util.Comparator comparator13 = helpFormatter0.getOptionComparator();
        java.lang.String str14 = helpFormatter0.defaultLongOptPrefix;
        java.util.Comparator comparator15 = helpFormatter0.optionComparator;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertNotNull(comparator15);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        helpFormatter0.defaultWidth = (byte) 0;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.defaultArgName;
        int int10 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultArgName = "                                                                                                    ";
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        java.lang.String str8 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultWidth = 67;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                    " + "'", str8, "                                                                                                    ");
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultWidth = 10;
        int int13 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultOptPrefix = "                                                    ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultDescPad;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        int int12 = helpFormatter0.defaultLeftPad;
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        java.lang.String str14 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        helpFormatter0.setDescPadding(100);
        int int10 = helpFormatter0.findWrapPos("                                                                                                    ", (int) (byte) 0, 3);
        helpFormatter0.setNewLine("");
        int int13 = helpFormatter0.getLeftPadding();
        java.util.Comparator comparator14 = helpFormatter0.optionComparator;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(comparator14);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.defaultWidth = 3;
        helpFormatter0.defaultOptPrefix = "";
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str14 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "";
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("            ", options13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter3 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str5 = helpFormatter3.rtrim("arg");
        java.lang.String str6 = helpFormatter3.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter3.defaultOptPrefix;
        java.util.Comparator comparator8 = helpFormatter3.getOptionComparator();
        helpFormatter0.optionComparator = comparator8;
        int int13 = helpFormatter0.findWrapPos("usage: ", 3, (int) (short) 10);
        java.lang.String str14 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultDescPad = (short) 100;
        java.util.Comparator comparator11 = helpFormatter0.optionComparator;
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setLeftPadding((int) (short) 100);
        java.lang.String str16 = helpFormatter0.rtrim("-");
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        java.lang.String str19 = helpFormatter0.getNewLine();
        java.io.PrintWriter printWriter20 = null;
        org.apache.commons.cli.Options options24 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter20, 52, "usage:", " ", options24, (int) (byte) 10, (int) (short) 0, "                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:                                                                                                     usage:");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n" + "'", str19, "\n");
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = (byte) 100;
        java.lang.String str8 = helpFormatter0.getArgName();
        helpFormatter0.setNewLine("-");
        int int14 = helpFormatter0.findWrapPos("", (-1), (int) ' ');
        java.lang.String str15 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultLeftPad = (short) 1;
        helpFormatter0.defaultArgName = "           ";
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("            ", options21, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter3 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str5 = helpFormatter3.rtrim("arg");
        java.lang.String str6 = helpFormatter3.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter3.defaultOptPrefix;
        java.util.Comparator comparator8 = helpFormatter3.getOptionComparator();
        helpFormatter0.optionComparator = comparator8;
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str12 = helpFormatter10.rtrim("arg");
        java.lang.String str13 = helpFormatter10.defaultSyntaxPrefix;
        java.util.Comparator comparator14 = helpFormatter10.optionComparator;
        helpFormatter0.setOptionComparator(comparator14);
        helpFormatter0.defaultOptPrefix = "arg";
        helpFormatter0.setWidth((int) (byte) 10);
        helpFormatter0.defaultNewLine = "usage: ";
        int int22 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.HelpFormatter helpFormatter23 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str25 = helpFormatter23.rtrim("arg");
        java.lang.String str26 = helpFormatter23.getNewLine();
        java.lang.String str27 = helpFormatter23.getOptPrefix();
        helpFormatter23.defaultOptPrefix = "arg";
        helpFormatter23.defaultOptPrefix = "arg";
        int int32 = helpFormatter23.defaultWidth;
        java.util.Comparator comparator33 = helpFormatter23.getOptionComparator();
        helpFormatter23.defaultLongOptPrefix = "";
        java.util.Comparator comparator36 = helpFormatter23.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator36);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "arg" + "'", str25, "arg");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\n" + "'", str26, "\n");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-" + "'", str27, "-");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 74 + "'", int32 == 74);
        org.junit.Assert.assertNotNull(comparator33);
        org.junit.Assert.assertNotNull(comparator36);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth(74);
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str10 = helpFormatter8.rtrim("arg");
        java.lang.String str11 = helpFormatter8.defaultSyntaxPrefix;
        java.lang.String str12 = helpFormatter8.defaultOptPrefix;
        java.util.Comparator comparator13 = helpFormatter8.getOptionComparator();
        helpFormatter0.optionComparator = comparator13;
        int int15 = helpFormatter0.defaultDescPad;
        java.lang.String str16 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.setOptPrefix("                                   ");
        java.lang.String str22 = helpFormatter0.rtrim("  ");
        java.util.Comparator comparator23 = helpFormatter0.getOptionComparator();
        org.apache.commons.cli.HelpFormatter helpFormatter24 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str26 = helpFormatter24.rtrim("arg");
        helpFormatter24.defaultOptPrefix = "--";
        helpFormatter24.setOptPrefix("-");
        helpFormatter24.setDescPadding(1);
        helpFormatter24.setDescPadding(0);
        java.lang.String str35 = helpFormatter24.defaultNewLine;
        java.lang.String str36 = helpFormatter24.getArgName();
        helpFormatter24.defaultNewLine = "-";
        helpFormatter24.setLongOptPrefix("");
        helpFormatter24.setLeftPadding((int) 'a');
        helpFormatter24.setLeftPadding((-1));
        int int45 = helpFormatter24.getDescPadding();
        helpFormatter24.setWidth((int) (short) 0);
        helpFormatter24.defaultSyntaxPrefix = "usage:";
        java.util.Comparator comparator50 = helpFormatter24.optionComparator;
        helpFormatter0.setOptionComparator(comparator50);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(comparator23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "arg" + "'", str26, "arg");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\n" + "'", str35, "\n");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "arg" + "'", str36, "arg");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(comparator50);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.setArgName("          ");
        helpFormatter0.defaultLeftPad = (byte) 1;
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.setWidth(3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultDescPad;
        int int8 = helpFormatter0.getDescPadding();
        helpFormatter0.setLongOptPrefix("usage: ");
        int int11 = helpFormatter0.defaultWidth;
        java.util.Comparator comparator12 = helpFormatter0.optionComparator;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
        org.junit.Assert.assertNotNull(comparator12);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.setOptPrefix("--");
        java.lang.String str7 = helpFormatter0.defaultArgName;
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter9, (int) 'a', options11, 73, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        helpFormatter0.setDescPadding(100);
        java.lang.String str7 = helpFormatter0.getNewLine();
        helpFormatter0.setArgName("                                                                                                 ");
        helpFormatter0.setOptPrefix("\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter3 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str5 = helpFormatter3.rtrim("arg");
        java.lang.String str6 = helpFormatter3.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter3.defaultOptPrefix;
        java.util.Comparator comparator8 = helpFormatter3.getOptionComparator();
        helpFormatter0.optionComparator = comparator8;
        int int13 = helpFormatter0.findWrapPos("\n", (int) '#', 1);
        java.lang.String str15 = helpFormatter0.createPadding((int) (byte) 10);
        int int16 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("         ", "\n", options19, "usage: ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "          " + "'", str15, "          ");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        int int9 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLeftPadding((int) (byte) -1);
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        int int16 = helpFormatter0.findWrapPos("                                                                   ", (int) (short) 100, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultOptPrefix = "arg";
        helpFormatter0.defaultOptPrefix = "arg";
        int int9 = helpFormatter0.defaultWidth;
        java.util.Comparator comparator10 = helpFormatter0.getOptionComparator();
        helpFormatter0.setArgName("");
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter13, 11, options15, 72, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertNotNull(comparator10);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        int int9 = helpFormatter0.findWrapPos(" ", (int) (short) 1, 10);
        helpFormatter0.setOptPrefix("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding((int) ' ');
        java.util.Comparator comparator12 = helpFormatter0.getOptionComparator();
        java.lang.String str13 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str14 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter15 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter15, 3, "                                                                                                 ", options18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.Class<?> wildcardClass8 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "\n";
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 35;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.defaultLongOptPrefix;
        int int12 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.lang.String str5 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str9 = helpFormatter0.rtrim("   ");
        helpFormatter0.defaultArgName = "hi!";
        int int12 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter13, 73, options15, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.getNewLine();
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter12, 73, "                                ", "usage:", options16, 0, (int) (byte) -1, " ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultDescPad;
        int int8 = helpFormatter0.getDescPadding();
        helpFormatter0.setLongOptPrefix("usage: ");
        helpFormatter0.defaultOptPrefix = " ";
        helpFormatter0.setWidth(3);
        int int15 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultDescPad = 45;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        int int3 = helpFormatter0.getLeftPadding();
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "                                   ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultDescPad = (short) 100;
        java.util.Comparator comparator11 = helpFormatter0.optionComparator;
        java.lang.String str13 = helpFormatter0.createPadding((int) (byte) 1);
        java.lang.String str15 = helpFormatter0.createPadding(73);
        java.lang.String str16 = helpFormatter0.getNewLine();
        java.lang.String str17 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str18 = helpFormatter0.getArgName();
        int int19 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " " + "'", str13, " ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                                                         " + "'", str15, "                                                                         ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "--" + "'", str17, "--");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        int int9 = helpFormatter0.getWidth();
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str12 = helpFormatter10.rtrim("arg");
        helpFormatter10.defaultOptPrefix = "--";
        helpFormatter10.setOptPrefix("-");
        helpFormatter10.setDescPadding(1);
        java.util.Comparator comparator19 = helpFormatter10.getOptionComparator();
        helpFormatter0.optionComparator = comparator19;
        helpFormatter0.setWidth((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertNotNull(comparator19);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter3 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str5 = helpFormatter3.rtrim("arg");
        java.lang.String str6 = helpFormatter3.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter3.defaultOptPrefix;
        java.util.Comparator comparator8 = helpFormatter3.getOptionComparator();
        helpFormatter0.optionComparator = comparator8;
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str12 = helpFormatter10.rtrim("arg");
        java.lang.String str13 = helpFormatter10.defaultSyntaxPrefix;
        java.util.Comparator comparator14 = helpFormatter10.optionComparator;
        helpFormatter0.setOptionComparator(comparator14);
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str18 = helpFormatter0.defaultNewLine;
        helpFormatter0.setNewLine("--");
        org.apache.commons.cli.HelpFormatter helpFormatter21 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter21.defaultOptPrefix = "hi!";
        int int27 = helpFormatter21.findWrapPos("--", (int) '#', (int) (short) 100);
        helpFormatter21.defaultLeftPad = 0;
        java.util.Comparator comparator30 = helpFormatter21.getOptionComparator();
        helpFormatter0.optionComparator = comparator30;
        java.lang.String str32 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(comparator30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "arg" + "'", str32, "arg");
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        helpFormatter0.defaultWidth = (byte) 0;
        helpFormatter0.defaultDescPad = (short) 0;
        helpFormatter0.setSyntaxPrefix("          ");
        helpFormatter0.defaultDescPad = (byte) -1;
        helpFormatter0.defaultOptPrefix = "          ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.rtrim("--");
        int int8 = helpFormatter0.getWidth();
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str11 = helpFormatter0.createPadding(67);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                   " + "'", str11, "                                                                   ");
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        int int8 = helpFormatter0.defaultLeftPad;
        java.lang.String str10 = helpFormatter0.rtrim("--");
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        java.lang.String str12 = helpFormatter0.getNewLine();
        int int13 = helpFormatter0.getLeftPadding();
        java.lang.String str14 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultOptPrefix = "arg";
        helpFormatter0.setDescPadding((int) (short) 100);
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        java.lang.String str10 = helpFormatter0.getNewLine();
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        int int7 = helpFormatter0.findWrapPos("arg", 0, (int) ' ');
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str10 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str11 = helpFormatter9.rtrim("arg");
        java.lang.String str12 = helpFormatter9.defaultSyntaxPrefix;
        java.util.Comparator comparator13 = helpFormatter9.optionComparator;
        helpFormatter9.setDescPadding(100);
        int int19 = helpFormatter9.findWrapPos("                                                                                                    ", (int) (byte) 0, 3);
        java.util.Comparator comparator20 = helpFormatter9.getOptionComparator();
        helpFormatter0.optionComparator = comparator20;
        helpFormatter0.defaultNewLine = "";
        org.apache.commons.cli.Options options26 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                   ", "arg", options26, "           ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(comparator20);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultArgName;
        int int10 = helpFormatter0.findWrapPos("                                ", (int) ' ', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setLeftPadding((int) (byte) -1);
        helpFormatter0.defaultNewLine = "          ";
        helpFormatter0.defaultNewLine = "                                ";
        helpFormatter0.setArgName("-");
        java.io.PrintWriter printWriter18 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter18, 76, "                                                                                                    ", options21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.setArgName("          ");
        java.lang.Class<?> wildcardClass9 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        int int5 = helpFormatter0.getLeftPadding();
        java.lang.String str6 = helpFormatter0.getArgName();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding((int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        helpFormatter0.defaultWidth = (byte) 0;
        helpFormatter0.defaultDescPad = (short) 0;
        int int13 = helpFormatter0.findWrapPos("\n", (int) (short) 0, (int) (short) 100);
        org.apache.commons.cli.HelpFormatter helpFormatter14 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str16 = helpFormatter14.rtrim("arg");
        helpFormatter14.defaultWidth = (short) -1;
        java.lang.String str19 = helpFormatter14.defaultArgName;
        java.lang.String str20 = helpFormatter14.defaultArgName;
        java.util.Comparator comparator21 = helpFormatter14.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator21);
        java.lang.String str23 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "usage:";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "arg" + "'", str20, "arg");
        org.junit.Assert.assertNotNull(comparator21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "--" + "'", str23, "--");
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setNewLine("\n");
        java.lang.String str11 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setLeftPadding((int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultDescPad = (short) 100;
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str13 = helpFormatter11.rtrim("arg");
        java.lang.String str14 = helpFormatter11.defaultSyntaxPrefix;
        java.util.Comparator comparator15 = helpFormatter11.optionComparator;
        helpFormatter0.setOptionComparator(comparator15);
        helpFormatter0.setLongOptPrefix("arg");
        int int19 = helpFormatter0.getLeftPadding();
        java.io.PrintWriter printWriter20 = null;
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter20, (-1), "hi!", options23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.util.Comparator comparator9 = null;
        helpFormatter0.optionComparator = comparator9;
        int int14 = helpFormatter0.findWrapPos("hi!", (int) 'a', (int) (byte) -1);
        int int15 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultOptPrefix = "usage: ";
        int int18 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultSyntaxPrefix = "arg";
        int int21 = helpFormatter0.getDescPadding();
        int int25 = helpFormatter0.findWrapPos("   ", (int) (byte) 100, (int) 'a');
        org.apache.commons.cli.Options options28 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", "   ", options28, "                                                                                                    ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultLeftPad = (short) 100;
        java.util.Comparator comparator13 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultLongOptPrefix = " ";
        int int19 = helpFormatter0.findWrapPos("                                                                                                    ", 73, 0);
        java.lang.String str20 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 73 + "'", int19 == 73);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "arg" + "'", str20, "arg");
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str9 = helpFormatter0.rtrim("hi!");
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        helpFormatter0.setArgName("usage: ");
        helpFormatter0.defaultOptPrefix = "                                                                                                 ";
        java.util.Comparator comparator15 = null;
        helpFormatter0.setOptionComparator(comparator15);
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", options18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter3 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str5 = helpFormatter3.rtrim("arg");
        java.lang.String str6 = helpFormatter3.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter3.defaultOptPrefix;
        java.util.Comparator comparator8 = helpFormatter3.getOptionComparator();
        helpFormatter0.optionComparator = comparator8;
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str12 = helpFormatter10.rtrim("arg");
        java.lang.String str13 = helpFormatter10.defaultSyntaxPrefix;
        java.util.Comparator comparator14 = helpFormatter10.optionComparator;
        helpFormatter0.setOptionComparator(comparator14);
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str18 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.defaultSyntaxPrefix = "   ";
        helpFormatter0.setDescPadding(100);
        org.apache.commons.cli.HelpFormatter helpFormatter25 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str27 = helpFormatter25.rtrim("arg");
        java.lang.String str28 = helpFormatter25.getNewLine();
        helpFormatter25.defaultArgName = "usage: ";
        helpFormatter25.defaultDescPad = (byte) 100;
        java.lang.String str33 = helpFormatter25.getOptPrefix();
        java.lang.String str35 = helpFormatter25.createPadding((int) (short) 100);
        org.apache.commons.cli.HelpFormatter helpFormatter36 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str38 = helpFormatter36.rtrim("arg");
        helpFormatter36.setSyntaxPrefix("-");
        java.util.Comparator comparator41 = null;
        helpFormatter36.setOptionComparator(comparator41);
        helpFormatter36.setLeftPadding((int) (short) -1);
        java.lang.String str45 = helpFormatter36.getArgName();
        java.util.Comparator comparator46 = helpFormatter36.optionComparator;
        helpFormatter25.setOptionComparator(comparator46);
        helpFormatter0.setOptionComparator(comparator46);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "arg" + "'", str27, "arg");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\n" + "'", str28, "\n");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-" + "'", str33, "-");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "                                                                                                    " + "'", str35, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "arg" + "'", str38, "arg");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "arg" + "'", str45, "arg");
        org.junit.Assert.assertNotNull(comparator46);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        java.util.Comparator comparator10 = helpFormatter0.optionComparator;
        helpFormatter0.defaultOptPrefix = "                                                                                                 ";
        java.lang.String str13 = helpFormatter0.getArgName();
        java.lang.String str14 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str15 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                                                                                 " + "'", str15, "                                                                                                 ");
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setDescPadding(0);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.setLeftPadding((int) (byte) 0);
        java.lang.String str17 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setDescPadding(0);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "-";
        java.lang.String str16 = helpFormatter0.rtrim("--");
        java.lang.String str17 = helpFormatter0.defaultNewLine;
        java.lang.String str18 = helpFormatter0.defaultNewLine;
        java.lang.String str19 = helpFormatter0.getOptPrefix();
        int int23 = helpFormatter0.findWrapPos("                                                                                                    ", (int) 'a', 100);
        java.lang.String str24 = helpFormatter0.getSyntaxPrefix();
        int int25 = helpFormatter0.defaultLeftPad;
        java.lang.Class<?> wildcardClass26 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-" + "'", str19, "-");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "usage: " + "'", str24, "usage: ");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth(74);
        helpFormatter0.setArgName("-");
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        int int10 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str13 = helpFormatter11.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter14 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str16 = helpFormatter14.rtrim("arg");
        java.lang.String str17 = helpFormatter14.defaultSyntaxPrefix;
        java.lang.String str18 = helpFormatter14.defaultOptPrefix;
        java.util.Comparator comparator19 = helpFormatter14.getOptionComparator();
        helpFormatter11.optionComparator = comparator19;
        org.apache.commons.cli.HelpFormatter helpFormatter21 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str23 = helpFormatter21.rtrim("arg");
        java.lang.String str24 = helpFormatter21.defaultSyntaxPrefix;
        java.util.Comparator comparator25 = helpFormatter21.optionComparator;
        helpFormatter11.setOptionComparator(comparator25);
        helpFormatter11.setDescPadding((int) (byte) 1);
        org.apache.commons.cli.HelpFormatter helpFormatter29 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str31 = helpFormatter29.rtrim("arg");
        helpFormatter29.defaultOptPrefix = "--";
        helpFormatter29.setOptPrefix("-");
        helpFormatter29.setDescPadding(1);
        helpFormatter29.defaultDescPad = (short) 100;
        org.apache.commons.cli.HelpFormatter helpFormatter40 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str42 = helpFormatter40.rtrim("arg");
        java.lang.String str43 = helpFormatter40.defaultSyntaxPrefix;
        java.util.Comparator comparator44 = helpFormatter40.optionComparator;
        helpFormatter29.setOptionComparator(comparator44);
        helpFormatter11.optionComparator = comparator44;
        helpFormatter0.optionComparator = comparator44;
        java.lang.String str48 = helpFormatter0.getNewLine();
        helpFormatter0.defaultSyntaxPrefix = "   ";
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultArgName = "            ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage: " + "'", str17, "usage: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "arg" + "'", str23, "arg");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "usage: " + "'", str24, "usage: ");
        org.junit.Assert.assertNotNull(comparator25);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "arg" + "'", str31, "arg");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "arg" + "'", str42, "arg");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "usage: " + "'", str43, "usage: ");
        org.junit.Assert.assertNotNull(comparator44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\n" + "'", str48, "\n");
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        java.io.PrintWriter printWriter7 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter7, (int) (short) 1, "                                                    ", "usage:", options11, (int) (byte) 0, 73, "                                                                                                    ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultArgName = "                                                                                                    ";
        helpFormatter0.setArgName("");
        helpFormatter0.setWidth((int) (byte) 1);
        helpFormatter0.setDescPadding((int) '4');
        helpFormatter0.defaultSyntaxPrefix = "                                                                        ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        int int9 = helpFormatter0.findWrapPos("-", (int) (short) 100, 74);
        helpFormatter0.setNewLine("usage: ");
        int int15 = helpFormatter0.findWrapPos("                                                    ", 45, (int) (short) 10);
        java.lang.String str16 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultNewLine = " ";
        org.apache.commons.cli.HelpFormatter helpFormatter19 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str21 = helpFormatter19.rtrim("arg");
        helpFormatter19.defaultOptPrefix = "--";
        helpFormatter19.setOptPrefix("-");
        helpFormatter19.setSyntaxPrefix("hi!");
        int int28 = helpFormatter19.defaultDescPad;
        java.util.Comparator comparator29 = helpFormatter19.optionComparator;
        helpFormatter0.optionComparator = comparator29;
        helpFormatter0.setArgName("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(comparator29);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.defaultArgName;
        int int10 = helpFormatter0.getWidth();
        java.lang.Class<?> wildcardClass11 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        int int11 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLeftPad = (short) -1;
        java.lang.String str15 = helpFormatter0.rtrim("");
        java.lang.String str17 = helpFormatter0.rtrim("                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        helpFormatter0.setDescPadding(100);
        int int10 = helpFormatter0.findWrapPos("                                                                                                    ", (int) (byte) 0, 3);
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultArgName = "                                                                          ";
        helpFormatter0.setOptPrefix("                                                    ");
        int int16 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultWidth;
        int int8 = helpFormatter0.getLeftPadding();
        int int12 = helpFormatter0.findWrapPos("          ", (int) ' ', 10);
        java.lang.String str13 = helpFormatter0.getLongOptPrefix();
        java.lang.String str14 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                                    ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setDescPadding(0);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "-";
        java.lang.String str16 = helpFormatter0.rtrim("--");
        helpFormatter0.defaultArgName = "                                                    ";
        java.lang.String str19 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setWidth(74);
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str10 = helpFormatter8.rtrim("arg");
        helpFormatter8.defaultWidth = (short) -1;
        java.lang.String str13 = helpFormatter8.defaultArgName;
        java.lang.String str15 = helpFormatter8.rtrim("--");
        java.lang.String str16 = helpFormatter8.getSyntaxPrefix();
        helpFormatter8.defaultDescPad = (short) 10;
        helpFormatter8.setLongOptPrefix("                                   ");
        int int21 = helpFormatter8.getLeftPadding();
        helpFormatter8.defaultArgName = "                                                                                                 ";
        int int24 = helpFormatter8.defaultWidth;
        org.apache.commons.cli.HelpFormatter helpFormatter25 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str27 = helpFormatter25.rtrim("arg");
        helpFormatter25.defaultWidth = (short) -1;
        int int30 = helpFormatter25.defaultWidth;
        java.lang.String str31 = helpFormatter25.defaultOptPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter32 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str34 = helpFormatter32.rtrim("arg");
        helpFormatter32.defaultOptPrefix = "--";
        helpFormatter32.setOptPrefix("-");
        helpFormatter32.setDescPadding(1);
        java.lang.String str41 = helpFormatter32.defaultLongOptPrefix;
        int int42 = helpFormatter32.getLeftPadding();
        java.lang.String str44 = helpFormatter32.createPadding((int) '4');
        int int45 = helpFormatter32.defaultLeftPad;
        java.util.Comparator comparator46 = helpFormatter32.getOptionComparator();
        helpFormatter25.setOptionComparator(comparator46);
        helpFormatter8.setOptionComparator(comparator46);
        helpFormatter0.optionComparator = comparator46;
        helpFormatter0.defaultLongOptPrefix = "";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "arg" + "'", str27, "arg");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-" + "'", str31, "-");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "arg" + "'", str34, "arg");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "--" + "'", str41, "--");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "                                                    " + "'", str44, "                                                    ");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(comparator46);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.defaultDescPad = (byte) -1;
        helpFormatter0.setNewLine("                                                                                                    ");
        helpFormatter0.setSyntaxPrefix("             ");
        int int18 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.setSyntaxPrefix("                                   ");
        int int10 = helpFormatter0.getDescPadding();
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        int int12 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLongOptPrefix = "";
        java.lang.String str15 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultNewLine = "           ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "\n";
        helpFormatter0.setNewLine("                                                                         ");
        java.lang.String str10 = helpFormatter0.createPadding(11);
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter11, 35, "hi!", options14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "           " + "'", str10, "           ");
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.defaultArgName;
        int int10 = helpFormatter0.getWidth();
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str14 = helpFormatter12.rtrim("arg");
        java.lang.String str15 = helpFormatter12.getNewLine();
        java.lang.String str16 = helpFormatter12.getOptPrefix();
        helpFormatter12.setNewLine("usage: ");
        helpFormatter12.setWidth(3);
        java.lang.String str21 = helpFormatter12.defaultArgName;
        int int22 = helpFormatter12.defaultWidth;
        helpFormatter12.setLongOptPrefix("usage: ");
        org.apache.commons.cli.HelpFormatter helpFormatter25 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str27 = helpFormatter25.rtrim("arg");
        helpFormatter25.defaultWidth = (short) -1;
        java.lang.String str30 = helpFormatter25.defaultArgName;
        helpFormatter25.setSyntaxPrefix("arg");
        helpFormatter25.setSyntaxPrefix("--");
        java.util.Comparator comparator35 = helpFormatter25.optionComparator;
        helpFormatter12.optionComparator = comparator35;
        helpFormatter0.setOptionComparator(comparator35);
        int int38 = helpFormatter0.defaultWidth;
        java.util.Comparator comparator39 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "arg" + "'", str27, "arg");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "arg" + "'", str30, "arg");
        org.junit.Assert.assertNotNull(comparator35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertNotNull(comparator39);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.defaultWidth = 3;
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        int int11 = helpFormatter0.getDescPadding();
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str13 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        int int12 = helpFormatter0.findWrapPos("                                                                         ", (int) '#', 0);
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        java.lang.String str15 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("");
        int int3 = helpFormatter0.getLeftPadding();
        int int4 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                 ";
        helpFormatter0.defaultNewLine = " ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        int int8 = helpFormatter0.findWrapPos("usage: ", 0, (int) '4');
        helpFormatter0.setSyntaxPrefix("");
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter11, (int) '4', "usage: ", options14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setWidth(45);
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        int int10 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultNewLine = "                                                                         ";
        java.lang.String str14 = helpFormatter0.rtrim("arg");
        java.lang.String str15 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                                                         " + "'", str15, "                                                                         ");
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultDescPad = (short) 100;
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str13 = helpFormatter11.rtrim("arg");
        java.lang.String str14 = helpFormatter11.defaultSyntaxPrefix;
        java.util.Comparator comparator15 = helpFormatter11.optionComparator;
        helpFormatter0.setOptionComparator(comparator15);
        int int17 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setDescPadding((int) (byte) 100);
        helpFormatter0.setArgName("usage:");
        helpFormatter0.defaultLeftPad = 100;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.defaultArgName;
        int int10 = helpFormatter0.getWidth();
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str14 = helpFormatter12.rtrim("arg");
        java.lang.String str15 = helpFormatter12.getNewLine();
        java.lang.String str16 = helpFormatter12.getOptPrefix();
        helpFormatter12.setNewLine("usage: ");
        helpFormatter12.setWidth(3);
        java.lang.String str21 = helpFormatter12.defaultArgName;
        int int22 = helpFormatter12.defaultWidth;
        helpFormatter12.setLongOptPrefix("usage: ");
        org.apache.commons.cli.HelpFormatter helpFormatter25 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str27 = helpFormatter25.rtrim("arg");
        helpFormatter25.defaultWidth = (short) -1;
        java.lang.String str30 = helpFormatter25.defaultArgName;
        helpFormatter25.setSyntaxPrefix("arg");
        helpFormatter25.setSyntaxPrefix("--");
        java.util.Comparator comparator35 = helpFormatter25.optionComparator;
        helpFormatter12.optionComparator = comparator35;
        helpFormatter0.setOptionComparator(comparator35);
        java.lang.String str38 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setSyntaxPrefix("                                                                                       ");
        java.lang.String str41 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultLongOptPrefix = "usage:";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "arg" + "'", str27, "arg");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "arg" + "'", str30, "arg");
        org.junit.Assert.assertNotNull(comparator35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "usage: " + "'", str38, "usage: ");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "usage: " + "'", str41, "usage: ");
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str7 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLongOptPrefix = "";
        helpFormatter0.setWidth((int) ' ');
        helpFormatter0.setArgName("usage:");
        java.util.Comparator comparator14 = helpFormatter0.getOptionComparator();
        java.lang.String str15 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setLongOptPrefix("hi!");
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        helpFormatter0.setSyntaxPrefix("\n");
        helpFormatter0.defaultArgName = "hi!";
        java.lang.String str15 = helpFormatter0.rtrim("                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str10 = helpFormatter8.rtrim("arg");
        helpFormatter8.defaultOptPrefix = "--";
        helpFormatter8.setOptPrefix("-");
        helpFormatter8.setDescPadding(1);
        helpFormatter8.defaultDescPad = (short) 100;
        org.apache.commons.cli.HelpFormatter helpFormatter19 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str21 = helpFormatter19.rtrim("arg");
        java.lang.String str22 = helpFormatter19.defaultSyntaxPrefix;
        java.util.Comparator comparator23 = helpFormatter19.optionComparator;
        helpFormatter8.setOptionComparator(comparator23);
        helpFormatter0.optionComparator = comparator23;
        helpFormatter0.setArgName("   ");
        helpFormatter0.setOptPrefix("          ");
        java.util.Comparator comparator30 = helpFormatter0.optionComparator;
        java.lang.String str31 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "usage: " + "'", str22, "usage: ");
        org.junit.Assert.assertNotNull(comparator23);
        org.junit.Assert.assertNotNull(comparator30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\n" + "'", str31, "\n");
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        int int8 = helpFormatter0.defaultDescPad;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setNewLine("   ");
        int int16 = helpFormatter0.findWrapPos("usage: ", 87, 1);
        helpFormatter0.defaultWidth = ' ';
        helpFormatter0.defaultLongOptPrefix = "";
        java.lang.String str21 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultDescPad = (short) 0;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        int int10 = helpFormatter0.getDescPadding();
        helpFormatter0.setDescPadding((int) '4');
        java.lang.String str13 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 0, "usage:", "          ", options14, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 7 out of bounds for length 7");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setLongOptPrefix("hi!");
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        helpFormatter0.setSyntaxPrefix("\n");
        helpFormatter0.setLongOptPrefix("");
        helpFormatter0.defaultSyntaxPrefix = "--";
        java.util.Comparator comparator16 = helpFormatter0.optionComparator;
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.defaultNewLine = "usage: ";
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                   ", "                                                                   ", options23, "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:    ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertNotNull(comparator16);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        helpFormatter0.defaultWidth = (byte) 0;
        helpFormatter0.defaultDescPad = (short) 0;
        helpFormatter0.setSyntaxPrefix("          ");
        helpFormatter0.defaultDescPad = (byte) -1;
        java.lang.String str14 = helpFormatter0.defaultLongOptPrefix;
        java.lang.Class<?> wildcardClass15 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultWidth;
        int int8 = helpFormatter0.getLeftPadding();
        int int12 = helpFormatter0.findWrapPos("          ", (int) ' ', 10);
        java.lang.String str13 = helpFormatter0.getLongOptPrefix();
        java.lang.String str15 = helpFormatter0.rtrim("                                                                                                 ");
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                    ", options17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultDescPad = (short) 100;
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str13 = helpFormatter11.rtrim("arg");
        java.lang.String str14 = helpFormatter11.defaultSyntaxPrefix;
        java.util.Comparator comparator15 = helpFormatter11.optionComparator;
        helpFormatter0.setOptionComparator(comparator15);
        java.lang.String str17 = helpFormatter0.getOptPrefix();
        int int18 = helpFormatter0.defaultWidth;
        java.lang.String str19 = helpFormatter0.defaultOptPrefix;
        java.lang.StringBuffer stringBuffer20 = null;
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer25 = helpFormatter0.renderOptions(stringBuffer20, 35, options22, 9, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 74 + "'", int18 == 74);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-" + "'", str19, "-");
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str11 = helpFormatter9.rtrim("arg");
        java.lang.String str12 = helpFormatter9.defaultSyntaxPrefix;
        java.lang.String str13 = helpFormatter9.defaultOptPrefix;
        java.util.Comparator comparator14 = helpFormatter9.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator14);
        java.lang.String str16 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix(" ");
        int int19 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int10 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter11, (int) (short) 10, "                                                                                                 ", options14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.getWidth();
        java.lang.String str9 = helpFormatter0.rtrim("arg");
        helpFormatter0.setArgName("\n");
        int int12 = helpFormatter0.defaultDescPad;
        int int13 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setDescPadding(0);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "hi!";
        int int15 = helpFormatter0.getLeftPadding();
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("-", options17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        int int10 = helpFormatter0.getDescPadding();
        java.lang.String str11 = helpFormatter0.getArgName();
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str15 = helpFormatter13.rtrim("arg");
        java.lang.String str16 = helpFormatter13.getNewLine();
        int int17 = helpFormatter13.defaultWidth;
        java.lang.String str19 = helpFormatter13.rtrim("-");
        java.lang.String str20 = helpFormatter13.getArgName();
        java.lang.String str21 = helpFormatter13.getOptPrefix();
        java.lang.String str22 = helpFormatter13.getSyntaxPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter23 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str25 = helpFormatter23.rtrim("arg");
        helpFormatter23.setSyntaxPrefix("-");
        java.lang.String str28 = helpFormatter23.getOptPrefix();
        int int29 = helpFormatter23.defaultDescPad;
        int int33 = helpFormatter23.findWrapPos("                                   ", (-1), (int) (short) 1);
        int int34 = helpFormatter23.getWidth();
        int int35 = helpFormatter23.getLeftPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter36 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str38 = helpFormatter36.rtrim("arg");
        helpFormatter36.defaultWidth = (short) -1;
        java.lang.String str41 = helpFormatter36.defaultArgName;
        helpFormatter36.setSyntaxPrefix("arg");
        helpFormatter36.setSyntaxPrefix("--");
        int int46 = helpFormatter36.getDescPadding();
        int int50 = helpFormatter36.findWrapPos("", (int) (byte) 100, 0);
        helpFormatter36.defaultWidth = (byte) 10;
        java.util.Comparator comparator53 = helpFormatter36.getOptionComparator();
        helpFormatter23.setOptionComparator(comparator53);
        helpFormatter13.optionComparator = comparator53;
        helpFormatter0.optionComparator = comparator53;
        int int57 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-" + "'", str19, "-");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "arg" + "'", str20, "arg");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-" + "'", str21, "-");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "usage: " + "'", str22, "usage: ");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "arg" + "'", str25, "arg");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-" + "'", str28, "-");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 74 + "'", int34 == 74);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "arg" + "'", str38, "arg");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "arg" + "'", str41, "arg");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(comparator53);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 3 + "'", int57 == 3);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setDescPadding(0);
        int int8 = helpFormatter0.getLeftPadding();
        int int9 = helpFormatter0.getDescPadding();
        int int10 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLongOptPrefix("                                                                         ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth(74);
        int int8 = helpFormatter0.getWidth();
        java.lang.String str10 = helpFormatter0.createPadding((int) (byte) 10);
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", options13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "          " + "'", str10, "          ");
        org.junit.Assert.assertNotNull(comparator11);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.getWidth();
        java.lang.String str9 = helpFormatter0.rtrim("arg");
        java.lang.String str10 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int10 = helpFormatter0.getLeftPadding();
        java.lang.String str12 = helpFormatter0.createPadding((int) '4');
        int int13 = helpFormatter0.defaultLeftPad;
        java.util.Comparator comparator14 = helpFormatter0.getOptionComparator();
        java.lang.String str15 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str16 = helpFormatter0.getArgName();
        org.apache.commons.cli.HelpFormatter helpFormatter17 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str19 = helpFormatter17.rtrim("arg");
        java.lang.String str20 = helpFormatter17.defaultSyntaxPrefix;
        helpFormatter17.defaultWidth = 0;
        java.util.Comparator comparator23 = helpFormatter17.getOptionComparator();
        helpFormatter0.optionComparator = comparator23;
        java.io.PrintWriter printWriter25 = null;
        org.apache.commons.cli.Options options29 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter25, (int) (byte) -1, " ", "                                                    ", options29, 11, 76, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 8");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                    " + "'", str12, "                                                    ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "usage: " + "'", str15, "usage: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "usage: " + "'", str20, "usage: ");
        org.junit.Assert.assertNotNull(comparator23);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        int int7 = helpFormatter0.findWrapPos("arg", 0, (int) ' ');
        helpFormatter0.setLeftPadding(100);
        java.lang.String str10 = helpFormatter0.getNewLine();
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str13 = helpFormatter11.rtrim("arg");
        helpFormatter11.defaultOptPrefix = "--";
        helpFormatter11.defaultArgName = "                                                                                                    ";
        org.apache.commons.cli.HelpFormatter helpFormatter18 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str20 = helpFormatter18.rtrim("arg");
        java.lang.String str21 = helpFormatter18.getNewLine();
        java.lang.String str22 = helpFormatter18.getOptPrefix();
        helpFormatter18.setNewLine("usage: ");
        helpFormatter18.setWidth(3);
        java.lang.String str27 = helpFormatter18.defaultArgName;
        int int28 = helpFormatter18.defaultWidth;
        helpFormatter18.setLongOptPrefix("usage: ");
        org.apache.commons.cli.HelpFormatter helpFormatter31 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str33 = helpFormatter31.rtrim("arg");
        helpFormatter31.defaultWidth = (short) -1;
        java.lang.String str36 = helpFormatter31.defaultArgName;
        helpFormatter31.setSyntaxPrefix("arg");
        helpFormatter31.setSyntaxPrefix("--");
        java.util.Comparator comparator41 = helpFormatter31.optionComparator;
        helpFormatter18.optionComparator = comparator41;
        helpFormatter11.optionComparator = comparator41;
        helpFormatter0.optionComparator = comparator41;
        helpFormatter0.setDescPadding((int) (byte) 1);
        java.lang.String str48 = helpFormatter0.rtrim("--");
        java.lang.String str49 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLongOptPrefix("                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "arg" + "'", str20, "arg");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n" + "'", str21, "\n");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-" + "'", str22, "-");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "arg" + "'", str27, "arg");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "arg" + "'", str33, "arg");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "arg" + "'", str36, "arg");
        org.junit.Assert.assertNotNull(comparator41);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "--" + "'", str48, "--");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "--" + "'", str49, "--");
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.defaultDescPad;
        java.lang.String str3 = helpFormatter0.rtrim(" ");
        helpFormatter0.setSyntaxPrefix("                                                    ");
        java.lang.String str7 = helpFormatter0.rtrim("                                                                        ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix("hi!");
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        helpFormatter0.setLeftPadding(100);
        helpFormatter0.setNewLine("  ");
        int int16 = helpFormatter0.defaultWidth;
        java.util.Comparator comparator17 = helpFormatter0.optionComparator;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(comparator17);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        int int11 = helpFormatter0.defaultWidth;
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", options15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 6");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "-";
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultOptPrefix = "          ";
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = helpFormatter0.renderWrappedText(stringBuffer11, 72, 72, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuffer.append(String)\" because \"sb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.setDescPadding((int) (short) 100);
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setOptPrefix("--");
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter13, 0, 11, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        int int7 = helpFormatter0.findWrapPos("arg", 0, (int) ' ');
        helpFormatter0.setLeftPadding(100);
        java.lang.String str10 = helpFormatter0.getNewLine();
        java.lang.String str11 = helpFormatter0.getArgName();
        helpFormatter0.defaultArgName = "";
        java.lang.String str15 = helpFormatter0.rtrim("--");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
    }
}

