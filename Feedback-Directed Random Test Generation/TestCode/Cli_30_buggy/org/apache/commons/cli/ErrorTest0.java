package org.apache.commons.cli;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        boolean boolean1 = defaultParser0.skipParsing;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        defaultParser0.handleConcatenatedOptions("hi!");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        boolean boolean3 = defaultParser0.skipParsing;
        org.apache.commons.cli.Options options4 = defaultParser0.options;
        java.lang.String str5 = defaultParser0.currentToken;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.lang.String str7 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        defaultParser0.handleConcatenatedOptions("hi!");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        defaultParser0.stopAtNonOption = true;
        boolean boolean10 = defaultParser0.skipParsing;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        defaultParser0.handleConcatenatedOptions("hi!");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.util.List list7 = defaultParser0.expectedOpts;
        boolean boolean8 = defaultParser0.skipParsing;
        java.lang.String str9 = defaultParser0.currentToken;
        defaultParser0.currentToken = "";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        defaultParser0.handleConcatenatedOptions("hi!");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        boolean boolean3 = defaultParser0.skipParsing;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        defaultParser0.handleConcatenatedOptions("hi!");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        defaultParser0.currentToken = "hi!";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        defaultParser0.handleConcatenatedOptions("hi!");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.lang.String str7 = defaultParser0.currentToken;
        java.lang.String str8 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        defaultParser0.handleConcatenatedOptions("hi!");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "";
        java.lang.String str6 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        defaultParser0.handleConcatenatedOptions("hi!");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        defaultParser0.skipParsing = true;
        org.apache.commons.cli.CommandLine commandLine7 = defaultParser0.cmd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        defaultParser0.handleConcatenatedOptions("hi!");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        defaultParser0.handleConcatenatedOptions("hi!");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        defaultParser0.currentToken = "hi!";
        org.apache.commons.cli.CommandLine commandLine4 = defaultParser0.cmd;
        boolean boolean5 = defaultParser0.stopAtNonOption;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        defaultParser0.handleConcatenatedOptions("hi!");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        org.apache.commons.cli.Options options7 = defaultParser0.options;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        defaultParser0.handleConcatenatedOptions("hi!");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        defaultParser0.currentToken = "hi!";
        defaultParser0.currentToken = "";
        java.lang.String str6 = defaultParser0.currentToken;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        defaultParser0.handleConcatenatedOptions("hi!");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        boolean boolean6 = defaultParser0.skipParsing;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        defaultParser0.handleConcatenatedOptions("hi!");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        defaultParser0.handleConcatenatedOptions("hi!");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        org.apache.commons.cli.Option option5 = defaultParser0.currentOption;
        java.util.List list6 = defaultParser0.expectedOpts;
        java.lang.String str7 = defaultParser0.currentToken;
        java.lang.String str8 = defaultParser0.currentToken;
        defaultParser0.stopAtNonOption = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        defaultParser0.handleConcatenatedOptions("hi!");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        defaultParser0.skipParsing = true;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        defaultParser0.handleConcatenatedOptions("hi!");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        defaultParser0.skipParsing = false;
        defaultParser0.skipParsing = true;
        boolean boolean7 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        defaultParser0.handleConcatenatedOptions("hi!");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        org.apache.commons.cli.CommandLine commandLine2 = defaultParser0.cmd;
        defaultParser0.currentToken = "";
        org.apache.commons.cli.Options options5 = defaultParser0.options;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        defaultParser0.handleConcatenatedOptions("hi!");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.CommandLine commandLine6 = defaultParser0.cmd;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.CommandLine commandLine8 = defaultParser0.cmd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        defaultParser0.handleConcatenatedOptions("hi!");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        java.lang.String str7 = defaultParser0.currentToken;
        org.apache.commons.cli.Options options8 = defaultParser0.options;
        boolean boolean9 = defaultParser0.stopAtNonOption;
        org.apache.commons.cli.CommandLine commandLine10 = defaultParser0.cmd;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        defaultParser0.handleConcatenatedOptions("hi!");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        defaultParser0.currentToken = "hi!";
        java.util.List list4 = defaultParser0.expectedOpts;
        defaultParser0.currentToken = "";
        java.util.List list7 = defaultParser0.expectedOpts;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        defaultParser0.handleConcatenatedOptions("hi!");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        boolean boolean3 = defaultParser0.skipParsing;
        java.util.List list4 = defaultParser0.expectedOpts;
        defaultParser0.stopAtNonOption = false;
        org.apache.commons.cli.Option option7 = defaultParser0.currentOption;
        defaultParser0.currentToken = "";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        defaultParser0.handleConcatenatedOptions("hi!");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.apache.commons.cli.DefaultParser defaultParser0 = new org.apache.commons.cli.DefaultParser();
        org.apache.commons.cli.Option option1 = defaultParser0.currentOption;
        java.lang.String str2 = defaultParser0.currentToken;
        org.apache.commons.cli.Option option3 = defaultParser0.currentOption;
        defaultParser0.stopAtNonOption = true;
        org.apache.commons.cli.Options options6 = defaultParser0.options;
        defaultParser0.skipParsing = true;
        defaultParser0.skipParsing = true;
        java.lang.String str11 = defaultParser0.currentToken;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        defaultParser0.handleConcatenatedOptions("hi!");
    }
}

