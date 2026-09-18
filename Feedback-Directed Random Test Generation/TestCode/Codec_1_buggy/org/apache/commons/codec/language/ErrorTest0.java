package org.apache.commons.codec.language;

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
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", 10);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        char char9 = doubleMetaphone0.charAt("H", (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("", "AA11111111");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", 10);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        doubleMetaphone0.setMaxCodeLen((int) (byte) 1);
        int int9 = doubleMetaphone0.maxCodeLen;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = doubleMetaphone0.isDoubleMetaphoneEqual("", "HI", true);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        char char3 = doubleMetaphone0.charAt("hi!", 10);
        java.lang.String str6 = doubleMetaphone0.doubleMetaphone("", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("", "1111111111");
    }
}

