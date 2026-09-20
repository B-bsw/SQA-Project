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
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        int int4 = helpFormatter0.getDescPadding();
        java.lang.String str5 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "";
        helpFormatter0.setLongOptPrefix("");
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultSyntaxPrefix = "arg";
        helpFormatter0.defaultOptPrefix = "\n";
        java.lang.String str16 = helpFormatter0.rtrim("                                                              ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setOptPrefix("-");
        int int3 = helpFormatter0.getDescPadding();
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        int int6 = helpFormatter0.defaultLeftPad;
        java.lang.String str8 = helpFormatter0.rtrim("arg");
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 10, "           ", "   ", options13, "                                                     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setSyntaxPrefix("          ");
        java.lang.String str8 = helpFormatter0.getNewLine();
        helpFormatter0.setOptPrefix("           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        java.lang.String str2 = helpFormatter0.getNewLine();
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultDescPad = 0;
        helpFormatter0.setWidth((int) (byte) 1);
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str18 = helpFormatter0.getNewLine();
        int int19 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultOptPrefix = "                                   ";
        int int22 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "usage: " + "'", str18, "usage: ");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        int int2 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (byte) 1);
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultArgName = "   ";
        helpFormatter0.defaultArgName = "";
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        int int4 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLeftPad = 10;
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLeftPadding(3);
        helpFormatter0.setOptPrefix("                                                              ");
        helpFormatter0.defaultLeftPad = (short) 1;
        helpFormatter0.defaultDescPad = (short) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setDescPadding((int) (short) 1);
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.defaultOptPrefix = "-";
        int int9 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultSyntaxPrefix = "                                   ";
        java.lang.String str12 = helpFormatter0.defaultArgName;
        java.lang.String str13 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setNewLine("hi!");
        int int9 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "                                ";
        helpFormatter0.setNewLine("-");
        java.lang.String str14 = helpFormatter0.getArgName();
        java.lang.String str15 = helpFormatter0.getArgName();
        helpFormatter0.defaultSyntaxPrefix = "-";
        int int18 = helpFormatter0.getLeftPadding();
        java.lang.String str19 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setSyntaxPrefix("             ");
        helpFormatter0.setNewLine("                                                                          ");
        java.lang.String str24 = helpFormatter0.getNewLine();
        java.io.PrintWriter printWriter25 = null;
        org.apache.commons.cli.Options options27 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter25, 45, options27, (int) (short) 1, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                " + "'", str14, "                                ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                " + "'", str15, "                                ");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "--" + "'", str19, "--");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "                                                                          " + "'", str24, "                                                                          ");
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        int int4 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLeftPad = 10;
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.defaultLongOptPrefix = "                                                                          ";
        java.lang.String str11 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "    ";
        helpFormatter0.setNewLine("                                                                                                    ");
        helpFormatter0.setLongOptPrefix("  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                          " + "'", str11, "                                                                          ");
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = (-1);
        int int7 = helpFormatter0.defaultDescPad;
        int int8 = helpFormatter0.defaultWidth;
        int int9 = helpFormatter0.getDescPadding();
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setDescPadding((int) (short) 1);
        java.lang.String str6 = helpFormatter0.createPadding((int) ' ');
        int int7 = helpFormatter0.getWidth();
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        int int10 = helpFormatter0.defaultDescPad;
        int int11 = helpFormatter0.getLeftPadding();
        helpFormatter0.setOptPrefix("usage: ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                " + "'", str6, "                                ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setDescPadding((int) (short) 1);
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.defaultOptPrefix = "-";
        helpFormatter0.defaultArgName = "arg";
        helpFormatter0.setLeftPadding((int) (byte) 1);
        java.lang.String str14 = helpFormatter0.rtrim("hi!");
        helpFormatter0.defaultNewLine = "                                   ";
        java.lang.String str17 = helpFormatter0.getSyntaxPrefix();
        int int18 = helpFormatter0.getWidth();
        helpFormatter0.setNewLine(" ");
        helpFormatter0.setLeftPadding(0);
        int int23 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setLeftPadding(62);
        helpFormatter0.setArgName("                                                                          ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage: " + "'", str17, "usage: ");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        helpFormatter0.setNewLine("");
        int int12 = helpFormatter0.findWrapPos("usage:", (int) (short) 100, (int) 'a');
        int int13 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLongOptPrefix = "-";
        helpFormatter0.setOptPrefix("                                                                                                    ");
        helpFormatter0.setSyntaxPrefix("\n");
        helpFormatter0.setNewLine("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        int int3 = helpFormatter0.getLeftPadding();
        java.lang.String str4 = helpFormatter0.getNewLine();
        java.lang.String str6 = helpFormatter0.rtrim("                                                                                                    ");
        helpFormatter0.setArgName("             ");
        helpFormatter0.setSyntaxPrefix("arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setLongOptPrefix("hi!");
        java.lang.String str4 = helpFormatter0.rtrim("hi!");
        int int5 = helpFormatter0.getWidth();
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str3 = helpFormatter0.getArgName();
        int int4 = helpFormatter0.getLeftPadding();
        helpFormatter0.setNewLine("             ");
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultWidth = 100;
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                 ";
        int int12 = helpFormatter0.defaultWidth;
        java.lang.String str13 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        java.lang.String str6 = helpFormatter0.createPadding(1);
        helpFormatter0.setLeftPadding((int) (short) 100);
        helpFormatter0.defaultNewLine = "                                                                          ";
        helpFormatter0.defaultOptPrefix = "   ";
        int int13 = helpFormatter0.getLeftPadding();
        java.lang.String str14 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultLongOptPrefix = "                                                              ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.setLeftPadding((int) (short) -1);
        int int8 = helpFormatter0.findWrapPos("", (int) '4', (int) '4');
        helpFormatter0.defaultDescPad = 52;
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        int int12 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                    ", "usage:", options15, "          ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        helpFormatter0.setNewLine("");
        helpFormatter0.setDescPadding(10);
        helpFormatter0.setSyntaxPrefix("\n");
        java.lang.String str17 = helpFormatter0.createPadding((int) (short) 0);
        java.lang.String str18 = helpFormatter0.getOptPrefix();
        java.lang.String str19 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-" + "'", str18, "-");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-" + "'", str19, "-");
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        java.lang.String str2 = helpFormatter0.getArgName();
        java.lang.String str4 = helpFormatter0.createPadding((int) (short) 100);
        java.lang.String str5 = helpFormatter0.getArgName();
        int int6 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultWidth = 'a';
        helpFormatter0.setWidth((int) 'a');
        helpFormatter0.setDescPadding(53);
        java.lang.String str13 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                    " + "'", str4, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str4 = helpFormatter0.createPadding(0);
        int int5 = helpFormatter0.defaultDescPad;
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultDescPad;
        helpFormatter0.setArgName(" ");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, (int) (byte) 1, 6, "                                               ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str4 = helpFormatter0.createPadding(0);
        int int5 = helpFormatter0.defaultDescPad;
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setWidth((int) ' ');
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) ' ', "--", "                                          ", options12, "    ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setArgName("usage:");
        int int13 = helpFormatter0.defaultWidth;
        int int14 = helpFormatter0.getWidth();
        java.lang.String str15 = helpFormatter0.getArgName();
        helpFormatter0.setDescPadding(97);
        java.lang.String str19 = helpFormatter0.createPadding(10);
        helpFormatter0.defaultArgName = "                                                                                                    ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "usage:" + "'", str15, "usage:");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "          " + "'", str19, "          ");
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultNewLine;
        int int5 = helpFormatter0.defaultWidth;
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        int int10 = helpFormatter0.findWrapPos("          ", 0, (int) ' ');
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultWidth = 45;
        int int15 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter16, 53, "usage: ", "                                                                 ", options20, 11, 2, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 45 + "'", int15 == 45);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("\n");
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter11, 33, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setNewLine("hi!");
        int int9 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "                                ";
        helpFormatter0.setNewLine("-");
        java.lang.String str14 = helpFormatter0.getArgName();
        java.lang.String str16 = helpFormatter0.createPadding((int) 'a');
        int int20 = helpFormatter0.findWrapPos("                                               ", (int) '4', (-1));
        helpFormatter0.defaultNewLine = "                                                                          ";
        helpFormatter0.defaultNewLine = "                                                                          ";
        helpFormatter0.defaultNewLine = "  ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                " + "'", str14, "                                ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                                 " + "'", str16, "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.setLeftPadding((int) (short) -1);
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setOptPrefix("-");
        int int9 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultOptPrefix = "usage:";
        java.lang.String str12 = helpFormatter0.getArgName();
        java.lang.String str13 = helpFormatter0.getArgName();
        int int14 = helpFormatter0.defaultDescPad;
        helpFormatter0.setOptPrefix("                                                              ");
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("             ", "-", options19, "                                   ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultSyntaxPrefix = "hi!";
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int10 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str3 = helpFormatter0.getArgName();
        int int4 = helpFormatter0.defaultDescPad;
        int int5 = helpFormatter0.defaultWidth;
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setNewLine("-");
        int int9 = helpFormatter0.defaultWidth;
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultNewLine = "           ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "arg";
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter13, 1, options15, 97, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        int int6 = helpFormatter0.findWrapPos("hi!", (int) (short) 10, 34);
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "                                                              ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setDescPadding((int) (short) 1);
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.defaultOptPrefix = "-";
        helpFormatter0.defaultArgName = "arg";
        helpFormatter0.setLeftPadding((int) (byte) 1);
        java.lang.String str14 = helpFormatter0.rtrim("hi!");
        helpFormatter0.defaultNewLine = "                                   ";
        java.lang.String str17 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.setLeftPadding((-1));
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                 ", options23);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage: " + "'", str17, "usage: ");
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        int int3 = helpFormatter0.getLeftPadding();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) 10;
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str9 = helpFormatter0.createPadding(35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                   " + "'", str9, "                                   ");
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str4 = helpFormatter0.createPadding(0);
        int int5 = helpFormatter0.defaultDescPad;
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        int int7 = helpFormatter0.defaultDescPad;
        helpFormatter0.setArgName(" ");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("  ", "                                 ", options15, "                                ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str3 = helpFormatter0.getArgName();
        int int4 = helpFormatter0.defaultDescPad;
        int int5 = helpFormatter0.defaultWidth;
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        int int7 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str3 = helpFormatter0.getArgName();
        int int4 = helpFormatter0.defaultWidth;
        int int5 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultOptPrefix = "\n";
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultArgName = "             ";
        java.lang.String str11 = helpFormatter0.getNewLine();
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        java.lang.String str7 = helpFormatter0.rtrim("hi!");
        helpFormatter0.setOptPrefix("hi!");
        helpFormatter0.defaultWidth = 32;
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setNewLine("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "\n";
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultArgName = "                                                                                                 ";
        helpFormatter0.defaultDescPad = 97;
        helpFormatter0.defaultOptPrefix = "                                   ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        int int3 = helpFormatter0.getWidth();
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        int int8 = helpFormatter0.findWrapPos("hi!", (int) (byte) 10, 34);
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setDescPadding((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 74 + "'", int3 == 74);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        java.lang.String str5 = helpFormatter0.rtrim("\n");
        helpFormatter0.setLongOptPrefix("\n");
        int int8 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultOptPrefix = "arg";
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(47, "\n", "-", options15, "    ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        int int4 = helpFormatter0.getWidth();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        int int7 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setOptPrefix("                                  ");
        helpFormatter0.setDescPadding((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        int int9 = helpFormatter0.getLeftPadding();
        helpFormatter0.setSyntaxPrefix("                                                                                                 ");
        int int15 = helpFormatter0.findWrapPos("", (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        helpFormatter0.setDescPadding(1);
        int int6 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.setDescPadding(52);
        int int10 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.setLeftPadding((int) (short) -1);
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str10 = helpFormatter0.getArgName();
        helpFormatter0.setArgName("   ");
        java.lang.String str13 = helpFormatter0.getOptPrefix();
        java.lang.String str14 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str16 = helpFormatter0.rtrim("--");
        helpFormatter0.defaultLongOptPrefix = "-";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.setLeftPadding((int) (short) -1);
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setSyntaxPrefix("hi!");
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        java.lang.String str2 = helpFormatter0.getArgName();
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str6 = helpFormatter0.createPadding(74);
        helpFormatter0.setWidth(65);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                          " + "'", str6, "                                                                          ");
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer18 = helpFormatter0.renderOptions(stringBuffer13, 15, options15, 47, 47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setLongOptPrefix("hi!");
        java.lang.String str4 = helpFormatter0.rtrim("hi!");
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLongOptPrefix = "";
        helpFormatter0.setLongOptPrefix("                                                                          ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultArgName = "--";
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("arg");
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setNewLine("usage:");
        helpFormatter0.defaultLeftPad = 97;
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) -1, "                                               ", "      ", options18, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 54");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-" + "'", str2, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage:" + "'", str14, "usage:");
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        int int2 = helpFormatter0.defaultDescPad;
        int int3 = helpFormatter0.defaultLeftPad;
        java.lang.String str4 = helpFormatter0.defaultNewLine;
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLeftPadding(1);
        java.lang.String str7 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter8 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter8, (int) '#', "                                 ", options11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setSyntaxPrefix("                                ");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultOptPrefix = "    ";
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        helpFormatter0.defaultDescPad = (byte) 100;
        int int7 = helpFormatter0.defaultWidth;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setArgName("                                                    ");
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, 32, "                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setOptPrefix("-");
        int int3 = helpFormatter0.getDescPadding();
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        int int7 = helpFormatter0.defaultWidth;
        java.lang.String str8 = helpFormatter0.getNewLine();
        helpFormatter0.defaultSyntaxPrefix = "    ";
        helpFormatter0.setWidth((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setSyntaxPrefix("                                ");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str5 = helpFormatter0.getArgName();
        int int9 = helpFormatter0.findWrapPos("          ", (int) (byte) 0, 13);
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultOptPrefix = "                                   ";
        java.lang.String str13 = helpFormatter0.defaultOptPrefix;
        java.lang.String str14 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setOptPrefix("usage:");
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str19 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str20 = helpFormatter0.getLongOptPrefix();
        java.lang.String str21 = helpFormatter0.getLongOptPrefix();
        int int22 = helpFormatter0.getWidth();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                   " + "'", str13, "                                   ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                   " + "'", str14, "                                   ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                " + "'", str19, "                                ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "--" + "'", str20, "--");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 74 + "'", int22 == 74);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.setLeftPadding((int) (short) -1);
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str10 = helpFormatter0.getArgName();
        java.lang.String str11 = helpFormatter0.defaultArgName;
        helpFormatter0.setLongOptPrefix(" ");
        java.lang.String str15 = helpFormatter0.createPadding((int) (byte) 100);
        int int16 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                                                                                    " + "'", str15, "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        int int4 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLeftPad = 10;
        helpFormatter0.setLongOptPrefix("\n");
        helpFormatter0.defaultLongOptPrefix = "                                                                          ";
        java.lang.String str12 = helpFormatter0.rtrim("hi!");
        helpFormatter0.defaultWidth = (byte) 0;
        helpFormatter0.defaultNewLine = "-";
        java.lang.String str17 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                                                          " + "'", str17, "                                                                          ");
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setLongOptPrefix("hi!");
        java.lang.String str4 = helpFormatter0.rtrim("hi!");
        java.lang.String str5 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "--";
        helpFormatter0.defaultNewLine = "hi!";
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.defaultDescPad = (byte) 0;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        int int4 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLeftPad = 10;
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setLeftPadding(3);
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        int int6 = helpFormatter0.findWrapPos("hi!", (int) (byte) 100, 74);
        int int10 = helpFormatter0.findWrapPos("arg", 74, (-1));
        int int14 = helpFormatter0.findWrapPos("                                                                                                    ", (int) (short) -1, (int) '#');
        java.lang.String str15 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix("                                                                                                    ");
        java.lang.String str19 = helpFormatter0.createPadding(32);
        java.lang.String str21 = helpFormatter0.rtrim("\n");
        java.lang.String str22 = helpFormatter0.defaultNewLine;
        helpFormatter0.setOptPrefix("                                                              ");
        int int25 = helpFormatter0.getDescPadding();
        java.io.PrintWriter printWriter26 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter26, 62, (int) 'a', "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                " + "'", str19, "                                ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n" + "'", str22, "\n");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setNewLine("hi!");
        int int9 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "                                ";
        helpFormatter0.setNewLine("-");
        java.lang.String str14 = helpFormatter0.getArgName();
        helpFormatter0.setDescPadding((int) '4');
        int int17 = helpFormatter0.getDescPadding();
        int int18 = helpFormatter0.getDescPadding();
        helpFormatter0.setLongOptPrefix("usage: ");
        helpFormatter0.setArgName("                                   ");
        java.lang.String str23 = helpFormatter0.defaultOptPrefix;
        int int24 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                " + "'", str14, "                                ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setNewLine("hi!");
        int int9 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "                                ";
        helpFormatter0.setNewLine("-");
        java.lang.String str14 = helpFormatter0.getArgName();
        helpFormatter0.setDescPadding((int) '4');
        int int17 = helpFormatter0.getDescPadding();
        int int18 = helpFormatter0.getDescPadding();
        java.lang.String str19 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = "   ";
        helpFormatter0.defaultSyntaxPrefix = "                                          ";
        helpFormatter0.defaultLongOptPrefix = "--";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                " + "'", str14, "                                ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-" + "'", str19, "-");
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth((-1));
        helpFormatter0.setWidth(16);
        helpFormatter0.defaultDescPad = 53;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        helpFormatter0.setSyntaxPrefix("hi!");
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(53, "-", "--", options12, "           ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        int int8 = helpFormatter0.defaultDescPad;
        int int12 = helpFormatter0.findWrapPos("                                   ", 6, 45);
        helpFormatter0.defaultArgName = "  ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLeftPadding(1);
        java.lang.String str7 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultLeftPad = 15;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        java.lang.String str2 = helpFormatter0.getArgName();
        int int3 = helpFormatter0.getWidth();
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setLongOptPrefix("arg");
        java.io.PrintWriter printWriter7 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter7, 1, "                                  ", "hi!", options11, (int) (short) 1, (int) '#', "  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 74 + "'", int3 == 74);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setLongOptPrefix("                                  ");
        int int6 = helpFormatter0.getWidth();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        helpFormatter0.defaultLongOptPrefix = "                                                                          ";
        int int7 = helpFormatter0.defaultDescPad;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setDescPadding(11);
        helpFormatter0.defaultWidth = '#';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                          " + "'", str8, "                                                                          ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                          " + "'", str9, "                                                                          ");
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.defaultNewLine = "--";
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultDescPad = 97;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        int int3 = helpFormatter0.getWidth();
        java.lang.String str4 = helpFormatter0.getArgName();
        org.apache.commons.cli.Options options6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                  ", options6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 74 + "'", int3 == 74);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "\n";
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.setWidth((int) (byte) 10);
        java.lang.String str10 = helpFormatter0.getArgName();
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        java.lang.String str13 = helpFormatter0.rtrim("   ");
        int int14 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str3 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        int int2 = helpFormatter0.defaultDescPad;
        helpFormatter0.setSyntaxPrefix("                                                              ");
        helpFormatter0.setOptPrefix("                                                                                                 ");
        java.lang.String str8 = helpFormatter0.rtrim("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setNewLine("hi!");
        int int9 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "                                ";
        helpFormatter0.setNewLine("-");
        java.lang.String str14 = helpFormatter0.getArgName();
        helpFormatter0.setDescPadding((int) '4');
        int int17 = helpFormatter0.defaultWidth;
        helpFormatter0.setOptPrefix("usage:");
        int int20 = helpFormatter0.defaultDescPad;
        java.lang.String str22 = helpFormatter0.rtrim("                                   ");
        int int26 = helpFormatter0.findWrapPos("      ", 2, 0);
        java.lang.String str27 = helpFormatter0.defaultOptPrefix;
        java.lang.String str28 = helpFormatter0.getArgName();
        org.apache.commons.cli.Options options32 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(52, "-", "                ", options32, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                " + "'", str14, "                                ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "usage:" + "'", str27, "usage:");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "                                " + "'", str28, "                                ");
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setArgName("usage:");
        helpFormatter0.setDescPadding(3);
        helpFormatter0.setLongOptPrefix("                                                                          ");
        helpFormatter0.defaultLeftPad = (byte) 10;
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setDescPadding((-1));
        java.lang.String str23 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str24 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter25 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter25, 97, "  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "usage: " + "'", str23, "usage: ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "usage:" + "'", str24, "usage:");
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        java.lang.String str2 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = 'a';
        helpFormatter0.defaultArgName = "arg";
        helpFormatter0.defaultLongOptPrefix = "                                                    ";
        int int9 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(0, "                                               ", "    ", options13, "                                                    ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth((-1));
        helpFormatter0.setWidth(16);
        helpFormatter0.defaultNewLine = "";
        helpFormatter0.setWidth(47);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        int int3 = helpFormatter0.getWidth();
        java.lang.String str4 = helpFormatter0.getArgName();
        int int8 = helpFormatter0.findWrapPos("          ", 47, 47);
        helpFormatter0.setOptPrefix("arg");
        int int11 = helpFormatter0.getLeftPadding();
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter12, 10, options14, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 74 + "'", int3 == 74);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "\n";
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultOptPrefix = "";
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        java.lang.String str6 = helpFormatter0.createPadding(1);
        helpFormatter0.setLeftPadding((int) (short) 100);
        helpFormatter0.setOptPrefix("arg");
        helpFormatter0.defaultNewLine = "-";
        helpFormatter0.defaultOptPrefix = "arg";
        helpFormatter0.setLongOptPrefix("                                  ");
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(3, "  ", "                                  ", options20, "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str4 = helpFormatter0.createPadding(0);
        java.lang.String str5 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("usage:");
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = helpFormatter0.renderOptions(stringBuffer9, 1, options11, 32, 74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        java.lang.String str2 = helpFormatter0.defaultNewLine;
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultLongOptPrefix = "                                   ";
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter6, 16, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultNewLine;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLeftPad = 1;
        helpFormatter0.setDescPadding((int) '4');
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter10, 45, "    ", options13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str3 = helpFormatter0.getArgName();
        int int4 = helpFormatter0.defaultDescPad;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("--");
        java.lang.String str8 = helpFormatter0.defaultArgName;
        helpFormatter0.setLongOptPrefix("          ");
        helpFormatter0.defaultSyntaxPrefix = "    ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str3 = helpFormatter0.getArgName();
        int int4 = helpFormatter0.defaultDescPad;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("--");
        java.lang.String str8 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("    ");
        java.lang.String str11 = helpFormatter0.getNewLine();
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, 35, 34, "  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        int int2 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultNewLine = "                                                    ";
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLongOptPrefix("");
        int int8 = helpFormatter0.getWidth();
        int int9 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str3 = helpFormatter0.getArgName();
        int int4 = helpFormatter0.defaultWidth;
        int int5 = helpFormatter0.getLeftPadding();
        helpFormatter0.setOptPrefix("\n");
        helpFormatter0.defaultArgName = "usage:";
        helpFormatter0.setOptPrefix("                                   ");
        java.lang.String str12 = helpFormatter0.defaultArgName;
        java.lang.String str13 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage:" + "'", str12, "usage:");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                   " + "'", str13, "                                   ");
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        int int2 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultNewLine = "                                                    ";
        int int5 = helpFormatter0.defaultDescPad;
        java.lang.String str6 = helpFormatter0.getNewLine();
        helpFormatter0.setSyntaxPrefix("                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                    " + "'", str6, "                                                    ");
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        java.lang.String str2 = helpFormatter0.getArgName();
        helpFormatter0.defaultOptPrefix = "--";
        helpFormatter0.setWidth((int) (byte) 0);
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.defaultArgName = "             ";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultArgName = "--";
        helpFormatter0.setArgName("-");
        helpFormatter0.defaultLongOptPrefix = "usage:";
        int int9 = helpFormatter0.defaultWidth;
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                          ", "   ", options13, "                                                                                                 ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-" + "'", str2, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        java.lang.String str2 = helpFormatter0.getNewLine();
        int int3 = helpFormatter0.getWidth();
        java.lang.String str4 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 74 + "'", int3 == 74);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setNewLine("hi!");
        int int9 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "                                ";
        helpFormatter0.setNewLine("-");
        java.lang.String str14 = helpFormatter0.getArgName();
        helpFormatter0.setDescPadding((int) '4');
        int int17 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultWidth = (short) 100;
        java.lang.String str20 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                " + "'", str14, "                                ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-" + "'", str20, "-");
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = (-1);
        int int7 = helpFormatter0.defaultDescPad;
        int int8 = helpFormatter0.defaultWidth;
        int int9 = helpFormatter0.getDescPadding();
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("          ", "                                                     ", options13, "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultArgName = "--";
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("                                                                 ");
        java.io.PrintWriter printWriter8 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter8, 74, "", "hi!", options12, (int) (byte) -1, 47, "                                                              ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-" + "'", str2, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        helpFormatter0.defaultNewLine = "";
        int int4 = helpFormatter0.defaultWidth;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int7 = helpFormatter0.defaultLeftPad;
        java.lang.String str8 = helpFormatter0.getArgName();
        java.lang.String str9 = helpFormatter0.defaultArgName;
        helpFormatter0.setLeftPadding(34);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str4 = helpFormatter0.createPadding(0);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.lang.String str7 = helpFormatter0.createPadding((int) 'a');
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.defaultLongOptPrefix = "                                                                          ";
        helpFormatter0.defaultSyntaxPrefix = "arg";
        helpFormatter0.defaultOptPrefix = "                ";
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter16, (int) (short) 1, "             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                 " + "'", str7, "                                                                                                 ");
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        java.lang.String str2 = helpFormatter0.getNewLine();
        helpFormatter0.setOptPrefix("-");
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "\n";
        helpFormatter0.defaultDescPad = 0;
        helpFormatter0.defaultNewLine = "\n";
        java.lang.String str11 = helpFormatter0.defaultLongOptPrefix;
        int int12 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setLongOptPrefix("                                  ");
        java.lang.String str15 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setNewLine("hi!");
        int int9 = helpFormatter0.defaultLeftPad;
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultSyntaxPrefix = "usage:";
        helpFormatter0.defaultLongOptPrefix = "          ";
        java.lang.String str15 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        int int4 = helpFormatter0.getWidth();
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.lang.String str6 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = 34;
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setArgName("");
        helpFormatter0.defaultWidth = 0;
        int int5 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultNewLine = "arg";
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setLongOptPrefix("hi!");
        helpFormatter0.setNewLine("             ");
        java.io.PrintWriter printWriter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter17, 47, (int) (short) 10, "             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultArgName = "--";
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("arg");
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = helpFormatter0.renderOptions(stringBuffer10, (int) (short) -1, options12, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-" + "'", str2, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.setLeftPadding((int) (short) -1);
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str10 = helpFormatter0.getArgName();
        helpFormatter0.setArgName("   ");
        java.lang.String str13 = helpFormatter0.getOptPrefix();
        java.lang.String str14 = helpFormatter0.defaultLongOptPrefix;
        int int15 = helpFormatter0.getWidth();
        helpFormatter0.defaultLeftPad = (-1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        int int3 = helpFormatter0.getLeftPadding();
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = (byte) 10;
        helpFormatter0.defaultOptPrefix = "";
        helpFormatter0.defaultDescPad = 3;
        helpFormatter0.setArgName("           ");
        java.lang.String str13 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        int int3 = helpFormatter0.getLeftPadding();
        java.lang.String str4 = helpFormatter0.getNewLine();
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultSyntaxPrefix = "-";
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter8, 4, (int) (short) 0, "                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setNewLine("hi!");
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setOptPrefix("-");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        java.lang.String str2 = helpFormatter0.getNewLine();
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setSyntaxPrefix("");
        int int7 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str4 = helpFormatter0.rtrim("                                                                                                 ");
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        int int7 = helpFormatter0.defaultWidth;
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        int int3 = helpFormatter0.getLeftPadding();
        java.lang.String str4 = helpFormatter0.getNewLine();
        int int5 = helpFormatter0.defaultDescPad;
        int int9 = helpFormatter0.findWrapPos("\n", 3, (int) (short) 10);
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        java.io.PrintWriter printWriter11 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter11, 13, "", options14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        int int3 = helpFormatter0.getWidth();
        java.lang.String str5 = helpFormatter0.rtrim("             ");
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(4, "   ", "--", options9, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 74 + "'", int3 == 74);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        int int3 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultDescPad = 13;
        helpFormatter0.defaultArgName = " ";
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setOptPrefix("                                                                                                    ");
        int int14 = helpFormatter0.findWrapPos("                                ", 3, 47);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        int int3 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultDescPad = 13;
        helpFormatter0.defaultArgName = " ";
        java.lang.String str8 = helpFormatter0.getArgName();
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " " + "'", str8, " ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setSyntaxPrefix("--");
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.defaultLeftPad = 2;
        java.lang.String str14 = helpFormatter0.getNewLine();
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) 'a', "                                                                          ", "-", options18, "-", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setArgName("");
        int int3 = helpFormatter0.defaultWidth;
        int int4 = helpFormatter0.defaultLeftPad;
        java.lang.String str5 = helpFormatter0.getNewLine();
        int int9 = helpFormatter0.findWrapPos("             ", 52, (int) (short) 100);
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        helpFormatter0.setNewLine("                                                    ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 74 + "'", int3 == 74);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        int int4 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLeftPad = 10;
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        int int8 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.defaultWidth = (byte) 10;
        java.lang.String str13 = helpFormatter0.defaultArgName;
        java.lang.String str14 = helpFormatter0.defaultSyntaxPrefix;
        java.io.PrintWriter printWriter15 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter15, (int) 'a', "   ", "           ", options19, 1, 0, "   ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str4 = helpFormatter0.createPadding(0);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.lang.String str6 = helpFormatter0.getNewLine();
        helpFormatter0.defaultDescPad = (short) 100;
        int int9 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setArgName("                                                                 ");
        helpFormatter0.defaultDescPad = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        java.lang.String str6 = helpFormatter0.createPadding(1);
        helpFormatter0.defaultWidth = '#';
        helpFormatter0.defaultOptPrefix = "hi!";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str3 = helpFormatter0.getArgName();
        int int4 = helpFormatter0.defaultDescPad;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("--");
        helpFormatter0.defaultLongOptPrefix = "-";
        int int10 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = '4';
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.setWidth(74);
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter9, 4, "   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setArgName("usage:");
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str9 = helpFormatter0.createPadding(65);
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer15 = helpFormatter0.renderOptions(stringBuffer10, 65, options12, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                 " + "'", str9, "                                                                 ");
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str4 = helpFormatter0.createPadding(0);
        int int5 = helpFormatter0.defaultDescPad;
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultArgName = "             ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.setLeftPadding((int) (byte) -1);
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        int int7 = helpFormatter0.defaultDescPad;
        helpFormatter0.setWidth(97);
        helpFormatter0.defaultSyntaxPrefix = "                                                                          ";
        helpFormatter0.defaultNewLine = "           ";
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.getArgName();
        java.lang.String str4 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultDescPad = '4';
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultNewLine = "                                                                                                 ";
        java.lang.String str11 = helpFormatter0.rtrim("                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        int int4 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLeftPad = 10;
        helpFormatter0.defaultDescPad = (short) 1;
        helpFormatter0.setLongOptPrefix("");
        helpFormatter0.setLeftPadding((int) (short) -1);
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(1, " ", "usage: ", options16, "                                   ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str3 = helpFormatter0.getArgName();
        int int4 = helpFormatter0.defaultDescPad;
        helpFormatter0.setNewLine("             ");
        java.lang.Class<?> wildcardClass7 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultDescPad = 0;
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultDescPad = 65;
        helpFormatter0.setDescPadding(3);
        helpFormatter0.defaultOptPrefix = "                                   ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setOptPrefix("--");
        helpFormatter0.setOptPrefix("usage:");
        java.lang.String str8 = helpFormatter0.rtrim("\n");
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        int int12 = helpFormatter0.getLeftPadding();
        int int16 = helpFormatter0.findWrapPos("", (int) ' ', 10);
        int int17 = helpFormatter0.getWidth();
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        helpFormatter0.defaultOptPrefix = "                                               ";
        java.lang.String str22 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "                                               " + "'", str22, "                                               ");
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setLongOptPrefix("hi!");
        java.lang.String str4 = helpFormatter0.rtrim("hi!");
        java.lang.String str5 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "--";
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultNewLine = "             ";
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        java.lang.String str14 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultOptPrefix = "--";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        int int6 = helpFormatter0.findWrapPos("hi!", (int) (byte) 100, 74);
        int int10 = helpFormatter0.findWrapPos("arg", 74, (-1));
        int int14 = helpFormatter0.findWrapPos("                                                                                                    ", (int) (short) -1, (int) '#');
        java.lang.String str15 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("                                                              ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        helpFormatter0.setDescPadding(1);
        int int6 = helpFormatter0.getDescPadding();
        helpFormatter0.setNewLine("                                                    ");
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setDescPadding((int) (short) 1);
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.defaultOptPrefix = "-";
        helpFormatter0.defaultArgName = "arg";
        int int14 = helpFormatter0.findWrapPos("                                                                          ", 10, 3);
        int int15 = helpFormatter0.getLeftPadding();
        java.lang.String str16 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 13 + "'", int14 == 13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.setLeftPadding((int) (short) -1);
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setOptPrefix("-");
        int int9 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultOptPrefix = "usage:";
        java.lang.String str12 = helpFormatter0.getArgName();
        java.lang.String str13 = helpFormatter0.getArgName();
        int int14 = helpFormatter0.defaultDescPad;
        java.io.PrintWriter printWriter15 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter15, 45, "usage: ", "                                          ", options19, 45, 53, "           ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str4 = helpFormatter0.createPadding(0);
        java.lang.String str5 = helpFormatter0.getNewLine();
        helpFormatter0.setLeftPadding((int) '#');
        helpFormatter0.setWidth((int) (byte) 1);
        helpFormatter0.setLongOptPrefix("    ");
        helpFormatter0.setLongOptPrefix("                                          ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth((-1));
        helpFormatter0.setLeftPadding((int) (byte) 0);
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str3 = helpFormatter0.getArgName();
        int int4 = helpFormatter0.getLeftPadding();
        helpFormatter0.setNewLine("             ");
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "             " + "'", str9, "             ");
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setNewLine("hi!");
        int int9 = helpFormatter0.defaultLeftPad;
        int int10 = helpFormatter0.getDescPadding();
        java.lang.String str11 = helpFormatter0.getSyntaxPrefix();
        int int12 = helpFormatter0.getDescPadding();
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        java.lang.String str15 = helpFormatter0.rtrim("      ");
        int int16 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str4 = helpFormatter0.rtrim("                                                                                                 ");
        int int5 = helpFormatter0.defaultDescPad;
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultArgName = "\n";
        helpFormatter0.defaultSyntaxPrefix = "arg";
        helpFormatter0.defaultLongOptPrefix = "usage:";
        int int13 = helpFormatter0.getWidth();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "arg";
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultWidth = 35;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                 ", options10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setOptPrefix("-");
        int int3 = helpFormatter0.getDescPadding();
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        int int6 = helpFormatter0.defaultLeftPad;
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLongOptPrefix = "                                          ";
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderOptions(stringBuffer11, 13, options13, (int) (short) 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setSyntaxPrefix("                                                                          ");
        helpFormatter0.setSyntaxPrefix("                                ");
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        java.lang.String str5 = helpFormatter0.rtrim("\n");
        helpFormatter0.setWidth((int) (byte) 0);
        helpFormatter0.defaultLeftPad = 1;
        helpFormatter0.defaultNewLine = "                                                                                                    ";
        helpFormatter0.setLeftPadding(13);
        helpFormatter0.defaultNewLine = "";
        java.io.PrintWriter printWriter16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter16, 0, "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultArgName = "--";
        helpFormatter0.setArgName("-");
        helpFormatter0.defaultLongOptPrefix = "usage:";
        helpFormatter0.defaultNewLine = "";
        int int11 = helpFormatter0.getLeftPadding();
        int int12 = helpFormatter0.getWidth();
        java.lang.String str13 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-" + "'", str2, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        int int2 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (byte) 1);
        int int5 = helpFormatter0.getDescPadding();
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.getWidth();
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 100, "--", "\n", options12, "-", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix("--");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setDescPadding((int) (short) 1);
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.defaultOptPrefix = "-";
        int int9 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultSyntaxPrefix = "                                   ";
        helpFormatter0.defaultArgName = "          ";
        helpFormatter0.defaultOptPrefix = "usage: ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setArgName("usage:");
        int int13 = helpFormatter0.defaultWidth;
        java.lang.String str14 = helpFormatter0.getArgName();
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        helpFormatter0.setLeftPadding(13);
        helpFormatter0.setOptPrefix("                                                              ");
        int int21 = helpFormatter0.getWidth();
        helpFormatter0.defaultLongOptPrefix = "                                  ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage:" + "'", str14, "usage:");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setOptPrefix("-");
        int int3 = helpFormatter0.getDescPadding();
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        int int10 = helpFormatter0.findWrapPos("                                                                                                    ", (int) '4', 13);
        helpFormatter0.defaultArgName = "                                                    ";
        int int13 = helpFormatter0.getDescPadding();
        helpFormatter0.setDescPadding((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 65 + "'", int10 == 65);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setArgName("usage:");
        int int13 = helpFormatter0.defaultWidth;
        java.lang.String str14 = helpFormatter0.getArgName();
        java.lang.String str15 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str16 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage:" + "'", str14, "usage:");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage:" + "'", str16, "usage:");
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str3 = helpFormatter0.getArgName();
        int int4 = helpFormatter0.defaultWidth;
        int int5 = helpFormatter0.getLeftPadding();
        helpFormatter0.setOptPrefix("\n");
        int int8 = helpFormatter0.defaultDescPad;
        int int9 = helpFormatter0.getWidth();
        helpFormatter0.setDescPadding(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setLongOptPrefix("hi!");
        java.lang.String str4 = helpFormatter0.rtrim("hi!");
        java.lang.String str5 = helpFormatter0.defaultArgName;
        java.lang.String str7 = helpFormatter0.rtrim("arg");
        helpFormatter0.defaultArgName = "                                                                          ";
        java.io.PrintWriter printWriter10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter10, 6, 45, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.setLeftPadding((int) (byte) -1);
        java.lang.String str6 = helpFormatter0.rtrim("                                   ");
        int int10 = helpFormatter0.findWrapPos("                                   ", (int) 'a', (int) (short) 1);
        java.lang.String str12 = helpFormatter0.createPadding((int) (short) 0);
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setOptPrefix("--");
        helpFormatter0.setOptPrefix("usage:");
        int int7 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultDescPad = (byte) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str5 = helpFormatter0.createPadding(74);
        java.lang.String str6 = helpFormatter0.getSyntaxPrefix();
        int int7 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultArgName = "   ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                          " + "'", str5, "                                                                          ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str5 = helpFormatter0.rtrim("usage: ");
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.setDescPadding(62);
        java.lang.String str9 = helpFormatter0.getNewLine();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = helpFormatter0.renderWrappedText(stringBuffer10, 13, 62, "                                                              ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuffer.append(String)\" because \"sb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage:" + "'", str5, "usage:");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setLongOptPrefix("                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.getOptPrefix();
        int int8 = helpFormatter0.findWrapPos("                                   ", 2, 13);
        helpFormatter0.defaultDescPad = 10;
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter11, (int) (byte) -1, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        helpFormatter0.setLongOptPrefix("--");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        java.lang.String str7 = helpFormatter0.getNewLine();
        helpFormatter0.defaultWidth = 0;
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter10, 32, "                                   ", "                                                                          ", options14, (int) ' ', (int) (short) 100, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultArgName = "--";
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLeftPadding(10);
        int int8 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-" + "'", str2, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        int int4 = helpFormatter0.getDescPadding();
        java.lang.String str5 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "";
        helpFormatter0.setLongOptPrefix("");
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultSyntaxPrefix = "arg";
        helpFormatter0.defaultOptPrefix = "\n";
        helpFormatter0.setOptPrefix("                                                    ");
        java.lang.String str17 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLeftPad = 13;
        helpFormatter0.defaultNewLine = "\n";
        int int22 = helpFormatter0.getDescPadding();
        int int23 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arg" + "'", str17, "arg");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 74 + "'", int23 == 74);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        java.lang.String str2 = helpFormatter0.getNewLine();
        helpFormatter0.defaultArgName = "                                                                                                    ";
        helpFormatter0.setNewLine("usage: ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setOptPrefix("--");
        helpFormatter0.setOptPrefix("usage:");
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        java.lang.String str9 = helpFormatter0.rtrim("                                                     ");
        helpFormatter0.setLeftPadding(97);
        helpFormatter0.defaultDescPad = 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage:" + "'", str7, "usage:");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.setLeftPadding((int) (byte) -1);
        java.lang.String str6 = helpFormatter0.rtrim("                                   ");
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.setWidth(45);
        int int10 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        int int6 = helpFormatter0.findWrapPos("hi!", (int) (byte) 100, 74);
        int int10 = helpFormatter0.findWrapPos("arg", 74, (-1));
        int int11 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.setDescPadding(3);
        helpFormatter0.setLeftPadding((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setArgName("                                                                                                 ");
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setOptPrefix("                ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setNewLine("hi!");
        java.lang.String str10 = helpFormatter0.rtrim("hi!");
        helpFormatter0.defaultOptPrefix = "                                ";
        helpFormatter0.setArgName("usage:");
        helpFormatter0.defaultSyntaxPrefix = "                                ";
        helpFormatter0.defaultLongOptPrefix = "             ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        helpFormatter0.setLeftPadding(2);
        int int7 = helpFormatter0.getWidth();
        java.lang.String str8 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        int int2 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (byte) 1);
        int int5 = helpFormatter0.defaultDescPad;
        int int6 = helpFormatter0.getWidth();
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.setOptPrefix("\n");
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", "                                                    ", options12, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        int int4 = helpFormatter0.getDescPadding();
        java.lang.String str5 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "";
        helpFormatter0.setLongOptPrefix("");
        helpFormatter0.defaultArgName = "--";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str4 = helpFormatter0.createPadding(0);
        java.lang.String str6 = helpFormatter0.rtrim("hi!");
        int int7 = helpFormatter0.defaultWidth;
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter8, 10, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultArgName = "--";
        helpFormatter0.setArgName("-");
        helpFormatter0.defaultLongOptPrefix = "usage:";
        int int9 = helpFormatter0.defaultWidth;
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        java.lang.String str11 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-" + "'", str2, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.setLeftPadding((int) (short) -1);
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setOptPrefix("-");
        int int9 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultOptPrefix = "usage:";
        java.lang.String str12 = helpFormatter0.getArgName();
        java.lang.String str13 = helpFormatter0.getArgName();
        int int14 = helpFormatter0.defaultDescPad;
        helpFormatter0.setArgName("-");
        helpFormatter0.setLeftPadding((int) (byte) 0);
        helpFormatter0.setDescPadding((-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.getArgName();
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.defaultDescPad = 1;
        helpFormatter0.setLongOptPrefix("arg");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str4 = helpFormatter0.createPadding(0);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.lang.String str6 = helpFormatter0.getNewLine();
        int int7 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str3 = helpFormatter0.getArgName();
        int int4 = helpFormatter0.defaultDescPad;
        helpFormatter0.setNewLine("             ");
        java.lang.String str7 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.createPadding(6);
        helpFormatter0.defaultNewLine = "             ";
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        java.lang.String str13 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "      " + "'", str9, "      ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLeftPadding(1);
        java.lang.String str7 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("");
        helpFormatter0.setLongOptPrefix("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        java.lang.String str8 = helpFormatter0.getNewLine();
        int int9 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "\n";
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLongOptPrefix = " ";
        helpFormatter0.defaultArgName = "             ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setOptPrefix("");
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter10, 6, "                                   ", options13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        int int5 = helpFormatter0.getLeftPadding();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                 ", " ", options9, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        java.lang.String str11 = helpFormatter0.getNewLine();
        helpFormatter0.setLeftPadding((int) '4');
        int int14 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultOptPrefix = "   ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        java.lang.String str5 = helpFormatter0.rtrim("\n");
        helpFormatter0.setWidth((int) (byte) 0);
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.defaultLeftPad = ' ';
        helpFormatter0.setDescPadding(2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        java.lang.String str2 = helpFormatter0.getArgName();
        int int3 = helpFormatter0.getWidth();
        int int4 = helpFormatter0.defaultLeftPad;
        java.lang.String str5 = helpFormatter0.getArgName();
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter6, 97, (int) (short) 10, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 74 + "'", int3 == 74);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.getArgName();
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.lang.String str6 = helpFormatter0.createPadding((int) (byte) 0);
        java.lang.String str7 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setSyntaxPrefix(" ");
        java.lang.String str10 = helpFormatter0.defaultOptPrefix;
        java.lang.String str11 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setArgName("usage:");
        int int13 = helpFormatter0.defaultWidth;
        java.lang.String str14 = helpFormatter0.getArgName();
        helpFormatter0.defaultArgName = "                                   ";
        helpFormatter0.defaultLeftPad = 13;
        helpFormatter0.defaultLongOptPrefix = "      ";
        int int21 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage:" + "'", str14, "usage:");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        int int6 = helpFormatter0.findWrapPos("hi!", (int) (byte) 100, 74);
        int int10 = helpFormatter0.findWrapPos("arg", 74, (-1));
        int int14 = helpFormatter0.findWrapPos("                                                                                                    ", (int) (short) -1, (int) '#');
        java.lang.String str15 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix("             ");
        int int18 = helpFormatter0.defaultLeftPad;
        java.lang.String str19 = helpFormatter0.defaultNewLine;
        helpFormatter0.setSyntaxPrefix("                                  ");
        org.apache.commons.cli.Options options23 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", options23, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n" + "'", str19, "\n");
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setDescPadding((int) (short) 1);
        java.lang.String str6 = helpFormatter0.createPadding((int) ' ');
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.setNewLine("             ");
        helpFormatter0.defaultWidth = 45;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                " + "'", str6, "                                ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str3 = helpFormatter0.getArgName();
        int int4 = helpFormatter0.defaultDescPad;
        int int5 = helpFormatter0.defaultWidth;
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setNewLine("-");
        int int9 = helpFormatter0.defaultWidth;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                 ", "                                                                          ", options12, "                                                                                                 ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        java.lang.String str4 = helpFormatter0.getArgName();
        helpFormatter0.defaultWidth = 53;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        int int9 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth((-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.setLeftPadding((int) (byte) -1);
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultNewLine = "                                                                          ";
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setSyntaxPrefix("                                ");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str5 = helpFormatter0.getArgName();
        int int9 = helpFormatter0.findWrapPos("          ", (int) (byte) 0, 13);
        helpFormatter0.setArgName("                                                              ");
        int int15 = helpFormatter0.findWrapPos("", 62, 15);
        int int16 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter17 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter17, (int) (short) 1, "                                          ", "    ", options21, 33, 42, "                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 74 + "'", int16 == 74);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        int int2 = helpFormatter0.defaultDescPad;
        helpFormatter0.setSyntaxPrefix("\n");
        helpFormatter0.defaultOptPrefix = "                                ";
        helpFormatter0.setArgName(" ");
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultOptPrefix = "    ";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str4 = helpFormatter0.rtrim("                                                                                                 ");
        int int5 = helpFormatter0.defaultDescPad;
        int int6 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultArgName = "\n";
        helpFormatter0.setLeftPadding(16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "\n";
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        helpFormatter0.setWidth((int) (byte) 10);
        java.lang.String str10 = helpFormatter0.getArgName();
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLeftPad = 6;
        helpFormatter0.setLongOptPrefix("      ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        helpFormatter0.setNewLine("");
        int int12 = helpFormatter0.findWrapPos("usage:", (int) (short) 100, (int) 'a');
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                    ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultNewLine;
        int int5 = helpFormatter0.defaultWidth;
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        int int10 = helpFormatter0.findWrapPos("          ", 0, (int) ' ');
        java.lang.String str11 = helpFormatter0.getArgName();
        helpFormatter0.setLeftPadding(47);
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer19 = helpFormatter0.renderOptions(stringBuffer14, (int) (short) 100, options16, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setLongOptPrefix("hi!");
        helpFormatter0.setDescPadding((int) (byte) 1);
        helpFormatter0.defaultWidth = (short) 1;
        helpFormatter0.defaultOptPrefix = "                                                    ";
        helpFormatter0.setWidth((int) '4');
        int int11 = helpFormatter0.defaultWidth;
        java.lang.String str12 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str3 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLongOptPrefix("             ");
        java.lang.String str7 = helpFormatter0.rtrim("");
        int int8 = helpFormatter0.getDescPadding();
        helpFormatter0.setArgName("                                                                 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.setLeftPadding((int) (short) -1);
        helpFormatter0.defaultOptPrefix = "hi!";
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int10 = helpFormatter0.getLeftPadding();
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultWidth = 100;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str4 = helpFormatter0.createPadding(0);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLongOptPrefix("    ");
        java.io.PrintWriter printWriter8 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter8, (int) 'a', "                                ", "                                                                          ", options12, 74, 42, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setOptPrefix("--");
        helpFormatter0.setOptPrefix("usage:");
        java.lang.String str8 = helpFormatter0.rtrim("\n");
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        int int12 = helpFormatter0.getLeftPadding();
        int int16 = helpFormatter0.findWrapPos("", (int) ' ', 10);
        int int17 = helpFormatter0.getWidth();
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        helpFormatter0.defaultOptPrefix = "                                               ";
        java.lang.String str22 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "                                               " + "'", str22, "                                               ");
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        java.lang.String str2 = helpFormatter0.getNewLine();
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setSyntaxPrefix("");
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter9, 15, 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setArgName("usage:");
        int int13 = helpFormatter0.defaultWidth;
        java.lang.String str14 = helpFormatter0.getArgName();
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        helpFormatter0.setLeftPadding(13);
        helpFormatter0.setOptPrefix("                                                              ");
        int int21 = helpFormatter0.getWidth();
        int int22 = helpFormatter0.getWidth();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage:" + "'", str14, "usage:");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = '4';
        java.lang.String str6 = helpFormatter0.defaultArgName;
        int int7 = helpFormatter0.getWidth();
        int int8 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLeftPadding(2);
        helpFormatter0.defaultWidth = 1;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        helpFormatter0.defaultNewLine = "";
        int int4 = helpFormatter0.defaultWidth;
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.setLeftPadding(3);
        helpFormatter0.setDescPadding(0);
        helpFormatter0.defaultWidth = 1;
        int int16 = helpFormatter0.findWrapPos("", 6, (int) (byte) 10);
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("      ", options18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        int int6 = helpFormatter0.findWrapPos("hi!", (int) (short) 10, 34);
        java.lang.String str8 = helpFormatter0.createPadding((int) '4');
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(74, "                                   ", "           ", options12, "                                                                                                    ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                    " + "'", str8, "                                                    ");
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultDescPad = 0;
        helpFormatter0.setWidth((int) (byte) 1);
        helpFormatter0.setNewLine("usage: ");
        java.lang.String str18 = helpFormatter0.getNewLine();
        java.lang.String str19 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "usage: " + "'", str18, "usage: ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "--" + "'", str19, "--");
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        int int3 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter4 = null;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter4, (int) '#', "", "           ", options8, 2, (int) ' ', "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 74 + "'", int3 == 74);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setDescPadding((int) (short) 1);
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.defaultOptPrefix = "-";
        int int9 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultSyntaxPrefix = "                                   ";
        helpFormatter0.setDescPadding(53);
        int int14 = helpFormatter0.defaultWidth;
        helpFormatter0.setWidth(1);
        java.lang.String str17 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "--" + "'", str17, "--");
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setNewLine("hi!");
        int int9 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "                                ";
        helpFormatter0.setNewLine("-");
        java.lang.String str14 = helpFormatter0.getArgName();
        helpFormatter0.setDescPadding(0);
        int int17 = helpFormatter0.defaultLeftPad;
        int int18 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                " + "'", str14, "                                ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        helpFormatter0.defaultDescPad = (byte) 100;
        int int7 = helpFormatter0.defaultWidth;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultWidth = (short) 0;
        int int11 = helpFormatter0.getLeftPadding();
        java.lang.String str12 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arg" + "'", str12, "arg");
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        java.lang.String str6 = helpFormatter0.createPadding(1);
        helpFormatter0.setLeftPadding((int) (short) 100);
        helpFormatter0.defaultNewLine = "                                                                          ";
        helpFormatter0.defaultOptPrefix = "   ";
        int int13 = helpFormatter0.getLeftPadding();
        int int14 = helpFormatter0.defaultWidth;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setArgName("                                ");
        java.lang.String str7 = helpFormatter0.getNewLine();
        helpFormatter0.setLeftPadding((int) (short) 100);
        helpFormatter0.defaultNewLine = "usage: ";
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) '4', "             ", "hi!", options15, "  ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        int int4 = helpFormatter0.getDescPadding();
        java.lang.String str5 = helpFormatter0.getArgName();
        helpFormatter0.defaultArgName = "                                                                                                    ";
        int int8 = helpFormatter0.getLeftPadding();
        java.lang.String str10 = helpFormatter0.rtrim("hi!");
        helpFormatter0.defaultOptPrefix = "      ";
        int int13 = helpFormatter0.defaultWidth;
        java.lang.String str14 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        int int6 = helpFormatter0.findWrapPos("hi!", (int) (byte) 100, 74);
        int int10 = helpFormatter0.findWrapPos("arg", 74, (-1));
        int int14 = helpFormatter0.findWrapPos("                                                                                                    ", (int) (short) -1, (int) '#');
        java.lang.String str15 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix("                                                                                                    ");
        helpFormatter0.defaultWidth = 45;
        helpFormatter0.setArgName("                                   ");
        java.lang.String str23 = helpFormatter0.rtrim("");
        int int27 = helpFormatter0.findWrapPos("arg", 53, 52);
        int int31 = helpFormatter0.findWrapPos("           ", (int) (short) 1, (int) (short) 100);
        int int32 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        int int5 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "                                                                          ";
        java.lang.String str8 = helpFormatter0.defaultArgName;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", options10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        helpFormatter0.setNewLine("usage: ");
        helpFormatter0.setSyntaxPrefix("\n");
        int int14 = helpFormatter0.getLeftPadding();
        int int15 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setNewLine("hi!");
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLeftPad = (short) 100;
        helpFormatter0.setArgName("");
        helpFormatter0.defaultSyntaxPrefix = "                ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str4 = helpFormatter0.createPadding(0);
        int int5 = helpFormatter0.defaultDescPad;
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str4 = helpFormatter0.rtrim("                                                                                                 ");
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        int int9 = helpFormatter0.getWidth();
        int int10 = helpFormatter0.getLeftPadding();
        int int11 = helpFormatter0.defaultLeftPad;
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        java.lang.String str11 = helpFormatter0.getNewLine();
        java.lang.String str12 = helpFormatter0.getNewLine();
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", " ", options15, "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        int int6 = helpFormatter0.findWrapPos("hi!", (int) (byte) 100, 74);
        int int10 = helpFormatter0.findWrapPos("arg", 74, (-1));
        int int14 = helpFormatter0.findWrapPos("                                                                                                    ", (int) (short) -1, (int) '#');
        java.lang.String str15 = helpFormatter0.defaultArgName;
        helpFormatter0.setDescPadding((int) (short) 10);
        helpFormatter0.defaultDescPad = 0;
        helpFormatter0.setNewLine("-");
        java.lang.String str22 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str23 = helpFormatter0.defaultSyntaxPrefix;
        int int24 = helpFormatter0.getWidth();
        java.lang.String str25 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "--" + "'", str22, "--");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "usage: " + "'", str23, "usage: ");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 74 + "'", int24 == 74);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "arg" + "'", str25, "arg");
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = 0;
        int int6 = helpFormatter0.getLeftPadding();
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = " ";
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        int int11 = helpFormatter0.getLeftPadding();
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        java.lang.String str13 = helpFormatter0.getNewLine();
        java.lang.String str14 = helpFormatter0.getLongOptPrefix();
        int int15 = helpFormatter0.getWidth();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " " + "'", str10, " ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " " + "'", str14, " ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 74 + "'", int15 == 74);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        helpFormatter0.defaultNewLine = "";
        int int4 = helpFormatter0.defaultWidth;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int7 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setNewLine("                                                              ");
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultWidth = 34;
        helpFormatter0.defaultNewLine = "  ";
        helpFormatter0.defaultLongOptPrefix = "                                                    ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.setWidth(0);
        helpFormatter0.setWidth((int) (byte) 100);
        helpFormatter0.setWidth(4);
        helpFormatter0.defaultLeftPad = 3;
        java.lang.String str11 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                     ", "                                          ", options14, "arg");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str3 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLeftPad = '#';
        helpFormatter0.defaultDescPad = 62;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        java.lang.String str4 = helpFormatter0.getArgName();
        helpFormatter0.defaultWidth = 53;
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setDescPadding(0);
        helpFormatter0.setArgName("usage: ");
        int int13 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultLongOptPrefix = "                                 ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        int int6 = helpFormatter0.findWrapPos("hi!", (int) (byte) 100, 74);
        helpFormatter0.defaultNewLine = "                                ";
        helpFormatter0.defaultNewLine = "usage: ";
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        int int2 = helpFormatter0.defaultDescPad;
        int int3 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "\n";
        java.lang.String str6 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.getArgName();
        int int8 = helpFormatter0.getDescPadding();
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.setOptPrefix("arg");
        helpFormatter0.setSyntaxPrefix("-");
        int int10 = helpFormatter0.defaultDescPad;
        int int11 = helpFormatter0.defaultDescPad;
        java.lang.String str12 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultNewLine;
        int int5 = helpFormatter0.defaultWidth;
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        int int10 = helpFormatter0.findWrapPos("          ", 0, (int) ' ');
        helpFormatter0.setArgName("                                                                                                    ");
        java.io.PrintWriter printWriter13 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter13, 15, "                                                                 ", "usage: ", options17, 11, (int) (byte) -1, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setArgName("arg");
        java.lang.String str5 = helpFormatter0.defaultSyntaxPrefix;
        int int6 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter7, 74, 47, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-" + "'", str2, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setSyntaxPrefix("--");
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultWidth = 10;
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str4 = helpFormatter0.createPadding((int) (byte) 100);
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        int int6 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                    " + "'", str4, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        java.lang.String str2 = helpFormatter0.getArgName();
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str6 = helpFormatter0.createPadding(74);
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        helpFormatter0.setLeftPadding(0);
        helpFormatter0.defaultLeftPad = 34;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                          " + "'", str6, "                                                                          ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setDescPadding((int) (short) 1);
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.defaultOptPrefix = "-";
        int int9 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultSyntaxPrefix = "                                   ";
        helpFormatter0.setDescPadding(53);
        int int14 = helpFormatter0.defaultDescPad;
        helpFormatter0.setOptPrefix("          ");
        java.lang.String str17 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setLongOptPrefix("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "--" + "'", str17, "--");
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.setWidth(0);
        helpFormatter0.setWidth((int) (byte) 100);
        helpFormatter0.setWidth(4);
        helpFormatter0.defaultLeftPad = 3;
        java.lang.String str11 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLongOptPrefix("usage: ");
        helpFormatter0.defaultSyntaxPrefix = "                                                                 ";
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter16, (int) ' ', options18, 13, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        java.lang.String str2 = helpFormatter0.getNewLine();
        helpFormatter0.defaultNewLine = "arg";
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer9 = helpFormatter0.renderWrappedText(stringBuffer5, 74, (int) (byte) 100, "      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuffer.append(String)\" because \"sb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setSyntaxPrefix("                                                                          ");
        java.lang.String str7 = helpFormatter0.getNewLine();
        int int11 = helpFormatter0.findWrapPos("                                                              ", (int) (byte) 100, (int) ' ');
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("-", options13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        java.lang.String str2 = helpFormatter0.getNewLine();
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setSyntaxPrefix("");
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                                                    ", "-", options11, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setDescPadding((int) (short) 1);
        java.lang.String str6 = helpFormatter0.createPadding((int) ' ');
        int int7 = helpFormatter0.getWidth();
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                    ", "                                                    ", options10, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                " + "'", str6, "                                ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setSyntaxPrefix("                                ");
        org.apache.commons.cli.Options options5 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                    ", "usage:", options5, "                                                              ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        helpFormatter0.defaultNewLine = "hi!";
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setSyntaxPrefix("-");
        int int16 = helpFormatter0.getWidth();
        int int17 = helpFormatter0.getLeftPadding();
        int int18 = helpFormatter0.getWidth();
        int int22 = helpFormatter0.findWrapPos("    ", (int) (byte) -1, 52);
        helpFormatter0.setLeftPadding(62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 74 + "'", int17 == 74);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.setLeftPadding((int) (short) -1);
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setOptPrefix("-");
        int int9 = helpFormatter0.getDescPadding();
        int int10 = helpFormatter0.defaultDescPad;
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter12, 47, "           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter5 = null;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter5, 6, "      ", options8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        int int5 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.createPadding(13);
        int int8 = helpFormatter0.getWidth();
        helpFormatter0.defaultOptPrefix = "                                                                          ";
        helpFormatter0.setWidth(13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "             " + "'", str7, "             ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        helpFormatter0.defaultDescPad = (byte) 100;
        int int7 = helpFormatter0.defaultWidth;
        helpFormatter0.setOptPrefix("                                ");
        helpFormatter0.defaultLongOptPrefix = "";
        helpFormatter0.setNewLine("usage:");
        helpFormatter0.setWidth((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultLeftPad = (byte) 0;
        helpFormatter0.setSyntaxPrefix("                                                     ");
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(0, "      ", "                                                                 ", options16, "                                  ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        java.lang.String str5 = helpFormatter0.rtrim("\n");
        java.lang.String str6 = helpFormatter0.getNewLine();
        int int7 = helpFormatter0.defaultDescPad;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setNewLine("hi!");
        int int9 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "                                ";
        helpFormatter0.setNewLine("-");
        java.lang.String str14 = helpFormatter0.getArgName();
        java.lang.String str15 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setOptPrefix(" ");
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (byte) 100, "  ", "             ", options21, "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                " + "'", str14, "                                ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setSyntaxPrefix("                                                                          ");
        helpFormatter0.setSyntaxPrefix("                                ");
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("                                   ");
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        java.lang.String str14 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arg" + "'", str14, "arg");
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.setWidth(0);
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.defaultArgName;
        int int7 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str5 = helpFormatter0.rtrim("usage: ");
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.setWidth(4);
        int int12 = helpFormatter0.findWrapPos("-", 45, 1);
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage:" + "'", str5, "usage:");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultNewLine;
        int int5 = helpFormatter0.defaultWidth;
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        int int10 = helpFormatter0.findWrapPos("          ", 0, (int) ' ');
        helpFormatter0.setArgName("                                                                                                    ");
        helpFormatter0.defaultWidth = 45;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", "             ", options17, "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setArgName("usage:");
        int int13 = helpFormatter0.defaultWidth;
        int int14 = helpFormatter0.getWidth();
        java.lang.String str15 = helpFormatter0.getArgName();
        helpFormatter0.setDescPadding(97);
        java.lang.String str18 = helpFormatter0.defaultNewLine;
        java.lang.String str20 = helpFormatter0.rtrim("  ");
        java.lang.String str22 = helpFormatter0.createPadding(2);
        int int23 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "usage:" + "'", str15, "usage:");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "  " + "'", str22, "  ");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 74 + "'", int23 == 74);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str4 = helpFormatter0.createPadding(0);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.lang.String str7 = helpFormatter0.createPadding((int) 'a');
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        helpFormatter0.defaultLongOptPrefix = "                                                                          ";
        helpFormatter0.defaultSyntaxPrefix = "arg";
        helpFormatter0.defaultSyntaxPrefix = "      ";
        java.lang.String str16 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                 " + "'", str7, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "      " + "'", str16, "      ");
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setDescPadding((int) (short) 1);
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.defaultOptPrefix = "-";
        helpFormatter0.defaultArgName = "arg";
        helpFormatter0.setLeftPadding((int) (byte) 1);
        java.lang.String str14 = helpFormatter0.rtrim("hi!");
        helpFormatter0.defaultNewLine = "                                   ";
        java.lang.String str17 = helpFormatter0.getSyntaxPrefix();
        int int18 = helpFormatter0.getWidth();
        helpFormatter0.setNewLine(" ");
        java.lang.String str21 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setNewLine("  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage: " + "'", str17, "usage: ");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "--" + "'", str21, "--");
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        int int4 = helpFormatter0.getDescPadding();
        java.lang.String str5 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "";
        helpFormatter0.setLongOptPrefix("");
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.setNewLine("arg");
        helpFormatter0.setArgName("                                               ");
        java.lang.String str16 = helpFormatter0.rtrim("                                ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setArgName("usage:");
        int int13 = helpFormatter0.defaultWidth;
        java.lang.String str14 = helpFormatter0.getArgName();
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        int int17 = helpFormatter0.getDescPadding();
        java.lang.String str18 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setLeftPadding(34);
        helpFormatter0.defaultWidth = 32;
        org.apache.commons.cli.Options options26 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(13, "", "                                 ", options26, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage:" + "'", str14, "usage:");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "usage: " + "'", str18, "usage: ");
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        int int4 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLeftPad = 10;
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        int int8 = helpFormatter0.defaultDescPad;
        int int9 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str3 = helpFormatter0.getArgName();
        int int4 = helpFormatter0.defaultDescPad;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultOptPrefix = "hi!";
        int int8 = helpFormatter0.getLeftPadding();
        int int12 = helpFormatter0.findWrapPos("             ", (int) (short) 10, 33);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        helpFormatter0.defaultLongOptPrefix = "-";
        helpFormatter0.setDescPadding(13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setLongOptPrefix("hi!");
        java.lang.String str4 = helpFormatter0.rtrim("hi!");
        java.lang.String str5 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "--";
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("                                ");
        helpFormatter0.setLeftPadding((int) ' ');
        helpFormatter0.defaultLeftPad = (short) 1;
        helpFormatter0.defaultLeftPad = 3;
        helpFormatter0.defaultArgName = " ";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setNewLine("hi!");
        int int9 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "                                ";
        helpFormatter0.setNewLine("-");
        java.lang.String str14 = helpFormatter0.getArgName();
        java.lang.String str15 = helpFormatter0.getArgName();
        helpFormatter0.defaultSyntaxPrefix = "-";
        int int18 = helpFormatter0.getLeftPadding();
        java.lang.String str19 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setSyntaxPrefix("             ");
        helpFormatter0.setNewLine("                                                                          ");
        java.lang.String str24 = helpFormatter0.getNewLine();
        helpFormatter0.setSyntaxPrefix("                                ");
        helpFormatter0.setSyntaxPrefix("hi!");
        java.lang.String str29 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                " + "'", str14, "                                ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                " + "'", str15, "                                ");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "--" + "'", str19, "--");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "                                                                          " + "'", str24, "                                                                          ");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setNewLine("hi!");
        int int9 = helpFormatter0.defaultLeftPad;
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultSyntaxPrefix = "usage:";
        int int13 = helpFormatter0.getWidth();
        int int14 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultSyntaxPrefix = "  ";
        int int17 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        helpFormatter0.setLeftPadding(2);
        java.lang.String str7 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setArgName("                                ");
        java.lang.String str7 = helpFormatter0.getNewLine();
        helpFormatter0.setLeftPadding((int) (short) 100);
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        int int4 = helpFormatter0.getDescPadding();
        int int5 = helpFormatter0.getDescPadding();
        int int6 = helpFormatter0.defaultDescPad;
        java.lang.String str7 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = 2;
        int int11 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        java.lang.String str2 = helpFormatter0.getArgName();
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str6 = helpFormatter0.createPadding(74);
        int int7 = helpFormatter0.getLeftPadding();
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setWidth((int) (byte) 10);
        int int11 = helpFormatter0.defaultWidth;
        int int15 = helpFormatter0.findWrapPos("\n", 0, 1);
        java.lang.String str16 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                          " + "'", str6, "                                                                          ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str5 = helpFormatter0.rtrim("usage: ");
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter8 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter8, 62, "                                                                                                    ", "    ", options12, 74, 4, "arg", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage:" + "'", str5, "usage:");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.setDescPadding((int) (byte) 0);
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        java.lang.String str10 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = " ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str3 = helpFormatter0.getArgName();
        int int4 = helpFormatter0.defaultDescPad;
        helpFormatter0.setNewLine("             ");
        java.lang.String str7 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str9 = helpFormatter0.createPadding(6);
        helpFormatter0.defaultLongOptPrefix = "                                ";
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        int int13 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "      " + "'", str9, "      ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        java.lang.String str2 = helpFormatter0.getNewLine();
        helpFormatter0.defaultOptPrefix = "usage: ";
        helpFormatter0.setOptPrefix("             ");
        int int7 = helpFormatter0.defaultLeftPad;
        java.lang.String str8 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultOptPrefix;
        java.lang.String str3 = helpFormatter0.getArgName();
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str6 = helpFormatter0.getNewLine();
        int int7 = helpFormatter0.defaultDescPad;
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter8, 53, "                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-" + "'", str2, "-");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("\n");
        helpFormatter0.defaultWidth = ' ';
        helpFormatter0.defaultNewLine = "           ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setDescPadding((int) (short) 1);
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.defaultOptPrefix = "-";
        helpFormatter0.defaultArgName = "arg";
        helpFormatter0.setLeftPadding((int) (byte) 1);
        helpFormatter0.defaultOptPrefix = "\n";
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(4, "                                                     ", "                                                                          ", options18, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "                                ";
        int int8 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        int int5 = helpFormatter0.findWrapPos("   ", (int) (short) 1, (int) (byte) 100);
        helpFormatter0.setLeftPadding(33);
        java.io.PrintWriter printWriter8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter8, (int) '4', "             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.setLeftPadding((int) (byte) -1);
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str7 = helpFormatter0.createPadding((int) '#');
        int int8 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                    ", "                                                                          ", options11, "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                   " + "'", str7, "                                   ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "\n";
        helpFormatter0.defaultDescPad = 0;
        int int9 = helpFormatter0.getWidth();
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.setLeftPadding(45);
        int int13 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setLeftPadding((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 45 + "'", int13 == 45);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setSyntaxPrefix("                                                                          ");
        helpFormatter0.setSyntaxPrefix("                                ");
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        helpFormatter0.setSyntaxPrefix("                                   ");
        java.lang.String str13 = helpFormatter0.defaultNewLine;
        java.lang.String str15 = helpFormatter0.rtrim("                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str3 = helpFormatter0.getArgName();
        int int4 = helpFormatter0.defaultDescPad;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultOptPrefix = "hi!";
        int int8 = helpFormatter0.getLeftPadding();
        int int9 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultSyntaxPrefix = "   ";
        java.lang.String str12 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "   " + "'", str12, "   ");
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str4 = helpFormatter0.createPadding(0);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        int int6 = helpFormatter0.getDescPadding();
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("\n", "                                                     ", options9, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultNewLine = "-";
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.io.PrintWriter printWriter8 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter8, 11, options10, (int) '4', 34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setSyntaxPrefix("                                ");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str5 = helpFormatter0.getArgName();
        int int9 = helpFormatter0.findWrapPos("          ", (int) (byte) 0, 13);
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("   ");
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter13, 0, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultNewLine = "-";
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setSyntaxPrefix("hi!");
        helpFormatter0.defaultSyntaxPrefix = "                                               ";
        int int15 = helpFormatter0.findWrapPos("                                               ", (int) 'a', 34);
        helpFormatter0.defaultLeftPad = '4';
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str3 = helpFormatter0.getArgName();
        int int4 = helpFormatter0.defaultDescPad;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getWidth();
        helpFormatter0.defaultSyntaxPrefix = "                                ";
        helpFormatter0.defaultSyntaxPrefix = "                                ";
        helpFormatter0.setLeftPadding(32);
        java.lang.String str14 = helpFormatter0.createPadding(74);
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                 ", options16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                          " + "'", str14, "                                                                          ");
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str3 = helpFormatter0.getArgName();
        int int4 = helpFormatter0.defaultDescPad;
        int int5 = helpFormatter0.getWidth();
        helpFormatter0.setSyntaxPrefix("             ");
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setSyntaxPrefix("  ");
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                    ", options12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setArgName("usage:");
        int int13 = helpFormatter0.defaultWidth;
        java.lang.String str14 = helpFormatter0.getArgName();
        helpFormatter0.defaultArgName = "                                   ";
        helpFormatter0.defaultLeftPad = 13;
        helpFormatter0.defaultLongOptPrefix = "      ";
        java.lang.String str21 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage:" + "'", str14, "usage:");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                   " + "'", str21, "                                   ");
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        int int6 = helpFormatter0.findWrapPos("hi!", (int) (byte) 100, 74);
        int int10 = helpFormatter0.findWrapPos("arg", 74, (-1));
        int int14 = helpFormatter0.findWrapPos("                                                                                                    ", (int) (short) -1, (int) '#');
        java.lang.String str15 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix("             ");
        int int18 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(45);
        int int21 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setNewLine("hi!");
        int int9 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "                                ";
        helpFormatter0.setNewLine("-");
        helpFormatter0.setLeftPadding((int) ' ');
        helpFormatter0.setLongOptPrefix("          ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setLongOptPrefix("hi!");
        java.lang.String str4 = helpFormatter0.rtrim("hi!");
        java.lang.String str5 = helpFormatter0.getArgName();
        helpFormatter0.setLeftPadding((int) (byte) -1);
        helpFormatter0.defaultArgName = "                                                                                                    ";
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) ' ', "usage:", " ", options13, "                                                                                                 ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setOptPrefix("-");
        java.lang.String str4 = helpFormatter0.rtrim("usage:");
        helpFormatter0.defaultLeftPad = '#';
        java.lang.String str7 = helpFormatter0.defaultArgName;
        int int8 = helpFormatter0.defaultDescPad;
        helpFormatter0.setDescPadding(42);
        helpFormatter0.setDescPadding(3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage:" + "'", str4, "usage:");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        helpFormatter0.defaultOptPrefix = "                                               ";
        java.io.PrintWriter printWriter7 = null;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter7, (int) (short) 100, options9, (int) (byte) 0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        int int6 = helpFormatter0.findWrapPos("hi!", (int) (byte) 100, 74);
        int int10 = helpFormatter0.findWrapPos("arg", 74, (-1));
        int int11 = helpFormatter0.getDescPadding();
        int int12 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLeftPad = 10;
        helpFormatter0.defaultWidth = 3;
        java.lang.String str17 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str18 = helpFormatter0.getNewLine();
        helpFormatter0.defaultNewLine = "                                  ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "--" + "'", str17, "--");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\n" + "'", str18, "\n");
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        int int6 = helpFormatter0.findWrapPos("hi!", (int) (byte) 100, 74);
        int int10 = helpFormatter0.findWrapPos("arg", 74, (-1));
        int int14 = helpFormatter0.findWrapPos("                                                                                                    ", (int) (short) -1, (int) '#');
        java.lang.String str15 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix("                                                                                                    ");
        helpFormatter0.defaultWidth = 45;
        helpFormatter0.defaultArgName = "";
        org.apache.commons.cli.Options options24 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("      ", "                                 ", options24, "usage: ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str3 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setArgName("usage: ");
        helpFormatter0.setDescPadding(1);
        helpFormatter0.defaultWidth = 0;
        int int10 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setLongOptPrefix("hi!");
        java.lang.String str4 = helpFormatter0.rtrim("hi!");
        java.lang.String str5 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "--";
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("                                ");
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        helpFormatter0.setNewLine("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultOptPrefix = "                                ";
        int int8 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        helpFormatter0.setNewLine("");
        int int12 = helpFormatter0.findWrapPos("usage:", (int) (short) 100, (int) 'a');
        int int13 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLongOptPrefix = "-";
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage:", "", options18, "                                                     ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setNewLine("hi!");
        int int9 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "                                ";
        helpFormatter0.setNewLine("-");
        java.lang.String str14 = helpFormatter0.getArgName();
        helpFormatter0.setDescPadding(0);
        helpFormatter0.defaultDescPad = 34;
        helpFormatter0.setArgName("  ");
        helpFormatter0.defaultDescPad = 4;
        java.lang.String str23 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                " + "'", str14, "                                ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-" + "'", str23, "-");
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str3 = helpFormatter0.getArgName();
        int int4 = helpFormatter0.getLeftPadding();
        helpFormatter0.setNewLine("             ");
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "                                 ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        java.lang.String str4 = helpFormatter0.getNewLine();
        helpFormatter0.setSyntaxPrefix("                                                                          ");
        java.lang.String str7 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultSyntaxPrefix = "\n";
        int int10 = helpFormatter0.getDescPadding();
        java.lang.String str11 = helpFormatter0.getArgName();
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = helpFormatter0.renderOptions(stringBuffer12, 62, options14, (int) (byte) 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                          " + "'", str7, "                                                                          ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        int int3 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultDescPad = 13;
        helpFormatter0.setSyntaxPrefix("          ");
        helpFormatter0.setWidth((int) (short) -1);
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter10, (int) (byte) 1, "                                                                          ", "                                                              ", options14, 2, (int) ' ', "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        int int6 = helpFormatter0.findWrapPos("hi!", (int) (byte) 100, 74);
        int int10 = helpFormatter0.findWrapPos("arg", 74, (-1));
        int int11 = helpFormatter0.getDescPadding();
        java.lang.String str12 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str13 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultArgName = "   ";
        helpFormatter0.setLeftPadding(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        helpFormatter0.setLongOptPrefix("--");
        java.lang.String str6 = helpFormatter0.getOptPrefix();
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        helpFormatter0.defaultNewLine = "";
        int int4 = helpFormatter0.defaultWidth;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int7 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setNewLine("                                                              ");
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        helpFormatter0.setOptPrefix("usage:");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setArgName("usage:");
        helpFormatter0.defaultOptPrefix = "--";
        int int8 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultSyntaxPrefix = "             ";
        helpFormatter0.defaultOptPrefix = "arg";
        int int13 = helpFormatter0.defaultWidth;
        java.lang.String str14 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter15 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter15, (int) '4', "hi!", "                                                                                                    ", options19, 6, (int) (short) 100, "                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage:" + "'", str14, "usage:");
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setDescPadding((int) (short) 1);
        java.lang.String str6 = helpFormatter0.createPadding((int) ' ');
        helpFormatter0.setOptPrefix("-");
        int int9 = helpFormatter0.getLeftPadding();
        int int10 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setArgName("                                                              ");
        java.lang.String str14 = helpFormatter0.rtrim("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                " + "'", str6, "                                ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setDescPadding((int) (short) 1);
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.setOptPrefix("usage: ");
        helpFormatter0.defaultDescPad = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        int int2 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (byte) 1);
        int int5 = helpFormatter0.defaultDescPad;
        int int6 = helpFormatter0.getWidth();
        int int7 = helpFormatter0.getWidth();
        java.lang.String str9 = helpFormatter0.rtrim("                                                                          ");
        helpFormatter0.setLeftPadding((int) (short) 0);
        helpFormatter0.defaultLeftPad = (byte) -1;
        java.io.PrintWriter printWriter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter14, (int) (byte) 1, (int) (short) 0, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        int int4 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLeftPad = 10;
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setWidth(0);
        int int10 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setSyntaxPrefix("                                ");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str5 = helpFormatter0.getArgName();
        int int9 = helpFormatter0.findWrapPos("          ", (int) (byte) 0, 13);
        helpFormatter0.defaultDescPad = 'a';
        helpFormatter0.setWidth((int) (byte) 0);
        java.lang.String str14 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultSyntaxPrefix = "                                ";
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                " + "'", str14, "                                ");
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        int int2 = helpFormatter0.defaultDescPad;
        int int3 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setSyntaxPrefix("                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setDescPadding((int) (short) 1);
        java.lang.String str6 = helpFormatter0.createPadding((int) ' ');
        int int7 = helpFormatter0.getWidth();
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultOptPrefix = "";
        helpFormatter0.defaultSyntaxPrefix = "--";
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("             ", options14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                " + "'", str6, "                                ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str4 = helpFormatter0.rtrim("                                                                                                 ");
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        helpFormatter0.setNewLine("                                                              ");
        java.lang.String str11 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        helpFormatter0.setNewLine("");
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLeftPadding(35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str4 = helpFormatter0.createPadding(0);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLeftPadding((int) '#');
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = 34;
        int int11 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str4 = helpFormatter0.rtrim("                                                                                                 ");
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        helpFormatter0.defaultArgName = "";
        helpFormatter0.defaultArgName = "arg";
        helpFormatter0.defaultArgName = "                                                                                                    ";
        helpFormatter0.setOptPrefix("                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.getArgName();
        java.lang.String str5 = helpFormatter0.rtrim("                                                                                                 ");
        helpFormatter0.setArgName("-");
        java.lang.String str8 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.getLongOptPrefix();
        int int3 = helpFormatter0.getWidth();
        java.lang.String str4 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter5 = null;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter5, 74, "arg", "", options9, (int) '4', (int) (byte) -1, "                                                                 ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 74 + "'", int3 == 74);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "usage: " + "'", str4, "usage: ");
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        int int2 = helpFormatter0.defaultDescPad;
        int int3 = helpFormatter0.defaultLeftPad;
        java.lang.String str4 = helpFormatter0.defaultNewLine;
        java.lang.String str5 = helpFormatter0.getNewLine();
        java.lang.String str6 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setOptPrefix("--");
        helpFormatter0.setOptPrefix("usage:");
        java.lang.String str8 = helpFormatter0.rtrim("\n");
        helpFormatter0.defaultNewLine = "";
        helpFormatter0.defaultDescPad = 74;
        java.lang.String str14 = helpFormatter0.createPadding(53);
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = helpFormatter0.renderOptions(stringBuffer15, 32, options17, 65, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                     " + "'", str14, "                                                     ");
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.setLeftPadding((int) (byte) -1);
        helpFormatter0.setLongOptPrefix("                                                                                                 ");
        helpFormatter0.defaultWidth = (short) 10;
        helpFormatter0.defaultArgName = "   ";
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str4 = helpFormatter0.createPadding(0);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.lang.String str6 = helpFormatter0.getNewLine();
        helpFormatter0.defaultDescPad = (short) 100;
        java.lang.String str9 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setNewLine("                                                                          ");
        java.lang.Class<?> wildcardClass13 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setSyntaxPrefix("--");
        helpFormatter0.defaultNewLine = "-";
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter10, (int) (byte) 100, "          ", "arg", options14, (int) '4', (int) (short) 100, "    ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultNewLine;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLeftPad = 1;
        helpFormatter0.setDescPadding((int) '4');
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str4 = helpFormatter0.createPadding(0);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        int int6 = helpFormatter0.getDescPadding();
        helpFormatter0.setArgName("");
        int int12 = helpFormatter0.findWrapPos("                                                                          ", (int) (byte) 1, 10);
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(" ", "-", options15, "           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str3 = helpFormatter0.getArgName();
        int int4 = helpFormatter0.defaultDescPad;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("--");
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        int int9 = helpFormatter0.getWidth();
        helpFormatter0.setArgName("hi!");
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                ", " ", options14, "                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setOptPrefix("");
        java.io.PrintWriter printWriter5 = null;
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter5, 52, "--", options8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        java.lang.String str11 = helpFormatter0.getNewLine();
        helpFormatter0.setLeftPadding((int) '4');
        java.lang.String str14 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage: " + "'", str14, "usage: ");
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str3 = helpFormatter0.getArgName();
        int int4 = helpFormatter0.getLeftPadding();
        helpFormatter0.setNewLine("             ");
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        java.lang.String str9 = helpFormatter0.rtrim("\n");
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                    ", options12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "             " + "'", str10, "             ");
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        java.lang.String str2 = helpFormatter0.getNewLine();
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setSyntaxPrefix("");
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        java.lang.Class<?> wildcardClass8 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        java.lang.String str2 = helpFormatter0.getNewLine();
        helpFormatter0.defaultOptPrefix = "usage: ";
        helpFormatter0.defaultDescPad = ' ';
        java.lang.String str7 = helpFormatter0.getNewLine();
        helpFormatter0.defaultNewLine = "                                          ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setDescPadding((int) (short) 1);
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.defaultOptPrefix = "-";
        int int9 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultSyntaxPrefix = "                                   ";
        int int12 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLeftPad = 52;
        java.lang.String str15 = helpFormatter0.getArgName();
        java.lang.String str17 = helpFormatter0.rtrim("");
        int int18 = helpFormatter0.getDescPadding();
        int int19 = helpFormatter0.getLeftPadding();
        java.lang.String str20 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                   " + "'", str20, "                                   ");
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.getDescPadding();
        java.lang.String str5 = helpFormatter0.getNewLine();
        helpFormatter0.defaultLongOptPrefix = " ";
        int int8 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str4 = helpFormatter0.createPadding(0);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        java.lang.String str6 = helpFormatter0.getNewLine();
        helpFormatter0.defaultDescPad = (short) 100;
        int int9 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setSyntaxPrefix("                                          ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str4 = helpFormatter0.createPadding(0);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLeftPadding((int) '#');
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        int int9 = helpFormatter0.getWidth();
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter10, 34, "                                          ", options13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setDescPadding((int) (short) 1);
        java.lang.String str6 = helpFormatter0.createPadding((int) ' ');
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.defaultArgName = "--";
        helpFormatter0.defaultSyntaxPrefix = "                                                                          ";
        java.lang.String str14 = helpFormatter0.rtrim("                                   ");
        java.lang.String str15 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                " + "'", str6, "                                ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                                                          " + "'", str15, "                                                                          ");
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        java.lang.String str2 = helpFormatter0.getNewLine();
        int int3 = helpFormatter0.getWidth();
        java.lang.String str5 = helpFormatter0.rtrim("                                                                                                 ");
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        helpFormatter0.setSyntaxPrefix("--");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 74 + "'", int3 == 74);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.setLeftPadding((int) (short) -1);
        int int8 = helpFormatter0.findWrapPos("", (int) '4', (int) '4');
        helpFormatter0.defaultLongOptPrefix = "hi!";
        java.lang.String str12 = helpFormatter0.createPadding((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " " + "'", str12, " ");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        int int2 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (byte) 1);
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultDescPad = '4';
        int int10 = helpFormatter0.getDescPadding();
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "usage: " + "'", str11, "usage: ");
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultOptPrefix;
        int int3 = helpFormatter0.getLeftPadding();
        int int4 = helpFormatter0.getLeftPadding();
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(62, " ", "usage: ", options8, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-" + "'", str2, "-");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        int int4 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLeftPad = 10;
        helpFormatter0.setLongOptPrefix("\n");
        int int9 = helpFormatter0.getWidth();
        helpFormatter0.defaultLongOptPrefix = "--";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                    ";
        java.lang.Class<?> wildcardClass13 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        helpFormatter0.defaultDescPad = (byte) 100;
        java.lang.String str7 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = 10;
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.setDescPadding(0);
        java.lang.String str13 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        int int6 = helpFormatter0.findWrapPos("hi!", (int) (short) 10, 34);
        int int7 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setDescPadding((int) (short) 1);
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.defaultOptPrefix = "-";
        int int9 = helpFormatter0.defaultLeftPad;
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter10, 0, "                                 ", "          ", options14, 16, (int) (byte) 100, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        helpFormatter0.defaultNewLine = "";
        int int4 = helpFormatter0.defaultWidth;
        helpFormatter0.setOptPrefix("          ");
        int int7 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str3 = helpFormatter0.getArgName();
        int int4 = helpFormatter0.defaultDescPad;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.setNewLine("--");
        java.lang.String str8 = helpFormatter0.defaultArgName;
        helpFormatter0.setLongOptPrefix("          ");
        int int11 = helpFormatter0.defaultDescPad;
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = helpFormatter0.renderOptions(stringBuffer12, 1, options14, 6, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = (-1);
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setArgName("usage:");
        int int13 = helpFormatter0.defaultWidth;
        java.lang.String str14 = helpFormatter0.getArgName();
        helpFormatter0.defaultArgName = "                                   ";
        helpFormatter0.defaultLeftPad = 13;
        helpFormatter0.defaultLongOptPrefix = "      ";
        helpFormatter0.defaultLeftPad = 1;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage:" + "'", str14, "usage:");
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        int int4 = helpFormatter0.getWidth();
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setNewLine("                                                                                                    ");
        java.lang.String str8 = helpFormatter0.getArgName();
        java.lang.Class<?> wildcardClass9 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setArgName("usage:");
        int int13 = helpFormatter0.defaultWidth;
        helpFormatter0.setArgName("                                                                                                    ");
        java.lang.String str16 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultSyntaxPrefix = "usage:";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        int int6 = helpFormatter0.findWrapPos("hi!", (int) (byte) 100, 74);
        int int10 = helpFormatter0.findWrapPos("arg", 74, (-1));
        int int11 = helpFormatter0.defaultWidth;
        helpFormatter0.setOptPrefix("");
        helpFormatter0.setOptPrefix("                                 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 74 + "'", int11 == 74);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        java.lang.String str2 = helpFormatter0.getArgName();
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str6 = helpFormatter0.createPadding(74);
        int int7 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultSyntaxPrefix = "-";
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                          " + "'", str6, "                                                                          ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        int int6 = helpFormatter0.findWrapPos("hi!", (int) (byte) 100, 74);
        helpFormatter0.defaultNewLine = "                                ";
        helpFormatter0.defaultNewLine = "usage: ";
        java.lang.String str11 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLeftPad = 52;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = ' ';
        java.lang.String str5 = helpFormatter0.defaultLongOptPrefix;
        int int6 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-" + "'", str2, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--" + "'", str5, "--");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.getLeftPadding();
        helpFormatter0.setArgName("hi!");
        helpFormatter0.defaultNewLine = "  ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setDescPadding(42);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        int int4 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLeftPad = 10;
        helpFormatter0.setLongOptPrefix("\n");
        int int9 = helpFormatter0.getWidth();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        int int12 = helpFormatter0.defaultLeftPad;
        java.lang.String str14 = helpFormatter0.createPadding(3);
        int int15 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "   " + "'", str14, "   ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setNewLine("hi!");
        int int9 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "                                ";
        helpFormatter0.setNewLine("-");
        java.lang.String str14 = helpFormatter0.getArgName();
        helpFormatter0.setDescPadding((int) '4');
        helpFormatter0.defaultLeftPad = 'a';
        helpFormatter0.setLongOptPrefix("usage:");
        org.apache.commons.cli.Options options24 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(33, "  ", " ", options24, "                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                " + "'", str14, "                                ");
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str3 = helpFormatter0.getArgName();
        int int4 = helpFormatter0.defaultDescPad;
        int int5 = helpFormatter0.getWidth();
        helpFormatter0.defaultOptPrefix = "             ";
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                 ", "                                                                 ", options10, "--");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        int int4 = helpFormatter0.getDescPadding();
        int int5 = helpFormatter0.getDescPadding();
        helpFormatter0.setNewLine("          ");
        helpFormatter0.setSyntaxPrefix("                                                                                                 ");
        helpFormatter0.setLeftPadding(45);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        int int6 = helpFormatter0.findWrapPos("hi!", (int) (byte) 100, 74);
        int int10 = helpFormatter0.findWrapPos("arg", 74, (-1));
        int int11 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLongOptPrefix = "    ";
        java.lang.String str15 = helpFormatter0.rtrim("                                          ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setArgName("");
        helpFormatter0.defaultWidth = 0;
        int int5 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultNewLine = "arg";
        java.lang.String str12 = helpFormatter0.getOptPrefix();
        helpFormatter0.setDescPadding(47);
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter15, (int) (short) 1, "                                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.setLeftPadding((int) (short) -1);
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setOptPrefix("-");
        int int9 = helpFormatter0.getDescPadding();
        int int10 = helpFormatter0.defaultDescPad;
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setOptPrefix("hi!");
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                ", options15);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        int int6 = helpFormatter0.findWrapPos("hi!", (int) (byte) 100, 74);
        int int10 = helpFormatter0.findWrapPos("arg", 74, (-1));
        int int11 = helpFormatter0.getDescPadding();
        int int12 = helpFormatter0.defaultWidth;
        helpFormatter0.setWidth(34);
        helpFormatter0.defaultSyntaxPrefix = "                                ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        java.lang.String str2 = helpFormatter0.defaultNewLine;
        helpFormatter0.setNewLine("hi!");
        java.lang.String str5 = helpFormatter0.defaultArgName;
        int int6 = helpFormatter0.defaultDescPad;
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter9, 1, "                                                              ", "                                                                                                 ", options13, 47, 15, "                                                     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setNewLine("hi!");
        int int9 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "                                ";
        helpFormatter0.setNewLine("-");
        java.lang.String str14 = helpFormatter0.getArgName();
        java.lang.String str15 = helpFormatter0.getArgName();
        java.lang.String str17 = helpFormatter0.createPadding(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                " + "'", str14, "                                ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                " + "'", str15, "                                ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                                                                                 " + "'", str17, "                                                                                                 ");
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.setLeftPadding((int) (short) -1);
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.defaultWidth = (short) -1;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setNewLine("hi!");
        int int9 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "                                ";
        helpFormatter0.setNewLine("-");
        java.lang.String str14 = helpFormatter0.getArgName();
        java.lang.String str15 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setWidth(65);
        helpFormatter0.defaultNewLine = "                                                              ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                " + "'", str14, "                                ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = ' ';
        helpFormatter0.setNewLine("");
        helpFormatter0.setDescPadding(100);
        helpFormatter0.setLongOptPrefix("usage:");
        helpFormatter0.setArgName("                                               ");
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("arg", options14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-" + "'", str2, "-");
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setArgName("usage:");
        int int13 = helpFormatter0.defaultWidth;
        helpFormatter0.setArgName("                                                                                                    ");
        java.lang.String str16 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.defaultLeftPad = (byte) 100;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("             ", options20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setOptPrefix("--");
        helpFormatter0.setOptPrefix("usage:");
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage:" + "'", str7, "usage:");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage:" + "'", str8, "usage:");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage:" + "'", str9, "usage:");
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.getArgName();
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        java.lang.String str6 = helpFormatter0.createPadding((int) (byte) 0);
        java.lang.String str7 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setSyntaxPrefix(" ");
        java.lang.String str11 = helpFormatter0.rtrim("                ");
        helpFormatter0.defaultOptPrefix = "                                                              ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        java.lang.String str5 = helpFormatter0.rtrim("\n");
        helpFormatter0.setWidth((int) (byte) 0);
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str10 = helpFormatter0.defaultNewLine;
        helpFormatter0.setSyntaxPrefix("                                ");
        java.lang.String str13 = helpFormatter0.getNewLine();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        helpFormatter0.setNewLine("");
        helpFormatter0.setDescPadding(10);
        helpFormatter0.setSyntaxPrefix("\n");
        helpFormatter0.defaultWidth = (byte) 100;
        helpFormatter0.defaultNewLine = "";
        java.lang.String str20 = helpFormatter0.defaultNewLine;
        helpFormatter0.setNewLine("arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.setWidth(0);
        java.lang.String str5 = helpFormatter0.getLongOptPrefix();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        java.lang.String str2 = helpFormatter0.defaultNewLine;
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        int int4 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLongOptPrefix("                                   ");
        int int10 = helpFormatter0.findWrapPos("                                   ", (-1), 1);
        helpFormatter0.setLeftPadding(1);
        java.lang.String str13 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter14 = null;
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter14, 42, options16, (int) '4', 45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setDescPadding((int) (short) 1);
        helpFormatter0.defaultWidth = 0;
        java.lang.String str7 = helpFormatter0.defaultArgName;
        int int8 = helpFormatter0.getLeftPadding();
        java.lang.String str9 = helpFormatter0.defaultArgName;
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setDescPadding(62);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setArgName("");
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.defaultSyntaxPrefix = "--";
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setOptPrefix("hi!");
        java.lang.String str10 = helpFormatter0.getArgName();
        helpFormatter0.defaultSyntaxPrefix = "  ";
        java.lang.String str13 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        int int6 = helpFormatter0.findWrapPos("hi!", (int) (byte) 100, 74);
        int int10 = helpFormatter0.findWrapPos("arg", 74, (-1));
        int int11 = helpFormatter0.getDescPadding();
        int int12 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLeftPad = 10;
        helpFormatter0.defaultWidth = 3;
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(" ", options18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 74 + "'", int12 == 74);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setLongOptPrefix("hi!");
        java.lang.String str4 = helpFormatter0.rtrim("hi!");
        java.lang.String str5 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "--";
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("                                ");
        helpFormatter0.setLeftPadding((int) ' ');
        java.lang.String str15 = helpFormatter0.rtrim("");
        java.lang.String str16 = helpFormatter0.getNewLine();
        helpFormatter0.setSyntaxPrefix("                                                    ");
        java.lang.String str19 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "--" + "'", str16, "--");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-" + "'", str19, "-");
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setDescPadding((int) (short) 1);
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.defaultOptPrefix = "-";
        int int9 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultSyntaxPrefix = "                                   ";
        int int12 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLeftPad = 52;
        java.lang.String str15 = helpFormatter0.getArgName();
        java.lang.String str17 = helpFormatter0.rtrim("");
        int int18 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultSyntaxPrefix = "                                                     ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setSyntaxPrefix("                                ");
        helpFormatter0.setLeftPadding(74);
        helpFormatter0.defaultLongOptPrefix = "                                   ";
        helpFormatter0.setWidth(0);
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        int int10 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                   " + "'", str9, "                                   ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str4 = helpFormatter0.createPadding(0);
        java.lang.String str5 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("usage: ");
        int int8 = helpFormatter0.getWidth();
        java.lang.String str9 = helpFormatter0.getNewLine();
        java.lang.String str10 = helpFormatter0.getArgName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setArgName("usage:");
        int int13 = helpFormatter0.defaultWidth;
        int int14 = helpFormatter0.getWidth();
        helpFormatter0.defaultLeftPad = (byte) 10;
        java.lang.String str17 = helpFormatter0.getArgName();
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                              ", "                                                     ", options20, "                                  ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "usage:" + "'", str17, "usage:");
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.setLeftPadding((int) (short) -1);
        int int8 = helpFormatter0.findWrapPos("", (int) '4', (int) '4');
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.setLeftPadding(74);
        helpFormatter0.defaultWidth = (short) 0;
        helpFormatter0.defaultLeftPad = (byte) 100;
        int int17 = helpFormatter0.defaultLeftPad;
        int int21 = helpFormatter0.findWrapPos("", 62, 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        helpFormatter0.defaultNewLine = "";
        java.lang.String str5 = helpFormatter0.rtrim("usage: ");
        java.lang.String str6 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "          ";
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderOptions(stringBuffer11, 34, options13, 42, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage:" + "'", str5, "usage:");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "          " + "'", str10, "          ");
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = 0;
        int int6 = helpFormatter0.getLeftPadding();
        java.lang.String str7 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultLongOptPrefix = " ";
        java.lang.String str10 = helpFormatter0.defaultSyntaxPrefix;
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter11, 97, "  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        int int4 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLeftPad = 10;
        java.lang.String str7 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setLongOptPrefix("                                                                                                    ");
        java.lang.String str12 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str14 = helpFormatter0.createPadding((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "usage: " + "'", str7, "usage: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                    " + "'", str12, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                                                    " + "'", str14, "                                                                                                    ");
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = 0;
        int int6 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultOptPrefix = "-";
        java.lang.String str10 = helpFormatter0.createPadding(0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultArgName = "--";
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        java.lang.String str6 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("arg");
        java.lang.String str9 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setNewLine("usage:");
        int int12 = helpFormatter0.defaultDescPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-" + "'", str2, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-" + "'", str9, "-");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.setLeftPadding((int) (byte) -1);
        helpFormatter0.defaultWidth = (byte) 10;
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter7, 53, "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "\n";
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultArgName = "                                                                                                 ";
        helpFormatter0.defaultDescPad = 97;
        java.lang.String str13 = helpFormatter0.defaultArgName;
        java.lang.String str14 = helpFormatter0.getArgName();
        java.io.PrintWriter printWriter15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter15, 100, "   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                                                                                 " + "'", str13, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                                                 " + "'", str14, "                                                                                                 ");
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        java.lang.String str2 = helpFormatter0.getNewLine();
        helpFormatter0.setWidth(6);
        java.lang.String str5 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.setLeftPadding((int) (byte) -1);
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLeftPadding((-1));
        helpFormatter0.setOptPrefix("                                                                                                    ");
        int int13 = helpFormatter0.findWrapPos("      ", (int) (short) 100, (int) (byte) 10);
        helpFormatter0.setLeftPadding((int) 'a');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str3 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLongOptPrefix("             ");
        helpFormatter0.setLeftPadding((int) (byte) 1);
        helpFormatter0.setDescPadding((int) (short) 100);
        java.lang.String str10 = helpFormatter0.getArgName();
        java.lang.String str12 = helpFormatter0.rtrim("           ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setNewLine("hi!");
        int int9 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "                                ";
        helpFormatter0.setNewLine("-");
        java.lang.String str14 = helpFormatter0.getArgName();
        java.lang.String str15 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setOptPrefix(" ");
        helpFormatter0.setWidth((int) (byte) -1);
        java.lang.StringBuffer stringBuffer20 = null;
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer25 = helpFormatter0.renderOptions(stringBuffer20, 53, options22, 6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                " + "'", str14, "                                ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setArgName("usage:");
        helpFormatter0.defaultOptPrefix = "--";
        int int8 = helpFormatter0.defaultLeftPad;
        int int9 = helpFormatter0.getLeftPadding();
        java.lang.String str10 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultDescPad = 4;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage:" + "'", str10, "usage:");
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        helpFormatter0.defaultLeftPad = 0;
        int int12 = helpFormatter0.defaultLeftPad;
        java.lang.String str13 = helpFormatter0.getSyntaxPrefix();
        int int14 = helpFormatter0.getLeftPadding();
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = helpFormatter0.renderOptions(stringBuffer15, (int) '4', options17, 53, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.getArgName();
        helpFormatter0.defaultLeftPad = (short) 0;
        helpFormatter0.setDescPadding(1);
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("usage: ", "           ", options10, "    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        helpFormatter0.defaultNewLine = "";
        int int4 = helpFormatter0.defaultWidth;
        helpFormatter0.setSyntaxPrefix("hi!");
        int int7 = helpFormatter0.defaultLeftPad;
        java.lang.String str8 = helpFormatter0.getArgName();
        java.lang.String str9 = helpFormatter0.defaultArgName;
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "                                          ";
        helpFormatter0.setLeftPadding(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arg" + "'", str8, "arg");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        helpFormatter0.defaultLongOptPrefix = "-";
        helpFormatter0.defaultArgName = "          ";
        helpFormatter0.setNewLine("\n");
        helpFormatter0.setLeftPadding((int) (short) 0);
        java.lang.String str13 = helpFormatter0.rtrim("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str3 = helpFormatter0.getArgName();
        int int4 = helpFormatter0.defaultDescPad;
        int int5 = helpFormatter0.defaultWidth;
        int int6 = helpFormatter0.getWidth();
        helpFormatter0.defaultSyntaxPrefix = "                                ";
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter9, 0, options11, (int) (short) 10, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        int int2 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (byte) 1);
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.setNewLine("-");
        helpFormatter0.defaultDescPad = '4';
        int int10 = helpFormatter0.getDescPadding();
        helpFormatter0.setSyntaxPrefix("           ");
        int int13 = helpFormatter0.defaultDescPad;
        java.io.PrintWriter printWriter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter14, 15, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultSyntaxPrefix = "usage: ";
        int int9 = helpFormatter0.defaultLeftPad;
        java.lang.String str10 = helpFormatter0.getNewLine();
        int int14 = helpFormatter0.findWrapPos("usage: ", 13, (int) (short) 100);
        helpFormatter0.defaultArgName = "";
        java.io.PrintWriter printWriter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter17, (int) 'a', "                                                              ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.setWidth(0);
        helpFormatter0.setWidth((int) (byte) 100);
        helpFormatter0.setWidth(4);
        helpFormatter0.defaultLeftPad = 3;
        java.lang.String str11 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLongOptPrefix("usage: ");
        helpFormatter0.setLongOptPrefix("                                                     ");
        java.lang.String str17 = helpFormatter0.rtrim("                                ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setDescPadding((int) (short) 1);
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.defaultOptPrefix = "-";
        int int9 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultSyntaxPrefix = "                                   ";
        int int12 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLeftPad = 52;
        java.lang.String str15 = helpFormatter0.getArgName();
        java.lang.String str17 = helpFormatter0.rtrim("");
        int int18 = helpFormatter0.getDescPadding();
        int int19 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLeftPadding(2);
        helpFormatter0.setWidth(62);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultOptPrefix;
        java.lang.String str3 = helpFormatter0.getArgName();
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str6 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultArgName = "                                   ";
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        helpFormatter0.setLeftPadding(53);
        helpFormatter0.defaultArgName = "                                  ";
        int int14 = helpFormatter0.getLeftPadding();
        java.lang.String str16 = helpFormatter0.rtrim("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-" + "'", str2, "-");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.setLeftPadding((int) (byte) -1);
        java.lang.String str6 = helpFormatter0.rtrim("                                   ");
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        java.lang.String str8 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setNewLine("                                ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        int int4 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLeftPad = 10;
        helpFormatter0.setLongOptPrefix("\n");
        java.lang.String str9 = helpFormatter0.defaultSyntaxPrefix;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(11, "                                                                 ", "                                               ", options13, "\n", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "usage: " + "'", str9, "usage: ");
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultArgName = "--";
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        int int6 = helpFormatter0.getLeftPadding();
        java.lang.String str7 = helpFormatter0.defaultArgName;
        java.lang.String str8 = helpFormatter0.defaultNewLine;
        helpFormatter0.defaultNewLine = "--";
        java.lang.String str11 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str12 = helpFormatter0.getNewLine();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-" + "'", str2, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--" + "'", str11, "--");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--" + "'", str12, "--");
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        helpFormatter0.defaultLongOptPrefix = "-";
        helpFormatter0.defaultArgName = "          ";
        helpFormatter0.setNewLine("\n");
        int int10 = helpFormatter0.getDescPadding();
        java.lang.String str11 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLeftPadding((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultArgName = "--";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str6 = helpFormatter0.getArgName();
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setSyntaxPrefix("                                   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-" + "'", str2, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str4 = helpFormatter0.rtrim("                                                                                                 ");
        int int5 = helpFormatter0.defaultDescPad;
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.io.PrintWriter printWriter7 = null;
        org.apache.commons.cli.Options options9 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter7, 74, options9, (int) (byte) 100, 34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        java.lang.String str6 = helpFormatter0.createPadding(1);
        helpFormatter0.setLeftPadding((int) (short) 100);
        int int9 = helpFormatter0.getLeftPadding();
        java.io.PrintWriter printWriter10 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter10, 74, options12, (int) (short) 10, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        java.lang.String str2 = helpFormatter0.defaultNewLine;
        int int3 = helpFormatter0.defaultDescPad;
        java.lang.String str4 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultDescPad = 33;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setSyntaxPrefix("                                ");
        helpFormatter0.setLeftPadding(74);
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultLeftPad = 32;
        java.lang.String str8 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        java.lang.String str2 = helpFormatter0.getArgName();
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str6 = helpFormatter0.createPadding(74);
        helpFormatter0.setOptPrefix("");
        helpFormatter0.defaultLongOptPrefix = "                                                    ";
        helpFormatter0.setDescPadding((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                          " + "'", str6, "                                                                          ");
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        int int11 = helpFormatter0.getDescPadding();
        java.lang.StringBuffer stringBuffer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer16 = helpFormatter0.renderWrappedText(stringBuffer12, 6, 3, "                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.StringBuffer.append(String)\" because \"sb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setDescPadding((int) (short) 1);
        helpFormatter0.defaultWidth = 0;
        helpFormatter0.defaultOptPrefix = "-";
        int int9 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultSyntaxPrefix = "                                   ";
        helpFormatter0.setDescPadding(53);
        int int14 = helpFormatter0.defaultDescPad;
        helpFormatter0.setOptPrefix("          ");
        java.lang.String str17 = helpFormatter0.defaultLongOptPrefix;
        int int21 = helpFormatter0.findWrapPos("          ", 45, 13);
        helpFormatter0.defaultSyntaxPrefix = "                                  ";
        int int24 = helpFormatter0.getWidth();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "--" + "'", str17, "--");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        helpFormatter0.defaultNewLine = "hi!";
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.Class<?> wildcardClass13 = helpFormatter0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setSyntaxPrefix("                                ");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str5 = helpFormatter0.getArgName();
        int int9 = helpFormatter0.findWrapPos("          ", (int) (byte) 0, 13);
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        java.lang.String str11 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str12 = helpFormatter0.defaultNewLine;
        int int13 = helpFormatter0.getWidth();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                " + "'", str11, "                                ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.setLeftPadding((int) (short) -1);
        helpFormatter0.defaultOptPrefix = "hi!";
        helpFormatter0.setOptPrefix("-");
        helpFormatter0.setLeftPadding((int) (byte) 100);
        java.lang.String str12 = helpFormatter0.createPadding((int) (byte) 100);
        java.lang.String str13 = helpFormatter0.getSyntaxPrefix();
        int int14 = helpFormatter0.getLeftPadding();
        int int18 = helpFormatter0.findWrapPos("                                                                 ", 0, 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                    " + "'", str12, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "usage: " + "'", str13, "usage: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        int int2 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (byte) 1);
        int int5 = helpFormatter0.getDescPadding();
        java.lang.String str6 = helpFormatter0.getLongOptPrefix();
        java.lang.String str8 = helpFormatter0.rtrim("-");
        java.lang.String str10 = helpFormatter0.rtrim("          ");
        helpFormatter0.setLongOptPrefix("                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--" + "'", str6, "--");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        java.lang.String str2 = helpFormatter0.defaultNewLine;
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        int int4 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLongOptPrefix("                                   ");
        int int10 = helpFormatter0.findWrapPos("                                   ", (-1), 1);
        helpFormatter0.setLeftPadding(1);
        java.lang.String str13 = helpFormatter0.defaultArgName;
        java.io.PrintWriter printWriter14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter14, (-1), 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arg" + "'", str13, "arg");
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        helpFormatter0.setNewLine("");
        int int12 = helpFormatter0.findWrapPos("usage:", (int) (short) 100, (int) 'a');
        int int13 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultLongOptPrefix = "-";
        helpFormatter0.setOptPrefix("                                                                                                    ");
        java.lang.String str19 = helpFormatter0.createPadding(47);
        helpFormatter0.setLeftPadding(42);
        helpFormatter0.defaultNewLine = "\n";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 74 + "'", int13 == 74);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                               " + "'", str19, "                                               ");
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        helpFormatter0.defaultLeftPad = 0;
        helpFormatter0.setLongOptPrefix("             ");
        helpFormatter0.defaultDescPad = (byte) 100;
        java.lang.String str16 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str3 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLongOptPrefix("             ");
        java.lang.String str6 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultNewLine = " ";
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter9, (int) (short) 0, "", options12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-" + "'", str6, "-");
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        int int3 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "             ";
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter6, (int) (byte) -1, (int) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str3 = helpFormatter0.getArgName();
        int int4 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultDescPad = (-1);
        java.lang.String str7 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = (-1);
        helpFormatter0.setWidth(34);
        helpFormatter0.defaultLeftPad = 1;
        int int14 = helpFormatter0.defaultWidth;
        int int15 = helpFormatter0.getWidth();
        java.lang.String str16 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.setArgName("    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        int int4 = helpFormatter0.getDescPadding();
        int int5 = helpFormatter0.getDescPadding();
        java.lang.String str6 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str7 = helpFormatter0.getArgName();
        helpFormatter0.defaultWidth = (short) 0;
        helpFormatter0.setArgName("arg");
        java.lang.String str12 = helpFormatter0.defaultSyntaxPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "usage: " + "'", str12, "usage: ");
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        java.lang.String str2 = helpFormatter0.getArgName();
        helpFormatter0.defaultOptPrefix = "--";
        java.lang.String str6 = helpFormatter0.createPadding(74);
        helpFormatter0.setOptPrefix("");
        java.lang.String str9 = helpFormatter0.getArgName();
        helpFormatter0.defaultDescPad = 13;
        int int12 = helpFormatter0.getLeftPadding();
        int int13 = helpFormatter0.defaultDescPad;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                              ", options15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                          " + "'", str6, "                                                                          ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arg" + "'", str9, "arg");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 13 + "'", int13 == 13);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str3 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str4 = helpFormatter0.defaultArgName;
        helpFormatter0.setSyntaxPrefix("usage: ");
        helpFormatter0.defaultLongOptPrefix = "-";
        helpFormatter0.defaultNewLine = "                ";
        java.lang.String str12 = helpFormatter0.rtrim("    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "arg" + "'", str4, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        java.lang.String str6 = helpFormatter0.createPadding(1);
        helpFormatter0.setLeftPadding((int) (short) 100);
        helpFormatter0.setOptPrefix("arg");
        helpFormatter0.defaultNewLine = "-";
        helpFormatter0.defaultLeftPad = 'a';
        helpFormatter0.defaultSyntaxPrefix = "   ";
        java.io.PrintWriter printWriter17 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter17, 0, options19, 2, 34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLeftPadding(1);
        java.lang.String str7 = helpFormatter0.getNewLine();
        helpFormatter0.setNewLine("");
        helpFormatter0.setSyntaxPrefix("                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        int int4 = helpFormatter0.getDescPadding();
        helpFormatter0.defaultLeftPad = 10;
        java.lang.String str8 = helpFormatter0.rtrim("                                                                                                    ");
        int int9 = helpFormatter0.defaultDescPad;
        int int10 = helpFormatter0.getWidth();
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultLongOptPrefix;
        int int5 = helpFormatter0.defaultDescPad;
        java.lang.String str6 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str7 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "usage: " + "'", str6, "usage: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "--" + "'", str7, "--");
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        helpFormatter0.setDescPadding(1);
        int int6 = helpFormatter0.defaultDescPad;
        int int7 = helpFormatter0.getWidth();
        helpFormatter0.setDescPadding(52);
        helpFormatter0.defaultLongOptPrefix = "                                                                          ";
        helpFormatter0.setWidth(13);
        org.apache.commons.cli.Options options16 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("--", "                                                              ", options16, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        int int4 = helpFormatter0.getWidth();
        helpFormatter0.defaultSyntaxPrefix = "          ";
        java.lang.String str7 = helpFormatter0.defaultSyntaxPrefix;
        int int8 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "                                                                                                    ";
        java.lang.String str11 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "          " + "'", str7, "          ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-" + "'", str11, "-");
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        java.lang.String str2 = helpFormatter0.getNewLine();
        int int3 = helpFormatter0.getWidth();
        java.lang.String str5 = helpFormatter0.rtrim("                                                                                                 ");
        java.io.PrintWriter printWriter6 = null;
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter6, (int) '#', "--", "                                ", options10, (int) (short) 100, 42, "                                               ", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 74 + "'", int3 == 74);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        int int4 = helpFormatter0.getDescPadding();
        int int5 = helpFormatter0.defaultWidth;
        java.lang.String str6 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultDescPad = '#';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "arg" + "'", str6, "arg");
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultArgName = "--";
        java.lang.String str5 = helpFormatter0.getSyntaxPrefix();
        java.lang.String str6 = helpFormatter0.getNewLine();
        org.apache.commons.cli.Options options8 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(" ", options8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-" + "'", str2, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "usage: " + "'", str5, "usage: ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        int int4 = helpFormatter0.getDescPadding();
        java.lang.String str5 = helpFormatter0.getArgName();
        helpFormatter0.defaultArgName = "                                                                                                    ";
        int int8 = helpFormatter0.getLeftPadding();
        java.lang.String str10 = helpFormatter0.rtrim("hi!");
        helpFormatter0.defaultDescPad = (short) 100;
        helpFormatter0.setLeftPadding(97);
        helpFormatter0.defaultLeftPad = '4';
        org.apache.commons.cli.Options options18 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("", options18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cmdLineSyntax not provided");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        java.lang.String str2 = helpFormatter0.getArgName();
        int int3 = helpFormatter0.getWidth();
        int int4 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setLongOptPrefix("arg");
        java.lang.String str7 = helpFormatter0.defaultArgName;
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 74 + "'", int3 == 74);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arg" + "'", str7, "arg");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "\n";
        helpFormatter0.defaultDescPad = 'a';
        helpFormatter0.setWidth(0);
        java.lang.Class<?> wildcardClass11 = helpFormatter0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setDescPadding((int) (short) 1);
        java.lang.String str6 = helpFormatter0.createPadding((int) ' ');
        int int7 = helpFormatter0.getWidth();
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultOptPrefix = "";
        helpFormatter0.defaultSyntaxPrefix = "--";
        helpFormatter0.setDescPadding(100);
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.cli.Options options17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer20 = helpFormatter0.renderOptions(stringBuffer15, 0, options17, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                " + "'", str6, "                                ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        java.lang.String str11 = helpFormatter0.getNewLine();
        helpFormatter0.setLeftPadding((int) '4');
        helpFormatter0.setWidth((int) (byte) 1);
        helpFormatter0.setDescPadding(10);
        helpFormatter0.setDescPadding((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str3 = helpFormatter0.getArgName();
        int int4 = helpFormatter0.defaultDescPad;
        int int5 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultOptPrefix = "hi!";
        int int8 = helpFormatter0.getLeftPadding();
        int int9 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultSyntaxPrefix = "   ";
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter12, 65, options14, 45, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 74 + "'", int5 == 74);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        helpFormatter0.defaultLongOptPrefix = "arg";
        helpFormatter0.setNewLine("             ");
        int int12 = helpFormatter0.findWrapPos("usage: ", 0, (int) (short) 0);
        java.lang.String str13 = helpFormatter0.getOptPrefix();
        helpFormatter0.setLeftPadding(33);
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter16, (int) (byte) 1, "           ", "arg", options20, 4, (int) (byte) 1, "usage: ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        helpFormatter0.setLongOptPrefix("--");
        helpFormatter0.setOptPrefix("arg");
        int int8 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setWidth(4);
        helpFormatter0.setArgName("");
        java.lang.String str13 = helpFormatter0.defaultArgName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        java.lang.String str2 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultArgName = "--";
        java.lang.String str5 = helpFormatter0.getOptPrefix();
        int int6 = helpFormatter0.getLeftPadding();
        java.lang.String str7 = helpFormatter0.defaultNewLine;
        int int8 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-" + "'", str2, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        int int2 = helpFormatter0.defaultDescPad;
        helpFormatter0.defaultNewLine = "                                                    ";
        int int5 = helpFormatter0.defaultDescPad;
        helpFormatter0.setOptPrefix("                                                              ");
        int int11 = helpFormatter0.findWrapPos(" ", 4, 0);
        helpFormatter0.defaultWidth = 34;
        java.lang.String str14 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultOptPrefix = "   ";
        int int17 = helpFormatter0.defaultDescPad;
        java.lang.String str18 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                              " + "'", str14, "                                                              ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                    " + "'", str18, "                                                    ");
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setNewLine("hi!");
        int int9 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "                                ";
        helpFormatter0.setNewLine("-");
        java.lang.String str14 = helpFormatter0.getArgName();
        java.lang.String str15 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setWidth(65);
        helpFormatter0.defaultOptPrefix = "                                                                                                    ";
        java.io.PrintWriter printWriter20 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter20, (int) (byte) 1, "usage:");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                " + "'", str14, "                                ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-" + "'", str15, "-");
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        java.lang.String str7 = helpFormatter0.rtrim("hi!");
        helpFormatter0.defaultOptPrefix = "                                                                          ";
        java.lang.String str10 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "usage: " + "'", str10, "usage: ");
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        java.lang.String str5 = helpFormatter0.rtrim("\n");
        helpFormatter0.setWidth((int) (byte) 0);
        helpFormatter0.setOptPrefix("-");
        java.lang.String str10 = helpFormatter0.getOptPrefix();
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter11, (int) (byte) 0, 62, "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-" + "'", str10, "-");
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str4 = helpFormatter0.createPadding(0);
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLeftPadding((int) '#');
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setLongOptPrefix("          ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str4 = helpFormatter0.createPadding(0);
        java.lang.String str6 = helpFormatter0.rtrim("hi!");
        helpFormatter0.defaultOptPrefix = "-";
        helpFormatter0.setNewLine("                                                                                                 ");
        java.lang.String str11 = helpFormatter0.defaultArgName;
        java.lang.String str12 = helpFormatter0.getNewLine();
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(" ", "arg", options15, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arg" + "'", str11, "arg");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                 " + "'", str12, "                                                                                                 ");
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        java.lang.String str2 = helpFormatter0.defaultNewLine;
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        int int4 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLongOptPrefix("                                   ");
        int int10 = helpFormatter0.findWrapPos("                                   ", (-1), 1);
        helpFormatter0.defaultArgName = "   ";
        helpFormatter0.defaultOptPrefix = "-";
        java.lang.String str15 = helpFormatter0.defaultNewLine;
        java.io.PrintWriter printWriter16 = null;
        org.apache.commons.cli.Options options19 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter16, 47, "", options19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setArgName("usage:");
        int int13 = helpFormatter0.defaultWidth;
        int int14 = helpFormatter0.getWidth();
        java.lang.String str15 = helpFormatter0.getArgName();
        helpFormatter0.setNewLine("          ");
        helpFormatter0.defaultSyntaxPrefix = "          ";
        java.lang.String str20 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = 0;
        int int23 = helpFormatter0.getDescPadding();
        java.lang.String str24 = helpFormatter0.getSyntaxPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "usage:" + "'", str15, "usage:");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-" + "'", str20, "-");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "          " + "'", str24, "          ");
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setLongOptPrefix("hi!");
        java.lang.String str4 = helpFormatter0.rtrim("hi!");
        java.lang.String str5 = helpFormatter0.getArgName();
        helpFormatter0.setLeftPadding((int) (byte) -1);
        helpFormatter0.setDescPadding((int) (short) 0);
        java.lang.String str10 = helpFormatter0.defaultArgName;
        int int11 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arg" + "'", str10, "arg");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setNewLine("hi!");
        int int9 = helpFormatter0.defaultLeftPad;
        helpFormatter0.defaultArgName = "                                ";
        helpFormatter0.setNewLine("-");
        java.lang.String str14 = helpFormatter0.getArgName();
        java.lang.String str16 = helpFormatter0.createPadding((int) 'a');
        int int20 = helpFormatter0.findWrapPos("                                               ", (int) '4', (-1));
        int int21 = helpFormatter0.getLeftPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                " + "'", str14, "                                ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                                 " + "'", str16, "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setArgName("usage:");
        helpFormatter0.setDescPadding(3);
        helpFormatter0.setLongOptPrefix("                                                                          ");
        helpFormatter0.defaultLeftPad = (byte) 10;
        helpFormatter0.defaultDescPad = '4';
        helpFormatter0.setDescPadding((-1));
        helpFormatter0.setOptPrefix("arg");
        java.lang.String str25 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLeftPad = (byte) 1;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "arg" + "'", str25, "arg");
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        java.lang.String str4 = helpFormatter0.defaultNewLine;
        helpFormatter0.setDescPadding((int) (short) 1);
        helpFormatter0.defaultLeftPad = (short) -1;
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.cli.Options options11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = helpFormatter0.renderOptions(stringBuffer9, 15, options11, (-1), 74);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str10 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.defaultSyntaxPrefix = "                                                                                                    ";
        java.lang.String str13 = helpFormatter0.defaultOptPrefix;
        int int14 = helpFormatter0.getLeftPadding();
        java.lang.String str15 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-" + "'", str13, "-");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 74 + "'", int14 == 74);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str4 = helpFormatter0.createPadding(0);
        java.lang.String str6 = helpFormatter0.rtrim("hi!");
        helpFormatter0.defaultOptPrefix = "-";
        helpFormatter0.setLongOptPrefix("usage: ");
        int int11 = helpFormatter0.defaultDescPad;
        java.lang.String str13 = helpFormatter0.createPadding((int) (short) 0);
        helpFormatter0.setNewLine("--");
        java.lang.String str16 = helpFormatter0.getSyntaxPrefix();
        java.io.PrintWriter printWriter17 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printWrapped(printWriter17, (int) (short) 10, "                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "usage: " + "'", str16, "usage: ");
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setLongOptPrefix("hi!");
        java.lang.String str4 = helpFormatter0.rtrim("hi!");
        java.lang.String str5 = helpFormatter0.getArgName();
        helpFormatter0.defaultNewLine = "--";
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.defaultSyntaxPrefix = "\n";
        helpFormatter0.setWidth(0);
        helpFormatter0.defaultNewLine = "-";
        int int16 = helpFormatter0.defaultWidth;
        int int17 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        helpFormatter0.setDescPadding(1);
        int int6 = helpFormatter0.getDescPadding();
        helpFormatter0.setSyntaxPrefix("   ");
        java.lang.String str10 = helpFormatter0.rtrim(" ");
        helpFormatter0.defaultSyntaxPrefix = "                ";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.setLongOptPrefix("hi!");
        java.lang.String str4 = helpFormatter0.rtrim("hi!");
        java.lang.String str5 = helpFormatter0.defaultArgName;
        helpFormatter0.defaultLongOptPrefix = "";
        org.apache.commons.cli.Options options10 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("  ", "usage:", options10, "                ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arg" + "'", str5, "arg");
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLongOptPrefix = "";
        int int4 = helpFormatter0.getWidth();
        java.lang.String str5 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.setOptPrefix("                                                                                                 ");
        java.lang.String str8 = helpFormatter0.getOptPrefix();
        java.lang.String str9 = helpFormatter0.getLongOptPrefix();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 74 + "'", int4 == 74);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-" + "'", str5, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                 " + "'", str8, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        helpFormatter0.setArgName("             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setSyntaxPrefix("");
        helpFormatter0.defaultWidth = 13;
        helpFormatter0.setWidth(74);
        int int9 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultArgName = "                                   ";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        int int3 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultDescPad = 13;
        helpFormatter0.setSyntaxPrefix("                                                                                                    ");
        int int8 = helpFormatter0.defaultWidth;
        java.io.PrintWriter printWriter9 = null;
        org.apache.commons.cli.Options options13 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(printWriter9, 10, "      ", "                                ", options13, 34, 65, "                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(String)\" because \"pw\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "\n";
        helpFormatter0.defaultDescPad = 0;
        int int9 = helpFormatter0.getWidth();
        int int10 = helpFormatter0.getWidth();
        helpFormatter0.setLeftPadding(45);
        helpFormatter0.defaultArgName = "             ";
        int int15 = helpFormatter0.getDescPadding();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 74 + "'", int10 == 74);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str4 = helpFormatter0.rtrim("                                                                                                 ");
        java.lang.String str6 = helpFormatter0.rtrim("\n");
        helpFormatter0.defaultSyntaxPrefix = "-";
        int int9 = helpFormatter0.getWidth();
        helpFormatter0.setDescPadding(32);
        java.io.PrintWriter printWriter12 = null;
        org.apache.commons.cli.Options options14 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printOptions(printWriter12, (int) (byte) 0, options14, 74, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getWidth();
        helpFormatter0.setNewLine("");
        java.lang.String str4 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 74 + "'", int1 == 74);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--" + "'", str4, "--");
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        int int6 = helpFormatter0.findWrapPos("hi!", (int) (byte) 100, 74);
        int int10 = helpFormatter0.findWrapPos("arg", 74, (-1));
        int int14 = helpFormatter0.findWrapPos("                                                                                                    ", (int) (short) -1, (int) '#');
        java.lang.String str15 = helpFormatter0.defaultArgName;
        helpFormatter0.setOptPrefix("             ");
        java.lang.String str18 = helpFormatter0.defaultOptPrefix;
        org.apache.commons.cli.Options options22 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(100, "                                                                                                    ", " ", options22, "usage: ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arg" + "'", str15, "arg");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "             " + "'", str18, "             ");
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        java.lang.String str3 = helpFormatter0.defaultArgName;
        helpFormatter0.setDescPadding(1);
        int int6 = helpFormatter0.getDescPadding();
        helpFormatter0.setSyntaxPrefix("   ");
        org.apache.commons.cli.Options options12 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp(34, "                                                    ", "                ", options12, "-");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setWidth((int) 'a');
        java.lang.String str6 = helpFormatter0.createPadding(1);
        java.lang.String str7 = helpFormatter0.getOptPrefix();
        java.lang.String str8 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.defaultOptPrefix = " ";
        java.lang.String str11 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "--" + "'", str8, "--");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        java.lang.String str3 = helpFormatter0.getArgName();
        int int4 = helpFormatter0.defaultDescPad;
        java.lang.String str5 = helpFormatter0.getNewLine();
        java.lang.String str6 = helpFormatter0.getNewLine();
        helpFormatter0.defaultDescPad = 0;
        java.lang.String str9 = helpFormatter0.defaultLongOptPrefix;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "arg" + "'", str3, "arg");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "--" + "'", str9, "--");
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        int int4 = helpFormatter0.defaultLeftPad;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        java.lang.String str7 = helpFormatter0.rtrim("hi!");
        helpFormatter0.setOptPrefix("hi!");
        helpFormatter0.defaultDescPad = 100;
        org.apache.commons.cli.Options options15 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp((int) (short) 1, "             ", "arg", options15, "                                  ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        java.lang.String str2 = helpFormatter0.defaultNewLine;
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultOptPrefix = "";
        java.lang.String str6 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        java.lang.String str10 = helpFormatter0.getLongOptPrefix();
        helpFormatter0.setArgName("usage:");
        int int13 = helpFormatter0.defaultWidth;
        java.lang.String str14 = helpFormatter0.getArgName();
        helpFormatter0.defaultLongOptPrefix = "usage: ";
        int int17 = helpFormatter0.getDescPadding();
        java.lang.String str18 = helpFormatter0.getLongOptPrefix();
        java.lang.String str20 = helpFormatter0.rtrim("\n");
        int int21 = helpFormatter0.getWidth();
        helpFormatter0.defaultLeftPad = 53;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--" + "'", str10, "--");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "usage:" + "'", str14, "usage:");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "usage: " + "'", str18, "usage: ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        helpFormatter0.defaultLeftPad = 1;
        java.lang.String str4 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultLongOptPrefix = "\n";
        java.lang.String str7 = helpFormatter0.getNewLine();
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultArgName = "                                                                                                 ";
        helpFormatter0.defaultDescPad = 97;
        java.lang.String str13 = helpFormatter0.defaultArgName;
        java.lang.String str14 = helpFormatter0.getArgName();
        helpFormatter0.setLeftPadding(1);
        java.lang.String str17 = helpFormatter0.defaultLongOptPrefix;
        helpFormatter0.setLeftPadding((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-" + "'", str4, "-");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                                                                                 " + "'", str13, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                                                 " + "'", str14, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        int int2 = helpFormatter0.defaultDescPad;
        helpFormatter0.setLeftPadding((int) (byte) 1);
        int int5 = helpFormatter0.getDescPadding();
        int int6 = helpFormatter0.getWidth();
        java.lang.String str7 = helpFormatter0.defaultOptPrefix;
        int int8 = helpFormatter0.getWidth();
        int int12 = helpFormatter0.findWrapPos("                                                    ", 35, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-" + "'", str7, "-");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 74 + "'", int8 == 74);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        int int2 = helpFormatter0.getWidth();
        helpFormatter0.setDescPadding((int) (short) 1);
        java.lang.String str6 = helpFormatter0.createPadding((int) ' ');
        int int7 = helpFormatter0.getWidth();
        java.lang.String str8 = helpFormatter0.defaultOptPrefix;
        java.lang.String str9 = helpFormatter0.defaultNewLine;
        int int10 = helpFormatter0.defaultDescPad;
        int int14 = helpFormatter0.findWrapPos("", (int) (short) 100, 65);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                " + "'", str6, "                                ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 74 + "'", int7 == 74);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-" + "'", str8, "-");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        java.lang.String str3 = helpFormatter0.defaultLongOptPrefix;
        int int4 = helpFormatter0.getLeftPadding();
        int int5 = helpFormatter0.defaultLeftPad;
        helpFormatter0.setArgName("                                                                          ");
        java.lang.String str8 = helpFormatter0.getSyntaxPrefix();
        helpFormatter0.defaultOptPrefix = "                                ";
        java.lang.String str11 = helpFormatter0.getArgName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "--" + "'", str3, "--");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "usage: " + "'", str8, "usage: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                          " + "'", str11, "                                                                          ");
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        java.lang.String str3 = helpFormatter0.defaultOptPrefix;
        helpFormatter0.defaultWidth = (byte) 1;
        helpFormatter0.setArgName("hi!");
        helpFormatter0.setLeftPadding(74);
        helpFormatter0.setNewLine("");
        helpFormatter0.defaultDescPad = 0;
        helpFormatter0.setWidth(1);
        helpFormatter0.defaultSyntaxPrefix = "";
        java.io.PrintWriter printWriter18 = null;
        org.apache.commons.cli.Options options21 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printUsage(printWriter18, 34, "                ", options21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.getOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-" + "'", str3, "-");
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        java.lang.String str2 = helpFormatter0.getArgName();
        int int3 = helpFormatter0.defaultWidth;
        helpFormatter0.defaultSyntaxPrefix = "   ";
        java.lang.String str7 = helpFormatter0.createPadding(32);
        helpFormatter0.defaultOptPrefix = "\n";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "arg" + "'", str2, "arg");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 74 + "'", int3 == 74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                " + "'", str7, "                                ");
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        int int1 = helpFormatter0.getLeftPadding();
        java.lang.String str2 = helpFormatter0.getNewLine();
        helpFormatter0.setOptPrefix("-");
        java.lang.String str5 = helpFormatter0.getNewLine();
        helpFormatter0.defaultLeftPad = (short) 1;
        helpFormatter0.setDescPadding((int) (short) 0);
        int int10 = helpFormatter0.defaultDescPad;
        java.lang.String str12 = helpFormatter0.rtrim("                                                                 ");
        helpFormatter0.defaultLeftPad = 65;
        java.lang.String str15 = helpFormatter0.getLongOptPrefix();
        java.lang.String str16 = helpFormatter0.defaultNewLine;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--" + "'", str15, "--");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        helpFormatter0.defaultLongOptPrefix = "hi!";
        helpFormatter0.setLeftPadding((int) (short) -1);
        int int8 = helpFormatter0.findWrapPos("", (int) '4', (int) '4');
        helpFormatter0.defaultDescPad = 52;
        java.lang.String str11 = helpFormatter0.getLongOptPrefix();
        java.lang.String str12 = helpFormatter0.defaultOptPrefix;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-" + "'", str12, "-");
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str1 = helpFormatter0.defaultArgName;
        java.lang.String str2 = helpFormatter0.defaultLongOptPrefix;
        org.apache.commons.cli.Options options5 = null;
        // The following exception was thrown during execution in test generation
        try {
            helpFormatter0.printHelp("                                                                          ", "\n", options5, "                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.commons.cli.Options.helpOptions()\" because \"options\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "arg" + "'", str1, "arg");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--" + "'", str2, "--");
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.rtrim("                                ");
        java.lang.String str3 = helpFormatter0.defaultSyntaxPrefix;
        int int4 = helpFormatter0.getLeftPadding();
        helpFormatter0.setLeftPadding(1);
        java.lang.String str7 = helpFormatter0.getNewLine();
        helpFormatter0.defaultOptPrefix = "          ";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "usage: " + "'", str3, "usage: ");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
        org.apache.commons.cli.HelpFormatter helpFormatter0 = new org.apache.commons.cli.HelpFormatter();
        java.lang.String str2 = helpFormatter0.createPadding((int) ' ');
        int int6 = helpFormatter0.findWrapPos("hi!", (int) (short) 10, 34);
        helpFormatter0.setOptPrefix("\n");
        helpFormatter0.setNewLine("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }
}

