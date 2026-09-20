package org.apache.commons.cli;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth(74);
        helpFormatter0.defaultLeftPad = 3;
        helpFormatter0.defaultLongOptPrefix = " ";
        java.util.Comparator comparator12 = helpFormatter0.getOptionComparator();
        int int13 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        java.lang.String str14 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultOptPrefix = "--";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
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
        helpFormatter0.defaultSyntaxPrefix = "                                                                        ";
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer23 = helpFormatter0.renderWrappedText(stringBuffer19, 87, 35, "         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuffer.append(String)\" because \"sb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
        org.junit.Assert.assertNotNull(comparator15);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        int int10 = helpFormatter0.getDescPadding();
        java.lang.String str11 = helpFormatter0.getArgName();
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        int int9 = helpFormatter0.getWidth();
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        java.lang.String str11 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultDescPad = (short) 100;
        java.util.Comparator comparator11 = helpFormatter0.optionComparator;
        java.lang.String str13 = helpFormatter0.createPadding((int) (byte) 1);
        java.lang.String str15 = helpFormatter0.createPadding(73);
        helpFormatter0.defaultWidth = (byte) 100;
        helpFormatter0.setArgName("                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " " + "'", str13, " ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                                                         " + "'", str15, "                                                                         ");
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setDescPadding(0);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "-";
        helpFormatter0.setLongOptPrefix("");
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.setLeftPadding((-1));
        java.lang.String str21 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-" + "'", str21, "-");
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        helpFormatter0.setDescPadding(100);
        int int10 = helpFormatter0.findWrapPos("                                                                                                    ", (int) (byte) 0, 3);
        helpFormatter0.setNewLine("");
        java.lang.String str13 = helpFormatter0.defaultArgName;
        int int14 = helpFormatter0.getWidth();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str9 = helpFormatter0.rtrim("hi!");
        helpFormatter0.setWidth(10);
        java.lang.String str12 = helpFormatter0.defaultArgName;
        helpFormatter0.setWidth((int) (byte) 0);
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                            ", options16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        int int10 = helpFormatter0.getDescPadding();
        java.lang.String str11 = helpFormatter0.getArgName();
        int int12 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix("hi!");
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 0, "                                                                          ", "                                                                          ", options18, "                                   ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
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
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setDescPadding(0);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        helpFormatter0.setDescPadding((int) ' ');
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str17 = helpFormatter0.defaultOptPrefix;
        java.lang.String str18 = helpFormatter0.defaultNewLine;
        helpFormatter0.setArgName("                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setLongOptPrefix("hi!");
        java.util.Comparator comparator14 = helpFormatter0.optionComparator;
        helpFormatter0.defaultWidth = 73;
        org.apache.commons.cli.HelpFormatter helpFormatter17 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str19 = helpFormatter17.rtrim("arg");
        helpFormatter17.defaultOptPrefix = "--";
        helpFormatter17.setOptPrefix("-");
        helpFormatter17.setDescPadding(1);
        java.lang.String str26 = helpFormatter17.defaultLongOptPrefix;
        int int27 = helpFormatter17.defaultLeftPad;
        java.lang.String str28 = helpFormatter17.getArgName();
        helpFormatter17.setLongOptPrefix("                                   ");
        org.apache.commons.cli.HelpFormatter helpFormatter31 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str33 = helpFormatter31.rtrim("arg");
        helpFormatter31.defaultWidth = (short) -1;
        java.lang.String str36 = helpFormatter31.defaultArgName;
        helpFormatter31.setSyntaxPrefix("arg");
        helpFormatter31.setSyntaxPrefix("--");
        int int41 = helpFormatter31.getDescPadding();
        int int42 = helpFormatter31.getLeftPadding();
        java.lang.String str43 = helpFormatter31.defaultNewLine;
        int int44 = helpFormatter31.defaultDescPad;
        org.apache.commons.cli.HelpFormatter helpFormatter45 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str47 = helpFormatter45.rtrim("arg");
        java.lang.String str48 = helpFormatter45.getNewLine();
        helpFormatter45.defaultArgName = "usage: ";
        int int51 = helpFormatter45.defaultWidth;
        helpFormatter45.setLongOptPrefix("hi!");
        java.util.Comparator comparator54 = helpFormatter45.optionComparator;
        helpFormatter31.setOptionComparator(comparator54);
        helpFormatter17.optionComparator = comparator54;
        helpFormatter0.optionComparator = comparator54;
        helpFormatter0.setArgName("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "--" + "'", str26, "--");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "arg" + "'", str28, "arg");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "arg" + "'", str33, "arg");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "arg" + "'", str36, "arg");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\n" + "'", str43, "\n");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "arg" + "'", str47, "arg");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\n" + "'", str48, "\n");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 74 + "'", int51 == 74);
        org.junit.Assert.assertNotNull(comparator54);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        java.lang.String str7 = helpFormatter0.rtrim("                                                                                                    ");
        helpFormatter0.defaultLongOptPrefix = "";
        helpFormatter0.setOptPrefix("                                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultWidth = 10;
        java.lang.String str14 = helpFormatter0.rtrim("  ");
        helpFormatter0.defaultOptPrefix = "";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
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
        java.lang.String str30 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        int int33 = helpFormatter0.defaultLeftPad;
        java.lang.String str35 = helpFormatter0.rtrim("                                                                                       ");
        java.io.PrintWriter printWriter36 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter36, 21, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "  " + "'", str28, "  ");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "usage: " + "'", str29, "usage: ");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "--" + "'", str30, "--");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                    ", "                                                    ", options12, "                                   ");
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
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
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
        int int16 = helpFormatter0.findWrapPos("                                                                                                 ", 87, (int) (short) 0);
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.defaultLeftPad = 73;
        java.lang.String str21 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 87 + "'", int16 == 87);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        int int13 = helpFormatter0.findWrapPos("\n", 0, (int) '4');
        helpFormatter0.defaultDescPad = 67;
        helpFormatter0.setLongOptPrefix("          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        int int6 = helpFormatter0.findWrapPos("--", (int) '#', (int) (short) 100);
        java.lang.String str8 = helpFormatter0.createPadding((int) '#');
        helpFormatter0.setOptPrefix("");
        java.lang.String str12 = helpFormatter0.rtrim("usage: ");
        int int16 = helpFormatter0.findWrapPos("         ", (-1), 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                   " + "'", str8, "                                   ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage:" + "'", str12, "usage:");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        helpFormatter0.defaultOptPrefix = "                                                                                                    ";
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter7, 73, 35, "                                                                         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultLeftPad = (short) 10;
        int int13 = helpFormatter0.findWrapPos("arg", (int) (short) 0, (int) (short) 10);
        helpFormatter0.setArgName("hi!");
        java.lang.String str17 = helpFormatter0.createPadding(13);
        int int18 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "             " + "'", str17, "             ");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultWidth = (short) 100;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth(74);
        helpFormatter0.setArgName("-");
        helpFormatter0.defaultLongOptPrefix = "arg";
        helpFormatter0.setNewLine("                                   ");
        helpFormatter0.setSyntaxPrefix("usage:");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = helpFormatter0.createPadding((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
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
        helpFormatter0.defaultNewLine = "";
        java.lang.String str47 = helpFormatter0.getOptPrefix();
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
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
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
        int int36 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultSyntaxPrefix = "                                   ";
        helpFormatter0.defaultNewLine = "                                                                                       ";
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        int int10 = helpFormatter0.findWrapPos("", (int) (byte) 100, (int) (short) 0);
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        int int13 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                            ", "            ", options16, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.defaultWidth = ' ';
        java.lang.String str12 = helpFormatter0.getNewLine();
        helpFormatter0.defaultLongOptPrefix = "   ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
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
        java.lang.String str15 = helpFormatter0.createPadding((int) (short) 0);
        helpFormatter0.defaultOptPrefix = "usage:";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        java.util.Comparator comparator11 = null;
        helpFormatter0.setOptionComparator(comparator11);
        helpFormatter0.setNewLine("                                                                                                    ");
        java.util.Comparator comparator15 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(comparator15);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultOptPrefix = "arg";
        helpFormatter0.defaultDescPad = (byte) -1;
        helpFormatter0.defaultArgName = "--";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultOptPrefix = "arg";
        helpFormatter0.setDescPadding((int) (short) 100);
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        int int13 = helpFormatter0.findWrapPos("   ", (int) (short) 1, (int) (byte) -1);
        helpFormatter0.defaultOptPrefix = "arg";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
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
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("         ", "                                                                          ", options22, "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
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
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = (byte) 100;
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator10 = helpFormatter0.optionComparator;
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
        java.lang.String str29 = helpFormatter11.defaultNewLine;
        helpFormatter11.setNewLine("--");
        helpFormatter11.defaultArgName = "                                   ";
        java.lang.String str35 = helpFormatter11.createPadding((int) (byte) 10);
        java.lang.String str36 = helpFormatter11.getArgName();
        java.util.Comparator comparator37 = helpFormatter11.getOptionComparator();
        helpFormatter0.optionComparator = comparator37;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage: " + "'", str17, "usage: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "arg" + "'", str23, "arg");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "usage: " + "'", str24, "usage: ");
        org.junit.Assert.assertNotNull(comparator25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\n" + "'", str29, "\n");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "          " + "'", str35, "          ");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "                                   " + "'", str36, "                                   ");
        org.junit.Assert.assertNotNull(comparator37);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLongOptPrefix("\n");
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter10, 11, "           ", options13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setWidth(45);
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter10, (-1), "                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 20");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertNotNull(comparator9);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
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
        org.apache.commons.cli.Options options28 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                            ", options28, false);
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
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
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
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str15 = helpFormatter13.rtrim("arg");
        java.lang.String str16 = helpFormatter13.defaultSyntaxPrefix;
        java.lang.String str17 = helpFormatter13.defaultOptPrefix;
        java.util.Comparator comparator18 = helpFormatter13.getOptionComparator();
        helpFormatter10.optionComparator = comparator18;
        int int23 = helpFormatter10.findWrapPos("usage: ", 3, (int) (short) 10);
        java.util.Comparator comparator24 = helpFormatter10.getOptionComparator();
        helpFormatter0.optionComparator = comparator24;
        java.util.Comparator comparator26 = helpFormatter0.optionComparator;
        int int27 = helpFormatter0.defaultWidth;
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.setLeftPadding(10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertNotNull(comparator18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(comparator24);
        org.junit.Assert.assertNotNull(comparator26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 74 + "'", int27 == 74);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        int int9 = helpFormatter0.getWidth();
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultArgName = "                                                                   ";
        java.lang.String str14 = helpFormatter0.rtrim("                                ");
        helpFormatter0.defaultLongOptPrefix = "                                                                                       ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
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
        java.lang.String str17 = helpFormatter0.getLongOptPrefix();
        int int21 = helpFormatter0.findWrapPos("                                                                        ", 52, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage: " + "'", str17, "usage: ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 62 + "'", int21 == 62);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setNewLine("\n");
        int int11 = helpFormatter0.defaultLeftPad;
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str15 = helpFormatter13.rtrim("arg");
        helpFormatter13.setSyntaxPrefix("-");
        java.lang.String str18 = helpFormatter13.getOptPrefix();
        helpFormatter13.setNewLine("");
        java.lang.String str21 = helpFormatter13.getLongOptPrefix();
        helpFormatter13.defaultLongOptPrefix = "usage: ";
        java.lang.String str24 = helpFormatter13.defaultArgName;
        helpFormatter13.setDescPadding(87);
        helpFormatter13.defaultSyntaxPrefix = "                                ";
        java.util.Comparator comparator29 = helpFormatter13.optionComparator;
        helpFormatter0.setOptionComparator(comparator29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "arg" + "'", str24, "arg");
        org.junit.Assert.assertNotNull(comparator29);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.defaultNewLine = "-";
        java.lang.String str12 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "          ";
        java.lang.String str15 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "          " + "'", str15, "          ");
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultDescPad = (byte) 10;
        java.lang.String str9 = helpFormatter0.getArgName();
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
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
        helpFormatter0.setArgName("                                                                          ");
        java.io.PrintWriter printWriter19 = null;
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter19, 0, "                                   ", "                                   ", options23, 13, 0, "arg", false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:         ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertNotNull(comparator15);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "-";
        java.util.Comparator comparator11 = helpFormatter0.optionComparator;
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str13 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setArgName("hi!");
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter16, (int) '4', "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
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
        helpFormatter0.defaultDescPad = 100;
        helpFormatter0.setSyntaxPrefix(" ");
        java.util.Comparator comparator18 = helpFormatter0.optionComparator;
        helpFormatter0.defaultDescPad = (byte) -1;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(comparator18);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        helpFormatter0.defaultWidth = (byte) 0;
        helpFormatter0.defaultDescPad = (short) 0;
        helpFormatter0.defaultNewLine = "                                                                                                    ";
        helpFormatter0.defaultDescPad = 45;
        helpFormatter0.setNewLine("");
        int int16 = helpFormatter0.getDescPadding();
        java.util.Comparator comparator17 = helpFormatter0.getOptionComparator();
        helpFormatter0.setNewLine("             ");
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", "usage: ", options22, "                                                    ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 45 + "'", int16 == 45);
        org.junit.Assert.assertNotNull(comparator17);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
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
        helpFormatter0.setLongOptPrefix("usage:");
        java.lang.String str21 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 74 + "'", int18 == 74);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n" + "'", str21, "\n");
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator8 = helpFormatter0.getOptionComparator();
        int int9 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
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
        helpFormatter0.setLeftPadding(12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix("hi!");
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.defaultNewLine = "--";
        helpFormatter0.defaultOptPrefix = "                                                                                                    ";
        int int15 = helpFormatter0.getDescPadding();
        java.lang.String str16 = helpFormatter0.getLongOptPrefix();
        java.lang.String str17 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setSyntaxPrefix("                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                                                                                    " + "'", str17, "                                                                                                    ");
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultDescPad = (short) 100;
        java.util.Comparator comparator11 = helpFormatter0.optionComparator;
        java.lang.String str13 = helpFormatter0.rtrim("\n");
        java.util.Comparator comparator14 = helpFormatter0.getOptionComparator();
        int int15 = helpFormatter0.defaultWidth;
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter16, 87, "                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        helpFormatter0.setDescPadding(100);
        int int10 = helpFormatter0.findWrapPos("                                                                                                    ", (int) (byte) 0, 3);
        helpFormatter0.setNewLine("");
        java.lang.String str13 = helpFormatter0.defaultArgName;
        java.lang.Class<?> wildcardClass14 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
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
        helpFormatter0.defaultLongOptPrefix = "--";
        helpFormatter0.defaultOptPrefix = "                                             ";
        helpFormatter0.defaultNewLine = "                                                                            ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage:" + "'", str16, "usage:");
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultOptPrefix = "         ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setWidth(45);
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultNewLine = "-";
        java.lang.String str13 = helpFormatter0.createPadding(86);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                                                                      " + "'", str13, "                                                                                      ");
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultLeftPad = (short) 100;
        helpFormatter0.setLeftPadding((int) (byte) 100);
        org.apache.commons.cli.HelpFormatter helpFormatter15 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str17 = helpFormatter15.rtrim("arg");
        java.lang.String str18 = helpFormatter15.defaultSyntaxPrefix;
        java.lang.String str19 = helpFormatter15.defaultOptPrefix;
        java.lang.String str20 = helpFormatter15.defaultLongOptPrefix;
        java.lang.String str21 = helpFormatter15.defaultNewLine;
        helpFormatter15.setWidth((int) (short) 1);
        org.apache.commons.cli.HelpFormatter helpFormatter24 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str26 = helpFormatter24.rtrim("arg");
        helpFormatter24.defaultWidth = (short) -1;
        java.lang.String str29 = helpFormatter24.defaultArgName;
        helpFormatter24.setSyntaxPrefix("arg");
        helpFormatter24.setDescPadding((int) '#');
        helpFormatter24.defaultOptPrefix = "hi!";
        helpFormatter24.setLongOptPrefix("hi!");
        java.util.Comparator comparator38 = helpFormatter24.getOptionComparator();
        helpFormatter15.optionComparator = comparator38;
        helpFormatter0.optionComparator = comparator38;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "usage: " + "'", str18, "usage: ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-" + "'", str19, "-");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "--" + "'", str20, "--");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n" + "'", str21, "\n");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "arg" + "'", str26, "arg");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "arg" + "'", str29, "arg");
        org.junit.Assert.assertNotNull(comparator38);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
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
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("            ", options18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.lang.String str5 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultNewLine = "--";
        java.util.Comparator comparator8 = helpFormatter0.optionComparator;
        java.lang.Class<?> wildcardClass9 = comparator8.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = (byte) 100;
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultWidth = (short) 0;
        helpFormatter0.setWidth((int) (byte) 0);
        helpFormatter0.defaultOptPrefix = "                                                                                      ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setDescPadding(0);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str13 = helpFormatter0.rtrim("usage: ");
        helpFormatter0.setArgName("                                   ");
        int int16 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage:" + "'", str13, "usage:");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.defaultNewLine = "usage: ";
        helpFormatter0.setDescPadding(52);
        helpFormatter0.defaultSyntaxPrefix = "                    ";
        java.lang.String str16 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.defaultWidth = ' ';
        helpFormatter0.defaultLongOptPrefix = "          ";
        java.util.Comparator comparator14 = helpFormatter0.optionComparator;
        java.util.Comparator comparator15 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertNotNull(comparator15);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultNewLine = "arg";
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("  ");
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(9, "             ", "--", options13, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
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
        helpFormatter0.setDescPadding((int) (short) 10);
        helpFormatter0.setOptPrefix("          ");
        helpFormatter0.defaultWidth = 100;
        java.lang.String str35 = helpFormatter0.getArgName();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "arg" + "'", str35, "arg");
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        int int7 = helpFormatter0.findWrapPos("arg", 0, (int) ' ');
        helpFormatter0.setLeftPadding(100);
        int int10 = helpFormatter0.defaultWidth;
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultWidth = 12;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        int int9 = helpFormatter0.findWrapPos("-", (int) (short) 100, 74);
        helpFormatter0.setNewLine("usage: ");
        int int15 = helpFormatter0.findWrapPos("                                                    ", 45, (int) (short) 10);
        java.lang.String str16 = helpFormatter0.defaultArgName;
        java.util.Comparator comparator17 = helpFormatter0.optionComparator;
        helpFormatter0.setWidth((int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
        org.junit.Assert.assertNotNull(comparator17);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        int int8 = helpFormatter0.findWrapPos("", (int) (byte) 1, (int) (byte) 0);
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setWidth((int) (short) -1);
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.setWidth(3);
        java.lang.String str16 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setDescPadding(0);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str15 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setSyntaxPrefix(" ");
        helpFormatter0.setLongOptPrefix("-");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "usage: " + "'", str15, "usage: ");
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter4 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str6 = helpFormatter4.rtrim("arg");
        java.lang.String str7 = helpFormatter4.getNewLine();
        java.lang.String str8 = helpFormatter4.getOptPrefix();
        helpFormatter4.setOptPrefix("usage: ");
        java.lang.String str11 = helpFormatter4.getNewLine();
        java.lang.String str13 = helpFormatter4.rtrim("hi!");
        int int14 = helpFormatter4.defaultLeftPad;
        java.util.Comparator comparator15 = helpFormatter4.optionComparator;
        helpFormatter0.setOptionComparator(comparator15);
        helpFormatter0.setNewLine("                                                                                       ");
        helpFormatter0.defaultArgName = "                    ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(comparator15);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
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
        int int17 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        helpFormatter0.setDescPadding(100);
        int int10 = helpFormatter0.findWrapPos("                                                                                                    ", (int) (byte) 0, 3);
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str15 = helpFormatter0.createPadding(0);
        java.util.Comparator comparator16 = null;
        helpFormatter0.optionComparator = comparator16;
        java.lang.String str18 = helpFormatter0.getNewLine();
        java.lang.String str19 = helpFormatter0.getSyntaxPrefix();
        int int20 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
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
        java.lang.String str16 = helpFormatter0.getOptPrefix();
        java.lang.String str17 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setOptPrefix("usage:");
        helpFormatter0.defaultDescPad = 100;
        java.lang.StringBuffer stringBuffer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer26 = helpFormatter0.renderWrappedText(stringBuffer22, 52, (int) (short) 100, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuffer.append(String)\" because \"sb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = (byte) 100;
        java.lang.String str8 = helpFormatter0.getArgName();
        helpFormatter0.setNewLine("-");
        int int14 = helpFormatter0.findWrapPos("", (-1), (int) ' ');
        int int15 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultLeftPad = (short) 10;
        helpFormatter0.defaultOptPrefix = "          ";
        int int12 = helpFormatter0.defaultWidth;
        java.lang.String str14 = helpFormatter0.createPadding(67);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                   " + "'", str14, "                                                                   ");
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        int int9 = helpFormatter0.findWrapPos(" ", (int) (short) 1, 10);
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultNewLine = "                                                                          ";
        helpFormatter0.defaultArgName = " ";
        helpFormatter0.defaultSyntaxPrefix = "                                                    ";
        helpFormatter0.defaultArgName = "                                                                        ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
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
        helpFormatter0.defaultLongOptPrefix = "                                                                        ";
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
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        int int11 = helpFormatter0.findWrapPos("                                ", (int) (short) 0, 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
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
        org.apache.commons.cli.HelpFormatter helpFormatter29 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter29.defaultOptPrefix = "hi!";
        int int35 = helpFormatter29.findWrapPos("--", (int) '#', (int) (short) 100);
        helpFormatter29.defaultLeftPad = 0;
        java.util.Comparator comparator38 = helpFormatter29.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator38);
        int int40 = helpFormatter0.defaultWidth;
        int int41 = helpFormatter0.getLeftPadding();
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(comparator38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 74 + "'", int40 == 74);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultWidth;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("          ");
        int int8 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultNewLine = "usage:";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("");
        int int6 = helpFormatter0.findWrapPos("", (int) (short) 1, (int) (byte) 0);
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        java.lang.String str9 = helpFormatter0.rtrim("                                                    ");
        java.util.Comparator comparator10 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(comparator10);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        java.lang.String str8 = helpFormatter0.getNewLine();
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultSyntaxPrefix = "";
        helpFormatter0.defaultWidth = (short) 1;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
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
        java.io.PrintWriter printWriter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter17, 45, 13, "   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setDescPadding(0);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.getArgName();
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str15 = helpFormatter13.rtrim("arg");
        java.lang.String str16 = helpFormatter13.defaultSyntaxPrefix;
        helpFormatter13.setNewLine("hi!");
        int int19 = helpFormatter13.getWidth();
        org.apache.commons.cli.HelpFormatter helpFormatter20 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str22 = helpFormatter20.rtrim("arg");
        java.lang.String str23 = helpFormatter20.defaultSyntaxPrefix;
        java.util.Comparator comparator24 = helpFormatter20.optionComparator;
        java.lang.String str25 = helpFormatter20.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter26 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str28 = helpFormatter26.rtrim("arg");
        helpFormatter26.defaultOptPrefix = "--";
        helpFormatter26.setOptPrefix("-");
        helpFormatter26.setDescPadding(1);
        java.util.Comparator comparator35 = helpFormatter26.getOptionComparator();
        helpFormatter20.optionComparator = comparator35;
        helpFormatter13.setOptionComparator(comparator35);
        helpFormatter0.optionComparator = comparator35;
        java.lang.String str39 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str41 = helpFormatter0.rtrim("                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 74 + "'", int19 == 74);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "arg" + "'", str22, "arg");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "usage: " + "'", str23, "usage: ");
        org.junit.Assert.assertNotNull(comparator24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-" + "'", str25, "-");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "arg" + "'", str28, "arg");
        org.junit.Assert.assertNotNull(comparator35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "--" + "'", str39, "--");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        helpFormatter0.defaultWidth = (byte) 0;
        helpFormatter0.defaultDescPad = (short) 0;
        int int13 = helpFormatter0.findWrapPos("\n", (int) (short) 0, (int) (short) 100);
        java.lang.String str14 = helpFormatter0.getLongOptPrefix();
        java.lang.String str16 = helpFormatter0.createPadding(10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "          " + "'", str16, "          ");
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        int int10 = helpFormatter0.getWidth();
        int int11 = helpFormatter0.getWidth();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        int int10 = helpFormatter0.getDescPadding();
        java.lang.String str12 = helpFormatter0.rtrim("");
        java.lang.String str14 = helpFormatter0.rtrim("                                   ");
        java.util.Comparator comparator15 = helpFormatter0.getOptionComparator();
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str18 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.setArgName("          ");
        java.lang.String str14 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setNewLine("\n");
        java.lang.String str11 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setWidth((int) (byte) 100);
        java.lang.String str15 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.setArgName("          ");
        helpFormatter0.defaultLeftPad = (byte) 1;
        helpFormatter0.defaultLeftPad = ' ';
        java.lang.String str13 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
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
        java.lang.String str18 = helpFormatter0.rtrim("--");
        java.lang.String str19 = helpFormatter0.defaultArgName;
        helpFormatter0.setWidth((int) '4');
        int int22 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "--" + "'", str18, "--");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
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
        java.lang.String str21 = helpFormatter0.getArgName();
        helpFormatter0.setSyntaxPrefix("-");
        int int27 = helpFormatter0.findWrapPos("", 72, (int) (byte) 10);
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str31 = helpFormatter0.rtrim("usage:");
        java.lang.Class<?> wildcardClass32 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "usage:" + "'", str31, "usage:");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        helpFormatter0.setLeftPadding((int) (short) -1);
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", "            ", options9, "         ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
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
        org.apache.commons.cli.HelpFormatter helpFormatter55 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str57 = helpFormatter55.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter58 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str60 = helpFormatter58.rtrim("arg");
        java.lang.String str61 = helpFormatter58.defaultSyntaxPrefix;
        java.lang.String str62 = helpFormatter58.defaultOptPrefix;
        java.util.Comparator comparator63 = helpFormatter58.getOptionComparator();
        helpFormatter55.optionComparator = comparator63;
        int int68 = helpFormatter55.findWrapPos("usage: ", 3, (int) (short) 10);
        helpFormatter55.defaultArgName = "\n";
        int int71 = helpFormatter55.defaultLeftPad;
        java.util.Comparator comparator72 = helpFormatter55.optionComparator;
        helpFormatter0.optionComparator = comparator72;
        helpFormatter0.defaultOptPrefix = "                                                                          ";
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
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "arg" + "'", str57, "arg");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "arg" + "'", str60, "arg");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "usage: " + "'", str61, "usage: ");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "-" + "'", str62, "-");
        org.junit.Assert.assertNotNull(comparator63);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(comparator72);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        int int5 = helpFormatter0.defaultWidth;
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter7 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str9 = helpFormatter7.rtrim("arg");
        helpFormatter7.setSyntaxPrefix("-");
        java.lang.String str12 = helpFormatter7.getOptPrefix();
        java.lang.String str13 = helpFormatter7.defaultSyntaxPrefix;
        int int14 = helpFormatter7.defaultWidth;
        int int15 = helpFormatter7.getLeftPadding();
        int int19 = helpFormatter7.findWrapPos("          ", (int) ' ', 10);
        int int20 = helpFormatter7.getWidth();
        int int21 = helpFormatter7.defaultLeftPad;
        java.lang.String str22 = helpFormatter7.defaultNewLine;
        org.apache.commons.cli.HelpFormatter helpFormatter23 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str25 = helpFormatter23.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter26 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str28 = helpFormatter26.rtrim("arg");
        java.lang.String str29 = helpFormatter26.defaultSyntaxPrefix;
        java.lang.String str30 = helpFormatter26.defaultOptPrefix;
        java.util.Comparator comparator31 = helpFormatter26.getOptionComparator();
        helpFormatter23.optionComparator = comparator31;
        int int36 = helpFormatter23.findWrapPos("usage: ", 3, (int) (short) 10);
        helpFormatter23.defaultArgName = "\n";
        int int39 = helpFormatter23.defaultLeftPad;
        java.util.Comparator comparator40 = helpFormatter23.optionComparator;
        helpFormatter7.optionComparator = comparator40;
        helpFormatter0.optionComparator = comparator40;
        java.lang.String str43 = helpFormatter0.getOptPrefix();
        java.util.Comparator comparator44 = helpFormatter0.getOptionComparator();
        org.apache.commons.cli.HelpFormatter helpFormatter45 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str47 = helpFormatter45.rtrim("arg");
        java.lang.String str48 = helpFormatter45.defaultSyntaxPrefix;
        java.util.Comparator comparator49 = helpFormatter45.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator49);
        helpFormatter0.defaultNewLine = "  ";
        java.lang.String str53 = helpFormatter0.getLongOptPrefix();
        java.util.Comparator comparator54 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 74 + "'", int20 == 74);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n" + "'", str22, "\n");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "arg" + "'", str25, "arg");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "arg" + "'", str28, "arg");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "usage: " + "'", str29, "usage: ");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-" + "'", str30, "-");
        org.junit.Assert.assertNotNull(comparator31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(comparator40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "-" + "'", str43, "-");
        org.junit.Assert.assertNotNull(comparator44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "arg" + "'", str47, "arg");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "usage: " + "'", str48, "usage: ");
        org.junit.Assert.assertNotNull(comparator49);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "--" + "'", str53, "--");
        org.junit.Assert.assertNotNull(comparator54);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
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
        java.io.PrintWriter printWriter37 = null;
        org.apache.commons.cli.Options options40 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter37, 52, "   ", options40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderOptions(stringBuffer11, (int) (short) 1, options13, 2, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        java.util.Comparator comparator10 = helpFormatter0.optionComparator;
        java.lang.String str11 = helpFormatter0.defaultArgName;
        int int15 = helpFormatter0.findWrapPos(" ", 3, 3);
        int int16 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.HelpFormatter helpFormatter17 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter17.defaultOptPrefix = "hi!";
        helpFormatter17.setNewLine("\n");
        int int22 = helpFormatter17.getDescPadding();
        helpFormatter17.setOptPrefix("\n");
        java.lang.String str25 = helpFormatter17.defaultSyntaxPrefix;
        java.util.Comparator comparator26 = helpFormatter17.optionComparator;
        helpFormatter17.setNewLine("usage:");
        java.lang.String str29 = helpFormatter17.defaultSyntaxPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter30 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str32 = helpFormatter30.rtrim("arg");
        helpFormatter30.defaultWidth = (short) -1;
        java.lang.String str35 = helpFormatter30.defaultArgName;
        java.lang.String str36 = helpFormatter30.defaultArgName;
        helpFormatter30.setOptPrefix("hi!");
        helpFormatter30.defaultSyntaxPrefix = "usage: ";
        java.lang.String str41 = helpFormatter30.defaultNewLine;
        int int42 = helpFormatter30.defaultDescPad;
        java.lang.String str43 = helpFormatter30.getArgName();
        java.lang.String str44 = helpFormatter30.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter45 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter45.defaultOptPrefix = "hi!";
        int int51 = helpFormatter45.findWrapPos("--", (int) '#', (int) (short) 100);
        helpFormatter45.setArgName("arg");
        helpFormatter45.defaultOptPrefix = "";
        java.lang.String str57 = helpFormatter45.rtrim("                                                                                                 ");
        org.apache.commons.cli.HelpFormatter helpFormatter58 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str60 = helpFormatter58.rtrim("arg");
        helpFormatter58.defaultWidth = (short) -1;
        java.lang.String str63 = helpFormatter58.defaultArgName;
        helpFormatter58.setSyntaxPrefix("arg");
        helpFormatter58.setDescPadding((int) '#');
        helpFormatter58.defaultOptPrefix = "hi!";
        helpFormatter58.setLongOptPrefix("hi!");
        java.util.Comparator comparator72 = helpFormatter58.optionComparator;
        helpFormatter45.setOptionComparator(comparator72);
        helpFormatter30.optionComparator = comparator72;
        helpFormatter17.setOptionComparator(comparator72);
        helpFormatter0.setOptionComparator(comparator72);
        java.lang.String str77 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultArgName = "             ";
        int int83 = helpFormatter0.findWrapPos("   ", 1, 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "usage: " + "'", str25, "usage: ");
        org.junit.Assert.assertNotNull(comparator26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "usage: " + "'", str29, "usage: ");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "arg" + "'", str32, "arg");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "arg" + "'", str35, "arg");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "arg" + "'", str36, "arg");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\n" + "'", str41, "\n");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "arg" + "'", str43, "arg");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "arg" + "'", str60, "arg");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "arg" + "'", str63, "arg");
        org.junit.Assert.assertNotNull(comparator72);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "arg" + "'", str77, "arg");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.getArgName();
        helpFormatter0.defaultSyntaxPrefix = "-";
        helpFormatter0.setWidth(3);
        helpFormatter0.defaultArgName = "                                                                          ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("\n");
        java.lang.String str10 = helpFormatter0.createPadding((int) (short) 100);
        int int11 = helpFormatter0.defaultLeftPad;
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = helpFormatter0.renderOptions(stringBuffer12, 62, options14, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                    " + "'", str10, "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultArgName = "";
        helpFormatter0.defaultLongOptPrefix = "                                                                                                 ";
        java.util.Comparator comparator14 = helpFormatter0.optionComparator;
        int int15 = helpFormatter0.getLeftPadding();
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter16, 74, "         ", "          ", options20, 62, 73, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        int int8 = helpFormatter0.defaultDescPad;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        helpFormatter0.setLongOptPrefix("                                   ");
        int int12 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str7 = helpFormatter0.getNewLine();
        helpFormatter0.setOptPrefix("--");
        helpFormatter0.setDescPadding((int) (byte) 0);
        java.lang.String str12 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultDescPad = 0;
        helpFormatter0.defaultNewLine = "                                                                        ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
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
        int int19 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLeftPad = (byte) -1;
        int int22 = helpFormatter0.getWidth();
        java.lang.String str23 = helpFormatter0.defaultArgName;
        java.lang.String str25 = helpFormatter0.createPadding(52);
        helpFormatter0.defaultArgName = "                    ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 74 + "'", int22 == 74);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "arg" + "'", str23, "arg");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "                                                    " + "'", str25, "                                                    ");
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
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
        java.util.Comparator comparator32 = helpFormatter0.getOptionComparator();
        helpFormatter0.setSyntaxPrefix(" ");
        java.lang.String str35 = helpFormatter0.getSyntaxPrefix();
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
        org.junit.Assert.assertNotNull(comparator32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + " " + "'", str35, " ");
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "-";
        java.util.Comparator comparator11 = helpFormatter0.optionComparator;
        int int12 = helpFormatter0.defaultLeftPad;
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str15 = helpFormatter13.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter16 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str18 = helpFormatter16.rtrim("arg");
        java.lang.String str19 = helpFormatter16.defaultSyntaxPrefix;
        java.lang.String str20 = helpFormatter16.defaultOptPrefix;
        java.util.Comparator comparator21 = helpFormatter16.getOptionComparator();
        helpFormatter13.optionComparator = comparator21;
        org.apache.commons.cli.HelpFormatter helpFormatter23 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str25 = helpFormatter23.rtrim("arg");
        java.lang.String str26 = helpFormatter23.defaultSyntaxPrefix;
        java.util.Comparator comparator27 = helpFormatter23.optionComparator;
        helpFormatter13.setOptionComparator(comparator27);
        helpFormatter13.setDescPadding((int) (byte) 1);
        org.apache.commons.cli.HelpFormatter helpFormatter31 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str33 = helpFormatter31.rtrim("arg");
        helpFormatter31.defaultWidth = (short) -1;
        java.lang.String str36 = helpFormatter31.defaultArgName;
        helpFormatter31.setSyntaxPrefix("arg");
        java.lang.String str39 = helpFormatter31.getLongOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter40 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str42 = helpFormatter40.rtrim("arg");
        java.lang.String str43 = helpFormatter40.defaultSyntaxPrefix;
        java.lang.String str44 = helpFormatter40.defaultOptPrefix;
        java.util.Comparator comparator45 = helpFormatter40.getOptionComparator();
        helpFormatter31.setOptionComparator(comparator45);
        helpFormatter13.setOptionComparator(comparator45);
        helpFormatter0.setOptionComparator(comparator45);
        helpFormatter0.defaultWidth = 35;
        org.apache.commons.cli.HelpFormatter helpFormatter51 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str53 = helpFormatter51.rtrim("arg");
        helpFormatter51.defaultWidth = (short) -1;
        java.lang.String str56 = helpFormatter51.defaultArgName;
        helpFormatter51.setSyntaxPrefix("arg");
        helpFormatter51.setDescPadding((int) '#');
        helpFormatter51.defaultOptPrefix = "hi!";
        java.util.Comparator comparator63 = helpFormatter51.optionComparator;
        helpFormatter0.optionComparator = comparator63;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-" + "'", str20, "-");
        org.junit.Assert.assertNotNull(comparator21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "arg" + "'", str25, "arg");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "usage: " + "'", str26, "usage: ");
        org.junit.Assert.assertNotNull(comparator27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "arg" + "'", str33, "arg");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "arg" + "'", str36, "arg");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "--" + "'", str39, "--");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "arg" + "'", str42, "arg");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "usage: " + "'", str43, "usage: ");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "-" + "'", str44, "-");
        org.junit.Assert.assertNotNull(comparator45);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "arg" + "'", str53, "arg");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "arg" + "'", str56, "arg");
        org.junit.Assert.assertNotNull(comparator63);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        java.util.Comparator comparator12 = helpFormatter0.optionComparator;
        helpFormatter0.setSyntaxPrefix("  ");
        helpFormatter0.defaultArgName = "                                                                            ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertNotNull(comparator12);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        int int6 = helpFormatter0.getWidth();
        org.apache.commons.cli.HelpFormatter helpFormatter7 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str9 = helpFormatter7.rtrim("arg");
        java.lang.String str10 = helpFormatter7.defaultSyntaxPrefix;
        java.util.Comparator comparator11 = helpFormatter7.optionComparator;
        java.lang.String str12 = helpFormatter7.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str15 = helpFormatter13.rtrim("arg");
        helpFormatter13.defaultOptPrefix = "--";
        helpFormatter13.setOptPrefix("-");
        helpFormatter13.setDescPadding(1);
        java.util.Comparator comparator22 = helpFormatter13.getOptionComparator();
        helpFormatter7.optionComparator = comparator22;
        helpFormatter0.setOptionComparator(comparator22);
        helpFormatter0.defaultLongOptPrefix = "                                                                            ";
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertNotNull(comparator22);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultWidth;
        int int8 = helpFormatter0.getLeftPadding();
        int int12 = helpFormatter0.findWrapPos("          ", (int) ' ', 10);
        int int13 = helpFormatter0.getWidth();
        java.lang.String str14 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setNewLine("\n");
        int int11 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setLongOptPrefix("  ");
        java.lang.String str14 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        org.apache.commons.cli.HelpFormatter helpFormatter7 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str9 = helpFormatter7.rtrim("arg");
        java.lang.String str10 = helpFormatter7.getNewLine();
        java.lang.String str11 = helpFormatter7.getOptPrefix();
        helpFormatter7.defaultOptPrefix = "arg";
        org.apache.commons.cli.HelpFormatter helpFormatter14 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str16 = helpFormatter14.rtrim("arg");
        java.lang.String str17 = helpFormatter14.getNewLine();
        java.lang.String str18 = helpFormatter14.getOptPrefix();
        helpFormatter14.setOptPrefix("usage: ");
        java.lang.String str21 = helpFormatter14.getNewLine();
        java.lang.String str23 = helpFormatter14.rtrim("hi!");
        int int24 = helpFormatter14.defaultLeftPad;
        java.util.Comparator comparator25 = helpFormatter14.optionComparator;
        helpFormatter7.setOptionComparator(comparator25);
        helpFormatter7.defaultWidth = ' ';
        java.lang.String str29 = helpFormatter7.getSyntaxPrefix();
        java.util.Comparator comparator30 = helpFormatter7.optionComparator;
        helpFormatter0.optionComparator = comparator30;
        java.lang.String str32 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n" + "'", str21, "\n");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(comparator25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "usage: " + "'", str29, "usage: ");
        org.junit.Assert.assertNotNull(comparator30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "arg" + "'", str32, "arg");
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
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
        helpFormatter0.setOptPrefix("                                                                                       ");
        helpFormatter0.setDescPadding((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
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
        int int17 = helpFormatter0.getDescPadding();
        java.lang.String str18 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "usage: " + "'", str18, "usage: ");
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        int int7 = helpFormatter0.findWrapPos("arg", 0, (int) ' ');
        helpFormatter0.setLeftPadding(100);
        helpFormatter0.defaultDescPad = (short) 100;
        int int12 = helpFormatter0.defaultLeftPad;
        int int13 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        int int5 = helpFormatter0.defaultWidth;
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter7 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str9 = helpFormatter7.rtrim("arg");
        helpFormatter7.setSyntaxPrefix("-");
        java.lang.String str12 = helpFormatter7.getOptPrefix();
        java.lang.String str13 = helpFormatter7.defaultSyntaxPrefix;
        int int14 = helpFormatter7.defaultWidth;
        int int15 = helpFormatter7.getLeftPadding();
        int int19 = helpFormatter7.findWrapPos("          ", (int) ' ', 10);
        int int20 = helpFormatter7.getWidth();
        int int21 = helpFormatter7.defaultLeftPad;
        java.lang.String str22 = helpFormatter7.defaultNewLine;
        org.apache.commons.cli.HelpFormatter helpFormatter23 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str25 = helpFormatter23.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter26 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str28 = helpFormatter26.rtrim("arg");
        java.lang.String str29 = helpFormatter26.defaultSyntaxPrefix;
        java.lang.String str30 = helpFormatter26.defaultOptPrefix;
        java.util.Comparator comparator31 = helpFormatter26.getOptionComparator();
        helpFormatter23.optionComparator = comparator31;
        int int36 = helpFormatter23.findWrapPos("usage: ", 3, (int) (short) 10);
        helpFormatter23.defaultArgName = "\n";
        int int39 = helpFormatter23.defaultLeftPad;
        java.util.Comparator comparator40 = helpFormatter23.optionComparator;
        helpFormatter7.optionComparator = comparator40;
        helpFormatter0.optionComparator = comparator40;
        java.lang.String str43 = helpFormatter0.getOptPrefix();
        java.util.Comparator comparator44 = helpFormatter0.getOptionComparator();
        java.io.PrintWriter printWriter45 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter45, 35, "                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 74 + "'", int20 == 74);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n" + "'", str22, "\n");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "arg" + "'", str25, "arg");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "arg" + "'", str28, "arg");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "usage: " + "'", str29, "usage: ");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-" + "'", str30, "-");
        org.junit.Assert.assertNotNull(comparator31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(comparator40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "-" + "'", str43, "-");
        org.junit.Assert.assertNotNull(comparator44);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter3 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str5 = helpFormatter3.rtrim("arg");
        java.lang.String str6 = helpFormatter3.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter3.defaultOptPrefix;
        java.util.Comparator comparator8 = helpFormatter3.getOptionComparator();
        helpFormatter0.optionComparator = comparator8;
        int int13 = helpFormatter0.findWrapPos("usage: ", 3, (int) (short) 10);
        java.util.Comparator comparator14 = helpFormatter0.getOptionComparator();
        java.lang.String str15 = helpFormatter0.defaultNewLine;
        java.lang.String str16 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLeftPadding((int) (short) 100);
        java.lang.String str19 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "--" + "'", str19, "--");
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultWidth;
        java.lang.String str6 = helpFormatter0.rtrim("-");
        java.lang.String str7 = helpFormatter0.getArgName();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultOptPrefix = "                                                                   ";
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(13, "                                   ", "                                                                   ", options15, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
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
        java.lang.String str18 = helpFormatter0.getArgName();
        java.lang.String str19 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "usage: " + "'", str18, "usage: ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-" + "'", str19, "-");
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
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
        org.apache.commons.cli.HelpFormatter helpFormatter24 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str26 = helpFormatter24.rtrim("arg");
        helpFormatter24.defaultWidth = (short) -1;
        java.lang.String str29 = helpFormatter24.defaultArgName;
        helpFormatter24.setSyntaxPrefix("arg");
        helpFormatter24.setDescPadding((int) '#');
        helpFormatter24.defaultOptPrefix = "hi!";
        java.util.Comparator comparator36 = helpFormatter24.optionComparator;
        int int37 = helpFormatter24.defaultDescPad;
        helpFormatter24.defaultArgName = "";
        org.apache.commons.cli.HelpFormatter helpFormatter40 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str42 = helpFormatter40.rtrim("arg");
        helpFormatter40.defaultOptPrefix = "--";
        helpFormatter40.setOptPrefix("-");
        helpFormatter40.setDescPadding(1);
        helpFormatter40.defaultDescPad = (short) 100;
        org.apache.commons.cli.HelpFormatter helpFormatter51 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str53 = helpFormatter51.rtrim("arg");
        java.lang.String str54 = helpFormatter51.defaultSyntaxPrefix;
        java.util.Comparator comparator55 = helpFormatter51.optionComparator;
        java.lang.String str56 = helpFormatter51.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter57 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str59 = helpFormatter57.rtrim("arg");
        helpFormatter57.defaultOptPrefix = "--";
        helpFormatter57.setOptPrefix("-");
        helpFormatter57.setDescPadding(1);
        java.util.Comparator comparator66 = helpFormatter57.getOptionComparator();
        helpFormatter51.optionComparator = comparator66;
        java.util.Comparator comparator68 = helpFormatter51.optionComparator;
        helpFormatter40.optionComparator = comparator68;
        helpFormatter40.defaultSyntaxPrefix = "--";
        helpFormatter40.defaultOptPrefix = "--";
        java.util.Comparator comparator74 = helpFormatter40.optionComparator;
        helpFormatter24.setOptionComparator(comparator74);
        helpFormatter0.setOptionComparator(comparator74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-" + "'", str19, "-");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "arg" + "'", str26, "arg");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "arg" + "'", str29, "arg");
        org.junit.Assert.assertNotNull(comparator36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "arg" + "'", str42, "arg");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "arg" + "'", str53, "arg");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "usage: " + "'", str54, "usage: ");
        org.junit.Assert.assertNotNull(comparator55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "-" + "'", str56, "-");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "arg" + "'", str59, "arg");
        org.junit.Assert.assertNotNull(comparator66);
        org.junit.Assert.assertNotNull(comparator68);
        org.junit.Assert.assertNotNull(comparator74);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str13 = helpFormatter0.rtrim("                                ");
        int int14 = helpFormatter0.defaultDescPad;
        int int15 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        int int9 = helpFormatter0.findWrapPos("-", (int) (short) 100, 74);
        helpFormatter0.setNewLine("usage: ");
        int int15 = helpFormatter0.findWrapPos("                                                    ", 45, (int) (short) 10);
        java.lang.String str16 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultOptPrefix = "             ";
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", options20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        int int6 = helpFormatter0.findWrapPos("--", (int) '#', (int) (short) 100);
        helpFormatter0.defaultLeftPad = 0;
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.setNewLine("-");
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter13, (int) (byte) 1, "                                                                                       ", "                                                    ", options17, (int) (byte) -1, 9, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:         ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setLongOptPrefix("hi!");
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultLongOptPrefix = "                                   ";
        helpFormatter0.setArgName("arg");
        helpFormatter0.defaultSyntaxPrefix = " ";
        org.apache.commons.cli.HelpFormatter helpFormatter16 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter16.defaultOptPrefix = "hi!";
        int int22 = helpFormatter16.findWrapPos("--", (int) '#', (int) (short) 100);
        helpFormatter16.setArgName("arg");
        helpFormatter16.defaultOptPrefix = "";
        java.lang.String str28 = helpFormatter16.rtrim("                                                                                                 ");
        java.lang.String str29 = helpFormatter16.getNewLine();
        int int30 = helpFormatter16.defaultDescPad;
        java.util.Comparator comparator31 = helpFormatter16.optionComparator;
        helpFormatter0.optionComparator = comparator31;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\n" + "'", str29, "\n");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(comparator31);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
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
        java.util.Comparator comparator32 = helpFormatter0.optionComparator;
        org.apache.commons.cli.Options options35 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("  ", "                                                                                       ", options35, "            ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
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
        org.junit.Assert.assertNotNull(comparator32);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.defaultArgName;
        int int10 = helpFormatter0.getWidth();
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultNewLine = "                                                                                                 ";
        java.io.PrintWriter printWriter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter14, 9, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
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
        java.io.PrintWriter printWriter31 = null;
        org.apache.commons.cli.Options options35 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter31, (int) 'a', "\n", "", options35, 100, 87, "                                                                                       ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
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
        helpFormatter0.defaultNewLine = "";
        int int23 = helpFormatter0.getLeftPadding();
        java.lang.String str24 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
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
        java.lang.String str17 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultWidth = 0;
        java.lang.String str21 = helpFormatter0.createPadding((int) (byte) 1);
        java.lang.String str22 = helpFormatter0.getNewLine();
        org.apache.commons.cli.Options options26 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) 'a', "hi!", "                                                                        ", options26, "           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " " + "'", str21, " ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n" + "'", str22, "\n");
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
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
        helpFormatter0.defaultLongOptPrefix = "           ";
        helpFormatter0.setOptPrefix("  ");
        java.lang.String str21 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "  " + "'", str21, "  ");
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.util.Comparator comparator9 = null;
        helpFormatter0.optionComparator = comparator9;
        int int14 = helpFormatter0.findWrapPos("hi!", (int) 'a', (int) (byte) -1);
        int int15 = helpFormatter0.getWidth();
        java.lang.String str16 = helpFormatter0.defaultLongOptPrefix;
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer21 = helpFormatter0.renderWrappedText(stringBuffer17, 0, (int) (short) 1, "                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuffer.append(String)\" because \"sb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
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
        helpFormatter0.setLongOptPrefix("");
        helpFormatter0.setOptPrefix("                                   ");
        java.util.Comparator comparator21 = helpFormatter0.getOptionComparator();
        int int25 = helpFormatter0.findWrapPos("                                                                   ", (int) (short) 100, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertNotNull(comparator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
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
        helpFormatter0.defaultNewLine = "                                ";
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                ", "                                                                   ", options20, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        int int9 = helpFormatter0.getLeftPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str12 = helpFormatter10.rtrim("arg");
        helpFormatter10.setSyntaxPrefix("-");
        java.lang.String str15 = helpFormatter10.getOptPrefix();
        helpFormatter10.setNewLine("");
        java.lang.String str18 = helpFormatter10.getLongOptPrefix();
        helpFormatter10.defaultLongOptPrefix = "usage: ";
        helpFormatter10.defaultDescPad = (byte) 100;
        org.apache.commons.cli.HelpFormatter helpFormatter23 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str25 = helpFormatter23.rtrim("arg");
        java.lang.String str26 = helpFormatter23.getNewLine();
        int int27 = helpFormatter23.defaultWidth;
        java.lang.String str29 = helpFormatter23.rtrim("-");
        java.lang.String str30 = helpFormatter23.getArgName();
        java.lang.String str31 = helpFormatter23.defaultNewLine;
        java.util.Comparator comparator32 = helpFormatter23.optionComparator;
        helpFormatter10.optionComparator = comparator32;
        helpFormatter0.optionComparator = comparator32;
        java.lang.StringBuffer stringBuffer35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer39 = helpFormatter0.renderWrappedText(stringBuffer35, 76, (int) 'a', "                                                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuffer.append(String)\" because \"sb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "--" + "'", str18, "--");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "arg" + "'", str25, "arg");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\n" + "'", str26, "\n");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 74 + "'", int27 == 74);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-" + "'", str29, "-");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "arg" + "'", str30, "arg");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\n" + "'", str31, "\n");
        org.junit.Assert.assertNotNull(comparator32);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        helpFormatter0.setSyntaxPrefix("\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
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
        helpFormatter0.setDescPadding(76);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter8 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter8, 52, "                                             ", options11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        helpFormatter0.defaultWidth = (byte) 0;
        helpFormatter0.defaultDescPad = (short) 0;
        helpFormatter0.setSyntaxPrefix("          ");
        helpFormatter0.defaultDescPad = (byte) -1;
        helpFormatter0.setLeftPadding((int) (short) 100);
        java.util.Comparator comparator16 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator16);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.getArgName();
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultArgName = "--";
        helpFormatter0.setLeftPadding(13);
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        helpFormatter0.setLeftPadding(0);
        helpFormatter0.setOptPrefix("\n");
        java.lang.String str10 = helpFormatter0.createPadding(52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                    " + "'", str10, "                                                    ");
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.util.Comparator comparator5 = null;
        helpFormatter0.setOptionComparator(comparator5);
        helpFormatter0.setLeftPadding((int) (short) -1);
        java.lang.String str9 = helpFormatter0.getArgName();
        int int10 = helpFormatter0.getLeftPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str13 = helpFormatter11.rtrim("arg");
        helpFormatter11.defaultOptPrefix = "--";
        java.lang.String str16 = helpFormatter11.getLongOptPrefix();
        java.lang.String str17 = helpFormatter11.getNewLine();
        java.lang.String str18 = helpFormatter11.getOptPrefix();
        helpFormatter11.defaultLeftPad = (short) 10;
        helpFormatter11.defaultOptPrefix = "arg";
        helpFormatter11.defaultLeftPad = (short) -1;
        java.util.Comparator comparator25 = helpFormatter11.optionComparator;
        helpFormatter0.setOptionComparator(comparator25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "--" + "'", str18, "--");
        org.junit.Assert.assertNotNull(comparator25);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.rtrim("--");
        int int8 = helpFormatter0.getWidth();
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setOptPrefix("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                      ", "", options14, "             ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(comparator11);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        java.lang.String str11 = helpFormatter0.defaultArgName;
        java.lang.String str12 = helpFormatter0.getNewLine();
        java.util.Comparator comparator13 = helpFormatter0.optionComparator;
        java.util.Comparator comparator14 = helpFormatter0.getOptionComparator();
        java.lang.String str15 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "usage: " + "'", str15, "usage: ");
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        java.util.Comparator comparator11 = null;
        helpFormatter0.setOptionComparator(comparator11);
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultLongOptPrefix = "                                                    ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
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
        int int30 = helpFormatter0.defaultWidth;
        java.lang.String str32 = helpFormatter0.rtrim("                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertNotNull(comparator26);
        org.junit.Assert.assertNotNull(comparator28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 74 + "'", int30 == 74);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.util.Comparator comparator9 = null;
        helpFormatter0.optionComparator = comparator9;
        int int14 = helpFormatter0.findWrapPos("hi!", (int) 'a', (int) (byte) -1);
        int int15 = helpFormatter0.getWidth();
        java.lang.String str16 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str18 = helpFormatter0.rtrim("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLongOptPrefix("hi!");
        helpFormatter0.defaultDescPad = 35;
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str13 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
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
        org.apache.commons.cli.HelpFormatter helpFormatter24 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str26 = helpFormatter24.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter27 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str29 = helpFormatter27.rtrim("arg");
        java.lang.String str30 = helpFormatter27.defaultSyntaxPrefix;
        java.lang.String str31 = helpFormatter27.defaultOptPrefix;
        java.util.Comparator comparator32 = helpFormatter27.getOptionComparator();
        helpFormatter24.optionComparator = comparator32;
        org.apache.commons.cli.HelpFormatter helpFormatter34 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str36 = helpFormatter34.rtrim("arg");
        java.lang.String str37 = helpFormatter34.defaultSyntaxPrefix;
        java.util.Comparator comparator38 = helpFormatter34.optionComparator;
        helpFormatter24.setOptionComparator(comparator38);
        helpFormatter24.setDescPadding((int) (byte) 1);
        org.apache.commons.cli.HelpFormatter helpFormatter42 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str44 = helpFormatter42.rtrim("arg");
        helpFormatter42.defaultOptPrefix = "--";
        helpFormatter42.setOptPrefix("-");
        helpFormatter42.setDescPadding(1);
        helpFormatter42.defaultDescPad = (short) 100;
        org.apache.commons.cli.HelpFormatter helpFormatter53 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str55 = helpFormatter53.rtrim("arg");
        java.lang.String str56 = helpFormatter53.defaultSyntaxPrefix;
        java.util.Comparator comparator57 = helpFormatter53.optionComparator;
        helpFormatter42.setOptionComparator(comparator57);
        helpFormatter24.optionComparator = comparator57;
        helpFormatter0.optionComparator = comparator57;
        java.lang.String str61 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-" + "'", str19, "-");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "arg" + "'", str26, "arg");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "arg" + "'", str29, "arg");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "usage: " + "'", str30, "usage: ");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-" + "'", str31, "-");
        org.junit.Assert.assertNotNull(comparator32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "arg" + "'", str36, "arg");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "usage: " + "'", str37, "usage: ");
        org.junit.Assert.assertNotNull(comparator38);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "arg" + "'", str44, "arg");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "arg" + "'", str55, "arg");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "usage: " + "'", str56, "usage: ");
        org.junit.Assert.assertNotNull(comparator57);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "--" + "'", str61, "--");
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "-";
        java.util.Comparator comparator11 = helpFormatter0.optionComparator;
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str13 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultNewLine = "--";
        int int16 = helpFormatter0.getLeftPadding();
        int int17 = helpFormatter0.defaultDescPad;
        int int18 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.setArgName("          ");
        helpFormatter0.defaultLeftPad = (byte) 1;
        helpFormatter0.setArgName("                                   ");
        java.lang.String str13 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultNewLine = "             ";
        java.lang.String str16 = helpFormatter0.defaultLongOptPrefix;
        int int17 = helpFormatter0.getWidth();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultWidth = 10;
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter13, 45, "\n", "                                                                        ", options17, (int) 'a', 2, "         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setNewLine("\n");
        java.lang.String str12 = helpFormatter0.rtrim("-");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setLeftPadding((int) '4');
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) ' ');
        helpFormatter0.defaultNewLine = "usage: ";
        helpFormatter0.setOptPrefix("hi!");
        helpFormatter0.defaultSyntaxPrefix = "-";
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                      ", options14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.rtrim("--");
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultDescPad = (short) 10;
        helpFormatter0.setLongOptPrefix("                                   ");
        helpFormatter0.defaultNewLine = "  ";
        helpFormatter0.setOptPrefix("                                                                         ");
        java.util.Comparator comparator17 = null;
        helpFormatter0.optionComparator = comparator17;
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(52, "          ", "", options22, "arg", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.String str9 = helpFormatter0.getNewLine();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = helpFormatter0.renderWrappedText(stringBuffer10, 10, 73, "                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuffer.append(String)\" because \"sb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
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
        int int25 = helpFormatter0.getWidth();
        org.apache.commons.cli.HelpFormatter helpFormatter26 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter26.defaultOptPrefix = "hi!";
        int int32 = helpFormatter26.findWrapPos("--", (int) '#', (int) (short) 100);
        java.lang.String str34 = helpFormatter26.createPadding((int) '#');
        helpFormatter26.setOptPrefix("");
        helpFormatter26.defaultArgName = "  ";
        org.apache.commons.cli.HelpFormatter helpFormatter39 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str41 = helpFormatter39.rtrim("arg");
        java.lang.String str42 = helpFormatter39.getNewLine();
        java.lang.String str43 = helpFormatter39.getOptPrefix();
        helpFormatter39.defaultOptPrefix = "arg";
        helpFormatter39.setDescPadding((int) (short) 100);
        java.util.Comparator comparator48 = helpFormatter39.getOptionComparator();
        helpFormatter26.optionComparator = comparator48;
        helpFormatter0.setOptionComparator(comparator48);
        helpFormatter0.defaultWidth = '#';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "usage: " + "'", str20, "usage: ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-" + "'", str21, "-");
        org.junit.Assert.assertNotNull(comparator22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 74 + "'", int25 == 74);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "                                   " + "'", str34, "                                   ");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "arg" + "'", str41, "arg");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\n" + "'", str42, "\n");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "-" + "'", str43, "-");
        org.junit.Assert.assertNotNull(comparator48);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "\n";
        helpFormatter0.setNewLine("                                                                         ");
        java.lang.String str10 = helpFormatter0.rtrim("\n");
        helpFormatter0.setLeftPadding(1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.defaultArgName = "                                   ";
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 1, "                                                                                      ", "                                                                   ", options13, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:         ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        int int7 = helpFormatter0.findWrapPos("arg", 0, (int) ' ');
        helpFormatter0.setLeftPadding(100);
        java.lang.String str10 = helpFormatter0.getNewLine();
        int int11 = helpFormatter0.defaultDescPad;
        helpFormatter0.setNewLine("                                                                         ");
        helpFormatter0.setLeftPadding(32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
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
        java.lang.String str23 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n" + "'", str19, "\n");
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n" + "'", str22, "\n");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n" + "'", str23, "\n");
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.setOptPrefix("--");
        java.lang.String str7 = helpFormatter0.defaultArgName;
        java.lang.String str8 = helpFormatter0.getNewLine();
        helpFormatter0.setDescPadding(0);
        helpFormatter0.setWidth((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setDescPadding(0);
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.setOptPrefix("usage:");
        java.lang.String str11 = helpFormatter0.getArgName();
        java.lang.String str12 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        int int10 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        helpFormatter0.setDescPadding(32);
        helpFormatter0.defaultNewLine = "                                   ";
        java.lang.String str17 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(52);
        helpFormatter0.setLeftPadding(35);
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(" ", options23);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "--" + "'", str17, "--");
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
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
        java.io.PrintWriter printWriter24 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter24, 13, "           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "usage: " + "'", str21, "usage: ");
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        java.lang.String str11 = helpFormatter0.defaultArgName;
        helpFormatter0.setDescPadding(87);
        helpFormatter0.defaultSyntaxPrefix = "                                ";
        java.lang.String str16 = helpFormatter0.getSyntaxPrefix();
        int int17 = helpFormatter0.getWidth();
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                        ", "                                                                        ", options20, "   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                " + "'", str16, "                                ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        int int9 = helpFormatter0.findWrapPos("-", (int) (short) 100, 74);
        helpFormatter0.setNewLine("usage: ");
        int int15 = helpFormatter0.findWrapPos("                                                    ", 45, (int) (short) 10);
        helpFormatter0.setSyntaxPrefix("hi!");
        int int18 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultWidth = 1;
        java.lang.String str11 = helpFormatter0.defaultLongOptPrefix;
        java.util.Comparator comparator12 = helpFormatter0.getOptionComparator();
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter13, (int) '#', "                                                                                                 ", options16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertNotNull(comparator12);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setDescPadding(0);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        helpFormatter0.setDescPadding((int) ' ');
        java.lang.String str14 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter15, (int) ' ', "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        helpFormatter0.defaultWidth = (byte) 0;
        helpFormatter0.defaultDescPad = (short) 0;
        helpFormatter0.defaultNewLine = "                                                                                                    ";
        helpFormatter0.defaultDescPad = 45;
        helpFormatter0.setNewLine("");
        int int16 = helpFormatter0.getDescPadding();
        java.util.Comparator comparator17 = helpFormatter0.getOptionComparator();
        helpFormatter0.setNewLine("             ");
        java.lang.String str20 = helpFormatter0.getNewLine();
        org.apache.commons.cli.HelpFormatter helpFormatter21 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str23 = helpFormatter21.rtrim("arg");
        helpFormatter21.setSyntaxPrefix("-");
        java.lang.String str26 = helpFormatter21.getOptPrefix();
        java.lang.String str27 = helpFormatter21.defaultSyntaxPrefix;
        int int28 = helpFormatter21.defaultDescPad;
        helpFormatter21.setLongOptPrefix("\n");
        helpFormatter21.defaultWidth = ' ';
        helpFormatter21.defaultLongOptPrefix = "          ";
        java.util.Comparator comparator35 = helpFormatter21.optionComparator;
        helpFormatter0.setOptionComparator(comparator35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 45 + "'", int16 == 45);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "             " + "'", str20, "             ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "arg" + "'", str23, "arg");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-" + "'", str26, "-");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-" + "'", str27, "-");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(comparator35);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("");
        int int6 = helpFormatter0.findWrapPos("", (int) (short) 1, (int) (byte) 0);
        helpFormatter0.defaultSyntaxPrefix = "                                   ";
        int int12 = helpFormatter0.findWrapPos("                                             ", (int) (short) 100, (int) (byte) 10);
        java.util.Comparator comparator13 = helpFormatter0.optionComparator;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(comparator13);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.util.Comparator comparator9 = null;
        helpFormatter0.optionComparator = comparator9;
        int int14 = helpFormatter0.findWrapPos("hi!", (int) 'a', (int) (byte) -1);
        java.lang.String str15 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator16 = helpFormatter0.optionComparator;
        java.util.Comparator comparator17 = null;
        helpFormatter0.optionComparator = comparator17;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertNull(comparator16);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        int int7 = helpFormatter0.findWrapPos("arg", 0, (int) ' ');
        helpFormatter0.setLeftPadding(100);
        helpFormatter0.defaultDescPad = (short) 100;
        int int12 = helpFormatter0.defaultLeftPad;
        java.lang.String str14 = helpFormatter0.rtrim("usage: ");
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter15, 3, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage:" + "'", str14, "usage:");
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        helpFormatter0.setDescPadding(100);
        int int10 = helpFormatter0.findWrapPos("                                                                                                    ", (int) (byte) 0, 3);
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultLongOptPrefix = "arg";
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("-", "            ", options16, "                                                                        ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(comparator11);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
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
        java.util.Comparator comparator20 = helpFormatter0.optionComparator;
        int int21 = helpFormatter0.getDescPadding();
        java.lang.String str22 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(3);
        java.lang.String str25 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultDescPad = (short) 100;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-" + "'", str19, "-");
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "usage: " + "'", str22, "usage: ");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "usage: " + "'", str25, "usage: ");
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "\n";
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 35;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.defaultLongOptPrefix;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) '4', "                    ", "           ", options15, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
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
        java.lang.String str30 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setSyntaxPrefix("hi!");
        int int33 = helpFormatter0.defaultLeftPad;
        int int37 = helpFormatter0.findWrapPos("  ", (int) '4', 20);
        helpFormatter0.defaultArgName = "                                                                                       ";
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "--" + "'", str30, "--");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.setLeftPadding((int) (byte) 100);
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
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
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.setDescPadding(21);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str9 = helpFormatter0.rtrim("hi!");
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.createPadding((int) '4');
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        helpFormatter0.setWidth(11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                    " + "'", str12, "                                                    ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
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
        org.apache.commons.cli.HelpFormatter helpFormatter29 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str31 = helpFormatter29.rtrim("arg");
        helpFormatter29.defaultWidth = (short) -1;
        java.lang.String str34 = helpFormatter29.defaultArgName;
        helpFormatter29.setSyntaxPrefix("arg");
        helpFormatter29.setSyntaxPrefix("--");
        java.util.Comparator comparator39 = helpFormatter29.optionComparator;
        helpFormatter0.setOptionComparator(comparator39);
        helpFormatter0.setArgName("");
        java.util.Comparator comparator43 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultArgName = "hi!";
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "arg" + "'", str31, "arg");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "arg" + "'", str34, "arg");
        org.junit.Assert.assertNotNull(comparator39);
        org.junit.Assert.assertNotNull(comparator43);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = (byte) 100;
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultWidth = (short) 0;
        helpFormatter0.defaultLongOptPrefix = "  ";
        helpFormatter0.defaultDescPad = (byte) 0;
        org.apache.commons.cli.HelpFormatter helpFormatter15 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str17 = helpFormatter15.rtrim("arg");
        helpFormatter15.defaultOptPrefix = "--";
        helpFormatter15.defaultArgName = "                                                                                                    ";
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
        helpFormatter15.optionComparator = comparator45;
        org.apache.commons.cli.HelpFormatter helpFormatter48 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str50 = helpFormatter48.rtrim("arg");
        java.lang.String str51 = helpFormatter48.defaultSyntaxPrefix;
        java.util.Comparator comparator52 = helpFormatter48.optionComparator;
        java.lang.String str53 = helpFormatter48.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter54 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str56 = helpFormatter54.rtrim("arg");
        helpFormatter54.defaultOptPrefix = "--";
        helpFormatter54.setOptPrefix("-");
        helpFormatter54.setDescPadding(1);
        java.util.Comparator comparator63 = helpFormatter54.getOptionComparator();
        helpFormatter48.optionComparator = comparator63;
        helpFormatter15.optionComparator = comparator63;
        helpFormatter0.optionComparator = comparator63;
        java.lang.String str67 = helpFormatter0.getArgName();
        java.lang.String str68 = helpFormatter0.getOptPrefix();
        java.io.PrintWriter printWriter69 = null;
        org.apache.commons.cli.Options options73 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter69, (int) (byte) 0, "", "          ", options73, 87, 2, "usage: ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "arg" + "'", str24, "arg");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\n" + "'", str25, "\n");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-" + "'", str26, "-");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "arg" + "'", str31, "arg");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "arg" + "'", str37, "arg");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "arg" + "'", str40, "arg");
        org.junit.Assert.assertNotNull(comparator45);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "arg" + "'", str50, "arg");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "usage: " + "'", str51, "usage: ");
        org.junit.Assert.assertNotNull(comparator52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "-" + "'", str53, "-");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "arg" + "'", str56, "arg");
        org.junit.Assert.assertNotNull(comparator63);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "usage: " + "'", str67, "usage: ");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "-" + "'", str68, "-");
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setLongOptPrefix("hi!");
        java.util.Comparator comparator14 = helpFormatter0.optionComparator;
        helpFormatter0.defaultWidth = 73;
        org.apache.commons.cli.HelpFormatter helpFormatter17 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str19 = helpFormatter17.rtrim("arg");
        helpFormatter17.defaultOptPrefix = "--";
        helpFormatter17.setOptPrefix("-");
        helpFormatter17.setDescPadding(1);
        java.lang.String str26 = helpFormatter17.defaultLongOptPrefix;
        int int27 = helpFormatter17.defaultLeftPad;
        java.lang.String str28 = helpFormatter17.getArgName();
        helpFormatter17.setLongOptPrefix("                                   ");
        org.apache.commons.cli.HelpFormatter helpFormatter31 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str33 = helpFormatter31.rtrim("arg");
        helpFormatter31.defaultWidth = (short) -1;
        java.lang.String str36 = helpFormatter31.defaultArgName;
        helpFormatter31.setSyntaxPrefix("arg");
        helpFormatter31.setSyntaxPrefix("--");
        int int41 = helpFormatter31.getDescPadding();
        int int42 = helpFormatter31.getLeftPadding();
        java.lang.String str43 = helpFormatter31.defaultNewLine;
        int int44 = helpFormatter31.defaultDescPad;
        org.apache.commons.cli.HelpFormatter helpFormatter45 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str47 = helpFormatter45.rtrim("arg");
        java.lang.String str48 = helpFormatter45.getNewLine();
        helpFormatter45.defaultArgName = "usage: ";
        int int51 = helpFormatter45.defaultWidth;
        helpFormatter45.setLongOptPrefix("hi!");
        java.util.Comparator comparator54 = helpFormatter45.optionComparator;
        helpFormatter31.setOptionComparator(comparator54);
        helpFormatter17.optionComparator = comparator54;
        helpFormatter0.optionComparator = comparator54;
        java.lang.String str59 = helpFormatter0.rtrim("                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "--" + "'", str26, "--");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "arg" + "'", str28, "arg");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "arg" + "'", str33, "arg");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "arg" + "'", str36, "arg");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\n" + "'", str43, "\n");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "arg" + "'", str47, "arg");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\n" + "'", str48, "\n");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 74 + "'", int51 == 74);
        org.junit.Assert.assertNotNull(comparator54);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        int int7 = helpFormatter0.findWrapPos("arg", 0, (int) ' ');
        int int11 = helpFormatter0.findWrapPos("          ", 1, 1);
        helpFormatter0.setLeftPadding(35);
        helpFormatter0.setOptPrefix("                                                                         ");
        helpFormatter0.setLeftPadding(20);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultArgName = "";
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setLeftPadding((int) (short) 1);
        int int10 = helpFormatter0.getWidth();
        int int14 = helpFormatter0.findWrapPos("                                                                                                 ", (int) '4', (int) '#');
        java.lang.String str16 = helpFormatter0.createPadding(9);
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("            ", options18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 15");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 87 + "'", int14 == 87);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "         " + "'", str16, "         ");
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
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
        int int18 = helpFormatter0.defaultLeftPad;
        java.lang.String str20 = helpFormatter0.createPadding(20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                    " + "'", str20, "                    ");
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultWidth;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
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
        helpFormatter0.setLeftPadding((int) ' ');
        helpFormatter0.defaultNewLine = "                                                                   ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertNotNull(comparator19);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        int int6 = helpFormatter0.findWrapPos("--", (int) '#', (int) (short) 100);
        helpFormatter0.setArgName("arg");
        helpFormatter0.defaultOptPrefix = "";
        java.lang.String str12 = helpFormatter0.rtrim("                                                                                                 ");
        int int13 = helpFormatter0.defaultWidth;
        int int17 = helpFormatter0.findWrapPos("          ", 1, 74);
        java.lang.String str18 = helpFormatter0.defaultArgName;
        java.lang.String str19 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n" + "'", str19, "\n");
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
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
        helpFormatter0.defaultArgName = "                                   ";
        java.lang.String str24 = helpFormatter0.createPadding((int) (byte) 10);
        int int25 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "          " + "'", str24, "          ");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        java.lang.String str4 = helpFormatter0.defaultSyntaxPrefix;
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = 35;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str9 = helpFormatter0.rtrim("hi!");
        helpFormatter0.setWidth(10);
        java.lang.String str12 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultOptPrefix = "                                ";
        helpFormatter0.setLeftPadding(100);
        java.io.PrintWriter printWriter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter17, 100, (-1), "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth(74);
        helpFormatter0.setDescPadding(13);
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter10, (int) '#', "  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setDescPadding(0);
        java.lang.String str8 = helpFormatter0.getNewLine();
        int int9 = helpFormatter0.defaultDescPad;
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter10, 73, "                                                                        ", "                                                                         ", options14, 13, (int) '#', "           ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        helpFormatter0.defaultWidth = (byte) 0;
        helpFormatter0.defaultDescPad = (short) 0;
        int int10 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (byte) 100);
        helpFormatter0.setSyntaxPrefix("          ");
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter15, (int) (byte) 10, "                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:            ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultDescPad = (byte) 0;
        helpFormatter0.setArgName(" ");
        helpFormatter0.setOptPrefix("                                                                                                    ");
        helpFormatter0.defaultLeftPad = (short) 1;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.util.Comparator comparator5 = null;
        helpFormatter0.setOptionComparator(comparator5);
        java.lang.String str7 = helpFormatter0.defaultArgName;
        helpFormatter0.setWidth((int) (short) 10);
        int int10 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLeftPad = (byte) -1;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                 ";
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                   ", options16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.rtrim("--");
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultOptPrefix = "";
        helpFormatter0.defaultArgName = "                                ";
        helpFormatter0.defaultArgName = "-";
        int int15 = helpFormatter0.getDescPadding();
        helpFormatter0.setWidth((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth(74);
        helpFormatter0.defaultLeftPad = 3;
        helpFormatter0.defaultSyntaxPrefix = "                                                                        ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        java.lang.String str11 = helpFormatter0.createPadding(1);
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultDescPad = 100;
        java.lang.String str15 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter16, 1, options18, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " " + "'", str11, " ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter3 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str5 = helpFormatter3.rtrim("arg");
        java.lang.String str6 = helpFormatter3.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter3.defaultOptPrefix;
        java.util.Comparator comparator8 = helpFormatter3.getOptionComparator();
        helpFormatter0.optionComparator = comparator8;
        int int13 = helpFormatter0.findWrapPos("usage: ", 3, (int) (short) 10);
        java.util.Comparator comparator14 = helpFormatter0.getOptionComparator();
        java.lang.String str15 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultSyntaxPrefix = "                                                                                       ";
        java.io.PrintWriter printWriter18 = null;
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter18, 52, "", "                    ", options22, (int) (short) 1, 67, "-", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
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
        helpFormatter0.setNewLine("          ");
        int int20 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "          " + "'", str15, "          ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 74 + "'", int20 == 74);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultOptPrefix = "arg";
        helpFormatter0.setDescPadding((int) (short) 100);
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultArgName = "                                                                                                 ";
        helpFormatter0.setLeftPadding(86);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultOptPrefix = "arg";
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.setWidth((int) (byte) 10);
        java.lang.String str11 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.defaultNewLine = "usage: ";
        int int12 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str15 = helpFormatter13.rtrim("arg");
        helpFormatter13.defaultWidth = (short) -1;
        helpFormatter13.defaultOptPrefix = "--";
        int int20 = helpFormatter13.getWidth();
        helpFormatter13.setSyntaxPrefix("                                   ");
        int int23 = helpFormatter13.getDescPadding();
        java.lang.String str24 = helpFormatter13.defaultNewLine;
        int int25 = helpFormatter13.defaultLeftPad;
        org.apache.commons.cli.HelpFormatter helpFormatter26 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str28 = helpFormatter26.rtrim("arg");
        java.lang.String str29 = helpFormatter26.defaultSyntaxPrefix;
        java.util.Comparator comparator30 = helpFormatter26.optionComparator;
        helpFormatter26.defaultSyntaxPrefix = "\n";
        int int33 = helpFormatter26.defaultLeftPad;
        java.lang.String str34 = helpFormatter26.defaultSyntaxPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter35 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str37 = helpFormatter35.rtrim("arg");
        java.lang.String str38 = helpFormatter35.getNewLine();
        java.lang.String str39 = helpFormatter35.getOptPrefix();
        helpFormatter35.setNewLine("usage: ");
        helpFormatter35.setWidth(3);
        java.lang.String str44 = helpFormatter35.defaultArgName;
        int int45 = helpFormatter35.defaultWidth;
        helpFormatter35.setLongOptPrefix("usage: ");
        org.apache.commons.cli.HelpFormatter helpFormatter48 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str50 = helpFormatter48.rtrim("arg");
        helpFormatter48.defaultWidth = (short) -1;
        java.lang.String str53 = helpFormatter48.defaultArgName;
        helpFormatter48.setSyntaxPrefix("arg");
        helpFormatter48.setSyntaxPrefix("--");
        java.util.Comparator comparator58 = helpFormatter48.optionComparator;
        helpFormatter35.optionComparator = comparator58;
        helpFormatter26.optionComparator = comparator58;
        helpFormatter13.optionComparator = comparator58;
        helpFormatter0.optionComparator = comparator58;
        org.apache.commons.cli.Options options65 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", "           ", options65, "                                                                          ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\n" + "'", str24, "\n");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "arg" + "'", str28, "arg");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "usage: " + "'", str29, "usage: ");
        org.junit.Assert.assertNotNull(comparator30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\n" + "'", str34, "\n");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "arg" + "'", str37, "arg");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\n" + "'", str38, "\n");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "-" + "'", str39, "-");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "arg" + "'", str44, "arg");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "arg" + "'", str50, "arg");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "arg" + "'", str53, "arg");
        org.junit.Assert.assertNotNull(comparator58);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
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
        java.lang.String str22 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultDescPad = 9;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "usage: " + "'", str22, "usage: ");
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = (byte) 100;
        int int8 = helpFormatter0.getDescPadding();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
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
        java.lang.String str17 = helpFormatter0.getLongOptPrefix();
        int int18 = helpFormatter0.defaultDescPad;
        helpFormatter0.setOptPrefix("          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage: " + "'", str17, "usage: ");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultArgName = "                                                                                                    ";
        helpFormatter0.setArgName("");
        helpFormatter0.setWidth((int) (byte) 1);
        helpFormatter0.setNewLine("");
        java.lang.String str13 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = '4';
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.setDescPadding((int) (short) 100);
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        java.lang.String str11 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
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
        java.util.Comparator comparator32 = helpFormatter0.getOptionComparator();
        java.util.Comparator comparator33 = helpFormatter0.optionComparator;
        int int34 = helpFormatter0.getWidth();
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
        org.junit.Assert.assertNotNull(comparator32);
        org.junit.Assert.assertNotNull(comparator33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 74 + "'", int34 == 74);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding((int) ' ');
        helpFormatter0.defaultSyntaxPrefix = " ";
        helpFormatter0.setDescPadding((int) 'a');
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter16, 32, "                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultSyntaxPrefix = "\n";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultNewLine = "                                                                          ";
        int int13 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultNewLine = "arg";
        helpFormatter0.defaultWidth = 2;
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        int int6 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        int int9 = helpFormatter0.findWrapPos("-", (int) (short) 100, 74);
        helpFormatter0.setNewLine("usage: ");
        int int15 = helpFormatter0.findWrapPos("                                                    ", 45, (int) (short) 10);
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.setArgName("--");
        helpFormatter0.setArgName("\n");
        helpFormatter0.defaultNewLine = "           ";
        helpFormatter0.setOptPrefix("                                                                   ");
        int int26 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultOptPrefix = "\n";
        int int17 = helpFormatter0.findWrapPos("                                                                          ", (int) (byte) -1, 73);
        helpFormatter0.defaultNewLine = "-";
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        helpFormatter0.setDescPadding((int) (short) 0);
        org.apache.commons.cli.HelpFormatter helpFormatter24 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str26 = helpFormatter24.rtrim("arg");
        helpFormatter24.defaultOptPrefix = "--";
        java.lang.String str29 = helpFormatter24.getLongOptPrefix();
        java.lang.String str30 = helpFormatter24.getSyntaxPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter31 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str33 = helpFormatter31.rtrim("arg");
        java.lang.String str34 = helpFormatter31.defaultSyntaxPrefix;
        int int35 = helpFormatter31.defaultDescPad;
        helpFormatter31.setLeftPadding((int) ' ');
        java.util.Comparator comparator38 = helpFormatter31.getOptionComparator();
        helpFormatter24.setOptionComparator(comparator38);
        helpFormatter0.setOptionComparator(comparator38);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 72 + "'", int17 == 72);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "arg" + "'", str26, "arg");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "--" + "'", str29, "--");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "usage: " + "'", str30, "usage: ");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "arg" + "'", str33, "arg");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "usage: " + "'", str34, "usage: ");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNotNull(comparator38);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultArgName = "                                                    ";
        helpFormatter0.defaultLeftPad = (-1);
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = helpFormatter0.renderWrappedText(stringBuffer14, 52, 100, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuffer.append(String)\" because \"sb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        int int5 = helpFormatter0.defaultWidth;
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        int int7 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultSyntaxPrefix = "                                                                        ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        int int5 = helpFormatter0.getLeftPadding();
        java.lang.String str6 = helpFormatter0.getArgName();
        helpFormatter0.defaultOptPrefix = "                                   ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.setArgName("          ");
        helpFormatter0.defaultLeftPad = (byte) 1;
        helpFormatter0.setArgName("                                   ");
        java.lang.String str13 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultNewLine = "             ";
        int int16 = helpFormatter0.getDescPadding();
        helpFormatter0.setLongOptPrefix("                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        helpFormatter0.defaultWidth = (byte) 0;
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultOptPrefix = "         ";
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", options12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:         ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
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
        java.lang.String str17 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultArgName = "                                                                                                    ";
        helpFormatter0.defaultLongOptPrefix = "  ";
        helpFormatter0.setOptPrefix("           ");
        int int14 = helpFormatter0.findWrapPos("", 10, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.util.Comparator comparator5 = null;
        helpFormatter0.setOptionComparator(comparator5);
        helpFormatter0.defaultNewLine = "                                                                            ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding((int) ' ');
        java.util.Comparator comparator12 = helpFormatter0.getOptionComparator();
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                   ", options14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:         ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertNotNull(comparator12);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        int int5 = helpFormatter0.defaultWidth;
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter7 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str9 = helpFormatter7.rtrim("arg");
        helpFormatter7.setSyntaxPrefix("-");
        java.lang.String str12 = helpFormatter7.getOptPrefix();
        java.lang.String str13 = helpFormatter7.defaultSyntaxPrefix;
        int int14 = helpFormatter7.defaultWidth;
        int int15 = helpFormatter7.getLeftPadding();
        int int19 = helpFormatter7.findWrapPos("          ", (int) ' ', 10);
        int int20 = helpFormatter7.getWidth();
        int int21 = helpFormatter7.defaultLeftPad;
        java.lang.String str22 = helpFormatter7.defaultNewLine;
        org.apache.commons.cli.HelpFormatter helpFormatter23 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str25 = helpFormatter23.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter26 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str28 = helpFormatter26.rtrim("arg");
        java.lang.String str29 = helpFormatter26.defaultSyntaxPrefix;
        java.lang.String str30 = helpFormatter26.defaultOptPrefix;
        java.util.Comparator comparator31 = helpFormatter26.getOptionComparator();
        helpFormatter23.optionComparator = comparator31;
        int int36 = helpFormatter23.findWrapPos("usage: ", 3, (int) (short) 10);
        helpFormatter23.defaultArgName = "\n";
        int int39 = helpFormatter23.defaultLeftPad;
        java.util.Comparator comparator40 = helpFormatter23.optionComparator;
        helpFormatter7.optionComparator = comparator40;
        helpFormatter0.optionComparator = comparator40;
        java.lang.String str43 = helpFormatter0.getOptPrefix();
        java.util.Comparator comparator44 = helpFormatter0.getOptionComparator();
        org.apache.commons.cli.HelpFormatter helpFormatter45 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str47 = helpFormatter45.rtrim("arg");
        java.lang.String str48 = helpFormatter45.defaultSyntaxPrefix;
        java.util.Comparator comparator49 = helpFormatter45.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator49);
        helpFormatter0.defaultNewLine = "  ";
        helpFormatter0.setLeftPadding((int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 74 + "'", int20 == 74);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n" + "'", str22, "\n");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "arg" + "'", str25, "arg");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "arg" + "'", str28, "arg");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "usage: " + "'", str29, "usage: ");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-" + "'", str30, "-");
        org.junit.Assert.assertNotNull(comparator31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(comparator40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "-" + "'", str43, "-");
        org.junit.Assert.assertNotNull(comparator44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "arg" + "'", str47, "arg");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "usage: " + "'", str48, "usage: ");
        org.junit.Assert.assertNotNull(comparator49);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.util.Comparator comparator9 = null;
        helpFormatter0.optionComparator = comparator9;
        java.lang.String str11 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = (short) 0;
        int int14 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultArgName = "         ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.rtrim("--");
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultOptPrefix = "";
        helpFormatter0.defaultArgName = "                                ";
        java.lang.String str13 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                " + "'", str13, "                                ");
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "-";
        java.util.Comparator comparator11 = helpFormatter0.optionComparator;
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str13 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str15 = helpFormatter0.createPadding(0);
        helpFormatter0.defaultOptPrefix = "usage:";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultSyntaxPrefix = "\n";
        helpFormatter0.defaultOptPrefix = "   ";
        helpFormatter0.setArgName("                                                                          ");
        helpFormatter0.setNewLine("                                                    ");
        int int13 = helpFormatter0.findWrapPos("", 67, 74);
        int int14 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = (byte) 100;
        java.lang.String str8 = helpFormatter0.getArgName();
        helpFormatter0.setNewLine("-");
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(76, "         ", "                                                                                       ", options14, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        int int3 = helpFormatter0.getLeftPadding();
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setNewLine("                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
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
        int int16 = helpFormatter0.defaultLeftPad;
        int int17 = helpFormatter0.getLeftPadding();
        java.lang.String str18 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "--" + "'", str18, "--");
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = (byte) 100;
        java.lang.String str8 = helpFormatter0.getArgName();
        helpFormatter0.setNewLine("-");
        int int11 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth(87);
        java.lang.String str14 = helpFormatter0.getOptPrefix();
        int int15 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        helpFormatter0.defaultLeftPad = (byte) 1;
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.util.Comparator comparator13 = helpFormatter0.optionComparator;
        java.lang.String str14 = helpFormatter0.getArgName();
        java.lang.String str16 = helpFormatter0.createPadding((int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                                 " + "'", str16, "                                                                                                 ");
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setWidth((int) (short) 10);
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter11, (int) (byte) -1, "            ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 19");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.setSyntaxPrefix("                                   ");
        helpFormatter0.setLeftPadding((-1));
        helpFormatter0.defaultNewLine = "  ";
        int int14 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
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
        helpFormatter0.defaultDescPad = 67;
        java.lang.String str22 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                                                         " + "'", str19, "                                                                         ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "arg" + "'", str22, "arg");
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.defaultNewLine = "-";
        java.lang.String str12 = helpFormatter0.defaultLongOptPrefix;
        java.util.Comparator comparator13 = helpFormatter0.getOptionComparator();
        helpFormatter0.setNewLine("   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertNotNull(comparator13);
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) ' ');
        java.util.Comparator comparator7 = helpFormatter0.getOptionComparator();
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", options9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(comparator7);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = (byte) 100;
        int int8 = helpFormatter0.getDescPadding();
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "   ";
        helpFormatter0.defaultSyntaxPrefix = "  ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        int int10 = helpFormatter0.getDescPadding();
        java.lang.String str11 = helpFormatter0.getArgName();
        int int12 = helpFormatter0.getDescPadding();
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        int int14 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        helpFormatter0.defaultWidth = (byte) 0;
        helpFormatter0.defaultDescPad = (short) 0;
        int int13 = helpFormatter0.findWrapPos("\n", (int) (short) 0, (int) (short) 100);
        java.lang.String str14 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setSyntaxPrefix("                                   ");
        helpFormatter0.setNewLine(" ");
        org.apache.commons.cli.HelpFormatter helpFormatter19 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str21 = helpFormatter19.rtrim("arg");
        helpFormatter19.defaultOptPrefix = "--";
        helpFormatter19.setOptPrefix("-");
        helpFormatter19.setDescPadding(1);
        helpFormatter19.setDescPadding(0);
        java.lang.String str30 = helpFormatter19.defaultNewLine;
        java.lang.String str31 = helpFormatter19.getArgName();
        helpFormatter19.defaultWidth = (short) 100;
        org.apache.commons.cli.HelpFormatter helpFormatter34 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str36 = helpFormatter34.rtrim("arg");
        helpFormatter34.defaultOptPrefix = "--";
        helpFormatter34.setOptPrefix("-");
        int int44 = helpFormatter34.findWrapPos("", (int) (byte) 100, (int) (short) 0);
        int int45 = helpFormatter34.defaultLeftPad;
        helpFormatter34.defaultDescPad = (short) 1;
        java.lang.String str48 = helpFormatter34.getLongOptPrefix();
        helpFormatter34.setArgName("                                   ");
        java.lang.String str52 = helpFormatter34.createPadding(12);
        java.util.Comparator comparator53 = helpFormatter34.optionComparator;
        helpFormatter19.setOptionComparator(comparator53);
        helpFormatter0.setOptionComparator(comparator53);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\n" + "'", str30, "\n");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "arg" + "'", str31, "arg");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "arg" + "'", str36, "arg");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "--" + "'", str48, "--");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "            " + "'", str52, "            ");
        org.junit.Assert.assertNotNull(comparator53);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultSyntaxPrefix = "\n";
        java.lang.String str4 = helpFormatter0.defaultNewLine;
        int int8 = helpFormatter0.findWrapPos("           ", 0, (int) (byte) 1);
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("           ", options10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setLongOptPrefix("\n");
        int int10 = helpFormatter0.findWrapPos("          ", 0, (int) 'a');
        java.util.Comparator comparator11 = helpFormatter0.optionComparator;
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        int int13 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
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
        java.lang.String str17 = helpFormatter0.getLongOptPrefix();
        java.lang.String str18 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage: " + "'", str17, "usage: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        int int10 = helpFormatter0.getDescPadding();
        java.lang.String str12 = helpFormatter0.rtrim("");
        java.lang.String str14 = helpFormatter0.rtrim("                                   ");
        java.util.Comparator comparator15 = helpFormatter0.getOptionComparator();
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str18 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultLongOptPrefix = "          ";
        helpFormatter0.defaultLongOptPrefix = "hi!";
        java.lang.StringBuffer stringBuffer23 = null;
        org.apache.commons.cli.Options options25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer28 = helpFormatter0.renderOptions(stringBuffer23, (int) '#', options25, 74, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
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
        helpFormatter0.defaultWidth = 100;
        int int16 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultOptPrefix = "   ";
        helpFormatter0.setOptPrefix("                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
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
        helpFormatter0.defaultLongOptPrefix = "\n";
        java.lang.String str18 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setSyntaxPrefix("                                ");
        java.lang.String str21 = helpFormatter0.defaultArgName;
        int int25 = helpFormatter0.findWrapPos("usage: ", 74, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "usage: " + "'", str18, "usage: ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
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
        int int14 = helpFormatter0.getDescPadding();
        java.util.Comparator comparator15 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultWidth = 76;
        helpFormatter0.defaultArgName = "usage: ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(comparator15);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        int int7 = helpFormatter0.findWrapPos("arg", 0, (int) ' ');
        helpFormatter0.setLeftPadding(100);
        helpFormatter0.defaultDescPad = (short) 100;
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter13, (int) (short) -1, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 9");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultNewLine = "arg";
        helpFormatter0.setNewLine("\n");
        java.lang.String str10 = helpFormatter0.createPadding(74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                          " + "'", str10, "                                                                          ");
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        int int5 = helpFormatter0.defaultWidth;
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter7 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str9 = helpFormatter7.rtrim("arg");
        helpFormatter7.setSyntaxPrefix("-");
        java.lang.String str12 = helpFormatter7.getOptPrefix();
        java.lang.String str13 = helpFormatter7.defaultSyntaxPrefix;
        int int14 = helpFormatter7.defaultWidth;
        int int15 = helpFormatter7.getLeftPadding();
        int int19 = helpFormatter7.findWrapPos("          ", (int) ' ', 10);
        int int20 = helpFormatter7.getWidth();
        int int21 = helpFormatter7.defaultLeftPad;
        java.lang.String str22 = helpFormatter7.defaultNewLine;
        org.apache.commons.cli.HelpFormatter helpFormatter23 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str25 = helpFormatter23.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter26 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str28 = helpFormatter26.rtrim("arg");
        java.lang.String str29 = helpFormatter26.defaultSyntaxPrefix;
        java.lang.String str30 = helpFormatter26.defaultOptPrefix;
        java.util.Comparator comparator31 = helpFormatter26.getOptionComparator();
        helpFormatter23.optionComparator = comparator31;
        int int36 = helpFormatter23.findWrapPos("usage: ", 3, (int) (short) 10);
        helpFormatter23.defaultArgName = "\n";
        int int39 = helpFormatter23.defaultLeftPad;
        java.util.Comparator comparator40 = helpFormatter23.optionComparator;
        helpFormatter7.optionComparator = comparator40;
        helpFormatter0.optionComparator = comparator40;
        java.lang.String str43 = helpFormatter0.getOptPrefix();
        java.util.Comparator comparator44 = helpFormatter0.getOptionComparator();
        org.apache.commons.cli.HelpFormatter helpFormatter45 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str47 = helpFormatter45.rtrim("arg");
        java.lang.String str48 = helpFormatter45.defaultSyntaxPrefix;
        java.util.Comparator comparator49 = helpFormatter45.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator49);
        helpFormatter0.defaultNewLine = "  ";
        helpFormatter0.defaultSyntaxPrefix = "            ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 74 + "'", int20 == 74);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n" + "'", str22, "\n");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "arg" + "'", str25, "arg");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "arg" + "'", str28, "arg");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "usage: " + "'", str29, "usage: ");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-" + "'", str30, "-");
        org.junit.Assert.assertNotNull(comparator31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(comparator40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "-" + "'", str43, "-");
        org.junit.Assert.assertNotNull(comparator44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "arg" + "'", str47, "arg");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "usage: " + "'", str48, "usage: ");
        org.junit.Assert.assertNotNull(comparator49);
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix("hi!");
        int int9 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultDescPad = (byte) 10;
        java.lang.String str13 = helpFormatter0.createPadding(2);
        helpFormatter0.defaultWidth = 13;
        helpFormatter0.setDescPadding(52);
        java.io.PrintWriter printWriter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter18, (int) (byte) -1, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 8");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "  " + "'", str13, "  ");
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix("hi!");
        int int9 = helpFormatter0.defaultDescPad;
        java.lang.String str10 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth(74);
        helpFormatter0.setArgName("-");
        helpFormatter0.defaultNewLine = "   ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        int int10 = helpFormatter0.getDescPadding();
        java.lang.String str11 = helpFormatter0.getArgName();
        int int12 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix("hi!");
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter15, (int) (short) 0, 9, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:          ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.setDescPadding((int) (short) 100);
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setOptPrefix("--");
        java.lang.String str13 = helpFormatter0.defaultArgName;
        java.lang.String str14 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultLeftPad = (short) 10;
        helpFormatter0.defaultOptPrefix = "          ";
        int int12 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultDescPad = 76;
        helpFormatter0.defaultLongOptPrefix = "                                ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        java.lang.String str8 = helpFormatter0.getNewLine();
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str11 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "          ";
        int int14 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "                                                                                                    ";
        int int17 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", "   ", options20, "             ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 13");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
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
        helpFormatter0.defaultDescPad = 100;
        helpFormatter0.setSyntaxPrefix(" ");
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", options19);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:         ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
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
        helpFormatter0.setSyntaxPrefix("                                ");
        org.apache.commons.cli.HelpFormatter helpFormatter28 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str30 = helpFormatter28.rtrim("arg");
        helpFormatter28.defaultWidth = (short) -1;
        helpFormatter28.defaultOptPrefix = "--";
        int int35 = helpFormatter28.getWidth();
        helpFormatter28.setSyntaxPrefix("                                   ");
        int int38 = helpFormatter28.getDescPadding();
        java.lang.String str39 = helpFormatter28.defaultNewLine;
        int int40 = helpFormatter28.defaultLeftPad;
        org.apache.commons.cli.HelpFormatter helpFormatter41 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str43 = helpFormatter41.rtrim("arg");
        java.lang.String str44 = helpFormatter41.defaultSyntaxPrefix;
        java.util.Comparator comparator45 = helpFormatter41.optionComparator;
        helpFormatter41.defaultSyntaxPrefix = "\n";
        int int48 = helpFormatter41.defaultLeftPad;
        java.lang.String str49 = helpFormatter41.defaultSyntaxPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter50 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str52 = helpFormatter50.rtrim("arg");
        java.lang.String str53 = helpFormatter50.getNewLine();
        java.lang.String str54 = helpFormatter50.getOptPrefix();
        helpFormatter50.setNewLine("usage: ");
        helpFormatter50.setWidth(3);
        java.lang.String str59 = helpFormatter50.defaultArgName;
        int int60 = helpFormatter50.defaultWidth;
        helpFormatter50.setLongOptPrefix("usage: ");
        org.apache.commons.cli.HelpFormatter helpFormatter63 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str65 = helpFormatter63.rtrim("arg");
        helpFormatter63.defaultWidth = (short) -1;
        java.lang.String str68 = helpFormatter63.defaultArgName;
        helpFormatter63.setSyntaxPrefix("arg");
        helpFormatter63.setSyntaxPrefix("--");
        java.util.Comparator comparator73 = helpFormatter63.optionComparator;
        helpFormatter50.optionComparator = comparator73;
        helpFormatter41.optionComparator = comparator73;
        helpFormatter28.optionComparator = comparator73;
        helpFormatter0.optionComparator = comparator73;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "arg" + "'", str30, "arg");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\n" + "'", str39, "\n");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "arg" + "'", str43, "arg");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "usage: " + "'", str44, "usage: ");
        org.junit.Assert.assertNotNull(comparator45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\n" + "'", str49, "\n");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "arg" + "'", str52, "arg");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\n" + "'", str53, "\n");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "-" + "'", str54, "-");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "arg" + "'", str59, "arg");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 3 + "'", int60 == 3);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "arg" + "'", str65, "arg");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "arg" + "'", str68, "arg");
        org.junit.Assert.assertNotNull(comparator73);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultArgName = "\n";
        helpFormatter0.setOptPrefix("hi!");
        helpFormatter0.setWidth(0);
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLeftPadding(3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = (byte) 100;
        java.lang.String str8 = helpFormatter0.getArgName();
        helpFormatter0.setNewLine("-");
        int int11 = helpFormatter0.getLeftPadding();
        java.lang.String str13 = helpFormatter0.createPadding((int) 'a');
        java.lang.String str14 = helpFormatter0.getNewLine();
        helpFormatter0.defaultDescPad = 11;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                                                                                 " + "'", str13, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
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
        helpFormatter0.setNewLine("                                                                                                 ");
        int int19 = helpFormatter0.getWidth();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 74 + "'", int19 == 74);
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultNewLine = "arg";
        helpFormatter0.setWidth((int) (byte) -1);
        java.lang.String str10 = helpFormatter0.createPadding((int) (short) 10);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.util.Comparator comparator12 = helpFormatter0.optionComparator;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "          " + "'", str10, "          ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertNotNull(comparator12);
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultLeftPad = (short) 10;
        helpFormatter0.defaultOptPrefix = "arg";
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter13.defaultOptPrefix = "hi!";
        helpFormatter13.setNewLine("\n");
        int int18 = helpFormatter13.getDescPadding();
        helpFormatter13.setDescPadding(0);
        java.lang.String str21 = helpFormatter13.getNewLine();
        org.apache.commons.cli.HelpFormatter helpFormatter22 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str24 = helpFormatter22.rtrim("arg");
        helpFormatter22.defaultOptPrefix = "--";
        int int27 = helpFormatter22.getLeftPadding();
        helpFormatter22.setWidth(74);
        org.apache.commons.cli.HelpFormatter helpFormatter30 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str32 = helpFormatter30.rtrim("arg");
        java.lang.String str33 = helpFormatter30.defaultSyntaxPrefix;
        java.lang.String str34 = helpFormatter30.defaultOptPrefix;
        java.util.Comparator comparator35 = helpFormatter30.getOptionComparator();
        helpFormatter22.optionComparator = comparator35;
        helpFormatter13.setOptionComparator(comparator35);
        helpFormatter0.setOptionComparator(comparator35);
        helpFormatter0.defaultDescPad = 74;
        int int41 = helpFormatter0.defaultDescPad;
        java.lang.String str42 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n" + "'", str21, "\n");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "arg" + "'", str24, "arg");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "arg" + "'", str32, "arg");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "usage: " + "'", str33, "usage: ");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-" + "'", str34, "-");
        org.junit.Assert.assertNotNull(comparator35);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 74 + "'", int41 == 74);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "--" + "'", str42, "--");
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.util.Comparator comparator9 = null;
        helpFormatter0.optionComparator = comparator9;
        int int14 = helpFormatter0.findWrapPos("hi!", (int) 'a', (int) (byte) -1);
        int int15 = helpFormatter0.getWidth();
        java.lang.String str16 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str17 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultDescPad = (short) 100;
        java.util.Comparator comparator11 = helpFormatter0.optionComparator;
        java.lang.String str13 = helpFormatter0.createPadding((int) (byte) 1);
        java.lang.String str15 = helpFormatter0.createPadding(73);
        java.lang.String str16 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " " + "'", str13, " ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                                                         " + "'", str15, "                                                                         ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        int int10 = helpFormatter0.getDescPadding();
        java.lang.String str12 = helpFormatter0.rtrim("");
        java.lang.String str14 = helpFormatter0.rtrim("                                   ");
        java.util.Comparator comparator15 = helpFormatter0.getOptionComparator();
        java.lang.String str17 = helpFormatter0.rtrim("hi!");
        java.lang.String str18 = helpFormatter0.defaultArgName;
        helpFormatter0.setLeftPadding(10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        int int6 = helpFormatter0.findWrapPos("--", (int) '#', (int) (short) 100);
        java.lang.String str8 = helpFormatter0.createPadding((int) '#');
        helpFormatter0.setOptPrefix("");
        java.lang.String str12 = helpFormatter0.rtrim("usage: ");
        helpFormatter0.defaultSyntaxPrefix = "-";
        helpFormatter0.setWidth(73);
        java.lang.String str17 = helpFormatter0.getSyntaxPrefix();
        int int18 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                   " + "'", str8, "                                   ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage:" + "'", str12, "usage:");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setDescPadding(0);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "-";
        helpFormatter0.setLongOptPrefix("");
        helpFormatter0.setLeftPadding((int) 'a');
        helpFormatter0.setLeftPadding((-1));
        int int21 = helpFormatter0.getDescPadding();
        helpFormatter0.setWidth((int) (short) 0);
        helpFormatter0.defaultSyntaxPrefix = "usage:";
        java.util.Comparator comparator26 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter27 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str29 = helpFormatter27.rtrim("arg");
        java.lang.String str30 = helpFormatter27.defaultSyntaxPrefix;
        java.util.Comparator comparator31 = helpFormatter27.optionComparator;
        java.lang.String str32 = helpFormatter27.getOptPrefix();
        helpFormatter27.setDescPadding((int) (short) -1);
        helpFormatter27.defaultLeftPad = 'a';
        org.apache.commons.cli.HelpFormatter helpFormatter37 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str39 = helpFormatter37.rtrim("arg");
        helpFormatter37.defaultWidth = (short) -1;
        java.lang.String str42 = helpFormatter37.defaultArgName;
        helpFormatter37.setSyntaxPrefix("arg");
        helpFormatter37.setDescPadding((int) '#');
        helpFormatter37.defaultNewLine = "-";
        java.lang.String str49 = helpFormatter37.defaultLongOptPrefix;
        java.util.Comparator comparator50 = helpFormatter37.getOptionComparator();
        helpFormatter27.optionComparator = comparator50;
        helpFormatter0.optionComparator = comparator50;
        java.lang.String str53 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(comparator26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "arg" + "'", str29, "arg");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "usage: " + "'", str30, "usage: ");
        org.junit.Assert.assertNotNull(comparator31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-" + "'", str32, "-");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "arg" + "'", str39, "arg");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "arg" + "'", str42, "arg");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "--" + "'", str49, "--");
        org.junit.Assert.assertNotNull(comparator50);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "arg" + "'", str53, "arg");
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        int int10 = helpFormatter0.getDescPadding();
        java.lang.String str12 = helpFormatter0.rtrim("");
        java.lang.String str14 = helpFormatter0.rtrim("                                   ");
        java.util.Comparator comparator15 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultWidth = 67;
        java.io.PrintWriter printWriter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter18, (int) (byte) 10, "                                                                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(comparator15);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "-";
        helpFormatter0.defaultLeftPad = 12;
        helpFormatter0.setDescPadding(45);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
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
        java.util.Comparator comparator20 = helpFormatter0.optionComparator;
        int int21 = helpFormatter0.getDescPadding();
        java.lang.String str22 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator23 = helpFormatter0.optionComparator;
        java.io.PrintWriter printWriter24 = null;
        org.apache.commons.cli.Options options28 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter24, 3, "                                   ", "arg", options28, 2, 0, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:         ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-" + "'", str19, "-");
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "usage: " + "'", str22, "usage: ");
        org.junit.Assert.assertNotNull(comparator23);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str8 = helpFormatter0.createPadding(3);
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = helpFormatter0.renderOptions(stringBuffer9, 2, options11, 20, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "   " + "'", str8, "   ");
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        helpFormatter0.defaultWidth = (byte) 0;
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultOptPrefix = "         ";
        helpFormatter0.setDescPadding(0);
        helpFormatter0.setWidth((int) (short) 100);
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(52, "                                                                            ", "arg", options18, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setDescPadding(0);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultWidth = (-1);
        helpFormatter0.setLeftPadding(10);
        helpFormatter0.setDescPadding((int) (byte) 1);
        org.apache.commons.cli.HelpFormatter helpFormatter18 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str20 = helpFormatter18.rtrim("arg");
        java.lang.String str21 = helpFormatter18.getNewLine();
        java.lang.String str22 = helpFormatter18.getOptPrefix();
        helpFormatter18.defaultOptPrefix = "arg";
        helpFormatter18.defaultOptPrefix = "arg";
        int int27 = helpFormatter18.defaultWidth;
        java.util.Comparator comparator28 = helpFormatter18.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator28);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "arg" + "'", str20, "arg");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n" + "'", str21, "\n");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-" + "'", str22, "-");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 74 + "'", int27 == 74);
        org.junit.Assert.assertNotNull(comparator28);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
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
        java.lang.String str15 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultWidth;
        java.lang.String str6 = helpFormatter0.rtrim("-");
        java.lang.String str7 = helpFormatter0.getArgName();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.setOptPrefix("                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
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
        java.lang.String str32 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-" + "'", str26, "-");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\n" + "'", str32, "\n");
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        java.lang.String str4 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("                                   ");
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                        ", "                                                                        ", options9, "                                                                            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setOptPrefix("                                   ");
        helpFormatter0.setLongOptPrefix("                                                                   ");
        helpFormatter0.setArgName("");
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 1, "                                   ", "usage: ", options12, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:         ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.setNewLine("");
        helpFormatter0.setWidth(10);
        helpFormatter0.defaultDescPad = 13;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("             ", options16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int10 = helpFormatter0.defaultLeftPad;
        int int11 = helpFormatter0.getLeftPadding();
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = (byte) 100;
        int int8 = helpFormatter0.getDescPadding();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        java.lang.String str14 = helpFormatter0.defaultArgName;
        helpFormatter0.setWidth(72);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
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
        java.lang.String str15 = helpFormatter0.defaultNewLine;
        java.lang.String str17 = helpFormatter0.rtrim("                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
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
        int int20 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n" + "'", str19, "\n");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 74 + "'", int20 == 74);
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        helpFormatter0.defaultLeftPad = (byte) 1;
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        int int12 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        helpFormatter0.setDescPadding(100);
        int int10 = helpFormatter0.findWrapPos("                                                                                                    ", (int) (byte) 0, 3);
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultArgName = "                                                                          ";
        helpFormatter0.setSyntaxPrefix("   ");
        helpFormatter0.setLeftPadding(11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(comparator11);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultArgName = "                                                                                                    ";
        java.util.Comparator comparator7 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter8.defaultOptPrefix = "hi!";
        helpFormatter8.setNewLine("\n");
        int int13 = helpFormatter8.getDescPadding();
        helpFormatter8.setDescPadding(0);
        java.lang.String str16 = helpFormatter8.getNewLine();
        org.apache.commons.cli.HelpFormatter helpFormatter17 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str19 = helpFormatter17.rtrim("arg");
        helpFormatter17.defaultOptPrefix = "--";
        int int22 = helpFormatter17.getLeftPadding();
        helpFormatter17.setWidth(74);
        org.apache.commons.cli.HelpFormatter helpFormatter25 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str27 = helpFormatter25.rtrim("arg");
        java.lang.String str28 = helpFormatter25.defaultSyntaxPrefix;
        java.lang.String str29 = helpFormatter25.defaultOptPrefix;
        java.util.Comparator comparator30 = helpFormatter25.getOptionComparator();
        helpFormatter17.optionComparator = comparator30;
        helpFormatter8.setOptionComparator(comparator30);
        helpFormatter0.optionComparator = comparator30;
        org.apache.commons.cli.Options options37 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 100, "                                                                                                 ", "\n", options37, "usage: ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertNotNull(comparator7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "arg" + "'", str27, "arg");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "usage: " + "'", str28, "usage: ");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-" + "'", str29, "-");
        org.junit.Assert.assertNotNull(comparator30);
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setDescPadding(0);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str13 = helpFormatter0.rtrim("usage: ");
        java.lang.String str14 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage:" + "'", str13, "usage:");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
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
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(3, "   ", "           ", options21, "                                                                                      ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:         ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
    }
}

