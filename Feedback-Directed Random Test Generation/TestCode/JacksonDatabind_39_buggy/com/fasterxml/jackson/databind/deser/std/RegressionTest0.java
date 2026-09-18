package com.fasterxml.jackson.databind.deser.std;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
            System.out.format("%n%s%n", "RegressionTest0.test1");
        com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer nullifyingDeserializer0 = com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.instance;
        com.fasterxml.jackson.databind.deser.impl.ObjectIdReader objectIdReader1 = nullifyingDeserializer0.getObjectIdReader();
        org.junit.Assert.assertNotNull(nullifyingDeserializer0);
        org.junit.Assert.assertNull(objectIdReader1);
    }
}

