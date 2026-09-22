package org.apache.commons.collections.map;

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
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator1 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator1.equals(keySetIterator1)", keySetIterator1.equals(keySetIterator1));
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = null;
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator1 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator1.equals(valuesIterator1)", valuesIterator1.equals(valuesIterator1));
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator2 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator2.equals(keySetIterator2)", keySetIterator2.equals(keySetIterator2));
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap1 = flat3Map0.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map.ValuesIterator valuesIterator2 = new org.apache.commons.collections.map.Flat3Map.ValuesIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: valuesIterator2.equals(valuesIterator2)", valuesIterator2.equals(valuesIterator2));
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = null;
        org.apache.commons.collections.map.Flat3Map.KeySetIterator keySetIterator1 = new org.apache.commons.collections.map.Flat3Map.KeySetIterator(flat3Map0);
        org.junit.Assert.assertTrue("Contract failed: keySetIterator1.equals(keySetIterator1)", keySetIterator1.equals(keySetIterator1));
    }
}

