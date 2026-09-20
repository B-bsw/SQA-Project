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
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        posixParser0.burstToken("hi!", false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        posixParser0.burstToken("hi!", true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        posixParser0.burstToken("hi!", false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        posixParser0.burstToken("hi!", false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        posixParser0.burstToken("hi!", true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        posixParser0.burstToken("hi!", true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        posixParser0.burstToken("hi!", true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        posixParser0.burstToken("hi!", true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        posixParser0.burstToken("hi!", true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        posixParser0.burstToken("hi!", false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        posixParser0.burstToken("hi!", true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        posixParser0.burstToken("hi!", false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        posixParser0.burstToken("", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        posixParser0.burstToken("hi!", true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        posixParser0.burstToken("hi!", false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.apache.commons.cli.PosixParser posixParser0 = new org.apache.commons.cli.PosixParser();
        posixParser0.burstToken("", true);
        posixParser0.burstToken("", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        posixParser0.burstToken("hi!", false);
    }
}

