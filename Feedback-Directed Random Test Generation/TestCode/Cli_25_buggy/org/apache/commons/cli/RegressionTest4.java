package org.apache.commons.cli;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultOptPrefix = "arg";
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str11 = helpFormatter0.createPadding((int) (byte) 1);
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter12, (int) (byte) 100, options14, 32, (int) '4');
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
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultArgName = "";
        helpFormatter0.setOptPrefix("usage:");
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(67, "                                ", "                                                                                                 ", options17, "                                                                         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        org.apache.commons.cli.Options options50 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                   ", options50);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 42");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setLeftPadding((int) (short) 1);
        java.util.Comparator comparator10 = helpFormatter0.getOptionComparator();
        int int11 = helpFormatter0.defaultWidth;
        int int12 = helpFormatter0.getLeftPadding();
        java.lang.Class<?> wildcardClass13 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        helpFormatter0.defaultArgName = "                                                                                                 ";
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
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                 ";
        java.lang.String str7 = helpFormatter0.getNewLine();
        int int8 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter9, 3, "usage:", options12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        helpFormatter0.defaultSyntaxPrefix = "                                                    ";
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                    ", options18);
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
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        int int6 = helpFormatter0.getWidth();
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        java.util.Comparator comparator23 = helpFormatter0.optionComparator;
        org.apache.commons.cli.Options options27 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 0, "hi!", "                                                                                       ", options27, "usage: ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertNotNull(comparator23);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = (byte) 100;
        java.lang.String str8 = helpFormatter0.getArgName();
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        int int10 = helpFormatter0.getWidth();
        int int11 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix("\n");
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator9 = helpFormatter0.optionComparator;
        helpFormatter0.setNewLine("usage:");
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                 ";
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter14, 45, "                                                                                                 ", "           ", options18, 35, (int) '#', "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertNotNull(comparator9);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setLeftPadding((int) '#');
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultNewLine = "                                                                                       ";
        java.lang.Class<?> wildcardClass11 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        java.util.Comparator comparator16 = helpFormatter0.getOptionComparator();
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("             ", options18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(comparator16);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        java.lang.String str25 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.String str28 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "--" + "'", str22, "--");
        org.junit.Assert.assertNotNull(comparator23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-" + "'", str25, "-");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "usage: " + "'", str28, "usage: ");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.lang.String str5 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str6 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("-", options9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
            helpFormatter0.printUsage(printWriter13, (-1), "--");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 9");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix("hi!");
        helpFormatter0.setWidth((int) (byte) 0);
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter11, 12, "           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.setArgName("          ");
        helpFormatter0.defaultLeftPad = (byte) 1;
        helpFormatter0.setArgName("                                                    ");
        java.lang.String str13 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        helpFormatter0.defaultDescPad = 45;
        org.apache.commons.cli.HelpFormatter helpFormatter20 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str22 = helpFormatter20.rtrim("arg");
        java.lang.String str23 = helpFormatter20.getNewLine();
        java.lang.String str24 = helpFormatter20.getOptPrefix();
        helpFormatter20.setOptPrefix("usage: ");
        java.lang.String str27 = helpFormatter20.getNewLine();
        java.lang.String str29 = helpFormatter20.rtrim("hi!");
        int int30 = helpFormatter20.defaultLeftPad;
        java.util.Comparator comparator31 = helpFormatter20.optionComparator;
        helpFormatter0.setOptionComparator(comparator31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "arg" + "'", str22, "arg");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n" + "'", str23, "\n");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-" + "'", str24, "-");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\n" + "'", str27, "\n");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(comparator31);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        int int24 = helpFormatter0.findWrapPos("                                                                                                 ", (int) '#', 32);
        org.apache.commons.cli.Options options27 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", "             ", options27, "                                   ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 67 + "'", int24 == 67);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.defaultArgName;
        int int10 = helpFormatter0.getWidth();
        java.lang.String str11 = helpFormatter0.getNewLine();
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        java.lang.String str14 = helpFormatter0.createPadding((int) (byte) 10);
        java.lang.String str16 = helpFormatter0.createPadding(73);
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                   ", options18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "          " + "'", str14, "          ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                         " + "'", str16, "                                                                         ");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.rtrim("--");
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultDescPad = (short) 10;
        helpFormatter0.setLongOptPrefix("                                   ");
        int int13 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultArgName = "                                                                                                 ";
        int int16 = helpFormatter0.defaultDescPad;
        int int17 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", options19);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 8");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
        java.lang.String str18 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "--" + "'", str17, "--");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                   " + "'", str18, "                                   ");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        int int12 = helpFormatter0.getDescPadding();
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter3 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str5 = helpFormatter3.rtrim("arg");
        java.lang.String str6 = helpFormatter3.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter3.defaultOptPrefix;
        java.util.Comparator comparator8 = helpFormatter3.getOptionComparator();
        helpFormatter0.optionComparator = comparator8;
        helpFormatter0.defaultLeftPad = 74;
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderWrappedText(stringBuffer12, 87, (int) 'a', "            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuffer.append(String)\" because \"sb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 100, "            ", "                                                    ", options12, "            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
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
        java.lang.String str18 = helpFormatter0.getArgName();
        java.io.PrintWriter printWriter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter19, 11, (int) (short) 1, "            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setOptPrefix("                                   ");
        java.io.PrintWriter printWriter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter5, 72, "             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix("hi!");
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        java.lang.String str11 = helpFormatter0.getArgName();
        java.lang.String str12 = helpFormatter0.getSyntaxPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str15 = helpFormatter13.rtrim("arg");
        java.lang.String str16 = helpFormatter13.getNewLine();
        helpFormatter13.defaultArgName = "usage: ";
        helpFormatter13.defaultDescPad = (byte) 100;
        java.lang.String str21 = helpFormatter13.getArgName();
        helpFormatter13.setNewLine("-");
        int int24 = helpFormatter13.getLeftPadding();
        java.util.Comparator comparator25 = helpFormatter13.getOptionComparator();
        helpFormatter0.optionComparator = comparator25;
        org.apache.commons.cli.Options options30 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(74, "                                                                   ", "            ", options30, "   ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "usage: " + "'", str21, "usage: ");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(comparator25);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        java.lang.String str17 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (short) 10;
        int int20 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.createPadding((int) (short) 0);
        java.lang.String str7 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        helpFormatter0.defaultArgName = "  ";
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
        int int20 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultArgName = "usage:";
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str25 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "usage: " + "'", str25, "usage: ");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
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
        helpFormatter0.defaultLeftPad = (short) 1;
        helpFormatter0.setLongOptPrefix("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
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
        int int18 = helpFormatter0.getWidth();
        java.lang.Class<?> wildcardClass19 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 74 + "'", int18 == 74);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
        helpFormatter0.defaultNewLine = "                                                                                                    ";
        java.lang.String str19 = helpFormatter0.rtrim("");
        java.util.Comparator comparator20 = helpFormatter0.optionComparator;
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", "                                                                                                 ", options23, "\n");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(comparator20);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.defaultWidth = 3;
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        int int11 = helpFormatter0.getDescPadding();
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter13, 0, "   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        int int10 = helpFormatter0.findWrapPos("", (int) (byte) 100, (int) (short) 0);
        java.lang.String str12 = helpFormatter0.rtrim("   ");
        java.util.Comparator comparator13 = helpFormatter0.optionComparator;
        helpFormatter0.setLongOptPrefix("\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(comparator13);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        java.lang.String str24 = helpFormatter0.getNewLine();
        helpFormatter0.setLeftPadding((int) (short) 1);
        java.lang.StringBuffer stringBuffer27 = null;
        org.apache.commons.cli.Options options29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer32 = helpFormatter0.renderOptions(stringBuffer27, 2, options29, (int) (byte) 0, 67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "usage: " + "'", str21, "usage: ");
        org.junit.Assert.assertNotNull(comparator22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setDescPadding(0);
        int int8 = helpFormatter0.getLeftPadding();
        int int9 = helpFormatter0.getDescPadding();
        helpFormatter0.setSyntaxPrefix("hi!");
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", "                                                                                       ", options14, "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str10 = helpFormatter8.rtrim("arg");
        helpFormatter8.defaultWidth = (short) -1;
        java.lang.String str13 = helpFormatter8.defaultArgName;
        java.lang.String str14 = helpFormatter8.defaultArgName;
        java.lang.String str15 = helpFormatter8.defaultOptPrefix;
        int int16 = helpFormatter8.getDescPadding();
        java.util.Comparator comparator17 = helpFormatter8.optionComparator;
        helpFormatter0.setOptionComparator(comparator17);
        int int19 = helpFormatter0.getDescPadding();
        java.lang.Class<?> wildcardClass20 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
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
        helpFormatter0.defaultArgName = "                                                    ";
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.defaultArgName = "\n";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
        java.util.Comparator comparator24 = helpFormatter0.optionComparator;
        java.lang.String str25 = helpFormatter0.getNewLine();
        org.apache.commons.cli.HelpFormatter helpFormatter26 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str28 = helpFormatter26.rtrim("arg");
        helpFormatter26.defaultWidth = (short) -1;
        helpFormatter26.defaultOptPrefix = "--";
        int int33 = helpFormatter26.getWidth();
        helpFormatter26.defaultWidth = 3;
        java.lang.String str36 = helpFormatter26.getLongOptPrefix();
        int int37 = helpFormatter26.getDescPadding();
        int int38 = helpFormatter26.defaultLeftPad;
        org.apache.commons.cli.HelpFormatter helpFormatter39 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str41 = helpFormatter39.rtrim("arg");
        helpFormatter39.setSyntaxPrefix("-");
        java.lang.String str44 = helpFormatter39.getOptPrefix();
        helpFormatter39.setNewLine("");
        java.lang.String str47 = helpFormatter39.getLongOptPrefix();
        helpFormatter39.defaultLongOptPrefix = "usage: ";
        java.util.Comparator comparator50 = helpFormatter39.getOptionComparator();
        helpFormatter26.optionComparator = comparator50;
        helpFormatter0.optionComparator = comparator50;
        helpFormatter0.defaultNewLine = "usage:";
        java.lang.String str55 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(comparator24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\n" + "'", str25, "\n");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "arg" + "'", str28, "arg");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "--" + "'", str36, "--");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "arg" + "'", str41, "arg");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "-" + "'", str44, "-");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "--" + "'", str47, "--");
        org.junit.Assert.assertNotNull(comparator50);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "arg" + "'", str55, "arg");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
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
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("");
        int int6 = helpFormatter0.findWrapPos("\n", 1, (int) (byte) 100);
        java.lang.String str7 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setSyntaxPrefix("  ");
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) 'a', " ", "--", options13, "                                                                          ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix("\n");
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setSyntaxPrefix("usage: ");
        helpFormatter0.defaultArgName = "usage:";
        helpFormatter0.setLeftPadding((-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
        java.lang.String str29 = helpFormatter0.defaultOptPrefix;
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "--" + "'", str29, "--");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultNewLine = "arg";
        helpFormatter0.setNewLine("\n");
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 1, "--", "                                                                   ", options12, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(12, "                                                                   ", "hi!", options14, "   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultDescPad = 0;
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultOptPrefix = "arg";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
        helpFormatter0.defaultArgName = "  ";
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(72, "arg", "--", options23, "             ", false);
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
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        helpFormatter0.defaultWidth = (byte) 0;
        helpFormatter0.defaultDescPad = (short) 0;
        int int10 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultArgName = "                                                    ";
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = helpFormatter0.renderOptions(stringBuffer13, 1, options15, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
        java.lang.String str31 = helpFormatter0.createPadding(10);
        java.util.Comparator comparator32 = helpFormatter0.optionComparator;
        org.apache.commons.cli.Options options34 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("             ", options34, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "          " + "'", str31, "          ");
        org.junit.Assert.assertNotNull(comparator32);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        int int9 = helpFormatter0.findWrapPos(" ", (int) (short) 1, 10);
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.util.Comparator comparator12 = helpFormatter0.getOptionComparator();
        helpFormatter0.setNewLine("                                                                                                    ");
        helpFormatter0.defaultNewLine = "usage: ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertNotNull(comparator12);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        int int11 = helpFormatter0.defaultDescPad;
        helpFormatter0.setWidth((int) (short) 10);
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter14, 0, "            ", options17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        helpFormatter0.setDescPadding(74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(comparator15);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultWidth;
        java.lang.String str6 = helpFormatter0.rtrim("-");
        java.lang.String str7 = helpFormatter0.getArgName();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        java.lang.Class<?> wildcardClass11 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter20, (-1), options22, 52, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n" + "'", str19, "\n");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        helpFormatter0.defaultWidth = (-1);
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(72, "                                                                          ", "", options23, "usage: ");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setOptPrefix("                                   ");
        helpFormatter0.setLongOptPrefix("                                                                   ");
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer11 = helpFormatter0.renderWrappedText(stringBuffer7, 1, 2, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultOptPrefix = "arg";
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        int int9 = helpFormatter0.getWidth();
        helpFormatter0.defaultArgName = "hi!";
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str14 = helpFormatter12.rtrim("arg");
        java.lang.String str15 = helpFormatter12.getNewLine();
        java.lang.String str16 = helpFormatter12.getOptPrefix();
        helpFormatter12.setOptPrefix("usage: ");
        java.lang.String str19 = helpFormatter12.getNewLine();
        java.lang.String str21 = helpFormatter12.rtrim("hi!");
        helpFormatter12.setWidth(10);
        java.lang.String str24 = helpFormatter12.defaultArgName;
        org.apache.commons.cli.HelpFormatter helpFormatter25 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str27 = helpFormatter25.rtrim("arg");
        helpFormatter25.setSyntaxPrefix("-");
        java.lang.String str30 = helpFormatter25.getOptPrefix();
        java.lang.String str31 = helpFormatter25.defaultSyntaxPrefix;
        int int32 = helpFormatter25.defaultDescPad;
        int int33 = helpFormatter25.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter34 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str36 = helpFormatter34.rtrim("arg");
        java.lang.String str37 = helpFormatter34.defaultSyntaxPrefix;
        java.lang.String str38 = helpFormatter34.defaultOptPrefix;
        java.util.Comparator comparator39 = helpFormatter34.getOptionComparator();
        helpFormatter25.setOptionComparator(comparator39);
        helpFormatter12.optionComparator = comparator39;
        helpFormatter0.optionComparator = comparator39;
        helpFormatter0.setArgName("             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n" + "'", str19, "\n");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "arg" + "'", str24, "arg");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "arg" + "'", str27, "arg");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-" + "'", str30, "-");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-" + "'", str31, "-");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "arg" + "'", str36, "arg");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "usage: " + "'", str37, "usage: ");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-" + "'", str38, "-");
        org.junit.Assert.assertNotNull(comparator39);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        int int9 = helpFormatter0.findWrapPos("-", (int) (short) 100, 74);
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        helpFormatter0.setWidth(3);
        helpFormatter0.defaultOptPrefix = "          ";
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) -1, "", "                                                    ", options20, "             ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        int int45 = helpFormatter0.defaultDescPad;
        java.io.PrintWriter printWriter46 = null;
        org.apache.commons.cli.Options options50 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter46, 32, "hi!", "             ", options50, 0, (int) (byte) 100, " ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix("usage: ");
        int int11 = helpFormatter0.findWrapPos("hi!", (int) (byte) -1, (int) (byte) 100);
        helpFormatter0.setOptPrefix("usage:");
        helpFormatter0.defaultWidth = 87;
        java.util.Comparator comparator16 = helpFormatter0.optionComparator;
        java.lang.String str17 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(comparator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage: " + "'", str17, "usage: ");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.defaultNewLine = "-";
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        int int13 = helpFormatter0.getLeftPadding();
        java.lang.Class<?> wildcardClass14 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth(74);
        helpFormatter0.setDescPadding(13);
        helpFormatter0.defaultArgName = "  ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        int int12 = helpFormatter0.findWrapPos("                                                                         ", (int) '#', 0);
        java.lang.String str13 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("--");
        helpFormatter0.defaultWidth = (byte) 1;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
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
        java.util.Comparator comparator17 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = (short) 10;
        helpFormatter0.defaultLongOptPrefix = "-";
        int int25 = helpFormatter0.findWrapPos("             ", 0, 11);
        java.io.PrintWriter printWriter26 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter26, (int) (byte) 10, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 11 + "'", int25 == 11);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setOptPrefix(" ");
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", options10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
        helpFormatter0.setNewLine("                                ");
        org.apache.commons.cli.HelpFormatter helpFormatter23 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter23.defaultOptPrefix = "hi!";
        int int29 = helpFormatter23.findWrapPos("--", (int) '#', (int) (short) 100);
        helpFormatter23.defaultLeftPad = 0;
        java.util.Comparator comparator32 = helpFormatter23.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator32);
        java.lang.StringBuffer stringBuffer34 = null;
        org.apache.commons.cli.Options options36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer39 = helpFormatter0.renderOptions(stringBuffer34, (int) (short) 10, options36, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(comparator32);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setDescPadding(0);
        java.lang.String str9 = helpFormatter0.createPadding((int) (short) 10);
        helpFormatter0.defaultNewLine = "                                                                         ";
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.setWidth(100);
        helpFormatter0.setNewLine("arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "          " + "'", str9, "          ");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setDescPadding(0);
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.setWidth((int) (short) 10);
        java.lang.String str11 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, (-1), "            ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 12");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = (byte) 100;
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultWidth = (short) 0;
        helpFormatter0.defaultLongOptPrefix = "  ";
        helpFormatter0.defaultDescPad = (byte) 0;
        helpFormatter0.defaultLeftPad = (byte) 1;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("");
        int int3 = helpFormatter0.getLeftPadding();
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) -1;
        helpFormatter0.setWidth((int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultArgName = "                                                                                                    ";
        int int7 = helpFormatter0.defaultWidth;
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultArgName = "                                                                                                    ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.rtrim("--");
        int int8 = helpFormatter0.getWidth();
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter10, (int) 'a', "\n", options13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.rtrim("--");
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultOptPrefix = "";
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultArgName = "                                                                   ";
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", options16);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 9");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
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
        java.io.PrintWriter printWriter22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter22, (int) '#', "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.lang.String str5 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        helpFormatter0.setLongOptPrefix("--");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
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
        helpFormatter0.setNewLine("                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(comparator13);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.setSyntaxPrefix("                                   ");
        int int10 = helpFormatter0.getDescPadding();
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(100, "                                                                                                 ", "                                                                                                 ", options15, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
        org.apache.commons.cli.HelpFormatter helpFormatter25 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str27 = helpFormatter25.rtrim("arg");
        java.lang.String str28 = helpFormatter25.getNewLine();
        java.lang.String str29 = helpFormatter25.getOptPrefix();
        helpFormatter25.setNewLine("usage: ");
        helpFormatter25.setLongOptPrefix("hi!");
        java.util.Comparator comparator34 = helpFormatter25.getOptionComparator();
        helpFormatter25.defaultLongOptPrefix = "                                   ";
        int int37 = helpFormatter25.defaultWidth;
        java.util.Comparator comparator38 = helpFormatter25.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator38);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "arg" + "'", str24, "arg");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "arg" + "'", str27, "arg");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\n" + "'", str28, "\n");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-" + "'", str29, "-");
        org.junit.Assert.assertNotNull(comparator34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 74 + "'", int37 == 74);
        org.junit.Assert.assertNotNull(comparator38);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.setNewLine("");
        helpFormatter0.setWidth(10);
        helpFormatter0.defaultDescPad = 13;
        java.lang.String str15 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = (byte) 100;
        java.lang.String str8 = helpFormatter0.getArgName();
        helpFormatter0.setNewLine("-");
        int int11 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth(87);
        java.lang.String str14 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
        helpFormatter0.defaultSyntaxPrefix = "   ";
        java.util.Comparator comparator28 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(comparator28);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
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
        int int22 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "--" + "'", str17, "--");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        int int9 = helpFormatter0.findWrapPos(" ", (int) (short) 1, 10);
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultNewLine = "                                                                          ";
        helpFormatter0.defaultArgName = " ";
        helpFormatter0.defaultSyntaxPrefix = "                                                    ";
        java.lang.StringBuffer stringBuffer17 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = helpFormatter0.renderOptions(stringBuffer17, 73, options19, (-1), 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        int int9 = helpFormatter0.findWrapPos("-", (int) (short) 100, 74);
        helpFormatter0.setNewLine("usage: ");
        int int12 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter13, 2, (int) (short) 0, "             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultOptPrefix = "                                                    ";
        helpFormatter0.defaultArgName = "";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.rtrim("--");
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultDescPad = (short) 10;
        helpFormatter0.setLongOptPrefix("                                   ");
        helpFormatter0.defaultNewLine = "  ";
        helpFormatter0.setDescPadding((int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.Options options5 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(2, "", "usage: ", options5, "arg", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.rtrim("--");
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultDescPad = (short) 10;
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter11, 3, "            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultWidth;
        java.lang.String str6 = helpFormatter0.rtrim("-");
        java.lang.String str7 = helpFormatter0.getArgName();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.util.Comparator comparator5 = null;
        helpFormatter0.setOptionComparator(comparator5);
        java.lang.String str7 = helpFormatter0.defaultArgName;
        helpFormatter0.setWidth((int) (short) 10);
        helpFormatter0.defaultDescPad = (short) 0;
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                 ";
        java.io.PrintWriter printWriter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter14, 2, 3, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                   ", "             ", options11, "                                   ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.getArgName();
        helpFormatter0.defaultSyntaxPrefix = "-";
        java.lang.String str15 = helpFormatter0.createPadding(0);
        java.lang.String str16 = helpFormatter0.defaultArgName;
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer21 = helpFormatter0.renderWrappedText(stringBuffer17, 32, 67, "            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuffer.append(String)\" because \"sb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.defaultArgName;
        int int10 = helpFormatter0.getWidth();
        java.lang.String str11 = helpFormatter0.getNewLine();
        int int12 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setSyntaxPrefix("hi!");
        int int9 = helpFormatter0.defaultWidth;
        java.lang.String str11 = helpFormatter0.createPadding(2);
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                 ";
        helpFormatter0.setLeftPadding(2);
        helpFormatter0.setArgName("                                                                   ");
        java.lang.String str18 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "  " + "'", str11, "  ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                   " + "'", str18, "                                                                   ");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix("hi!");
        int int9 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultSyntaxPrefix = "                                   ";
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        java.lang.String str15 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str9 = helpFormatter0.rtrim("hi!");
        helpFormatter0.setWidth(10);
        java.lang.String str12 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str15 = helpFormatter13.rtrim("arg");
        helpFormatter13.setSyntaxPrefix("-");
        java.lang.String str18 = helpFormatter13.getOptPrefix();
        java.lang.String str19 = helpFormatter13.defaultSyntaxPrefix;
        int int20 = helpFormatter13.defaultDescPad;
        int int21 = helpFormatter13.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter22 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str24 = helpFormatter22.rtrim("arg");
        java.lang.String str25 = helpFormatter22.defaultSyntaxPrefix;
        java.lang.String str26 = helpFormatter22.defaultOptPrefix;
        java.util.Comparator comparator27 = helpFormatter22.getOptionComparator();
        helpFormatter13.setOptionComparator(comparator27);
        helpFormatter0.optionComparator = comparator27;
        java.io.PrintWriter printWriter30 = null;
        org.apache.commons.cli.Options options33 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter30, (int) (byte) 1, "                                                                   ", options33);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-" + "'", str19, "-");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "arg" + "'", str24, "arg");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "usage: " + "'", str25, "usage: ");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-" + "'", str26, "-");
        org.junit.Assert.assertNotNull(comparator27);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
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
        java.util.Comparator comparator15 = helpFormatter0.getOptionComparator();
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", "                                                                                       ", options18, "", true);
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(comparator15);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.setDescPadding((int) (short) 100);
        java.util.Comparator comparator10 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultLeftPad = 74;
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter13, 10, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(comparator10);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.util.Comparator comparator9 = null;
        helpFormatter0.optionComparator = comparator9;
        java.lang.String str11 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = (short) 0;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", "arg", options16, "arg", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
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
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(35, "", "  ", options22, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                 ";
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("   ", options8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str7 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultSyntaxPrefix = "                                                    ";
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", "           ", options12, "   ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "\n";
        java.util.Comparator comparator7 = null;
        helpFormatter0.setOptionComparator(comparator7);
        int int9 = helpFormatter0.defaultLeftPad;
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultWidth;
        int int8 = helpFormatter0.getLeftPadding();
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter9, (int) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.defaultWidth = ' ';
        helpFormatter0.setDescPadding((int) (short) 10);
        java.lang.String str14 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        helpFormatter0.defaultLeftPad = (byte) 1;
        helpFormatter0.defaultLeftPad = (short) 1;
        int int13 = helpFormatter0.getWidth();
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                         ", options15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
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
        helpFormatter0.setLeftPadding((int) (short) 0);
        org.apache.commons.cli.Options options26 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(11, "                                                                                       ", "             ", options26, "                                                                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setNewLine("\n");
        int int11 = helpFormatter0.defaultLeftPad;
        java.lang.String str13 = helpFormatter0.createPadding((int) (byte) 100);
        helpFormatter0.defaultNewLine = "                                   ";
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(67, "hi!", "  ", options19, "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                                                                                    " + "'", str13, "                                                                                                    ");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        int int7 = helpFormatter0.findWrapPos("arg", 0, (int) ' ');
        helpFormatter0.setLeftPadding(100);
        java.lang.String str10 = helpFormatter0.getNewLine();
        java.lang.String str11 = helpFormatter0.getArgName();
        helpFormatter0.defaultArgName = "";
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter14, (int) (short) 100, options16, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultOptPrefix = "arg";
        helpFormatter0.setLeftPadding(2);
        helpFormatter0.defaultLeftPad = 87;
        int int14 = helpFormatter0.findWrapPos("", (int) (byte) -1, 67);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.getOptionComparator();
        int int8 = helpFormatter0.findWrapPos("                                   ", 87, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setArgName("arg");
        int int16 = helpFormatter0.getDescPadding();
        java.lang.String str18 = helpFormatter0.rtrim("                                                                         ");
        java.io.PrintWriter printWriter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter19, (int) (byte) 0, "   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setNewLine("-");
        helpFormatter0.setArgName("usage: ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
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
        java.util.Comparator comparator18 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertNotNull(comparator18);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        int int5 = helpFormatter0.getLeftPadding();
        java.lang.String str6 = helpFormatter0.getArgName();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter8, 9, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix("\n");
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator9 = helpFormatter0.optionComparator;
        helpFormatter0.setArgName("usage: ");
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter12, 1, options14, 2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertNotNull(comparator9);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.getWidth();
        java.lang.String str9 = helpFormatter0.rtrim("arg");
        helpFormatter0.setArgName("\n");
        int int12 = helpFormatter0.defaultDescPad;
        java.lang.String str13 = helpFormatter0.getOptPrefix();
        int int14 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultWidth;
        java.lang.String str6 = helpFormatter0.rtrim("-");
        java.lang.String str7 = helpFormatter0.getArgName();
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        java.util.Comparator comparator9 = helpFormatter0.optionComparator;
        helpFormatter0.setSyntaxPrefix("--");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertNotNull(comparator9);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
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
            helpFormatter0.printHelp("                                                                                       ", "   ", options16, "            ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 89");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("");
        int int6 = helpFormatter0.findWrapPos("", (int) (short) 1, (int) (byte) 0);
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultArgName = "                                                                                                 ";
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        int int14 = helpFormatter0.findWrapPos("  ", 87, (int) 'a');
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(52, "hi!", "                                                    ", options18, "         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
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
        int int15 = helpFormatter0.getWidth();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultSyntaxPrefix = "\n";
        java.lang.String str4 = helpFormatter0.defaultNewLine;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        int int6 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.setLeftPadding((int) (byte) 0);
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", "                                                                          ", options13, "           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultLeftPad = 0;
        int int12 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        int int7 = helpFormatter0.findWrapPos("arg", 0, (int) ' ');
        helpFormatter0.setLeftPadding(100);
        helpFormatter0.setArgName("                                   ");
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", " ", options14, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setDescPadding(0);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "-";
        java.lang.String str16 = helpFormatter0.rtrim("                                   ");
        java.lang.String str17 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter18 = null;
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter18, (int) '#', "  ", "                                                                   ", options22, 100, 32, "         ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        java.lang.String str12 = helpFormatter0.createPadding(100);
        java.lang.String str14 = helpFormatter0.rtrim("            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                    " + "'", str12, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        int int6 = helpFormatter0.findWrapPos("--", (int) '#', (int) (short) 100);
        helpFormatter0.defaultLeftPad = 0;
        java.lang.String str9 = helpFormatter0.defaultArgName;
        int int10 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
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
        helpFormatter0.defaultLongOptPrefix = "                                                                         ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 45 + "'", int16 == 45);
        org.junit.Assert.assertNotNull(comparator17);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setLongOptPrefix("hi!");
        java.util.Comparator comparator9 = helpFormatter0.optionComparator;
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.defaultLeftPad = 3;
        int int14 = helpFormatter0.defaultWidth;
        java.lang.String str16 = helpFormatter0.createPadding((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "          " + "'", str16, "          ");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
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
        java.util.Comparator comparator51 = null;
        helpFormatter0.setOptionComparator(comparator51);
        int int53 = helpFormatter0.defaultLeftPad;
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
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setNewLine("-");
        int int8 = helpFormatter0.defaultDescPad;
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        helpFormatter0.setWidth((int) (byte) 1);
        helpFormatter0.defaultDescPad = 67;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        helpFormatter0.defaultLeftPad = (byte) 1;
        helpFormatter0.defaultLeftPad = (short) 1;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 10, "                                                                   ", "                                                                   ", options16, "  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.getDescPadding();
        int int8 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
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
        java.lang.StringBuffer stringBuffer34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer38 = helpFormatter0.renderWrappedText(stringBuffer34, 0, 1, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        helpFormatter0.defaultWidth = (byte) 0;
        helpFormatter0.defaultDescPad = (short) 0;
        int int13 = helpFormatter0.findWrapPos("\n", (int) (short) 0, (int) (short) 100);
        java.lang.String str14 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setSyntaxPrefix("                                   ");
        int int17 = helpFormatter0.defaultWidth;
        java.lang.String str19 = helpFormatter0.createPadding(73);
        helpFormatter0.setLeftPadding((int) '4');
        java.io.PrintWriter printWriter22 = null;
        org.apache.commons.cli.Options options24 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter22, (int) (byte) -1, options24, 9, 87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                                                         " + "'", str19, "                                                                         ");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
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
        java.lang.StringBuffer stringBuffer17 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = helpFormatter0.renderOptions(stringBuffer17, 35, options19, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertNotNull(comparator14);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        java.util.Comparator comparator10 = helpFormatter0.optionComparator;
        int int11 = helpFormatter0.defaultDescPad;
        int int12 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setOptPrefix("\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultLeftPad = (short) 100;
        java.util.Comparator comparator13 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultOptPrefix = "";
        helpFormatter0.setSyntaxPrefix("   ");
        helpFormatter0.setOptPrefix("          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertNotNull(comparator13);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setNewLine("-");
        int int8 = helpFormatter0.defaultDescPad;
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.rtrim("--");
        int int8 = helpFormatter0.getWidth();
        helpFormatter0.setOptPrefix("                                   ");
        helpFormatter0.defaultLeftPad = 100;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        int int6 = helpFormatter0.findWrapPos("--", (int) '#', (int) (short) 100);
        helpFormatter0.setArgName("arg");
        helpFormatter0.defaultOptPrefix = "";
        java.lang.String str12 = helpFormatter0.rtrim("                                                                                                 ");
        java.lang.String str13 = helpFormatter0.getNewLine();
        int int14 = helpFormatter0.defaultDescPad;
        helpFormatter0.setNewLine("   ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        helpFormatter0.setDescPadding((int) (short) 100);
        int int16 = helpFormatter0.findWrapPos("--", (int) (short) 100, 2);
        java.io.PrintWriter printWriter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter17, (int) (short) 10, "  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        int int11 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLeftPad = (short) -1;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(72, "            ", "          ", options17, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultOptPrefix = "arg";
        helpFormatter0.defaultDescPad = (short) 10;
        helpFormatter0.setNewLine("          ");
        int int11 = helpFormatter0.getDescPadding();
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter12, 12, options14, 13, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth(74);
        helpFormatter0.setArgName("-");
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str12 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        org.apache.commons.cli.HelpFormatter helpFormatter15 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter15.defaultOptPrefix = "hi!";
        helpFormatter15.setNewLine("\n");
        int int20 = helpFormatter15.getDescPadding();
        helpFormatter15.setDescPadding(0);
        java.lang.String str23 = helpFormatter15.getNewLine();
        org.apache.commons.cli.HelpFormatter helpFormatter24 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str26 = helpFormatter24.rtrim("arg");
        helpFormatter24.defaultOptPrefix = "--";
        int int29 = helpFormatter24.getLeftPadding();
        helpFormatter24.setWidth(74);
        org.apache.commons.cli.HelpFormatter helpFormatter32 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str34 = helpFormatter32.rtrim("arg");
        java.lang.String str35 = helpFormatter32.defaultSyntaxPrefix;
        java.lang.String str36 = helpFormatter32.defaultOptPrefix;
        java.util.Comparator comparator37 = helpFormatter32.getOptionComparator();
        helpFormatter24.optionComparator = comparator37;
        helpFormatter15.setOptionComparator(comparator37);
        helpFormatter0.optionComparator = comparator37;
        org.apache.commons.cli.Options options44 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 0, "                                                    ", "           ", options44, "                                                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n" + "'", str23, "\n");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "arg" + "'", str26, "arg");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "arg" + "'", str34, "arg");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "usage: " + "'", str35, "usage: ");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "-" + "'", str36, "-");
        org.junit.Assert.assertNotNull(comparator37);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        helpFormatter0.defaultWidth = (byte) 0;
        helpFormatter0.defaultDescPad = (short) 0;
        helpFormatter0.setSyntaxPrefix("          ");
        helpFormatter0.defaultDescPad = (byte) -1;
        helpFormatter0.setLeftPadding((int) (short) 100);
        helpFormatter0.defaultOptPrefix = "          ";
        java.lang.String str18 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "--" + "'", str18, "--");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultLeftPad = (short) 100;
        java.util.Comparator comparator13 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultOptPrefix = "";
        helpFormatter0.setSyntaxPrefix("                                                                          ");
        java.io.PrintWriter printWriter18 = null;
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter18, 32, "             ", "                                                                         ", options22, (int) '#', (int) (byte) 0, " ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertNotNull(comparator13);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
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
        java.util.Comparator comparator18 = helpFormatter0.getOptionComparator();
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(9, "                                                                                                 ", "", options22, "                                                                   ");
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
        org.junit.Assert.assertNotNull(comparator18);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.lang.String str9 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultArgName = "                                ";
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        helpFormatter0.defaultWidth = (byte) 0;
        helpFormatter0.defaultDescPad = (short) 0;
        int int13 = helpFormatter0.findWrapPos("\n", (int) (short) 0, (int) (short) 100);
        java.lang.String str14 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setSyntaxPrefix("                                   ");
        int int17 = helpFormatter0.defaultWidth;
        java.lang.String str18 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "--" + "'", str18, "--");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = (byte) 100;
        int int8 = helpFormatter0.getDescPadding();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.defaultNewLine = "";
        helpFormatter0.setOptPrefix("                                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultDescPad = (byte) 10;
        java.lang.String str10 = helpFormatter0.createPadding((int) '4');
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                    " + "'", str10, "                                                    ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.defaultNewLine = "usage: ";
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(67, "arg", "hi!", options15, "                                                                   ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
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
        java.lang.String str22 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultSyntaxPrefix = "                                   ";
        java.io.PrintWriter printWriter25 = null;
        org.apache.commons.cli.Options options29 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter25, 10, "usage:", "           ", options29, 45, (int) '#', "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "usage: " + "'", str22, "usage: ");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str9 = helpFormatter0.rtrim("hi!");
        helpFormatter0.setWidth(10);
        java.lang.String str12 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter13, (int) (byte) -1, 9, "         ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 9");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
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
        int int30 = helpFormatter0.getDescPadding();
        java.io.PrintWriter printWriter31 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter31, 3, (int) (byte) 100, "                                                                          ");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
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
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLongOptPrefix("   ");
        helpFormatter0.setNewLine("usage:");
        java.lang.String str28 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "                                   " + "'", str28, "                                   ");
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        java.util.Comparator comparator10 = helpFormatter0.optionComparator;
        java.lang.String str11 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLeftPadding((int) (byte) -1);
        java.util.Comparator comparator14 = helpFormatter0.getOptionComparator();
        java.lang.String str15 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        int int10 = helpFormatter0.findWrapPos("", (int) (byte) 100, (int) (short) 0);
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        int int12 = helpFormatter0.defaultDescPad;
        java.lang.String str13 = helpFormatter0.getArgName();
        int int14 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter15 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter15, 52, "                                   ", "          ", options19, (int) ' ', 9, "                                                                                                    ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.setNewLine("");
        helpFormatter0.setWidth(10);
        helpFormatter0.defaultDescPad = 13;
        helpFormatter0.defaultLeftPad = (short) 100;
        java.lang.String str17 = helpFormatter0.defaultArgName;
        java.lang.String str19 = helpFormatter0.rtrim("                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
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
        helpFormatter0.setWidth(0);
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
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
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
        java.util.Comparator comparator17 = helpFormatter0.getOptionComparator();
        org.apache.commons.cli.HelpFormatter helpFormatter18 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str20 = helpFormatter18.rtrim("arg");
        helpFormatter18.defaultWidth = (short) -1;
        int int23 = helpFormatter18.defaultWidth;
        java.lang.String str24 = helpFormatter18.defaultOptPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter25 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str27 = helpFormatter25.rtrim("arg");
        helpFormatter25.defaultOptPrefix = "--";
        helpFormatter25.setOptPrefix("-");
        helpFormatter25.setDescPadding(1);
        java.lang.String str34 = helpFormatter25.defaultLongOptPrefix;
        int int35 = helpFormatter25.getLeftPadding();
        java.lang.String str37 = helpFormatter25.createPadding((int) '4');
        int int38 = helpFormatter25.defaultLeftPad;
        java.util.Comparator comparator39 = helpFormatter25.getOptionComparator();
        helpFormatter18.setOptionComparator(comparator39);
        helpFormatter0.optionComparator = comparator39;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "arg" + "'", str20, "arg");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-" + "'", str24, "-");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "arg" + "'", str27, "arg");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "--" + "'", str34, "--");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "                                                    " + "'", str37, "                                                    ");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(comparator39);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
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
        java.lang.String str25 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-" + "'", str19, "-");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "usage: " + "'", str24, "usage: ");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-" + "'", str25, "-");
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultDescPad = (short) 100;
        java.util.Comparator comparator11 = helpFormatter0.optionComparator;
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setLeftPadding((int) (short) 100);
        java.lang.String str15 = helpFormatter0.getArgName();
        java.lang.String str16 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter17 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter17, (int) (byte) 100, "                                                                                                    ", "                                                                   ", options21, 100, 12, "                                ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setNewLine("-");
        int int8 = helpFormatter0.defaultDescPad;
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultSyntaxPrefix = "--";
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator8 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultWidth = 35;
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.defaultWidth = 3;
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter10, 10, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
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
        org.apache.commons.cli.Options options25 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", options25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
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
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        helpFormatter0.setLeftPadding(0);
        java.lang.String str7 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        int int10 = helpFormatter0.getWidth();
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultLongOptPrefix = "                                                    ";
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = helpFormatter0.renderOptions(stringBuffer14, 35, options16, 100, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
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
        int int19 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultLeftPad = (short) 100;
        helpFormatter0.setLeftPadding((int) (byte) 100);
        int int15 = helpFormatter0.getWidth();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
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
        java.lang.String str19 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-" + "'", str19, "-");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
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
        helpFormatter0.defaultSyntaxPrefix = "  ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultArgName = "                                                                                                    ";
        helpFormatter0.setArgName("");
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(100, "         ", "                                                                         ", options12, "                                                                         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("");
        int int6 = helpFormatter0.findWrapPos("\n", 1, (int) (byte) 100);
        helpFormatter0.defaultLeftPad = 3;
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = helpFormatter0.renderWrappedText(stringBuffer9, (int) (byte) 100, 9, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuffer.append(String)\" because \"sb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("\n");
        java.lang.String str10 = helpFormatter0.createPadding((int) (short) 100);
        helpFormatter0.setWidth((int) (byte) -1);
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultOptPrefix = "         ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                    " + "'", str10, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
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
        helpFormatter0.defaultSyntaxPrefix = " ";
        java.lang.String str18 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter19 = null;
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter19, 13, "-", options22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        int int10 = helpFormatter0.defaultDescPad;
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
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
        helpFormatter0.defaultNewLine = "             ";
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
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
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
        int int15 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.setArgName("--");
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        helpFormatter0.setOptPrefix("");
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.rtrim("--");
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultDescPad = (short) 10;
        helpFormatter0.setLongOptPrefix("                                   ");
        int int13 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultArgName = "                                                                                                 ";
        int int16 = helpFormatter0.defaultDescPad;
        int int17 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLeftPad = (short) 100;
        int int20 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
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
        java.util.Comparator comparator17 = helpFormatter0.optionComparator;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
        org.junit.Assert.assertNotNull(comparator17);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        java.util.Comparator comparator12 = helpFormatter0.optionComparator;
        int int13 = helpFormatter0.defaultDescPad;
        helpFormatter0.setSyntaxPrefix("                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        int int7 = helpFormatter0.findWrapPos("arg", 0, (int) ' ');
        int int11 = helpFormatter0.findWrapPos("          ", 1, 1);
        int int12 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter13, 0, "                                                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.rtrim("--");
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultOptPrefix = "";
        helpFormatter0.defaultArgName = "                                ";
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter13, (int) (byte) 1, "                                                                                                    ", "  ", options17, 52, 0, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultArgName = "arg";
        java.lang.String str13 = helpFormatter0.createPadding((int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                                    " + "'", str13, "                                                    ");
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
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
        java.lang.String str17 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        int int9 = helpFormatter0.findWrapPos(" ", (int) (short) 1, 10);
        java.util.Comparator comparator10 = helpFormatter0.optionComparator;
        helpFormatter0.defaultWidth = 73;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(comparator10);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix("usage: ");
        int int11 = helpFormatter0.findWrapPos("--", (int) 'a', 10);
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        int int13 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setDescPadding(0);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.getArgName();
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setOptPrefix("                                                                                                 ");
        helpFormatter0.defaultArgName = "hi!";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultDescPad = (short) -1;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        int int5 = helpFormatter0.defaultWidth;
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        int int7 = helpFormatter0.defaultWidth;
        java.lang.String str8 = helpFormatter0.getArgName();
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(13, "                                                                          ", "", options12, "                                                                         ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
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
        java.lang.String str21 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-" + "'", str21, "-");
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultDescPad = 0;
        int int12 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.defaultWidth = ' ';
        helpFormatter0.setDescPadding((int) (short) 10);
        helpFormatter0.setOptPrefix("                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultOptPrefix = "arg";
        helpFormatter0.setDescPadding((int) (short) 100);
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setWidth(3);
        helpFormatter0.defaultLeftPad = (short) 0;
        java.lang.String str14 = helpFormatter0.getSyntaxPrefix();
        java.lang.Class<?> wildcardClass15 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.getArgName();
        org.apache.commons.cli.HelpFormatter helpFormatter6 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str8 = helpFormatter6.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str11 = helpFormatter9.rtrim("arg");
        java.lang.String str12 = helpFormatter9.defaultSyntaxPrefix;
        java.lang.String str13 = helpFormatter9.defaultOptPrefix;
        java.util.Comparator comparator14 = helpFormatter9.getOptionComparator();
        helpFormatter6.optionComparator = comparator14;
        org.apache.commons.cli.HelpFormatter helpFormatter16 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str18 = helpFormatter16.rtrim("arg");
        java.lang.String str19 = helpFormatter16.defaultSyntaxPrefix;
        java.util.Comparator comparator20 = helpFormatter16.optionComparator;
        helpFormatter6.setOptionComparator(comparator20);
        helpFormatter6.setDescPadding((int) (byte) 1);
        org.apache.commons.cli.HelpFormatter helpFormatter24 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str26 = helpFormatter24.rtrim("arg");
        helpFormatter24.defaultWidth = (short) -1;
        java.lang.String str29 = helpFormatter24.defaultArgName;
        helpFormatter24.setSyntaxPrefix("arg");
        java.lang.String str32 = helpFormatter24.getLongOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter33 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str35 = helpFormatter33.rtrim("arg");
        java.lang.String str36 = helpFormatter33.defaultSyntaxPrefix;
        java.lang.String str37 = helpFormatter33.defaultOptPrefix;
        java.util.Comparator comparator38 = helpFormatter33.getOptionComparator();
        helpFormatter24.setOptionComparator(comparator38);
        helpFormatter6.setOptionComparator(comparator38);
        helpFormatter0.setOptionComparator(comparator38);
        java.lang.String str42 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "arg" + "'", str26, "arg");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "arg" + "'", str29, "arg");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "--" + "'", str32, "--");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "arg" + "'", str35, "arg");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "usage: " + "'", str36, "usage: ");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "-" + "'", str37, "-");
        org.junit.Assert.assertNotNull(comparator38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\n" + "'", str42, "\n");
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setLeftPadding(0);
        java.lang.String str5 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        int int5 = helpFormatter0.defaultWidth;
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter7 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str9 = helpFormatter7.rtrim("arg");
        helpFormatter7.defaultOptPrefix = "--";
        helpFormatter7.setOptPrefix("-");
        helpFormatter7.setDescPadding(1);
        java.lang.String str16 = helpFormatter7.defaultLongOptPrefix;
        int int17 = helpFormatter7.getLeftPadding();
        java.lang.String str19 = helpFormatter7.createPadding((int) '4');
        int int20 = helpFormatter7.defaultLeftPad;
        java.util.Comparator comparator21 = helpFormatter7.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator21);
        java.io.PrintWriter printWriter23 = null;
        org.apache.commons.cli.Options options27 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter23, 3, "         ", " ", options27, (int) (short) 1, 13, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                                    " + "'", str19, "                                                    ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(comparator21);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
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
        helpFormatter0.defaultLongOptPrefix = "          ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setSyntaxPrefix("hi!");
        int int9 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
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
        java.lang.String str16 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "usage: " + "'", str15, "usage: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
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
        java.lang.String str18 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.util.Comparator comparator9 = null;
        helpFormatter0.optionComparator = comparator9;
        int int14 = helpFormatter0.findWrapPos("hi!", (int) 'a', (int) (byte) -1);
        helpFormatter0.defaultLeftPad = 2;
        java.lang.String str17 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("         ", options19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage: " + "'", str17, "usage: ");
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
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
        java.util.Comparator comparator16 = helpFormatter0.getOptionComparator();
        java.util.Comparator comparator17 = helpFormatter0.getOptionComparator();
        java.lang.String str18 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(comparator16);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
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
        java.lang.String str32 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.Options options35 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", "            ", options35, "                                                                                                    ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-" + "'", str32, "-");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix("hi!");
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.defaultNewLine = "--";
        helpFormatter0.defaultOptPrefix = "                                                                                                    ";
        helpFormatter0.defaultArgName = "--";
        java.lang.String str17 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "--" + "'", str17, "--");
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix("hi!");
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.setOptPrefix("hi!");
        helpFormatter0.setNewLine("                                                                                                 ");
        java.lang.String str15 = helpFormatter0.getLongOptPrefix();
        java.lang.String str16 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultArgName = "                                                                                                    ";
        helpFormatter0.setArgName("");
        helpFormatter0.setWidth((int) (byte) 1);
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str13 = helpFormatter11.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter14 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str16 = helpFormatter14.rtrim("arg");
        java.lang.String str17 = helpFormatter14.defaultSyntaxPrefix;
        java.lang.String str18 = helpFormatter14.defaultOptPrefix;
        java.util.Comparator comparator19 = helpFormatter14.getOptionComparator();
        helpFormatter11.optionComparator = comparator19;
        helpFormatter11.defaultLeftPad = 74;
        helpFormatter11.setArgName(" ");
        java.util.Comparator comparator25 = helpFormatter11.getOptionComparator();
        helpFormatter0.optionComparator = comparator25;
        java.lang.String str27 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage: " + "'", str17, "usage: ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertNotNull(comparator25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "--" + "'", str27, "--");
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth(74);
        int int8 = helpFormatter0.getWidth();
        java.lang.String str10 = helpFormatter0.createPadding((int) (byte) 10);
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter12, (int) (byte) 0, "            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "          " + "'", str10, "          ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        helpFormatter0.setDescPadding(100);
        int int10 = helpFormatter0.findWrapPos("                                                                                                    ", (int) (byte) 0, 3);
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        helpFormatter0.setArgName("                                                                                                 ");
        helpFormatter0.setSyntaxPrefix("                                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(comparator11);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
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
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        helpFormatter0.defaultLeftPad = 'a';
        java.io.PrintWriter printWriter28 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter28, (int) '#', "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
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
        java.lang.String str16 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "          " + "'", str15, "          ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        int int9 = helpFormatter0.findWrapPos(" ", (int) (short) 1, 10);
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        java.lang.StringBuffer stringBuffer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = helpFormatter0.renderWrappedText(stringBuffer11, (int) (short) 0, (int) (short) 1, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = (byte) 100;
        int int8 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLeftPad = (byte) 0;
        helpFormatter0.setArgName("usage:");
        java.lang.String str14 = helpFormatter0.rtrim("hi!");
        helpFormatter0.defaultWidth = 74;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("            ", options18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str7 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLongOptPrefix = "";
        helpFormatter0.setSyntaxPrefix("  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultDescPad;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultDescPad = 2;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 0, "usage:", "           ", options15, "hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 7 out of bounds for length 7");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultWidth = 10;
        java.util.Comparator comparator13 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultDescPad = 3;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("   ", options17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertNotNull(comparator13);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setWidth(45);
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultNewLine = "-";
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter12, (int) ' ', "                                                                   ", options15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertNotNull(comparator9);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultDescPad = 0;
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setLeftPadding((int) (short) 100);
        helpFormatter0.setSyntaxPrefix("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.setArgName("          ");
        helpFormatter0.defaultLeftPad = (byte) 1;
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                 ";
        helpFormatter0.defaultNewLine = "   ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultArgName = "                                                                                                    ";
        org.apache.commons.cli.HelpFormatter helpFormatter7 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str9 = helpFormatter7.rtrim("arg");
        java.lang.String str10 = helpFormatter7.getNewLine();
        java.lang.String str11 = helpFormatter7.getOptPrefix();
        helpFormatter7.setNewLine("usage: ");
        helpFormatter7.setWidth(3);
        java.lang.String str16 = helpFormatter7.defaultArgName;
        int int17 = helpFormatter7.defaultWidth;
        helpFormatter7.setLongOptPrefix("usage: ");
        org.apache.commons.cli.HelpFormatter helpFormatter20 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str22 = helpFormatter20.rtrim("arg");
        helpFormatter20.defaultWidth = (short) -1;
        java.lang.String str25 = helpFormatter20.defaultArgName;
        helpFormatter20.setSyntaxPrefix("arg");
        helpFormatter20.setSyntaxPrefix("--");
        java.util.Comparator comparator30 = helpFormatter20.optionComparator;
        helpFormatter7.optionComparator = comparator30;
        helpFormatter0.optionComparator = comparator30;
        org.apache.commons.cli.HelpFormatter helpFormatter33 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str35 = helpFormatter33.rtrim("arg");
        java.lang.String str36 = helpFormatter33.defaultSyntaxPrefix;
        java.util.Comparator comparator37 = helpFormatter33.optionComparator;
        java.lang.String str38 = helpFormatter33.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter39 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str41 = helpFormatter39.rtrim("arg");
        helpFormatter39.defaultOptPrefix = "--";
        helpFormatter39.setOptPrefix("-");
        helpFormatter39.setDescPadding(1);
        java.util.Comparator comparator48 = helpFormatter39.getOptionComparator();
        helpFormatter33.optionComparator = comparator48;
        helpFormatter0.optionComparator = comparator48;
        int int51 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.Options options54 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                ", " ", options54, "             ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "arg" + "'", str22, "arg");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "arg" + "'", str25, "arg");
        org.junit.Assert.assertNotNull(comparator30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "arg" + "'", str35, "arg");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "usage: " + "'", str36, "usage: ");
        org.junit.Assert.assertNotNull(comparator37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-" + "'", str38, "-");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "arg" + "'", str41, "arg");
        org.junit.Assert.assertNotNull(comparator48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
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
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        helpFormatter0.setWidth((int) '#');
        int int28 = helpFormatter0.defaultLeftPad;
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        helpFormatter0.setLeftPadding((int) '4');
        helpFormatter0.setLongOptPrefix("\n");
        java.util.Comparator comparator11 = helpFormatter0.optionComparator;
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter12, 3, "usage: ", options15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator11);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.defaultArgName = "                                   ";
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = (byte) 100;
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
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
        helpFormatter0.setNewLine("                                ");
        org.apache.commons.cli.HelpFormatter helpFormatter23 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter23.defaultOptPrefix = "hi!";
        int int29 = helpFormatter23.findWrapPos("--", (int) '#', (int) (short) 100);
        helpFormatter23.defaultLeftPad = 0;
        java.util.Comparator comparator32 = helpFormatter23.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator32);
        int int34 = helpFormatter0.getDescPadding();
        java.lang.String str35 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(comparator32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "                                   " + "'", str35, "                                   ");
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.setSyntaxPrefix("                                   ");
        java.util.Comparator comparator10 = helpFormatter0.optionComparator;
        helpFormatter0.defaultLeftPad = (byte) -1;
        java.lang.String str14 = helpFormatter0.rtrim("");
        helpFormatter0.setOptPrefix(" ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setDescPadding(0);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str13 = helpFormatter0.rtrim("usage: ");
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 10, "         ", "         ", options17, "           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage:" + "'", str13, "usage:");
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "";
        helpFormatter0.setArgName("--");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultArgName = "                                                                                                    ";
        java.util.Comparator comparator7 = helpFormatter0.getOptionComparator();
        java.lang.String str8 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultArgName = "  ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertNotNull(comparator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                    " + "'", str8, "                                                                                                    ");
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
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
        int int30 = helpFormatter0.getDescPadding();
        int int31 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLongOptPrefix("                                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertNotNull(comparator26);
        org.junit.Assert.assertNotNull(comparator28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultSyntaxPrefix = "\n";
        java.lang.String str4 = helpFormatter0.defaultNewLine;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        int int6 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 10, "                                                                                       ", "                                                                         ", options12, "             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.rtrim("--");
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultDescPad = (short) 10;
        helpFormatter0.setLongOptPrefix("                                   ");
        int int13 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultArgName = "                                                                                                 ";
        int int16 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.HelpFormatter helpFormatter17 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str19 = helpFormatter17.rtrim("arg");
        helpFormatter17.defaultWidth = (short) -1;
        int int22 = helpFormatter17.defaultWidth;
        java.lang.String str23 = helpFormatter17.defaultOptPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter24 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str26 = helpFormatter24.rtrim("arg");
        helpFormatter24.defaultOptPrefix = "--";
        helpFormatter24.setOptPrefix("-");
        helpFormatter24.setDescPadding(1);
        java.lang.String str33 = helpFormatter24.defaultLongOptPrefix;
        int int34 = helpFormatter24.getLeftPadding();
        java.lang.String str36 = helpFormatter24.createPadding((int) '4');
        int int37 = helpFormatter24.defaultLeftPad;
        java.util.Comparator comparator38 = helpFormatter24.getOptionComparator();
        helpFormatter17.setOptionComparator(comparator38);
        helpFormatter0.setOptionComparator(comparator38);
        helpFormatter0.setLeftPadding((int) '#');
        org.apache.commons.cli.Options options45 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                 ", "          ", options45, "                                                    ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 104");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "arg" + "'", str26, "arg");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "--" + "'", str33, "--");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "                                                    " + "'", str36, "                                                    ");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(comparator38);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
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
        java.lang.String str25 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultDescPad = 74;
        org.apache.commons.cli.Options options30 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                       ", " ", options30, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "usage: " + "'", str20, "usage: ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-" + "'", str21, "-");
        org.junit.Assert.assertNotNull(comparator22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultWidth = 10;
        helpFormatter0.setDescPadding((int) (byte) 0);
        helpFormatter0.setNewLine("                                                                         ");
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("             ", "hi!", options19, "                                                                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth(74);
        helpFormatter0.setArgName("-");
        helpFormatter0.defaultLeftPad = '4';
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setLongOptPrefix("hi!");
        java.util.Comparator comparator9 = helpFormatter0.optionComparator;
        helpFormatter0.defaultArgName = "usage:";
        java.lang.String str12 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter13, 3, options15, 35, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage:" + "'", str12, "usage:");
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setLongOptPrefix("hi!");
        java.util.Comparator comparator9 = helpFormatter0.optionComparator;
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setOptPrefix("usage:");
        int int14 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultSyntaxPrefix = "";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
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
        helpFormatter0.defaultWidth = 45;
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
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
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
        helpFormatter0.setLongOptPrefix("                                                    ");
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
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLongOptPrefix("hi!");
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str12 = helpFormatter10.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str15 = helpFormatter13.rtrim("arg");
        java.lang.String str16 = helpFormatter13.defaultSyntaxPrefix;
        java.lang.String str17 = helpFormatter13.defaultOptPrefix;
        java.util.Comparator comparator18 = helpFormatter13.getOptionComparator();
        helpFormatter10.optionComparator = comparator18;
        int int23 = helpFormatter10.findWrapPos("usage: ", 3, (int) (short) 10);
        org.apache.commons.cli.HelpFormatter helpFormatter24 = new org.apache.commons.cli.HelpFormatter();
        int int25 = helpFormatter24.defaultDescPad;
        helpFormatter24.defaultSyntaxPrefix = "\n";
        java.lang.String str28 = helpFormatter24.defaultNewLine;
        java.util.Comparator comparator29 = helpFormatter24.getOptionComparator();
        helpFormatter10.setOptionComparator(comparator29);
        helpFormatter0.setOptionComparator(comparator29);
        helpFormatter0.setLeftPadding(73);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertNotNull(comparator18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\n" + "'", str28, "\n");
        org.junit.Assert.assertNotNull(comparator29);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
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
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(13, "   ", "arg", options17, "                                                                          ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.defaultArgName;
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix("\n");
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator9 = helpFormatter0.optionComparator;
        helpFormatter0.setNewLine("usage:");
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                 ";
        helpFormatter0.defaultLongOptPrefix = "                                                                                                 ";
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter16, (int) (short) 100, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertNotNull(comparator9);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
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
        java.lang.String str17 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "  " + "'", str17, "  ");
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
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
        java.lang.String str32 = helpFormatter0.getOptPrefix();
        java.lang.String str33 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.Options options37 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(87, "", "-", options37, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-" + "'", str32, "-");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "arg" + "'", str33, "arg");
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
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
        java.io.PrintWriter printWriter36 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter36, 0, "                                                                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
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
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        int int3 = helpFormatter0.getDescPadding();
        java.lang.String str4 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        int int6 = helpFormatter0.findWrapPos("--", (int) '#', (int) (short) 100);
        java.lang.String str8 = helpFormatter0.createPadding((int) '#');
        helpFormatter0.setOptPrefix("");
        java.lang.String str12 = helpFormatter0.rtrim("usage: ");
        helpFormatter0.defaultSyntaxPrefix = "-";
        helpFormatter0.setWidth(73);
        helpFormatter0.defaultWidth = 35;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                   " + "'", str8, "                                   ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage:" + "'", str12, "usage:");
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultLeftPad = (short) 10;
        helpFormatter0.setArgName("\n");
        java.lang.String str13 = helpFormatter0.createPadding(45);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                             " + "'", str13, "                                             ");
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.getArgName();
        helpFormatter0.setNewLine("");
        java.lang.String str6 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.getArgName();
        helpFormatter0.defaultSyntaxPrefix = "-";
        java.lang.String str15 = helpFormatter0.createPadding(0);
        java.lang.String str16 = helpFormatter0.defaultArgName;
        java.lang.String str17 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
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
            helpFormatter0.printHelp("           ", "                                                                          ", options20, "usage: ");
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
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.getWidth();
        java.lang.String str9 = helpFormatter0.rtrim("arg");
        java.lang.String str10 = helpFormatter0.getNewLine();
        java.lang.String str11 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter12, 13, "             ", options15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
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
        java.lang.StringBuffer stringBuffer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer28 = helpFormatter0.renderWrappedText(stringBuffer24, 0, 35, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "\n";
        int int7 = helpFormatter0.defaultLeftPad;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
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
        helpFormatter0.defaultLongOptPrefix = "";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertNotNull(comparator14);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setDescPadding(0);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str13 = helpFormatter0.rtrim("usage: ");
        java.lang.String str14 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultDescPad = 73;
        org.apache.commons.cli.HelpFormatter helpFormatter17 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str19 = helpFormatter17.rtrim("arg");
        java.lang.String str20 = helpFormatter17.getNewLine();
        java.lang.String str21 = helpFormatter17.getOptPrefix();
        helpFormatter17.setOptPrefix("usage: ");
        int int24 = helpFormatter17.getLeftPadding();
        helpFormatter17.setDescPadding((int) (short) 100);
        java.util.Comparator comparator27 = helpFormatter17.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator27);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage:" + "'", str13, "usage:");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\n" + "'", str20, "\n");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-" + "'", str21, "-");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(comparator27);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        helpFormatter0.defaultLeftPad = (byte) 1;
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter13, 9, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        java.lang.String str5 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
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
        helpFormatter0.setLeftPadding(2);
        java.io.PrintWriter printWriter19 = null;
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter19, 9, "            ", "                                   ", options23, 73, 11, "                                                                                                 ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
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
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                 ", "\n", options18, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
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
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        java.util.Comparator comparator10 = helpFormatter0.optionComparator;
        helpFormatter0.defaultOptPrefix = "                                                                                                 ";
        helpFormatter0.defaultLeftPad = (byte) 100;
        int int15 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str7 = helpFormatter0.getNewLine();
        helpFormatter0.setOptPrefix("--");
        int int10 = helpFormatter0.defaultWidth;
        helpFormatter0.setLeftPadding((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        helpFormatter0.setLeftPadding((int) '4');
        helpFormatter0.setLongOptPrefix("\n");
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter11, (int) (byte) 0, "", "         ", options15, (int) (byte) 1, 3, "  ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
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
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer23 = helpFormatter0.renderWrappedText(stringBuffer19, (int) (short) 1, 0, "           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuffer.append(String)\" because \"sb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultOptPrefix = "arg";
        helpFormatter0.defaultOptPrefix = "arg";
        java.lang.String str10 = helpFormatter0.rtrim("arg");
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) ' ');
        helpFormatter0.defaultNewLine = "usage: ";
        helpFormatter0.setDescPadding((int) ' ');
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter11, 11, "arg", "                                ", options15, (int) (byte) 100, 12, "   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
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
        helpFormatter0.defaultArgName = "";
        helpFormatter0.defaultNewLine = "             ";
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
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultWidth;
        java.lang.String str6 = helpFormatter0.createPadding((int) (short) 10);
        helpFormatter0.defaultDescPad = (byte) -1;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                   ", options10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "          " + "'", str6, "          ");
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
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
        helpFormatter0.setLongOptPrefix("                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "usage: " + "'", str21, "usage: ");
        org.junit.Assert.assertNotNull(comparator22);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
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
        java.lang.String str18 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "usage: " + "'", str18, "usage: ");
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        helpFormatter0.defaultWidth = (byte) 0;
        helpFormatter0.defaultDescPad = (short) 0;
        helpFormatter0.defaultLongOptPrefix = "";
        helpFormatter0.setWidth((int) (short) 10);
        helpFormatter0.defaultLeftPad = 0;
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter16, 67, "                                                                                                 ", "          ", options20, 87, 2, "          ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str7 = helpFormatter0.defaultSyntaxPrefix;
        int int8 = helpFormatter0.defaultWidth;
        int int12 = helpFormatter0.findWrapPos("                                                                         ", (int) 'a', (int) (byte) 100);
        helpFormatter0.defaultArgName = "           ";
        java.lang.String str15 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "usage: " + "'", str15, "usage: ");
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        int int7 = helpFormatter0.findWrapPos("arg", 0, (int) ' ');
        helpFormatter0.setLeftPadding(100);
        helpFormatter0.defaultDescPad = (short) 100;
        int int12 = helpFormatter0.defaultLeftPad;
        java.util.Comparator comparator13 = helpFormatter0.optionComparator;
        java.lang.String str14 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultLongOptPrefix = "             ";
        java.lang.StringBuffer stringBuffer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer21 = helpFormatter0.renderWrappedText(stringBuffer17, (int) 'a', (int) (short) 1, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuffer.append(String)\" because \"sb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setLongOptPrefix("hi!");
        java.util.Comparator comparator14 = helpFormatter0.optionComparator;
        java.io.PrintWriter printWriter15 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter15, (int) ' ', "         ", "usage: ", options19, 35, 3, "         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertNotNull(comparator14);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        java.lang.String str8 = helpFormatter0.getNewLine();
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter10, (int) (byte) 0, 100, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
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
        helpFormatter0.defaultLeftPad = 2;
        helpFormatter0.defaultWidth = 13;
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
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
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
        org.apache.commons.cli.HelpFormatter helpFormatter28 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str30 = helpFormatter28.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter31 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str33 = helpFormatter31.rtrim("arg");
        java.lang.String str34 = helpFormatter31.defaultSyntaxPrefix;
        java.lang.String str35 = helpFormatter31.defaultOptPrefix;
        java.util.Comparator comparator36 = helpFormatter31.getOptionComparator();
        helpFormatter28.optionComparator = comparator36;
        int int41 = helpFormatter28.findWrapPos("usage: ", 3, (int) (short) 10);
        java.util.Comparator comparator42 = helpFormatter28.getOptionComparator();
        helpFormatter0.optionComparator = comparator42;
        int int44 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "--" + "'", str19, "--");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(comparator26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "arg" + "'", str30, "arg");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "arg" + "'", str33, "arg");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "usage: " + "'", str34, "usage: ");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-" + "'", str35, "-");
        org.junit.Assert.assertNotNull(comparator36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(comparator42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = (byte) 100;
        int int8 = helpFormatter0.getDescPadding();
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(67, "hi!", "usage:", options13, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setDescPadding(0);
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.setWidth((int) (short) 10);
        java.lang.String str12 = helpFormatter0.rtrim("\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("\n");
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str11 = helpFormatter9.rtrim("arg");
        helpFormatter9.defaultOptPrefix = "--";
        java.lang.String str14 = helpFormatter9.getLongOptPrefix();
        java.lang.String str15 = helpFormatter9.getNewLine();
        java.lang.String str16 = helpFormatter9.getOptPrefix();
        helpFormatter9.defaultLeftPad = (short) 10;
        org.apache.commons.cli.HelpFormatter helpFormatter19 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str21 = helpFormatter19.rtrim("arg");
        java.lang.String str22 = helpFormatter19.defaultSyntaxPrefix;
        java.util.Comparator comparator23 = helpFormatter19.optionComparator;
        java.lang.String str24 = helpFormatter19.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter25 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str27 = helpFormatter25.rtrim("arg");
        helpFormatter25.defaultOptPrefix = "--";
        helpFormatter25.setOptPrefix("-");
        helpFormatter25.setDescPadding(1);
        java.util.Comparator comparator34 = helpFormatter25.getOptionComparator();
        helpFormatter19.optionComparator = comparator34;
        helpFormatter9.optionComparator = comparator34;
        helpFormatter0.optionComparator = comparator34;
        int int38 = helpFormatter0.defaultLeftPad;
        java.lang.StringBuffer stringBuffer39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer43 = helpFormatter0.renderWrappedText(stringBuffer39, 0, (int) (short) 0, "                                                                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuffer.append(String)\" because \"sb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "usage: " + "'", str22, "usage: ");
        org.junit.Assert.assertNotNull(comparator23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-" + "'", str24, "-");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "arg" + "'", str27, "arg");
        org.junit.Assert.assertNotNull(comparator34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        int int9 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLeftPadding((int) (byte) -1);
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("             ", "", options14, "                                                                                                    ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
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
        int int31 = helpFormatter0.findWrapPos("                                                                   ", 13, (int) ' ');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "usage: " + "'", str20, "usage: ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-" + "'", str21, "-");
        org.junit.Assert.assertNotNull(comparator22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 45 + "'", int31 == 45);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.defaultWidth = 3;
        helpFormatter0.defaultOptPrefix = "";
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "-";
        java.util.Comparator comparator11 = helpFormatter0.optionComparator;
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str13 = helpFormatter0.getSyntaxPrefix();
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = helpFormatter0.renderOptions(stringBuffer14, 2, options16, (int) (short) 10, 87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
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
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
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
        helpFormatter0.setSyntaxPrefix("  ");
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) -1, "\n", "--", options23, "                                ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
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
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.defaultDescPad = (byte) -1;
        helpFormatter0.defaultLongOptPrefix = "";
        java.lang.String str17 = helpFormatter0.createPadding((int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                                    " + "'", str17, "                                                    ");
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
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
        java.lang.String str43 = helpFormatter0.getSyntaxPrefix();
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "usage: " + "'", str43, "usage: ");
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        int int10 = helpFormatter0.getDescPadding();
        int int14 = helpFormatter0.findWrapPos("", (int) (byte) 100, 0);
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = helpFormatter0.renderWrappedText(stringBuffer15, (int) ' ', (int) (short) 10, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuffer.append(String)\" because \"sb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        int int8 = helpFormatter0.defaultDescPad;
        java.lang.String str9 = helpFormatter0.defaultArgName;
        helpFormatter0.setArgName(" ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        int int10 = helpFormatter0.findWrapPos("", (int) (byte) 100, (int) (short) 0);
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        int int12 = helpFormatter0.defaultDescPad;
        java.lang.String str13 = helpFormatter0.getArgName();
        int int14 = helpFormatter0.getWidth();
        int int15 = helpFormatter0.getDescPadding();
        java.lang.String str16 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth(74);
        helpFormatter0.setArgName("-");
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str12 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultNewLine = "                                                                          ";
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", "", options17, "                                                                                       ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
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
        java.io.PrintWriter printWriter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter19, 67, "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = (byte) 100;
        java.lang.String str8 = helpFormatter0.getArgName();
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setSyntaxPrefix("                                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
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
        java.io.PrintWriter printWriter36 = null;
        org.apache.commons.cli.Options options38 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter36, 74, options38, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "arg" + "'", str27, "arg");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "arg" + "'", str30, "arg");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "arg" + "'", str31, "arg");
        org.junit.Assert.assertNotNull(comparator32);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
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
        java.lang.String str13 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
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
        java.io.PrintWriter printWriter50 = null;
        org.apache.commons.cli.Options options54 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter50, 74, "                                             ", "                                ", options54, 72, (int) (short) -1, "  ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        int int6 = helpFormatter0.findWrapPos("--", (int) '#', (int) (short) 100);
        helpFormatter0.setArgName("arg");
        helpFormatter0.defaultOptPrefix = "";
        java.lang.String str12 = helpFormatter0.rtrim("                                                                                                 ");
        int int13 = helpFormatter0.defaultWidth;
        java.lang.String str15 = helpFormatter0.rtrim("                                                                                                    ");
        int int16 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter5 = null;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter5, 67, "           ", "            ", options9, (int) 'a', (int) 'a', "   ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) ' ');
        helpFormatter0.defaultNewLine = "usage: ";
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultArgName = "hi!";
        java.lang.String str12 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultArgName = "                                                                                                    ";
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.setWidth((int) (short) 0);
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "                                   ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.lang.String str9 = helpFormatter0.defaultArgName;
        helpFormatter0.setLeftPadding((-1));
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str13 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str14 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
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
        org.apache.commons.cli.Options options47 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter45, 72, options47, 52, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
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
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix("\n");
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.setNewLine("   ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth(74);
        int int8 = helpFormatter0.getWidth();
        java.lang.String str10 = helpFormatter0.createPadding((int) (byte) 10);
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("         ", options13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "          " + "'", str10, "          ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
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
        helpFormatter0.defaultSyntaxPrefix = " ";
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("             ", options19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        int int10 = helpFormatter0.findWrapPos("", (int) (byte) 100, (int) (short) 0);
        int int11 = helpFormatter0.defaultDescPad;
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, (int) (short) 100, "                                                                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
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
        int int39 = helpFormatter0.getWidth();
        java.lang.String str40 = helpFormatter0.getArgName();
        java.lang.String str41 = helpFormatter0.defaultOptPrefix;
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 74 + "'", int39 == 74);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "arg" + "'", str40, "arg");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        int int10 = helpFormatter0.findWrapPos("", (int) (byte) 100, (int) (short) 0);
        java.lang.String str12 = helpFormatter0.rtrim("   ");
        helpFormatter0.setNewLine("                                                                                                    ");
        helpFormatter0.defaultNewLine = "                                                                                       ";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = helpFormatter0.createPadding((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.setArgName("--");
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator9 = helpFormatter0.optionComparator;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertNotNull(comparator9);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth(74);
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer12 = helpFormatter0.renderWrappedText(stringBuffer8, 100, 74, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuffer.append(String)\" because \"sb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str7 = helpFormatter0.defaultSyntaxPrefix;
        int int8 = helpFormatter0.defaultWidth;
        int int9 = helpFormatter0.getLeftPadding();
        int int10 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
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
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter13, 73, "--", "             ", options17, 45, (int) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        int int12 = helpFormatter0.findWrapPos("--", (int) ' ', 1);
        helpFormatter0.setWidth(0);
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter15, (int) (short) -1, 13, "   ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
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
        helpFormatter0.setWidth((int) ' ');
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
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
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
        int int26 = helpFormatter0.getDescPadding();
        int int27 = helpFormatter0.defaultDescPad;
        java.lang.String str28 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "arg" + "'", str28, "arg");
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setArgName("                                   ");
        int int7 = helpFormatter0.defaultWidth;
        helpFormatter0.setWidth(0);
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", "usage: ", options12, "usage: ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setLongOptPrefix("hi!");
        java.util.Comparator comparator9 = helpFormatter0.optionComparator;
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.defaultDescPad = 3;
        helpFormatter0.setOptPrefix("                                                                                       ");
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter16, (int) (byte) -1, "           ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 18");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertNotNull(comparator9);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) ' ');
        helpFormatter0.defaultNewLine = "usage: ";
        helpFormatter0.defaultLongOptPrefix = "hi!";
        int int11 = helpFormatter0.defaultWidth;
        java.lang.String str12 = helpFormatter0.defaultArgName;
        java.lang.String str14 = helpFormatter0.rtrim("                                                                   ");
        int int15 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultOptPrefix = "             ";
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                   ", "usage: ", options20, "            ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        int int8 = helpFormatter0.findWrapPos("", (int) (byte) 1, (int) (byte) 0);
        helpFormatter0.setArgName("usage: ");
        int int11 = helpFormatter0.defaultWidth;
        java.lang.String str12 = helpFormatter0.getArgName();
        int int13 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
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
        helpFormatter0.setDescPadding(67);
        java.util.Comparator comparator17 = helpFormatter0.getOptionComparator();
        java.util.Comparator comparator18 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                    " + "'", str12, "                                                    ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertNotNull(comparator18);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = (byte) 100;
        java.lang.String str8 = helpFormatter0.getArgName();
        helpFormatter0.setNewLine("-");
        int int11 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth(87);
        java.lang.String str15 = helpFormatter0.rtrim("                                                                                                    ");
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(52, "--", "                                                                   ", options19, "           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
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
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                         ", options17, false);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "usage: " + "'", str15, "usage: ");
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        org.apache.commons.cli.Options options6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", options6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.createPadding(32);
        helpFormatter0.setDescPadding(67);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                " + "'", str9, "                                ");
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
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
        int int17 = helpFormatter0.getWidth();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        int int9 = helpFormatter0.findWrapPos("-", (int) (short) 100, 74);
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str11 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(67, " ", "                                ", options15, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
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
        helpFormatter0.setLeftPadding(3);
        int int25 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 74 + "'", int25 == 74);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
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
        java.lang.String str32 = helpFormatter0.getOptPrefix();
        java.lang.String str33 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter34 = null;
        org.apache.commons.cli.Options options38 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter34, 11, "                                             ", "-", options38, (int) (short) 10, 72, "                                ");
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-" + "'", str32, "-");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "arg" + "'", str33, "arg");
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter3 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str5 = helpFormatter3.rtrim("arg");
        java.lang.String str6 = helpFormatter3.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter3.defaultOptPrefix;
        java.util.Comparator comparator8 = helpFormatter3.getOptionComparator();
        helpFormatter0.optionComparator = comparator8;
        java.util.Comparator comparator10 = helpFormatter0.optionComparator;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                    ", options12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertNotNull(comparator10);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        int int9 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setArgName("arg");
        helpFormatter0.setDescPadding(45);
        java.io.PrintWriter printWriter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter18, 72, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setWidth(3);
        helpFormatter0.setLongOptPrefix("hi!");
        int int11 = helpFormatter0.defaultDescPad;
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter12, 87, "usage: ", options15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("");
        int int6 = helpFormatter0.findWrapPos("\n", 1, (int) (byte) 100);
        helpFormatter0.defaultLeftPad = 3;
        int int9 = helpFormatter0.defaultLeftPad;
        java.lang.Class<?> wildcardClass10 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        int int10 = helpFormatter0.findWrapPos("", (int) (byte) 100, (int) (short) 0);
        int int11 = helpFormatter0.defaultDescPad;
        java.lang.String str13 = helpFormatter0.rtrim("          ");
        int int14 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        java.util.Comparator comparator10 = helpFormatter0.optionComparator;
        java.lang.String str11 = helpFormatter0.defaultArgName;
        int int12 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.io.PrintWriter printWriter3 = null;
        org.apache.commons.cli.Options options6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter3, 2, "                                ", options6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setDescPadding(0);
        java.lang.String str8 = helpFormatter0.getNewLine();
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setOptPrefix("\n");
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = helpFormatter0.renderOptions(stringBuffer12, 100, options14, 0, 87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
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
        int int16 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
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
        java.lang.String str23 = helpFormatter0.defaultLongOptPrefix;
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "--" + "'", str23, "--");
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
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
        int int39 = helpFormatter0.findWrapPos("           ", (int) (byte) -1, (int) (short) 100);
        int int40 = helpFormatter0.getDescPadding();
        java.lang.String str41 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "arg" + "'", str27, "arg");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "arg" + "'", str30, "arg");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "arg" + "'", str31, "arg");
        org.junit.Assert.assertNotNull(comparator32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "--" + "'", str41, "--");
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
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
        java.io.PrintWriter printWriter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter17, 72, "           ");
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.defaultDescPad;
        java.lang.String str3 = helpFormatter0.rtrim(" ");
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        java.lang.String str6 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
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
        java.lang.String str15 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        int int9 = helpFormatter0.findWrapPos(" ", (int) (short) 1, 10);
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultNewLine = "                                                                          ";
        helpFormatter0.defaultArgName = " ";
        helpFormatter0.defaultDescPad = 11;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix("usage: ");
        int int11 = helpFormatter0.findWrapPos("arg", (int) (short) 0, 32);
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderWrappedText(stringBuffer12, 0, (int) '4', "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.lang.String str9 = helpFormatter0.defaultArgName;
        helpFormatter0.setLeftPadding((-1));
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultLeftPad = (byte) -1;
        java.lang.String str15 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.setArgName("--");
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLeftPadding(0);
        java.util.Comparator comparator10 = helpFormatter0.optionComparator;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertNotNull(comparator10);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        int int6 = helpFormatter0.findWrapPos("--", (int) '#', (int) (short) 100);
        helpFormatter0.defaultLeftPad = 0;
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.setLongOptPrefix("arg");
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", options14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
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
        helpFormatter0.defaultArgName = "usage:";
        org.apache.commons.cli.Options options52 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                   ", options52);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 70");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.getWidth();
        java.lang.String str9 = helpFormatter0.rtrim("arg");
        helpFormatter0.setArgName("\n");
        helpFormatter0.defaultWidth = 100;
        java.lang.String str14 = helpFormatter0.defaultArgName;
        int int15 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        int int10 = helpFormatter0.getDescPadding();
        int int11 = helpFormatter0.getLeftPadding();
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) ' ', "usage: ", "  ", options15, "           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setDescPadding(0);
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.setWidth((int) (short) 10);
        java.lang.String str11 = helpFormatter0.defaultArgName;
        int int12 = helpFormatter0.getDescPadding();
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = helpFormatter0.renderOptions(stringBuffer13, 9, options15, 9, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultLeftPad = (byte) 10;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.setSyntaxPrefix("                                   ");
        java.lang.String str11 = helpFormatter0.createPadding(12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "            " + "'", str11, "            ");
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultOptPrefix = "                                                    ";
        java.lang.String str11 = helpFormatter0.defaultArgName;
        int int12 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(45, "           ", "", options16, " ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
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
        java.lang.String str28 = helpFormatter0.getSyntaxPrefix();
        int int29 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "--" + "'", str19, "--");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(comparator26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "usage: " + "'", str28, "usage: ");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        int int11 = helpFormatter0.defaultWidth;
        helpFormatter0.setLeftPadding(73);
        int int17 = helpFormatter0.findWrapPos("                                                                          ", (int) 'a', 72);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
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
        helpFormatter0.setWidth((int) (byte) 0);
        java.lang.String str21 = helpFormatter0.getNewLine();
        java.util.Comparator comparator22 = helpFormatter0.getOptionComparator();
        java.lang.String str23 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n" + "'", str21, "\n");
        org.junit.Assert.assertNotNull(comparator22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "--" + "'", str23, "--");
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        int int8 = helpFormatter0.getWidth();
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        int int13 = helpFormatter0.findWrapPos("\n", 2, (int) (short) 1);
        helpFormatter0.setLongOptPrefix("          ");
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("-", options17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        java.lang.String str8 = helpFormatter0.getNewLine();
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                ", "                                ", options13, "           ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str4 = helpFormatter2.rtrim("arg");
        java.lang.String str5 = helpFormatter2.defaultSyntaxPrefix;
        helpFormatter2.setNewLine("hi!");
        helpFormatter2.defaultWidth = (byte) 0;
        helpFormatter2.defaultDescPad = (short) 0;
        int int15 = helpFormatter2.findWrapPos("\n", (int) (short) 0, (int) (short) 100);
        org.apache.commons.cli.HelpFormatter helpFormatter16 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str18 = helpFormatter16.rtrim("arg");
        helpFormatter16.defaultWidth = (short) -1;
        java.lang.String str21 = helpFormatter16.defaultArgName;
        java.lang.String str22 = helpFormatter16.defaultArgName;
        java.util.Comparator comparator23 = helpFormatter16.getOptionComparator();
        helpFormatter2.setOptionComparator(comparator23);
        helpFormatter0.optionComparator = comparator23;
        helpFormatter0.setWidth((int) (byte) 1);
        java.lang.String str29 = helpFormatter0.createPadding((int) (short) 0);
        java.io.PrintWriter printWriter30 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter30, 32, "                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "arg" + "'", str22, "arg");
        org.junit.Assert.assertNotNull(comparator23);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix("hi!");
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultNewLine = "             ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", options10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        int int6 = helpFormatter0.defaultWidth;
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultLongOptPrefix = "";
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", options12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultArgName = "                                                                                                    ";
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.setWidth((int) (short) 0);
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter10, (int) (byte) 1, "  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
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
        helpFormatter0.defaultWidth = (short) 0;
        helpFormatter0.setArgName("                                                                         ");
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
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
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
        java.lang.String str52 = helpFormatter0.getNewLine();
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
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\n" + "'", str52, "\n");
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
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
        helpFormatter0.setDescPadding(11);
        java.lang.Class<?> wildcardClass21 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.defaultOptPrefix = "hi!";
        java.util.Comparator comparator12 = helpFormatter0.optionComparator;
        helpFormatter0.setArgName("hi!");
        java.lang.String str15 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultDescPad;
        helpFormatter0.setDescPadding((int) (short) 100);
        helpFormatter0.setNewLine("                                                                                                    ");
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str14 = helpFormatter12.rtrim("arg");
        helpFormatter12.defaultOptPrefix = "--";
        helpFormatter12.setOptPrefix("-");
        helpFormatter12.setDescPadding(1);
        int int21 = helpFormatter12.getWidth();
        helpFormatter12.defaultArgName = "hi!";
        org.apache.commons.cli.HelpFormatter helpFormatter24 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str26 = helpFormatter24.rtrim("arg");
        java.lang.String str27 = helpFormatter24.getNewLine();
        java.lang.String str28 = helpFormatter24.getOptPrefix();
        helpFormatter24.setOptPrefix("usage: ");
        java.lang.String str31 = helpFormatter24.getNewLine();
        java.lang.String str33 = helpFormatter24.rtrim("hi!");
        helpFormatter24.setWidth(10);
        java.lang.String str36 = helpFormatter24.defaultArgName;
        org.apache.commons.cli.HelpFormatter helpFormatter37 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str39 = helpFormatter37.rtrim("arg");
        helpFormatter37.setSyntaxPrefix("-");
        java.lang.String str42 = helpFormatter37.getOptPrefix();
        java.lang.String str43 = helpFormatter37.defaultSyntaxPrefix;
        int int44 = helpFormatter37.defaultDescPad;
        int int45 = helpFormatter37.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter46 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str48 = helpFormatter46.rtrim("arg");
        java.lang.String str49 = helpFormatter46.defaultSyntaxPrefix;
        java.lang.String str50 = helpFormatter46.defaultOptPrefix;
        java.util.Comparator comparator51 = helpFormatter46.getOptionComparator();
        helpFormatter37.setOptionComparator(comparator51);
        helpFormatter24.optionComparator = comparator51;
        helpFormatter12.optionComparator = comparator51;
        helpFormatter0.setOptionComparator(comparator51);
        org.apache.commons.cli.Options options59 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) '#', "            ", "                                                                                                 ", options59, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 74 + "'", int21 == 74);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "arg" + "'", str26, "arg");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\n" + "'", str27, "\n");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-" + "'", str28, "-");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\n" + "'", str31, "\n");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "arg" + "'", str36, "arg");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "arg" + "'", str39, "arg");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "-" + "'", str42, "-");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "-" + "'", str43, "-");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "arg" + "'", str48, "arg");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "usage: " + "'", str49, "usage: ");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "-" + "'", str50, "-");
        org.junit.Assert.assertNotNull(comparator51);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        int int6 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.HelpFormatter helpFormatter7 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str9 = helpFormatter7.rtrim("arg");
        java.lang.String str10 = helpFormatter7.getNewLine();
        java.lang.String str11 = helpFormatter7.getOptPrefix();
        helpFormatter7.setNewLine("usage: ");
        java.lang.String str14 = helpFormatter7.defaultNewLine;
        org.apache.commons.cli.HelpFormatter helpFormatter15 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str17 = helpFormatter15.rtrim("arg");
        helpFormatter15.defaultOptPrefix = "--";
        helpFormatter15.setOptPrefix("-");
        helpFormatter15.setDescPadding(1);
        helpFormatter15.setDescPadding(0);
        java.lang.String str26 = helpFormatter15.defaultNewLine;
        java.lang.String str27 = helpFormatter15.getArgName();
        helpFormatter15.defaultNewLine = "-";
        int int33 = helpFormatter15.findWrapPos("          ", (int) (byte) -1, 1);
        org.apache.commons.cli.HelpFormatter helpFormatter34 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str36 = helpFormatter34.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter37 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str39 = helpFormatter37.rtrim("arg");
        java.lang.String str40 = helpFormatter37.defaultSyntaxPrefix;
        java.lang.String str41 = helpFormatter37.defaultOptPrefix;
        java.util.Comparator comparator42 = helpFormatter37.getOptionComparator();
        helpFormatter34.optionComparator = comparator42;
        int int47 = helpFormatter34.findWrapPos("usage: ", 3, (int) (short) 10);
        helpFormatter34.defaultArgName = "\n";
        java.lang.String str50 = helpFormatter34.defaultSyntaxPrefix;
        int int51 = helpFormatter34.getLeftPadding();
        java.util.Comparator comparator52 = helpFormatter34.getOptionComparator();
        helpFormatter15.setOptionComparator(comparator52);
        helpFormatter7.optionComparator = comparator52;
        helpFormatter0.setOptionComparator(comparator52);
        java.lang.Class<?> wildcardClass56 = comparator52.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\n" + "'", str26, "\n");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "arg" + "'", str27, "arg");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "arg" + "'", str36, "arg");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "arg" + "'", str39, "arg");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "usage: " + "'", str40, "usage: ");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "-" + "'", str41, "-");
        org.junit.Assert.assertNotNull(comparator42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "usage: " + "'", str50, "usage: ");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(comparator52);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
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
        java.io.PrintWriter printWriter40 = null;
        org.apache.commons.cli.Options options44 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter40, (int) (short) -1, "", "                                             ", options44, (int) '#', 0, "                                                                         ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.util.Comparator comparator5 = null;
        helpFormatter0.setOptionComparator(comparator5);
        helpFormatter0.setLeftPadding((int) (short) -1);
        java.lang.String str9 = helpFormatter0.getArgName();
        java.util.Comparator comparator10 = helpFormatter0.optionComparator;
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        java.lang.String str13 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                                                                                    " + "'", str13, "                                                                                                    ");
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setDescPadding(0);
        java.lang.String str8 = helpFormatter0.getNewLine();
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "usage:";
        helpFormatter0.setArgName("usage: ");
        helpFormatter0.defaultLongOptPrefix = "\n";
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter3 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str5 = helpFormatter3.rtrim("arg");
        java.lang.String str6 = helpFormatter3.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter3.defaultOptPrefix;
        java.util.Comparator comparator8 = helpFormatter3.getOptionComparator();
        helpFormatter0.optionComparator = comparator8;
        helpFormatter0.defaultLeftPad = 74;
        java.lang.String str12 = helpFormatter0.getArgName();
        java.lang.String str14 = helpFormatter0.createPadding(74);
        java.io.PrintWriter printWriter15 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter15, 0, options17, 0, 74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                          " + "'", str14, "                                                                          ");
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
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
        helpFormatter0.setOptPrefix("   ");
        helpFormatter0.defaultOptPrefix = "                                                                          ";
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
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setLongOptPrefix("hi!");
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        int int10 = helpFormatter0.findWrapPos("", (int) (byte) 100, (int) (short) 0);
        int int11 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = (short) 1;
        java.lang.String str14 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setArgName("                                   ");
        helpFormatter0.setNewLine("                                                                          ");
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(74, "                                                                                                 ", "-", options22, "         ");
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
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("");
        int int6 = helpFormatter0.findWrapPos("", (int) (short) 1, (int) (byte) 0);
        helpFormatter0.setNewLine("arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultArgName = "                                                                                                    ";
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter9, (int) 'a', (int) (byte) 0, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        java.lang.String str11 = helpFormatter0.defaultArgName;
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = (byte) 100;
        java.lang.String str8 = helpFormatter0.getArgName();
        helpFormatter0.setNewLine("-");
        int int14 = helpFormatter0.findWrapPos("", (-1), (int) ' ');
        helpFormatter0.setLeftPadding(87);
        helpFormatter0.defaultLeftPad = 52;
        helpFormatter0.defaultArgName = "                                                                                                    ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultWidth;
        java.lang.String str6 = helpFormatter0.rtrim("-");
        java.lang.String str7 = helpFormatter0.getArgName();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str12 = helpFormatter10.rtrim("arg");
        helpFormatter10.setSyntaxPrefix("-");
        java.lang.String str15 = helpFormatter10.getOptPrefix();
        int int16 = helpFormatter10.defaultDescPad;
        int int20 = helpFormatter10.findWrapPos("                                   ", (-1), (int) (short) 1);
        int int21 = helpFormatter10.getWidth();
        int int22 = helpFormatter10.getLeftPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter23 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str25 = helpFormatter23.rtrim("arg");
        helpFormatter23.defaultWidth = (short) -1;
        java.lang.String str28 = helpFormatter23.defaultArgName;
        helpFormatter23.setSyntaxPrefix("arg");
        helpFormatter23.setSyntaxPrefix("--");
        int int33 = helpFormatter23.getDescPadding();
        int int37 = helpFormatter23.findWrapPos("", (int) (byte) 100, 0);
        helpFormatter23.defaultWidth = (byte) 10;
        java.util.Comparator comparator40 = helpFormatter23.getOptionComparator();
        helpFormatter10.setOptionComparator(comparator40);
        helpFormatter0.optionComparator = comparator40;
        helpFormatter0.defaultSyntaxPrefix = " ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 74 + "'", int21 == 74);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "arg" + "'", str25, "arg");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "arg" + "'", str28, "arg");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(comparator40);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = (byte) 100;
        int int8 = helpFormatter0.getDescPadding();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.defaultNewLine = "usage: ";
        java.lang.String str13 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter14, 74, "                                                                          ", options17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
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
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        helpFormatter0.defaultLeftPad = 'a';
        org.apache.commons.cli.Options options31 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(0, "", "             ", options31, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setDescPadding(0);
        helpFormatter0.setSyntaxPrefix("            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) ' ');
        helpFormatter0.defaultNewLine = "usage: ";
        helpFormatter0.defaultLongOptPrefix = " ";
        helpFormatter0.setLeftPadding(67);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultArgName = "                                                                                                    ";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                    " + "'", str10, "                                                                                                    ");
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setSyntaxPrefix("\n");
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter10, (int) (short) 1, "arg", "                                   ", options14, 100, (-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.setSyntaxPrefix("\n");
        helpFormatter0.setSyntaxPrefix("         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
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
        helpFormatter0.setLongOptPrefix("arg");
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", options23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
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
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        helpFormatter0.defaultLeftPad = 'a';
        helpFormatter0.setLongOptPrefix("            ");
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
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        java.util.Comparator comparator10 = helpFormatter0.optionComparator;
        int int11 = helpFormatter0.defaultDescPad;
        int int12 = helpFormatter0.defaultLeftPad;
        java.lang.Class<?> wildcardClass13 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
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
        helpFormatter0.setDescPadding((int) '#');
        int int21 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
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
        java.util.Comparator comparator37 = helpFormatter0.getOptionComparator();
        org.apache.commons.cli.HelpFormatter helpFormatter38 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str40 = helpFormatter38.rtrim("arg");
        helpFormatter38.defaultWidth = (short) -1;
        java.lang.String str43 = helpFormatter38.defaultArgName;
        helpFormatter38.setSyntaxPrefix("arg");
        java.lang.String str46 = helpFormatter38.getLongOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter47 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str49 = helpFormatter47.rtrim("arg");
        java.lang.String str50 = helpFormatter47.defaultSyntaxPrefix;
        java.lang.String str51 = helpFormatter47.defaultOptPrefix;
        java.util.Comparator comparator52 = helpFormatter47.getOptionComparator();
        helpFormatter38.setOptionComparator(comparator52);
        helpFormatter0.setOptionComparator(comparator52);
        java.lang.String str55 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLongOptPrefix("-");
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
        org.junit.Assert.assertNotNull(comparator37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "arg" + "'", str40, "arg");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "arg" + "'", str43, "arg");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "--" + "'", str46, "--");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "arg" + "'", str49, "arg");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "usage: " + "'", str50, "usage: ");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "-" + "'", str51, "-");
        org.junit.Assert.assertNotNull(comparator52);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "-" + "'", str55, "-");
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
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
        java.lang.String str40 = helpFormatter0.defaultArgName;
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "arg" + "'", str40, "arg");
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
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
        int int29 = helpFormatter0.getDescPadding();
        helpFormatter0.setSyntaxPrefix("                                   ");
        java.lang.String str32 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setLeftPadding((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-" + "'", str26, "-");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "                                   " + "'", str32, "                                   ");
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix("hi!");
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.setOptPrefix("hi!");
        helpFormatter0.defaultArgName = "          ";
        java.lang.String str16 = helpFormatter0.createPadding(72);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                        " + "'", str16, "                                                                        ");
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
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
        java.lang.StringBuffer stringBuffer63 = null;
        org.apache.commons.cli.Options options65 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer68 = helpFormatter0.renderOptions(stringBuffer63, 32, options65, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
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
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
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
        java.lang.String str17 = helpFormatter0.getNewLine();
        int int18 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setLongOptPrefix("hi!");
        java.util.Comparator comparator9 = helpFormatter0.optionComparator;
        helpFormatter0.defaultArgName = "usage:";
        helpFormatter0.defaultWidth = (byte) 10;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertNotNull(comparator9);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        int int10 = helpFormatter0.findWrapPos("", (int) (byte) 100, (int) (short) 0);
        java.lang.String str12 = helpFormatter0.rtrim("   ");
        helpFormatter0.setNewLine("                                                                                                    ");
        helpFormatter0.defaultSyntaxPrefix = "                                   ";
        helpFormatter0.defaultLongOptPrefix = "                                                                                       ";
        java.io.PrintWriter printWriter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter19, 73, "             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
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
        helpFormatter0.defaultSyntaxPrefix = "                                                    ";
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("  ", "            ", options19, "                                                                                                    ");
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
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultNewLine = "arg";
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("  ");
        java.lang.String str11 = helpFormatter0.createPadding(13);
        helpFormatter0.defaultArgName = "   ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "             " + "'", str11, "             ");
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        int int8 = helpFormatter0.defaultDescPad;
        java.lang.String str9 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter10, (int) ' ', "                                                    ", "                                                                                                    ", options14, 0, (int) (byte) 0, "--", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.defaultNewLine = "                                                                   ";
        helpFormatter0.defaultOptPrefix = "             ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.defaultDescPad;
        java.lang.String str3 = helpFormatter0.rtrim(" ");
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        helpFormatter0.setOptPrefix("                                                                                                 ");
        helpFormatter0.setOptPrefix("   ");
        java.lang.String str11 = helpFormatter0.createPadding(0);
        helpFormatter0.defaultLongOptPrefix = "                                ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultWidth;
        java.lang.String str6 = helpFormatter0.rtrim("-");
        java.lang.String str7 = helpFormatter0.getArgName();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        int int10 = helpFormatter0.getLeftPadding();
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(12, " ", "   ", options14, "                                                                         ");
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
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
        helpFormatter0.defaultNewLine = "                                                                                                    ";
        java.lang.String str19 = helpFormatter0.rtrim("");
        java.lang.String str20 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultNewLine = "           ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-" + "'", str20, "-");
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setDescPadding(0);
        java.lang.String str9 = helpFormatter0.createPadding((int) (short) 10);
        helpFormatter0.defaultNewLine = "                                                                         ";
        int int12 = helpFormatter0.defaultLeftPad;
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str15 = helpFormatter13.rtrim("arg");
        helpFormatter13.defaultWidth = (short) -1;
        int int21 = helpFormatter13.findWrapPos("usage: ", 0, (int) '4');
        helpFormatter13.setSyntaxPrefix("");
        helpFormatter13.setDescPadding((int) (short) 1);
        java.util.Comparator comparator26 = helpFormatter13.optionComparator;
        helpFormatter0.optionComparator = comparator26;
        java.io.PrintWriter printWriter28 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter28, 72, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "          " + "'", str9, "          ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(comparator26);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        helpFormatter0.setDescPadding(100);
        int int10 = helpFormatter0.findWrapPos("                                                                                                    ", (int) (byte) 0, 3);
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultArgName = "                                                                          ";
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", " ", options16, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
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
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultLeftPad = (short) 10;
        int int13 = helpFormatter0.findWrapPos("arg", (int) (short) 0, (int) (short) 10);
        int int17 = helpFormatter0.findWrapPos("            ", 10, 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
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
        int int16 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultArgName = "                                   ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setDescPadding(0);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.getArgName();
        helpFormatter0.setLongOptPrefix("arg");
        helpFormatter0.setOptPrefix("                                                                                                 ");
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", options18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
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
        java.lang.String str16 = helpFormatter0.defaultNewLine;
        int int17 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        int int9 = helpFormatter0.findWrapPos("-", (int) (short) 100, 74);
        helpFormatter0.setArgName("          ");
        helpFormatter0.defaultSyntaxPrefix = "--";
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter14, (int) (short) 10, "          ", options17);
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
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int10 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultDescPad = 0;
        java.lang.String str13 = helpFormatter0.defaultLongOptPrefix;
        int int14 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
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
        java.lang.String str17 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage: " + "'", str17, "usage: ");
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
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
        java.lang.Class<?> wildcardClass28 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\n" + "'", str26, "\n");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "--" + "'", str27, "--");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        int int10 = helpFormatter0.getDescPadding();
        int int11 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = ' ';
        int int14 = helpFormatter0.getLeftPadding();
        java.util.Comparator comparator15 = helpFormatter0.optionComparator;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(comparator15);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.createPadding((int) (short) 0);
        java.io.PrintWriter printWriter7 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter7, (int) '#', "                                             ", options10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str10 = helpFormatter0.rtrim("  ");
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderOptions(stringBuffer11, 13, options13, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLongOptPrefix("\n");
        java.lang.String str10 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
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
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter16, 32, "usage: ", "", options20, 13, 32, " ", false);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        int int10 = helpFormatter0.findWrapPos("", (int) (byte) 100, (int) (short) 0);
        int int11 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setNewLine("");
        java.io.PrintWriter printWriter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter14, (int) '4', "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "\n";
        java.util.Comparator comparator7 = null;
        helpFormatter0.setOptionComparator(comparator7);
        java.lang.Class<?> wildcardClass9 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
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
        helpFormatter0.setOptPrefix("                                ");
        int int24 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        int int7 = helpFormatter0.findWrapPos("arg", 0, (int) ' ');
        helpFormatter0.setLeftPadding(100);
        int int10 = helpFormatter0.defaultWidth;
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setOptPrefix("                                   ");
        helpFormatter0.setLongOptPrefix("                                                                   ");
        helpFormatter0.setArgName("");
        helpFormatter0.setOptPrefix("             ");
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        java.lang.String str11 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLeftPad = ' ';
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
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
        java.io.PrintWriter printWriter26 = null;
        org.apache.commons.cli.Options options30 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter26, 87, "hi!", "                                             ", options30, 12, 0, " ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "usage: " + "'", str20, "usage: ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-" + "'", str21, "-");
        org.junit.Assert.assertNotNull(comparator22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 74 + "'", int25 == 74);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultWidth;
        java.lang.String str6 = helpFormatter0.createPadding((int) (short) 10);
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 1, "                                ", "           ", options11, "                                                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "          " + "'", str6, "          ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
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
        int int20 = helpFormatter0.findWrapPos("             ", (int) ' ', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setNewLine("\n");
        java.lang.String str11 = helpFormatter0.getSyntaxPrefix();
        int int12 = helpFormatter0.getDescPadding();
        java.lang.String str13 = helpFormatter0.getNewLine();
        helpFormatter0.defaultLeftPad = 67;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultDescPad;
        helpFormatter0.setDescPadding((int) (short) 100);
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        int int14 = helpFormatter0.findWrapPos("", 2, 74);
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                    ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setLongOptPrefix("\n");
        int int10 = helpFormatter0.findWrapPos("          ", 0, (int) 'a');
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("           ", "                                   ", options13, "                                                                         ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        int int10 = helpFormatter0.findWrapPos("", (int) (short) 0, 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        java.lang.String str5 = helpFormatter0.getArgName();
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("           ", "                                             ", options9, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
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
        helpFormatter0.defaultOptPrefix = " ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\n" + "'", str26, "\n");
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
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
        org.apache.commons.cli.Options options24 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter22, 12, options24, 52, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setLongOptPrefix("hi!");
        java.lang.String str14 = helpFormatter0.defaultArgName;
        java.lang.String str16 = helpFormatter0.createPadding(67);
        java.lang.Class<?> wildcardClass17 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                   " + "'", str16, "                                                                   ");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setDescPadding(0);
        int int8 = helpFormatter0.defaultWidth;
        helpFormatter0.setOptPrefix("usage:");
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", "                                                                                                 ", options13, "           ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        java.util.Comparator comparator10 = helpFormatter0.optionComparator;
        helpFormatter0.defaultOptPrefix = "                                                                                                 ";
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = helpFormatter0.renderWrappedText(stringBuffer15, (int) (short) -1, (int) (short) 100, "                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 45");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertNotNull(comparator10);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
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
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
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
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
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
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
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
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
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
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
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
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
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
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
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
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
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
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
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
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
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
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
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
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
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
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
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
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
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
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
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
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
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
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
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
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
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
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
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
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
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
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
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
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
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
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
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
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
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
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
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
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
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
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
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
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
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
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
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
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
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
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
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
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
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
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
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
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
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
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
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
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
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
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
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
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
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
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
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
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
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
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
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
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator11);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
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
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
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
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
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
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
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
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
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
}

