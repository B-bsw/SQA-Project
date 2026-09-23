package com.google.gson.internal.bind;

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
        com.google.gson.internal.ObjectConstructor<java.lang.Comparable<java.lang.String>> strComparableObjectConstructor0 = null;
        java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> strMap1 = null;
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<java.lang.Comparable<java.lang.String>> strComparableAdapter2 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<java.lang.Comparable<java.lang.String>>(strComparableObjectConstructor0, strMap1);
        com.google.gson.JsonElement jsonElement3 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableAdapter2.fromJsonTree(jsonElement3);
    }
}

