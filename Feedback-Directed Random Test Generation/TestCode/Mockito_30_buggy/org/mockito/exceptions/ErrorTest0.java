package org.mockito.exceptions;

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
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(1, 1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(10, (int) (byte) 0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 0, 0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) -1, (int) (short) 10);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((-1), (int) ' ');
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(10, 10);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 0, (int) (byte) -1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) -1, (int) (short) -1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 100, (int) (short) 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(0, (int) (byte) 100);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) -1, (int) (byte) -1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '#', 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 100, 100);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) '#', (-1));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 0, (int) ' ');
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 100, (int) '4');
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX(0, (int) (byte) 1);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 0, (int) (byte) 0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((-1), (int) (short) 0);
    }
}

