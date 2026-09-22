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
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = doubleMetaphone0.isDoubleMetaphoneEqual("", "hi!");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        doubleMetaphone0.setMaxCodeLen((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = doubleMetaphone0.isDoubleMetaphoneEqual("", "H");
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("hi!");
        boolean boolean9 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = doubleMetaphone0.isDoubleMetaphoneEqual("", "");
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        org.apache.commons.codec.language.DoubleMetaphone doubleMetaphone0 = new org.apache.commons.codec.language.DoubleMetaphone();
        java.lang.String str3 = doubleMetaphone0.doubleMetaphone("hi!", false);
        java.lang.String str5 = doubleMetaphone0.doubleMetaphone("hi!");
        java.lang.String str7 = doubleMetaphone0.doubleMetaphone("");
        boolean boolean11 = doubleMetaphone0.isDoubleMetaphoneEqual("H", "hi!", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = doubleMetaphone0.isDoubleMetaphoneEqual("", "");
    }
}

