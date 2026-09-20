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
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.setLeftPadding((int) '4');
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("           ", options8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 18");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
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
        java.lang.String str13 = helpFormatter0.getArgName();
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                             ", options15, false);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultArgName = "                                                                                                    ";
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        java.lang.String str10 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                    " + "'", str10, "                                                                                                    ");
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setWidth((int) (byte) 1);
        int int7 = helpFormatter0.defaultDescPad;
        int int8 = helpFormatter0.defaultWidth;
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        helpFormatter0.defaultLeftPad = (byte) 1;
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.util.Comparator comparator13 = helpFormatter0.getOptionComparator();
        helpFormatter0.setDescPadding(32);
        java.lang.String str16 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.getWidth();
        java.lang.String str9 = helpFormatter0.rtrim("arg");
        helpFormatter0.setOptPrefix("hi!");
        java.util.Comparator comparator12 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertNotNull(comparator12);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
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
        java.lang.String str23 = helpFormatter0.rtrim("   ");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
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
        helpFormatter0.setLongOptPrefix("                                             ");
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
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setLeftPadding((int) '#');
        helpFormatter0.setArgName("");
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                       ", "                                                                        ", options12, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 94");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
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
        java.lang.String str24 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "arg" + "'", str24, "arg");
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
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
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter15, (int) (short) 100, 72, " ");
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
        org.junit.Assert.assertNotNull(comparator14);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
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
        helpFormatter0.defaultSyntaxPrefix = "                                                                          ";
        org.apache.commons.cli.HelpFormatter helpFormatter24 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str26 = helpFormatter24.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter27 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str29 = helpFormatter27.rtrim("arg");
        java.lang.String str30 = helpFormatter27.defaultSyntaxPrefix;
        java.lang.String str31 = helpFormatter27.defaultOptPrefix;
        java.util.Comparator comparator32 = helpFormatter27.getOptionComparator();
        helpFormatter24.optionComparator = comparator32;
        int int37 = helpFormatter24.findWrapPos("usage: ", 3, (int) (short) 10);
        java.util.Comparator comparator38 = helpFormatter24.getOptionComparator();
        java.util.Comparator comparator39 = helpFormatter24.getOptionComparator();
        helpFormatter0.optionComparator = comparator39;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "arg" + "'", str26, "arg");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "arg" + "'", str29, "arg");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "usage: " + "'", str30, "usage: ");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-" + "'", str31, "-");
        org.junit.Assert.assertNotNull(comparator32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(comparator38);
        org.junit.Assert.assertNotNull(comparator39);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setDescPadding(0);
        java.lang.String str9 = helpFormatter0.createPadding((int) (short) 10);
        int int13 = helpFormatter0.findWrapPos("usage: ", 67, 45);
        java.util.Comparator comparator14 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "          " + "'", str9, "          ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(comparator14);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
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
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        java.lang.StringBuffer stringBuffer36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer40 = helpFormatter0.renderWrappedText(stringBuffer36, 72, 3, "                                                                            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuffer.append(String)\" because \"sb\" is null");
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
        org.junit.Assert.assertNotNull(comparator32);
        org.junit.Assert.assertNotNull(comparator33);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        int int6 = helpFormatter0.findWrapPos("--", (int) '#', (int) (short) 100);
        java.lang.String str8 = helpFormatter0.createPadding((int) '#');
        helpFormatter0.setSyntaxPrefix("                                                    ");
        int int11 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(45, "          ", "   ", options15, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:                                                      ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                   " + "'", str8, "                                   ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        int int10 = helpFormatter0.getDescPadding();
        java.lang.String str12 = helpFormatter0.rtrim("");
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str15 = helpFormatter13.rtrim("arg");
        java.lang.String str16 = helpFormatter13.getNewLine();
        helpFormatter13.defaultArgName = "usage: ";
        helpFormatter13.defaultDescPad = (byte) 100;
        int int21 = helpFormatter13.getDescPadding();
        helpFormatter13.defaultLeftPad = (byte) 0;
        helpFormatter13.setArgName("usage:");
        java.util.Comparator comparator26 = helpFormatter13.getOptionComparator();
        helpFormatter0.optionComparator = comparator26;
        int int31 = helpFormatter0.findWrapPos("-", 100, 13);
        int int32 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(comparator26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setLongOptPrefix("hi!");
        java.util.Comparator comparator14 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultLongOptPrefix = "           ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertNotNull(comparator14);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.getArgName();
        helpFormatter0.setLongOptPrefix("                                   ");
        int int17 = helpFormatter0.findWrapPos("                                   ", 11, 10);
        int int18 = helpFormatter0.defaultDescPad;
        int int19 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 21 + "'", int17 == 21);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix("\n");
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter10, 0, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setDescPadding(0);
        int int8 = helpFormatter0.getLeftPadding();
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        java.util.Comparator comparator10 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultOptPrefix = "          ";
        java.lang.String str13 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
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
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter16, 73, "                                                                          ", options19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultWidth;
        int int8 = helpFormatter0.getLeftPadding();
        int int12 = helpFormatter0.findWrapPos("          ", (int) ' ', 10);
        java.lang.String str13 = helpFormatter0.getLongOptPrefix();
        java.lang.String str14 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", options16);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.defaultArgName = "                                   ";
        helpFormatter0.setDescPadding((int) (byte) 100);
        helpFormatter0.setOptPrefix("         ");
        int int16 = helpFormatter0.findWrapPos("         ", 52, (int) (short) 10);
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("   ", options18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
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
        helpFormatter0.setNewLine("                                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
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
        java.lang.String str49 = helpFormatter0.defaultLongOptPrefix;
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
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "--" + "'", str49, "--");
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
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
        java.lang.String str21 = helpFormatter0.createPadding((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "          " + "'", str21, "          ");
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultArgName = "                                                    ";
        helpFormatter0.defaultLeftPad = (-1);
        int int14 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.util.Comparator comparator9 = null;
        helpFormatter0.optionComparator = comparator9;
        int int14 = helpFormatter0.findWrapPos("hi!", (int) 'a', (int) (byte) -1);
        helpFormatter0.setDescPadding((int) '#');
        org.apache.commons.cli.HelpFormatter helpFormatter17 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str19 = helpFormatter17.rtrim("arg");
        helpFormatter17.defaultOptPrefix = "--";
        helpFormatter17.setOptPrefix("-");
        helpFormatter17.setDescPadding(1);
        helpFormatter17.defaultDescPad = (short) 100;
        java.util.Comparator comparator28 = helpFormatter17.optionComparator;
        java.lang.String str30 = helpFormatter17.rtrim("\n");
        java.util.Comparator comparator31 = helpFormatter17.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator31);
        java.lang.String str33 = helpFormatter0.defaultLongOptPrefix;
        int int34 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertNotNull(comparator28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(comparator31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "--" + "'", str33, "--");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
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
        int int16 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        int int7 = helpFormatter0.findWrapPos("arg", 0, (int) ' ');
        helpFormatter0.setLeftPadding(100);
        java.lang.String str10 = helpFormatter0.getNewLine();
        int int11 = helpFormatter0.defaultDescPad;
        helpFormatter0.setNewLine("                                                                         ");
        java.io.PrintWriter printWriter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter14, 67, "             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        int int6 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setSyntaxPrefix("");
        java.lang.String str14 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                    ", options16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
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
        helpFormatter0.setOptPrefix("   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth(74);
        int int8 = helpFormatter0.getWidth();
        java.lang.String str10 = helpFormatter0.createPadding((int) (byte) 10);
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, 1, "                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
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
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("");
        helpFormatter0.defaultSyntaxPrefix = "arg";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
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
        helpFormatter0.setArgName("--");
        int int21 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
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
        int int29 = helpFormatter0.defaultLeftPad;
        java.lang.String str31 = helpFormatter0.rtrim("--");
        int int32 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "usage: " + "'", str22, "usage: ");
        org.junit.Assert.assertNotNull(comparator23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 74 + "'", int26 == 74);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "--" + "'", str31, "--");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.setArgName("--");
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
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
        helpFormatter0.defaultSyntaxPrefix = "                                                                                       ";
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
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        int int7 = helpFormatter0.findWrapPos("arg", 0, (int) ' ');
        int int11 = helpFormatter0.findWrapPos("          ", 1, 1);
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        int int13 = helpFormatter0.defaultLeftPad;
        org.apache.commons.cli.HelpFormatter helpFormatter14 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str16 = helpFormatter14.rtrim("arg");
        java.lang.String str17 = helpFormatter14.getNewLine();
        java.lang.String str18 = helpFormatter14.getOptPrefix();
        helpFormatter14.setNewLine("usage: ");
        helpFormatter14.setWidth(3);
        java.lang.String str23 = helpFormatter14.defaultArgName;
        int int24 = helpFormatter14.defaultWidth;
        helpFormatter14.setLongOptPrefix("usage: ");
        org.apache.commons.cli.HelpFormatter helpFormatter27 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str29 = helpFormatter27.rtrim("arg");
        helpFormatter27.defaultWidth = (short) -1;
        java.lang.String str32 = helpFormatter27.defaultArgName;
        helpFormatter27.setSyntaxPrefix("arg");
        helpFormatter27.setSyntaxPrefix("--");
        java.util.Comparator comparator37 = helpFormatter27.optionComparator;
        helpFormatter14.optionComparator = comparator37;
        helpFormatter0.optionComparator = comparator37;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "arg" + "'", str23, "arg");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "arg" + "'", str29, "arg");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "arg" + "'", str32, "arg");
        org.junit.Assert.assertNotNull(comparator37);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.defaultDescPad = (byte) -1;
        helpFormatter0.defaultLongOptPrefix = "";
        java.lang.String str16 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
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
        helpFormatter0.defaultArgName = " ";
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
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
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
        java.io.PrintWriter printWriter19 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter19, (int) (byte) 100, options21, 35, 73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        helpFormatter0.defaultWidth = (byte) 0;
        helpFormatter0.defaultDescPad = (short) 0;
        int int10 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (byte) 100);
        int int13 = helpFormatter0.defaultDescPad;
        int int14 = helpFormatter0.defaultWidth;
        java.lang.String str15 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        int int10 = helpFormatter0.getDescPadding();
        java.lang.String str12 = helpFormatter0.rtrim("");
        java.lang.Class<?> wildcardClass13 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
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
        helpFormatter0.setNewLine("                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertNotNull(comparator14);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
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
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setLongOptPrefix("             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "--" + "'", str19, "--");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(comparator26);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
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
        int int30 = helpFormatter0.getWidth();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 74 + "'", int30 == 74);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
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
        helpFormatter0.defaultOptPrefix = "   ";
        org.apache.commons.cli.Options options35 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(1, "", "                                                                   ", options35, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-" + "'", str26, "-");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultDescPad;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding((int) (byte) 1);
        helpFormatter0.setDescPadding((int) (short) -1);
        helpFormatter0.setSyntaxPrefix("usage: ");
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", options16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.getArgName();
        java.util.Comparator comparator7 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter8 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str10 = helpFormatter8.rtrim("arg");
        helpFormatter8.defaultWidth = (short) -1;
        java.lang.String str13 = helpFormatter8.defaultArgName;
        java.lang.String str14 = helpFormatter8.defaultArgName;
        helpFormatter8.setOptPrefix("hi!");
        helpFormatter8.defaultSyntaxPrefix = "usage: ";
        java.lang.String str19 = helpFormatter8.defaultNewLine;
        int int20 = helpFormatter8.defaultDescPad;
        java.lang.String str21 = helpFormatter8.getArgName();
        java.lang.String str22 = helpFormatter8.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter23 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str25 = helpFormatter23.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter26 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str28 = helpFormatter26.rtrim("arg");
        java.lang.String str29 = helpFormatter26.defaultSyntaxPrefix;
        java.lang.String str30 = helpFormatter26.defaultOptPrefix;
        java.util.Comparator comparator31 = helpFormatter26.getOptionComparator();
        helpFormatter23.optionComparator = comparator31;
        org.apache.commons.cli.HelpFormatter helpFormatter33 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str35 = helpFormatter33.rtrim("arg");
        java.lang.String str36 = helpFormatter33.defaultSyntaxPrefix;
        java.util.Comparator comparator37 = helpFormatter33.optionComparator;
        helpFormatter23.setOptionComparator(comparator37);
        helpFormatter23.setDescPadding((int) (byte) 1);
        java.lang.String str41 = helpFormatter23.defaultNewLine;
        helpFormatter23.setNewLine("--");
        org.apache.commons.cli.HelpFormatter helpFormatter44 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter44.defaultOptPrefix = "hi!";
        int int50 = helpFormatter44.findWrapPos("--", (int) '#', (int) (short) 100);
        helpFormatter44.defaultLeftPad = 0;
        java.util.Comparator comparator53 = helpFormatter44.getOptionComparator();
        helpFormatter23.optionComparator = comparator53;
        java.util.Comparator comparator55 = helpFormatter23.getOptionComparator();
        helpFormatter8.setOptionComparator(comparator55);
        helpFormatter0.optionComparator = comparator55;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertNotNull(comparator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n" + "'", str19, "\n");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "arg" + "'", str25, "arg");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "arg" + "'", str28, "arg");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "usage: " + "'", str29, "usage: ");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-" + "'", str30, "-");
        org.junit.Assert.assertNotNull(comparator31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "arg" + "'", str35, "arg");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "usage: " + "'", str36, "usage: ");
        org.junit.Assert.assertNotNull(comparator37);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\n" + "'", str41, "\n");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(comparator53);
        org.junit.Assert.assertNotNull(comparator55);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                 ";
        java.lang.String str7 = helpFormatter0.getNewLine();
        int int8 = helpFormatter0.getWidth();
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter12, (int) (short) 1, "arg", "   ", options16, 21, 9, "                                   ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.rtrim("--");
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultDescPad = (short) 10;
        helpFormatter0.setLongOptPrefix("                                   ");
        int int13 = helpFormatter0.getLeftPadding();
        java.lang.String str14 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
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
        helpFormatter0.setDescPadding((-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
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
        org.apache.commons.cli.HelpFormatter helpFormatter57 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str59 = helpFormatter57.rtrim("arg");
        java.lang.String str60 = helpFormatter57.defaultSyntaxPrefix;
        java.lang.String str61 = helpFormatter57.defaultOptPrefix;
        java.util.Comparator comparator62 = helpFormatter57.getOptionComparator();
        java.lang.String str63 = helpFormatter57.getLongOptPrefix();
        java.lang.String str64 = helpFormatter57.getNewLine();
        java.lang.String str65 = helpFormatter57.getLongOptPrefix();
        java.util.Comparator comparator66 = helpFormatter57.optionComparator;
        helpFormatter0.setOptionComparator(comparator66);
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
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "arg" + "'", str59, "arg");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "usage: " + "'", str60, "usage: ");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "-" + "'", str61, "-");
        org.junit.Assert.assertNotNull(comparator62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "--" + "'", str63, "--");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\n" + "'", str64, "\n");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "--" + "'", str65, "--");
        org.junit.Assert.assertNotNull(comparator66);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
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
        int int26 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
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
        java.lang.String str28 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "usage: " + "'", str28, "usage: ");
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        int int8 = helpFormatter0.findWrapPos("", (int) (byte) 1, (int) (byte) 0);
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setWidth((int) (short) -1);
        helpFormatter0.setLongOptPrefix("\n");
        java.lang.String str14 = helpFormatter0.getArgName();
        java.lang.String str15 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
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
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(74, "                                                                   ", "                                                                          ", options20, "                                                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertNotNull(comparator14);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                    ", "", options9, "                    ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultOptPrefix = "arg";
        helpFormatter0.setDescPadding((int) (short) 100);
        helpFormatter0.setSyntaxPrefix("                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        int int6 = helpFormatter0.findWrapPos("--", (int) '#', (int) (short) 100);
        helpFormatter0.setArgName("arg");
        helpFormatter0.defaultOptPrefix = "";
        java.lang.String str12 = helpFormatter0.rtrim("                                                                                                 ");
        helpFormatter0.defaultArgName = "                    ";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        int int6 = helpFormatter0.defaultWidth;
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultLongOptPrefix = "";
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = helpFormatter0.renderOptions(stringBuffer12, 0, options14, 9, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        helpFormatter0.setDescPadding(100);
        int int10 = helpFormatter0.findWrapPos("                                                                                                    ", (int) (byte) 0, 3);
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultLongOptPrefix = "arg";
        java.lang.String str14 = helpFormatter0.getNewLine();
        int int15 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter16, 1, options18, 2, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
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
        java.lang.String str16 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter17, 52, "                                                                                       ");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
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
        helpFormatter0.setOptPrefix("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        helpFormatter0.setSyntaxPrefix("   ");
        helpFormatter0.setNewLine("   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
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
        java.lang.String str14 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setDescPadding(0);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultWidth = (-1);
        helpFormatter0.setLeftPadding(10);
        int int16 = helpFormatter0.defaultLeftPad;
        org.apache.commons.cli.HelpFormatter helpFormatter17 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str19 = helpFormatter17.rtrim("arg");
        java.lang.String str20 = helpFormatter17.defaultSyntaxPrefix;
        helpFormatter17.setNewLine("hi!");
        helpFormatter17.defaultWidth = (byte) 0;
        helpFormatter17.defaultDescPad = (short) 0;
        helpFormatter17.defaultLongOptPrefix = "";
        int int29 = helpFormatter17.getWidth();
        java.lang.String str30 = helpFormatter17.getSyntaxPrefix();
        java.lang.String str31 = helpFormatter17.getSyntaxPrefix();
        helpFormatter17.defaultSyntaxPrefix = "                                ";
        helpFormatter17.defaultArgName = "   ";
        int int36 = helpFormatter17.getLeftPadding();
        java.util.Comparator comparator37 = helpFormatter17.optionComparator;
        helpFormatter0.optionComparator = comparator37;
        helpFormatter0.setNewLine("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "usage: " + "'", str20, "usage: ");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "usage: " + "'", str30, "usage: ");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "usage: " + "'", str31, "usage: ");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(comparator37);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.Class<?> wildcardClass10 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.getNewLine();
        int int8 = helpFormatter0.defaultLeftPad;
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
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
        java.lang.Class<?> wildcardClass31 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-" + "'", str26, "-");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        int int9 = helpFormatter0.findWrapPos(" ", (int) (short) 1, 10);
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultNewLine = "                                                                          ";
        helpFormatter0.defaultArgName = " ";
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter15, 72, "            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix("\n");
        helpFormatter0.setNewLine(" ");
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str12 = helpFormatter10.rtrim("arg");
        helpFormatter10.defaultOptPrefix = "--";
        helpFormatter10.setOptPrefix("-");
        helpFormatter10.setDescPadding(1);
        helpFormatter10.setDescPadding(0);
        java.lang.String str21 = helpFormatter10.defaultNewLine;
        java.lang.String str22 = helpFormatter10.getArgName();
        helpFormatter10.defaultNewLine = "-";
        java.lang.String str26 = helpFormatter10.rtrim("--");
        java.lang.String str27 = helpFormatter10.defaultNewLine;
        java.lang.String str28 = helpFormatter10.defaultNewLine;
        java.lang.String str29 = helpFormatter10.getOptPrefix();
        java.util.Comparator comparator30 = helpFormatter10.optionComparator;
        helpFormatter0.setOptionComparator(comparator30);
        java.lang.String str32 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n" + "'", str21, "\n");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "arg" + "'", str22, "arg");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "--" + "'", str26, "--");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-" + "'", str27, "-");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-" + "'", str28, "-");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-" + "'", str29, "-");
        org.junit.Assert.assertNotNull(comparator30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + " " + "'", str32, " ");
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
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
        int int16 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultOptPrefix = "arg";
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setSyntaxPrefix("--");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultArgName = "                                                                                                    ";
        int int7 = helpFormatter0.defaultWidth;
        int int8 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", "", options11, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        int int10 = helpFormatter0.findWrapPos("", (int) (byte) 100, (int) (short) 0);
        java.util.Comparator comparator11 = helpFormatter0.optionComparator;
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        int int7 = helpFormatter0.findWrapPos("arg", 0, (int) ' ');
        int int8 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = (byte) 100;
        int int8 = helpFormatter0.getDescPadding();
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "          ";
        helpFormatter0.setDescPadding(2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.getWidth();
        java.lang.String str9 = helpFormatter0.rtrim("arg");
        helpFormatter0.setArgName("\n");
        java.lang.String str12 = helpFormatter0.getArgName();
        java.lang.String str14 = helpFormatter0.createPadding((int) (byte) 1);
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                        ", options16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " " + "'", str14, " ");
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        int int8 = helpFormatter0.defaultDescPad;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        int int13 = helpFormatter0.findWrapPos("usage: ", (int) (byte) 100, (int) '#');
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", options15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:                                                                                                     arg");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str7 = helpFormatter0.getArgName();
        helpFormatter0.defaultArgName = "             ";
        java.lang.String str10 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "             " + "'", str10, "             ");
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultDescPad;
        int int8 = helpFormatter0.getDescPadding();
        int int9 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
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
        java.lang.String str41 = helpFormatter0.defaultLongOptPrefix;
        java.lang.Class<?> wildcardClass42 = helpFormatter0.getClass();
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "usage: " + "'", str41, "usage: ");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
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
        java.lang.String str19 = helpFormatter0.defaultNewLine;
        helpFormatter0.setNewLine("                                                                                                 ");
        int int22 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n" + "'", str19, "\n");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultDescPad = 0;
        helpFormatter0.setDescPadding(32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.String str9 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "                                                                          ";
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str14 = helpFormatter12.rtrim("arg");
        helpFormatter12.setSyntaxPrefix("-");
        java.util.Comparator comparator17 = null;
        helpFormatter12.setOptionComparator(comparator17);
        helpFormatter12.setLeftPadding((int) (short) -1);
        java.lang.String str21 = helpFormatter12.getArgName();
        int int22 = helpFormatter12.getLeftPadding();
        java.util.Comparator comparator23 = helpFormatter12.optionComparator;
        helpFormatter0.setOptionComparator(comparator23);
        org.apache.commons.cli.HelpFormatter helpFormatter25 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str27 = helpFormatter25.rtrim("arg");
        java.lang.String str28 = helpFormatter25.getNewLine();
        java.lang.String str29 = helpFormatter25.getOptPrefix();
        helpFormatter25.setNewLine("usage: ");
        org.apache.commons.cli.HelpFormatter helpFormatter32 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str34 = helpFormatter32.rtrim("arg");
        helpFormatter32.defaultOptPrefix = "--";
        helpFormatter32.setOptPrefix("-");
        helpFormatter32.setDescPadding(1);
        helpFormatter32.setDescPadding(0);
        java.lang.String str43 = helpFormatter32.defaultNewLine;
        java.lang.String str44 = helpFormatter32.getArgName();
        helpFormatter32.defaultNewLine = "-";
        helpFormatter32.setLongOptPrefix("");
        helpFormatter32.setLeftPadding((int) 'a');
        helpFormatter32.setLeftPadding((-1));
        int int53 = helpFormatter32.getDescPadding();
        helpFormatter32.setWidth((int) (short) 0);
        helpFormatter32.defaultSyntaxPrefix = "usage:";
        java.util.Comparator comparator58 = helpFormatter32.optionComparator;
        helpFormatter25.setOptionComparator(comparator58);
        helpFormatter0.optionComparator = comparator58;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(comparator23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "arg" + "'", str27, "arg");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\n" + "'", str28, "\n");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-" + "'", str29, "-");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "arg" + "'", str34, "arg");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\n" + "'", str43, "\n");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "arg" + "'", str44, "arg");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(comparator58);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
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
        java.io.PrintWriter printWriter21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter21, 2, (int) (byte) 1, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 87 + "'", int16 == 87);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
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
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(32, "             ", "                                                                                                    ", options18, "           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = (byte) 100;
        int int8 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLeftPad = (byte) 0;
        helpFormatter0.setArgName("usage:");
        java.util.Comparator comparator13 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultLeftPad = 1;
        helpFormatter0.setLeftPadding(74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(comparator13);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        helpFormatter0.defaultWidth = (byte) 0;
        helpFormatter0.defaultDescPad = (short) 0;
        int int10 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (byte) 100);
        helpFormatter0.setSyntaxPrefix("          ");
        java.util.Comparator comparator15 = null;
        helpFormatter0.optionComparator = comparator15;
        int int17 = helpFormatter0.getWidth();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix("hi!");
        int int9 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultSyntaxPrefix = "                                   ";
        helpFormatter0.defaultLongOptPrefix = "arg";
        int int14 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix("\n");
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setSyntaxPrefix("usage: ");
        helpFormatter0.defaultArgName = "usage:";
        java.lang.String str13 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
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
        java.lang.String str18 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(comparator16);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "          " + "'", str18, "          ");
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultWidth;
        java.lang.String str6 = helpFormatter0.rtrim("-");
        java.lang.String str7 = helpFormatter0.getArgName();
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        java.util.Comparator comparator9 = helpFormatter0.optionComparator;
        helpFormatter0.defaultArgName = "usage: ";
        int int12 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
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
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", options18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage:" + "'", str16, "usage:");
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "\n";
        helpFormatter0.setNewLine("                                                                         ");
        java.lang.String str10 = helpFormatter0.createPadding(11);
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "           " + "'", str10, "           ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
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
        java.lang.String str22 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "usage: " + "'", str22, "usage: ");
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.defaultArgName = "                                   ";
        helpFormatter0.setDescPadding((int) (byte) 100);
        java.util.Comparator comparator11 = helpFormatter0.optionComparator;
        helpFormatter0.setLeftPadding(45);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
        org.junit.Assert.assertNotNull(comparator11);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
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
        org.apache.commons.cli.Options options30 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("-", options30);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:        -");
        } catch (java.lang.RuntimeException e) {
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
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.setArgName("          ");
        helpFormatter0.defaultLeftPad = (byte) 1;
        helpFormatter0.defaultLeftPad = ' ';
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultWidth;
        int int8 = helpFormatter0.getLeftPadding();
        int int12 = helpFormatter0.findWrapPos("          ", (int) ' ', 10);
        java.lang.String str13 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "                                                                         ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
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
        java.util.Comparator comparator29 = helpFormatter0.optionComparator;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-" + "'", str26, "-");
        org.junit.Assert.assertNotNull(comparator29);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setArgName("arg");
        helpFormatter0.defaultDescPad = 73;
        int int18 = helpFormatter0.getWidth();
        helpFormatter0.setArgName("          ");
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        helpFormatter0.setOptPrefix("   ");
        java.io.PrintWriter printWriter25 = null;
        org.apache.commons.cli.Options options29 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter25, 3, "                                                                   ", " ", options29, 10, (int) (byte) 10, "usage:", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultSyntaxPrefix = "\n";
        helpFormatter0.defaultOptPrefix = "                                                                         ";
        helpFormatter0.defaultDescPad = 45;
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                         " + "'", str8, "                                                                         ");
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        java.lang.String str5 = helpFormatter0.getArgName();
        java.lang.String str6 = helpFormatter0.getArgName();
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setSyntaxPrefix("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.setArgName("--");
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter7, (int) (byte) 10, "                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        int int9 = helpFormatter0.getWidth();
        int int10 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setLeftPadding(13);
        int int13 = helpFormatter0.getWidth();
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = helpFormatter0.renderWrappedText(stringBuffer14, 0, 67, "                                                                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuffer.append(String)\" because \"sb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        helpFormatter0.setDescPadding(100);
        java.lang.String str7 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setLongOptPrefix("                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        int int8 = helpFormatter0.defaultLeftPad;
        int int12 = helpFormatter0.findWrapPos("                                                                                                 ", 76, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86 + "'", int12 == 86);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultArgName = "-";
        helpFormatter0.defaultLongOptPrefix = "\n";
        helpFormatter0.defaultOptPrefix = "          ";
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 0, "                                                                          ", "                                                                            ", options19, "         ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:         ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setNewLine("-");
        int int8 = helpFormatter0.defaultDescPad;
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        java.lang.String str10 = helpFormatter0.defaultArgName;
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertNotNull(comparator11);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
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
        java.util.Comparator comparator37 = helpFormatter0.getOptionComparator();
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
        org.junit.Assert.assertNotNull(comparator37);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
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
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(52, "                                                                        ", "           ", options19, "             ", false);
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
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        int int6 = helpFormatter0.findWrapPos("--", (int) '#', (int) (short) 100);
        helpFormatter0.defaultLeftPad = 0;
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        helpFormatter0.setNewLine("-");
        int int12 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
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
        helpFormatter0.setLeftPadding(10);
        java.lang.String str17 = helpFormatter0.rtrim("                                                    ");
        helpFormatter0.setLeftPadding((int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultLeftPad = (short) 10;
        int int13 = helpFormatter0.findWrapPos("arg", (int) (short) 0, (int) (short) 10);
        helpFormatter0.setArgName("hi!");
        int int16 = helpFormatter0.defaultWidth;
        java.lang.String str17 = helpFormatter0.defaultOptPrefix;
        int int18 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "--" + "'", str17, "--");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.util.Comparator comparator5 = null;
        helpFormatter0.setOptionComparator(comparator5);
        helpFormatter0.setLongOptPrefix("-");
        helpFormatter0.defaultDescPad = 73;
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, 12, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("\n");
        java.lang.String str10 = helpFormatter0.createPadding((int) (short) 100);
        helpFormatter0.setOptPrefix("                                                                                                    ");
        java.lang.String str14 = helpFormatter0.createPadding(12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                    " + "'", str10, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "            " + "'", str14, "            ");
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLongOptPrefix("hi!");
        helpFormatter0.defaultArgName = "                                ";
        int int12 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultDescPad;
        helpFormatter0.setDescPadding((int) (short) 100);
        helpFormatter0.setOptPrefix("                                                                                       ");
        java.lang.String str13 = helpFormatter0.rtrim("usage: ");
        helpFormatter0.defaultNewLine = "           ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage:" + "'", str13, "usage:");
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        int int8 = helpFormatter0.findWrapPos("", (int) (byte) 1, (int) (byte) 0);
        helpFormatter0.setArgName("usage: ");
        int int11 = helpFormatter0.defaultWidth;
        java.lang.String str12 = helpFormatter0.getArgName();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        java.lang.String str15 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "usage: " + "'", str15, "usage: ");
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
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
        int int17 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultArgName = "            ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.defaultWidth = ' ';
        java.lang.String str12 = helpFormatter0.getArgName();
        java.lang.String str13 = helpFormatter0.getOptPrefix();
        java.io.PrintWriter printWriter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter14, 9, "            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        int int7 = helpFormatter0.findWrapPos("arg", 0, (int) ' ');
        helpFormatter0.setLeftPadding(100);
        helpFormatter0.defaultDescPad = (short) 100;
        int int12 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setSyntaxPrefix("usage:");
        org.apache.commons.cli.HelpFormatter helpFormatter15 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str17 = helpFormatter15.rtrim("arg");
        java.lang.String str18 = helpFormatter15.defaultSyntaxPrefix;
        helpFormatter15.setNewLine("hi!");
        int int21 = helpFormatter15.getWidth();
        int int22 = helpFormatter15.getLeftPadding();
        helpFormatter15.defaultLongOptPrefix = "                                                                                                    ";
        java.util.Comparator comparator25 = helpFormatter15.getOptionComparator();
        helpFormatter0.optionComparator = comparator25;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "usage: " + "'", str18, "usage: ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 74 + "'", int21 == 74);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(comparator25);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
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
        java.io.PrintWriter printWriter51 = null;
        org.apache.commons.cli.Options options55 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter51, 0, "usage: ", "-", options55, (int) (short) 100, 74, "             ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int10 = helpFormatter0.defaultLeftPad;
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, (int) '4', "   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(comparator11);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
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
        java.lang.String str24 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertNotNull(comparator19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "arg" + "'", str23, "arg");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "arg" + "'", str24, "arg");
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.defaultArgName;
        int int10 = helpFormatter0.defaultWidth;
        helpFormatter0.setLongOptPrefix("usage: ");
        java.lang.String str13 = helpFormatter0.defaultArgName;
        java.lang.String str14 = helpFormatter0.getLongOptPrefix();
        int int15 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix("\n");
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setSyntaxPrefix("usage: ");
        helpFormatter0.defaultArgName = "usage:";
        java.lang.String str13 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
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
        java.io.PrintWriter printWriter52 = null;
        org.apache.commons.cli.Options options55 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter52, (int) (byte) 1, "-", options55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
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
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
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
        int int37 = helpFormatter0.getWidth();
        java.lang.Class<?> wildcardClass38 = helpFormatter0.getClass();
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 74 + "'", int37 == 74);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultNewLine = "                                   ";
        java.lang.String str14 = helpFormatter0.rtrim("                                                                          ");
        java.lang.Class<?> wildcardClass15 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
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
        java.lang.String str17 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(comparator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str7 = helpFormatter0.getNewLine();
        helpFormatter0.setOptPrefix("--");
        helpFormatter0.defaultDescPad = 0;
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, (int) (short) 1, "   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
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
        java.lang.StringBuffer stringBuffer18 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer23 = helpFormatter0.renderOptions(stringBuffer18, 76, options20, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
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
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
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
        java.lang.String str33 = helpFormatter0.getNewLine();
        java.lang.String str34 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLeftPadding((int) ' ');
        java.io.PrintWriter printWriter37 = null;
        org.apache.commons.cli.Options options40 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter37, 52, "           ", options40);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\n" + "'", str33, "\n");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "--" + "'", str34, "--");
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = (byte) 100;
        java.lang.String str8 = helpFormatter0.getArgName();
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = " ";
        helpFormatter0.setLongOptPrefix("                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.defaultWidth = 3;
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        int int11 = helpFormatter0.getDescPadding();
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str13 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(45, "         ", "                                                    ", options17, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
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
        helpFormatter0.setLeftPadding(32);
        java.lang.String str34 = helpFormatter0.createPadding((int) (short) 10);
        org.apache.commons.cli.Options options37 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", "          ", options37, "usage:", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "          " + "'", str34, "          ");
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.rtrim("--");
        int int8 = helpFormatter0.getWidth();
        int int9 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultOptPrefix = "                                             ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = (byte) 100;
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        int int9 = helpFormatter0.defaultDescPad;
        int int10 = helpFormatter0.getWidth();
        int int11 = helpFormatter0.defaultDescPad;
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = helpFormatter0.renderOptions(stringBuffer12, 13, options14, 73, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
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
        java.util.Comparator comparator43 = helpFormatter0.optionComparator;
        java.lang.String str44 = helpFormatter0.defaultNewLine;
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
        org.junit.Assert.assertNotNull(comparator43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\n" + "'", str44, "\n");
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        int int10 = helpFormatter0.findWrapPos("", (int) (byte) 100, (int) (short) 0);
        java.lang.String str11 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str14 = helpFormatter12.rtrim("arg");
        helpFormatter12.defaultWidth = (short) -1;
        java.lang.String str17 = helpFormatter12.defaultArgName;
        helpFormatter12.setSyntaxPrefix("arg");
        helpFormatter12.defaultOptPrefix = "                                   ";
        java.util.Comparator comparator22 = helpFormatter12.optionComparator;
        helpFormatter0.setOptionComparator(comparator22);
        helpFormatter0.defaultOptPrefix = "--";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
        org.junit.Assert.assertNotNull(comparator22);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        helpFormatter0.setDescPadding(100);
        java.lang.String str7 = helpFormatter0.defaultArgName;
        int int8 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultLongOptPrefix = "                                                                         ";
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((-1), "                                                                   ", "                                                                                                 ", options14, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultLeftPad = 0;
        java.util.Comparator comparator12 = helpFormatter0.optionComparator;
        java.lang.String str13 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultArgName = "                                                                                                    ";
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setNewLine("-");
        int int8 = helpFormatter0.defaultDescPad;
        int int9 = helpFormatter0.getLeftPadding();
        java.lang.String str11 = helpFormatter0.createPadding((int) 'a');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                 " + "'", str11, "                                                                                                 ");
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultArgName = "                                                    ";
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.defaultWidth = (short) 100;
        int int17 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                ", options19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
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
        java.lang.String str23 = helpFormatter0.getLongOptPrefix();
        java.lang.String str24 = helpFormatter0.defaultOptPrefix;
        int int25 = helpFormatter0.defaultLeftPad;
        java.lang.String str26 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultWidth = 21;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "usage: " + "'", str22, "usage: ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "--" + "'", str23, "--");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "arg" + "'", str24, "arg");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "arg" + "'", str26, "arg");
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultWidth;
        int int8 = helpFormatter0.getLeftPadding();
        int int12 = helpFormatter0.findWrapPos("          ", (int) ' ', 10);
        int int13 = helpFormatter0.getWidth();
        java.lang.String str15 = helpFormatter0.createPadding((int) (short) 100);
        helpFormatter0.defaultLongOptPrefix = "-";
        int int18 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                   ", options20);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                                                                                    " + "'", str15, "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
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
        helpFormatter0.defaultLeftPad = 35;
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
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        int int8 = helpFormatter0.defaultDescPad;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultSyntaxPrefix = "--";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = (byte) 100;
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        int int9 = helpFormatter0.defaultDescPad;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.defaultLongOptPrefix = "                                                                                       ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.lang.String str5 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultLongOptPrefix = "-";
        helpFormatter0.setSyntaxPrefix("\n");
        java.lang.String str11 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                ", options13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.defaultOptPrefix = "hi!";
        java.util.Comparator comparator12 = helpFormatter0.optionComparator;
        int int13 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultNewLine = "                                                                                                 ";
        helpFormatter0.setOptPrefix("   ");
        java.lang.String str18 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "--" + "'", str18, "--");
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
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
        java.io.PrintWriter printWriter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter19, (int) (short) 1, 20, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertNotNull(comparator15);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
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
        helpFormatter0.setWidth(1);
        java.lang.String str31 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.setArgName("--");
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
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
        java.lang.String str18 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(45);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 72 + "'", int17 == 72);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "usage: " + "'", str18, "usage: ");
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        java.lang.Class<?> wildcardClass9 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setLongOptPrefix("hi!");
        java.util.Comparator comparator9 = helpFormatter0.optionComparator;
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setArgName("\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertNotNull(comparator9);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.String str9 = helpFormatter0.getNewLine();
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter10, 100, (int) (short) 10, "                                                                         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
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
        helpFormatter0.setDescPadding(0);
        java.io.PrintWriter printWriter31 = null;
        org.apache.commons.cli.Options options35 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter31, 52, "                                                                                                    ", "arg", options35, 73, (int) '4', "         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
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
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
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
        helpFormatter0.defaultLongOptPrefix = "                                                                          ";
        helpFormatter0.setArgName("usage:");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
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
        java.lang.String str18 = helpFormatter0.defaultOptPrefix;
        int int19 = helpFormatter0.getLeftPadding();
        java.lang.String str21 = helpFormatter0.rtrim("hi!");
        helpFormatter0.defaultSyntaxPrefix = "                                                                   ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        int int10 = helpFormatter0.getDescPadding();
        int int14 = helpFormatter0.findWrapPos("", (int) (byte) 100, 0);
        int int15 = helpFormatter0.defaultDescPad;
        int int16 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setLongOptPrefix("hi!");
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter9, (int) (short) 0, "             ", "                                                                            ", options13, (int) '4', 100, "\n", false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:         ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.getOptPrefix();
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "                                                                        ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
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
        java.lang.String str24 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "arg" + "'", str24, "arg");
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
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
        java.lang.String str44 = helpFormatter0.defaultOptPrefix;
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "-" + "'", str44, "-");
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.getDescPadding();
        java.util.Comparator comparator9 = helpFormatter0.optionComparator;
        helpFormatter0.defaultNewLine = "         ";
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str14 = helpFormatter12.rtrim("arg");
        helpFormatter12.setSyntaxPrefix("-");
        java.lang.String str17 = helpFormatter12.getOptPrefix();
        helpFormatter12.setNewLine("");
        java.lang.String str20 = helpFormatter12.getArgName();
        helpFormatter12.setNewLine("-");
        helpFormatter12.defaultLongOptPrefix = "                                                    ";
        helpFormatter12.defaultLeftPad = (-1);
        org.apache.commons.cli.HelpFormatter helpFormatter27 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str29 = helpFormatter27.rtrim("arg");
        helpFormatter27.defaultOptPrefix = "--";
        helpFormatter27.setOptPrefix("-");
        helpFormatter27.setDescPadding(1);
        java.lang.String str36 = helpFormatter27.defaultLongOptPrefix;
        int int37 = helpFormatter27.getLeftPadding();
        java.lang.String str39 = helpFormatter27.createPadding((int) '4');
        int int43 = helpFormatter27.findWrapPos("                                                                                                    ", 74, 0);
        org.apache.commons.cli.HelpFormatter helpFormatter44 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str46 = helpFormatter44.rtrim("arg");
        helpFormatter44.defaultOptPrefix = "--";
        helpFormatter44.setOptPrefix("-");
        helpFormatter44.setDescPadding(1);
        int int53 = helpFormatter44.getWidth();
        org.apache.commons.cli.HelpFormatter helpFormatter54 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str56 = helpFormatter54.rtrim("arg");
        helpFormatter54.defaultOptPrefix = "--";
        helpFormatter54.setOptPrefix("-");
        helpFormatter54.setDescPadding(1);
        java.util.Comparator comparator63 = helpFormatter54.getOptionComparator();
        helpFormatter44.optionComparator = comparator63;
        helpFormatter27.setOptionComparator(comparator63);
        helpFormatter12.setOptionComparator(comparator63);
        helpFormatter0.optionComparator = comparator63;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "arg" + "'", str20, "arg");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "arg" + "'", str29, "arg");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "--" + "'", str36, "--");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "                                                    " + "'", str39, "                                                    ");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 74 + "'", int43 == 74);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "arg" + "'", str46, "arg");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 74 + "'", int53 == 74);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "arg" + "'", str56, "arg");
        org.junit.Assert.assertNotNull(comparator63);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
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
        helpFormatter0.setOptPrefix("-");
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
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
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
        helpFormatter0.setArgName("                                                                   ");
        java.io.PrintWriter printWriter23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter23, 1, "                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:         ");
        } catch (java.lang.RuntimeException e) {
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
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
        helpFormatter0.setWidth(1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        int int10 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        helpFormatter0.setDescPadding(32);
        int int18 = helpFormatter0.findWrapPos("usage:", 0, 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.lang.String str5 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultLongOptPrefix = "-";
        int int9 = helpFormatter0.defaultDescPad;
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str12 = helpFormatter0.rtrim("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setArgName("");
        java.lang.String str8 = helpFormatter0.getNewLine();
        java.lang.String str9 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        int int6 = helpFormatter0.findWrapPos("--", (int) '#', (int) (short) 100);
        helpFormatter0.defaultLeftPad = 0;
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.defaultArgName = "                                                                          ";
        helpFormatter0.defaultOptPrefix = "\n";
        helpFormatter0.setWidth(3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str7 = helpFormatter0.defaultArgName;
        int int8 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultDescPad = 73;
        helpFormatter0.setLeftPadding(1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
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
        int int22 = helpFormatter0.defaultLeftPad;
        java.lang.String str23 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.StringBuffer stringBuffer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer28 = helpFormatter0.renderWrappedText(stringBuffer24, 32, (int) (byte) -1, " ");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "usage: " + "'", str23, "usage: ");
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth(74);
        helpFormatter0.defaultLeftPad = 3;
        helpFormatter0.defaultLongOptPrefix = " ";
        java.lang.String str12 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " " + "'", str12, " ");
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        int int10 = helpFormatter0.getDescPadding();
        java.lang.String str11 = helpFormatter0.getArgName();
        java.util.Comparator comparator12 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertNotNull(comparator12);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultNewLine = "arg";
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setWidth(3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = (byte) 100;
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        int int9 = helpFormatter0.defaultDescPad;
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        helpFormatter0.defaultOptPrefix = "                                                                                                    ";
        java.lang.String str15 = helpFormatter0.defaultArgName;
        java.lang.String str16 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "usage: " + "'", str15, "usage: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultDescPad = (short) 100;
        java.util.Comparator comparator11 = helpFormatter0.optionComparator;
        int int15 = helpFormatter0.findWrapPos("                                                                   ", (int) (short) 0, 87);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        int int8 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        int int7 = helpFormatter0.findWrapPos("arg", 0, (int) ' ');
        helpFormatter0.setLeftPadding(100);
        helpFormatter0.defaultDescPad = (short) 100;
        helpFormatter0.setOptPrefix("\n");
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultArgName = "            ";
        java.util.Comparator comparator18 = helpFormatter0.getOptionComparator();
        java.lang.String str20 = helpFormatter0.rtrim("           ");
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("           ", "                                                                                       ", options23, "                                                                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(comparator18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
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
        helpFormatter0.defaultNewLine = "  ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
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
        int int25 = helpFormatter0.getWidth();
        java.lang.String str26 = helpFormatter0.defaultNewLine;
        helpFormatter0.setSyntaxPrefix("hi!");
        java.io.PrintWriter printWriter29 = null;
        org.apache.commons.cli.Options options33 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter29, 20, "                                   ", "--", options33, 21, 9, "");
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "          " + "'", str24, "          ");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 74 + "'", int25 == 74);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "--" + "'", str26, "--");
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("\n");
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        int int10 = helpFormatter0.getWidth();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
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
        helpFormatter0.setSyntaxPrefix("  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-" + "'", str19, "-");
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
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
        helpFormatter0.setDescPadding(52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
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
        int int17 = helpFormatter0.findWrapPos("            ", 72, (int) (byte) 0);
        int int18 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        int int7 = helpFormatter0.findWrapPos("arg", 0, (int) ' ');
        helpFormatter0.setLeftPadding(100);
        java.lang.String str10 = helpFormatter0.getNewLine();
        int int11 = helpFormatter0.defaultDescPad;
        helpFormatter0.setNewLine("                                                                         ");
        int int14 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
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
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setSyntaxPrefix(" ");
        java.lang.StringBuffer stringBuffer32 = null;
        org.apache.commons.cli.Options options34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer37 = helpFormatter0.renderOptions(stringBuffer32, 86, options34, (int) 'a', 13);
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
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        int int6 = helpFormatter0.getWidth();
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultWidth = '#';
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter11, (int) '#', "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultDescPad;
        int int8 = helpFormatter0.getDescPadding();
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        java.util.Comparator comparator10 = helpFormatter0.optionComparator;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(87, "                    ", " ", options14, "usage: ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertNotNull(comparator10);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.util.Comparator comparator9 = null;
        helpFormatter0.optionComparator = comparator9;
        int int14 = helpFormatter0.findWrapPos("hi!", (int) 'a', (int) (byte) -1);
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        java.lang.StringBuffer stringBuffer17 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = helpFormatter0.renderOptions(stringBuffer17, 0, options19, 52, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
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
        helpFormatter0.setLongOptPrefix("                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-" + "'", str26, "-");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        helpFormatter0.defaultLeftPad = (byte) 1;
        int int11 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("                                                    ");
        helpFormatter0.setDescPadding(10);
        int int16 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
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
        int int39 = helpFormatter0.defaultWidth;
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 74 + "'", int39 == 74);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultWidth = 0;
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
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
        java.lang.String str16 = helpFormatter0.createPadding((int) (byte) 1);
        java.util.Comparator comparator17 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultWidth = 74;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
        org.junit.Assert.assertNotNull(comparator17);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        int int9 = helpFormatter0.findWrapPos(" ", (int) (short) 1, 10);
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("                                ");
        java.lang.String str13 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
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
        helpFormatter0.defaultDescPad = (-1);
        java.util.Comparator comparator40 = helpFormatter0.optionComparator;
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
        org.junit.Assert.assertNotNull(comparator40);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) ' ');
        helpFormatter0.defaultNewLine = "usage: ";
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.defaultWidth = 13;
        helpFormatter0.defaultLeftPad = 67;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", "", options17, "             ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
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
        helpFormatter0.setLongOptPrefix("                                                                          ");
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
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
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
        java.lang.String str41 = helpFormatter0.defaultLongOptPrefix;
        int int45 = helpFormatter0.findWrapPos("                                                                                                    ", 32, (int) (byte) 0);
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "usage: " + "'", str41, "usage: ");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 32 + "'", int45 == 32);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
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
        java.io.PrintWriter printWriter23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter23, 1, "                                                                                       ");
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
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
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
        helpFormatter0.defaultDescPad = (short) 100;
        org.apache.commons.cli.Options options47 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", "          ", options47, "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
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
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = 1;
        int int10 = helpFormatter0.defaultDescPad;
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter11, (int) (short) 10, "                                                                   ", options14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
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
        java.lang.StringBuffer stringBuffer18 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer23 = helpFormatter0.renderOptions(stringBuffer18, 100, options20, 21, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
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
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str15 = helpFormatter13.rtrim("arg");
        java.lang.String str16 = helpFormatter13.defaultSyntaxPrefix;
        java.lang.String str17 = helpFormatter13.defaultOptPrefix;
        java.util.Comparator comparator18 = helpFormatter13.getOptionComparator();
        java.lang.String str19 = helpFormatter13.getLongOptPrefix();
        java.lang.String str20 = helpFormatter13.defaultOptPrefix;
        java.util.Comparator comparator21 = helpFormatter13.getOptionComparator();
        helpFormatter0.optionComparator = comparator21;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = helpFormatter0.createPadding((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertNotNull(comparator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "--" + "'", str19, "--");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-" + "'", str20, "-");
        org.junit.Assert.assertNotNull(comparator21);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        int int7 = helpFormatter0.findWrapPos("arg", 0, (int) ' ');
        helpFormatter0.setLeftPadding(100);
        helpFormatter0.defaultDescPad = (short) 100;
        helpFormatter0.setNewLine("  ");
        int int14 = helpFormatter0.defaultDescPad;
        java.util.Comparator comparator15 = helpFormatter0.optionComparator;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(comparator15);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        int int9 = helpFormatter0.findWrapPos(" ", (int) (short) 1, 10);
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = 1;
        int int13 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultOptPrefix = "                                                                   ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
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
        helpFormatter0.defaultOptPrefix = "usage: ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 74 + "'", int18 == 74);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-" + "'", str19, "-");
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.setArgName("\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultDescPad;
        int int8 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str11 = helpFormatter9.rtrim("arg");
        java.lang.String str12 = helpFormatter9.defaultSyntaxPrefix;
        java.lang.String str13 = helpFormatter9.defaultOptPrefix;
        java.util.Comparator comparator14 = helpFormatter9.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator14);
        java.lang.String str16 = helpFormatter0.getNewLine();
        int int17 = helpFormatter0.defaultDescPad;
        java.lang.String str18 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str20 = helpFormatter0.rtrim("                                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "--" + "'", str18, "--");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix("\n");
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator9 = helpFormatter0.optionComparator;
        helpFormatter0.setNewLine("usage:");
        org.apache.commons.cli.HelpFormatter helpFormatter12 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str14 = helpFormatter12.rtrim("arg");
        helpFormatter12.setSyntaxPrefix("-");
        java.util.Comparator comparator17 = null;
        helpFormatter12.setOptionComparator(comparator17);
        helpFormatter12.setLeftPadding((int) (short) -1);
        java.lang.String str21 = helpFormatter12.getArgName();
        java.util.Comparator comparator22 = helpFormatter12.optionComparator;
        helpFormatter0.setOptionComparator(comparator22);
        helpFormatter0.defaultDescPad = 11;
        java.lang.String str26 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
        org.junit.Assert.assertNotNull(comparator22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "usage:" + "'", str26, "usage:");
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
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
        java.lang.String str18 = helpFormatter0.rtrim("--");
        helpFormatter0.setDescPadding(76);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                    " + "'", str12, "                                                    ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "--" + "'", str18, "--");
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
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
        java.lang.String str27 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "--" + "'", str27, "--");
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
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
        helpFormatter0.defaultDescPad = (byte) 1;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertNotNull(comparator14);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.defaultDescPad;
        java.lang.String str3 = helpFormatter0.rtrim(" ");
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        helpFormatter0.setOptPrefix("                                                                                                 ");
        helpFormatter0.setOptPrefix("   ");
        java.lang.String str11 = helpFormatter0.createPadding(0);
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setArgName("                                   ");
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        int int8 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
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
        int int15 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        int int9 = helpFormatter0.getWidth();
        helpFormatter0.setSyntaxPrefix("arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultDescPad = (short) 100;
        java.util.Comparator comparator11 = helpFormatter0.optionComparator;
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setLeftPadding((int) (short) 100);
        int int15 = helpFormatter0.defaultLeftPad;
        int int16 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
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
        helpFormatter0.setNewLine("                                                    ");
        helpFormatter0.defaultLeftPad = 'a';
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
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        java.lang.String str8 = helpFormatter0.getNewLine();
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str11 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str12 = helpFormatter0.getNewLine();
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter13, (int) (byte) 1, "           ", " ", options17, 52, 76, "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:     ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        int int9 = helpFormatter0.findWrapPos("-", (int) (short) 100, 74);
        helpFormatter0.setNewLine("usage: ");
        int int12 = helpFormatter0.defaultLeftPad;
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str15 = helpFormatter13.rtrim("");
        int int16 = helpFormatter13.getLeftPadding();
        helpFormatter13.setOptPrefix("--");
        org.apache.commons.cli.HelpFormatter helpFormatter19 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str21 = helpFormatter19.rtrim("arg");
        helpFormatter19.defaultOptPrefix = "--";
        java.lang.String str24 = helpFormatter19.getLongOptPrefix();
        java.lang.String str25 = helpFormatter19.getNewLine();
        java.lang.String str26 = helpFormatter19.getOptPrefix();
        helpFormatter19.defaultLeftPad = (short) 10;
        org.apache.commons.cli.HelpFormatter helpFormatter29 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str31 = helpFormatter29.rtrim("arg");
        java.lang.String str32 = helpFormatter29.defaultSyntaxPrefix;
        java.util.Comparator comparator33 = helpFormatter29.optionComparator;
        java.lang.String str34 = helpFormatter29.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter35 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str37 = helpFormatter35.rtrim("arg");
        helpFormatter35.defaultOptPrefix = "--";
        helpFormatter35.setOptPrefix("-");
        helpFormatter35.setDescPadding(1);
        java.util.Comparator comparator44 = helpFormatter35.getOptionComparator();
        helpFormatter29.optionComparator = comparator44;
        helpFormatter19.optionComparator = comparator44;
        helpFormatter13.optionComparator = comparator44;
        helpFormatter0.optionComparator = comparator44;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "--" + "'", str24, "--");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\n" + "'", str25, "\n");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "--" + "'", str26, "--");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "arg" + "'", str31, "arg");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "usage: " + "'", str32, "usage: ");
        org.junit.Assert.assertNotNull(comparator33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-" + "'", str34, "-");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "arg" + "'", str37, "arg");
        org.junit.Assert.assertNotNull(comparator44);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
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
        helpFormatter0.defaultSyntaxPrefix = "arg";
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
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
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
        java.util.Comparator comparator15 = helpFormatter0.getOptionComparator();
        helpFormatter0.setLongOptPrefix("                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertNotNull(comparator15);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.setArgName("          ");
        helpFormatter0.defaultLeftPad = (byte) 1;
        helpFormatter0.defaultLongOptPrefix = "hi!";
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        java.util.Comparator comparator14 = helpFormatter0.optionComparator;
        java.lang.String str16 = helpFormatter0.rtrim("--");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("\n");
        java.lang.String str10 = helpFormatter0.createPadding((int) (short) 100);
        java.lang.String str12 = helpFormatter0.createPadding((int) 'a');
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str15 = helpFormatter13.rtrim("arg");
        java.lang.String str16 = helpFormatter13.defaultSyntaxPrefix;
        java.util.Comparator comparator17 = helpFormatter13.optionComparator;
        java.lang.String str18 = helpFormatter13.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter19 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str21 = helpFormatter19.rtrim("arg");
        helpFormatter19.defaultOptPrefix = "--";
        helpFormatter19.setOptPrefix("-");
        helpFormatter19.setDescPadding(1);
        java.util.Comparator comparator28 = helpFormatter19.getOptionComparator();
        helpFormatter13.optionComparator = comparator28;
        java.util.Comparator comparator30 = helpFormatter13.optionComparator;
        helpFormatter0.setOptionComparator(comparator30);
        helpFormatter0.setWidth((-1));
        java.lang.String str34 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                    " + "'", str10, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                 " + "'", str12, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
        org.junit.Assert.assertNotNull(comparator28);
        org.junit.Assert.assertNotNull(comparator30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "usage: " + "'", str34, "usage: ");
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
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
        org.apache.commons.cli.HelpFormatter helpFormatter20 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str22 = helpFormatter20.rtrim("arg");
        helpFormatter20.defaultOptPrefix = "--";
        java.lang.String str25 = helpFormatter20.getLongOptPrefix();
        java.lang.String str26 = helpFormatter20.getNewLine();
        java.lang.String str27 = helpFormatter20.getOptPrefix();
        helpFormatter20.defaultLeftPad = (short) 10;
        org.apache.commons.cli.HelpFormatter helpFormatter30 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str32 = helpFormatter30.rtrim("arg");
        java.lang.String str33 = helpFormatter30.defaultSyntaxPrefix;
        java.util.Comparator comparator34 = helpFormatter30.optionComparator;
        java.lang.String str35 = helpFormatter30.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter36 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str38 = helpFormatter36.rtrim("arg");
        helpFormatter36.defaultOptPrefix = "--";
        helpFormatter36.setOptPrefix("-");
        helpFormatter36.setDescPadding(1);
        java.util.Comparator comparator45 = helpFormatter36.getOptionComparator();
        helpFormatter30.optionComparator = comparator45;
        helpFormatter20.optionComparator = comparator45;
        java.util.Comparator comparator48 = helpFormatter20.optionComparator;
        helpFormatter0.optionComparator = comparator48;
        java.lang.String str50 = helpFormatter0.getLongOptPrefix();
        int int51 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 73 + "'", int19 == 73);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "arg" + "'", str22, "arg");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "--" + "'", str25, "--");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\n" + "'", str26, "\n");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "--" + "'", str27, "--");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "arg" + "'", str32, "arg");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "usage: " + "'", str33, "usage: ");
        org.junit.Assert.assertNotNull(comparator34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-" + "'", str35, "-");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "arg" + "'", str38, "arg");
        org.junit.Assert.assertNotNull(comparator45);
        org.junit.Assert.assertNotNull(comparator48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + " " + "'", str50, " ");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.getWidth();
        java.lang.String str9 = helpFormatter0.rtrim("arg");
        java.lang.String str10 = helpFormatter0.getNewLine();
        int int11 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str9 = helpFormatter0.rtrim("hi!");
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.createPadding((int) '4');
        helpFormatter0.defaultArgName = "   ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                    " + "'", str12, "                                                    ");
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setDescPadding(0);
        java.lang.String str8 = helpFormatter0.getNewLine();
        int int9 = helpFormatter0.getDescPadding();
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter10, (int) '4', (int) (byte) 10, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        int int10 = helpFormatter0.findWrapPos("", (int) (byte) 100, (int) (short) 0);
        java.lang.String str12 = helpFormatter0.rtrim("   ");
        helpFormatter0.setNewLine("                                                                                                    ");
        helpFormatter0.setSyntaxPrefix(" ");
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                            ", "                                                                                                 ", options19, "                    ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        int int10 = helpFormatter0.getDescPadding();
        java.lang.String str11 = helpFormatter0.getArgName();
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultNewLine = "  ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setSyntaxPrefix("hi!");
        int int9 = helpFormatter0.defaultWidth;
        java.lang.String str11 = helpFormatter0.createPadding(2);
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                 ";
        int int14 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "  " + "'", str11, "  ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                 ";
        java.lang.String str7 = helpFormatter0.getNewLine();
        int int8 = helpFormatter0.getWidth();
        helpFormatter0.setWidth(73);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.defaultArgName;
        int int10 = helpFormatter0.getWidth();
        java.lang.String str11 = helpFormatter0.getNewLine();
        helpFormatter0.defaultLongOptPrefix = "--";
        int int14 = helpFormatter0.getWidth();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
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
        java.lang.String str17 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = ' ';
        java.lang.String str20 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-" + "'", str20, "-");
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        java.util.Comparator comparator10 = helpFormatter0.optionComparator;
        java.lang.String str11 = helpFormatter0.defaultArgName;
        int int15 = helpFormatter0.findWrapPos(" ", 3, 3);
        java.lang.String str16 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertNotNull(comparator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
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
        helpFormatter0.setLongOptPrefix("   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultArgName = "\n";
        helpFormatter0.defaultNewLine = "arg";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultDescPad = (short) 100;
        java.lang.String str10 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
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
        int int60 = helpFormatter0.getDescPadding();
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
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 3 + "'", int60 == 3);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
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
        helpFormatter0.setLongOptPrefix("\n");
        org.apache.commons.cli.HelpFormatter helpFormatter18 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str20 = helpFormatter18.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter21 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str23 = helpFormatter21.rtrim("arg");
        java.lang.String str24 = helpFormatter21.defaultSyntaxPrefix;
        java.lang.String str25 = helpFormatter21.defaultOptPrefix;
        java.util.Comparator comparator26 = helpFormatter21.getOptionComparator();
        helpFormatter18.optionComparator = comparator26;
        org.apache.commons.cli.HelpFormatter helpFormatter28 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str30 = helpFormatter28.rtrim("arg");
        java.lang.String str31 = helpFormatter28.defaultSyntaxPrefix;
        java.util.Comparator comparator32 = helpFormatter28.optionComparator;
        helpFormatter18.setOptionComparator(comparator32);
        helpFormatter18.setDescPadding((int) (byte) 1);
        java.lang.String str36 = helpFormatter18.defaultNewLine;
        helpFormatter18.defaultSyntaxPrefix = "usage: ";
        helpFormatter18.setWidth(100);
        java.lang.String str41 = helpFormatter18.defaultArgName;
        org.apache.commons.cli.HelpFormatter helpFormatter42 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str44 = helpFormatter42.rtrim("arg");
        helpFormatter42.defaultWidth = (short) -1;
        java.lang.String str47 = helpFormatter42.defaultArgName;
        helpFormatter42.setSyntaxPrefix("arg");
        helpFormatter42.setSyntaxPrefix("--");
        int int52 = helpFormatter42.getDescPadding();
        java.lang.String str53 = helpFormatter42.getArgName();
        int int54 = helpFormatter42.getDescPadding();
        helpFormatter42.setSyntaxPrefix("                                   ");
        org.apache.commons.cli.HelpFormatter helpFormatter57 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str59 = helpFormatter57.rtrim("arg");
        java.lang.String str60 = helpFormatter57.getNewLine();
        java.lang.String str61 = helpFormatter57.getOptPrefix();
        helpFormatter57.setNewLine("usage: ");
        helpFormatter57.setWidth(3);
        helpFormatter57.defaultLeftPad = (byte) 1;
        helpFormatter57.defaultLongOptPrefix = "arg";
        java.util.Comparator comparator70 = helpFormatter57.optionComparator;
        helpFormatter42.optionComparator = comparator70;
        helpFormatter18.setOptionComparator(comparator70);
        helpFormatter0.setOptionComparator(comparator70);
        helpFormatter0.defaultDescPad = 'a';
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "arg" + "'", str20, "arg");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "arg" + "'", str23, "arg");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "usage: " + "'", str24, "usage: ");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-" + "'", str25, "-");
        org.junit.Assert.assertNotNull(comparator26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "arg" + "'", str30, "arg");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "usage: " + "'", str31, "usage: ");
        org.junit.Assert.assertNotNull(comparator32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\n" + "'", str36, "\n");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "arg" + "'", str41, "arg");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "arg" + "'", str44, "arg");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "arg" + "'", str47, "arg");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "arg" + "'", str53, "arg");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 3 + "'", int54 == 3);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "arg" + "'", str59, "arg");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\n" + "'", str60, "\n");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "-" + "'", str61, "-");
        org.junit.Assert.assertNotNull(comparator70);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
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
        java.lang.String str24 = helpFormatter0.getSyntaxPrefix();
        java.util.Comparator comparator25 = helpFormatter0.optionComparator;
        helpFormatter0.setArgName("                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "usage: " + "'", str21, "usage: ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "arg" + "'", str24, "arg");
        org.junit.Assert.assertNull(comparator25);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        java.util.Comparator comparator10 = helpFormatter0.optionComparator;
        helpFormatter0.defaultOptPrefix = "                                                                                                 ";
        helpFormatter0.defaultLeftPad = (byte) 100;
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter15, 2, "           ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:    ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertNotNull(comparator10);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setWidth((int) (byte) 10);
        helpFormatter0.defaultArgName = "                                ";
        int int21 = helpFormatter0.findWrapPos("            ", 73, 87);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.setLongOptPrefix("");
        helpFormatter0.setDescPadding(3);
        java.lang.String str14 = helpFormatter0.getArgName();
        java.util.Comparator comparator15 = helpFormatter0.optionComparator;
        helpFormatter0.setOptPrefix("usage: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertNotNull(comparator15);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
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
        java.lang.StringBuffer stringBuffer17 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = helpFormatter0.renderOptions(stringBuffer17, (int) (short) 100, options19, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage:" + "'", str13, "usage:");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-" + "'", str14, "-");
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultArgName = "                                                                                                    ";
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.setWidth((int) (short) 0);
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setNewLine("           ");
        java.util.Comparator comparator13 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertNotNull(comparator13);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        int int8 = helpFormatter0.defaultDescPad;
        java.util.Comparator comparator9 = helpFormatter0.optionComparator;
        int int10 = helpFormatter0.getDescPadding();
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        int int11 = helpFormatter0.defaultWidth;
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        int int13 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", "--", options16, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
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
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        helpFormatter0.defaultWidth = (byte) 0;
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultOptPrefix = "         ";
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertNotNull(comparator11);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
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
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        helpFormatter0.defaultDescPad = 52;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        int int10 = helpFormatter0.getDescPadding();
        java.lang.String str11 = helpFormatter0.getArgName();
        int int12 = helpFormatter0.getDescPadding();
        helpFormatter0.setArgName("                                ");
        java.io.PrintWriter printWriter15 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter15, 74, options17, 0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
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
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        int int7 = helpFormatter0.findWrapPos("arg", 0, (int) ' ');
        helpFormatter0.setLeftPadding(100);
        helpFormatter0.defaultDescPad = (short) 100;
        java.util.Comparator comparator12 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(comparator12);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
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
        helpFormatter0.setSyntaxPrefix(" ");
        helpFormatter0.defaultLeftPad = 73;
        helpFormatter0.setSyntaxPrefix("                                                    ");
        org.apache.commons.cli.Options options24 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                    ", "", options24, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 104");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        int int6 = helpFormatter0.findWrapPos("--", (int) '#', (int) (short) 100);
        helpFormatter0.setArgName("arg");
        helpFormatter0.defaultOptPrefix = "";
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, (int) 'a', 9, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
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
        java.lang.String str20 = helpFormatter0.rtrim("                                ");
        helpFormatter0.setWidth(76);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultLeftPad = (short) 10;
        helpFormatter0.defaultOptPrefix = "arg";
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter13, (int) (byte) 1, "                                ", "", options17, 13, (int) '4', "                                ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:         ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
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
        java.lang.String str18 = helpFormatter0.createPadding((int) (byte) 1);
        java.lang.String str19 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " " + "'", str18, " ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        int int7 = helpFormatter0.findWrapPos("arg", 0, (int) ' ');
        int int11 = helpFormatter0.findWrapPos("          ", 1, 1);
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = (byte) 1;
        helpFormatter0.defaultSyntaxPrefix = "          ";
        int int12 = helpFormatter0.findWrapPos("                                                                   ", 74, 32);
        helpFormatter0.defaultArgName = "   ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
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
        java.io.PrintWriter printWriter39 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter39, (int) (byte) 10, "             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                    " + "'", str12, "                                                    ");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 74 + "'", int26 == 74);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "arg" + "'", str29, "arg");
        org.junit.Assert.assertNotNull(comparator36);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.defaultOptPrefix = "hi!";
        java.util.Comparator comparator12 = helpFormatter0.optionComparator;
        int int13 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultArgName = "";
        org.apache.commons.cli.HelpFormatter helpFormatter16 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str18 = helpFormatter16.rtrim("arg");
        helpFormatter16.defaultOptPrefix = "--";
        helpFormatter16.setOptPrefix("-");
        helpFormatter16.setDescPadding(1);
        helpFormatter16.defaultDescPad = (short) 100;
        org.apache.commons.cli.HelpFormatter helpFormatter27 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str29 = helpFormatter27.rtrim("arg");
        java.lang.String str30 = helpFormatter27.defaultSyntaxPrefix;
        java.util.Comparator comparator31 = helpFormatter27.optionComparator;
        java.lang.String str32 = helpFormatter27.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter33 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str35 = helpFormatter33.rtrim("arg");
        helpFormatter33.defaultOptPrefix = "--";
        helpFormatter33.setOptPrefix("-");
        helpFormatter33.setDescPadding(1);
        java.util.Comparator comparator42 = helpFormatter33.getOptionComparator();
        helpFormatter27.optionComparator = comparator42;
        java.util.Comparator comparator44 = helpFormatter27.optionComparator;
        helpFormatter16.optionComparator = comparator44;
        helpFormatter16.defaultSyntaxPrefix = "--";
        helpFormatter16.defaultOptPrefix = "--";
        java.util.Comparator comparator50 = helpFormatter16.optionComparator;
        helpFormatter0.setOptionComparator(comparator50);
        helpFormatter0.defaultLongOptPrefix = "arg";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "arg" + "'", str29, "arg");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "usage: " + "'", str30, "usage: ");
        org.junit.Assert.assertNotNull(comparator31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-" + "'", str32, "-");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "arg" + "'", str35, "arg");
        org.junit.Assert.assertNotNull(comparator42);
        org.junit.Assert.assertNotNull(comparator44);
        org.junit.Assert.assertNotNull(comparator50);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.setLongOptPrefix("");
        helpFormatter0.setDescPadding(3);
        java.lang.String str14 = helpFormatter0.getArgName();
        java.lang.String str15 = helpFormatter0.defaultNewLine;
        java.lang.String str16 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLongOptPrefix("                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.getArgName();
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultArgName = "--";
        helpFormatter0.setLeftPadding(13);
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        java.lang.String str10 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
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
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                             ", options18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        int int6 = helpFormatter0.defaultWidth;
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.defaultNewLine = "--";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = helpFormatter0.renderOptions(stringBuffer10, 0, options12, 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter13, 86, "                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
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
        helpFormatter0.setNewLine("                                   ");
        int int18 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(32, "", "                                             ", options22, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
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
        helpFormatter0.defaultLeftPad = 72;
        org.apache.commons.cli.HelpFormatter helpFormatter32 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str34 = helpFormatter32.rtrim("arg");
        helpFormatter32.defaultOptPrefix = "--";
        helpFormatter32.setOptPrefix("-");
        helpFormatter32.setDescPadding(1);
        helpFormatter32.defaultDescPad = (short) 100;
        org.apache.commons.cli.HelpFormatter helpFormatter43 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str45 = helpFormatter43.rtrim("arg");
        java.lang.String str46 = helpFormatter43.defaultSyntaxPrefix;
        java.util.Comparator comparator47 = helpFormatter43.optionComparator;
        helpFormatter32.setOptionComparator(comparator47);
        java.lang.String str49 = helpFormatter32.getOptPrefix();
        java.lang.String str50 = helpFormatter32.getNewLine();
        int int51 = helpFormatter32.getWidth();
        java.util.Comparator comparator52 = helpFormatter32.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator52);
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "arg" + "'", str34, "arg");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "arg" + "'", str45, "arg");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "usage: " + "'", str46, "usage: ");
        org.junit.Assert.assertNotNull(comparator47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "-" + "'", str49, "-");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\n" + "'", str50, "\n");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 74 + "'", int51 == 74);
        org.junit.Assert.assertNotNull(comparator52);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        helpFormatter0.defaultOptPrefix = "";
        helpFormatter0.setLongOptPrefix("hi!");
        helpFormatter0.setArgName("                                                                                                    ");
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.defaultOptPrefix = "--";
        int int7 = helpFormatter0.getWidth();
        java.lang.String str9 = helpFormatter0.rtrim("arg");
        helpFormatter0.setArgName("\n");
        helpFormatter0.defaultWidth = 100;
        java.lang.String str14 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLongOptPrefix = "                                                                   ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultArgName = "                                                                                                    ";
        helpFormatter0.defaultLongOptPrefix = "  ";
        int int9 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setLeftPadding((int) '4');
        int int11 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "\n";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.defaultDescPad;
        java.lang.String str3 = helpFormatter0.rtrim(" ");
        helpFormatter0.defaultNewLine = "                                                                         ";
        int int6 = helpFormatter0.getWidth();
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", "                                                                         ", options9, "                                                                                                    ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
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
        helpFormatter0.setWidth((int) (short) 10);
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
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.util.Comparator comparator5 = null;
        helpFormatter0.setOptionComparator(comparator5);
        java.lang.String str7 = helpFormatter0.defaultArgName;
        java.lang.String str9 = helpFormatter0.createPadding((int) ' ');
        int int10 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter11, 100, "-", "                                                                                                 ", options15, 2, (int) (short) 1, "                                                                         ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                " + "'", str9, "                                ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
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
        int int18 = helpFormatter0.defaultDescPad;
        java.lang.String str19 = helpFormatter0.getOptPrefix();
        java.util.Comparator comparator20 = helpFormatter0.getOptionComparator();
        java.lang.StringBuffer stringBuffer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer25 = helpFormatter0.renderWrappedText(stringBuffer21, 13, 32, "                                                                   ");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-" + "'", str19, "-");
        org.junit.Assert.assertNotNull(comparator20);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.lang.String str5 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        java.lang.String str7 = helpFormatter0.defaultArgName;
        int int8 = helpFormatter0.defaultDescPad;
        int int9 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(3, "            ", "                                                                                       ", options13, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:         ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setLongOptPrefix("hi!");
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        helpFormatter0.setSyntaxPrefix("\n");
        int int12 = helpFormatter0.getWidth();
        java.lang.String str13 = helpFormatter0.defaultOptPrefix;
        int int14 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.String str10 = helpFormatter0.rtrim("                                                    ");
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "                                                    ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setWidth((int) 'a');
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultSyntaxPrefix = "                                                                         ";
        helpFormatter0.defaultDescPad = 'a';
        java.lang.String str12 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str14 = helpFormatter0.createPadding(3);
        java.lang.String str16 = helpFormatter0.rtrim("             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "   " + "'", str14, "   ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
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
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                       ", options15);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 87");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        int int6 = helpFormatter0.findWrapPos("--", (int) '#', (int) (short) 100);
        java.lang.String str8 = helpFormatter0.createPadding((int) '#');
        java.util.Comparator comparator9 = helpFormatter0.optionComparator;
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = helpFormatter0.renderOptions(stringBuffer10, (int) (short) 100, options12, 3, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                   " + "'", str8, "                                   ");
        org.junit.Assert.assertNotNull(comparator9);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        helpFormatter0.setArgName("--");
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        helpFormatter0.setOptPrefix("");
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        int int11 = helpFormatter0.getWidth();
        helpFormatter0.defaultArgName = "                                                                                                 ";
        java.lang.String str14 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                                                 " + "'", str14, "                                                                                                 ");
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultArgName = "             ";
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str13 = helpFormatter11.rtrim("arg");
        helpFormatter11.defaultOptPrefix = "--";
        int int16 = helpFormatter11.getLeftPadding();
        int int20 = helpFormatter11.findWrapPos(" ", (int) (short) 1, 10);
        java.lang.String str21 = helpFormatter11.defaultOptPrefix;
        int int22 = helpFormatter11.getLeftPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter23 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str25 = helpFormatter23.rtrim("arg");
        helpFormatter23.setSyntaxPrefix("-");
        java.lang.String str28 = helpFormatter23.getOptPrefix();
        java.lang.String str29 = helpFormatter23.defaultSyntaxPrefix;
        int int30 = helpFormatter23.defaultDescPad;
        java.lang.String str31 = helpFormatter23.defaultSyntaxPrefix;
        java.lang.String str32 = helpFormatter23.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter33 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter33.defaultOptPrefix = "hi!";
        helpFormatter33.setNewLine("\n");
        int int38 = helpFormatter33.getDescPadding();
        helpFormatter33.setOptPrefix("\n");
        java.lang.String str41 = helpFormatter33.defaultSyntaxPrefix;
        java.util.Comparator comparator42 = helpFormatter33.optionComparator;
        helpFormatter33.setNewLine("usage:");
        org.apache.commons.cli.HelpFormatter helpFormatter45 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str47 = helpFormatter45.rtrim("arg");
        helpFormatter45.setSyntaxPrefix("-");
        java.util.Comparator comparator50 = null;
        helpFormatter45.setOptionComparator(comparator50);
        helpFormatter45.setLeftPadding((int) (short) -1);
        java.lang.String str54 = helpFormatter45.getArgName();
        java.util.Comparator comparator55 = helpFormatter45.optionComparator;
        helpFormatter33.setOptionComparator(comparator55);
        helpFormatter23.setOptionComparator(comparator55);
        helpFormatter11.optionComparator = comparator55;
        helpFormatter0.optionComparator = comparator55;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "arg" + "'", str25, "arg");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-" + "'", str28, "-");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-" + "'", str29, "-");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-" + "'", str31, "-");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-" + "'", str32, "-");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "usage: " + "'", str41, "usage: ");
        org.junit.Assert.assertNotNull(comparator42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "arg" + "'", str47, "arg");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "arg" + "'", str54, "arg");
        org.junit.Assert.assertNotNull(comparator55);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setWidth((int) (byte) 10);
        helpFormatter0.defaultArgName = "                                ";
        java.io.PrintWriter printWriter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter18, 87, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str9 = helpFormatter0.rtrim("hi!");
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", options12, false);
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
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultDescPad = 74;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) '#', "-", "                                                                                                 ", options10, "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
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
        org.apache.commons.cli.HelpFormatter helpFormatter31 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str33 = helpFormatter31.rtrim("arg");
        helpFormatter31.defaultWidth = (short) -1;
        java.lang.String str36 = helpFormatter31.defaultArgName;
        helpFormatter31.setSyntaxPrefix("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter39 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str41 = helpFormatter39.rtrim("arg");
        helpFormatter39.defaultWidth = (short) -1;
        java.lang.String str44 = helpFormatter39.defaultArgName;
        java.lang.String str45 = helpFormatter39.defaultArgName;
        java.lang.String str46 = helpFormatter39.defaultOptPrefix;
        int int47 = helpFormatter39.getDescPadding();
        java.util.Comparator comparator48 = helpFormatter39.optionComparator;
        helpFormatter31.setOptionComparator(comparator48);
        helpFormatter0.optionComparator = comparator48;
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "arg" + "'", str33, "arg");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "arg" + "'", str36, "arg");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "arg" + "'", str41, "arg");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "arg" + "'", str44, "arg");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "arg" + "'", str45, "arg");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "-" + "'", str46, "-");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertNotNull(comparator48);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultSyntaxPrefix = "\n";
        java.lang.String str4 = helpFormatter0.defaultNewLine;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        helpFormatter0.setLongOptPrefix("-");
        int int8 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
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
        int int24 = helpFormatter0.getDescPadding();
        helpFormatter0.setSyntaxPrefix("arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "usage: " + "'", str21, "usage: ");
        org.junit.Assert.assertNotNull(comparator22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix("hi!");
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.setOptPrefix("hi!");
        java.lang.String str13 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultDescPad = (short) 1;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
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
        java.lang.String str16 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter17 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str19 = helpFormatter17.rtrim("arg");
        helpFormatter17.defaultWidth = (short) -1;
        java.lang.String str22 = helpFormatter17.defaultArgName;
        helpFormatter17.setSyntaxPrefix("arg");
        helpFormatter17.setLeftPadding((int) (short) 1);
        java.util.Comparator comparator27 = helpFormatter17.getOptionComparator();
        int int28 = helpFormatter17.defaultWidth;
        int int29 = helpFormatter17.getLeftPadding();
        int int30 = helpFormatter17.getLeftPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter31 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str33 = helpFormatter31.rtrim("arg");
        helpFormatter31.defaultOptPrefix = "--";
        java.lang.String str36 = helpFormatter31.getLongOptPrefix();
        java.lang.String str37 = helpFormatter31.getNewLine();
        java.lang.String str38 = helpFormatter31.getOptPrefix();
        helpFormatter31.defaultLeftPad = (short) 10;
        int int44 = helpFormatter31.findWrapPos("arg", (int) (short) 0, (int) (short) 10);
        helpFormatter31.defaultLeftPad = 10;
        java.util.Comparator comparator47 = helpFormatter31.optionComparator;
        helpFormatter17.setOptionComparator(comparator47);
        helpFormatter0.optionComparator = comparator47;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "          " + "'", str15, "          ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "arg" + "'", str22, "arg");
        org.junit.Assert.assertNotNull(comparator27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "arg" + "'", str33, "arg");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "--" + "'", str36, "--");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\n" + "'", str37, "\n");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "--" + "'", str38, "--");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(comparator47);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultLeftPad = (short) 10;
        helpFormatter0.defaultLeftPad = 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
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
        helpFormatter0.defaultSyntaxPrefix = "          ";
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
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter3 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str5 = helpFormatter3.rtrim("arg");
        java.lang.String str6 = helpFormatter3.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter3.defaultOptPrefix;
        java.util.Comparator comparator8 = helpFormatter3.getOptionComparator();
        helpFormatter0.optionComparator = comparator8;
        helpFormatter0.defaultLeftPad = 74;
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str13 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLeftPad = 45;
        java.lang.String str16 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                        ", options18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
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
        java.lang.String str19 = helpFormatter0.createPadding((int) (byte) 1);
        helpFormatter0.setArgName("            ");
        java.lang.StringBuffer stringBuffer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer26 = helpFormatter0.renderWrappedText(stringBuffer22, (int) (byte) 0, 35, "                                                                                                 ");
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " " + "'", str19, " ");
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
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
        helpFormatter0.setNewLine("usage:");
        java.lang.String str38 = helpFormatter0.getLongOptPrefix();
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "--" + "'", str38, "--");
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setDescPadding(0);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "hi!";
        int int15 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 1, " ", "arg", options19, "usage:", false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:         ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
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
        helpFormatter0.defaultNewLine = "                                                    ";
        int int21 = helpFormatter0.defaultDescPad;
        int int25 = helpFormatter0.findWrapPos("   ", (int) '4', 1);
        java.lang.Class<?> wildcardClass26 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
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
        helpFormatter0.defaultLongOptPrefix = "                                                                        ";
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
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultWidth = 10;
        helpFormatter0.setDescPadding((int) (byte) 0);
        helpFormatter0.setNewLine("                                                                         ");
        org.apache.commons.cli.HelpFormatter helpFormatter17 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str19 = helpFormatter17.rtrim("arg");
        java.lang.String str20 = helpFormatter17.getNewLine();
        java.lang.String str21 = helpFormatter17.getOptPrefix();
        helpFormatter17.setNewLine("usage: ");
        helpFormatter17.setWidth(3);
        java.lang.String str26 = helpFormatter17.defaultArgName;
        int int27 = helpFormatter17.getWidth();
        java.lang.String str28 = helpFormatter17.getOptPrefix();
        helpFormatter17.defaultNewLine = "                                                                                                 ";
        org.apache.commons.cli.HelpFormatter helpFormatter31 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str33 = helpFormatter31.rtrim("arg");
        helpFormatter31.defaultWidth = (short) -1;
        java.lang.String str36 = helpFormatter31.defaultArgName;
        java.lang.String str37 = helpFormatter31.defaultArgName;
        helpFormatter31.setOptPrefix("hi!");
        helpFormatter31.defaultSyntaxPrefix = "usage: ";
        java.lang.String str42 = helpFormatter31.defaultNewLine;
        int int43 = helpFormatter31.defaultDescPad;
        java.lang.String str44 = helpFormatter31.getArgName();
        java.lang.String str45 = helpFormatter31.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter46 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter46.defaultOptPrefix = "hi!";
        int int52 = helpFormatter46.findWrapPos("--", (int) '#', (int) (short) 100);
        helpFormatter46.setArgName("arg");
        helpFormatter46.defaultOptPrefix = "";
        java.lang.String str58 = helpFormatter46.rtrim("                                                                                                 ");
        org.apache.commons.cli.HelpFormatter helpFormatter59 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str61 = helpFormatter59.rtrim("arg");
        helpFormatter59.defaultWidth = (short) -1;
        java.lang.String str64 = helpFormatter59.defaultArgName;
        helpFormatter59.setSyntaxPrefix("arg");
        helpFormatter59.setDescPadding((int) '#');
        helpFormatter59.defaultOptPrefix = "hi!";
        helpFormatter59.setLongOptPrefix("hi!");
        java.util.Comparator comparator73 = helpFormatter59.optionComparator;
        helpFormatter46.setOptionComparator(comparator73);
        helpFormatter31.optionComparator = comparator73;
        helpFormatter17.optionComparator = comparator73;
        helpFormatter0.optionComparator = comparator73;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\n" + "'", str20, "\n");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-" + "'", str21, "-");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "arg" + "'", str26, "arg");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-" + "'", str28, "-");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "arg" + "'", str33, "arg");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "arg" + "'", str36, "arg");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "arg" + "'", str37, "arg");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\n" + "'", str42, "\n");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "arg" + "'", str44, "arg");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "arg" + "'", str61, "arg");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "arg" + "'", str64, "arg");
        org.junit.Assert.assertNotNull(comparator73);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultArgName = "";
        helpFormatter0.setDescPadding((int) (byte) 10);
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.HelpFormatter helpFormatter15 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str17 = helpFormatter15.rtrim("arg");
        helpFormatter15.defaultWidth = (short) -1;
        java.lang.String str20 = helpFormatter15.defaultArgName;
        helpFormatter15.setSyntaxPrefix("arg");
        helpFormatter15.setSyntaxPrefix("--");
        helpFormatter15.setNewLine("         ");
        int int27 = helpFormatter15.defaultWidth;
        int int28 = helpFormatter15.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter29 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str31 = helpFormatter29.rtrim("arg");
        helpFormatter29.defaultOptPrefix = "--";
        helpFormatter29.setOptPrefix("-");
        helpFormatter29.setDescPadding(1);
        helpFormatter29.defaultWidth = 1;
        helpFormatter29.defaultWidth = 10;
        helpFormatter29.setDescPadding((int) (byte) 0);
        java.lang.String str44 = helpFormatter29.getArgName();
        int int48 = helpFormatter29.findWrapPos("--", 0, (int) 'a');
        helpFormatter29.setOptPrefix("arg");
        int int54 = helpFormatter29.findWrapPos("hi!", (int) (short) 0, (int) 'a');
        java.util.Comparator comparator55 = helpFormatter29.optionComparator;
        helpFormatter15.optionComparator = comparator55;
        helpFormatter0.setOptionComparator(comparator55);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "arg" + "'", str20, "arg");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "arg" + "'", str31, "arg");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "arg" + "'", str44, "arg");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(comparator55);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setLongOptPrefix("hi!");
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultLongOptPrefix = "                                   ";
        helpFormatter0.setArgName("arg");
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter14, 1, "--", options17);
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
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix("hi!");
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        int int12 = helpFormatter0.getLeftPadding();
        helpFormatter0.setSyntaxPrefix("arg");
        java.util.Comparator comparator15 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(comparator15);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
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
        java.lang.String str33 = helpFormatter0.getNewLine();
        java.lang.String str34 = helpFormatter0.defaultOptPrefix;
        java.lang.String str36 = helpFormatter0.rtrim("                                                                            ");
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\n" + "'", str33, "\n");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "--" + "'", str34, "--");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
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
        helpFormatter0.defaultWidth = 100;
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(86, "arg", "arg", options23, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(comparator17);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultDescPad;
        helpFormatter0.setDescPadding((int) (short) 100);
        helpFormatter0.setNewLine("                                                                                                    ");
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(12, "                    ", "   ", options15, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter2 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str4 = helpFormatter2.rtrim("arg");
        helpFormatter2.defaultOptPrefix = "--";
        helpFormatter2.setOptPrefix("-");
        helpFormatter2.setDescPadding(1);
        java.util.Comparator comparator11 = null;
        helpFormatter2.optionComparator = comparator11;
        int int16 = helpFormatter2.findWrapPos("hi!", (int) 'a', (int) (byte) -1);
        java.lang.String str17 = helpFormatter2.defaultOptPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter18 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str20 = helpFormatter18.rtrim("arg");
        helpFormatter18.defaultOptPrefix = "--";
        int int23 = helpFormatter18.getLeftPadding();
        helpFormatter18.setWidth(74);
        org.apache.commons.cli.HelpFormatter helpFormatter26 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str28 = helpFormatter26.rtrim("arg");
        java.lang.String str29 = helpFormatter26.defaultSyntaxPrefix;
        java.lang.String str30 = helpFormatter26.defaultOptPrefix;
        java.util.Comparator comparator31 = helpFormatter26.getOptionComparator();
        helpFormatter18.optionComparator = comparator31;
        helpFormatter2.optionComparator = comparator31;
        helpFormatter0.setOptionComparator(comparator31);
        int int35 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLongOptPrefix = "             ";
        helpFormatter0.setLeftPadding((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "arg" + "'", str20, "arg");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "arg" + "'", str28, "arg");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "usage: " + "'", str29, "usage: ");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-" + "'", str30, "-");
        org.junit.Assert.assertNotNull(comparator31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.util.Comparator comparator9 = null;
        helpFormatter0.optionComparator = comparator9;
        int int14 = helpFormatter0.findWrapPos("hi!", (int) 'a', (int) (byte) -1);
        int int15 = helpFormatter0.getWidth();
        helpFormatter0.defaultArgName = "                                                                                       ";
        helpFormatter0.setLeftPadding(3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
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
        java.io.PrintWriter printWriter24 = null;
        org.apache.commons.cli.Options options26 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter24, (int) (byte) 100, options26, (int) (byte) 10, 2);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.defaultWidth = ' ';
        java.lang.String str12 = helpFormatter0.getArgName();
        java.lang.String str13 = helpFormatter0.getOptPrefix();
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = helpFormatter0.renderWrappedText(stringBuffer14, 2, (int) (byte) 100, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuffer.append(String)\" because \"sb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
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
        int int49 = helpFormatter0.defaultLeftPad;
        java.util.Comparator comparator50 = helpFormatter0.optionComparator;
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
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertNotNull(comparator50);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
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
        helpFormatter0.defaultDescPad = (short) 0;
        helpFormatter0.setOptPrefix("-");
        org.apache.commons.cli.HelpFormatter helpFormatter23 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str25 = helpFormatter23.rtrim("arg");
        helpFormatter23.setSyntaxPrefix("-");
        helpFormatter23.setSyntaxPrefix("                                                                                                    ");
        java.lang.String str30 = helpFormatter23.getOptPrefix();
        int int31 = helpFormatter23.defaultDescPad;
        java.util.Comparator comparator32 = helpFormatter23.optionComparator;
        helpFormatter0.setOptionComparator(comparator32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "arg" + "'", str25, "arg");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-" + "'", str30, "-");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(comparator32);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        int int6 = helpFormatter0.findWrapPos("--", (int) '#', (int) (short) 100);
        helpFormatter0.setArgName("arg");
        helpFormatter0.defaultOptPrefix = "";
        java.lang.String str12 = helpFormatter0.rtrim("                                                                                                 ");
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str15 = helpFormatter13.rtrim("arg");
        helpFormatter13.defaultWidth = (short) -1;
        java.lang.String str18 = helpFormatter13.defaultArgName;
        helpFormatter13.setSyntaxPrefix("arg");
        helpFormatter13.setDescPadding((int) '#');
        helpFormatter13.defaultOptPrefix = "hi!";
        helpFormatter13.setLongOptPrefix("hi!");
        java.util.Comparator comparator27 = helpFormatter13.optionComparator;
        helpFormatter0.setOptionComparator(comparator27);
        java.lang.String str30 = helpFormatter0.rtrim("                                                                                                    ");
        int int34 = helpFormatter0.findWrapPos("                                                                                                    ", 73, 35);
        java.lang.String str35 = helpFormatter0.getArgName();
        java.io.PrintWriter printWriter36 = null;
        org.apache.commons.cli.Options options40 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter36, 10, "                                                    ", "  ", options40, 72, 21, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
        org.junit.Assert.assertNotNull(comparator27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "arg" + "'", str35, "arg");
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
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
        helpFormatter0.setLeftPadding(32);
        java.lang.String str33 = helpFormatter0.defaultArgName;
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.rtrim("--");
        helpFormatter0.setLongOptPrefix("");
        helpFormatter0.setOptPrefix("usage: ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        int int6 = helpFormatter0.findWrapPos("--", (int) '#', (int) (short) 100);
        helpFormatter0.setArgName("arg");
        helpFormatter0.defaultOptPrefix = "";
        java.lang.String str12 = helpFormatter0.rtrim("                                                                                                 ");
        int int13 = helpFormatter0.defaultWidth;
        java.lang.String str15 = helpFormatter0.rtrim("                                                                                                    ");
        helpFormatter0.setWidth(35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
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
        java.lang.String str24 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        helpFormatter0.setDescPadding(100);
        helpFormatter0.setDescPadding(74);
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = helpFormatter0.renderOptions(stringBuffer9, (int) (byte) -1, options11, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage: " + "'", str17, "usage: ");
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.util.Comparator comparator9 = null;
        helpFormatter0.optionComparator = comparator9;
        int int14 = helpFormatter0.findWrapPos("hi!", (int) 'a', (int) (byte) -1);
        helpFormatter0.setDescPadding((int) '#');
        org.apache.commons.cli.HelpFormatter helpFormatter17 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str19 = helpFormatter17.rtrim("arg");
        helpFormatter17.defaultOptPrefix = "--";
        helpFormatter17.setOptPrefix("-");
        helpFormatter17.setDescPadding(1);
        helpFormatter17.defaultDescPad = (short) 100;
        java.util.Comparator comparator28 = helpFormatter17.optionComparator;
        java.lang.String str30 = helpFormatter17.rtrim("\n");
        java.util.Comparator comparator31 = helpFormatter17.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator31);
        helpFormatter0.defaultLeftPad = '4';
        java.io.PrintWriter printWriter35 = null;
        org.apache.commons.cli.Options options39 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter35, 0, "                                                                         ", "                                                                         ", options39, 32, 32, "                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:         ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertNotNull(comparator28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(comparator31);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        int int10 = helpFormatter0.getDescPadding();
        int int11 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = ' ';
        org.apache.commons.cli.HelpFormatter helpFormatter14 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str16 = helpFormatter14.rtrim("arg");
        java.lang.String str17 = helpFormatter14.defaultSyntaxPrefix;
        helpFormatter14.setNewLine("hi!");
        helpFormatter14.defaultWidth = (byte) 0;
        helpFormatter14.defaultDescPad = (short) 0;
        int int27 = helpFormatter14.findWrapPos("\n", (int) (short) 0, (int) (short) 100);
        org.apache.commons.cli.HelpFormatter helpFormatter28 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str30 = helpFormatter28.rtrim("arg");
        helpFormatter28.defaultWidth = (short) -1;
        java.lang.String str33 = helpFormatter28.defaultArgName;
        java.lang.String str34 = helpFormatter28.defaultArgName;
        java.util.Comparator comparator35 = helpFormatter28.getOptionComparator();
        helpFormatter14.setOptionComparator(comparator35);
        helpFormatter0.setOptionComparator(comparator35);
        helpFormatter0.setLongOptPrefix("                                                                          ");
        java.lang.String str40 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage: " + "'", str17, "usage: ");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "arg" + "'", str30, "arg");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "arg" + "'", str33, "arg");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "arg" + "'", str34, "arg");
        org.junit.Assert.assertNotNull(comparator35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "-" + "'", str40, "-");
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.String str11 = helpFormatter0.defaultLongOptPrefix;
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderWrappedText(stringBuffer12, (int) (byte) 100, 32, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuffer.append(String)\" because \"sb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
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
        int int14 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        int int17 = helpFormatter0.defaultLeftPad;
        int int21 = helpFormatter0.findWrapPos("                                                    ", 21, 73);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.defaultNewLine = "-";
        java.lang.String str12 = helpFormatter0.defaultLongOptPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter13.defaultOptPrefix = "hi!";
        helpFormatter13.setNewLine("\n");
        int int18 = helpFormatter13.getDescPadding();
        helpFormatter13.setOptPrefix("\n");
        helpFormatter13.setNewLine(" ");
        org.apache.commons.cli.HelpFormatter helpFormatter23 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str25 = helpFormatter23.rtrim("arg");
        helpFormatter23.defaultWidth = (short) -1;
        java.lang.String str28 = helpFormatter23.defaultArgName;
        java.lang.String str29 = helpFormatter23.defaultArgName;
        java.util.Comparator comparator30 = helpFormatter23.getOptionComparator();
        helpFormatter13.optionComparator = comparator30;
        helpFormatter0.setOptionComparator(comparator30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "arg" + "'", str25, "arg");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "arg" + "'", str28, "arg");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "arg" + "'", str29, "arg");
        org.junit.Assert.assertNotNull(comparator30);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str11 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator12 = helpFormatter0.optionComparator;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertNotNull(comparator12);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("");
        int int3 = helpFormatter0.getLeftPadding();
        int int4 = helpFormatter0.defaultWidth;
        int int5 = helpFormatter0.defaultDescPad;
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str8 = helpFormatter0.createPadding((int) (short) 0);
        int int9 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
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
        java.lang.String str23 = helpFormatter0.createPadding(2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-" + "'", str19, "-");
        org.junit.Assert.assertNotNull(comparator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "  " + "'", str23, "  ");
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        int int8 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter9, 87, 87, "                                                                         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
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
        helpFormatter0.setOptPrefix("                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "          " + "'", str15, "          ");
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
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
        helpFormatter0.setOptPrefix("                                                                   ");
        java.io.PrintWriter printWriter27 = null;
        org.apache.commons.cli.Options options30 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter27, (int) (short) 100, "  ", options30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(comparator24);
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
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
        helpFormatter0.setArgName(" ");
        java.lang.String str26 = helpFormatter0.getOptPrefix();
        int int27 = helpFormatter0.defaultLeftPad;
        java.lang.String str28 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-" + "'", str19, "-");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-" + "'", str26, "-");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-" + "'", str28, "-");
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        int int8 = helpFormatter0.findWrapPos("usage: ", 0, (int) '4');
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setDescPadding((int) (short) 1);
        helpFormatter0.defaultOptPrefix = "                                ";
        java.util.Comparator comparator15 = null;
        helpFormatter0.optionComparator = comparator15;
        java.lang.String str17 = helpFormatter0.getSyntaxPrefix();
        java.lang.StringBuffer stringBuffer18 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer23 = helpFormatter0.renderOptions(stringBuffer18, 0, options20, 67, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
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
        helpFormatter0.defaultWidth = 45;
        java.lang.String str20 = helpFormatter0.getOptPrefix();
        java.io.PrintWriter printWriter21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter21, 52, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-" + "'", str20, "-");
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
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
        java.lang.String str17 = helpFormatter0.getOptPrefix();
        java.lang.StringBuffer stringBuffer18 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer23 = helpFormatter0.renderOptions(stringBuffer18, 86, options20, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                " + "'", str17, "                                ");
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.defaultDescPad;
        java.lang.String str3 = helpFormatter0.rtrim(" ");
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        helpFormatter0.setOptPrefix("                                                                                                 ");
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer13 = helpFormatter0.renderWrappedText(stringBuffer9, 9, 100, "  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuffer.append(String)\" because \"sb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                    " + "'", str8, "                                                                                                    ");
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        int int10 = helpFormatter0.findWrapPos("", (int) (byte) 100, (int) (short) 0);
        java.lang.String str12 = helpFormatter0.rtrim("   ");
        helpFormatter0.setNewLine("                                                                                                    ");
        helpFormatter0.setSyntaxPrefix(" ");
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(72, "                    ", "                                   ", options20, "            ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str9 = helpFormatter0.rtrim("hi!");
        int int10 = helpFormatter0.defaultLeftPad;
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderOptions(stringBuffer11, (int) ' ', options13, 67, 9);
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
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
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
        java.io.PrintWriter printWriter17 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter17, 32, "                                                                   ", "", options21, (int) (short) 10, 32, "                                                                                                    ", true);
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
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.defaultNewLine = "-";
        java.lang.String str12 = helpFormatter0.defaultLongOptPrefix;
        java.util.Comparator comparator13 = helpFormatter0.getOptionComparator();
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("-", "           ", options16, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertNotNull(comparator13);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        int int3 = helpFormatter0.getLeftPadding();
        int int4 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultArgName = "   ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        int int9 = helpFormatter0.getWidth();
        helpFormatter0.defaultArgName = "hi!";
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
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
        java.lang.String str18 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "usage: " + "'", str18, "usage: ");
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
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
        int int22 = helpFormatter0.findWrapPos("                                                                                                    ", 67, 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 74 + "'", int18 == 74);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 87 + "'", int22 == 87);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        java.lang.String str8 = helpFormatter0.getNewLine();
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        java.lang.Class<?> wildcardClass10 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        int int6 = helpFormatter0.getWidth();
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        int int9 = helpFormatter0.getLeftPadding();
        java.util.Comparator comparator10 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(comparator10);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
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
        java.lang.String str33 = helpFormatter0.getNewLine();
        helpFormatter0.setArgName("                                                                        ");
        java.io.PrintWriter printWriter36 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter36, (int) (byte) -1, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 107");
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
        org.junit.Assert.assertNotNull(comparator32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\n" + "'", str33, "\n");
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
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
        java.io.PrintWriter printWriter22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter22, 73, "          ");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        int int9 = helpFormatter0.getWidth();
        helpFormatter0.defaultArgName = "hi!";
        java.util.Comparator comparator12 = helpFormatter0.getOptionComparator();
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter13, 11, "                                                                                       ", options16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertNotNull(comparator12);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        int int9 = helpFormatter0.findWrapPos("-", (int) (short) 100, 74);
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        helpFormatter0.setWidth(3);
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", "                                   ", options17, "            ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
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
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.util.Comparator comparator5 = null;
        helpFormatter0.setOptionComparator(comparator5);
        java.lang.String str7 = helpFormatter0.defaultArgName;
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setOptPrefix("\n");
        helpFormatter0.setLeftPadding((int) (byte) 100);
        int int13 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("");
        int int6 = helpFormatter0.findWrapPos("\n", 1, (int) (byte) 100);
        java.lang.String str7 = helpFormatter0.defaultSyntaxPrefix;
        int int8 = helpFormatter0.defaultDescPad;
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.setWidth(11);
        int int8 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.defaultArgName = "                                   ";
        int int9 = helpFormatter0.defaultDescPad;
        int int10 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str13 = helpFormatter11.rtrim("arg");
        helpFormatter11.setSyntaxPrefix("-");
        java.lang.String str16 = helpFormatter11.getOptPrefix();
        helpFormatter11.setNewLine("");
        java.lang.String str19 = helpFormatter11.getArgName();
        helpFormatter11.setNewLine("-");
        helpFormatter11.defaultLongOptPrefix = "                                                    ";
        helpFormatter11.defaultLeftPad = (-1);
        org.apache.commons.cli.HelpFormatter helpFormatter26 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str28 = helpFormatter26.rtrim("arg");
        helpFormatter26.defaultOptPrefix = "--";
        helpFormatter26.setOptPrefix("-");
        helpFormatter26.setDescPadding(1);
        java.lang.String str35 = helpFormatter26.defaultLongOptPrefix;
        int int36 = helpFormatter26.getLeftPadding();
        java.lang.String str38 = helpFormatter26.createPadding((int) '4');
        int int42 = helpFormatter26.findWrapPos("                                                                                                    ", 74, 0);
        org.apache.commons.cli.HelpFormatter helpFormatter43 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str45 = helpFormatter43.rtrim("arg");
        helpFormatter43.defaultOptPrefix = "--";
        helpFormatter43.setOptPrefix("-");
        helpFormatter43.setDescPadding(1);
        int int52 = helpFormatter43.getWidth();
        org.apache.commons.cli.HelpFormatter helpFormatter53 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str55 = helpFormatter53.rtrim("arg");
        helpFormatter53.defaultOptPrefix = "--";
        helpFormatter53.setOptPrefix("-");
        helpFormatter53.setDescPadding(1);
        java.util.Comparator comparator62 = helpFormatter53.getOptionComparator();
        helpFormatter43.optionComparator = comparator62;
        helpFormatter26.setOptionComparator(comparator62);
        helpFormatter11.setOptionComparator(comparator62);
        helpFormatter0.optionComparator = comparator62;
        helpFormatter0.setLeftPadding(13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "arg" + "'", str28, "arg");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "--" + "'", str35, "--");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "                                                    " + "'", str38, "                                                    ");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 74 + "'", int42 == 74);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "arg" + "'", str45, "arg");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 74 + "'", int52 == 74);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "arg" + "'", str55, "arg");
        org.junit.Assert.assertNotNull(comparator62);
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
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
        helpFormatter0.defaultWidth = (short) 0;
        int int17 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
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
        helpFormatter0.setArgName("                                                    ");
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
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
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
        java.lang.String str33 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertNotNull(comparator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-" + "'", str16, "-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertNotNull(comparator26);
        org.junit.Assert.assertNotNull(comparator28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-" + "'", str32, "-");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "--" + "'", str33, "--");
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
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
        helpFormatter0.defaultNewLine = "                                                    ";
        int int21 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultArgName = "          ";
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
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
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
        helpFormatter0.setArgName("                                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        int int6 = helpFormatter0.findWrapPos("--", (int) '#', (int) (short) 100);
        helpFormatter0.defaultLeftPad = 0;
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.setNewLine("-");
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((-1), "   ", "   ", options16, "\n", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("");
        int int3 = helpFormatter0.getLeftPadding();
        int int4 = helpFormatter0.defaultWidth;
        int int5 = helpFormatter0.defaultDescPad;
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setLeftPadding(1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
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
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", options16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "         " + "'", str14, "         ");
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertNotNull(comparator11);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        int int8 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultDescPad = 74;
        int int11 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth((int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
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
        helpFormatter0.defaultDescPad = (short) 10;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
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
        helpFormatter0.defaultLongOptPrefix = "  ";
        helpFormatter0.setLongOptPrefix("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(comparator15);
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
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
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter16, 74, "                                                                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        java.lang.String str8 = helpFormatter0.getNewLine();
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter10, 9, (int) '#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultArgName = "                                                                                                    ";
        helpFormatter0.setArgName("");
        helpFormatter0.setWidth((int) (byte) 1);
        helpFormatter0.setWidth(32);
        java.lang.String str13 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator14 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultLongOptPrefix = "                                             ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "--" + "'", str13, "--");
        org.junit.Assert.assertNotNull(comparator14);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
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
        java.util.Comparator comparator17 = helpFormatter0.optionComparator;
        helpFormatter0.setArgName("arg");
        helpFormatter0.setNewLine("                                ");
        java.lang.String str22 = helpFormatter0.getArgName();
        java.lang.StringBuffer stringBuffer23 = null;
        org.apache.commons.cli.Options options25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer28 = helpFormatter0.renderOptions(stringBuffer23, 52, options25, 10, 21);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "arg" + "'", str22, "arg");
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultWidth = 10;
        helpFormatter0.setDescPadding((int) (byte) 0);
        java.lang.String str15 = helpFormatter0.getArgName();
        java.lang.String str16 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultArgName = "                                                                                                    ";
        int int7 = helpFormatter0.defaultWidth;
        helpFormatter0.setLongOptPrefix("hi!");
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter10, 74, options12, 100, 67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
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
        helpFormatter0.defaultDescPad = '#';
        helpFormatter0.setLongOptPrefix("                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str11 = helpFormatter9.rtrim("arg");
        helpFormatter9.defaultOptPrefix = "--";
        helpFormatter9.setOptPrefix("-");
        org.apache.commons.cli.HelpFormatter helpFormatter16 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str18 = helpFormatter16.rtrim("arg");
        java.lang.String str19 = helpFormatter16.getNewLine();
        java.lang.String str20 = helpFormatter16.getOptPrefix();
        helpFormatter16.defaultOptPrefix = "arg";
        org.apache.commons.cli.HelpFormatter helpFormatter23 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str25 = helpFormatter23.rtrim("arg");
        java.lang.String str26 = helpFormatter23.getNewLine();
        java.lang.String str27 = helpFormatter23.getOptPrefix();
        helpFormatter23.setOptPrefix("usage: ");
        java.lang.String str30 = helpFormatter23.getNewLine();
        java.lang.String str32 = helpFormatter23.rtrim("hi!");
        int int33 = helpFormatter23.defaultLeftPad;
        java.util.Comparator comparator34 = helpFormatter23.optionComparator;
        helpFormatter16.setOptionComparator(comparator34);
        helpFormatter16.defaultWidth = ' ';
        java.lang.String str38 = helpFormatter16.getSyntaxPrefix();
        java.util.Comparator comparator39 = helpFormatter16.optionComparator;
        helpFormatter9.optionComparator = comparator39;
        helpFormatter0.optionComparator = comparator39;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n" + "'", str19, "\n");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-" + "'", str20, "-");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "arg" + "'", str25, "arg");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\n" + "'", str26, "\n");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-" + "'", str27, "-");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\n" + "'", str30, "\n");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(comparator34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "usage: " + "'", str38, "usage: ");
        org.junit.Assert.assertNotNull(comparator39);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
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
        int int27 = helpFormatter0.getWidth();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
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
        helpFormatter0.defaultWidth = 87;
        java.lang.StringBuffer stringBuffer27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer31 = helpFormatter0.renderWrappedText(stringBuffer27, (int) ' ', (int) ' ', "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuffer.append(String)\" because \"sb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(comparator24);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
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
        java.io.PrintWriter printWriter21 = null;
        org.apache.commons.cli.Options options24 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter21, 86, "         ", options24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage:" + "'", str16, "usage:");
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("");
        int int3 = helpFormatter0.getLeftPadding();
        int int4 = helpFormatter0.defaultWidth;
        int int5 = helpFormatter0.defaultDescPad;
        int int9 = helpFormatter0.findWrapPos(" ", 74, 73);
        java.util.Comparator comparator10 = helpFormatter0.getOptionComparator();
        helpFormatter0.defaultSyntaxPrefix = " ";
        helpFormatter0.defaultLongOptPrefix = "usage:";
        java.io.PrintWriter printWriter15 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter15, 0, "                                                                   ", "                                                                         ", options19, 12, 13, "                                                                         ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:   ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(comparator10);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        java.util.Comparator comparator10 = helpFormatter0.optionComparator;
        helpFormatter0.defaultOptPrefix = "                                                                                                 ";
        helpFormatter0.defaultOptPrefix = "                                   ";
        helpFormatter0.defaultArgName = "                                                                                       ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertNotNull(comparator10);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
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
        java.lang.String str28 = helpFormatter0.getOptPrefix();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-" + "'", str28, "-");
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setLongOptPrefix("hi!");
        java.util.Comparator comparator9 = helpFormatter0.optionComparator;
        helpFormatter0.defaultArgName = "usage:";
        int int12 = helpFormatter0.getWidth();
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", options14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        int int6 = helpFormatter0.defaultWidth;
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultLongOptPrefix = "";
        int int11 = helpFormatter0.getDescPadding();
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter12, 21, "                                                                          ", "                                   ", options16, (int) (short) 0, 86, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("hi!");
        helpFormatter0.defaultWidth = (byte) 0;
        helpFormatter0.defaultDescPad = (short) 0;
        helpFormatter0.defaultNewLine = "                                                                                                    ";
        helpFormatter0.defaultDescPad = 45;
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultOptPrefix = "usage:";
        helpFormatter0.defaultOptPrefix = "                                                                                       ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
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
        helpFormatter0.defaultNewLine = "                                   ";
        helpFormatter0.defaultWidth = '4';
        helpFormatter0.setLeftPadding(20);
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
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setDescPadding(0);
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.setNewLine("hi!");
        java.util.Comparator comparator17 = helpFormatter0.optionComparator;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) '#', "         ", "", options21, "                                                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertNotNull(comparator17);
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
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
        org.apache.commons.cli.HelpFormatter helpFormatter15 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str17 = helpFormatter15.rtrim("arg");
        helpFormatter15.setSyntaxPrefix("-");
        java.lang.String str20 = helpFormatter15.getOptPrefix();
        helpFormatter15.setNewLine("");
        java.lang.String str23 = helpFormatter15.getLongOptPrefix();
        helpFormatter15.defaultLongOptPrefix = "usage: ";
        java.util.Comparator comparator26 = helpFormatter15.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator26);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-" + "'", str20, "-");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "--" + "'", str23, "--");
        org.junit.Assert.assertNotNull(comparator26);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
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
        java.lang.String str23 = helpFormatter0.createPadding(73);
        helpFormatter0.defaultLongOptPrefix = "\n";
        org.apache.commons.cli.Options options27 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                             ", options27);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "                                                                         " + "'", str23, "                                                                         ");
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
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
        java.lang.String str15 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str17 = helpFormatter0.rtrim("                                             ");
        helpFormatter0.defaultWidth = '#';
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "usage: " + "'", str15, "usage: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("");
        int int3 = helpFormatter0.getLeftPadding();
        helpFormatter0.setOptPrefix("--");
        java.lang.String str6 = helpFormatter0.getArgName();
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.setOptPrefix("         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
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
        helpFormatter0.defaultArgName = "         ";
        java.lang.StringBuffer stringBuffer19 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer24 = helpFormatter0.renderOptions(stringBuffer19, (int) (short) 100, options21, 11, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
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
        java.util.Comparator comparator39 = helpFormatter0.optionComparator;
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
        org.junit.Assert.assertNotNull(comparator39);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix("\n");
        helpFormatter0.setNewLine(" ");
        org.apache.commons.cli.HelpFormatter helpFormatter10 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str12 = helpFormatter10.rtrim("arg");
        helpFormatter10.defaultOptPrefix = "--";
        helpFormatter10.setOptPrefix("-");
        helpFormatter10.setDescPadding(1);
        helpFormatter10.setDescPadding(0);
        java.lang.String str21 = helpFormatter10.defaultNewLine;
        java.lang.String str22 = helpFormatter10.getArgName();
        helpFormatter10.defaultNewLine = "-";
        java.lang.String str26 = helpFormatter10.rtrim("--");
        java.lang.String str27 = helpFormatter10.defaultNewLine;
        java.lang.String str28 = helpFormatter10.defaultNewLine;
        java.lang.String str29 = helpFormatter10.getOptPrefix();
        java.util.Comparator comparator30 = helpFormatter10.optionComparator;
        helpFormatter0.setOptionComparator(comparator30);
        helpFormatter0.defaultOptPrefix = "arg";
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n" + "'", str21, "\n");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "arg" + "'", str22, "arg");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "--" + "'", str26, "--");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-" + "'", str27, "-");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-" + "'", str28, "-");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-" + "'", str29, "-");
        org.junit.Assert.assertNotNull(comparator30);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
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
        java.io.PrintWriter printWriter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter17, 11, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:        usage:");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultArgName = "                                                                                                    ";
        helpFormatter0.setArgName("          ");
        int int9 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLongOptPrefix("                                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.setLongOptPrefix("         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
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
        java.util.Comparator comparator17 = helpFormatter0.optionComparator;
        helpFormatter0.setArgName("arg");
        helpFormatter0.setNewLine("                                ");
        java.lang.String str22 = helpFormatter0.getArgName();
        java.util.Comparator comparator23 = helpFormatter0.optionComparator;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "arg" + "'", str22, "arg");
        org.junit.Assert.assertNotNull(comparator23);
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        int int8 = helpFormatter0.defaultLeftPad;
        java.lang.String str10 = helpFormatter0.rtrim("--");
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        java.lang.String str12 = helpFormatter0.getNewLine();
        java.lang.String str13 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setLongOptPrefix("hi!");
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        helpFormatter0.setSyntaxPrefix("\n");
        helpFormatter0.defaultArgName = "hi!";
        java.lang.String str14 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int10 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultNewLine = "-";
        helpFormatter0.defaultOptPrefix = "          ";
        java.lang.String str15 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth((int) (short) 100);
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 100, "                                             ", "--", options21, "                                                                                       ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
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
        java.lang.String str28 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\n" + "'", str26, "\n");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "--" + "'", str27, "--");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "usage: " + "'", str28, "usage: ");
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
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
            java.lang.StringBuffer stringBuffer23 = helpFormatter0.renderWrappedText(stringBuffer19, 21, 21, "                                   ");
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
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
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
        helpFormatter0.defaultOptPrefix = "  ";
        java.io.PrintWriter printWriter21 = null;
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter21, 52, options23, 11, 100);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
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
        helpFormatter0.setDescPadding((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultOptPrefix = "           ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.rtrim("--");
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("   ");
        helpFormatter0.defaultLeftPad = (short) 1;
        int int13 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setSyntaxPrefix("--");
        int int10 = helpFormatter0.getDescPadding();
        java.lang.String str11 = helpFormatter0.getArgName();
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        int int13 = helpFormatter0.getDescPadding();
        helpFormatter0.setLongOptPrefix("                                   ");
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter16, 12, options18, (int) 'a', 74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter3 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str5 = helpFormatter3.rtrim("arg");
        java.lang.String str6 = helpFormatter3.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter3.defaultOptPrefix;
        java.util.Comparator comparator8 = helpFormatter3.getOptionComparator();
        helpFormatter0.optionComparator = comparator8;
        helpFormatter0.defaultLeftPad = 74;
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str13 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix(" ");
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(2, "", "-", options19, "                                                                                                 ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
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
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("hi!", options19);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:    hi!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertNotNull(comparator13);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        java.lang.String str9 = helpFormatter0.defaultArgName;
        int int10 = helpFormatter0.getWidth();
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultOptPrefix = "                                                                        ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        int int7 = helpFormatter0.findWrapPos("arg", 0, (int) ' ');
        helpFormatter0.setLeftPadding(100);
        helpFormatter0.defaultDescPad = (short) 100;
        int int12 = helpFormatter0.defaultLeftPad;
        java.lang.String str13 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str14 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "--" + "'", str14, "--");
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        int int6 = helpFormatter0.findWrapPos("--", (int) '#', (int) (short) 100);
        java.lang.String str8 = helpFormatter0.createPadding((int) '#');
        helpFormatter0.setOptPrefix("");
        helpFormatter0.defaultArgName = "  ";
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str15 = helpFormatter13.rtrim("arg");
        java.lang.String str16 = helpFormatter13.getNewLine();
        java.lang.String str17 = helpFormatter13.getOptPrefix();
        helpFormatter13.defaultOptPrefix = "arg";
        helpFormatter13.setDescPadding((int) (short) 100);
        java.util.Comparator comparator22 = helpFormatter13.getOptionComparator();
        helpFormatter0.optionComparator = comparator22;
        java.lang.String str24 = helpFormatter0.defaultOptPrefix;
        int int25 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                   " + "'", str8, "                                   ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-" + "'", str17, "-");
        org.junit.Assert.assertNotNull(comparator22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
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
            helpFormatter0.printHelp("", options34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        int int9 = helpFormatter0.findWrapPos(" ", (int) (short) 1, 10);
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultNewLine = "                                                                          ";
        java.lang.String str14 = helpFormatter0.rtrim("                                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("");
        int int3 = helpFormatter0.getLeftPadding();
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setSyntaxPrefix("             ");
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        helpFormatter0.defaultOptPrefix = "                                                                                                    ";
        int int7 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setSyntaxPrefix("           ");
        java.util.Comparator comparator10 = helpFormatter0.optionComparator;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(comparator10);
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        helpFormatter0.defaultDescPad = (byte) 100;
        java.lang.String str8 = helpFormatter0.getArgName();
        helpFormatter0.setLongOptPrefix("                                                    ");
        int int11 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
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
        helpFormatter0.setArgName("usage: ");
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
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix("usage: ");
        int int11 = helpFormatter0.findWrapPos("hi!", (int) (byte) -1, (int) (byte) 100);
        helpFormatter0.setOptPrefix("usage:");
        helpFormatter0.defaultWidth = 87;
        helpFormatter0.defaultLongOptPrefix = " ";
        helpFormatter0.setArgName("\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getArgName();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultLongOptPrefix = "                                                    ";
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str15 = helpFormatter13.rtrim("arg");
        helpFormatter13.setSyntaxPrefix("-");
        java.lang.String str18 = helpFormatter13.getOptPrefix();
        helpFormatter13.setNewLine("");
        java.lang.String str21 = helpFormatter13.getArgName();
        helpFormatter13.setNewLine("-");
        helpFormatter13.defaultLongOptPrefix = "                                                    ";
        helpFormatter13.defaultLeftPad = (-1);
        org.apache.commons.cli.HelpFormatter helpFormatter28 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str30 = helpFormatter28.rtrim("arg");
        helpFormatter28.defaultOptPrefix = "--";
        helpFormatter28.setOptPrefix("-");
        helpFormatter28.setDescPadding(1);
        java.lang.String str37 = helpFormatter28.defaultLongOptPrefix;
        int int38 = helpFormatter28.getLeftPadding();
        java.lang.String str40 = helpFormatter28.createPadding((int) '4');
        int int44 = helpFormatter28.findWrapPos("                                                                                                    ", 74, 0);
        org.apache.commons.cli.HelpFormatter helpFormatter45 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str47 = helpFormatter45.rtrim("arg");
        helpFormatter45.defaultOptPrefix = "--";
        helpFormatter45.setOptPrefix("-");
        helpFormatter45.setDescPadding(1);
        int int54 = helpFormatter45.getWidth();
        org.apache.commons.cli.HelpFormatter helpFormatter55 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str57 = helpFormatter55.rtrim("arg");
        helpFormatter55.defaultOptPrefix = "--";
        helpFormatter55.setOptPrefix("-");
        helpFormatter55.setDescPadding(1);
        java.util.Comparator comparator64 = helpFormatter55.getOptionComparator();
        helpFormatter45.optionComparator = comparator64;
        helpFormatter28.setOptionComparator(comparator64);
        helpFormatter13.setOptionComparator(comparator64);
        helpFormatter0.optionComparator = comparator64;
        java.lang.String str69 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arg" + "'", str21, "arg");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "arg" + "'", str30, "arg");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "--" + "'", str37, "--");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "                                                    " + "'", str40, "                                                    ");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 74 + "'", int44 == 74);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "arg" + "'", str47, "arg");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 74 + "'", int54 == 74);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "arg" + "'", str57, "arg");
        org.junit.Assert.assertNotNull(comparator64);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "arg" + "'", str69, "arg");
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.util.Comparator comparator5 = null;
        helpFormatter0.setOptionComparator(comparator5);
        java.lang.String str7 = helpFormatter0.defaultArgName;
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setOptPrefix("\n");
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        int int12 = helpFormatter0.getDescPadding();
        java.lang.String str13 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultOptPrefix = "                                                                          ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("\n");
        java.lang.String str10 = helpFormatter0.createPadding((int) (short) 100);
        java.lang.String str12 = helpFormatter0.createPadding((int) 'a');
        helpFormatter0.defaultNewLine = "usage:";
        java.lang.String str15 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                    " + "'", str10, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                 " + "'", str12, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "usage:" + "'", str15, "usage:");
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        int int5 = helpFormatter0.getLeftPadding();
        int int9 = helpFormatter0.findWrapPos(" ", (int) (short) 1, 10);
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        java.lang.Class<?> wildcardClass11 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setWidth(3);
        helpFormatter0.defaultLeftPad = (byte) 1;
        int int11 = helpFormatter0.defaultWidth;
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, 12, 87, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.util.Comparator comparator5 = null;
        helpFormatter0.setOptionComparator(comparator5);
        helpFormatter0.setLeftPadding((int) (short) -1);
        java.lang.String str9 = helpFormatter0.getArgName();
        int int10 = helpFormatter0.getLeftPadding();
        java.util.Comparator comparator11 = helpFormatter0.getOptionComparator();
        java.lang.String str12 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(comparator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "usage:";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
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
        java.lang.String str19 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-" + "'", str19, "-");
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        java.util.Comparator comparator9 = helpFormatter0.getOptionComparator();
        java.lang.String str11 = helpFormatter0.createPadding(1);
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        int int13 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                         ", "                                                                            ", options16, "                                                                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " " + "'", str11, " ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        int int3 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter4 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str6 = helpFormatter4.rtrim("arg");
        helpFormatter4.setSyntaxPrefix("-");
        java.lang.String str9 = helpFormatter4.getOptPrefix();
        helpFormatter4.setNewLine("");
        java.lang.String str12 = helpFormatter4.getLongOptPrefix();
        helpFormatter4.defaultLongOptPrefix = "usage: ";
        java.lang.String str15 = helpFormatter4.defaultArgName;
        java.lang.String str16 = helpFormatter4.getNewLine();
        java.util.Comparator comparator17 = helpFormatter4.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter18 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str20 = helpFormatter18.rtrim("arg");
        java.lang.String str21 = helpFormatter18.defaultSyntaxPrefix;
        helpFormatter18.setNewLine("hi!");
        helpFormatter18.defaultWidth = (byte) 0;
        org.apache.commons.cli.HelpFormatter helpFormatter26 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str28 = helpFormatter26.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter29 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str31 = helpFormatter29.rtrim("arg");
        java.lang.String str32 = helpFormatter29.defaultSyntaxPrefix;
        java.lang.String str33 = helpFormatter29.defaultOptPrefix;
        java.util.Comparator comparator34 = helpFormatter29.getOptionComparator();
        helpFormatter26.optionComparator = comparator34;
        int int39 = helpFormatter26.findWrapPos("usage: ", 3, (int) (short) 10);
        helpFormatter26.defaultArgName = "\n";
        int int42 = helpFormatter26.defaultLeftPad;
        java.util.Comparator comparator43 = helpFormatter26.optionComparator;
        helpFormatter18.optionComparator = comparator43;
        helpFormatter4.setOptionComparator(comparator43);
        helpFormatter0.setOptionComparator(comparator43);
        java.lang.String str47 = helpFormatter0.getLongOptPrefix();
        java.util.Comparator comparator48 = helpFormatter0.optionComparator;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(comparator17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "arg" + "'", str20, "arg");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "usage: " + "'", str21, "usage: ");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "arg" + "'", str28, "arg");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "arg" + "'", str31, "arg");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "usage: " + "'", str32, "usage: ");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-" + "'", str33, "-");
        org.junit.Assert.assertNotNull(comparator34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(comparator43);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "--" + "'", str47, "--");
        org.junit.Assert.assertNotNull(comparator48);
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
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
        java.util.Comparator comparator18 = helpFormatter0.optionComparator;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(comparator18);
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultArgName = "                                                                                                    ";
        int int10 = helpFormatter0.defaultLeftPad;
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str13 = helpFormatter11.rtrim("arg");
        helpFormatter11.defaultOptPrefix = "--";
        helpFormatter11.setOptPrefix("-");
        helpFormatter11.setDescPadding(1);
        int int20 = helpFormatter11.getWidth();
        helpFormatter11.defaultArgName = "hi!";
        helpFormatter11.setOptPrefix("                                                                          ");
        java.util.Comparator comparator25 = helpFormatter11.optionComparator;
        helpFormatter0.setOptionComparator(comparator25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 74 + "'", int20 == 74);
        org.junit.Assert.assertNotNull(comparator25);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
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
        java.lang.String str17 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                                                                                    " + "'", str17, "                                                                                                    ");
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultArgName = "\n";
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.Class<?> wildcardClass9 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
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
        java.lang.String str41 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setWidth((int) (byte) 10);
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "usage: " + "'", str41, "usage: ");
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setWidth(1);
        helpFormatter0.defaultOptPrefix = "-";
        helpFormatter0.setArgName("                                                                   ");
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
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
        java.lang.String str28 = helpFormatter0.rtrim(" ");
        helpFormatter0.setOptPrefix("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "usage: " + "'", str20, "usage: ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-" + "'", str21, "-");
        org.junit.Assert.assertNotNull(comparator22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultDescPad;
        int int8 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str11 = helpFormatter9.rtrim("arg");
        java.lang.String str12 = helpFormatter9.defaultSyntaxPrefix;
        java.lang.String str13 = helpFormatter9.defaultOptPrefix;
        java.util.Comparator comparator14 = helpFormatter9.getOptionComparator();
        helpFormatter0.setOptionComparator(comparator14);
        java.lang.String str16 = helpFormatter0.getNewLine();
        int int17 = helpFormatter0.defaultDescPad;
        java.lang.String str18 = helpFormatter0.defaultLongOptPrefix;
        java.io.PrintWriter printWriter19 = null;
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter19, 1, "           ", "                                                                          ", options23, 0, 12, "-", false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:   ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "--" + "'", str18, "--");
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setNewLine("\n");
        java.lang.String str11 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setWidth(13);
        helpFormatter0.defaultSyntaxPrefix = "  ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix("usage: ");
        int int11 = helpFormatter0.findWrapPos("--", (int) 'a', 10);
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter13 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str15 = helpFormatter13.rtrim("arg");
        org.apache.commons.cli.HelpFormatter helpFormatter16 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str18 = helpFormatter16.rtrim("arg");
        java.lang.String str19 = helpFormatter16.defaultSyntaxPrefix;
        java.lang.String str20 = helpFormatter16.defaultOptPrefix;
        java.util.Comparator comparator21 = helpFormatter16.getOptionComparator();
        helpFormatter13.optionComparator = comparator21;
        helpFormatter13.defaultLeftPad = 74;
        helpFormatter13.setArgName(" ");
        java.util.Comparator comparator27 = helpFormatter13.getOptionComparator();
        helpFormatter0.optionComparator = comparator27;
        java.lang.String str29 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arg" + "'", str18, "arg");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-" + "'", str20, "-");
        org.junit.Assert.assertNotNull(comparator21);
        org.junit.Assert.assertNotNull(comparator27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "--" + "'", str29, "--");
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.setNewLine("\n");
        int int11 = helpFormatter0.defaultLeftPad;
        java.lang.String str13 = helpFormatter0.createPadding((int) (byte) 100);
        java.lang.String str14 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter15, 32, "         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                                                                                    " + "'", str13, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        int int6 = helpFormatter0.findWrapPos("--", (int) '#', (int) (short) 100);
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.defaultOptPrefix = "                                                                   ";
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter11, 11, 67, "                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:                                                                    ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.io.PrintWriter printWriter7 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter7, 2, "                                ", options10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        java.lang.String str8 = helpFormatter0.getNewLine();
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultDescPad = 74;
        helpFormatter0.defaultArgName = "                                   ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        helpFormatter0.defaultNewLine = "usage: ";
        int int12 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix(" ");
        helpFormatter0.setNewLine("           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
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
        helpFormatter0.defaultArgName = "  ";
        helpFormatter0.setSyntaxPrefix("          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.util.Comparator comparator4 = helpFormatter0.optionComparator;
        helpFormatter0.defaultSyntaxPrefix = "\n";
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        java.lang.Class<?> wildcardClass9 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultDescPad = (short) 100;
        int int14 = helpFormatter0.findWrapPos("                                                                                                    ", (int) (short) 1, (int) (short) 100);
        int int15 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        int int9 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(comparator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.getArgName();
        int int6 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.defaultArgName = "                                                                                                    ";
        int int7 = helpFormatter0.defaultWidth;
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.util.Comparator comparator9 = helpFormatter0.optionComparator;
        java.lang.String str10 = helpFormatter0.getNewLine();
        java.lang.String str11 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
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
        int int15 = helpFormatter0.defaultDescPad;
        java.util.Comparator comparator16 = helpFormatter0.getOptionComparator();
        java.io.PrintWriter printWriter17 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter17, (int) '#', "usage:", "                                                                   ", options21, 67, 52, "                                ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(comparator16);
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
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
        java.lang.String str16 = helpFormatter0.getArgName();
        org.apache.commons.cli.HelpFormatter helpFormatter17 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str19 = helpFormatter17.rtrim("arg");
        helpFormatter17.defaultOptPrefix = "--";
        helpFormatter17.setOptPrefix("-");
        helpFormatter17.setDescPadding(1);
        helpFormatter17.defaultDescPad = (short) 100;
        org.apache.commons.cli.HelpFormatter helpFormatter28 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str30 = helpFormatter28.rtrim("arg");
        java.lang.String str31 = helpFormatter28.defaultSyntaxPrefix;
        java.util.Comparator comparator32 = helpFormatter28.optionComparator;
        java.lang.String str33 = helpFormatter28.getOptPrefix();
        org.apache.commons.cli.HelpFormatter helpFormatter34 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str36 = helpFormatter34.rtrim("arg");
        helpFormatter34.defaultOptPrefix = "--";
        helpFormatter34.setOptPrefix("-");
        helpFormatter34.setDescPadding(1);
        java.util.Comparator comparator43 = helpFormatter34.getOptionComparator();
        helpFormatter28.optionComparator = comparator43;
        java.util.Comparator comparator45 = helpFormatter28.optionComparator;
        helpFormatter17.optionComparator = comparator45;
        helpFormatter17.defaultSyntaxPrefix = "--";
        helpFormatter17.defaultOptPrefix = "--";
        java.util.Comparator comparator51 = helpFormatter17.optionComparator;
        helpFormatter0.setOptionComparator(comparator51);
        helpFormatter0.defaultDescPad = (byte) 10;
        helpFormatter0.defaultWidth = '#';
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arg" + "'", str19, "arg");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "arg" + "'", str30, "arg");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "usage: " + "'", str31, "usage: ");
        org.junit.Assert.assertNotNull(comparator32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-" + "'", str33, "-");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "arg" + "'", str36, "arg");
        org.junit.Assert.assertNotNull(comparator43);
        org.junit.Assert.assertNotNull(comparator45);
        org.junit.Assert.assertNotNull(comparator51);
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
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
        int int28 = helpFormatter0.defaultLeftPad;
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setNewLine("-");
        int int8 = helpFormatter0.defaultDescPad;
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        helpFormatter0.setWidth((int) (byte) 1);
        java.lang.String str12 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.getNewLine();
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLeftPadding((-1));
        java.lang.String str10 = helpFormatter0.getArgName();
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", options12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.util.Comparator comparator5 = helpFormatter0.getOptionComparator();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.String str9 = helpFormatter0.getArgName();
        helpFormatter0.defaultSyntaxPrefix = "                                             ";
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
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.rtrim("--");
        int int8 = helpFormatter0.getWidth();
        int int12 = helpFormatter0.findWrapPos("                                                                                                 ", (int) (byte) 100, 86);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
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
        int int18 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("arg");
        helpFormatter0.setDescPadding((int) '#');
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 100, "                                             ", "-", options13, "                                                                         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        int int9 = helpFormatter0.getWidth();
        helpFormatter0.defaultWidth = (byte) 10;
        helpFormatter0.defaultWidth = 0;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        java.lang.String str4 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.defaultArgName = "                                   ";
        helpFormatter0.setDescPadding(10);
        int int11 = helpFormatter0.getDescPadding();
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter12, 74, options14, (int) (byte) 10, 73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
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
        java.lang.StringBuffer stringBuffer20 = null;
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer25 = helpFormatter0.renderOptions(stringBuffer20, 86, options22, (int) (byte) 100, 73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
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
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getArgName();
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultLongOptPrefix = "                                                    ";
        helpFormatter0.defaultLeftPad = (-1);
        helpFormatter0.defaultArgName = "                                                    ";
        java.io.PrintWriter printWriter17 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter17, 3, options19, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        java.lang.String str4 = helpFormatter0.defaultSyntaxPrefix;
        int int8 = helpFormatter0.findWrapPos("-", (int) (short) 100, (int) (short) -1);
        helpFormatter0.defaultSyntaxPrefix = "                                                                         ";
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter13, (int) '#', 9, "                                                                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.rtrim("--");
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultDescPad = (short) 10;
        java.lang.String str11 = helpFormatter0.getSyntaxPrefix();
        java.util.Comparator comparator12 = helpFormatter0.optionComparator;
        int int13 = helpFormatter0.getWidth();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertNotNull(comparator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
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
        java.util.Comparator comparator18 = helpFormatter0.optionComparator;
        java.lang.String str19 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        java.util.Comparator comparator22 = helpFormatter0.optionComparator;
        org.apache.commons.cli.HelpFormatter helpFormatter23 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str25 = helpFormatter23.rtrim("arg");
        helpFormatter23.setSyntaxPrefix("-");
        java.lang.String str28 = helpFormatter23.getOptPrefix();
        helpFormatter23.setNewLine("");
        java.lang.String str31 = helpFormatter23.getArgName();
        helpFormatter23.setNewLine("-");
        helpFormatter23.defaultLongOptPrefix = "                                                    ";
        org.apache.commons.cli.HelpFormatter helpFormatter36 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str38 = helpFormatter36.rtrim("arg");
        helpFormatter36.setSyntaxPrefix("-");
        java.lang.String str41 = helpFormatter36.getOptPrefix();
        helpFormatter36.setNewLine("");
        java.lang.String str44 = helpFormatter36.getArgName();
        helpFormatter36.setNewLine("-");
        helpFormatter36.defaultLongOptPrefix = "                                                    ";
        helpFormatter36.defaultLeftPad = (-1);
        org.apache.commons.cli.HelpFormatter helpFormatter51 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str53 = helpFormatter51.rtrim("arg");
        helpFormatter51.defaultOptPrefix = "--";
        helpFormatter51.setOptPrefix("-");
        helpFormatter51.setDescPadding(1);
        java.lang.String str60 = helpFormatter51.defaultLongOptPrefix;
        int int61 = helpFormatter51.getLeftPadding();
        java.lang.String str63 = helpFormatter51.createPadding((int) '4');
        int int67 = helpFormatter51.findWrapPos("                                                                                                    ", 74, 0);
        org.apache.commons.cli.HelpFormatter helpFormatter68 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str70 = helpFormatter68.rtrim("arg");
        helpFormatter68.defaultOptPrefix = "--";
        helpFormatter68.setOptPrefix("-");
        helpFormatter68.setDescPadding(1);
        int int77 = helpFormatter68.getWidth();
        org.apache.commons.cli.HelpFormatter helpFormatter78 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str80 = helpFormatter78.rtrim("arg");
        helpFormatter78.defaultOptPrefix = "--";
        helpFormatter78.setOptPrefix("-");
        helpFormatter78.setDescPadding(1);
        java.util.Comparator comparator87 = helpFormatter78.getOptionComparator();
        helpFormatter68.optionComparator = comparator87;
        helpFormatter51.setOptionComparator(comparator87);
        helpFormatter36.setOptionComparator(comparator87);
        helpFormatter23.optionComparator = comparator87;
        helpFormatter0.setOptionComparator(comparator87);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(comparator18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "usage: " + "'", str19, "usage: ");
        org.junit.Assert.assertNotNull(comparator22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "arg" + "'", str25, "arg");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-" + "'", str28, "-");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "arg" + "'", str31, "arg");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "arg" + "'", str38, "arg");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "-" + "'", str41, "-");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "arg" + "'", str44, "arg");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "arg" + "'", str53, "arg");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "--" + "'", str60, "--");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "                                                    " + "'", str63, "                                                    ");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 74 + "'", int67 == 74);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "arg" + "'", str70, "arg");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 74 + "'", int77 == 74);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "arg" + "'", str80, "arg");
        org.junit.Assert.assertNotNull(comparator87);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        int int6 = helpFormatter0.findWrapPos("--", (int) '#', (int) (short) 100);
        java.lang.String str8 = helpFormatter0.createPadding((int) '#');
        helpFormatter0.setOptPrefix("");
        int int11 = helpFormatter0.defaultLeftPad;
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setArgName("                                                                                                 ");
        java.lang.String str16 = helpFormatter0.rtrim("                                                                                                 ");
        helpFormatter0.defaultSyntaxPrefix = "                                                                         ";
        java.lang.String str19 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                   " + "'", str8, "                                   ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                                                         " + "'", str19, "                                                                         ");
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        helpFormatter0.defaultArgName = "                                                    ";
        org.apache.commons.cli.HelpFormatter helpFormatter9 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str11 = helpFormatter9.rtrim("arg");
        java.lang.String str12 = helpFormatter9.defaultSyntaxPrefix;
        helpFormatter9.setNewLine("hi!");
        helpFormatter9.defaultWidth = (byte) 0;
        helpFormatter9.defaultDescPad = (short) 0;
        int int22 = helpFormatter9.findWrapPos("\n", (int) (short) 0, (int) (short) 100);
        org.apache.commons.cli.HelpFormatter helpFormatter23 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str25 = helpFormatter23.rtrim("arg");
        helpFormatter23.defaultWidth = (short) -1;
        java.lang.String str28 = helpFormatter23.defaultArgName;
        java.lang.String str29 = helpFormatter23.defaultArgName;
        java.util.Comparator comparator30 = helpFormatter23.getOptionComparator();
        helpFormatter9.setOptionComparator(comparator30);
        int int32 = helpFormatter9.defaultDescPad;
        org.apache.commons.cli.HelpFormatter helpFormatter33 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str35 = helpFormatter33.rtrim("arg");
        helpFormatter33.defaultWidth = (short) -1;
        java.lang.String str38 = helpFormatter33.defaultArgName;
        java.lang.String str39 = helpFormatter33.defaultArgName;
        helpFormatter33.setOptPrefix("hi!");
        helpFormatter33.defaultSyntaxPrefix = "usage: ";
        java.lang.String str44 = helpFormatter33.defaultNewLine;
        int int45 = helpFormatter33.defaultDescPad;
        java.lang.String str46 = helpFormatter33.getArgName();
        int int47 = helpFormatter33.defaultLeftPad;
        java.util.Comparator comparator48 = helpFormatter33.optionComparator;
        helpFormatter9.optionComparator = comparator48;
        helpFormatter0.optionComparator = comparator48;
        java.lang.String str51 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "arg" + "'", str25, "arg");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "arg" + "'", str28, "arg");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "arg" + "'", str29, "arg");
        org.junit.Assert.assertNotNull(comparator30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "arg" + "'", str35, "arg");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "arg" + "'", str38, "arg");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "arg" + "'", str39, "arg");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\n" + "'", str44, "\n");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "arg" + "'", str46, "arg");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(comparator48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "usage: " + "'", str51, "usage: ");
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
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
        java.util.Comparator comparator57 = helpFormatter0.optionComparator;
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
        org.junit.Assert.assertNotNull(comparator57);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setWidth(1);
        helpFormatter0.defaultOptPrefix = "-";
        int int5 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        helpFormatter0.defaultArgName = "                                                    ";
        helpFormatter0.setWidth((int) '4');
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                ", options12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
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
        helpFormatter0.defaultNewLine = "                                                    ";
        int int21 = helpFormatter0.defaultDescPad;
        int int25 = helpFormatter0.findWrapPos("   ", (int) '4', 1);
        org.apache.commons.cli.Options options27 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(" ", options27);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        int int4 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLongOptPrefix = "                                                                                                 ";
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                         ", options8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setLongOptPrefix("hi!");
        java.util.Comparator comparator9 = helpFormatter0.optionComparator;
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.defaultLeftPad = 3;
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertNotNull(comparator9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setNewLine("\n");
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setOptPrefix("usage: ");
        int int11 = helpFormatter0.findWrapPos("hi!", (int) (byte) -1, (int) (byte) 100);
        helpFormatter0.setOptPrefix("usage:");
        helpFormatter0.defaultWidth = 87;
        helpFormatter0.defaultLongOptPrefix = " ";
        java.io.PrintWriter printWriter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter18, (int) 'a', "                                                                            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultWidth = 1;
        helpFormatter0.defaultLeftPad = (short) 100;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
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
        int int19 = helpFormatter0.findWrapPos("                                                                                                    ", 0, (int) '4');
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", options21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Text too long for line - throwing exception to avoid infinite loop [CLI-162]:               usage:");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertNotNull(comparator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setDescPadding(1);
        int int9 = helpFormatter0.getWidth();
        int int10 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                 ";
        int int13 = helpFormatter0.defaultWidth;
        int int14 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
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
        java.lang.String str17 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = ' ';
        helpFormatter0.setLongOptPrefix("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        java.lang.String str4 = helpFormatter0.defaultSyntaxPrefix;
        int int8 = helpFormatter0.findWrapPos("-", (int) (short) 100, (int) (short) -1);
        helpFormatter0.defaultSyntaxPrefix = "                                                                         ";
        org.apache.commons.cli.HelpFormatter helpFormatter11 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str13 = helpFormatter11.rtrim("arg");
        helpFormatter11.defaultWidth = (short) -1;
        java.lang.String str16 = helpFormatter11.defaultArgName;
        helpFormatter11.setSyntaxPrefix("arg");
        helpFormatter11.setDescPadding((int) '#');
        org.apache.commons.cli.HelpFormatter helpFormatter21 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str23 = helpFormatter21.rtrim("arg");
        helpFormatter21.defaultWidth = (short) -1;
        java.lang.String str26 = helpFormatter21.getArgName();
        org.apache.commons.cli.HelpFormatter helpFormatter27 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str29 = helpFormatter27.rtrim("arg");
        helpFormatter27.defaultWidth = (short) -1;
        java.lang.String str32 = helpFormatter27.defaultArgName;
        helpFormatter27.setSyntaxPrefix("arg");
        helpFormatter27.setSyntaxPrefix("--");
        java.util.Comparator comparator37 = helpFormatter27.optionComparator;
        helpFormatter21.optionComparator = comparator37;
        helpFormatter11.optionComparator = comparator37;
        helpFormatter0.setOptionComparator(comparator37);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arg" + "'", str16, "arg");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "arg" + "'", str23, "arg");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "arg" + "'", str26, "arg");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "arg" + "'", str29, "arg");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "arg" + "'", str32, "arg");
        org.junit.Assert.assertNotNull(comparator37);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
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
        java.util.Comparator comparator17 = helpFormatter0.optionComparator;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(comparator17);
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        helpFormatter0.setSyntaxPrefix("-");
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        helpFormatter0.setSyntaxPrefix("arg");
        java.util.Comparator comparator13 = helpFormatter0.optionComparator;
        helpFormatter0.defaultOptPrefix = "                                                                                                 ";
        helpFormatter0.defaultLongOptPrefix = " ";
        java.util.Comparator comparator18 = helpFormatter0.optionComparator;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertNotNull(comparator13);
        org.junit.Assert.assertNotNull(comparator18);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("arg");
        java.lang.String str3 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "usage: ";
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("\n");
        java.lang.String str10 = helpFormatter0.createPadding((int) (short) 100);
        int int11 = helpFormatter0.defaultLeftPad;
        java.lang.String str13 = helpFormatter0.createPadding(0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                    " + "'", str10, "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }
}

