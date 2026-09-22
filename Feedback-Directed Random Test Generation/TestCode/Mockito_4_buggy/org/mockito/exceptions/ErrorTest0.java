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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) ' ', (int) (byte) 100);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        // during test generation this statement threw an exception of type org.mockito.exceptions.base.MockitoAssertionError in error
        reporter0.wantedAtMostX((int) (short) 10, (int) (short) -1);
    }
}

