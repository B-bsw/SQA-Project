package org.apache.commons.collections4.map;

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        org.apache.commons.collections4.map.ListOrderedMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = null;
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableListOrderedMapEntry2 = new org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>(strComparableMap0, strComparable1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = strComparableListOrderedMapEntry2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.commons.collections4.map.ListOrderedMap<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>> strComparableAbstractMapEntryMap0 = new org.apache.commons.collections4.map.ListOrderedMap<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>();
        java.util.Set<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>> comparableAbstractMapEntryEntrySet1 = strComparableAbstractMapEntryMap0.entrySet();
        org.apache.commons.collections4.map.ListOrderedMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap3 = null;
        java.lang.Comparable<java.lang.String> strComparable4 = null;
        org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableListOrderedMapEntry5 = new org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>(strComparableMap3, strComparable4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableEntry6 = strComparableAbstractMapEntryMap0.setValue((int) (byte) -1, (java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>) strComparableListOrderedMapEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableAbstractMapEntryEntrySet1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.collections4.map.ListOrderedMap<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>> strComparableAbstractMapEntryMap0 = new org.apache.commons.collections4.map.ListOrderedMap<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>();
        java.util.Set<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>> comparableAbstractMapEntryEntrySet1 = strComparableAbstractMapEntryMap0.entrySet();
        org.apache.commons.collections4.map.ListOrderedMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap2 = null;
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableListOrderedMapEntry4 = new org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>(strComparableMap2, strComparable3);
        org.apache.commons.collections4.map.ListOrderedMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap5 = null;
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableListOrderedMapEntry7 = new org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>(strComparableMap5, strComparable6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableEntry8 = strComparableAbstractMapEntryMap0.putIfAbsent((org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>) strComparableListOrderedMapEntry4, (java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>) strComparableListOrderedMapEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableAbstractMapEntryEntrySet1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.collections4.map.ListOrderedMap<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>> strComparableAbstractMapEntryMap0 = new org.apache.commons.collections4.map.ListOrderedMap<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>();
        java.util.Set<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>> comparableAbstractMapEntryEntrySet1 = strComparableAbstractMapEntryMap0.entrySet();
        org.apache.commons.collections4.map.ListOrderedMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap2 = null;
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableListOrderedMapEntry4 = new org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>(strComparableMap2, strComparable3);
        java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableEntry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableEntry6 = strComparableAbstractMapEntryMap0.putIfAbsent((org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>) strComparableListOrderedMapEntry4, strComparableEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableAbstractMapEntryEntrySet1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.collections4.map.ListOrderedMap<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>> strComparableAbstractMapEntryMap0 = new org.apache.commons.collections4.map.ListOrderedMap<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableAbstractMapEntry2 = strComparableAbstractMapEntryMap0.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.collections4.map.ListOrderedMap<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>> strComparableAbstractMapEntryMap0 = new org.apache.commons.collections4.map.ListOrderedMap<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>();
        java.util.Set<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>> comparableAbstractMapEntryEntrySet1 = strComparableAbstractMapEntryMap0.entrySet();
        java.util.Set<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>> comparableAbstractMapEntryEntrySet2 = strComparableAbstractMapEntryMap0.entrySet();
        org.junit.Assert.assertNotNull(comparableAbstractMapEntryEntrySet1);
        org.junit.Assert.assertNotNull(comparableAbstractMapEntryEntrySet2);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.collections4.map.ListOrderedMap<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>> strComparableAbstractMapEntryMap0 = new org.apache.commons.collections4.map.ListOrderedMap<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>();
        java.util.Set<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>> comparableAbstractMapEntryEntrySet1 = strComparableAbstractMapEntryMap0.entrySet();
        strComparableAbstractMapEntryMap0.clear();
        java.lang.Object obj3 = null;
        org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableAbstractMapEntry4 = strComparableAbstractMapEntryMap0.previousKey(obj3);
        boolean boolean6 = strComparableAbstractMapEntryMap0.equals((java.lang.Object) '4');
        org.apache.commons.collections4.map.ListOrderedMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap7 = null;
        java.lang.Comparable<java.lang.String> strComparable8 = null;
        org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableListOrderedMapEntry9 = new org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>(strComparableMap7, strComparable8);
        org.apache.commons.collections4.map.ListOrderedMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap10 = null;
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableListOrderedMapEntry12 = new org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>(strComparableMap10, strComparable11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableEntry13 = strComparableAbstractMapEntryMap0.put((org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>) strComparableListOrderedMapEntry9, (java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>) strComparableListOrderedMapEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableAbstractMapEntryEntrySet1);
        org.junit.Assert.assertNull(strComparableAbstractMapEntry4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.collections4.map.ListOrderedMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = null;
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableListOrderedMapEntry2 = new org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>(strComparableMap0, strComparable1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable3 = strComparableListOrderedMapEntry2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.collections4.map.ListOrderedMap<java.lang.Object, org.apache.commons.collections4.map.AbstractIterableMap<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>> objMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapIterator<java.lang.Object, org.apache.commons.collections4.map.AbstractIterableMap<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>> objItor1 = new org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapIterator<java.lang.Object, org.apache.commons.collections4.map.AbstractIterableMap<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>>(objMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.collections4.map.ListOrderedMap<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>> strComparableAbstractMapEntryMap0 = new org.apache.commons.collections4.map.ListOrderedMap<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>();
        java.util.Set<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>> comparableAbstractMapEntryEntrySet1 = strComparableAbstractMapEntryMap0.entrySet();
        strComparableAbstractMapEntryMap0.clear();
        java.lang.Object obj3 = null;
        org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableAbstractMapEntry4 = strComparableAbstractMapEntryMap0.previousKey(obj3);
        boolean boolean6 = strComparableAbstractMapEntryMap0.equals((java.lang.Object) '4');
        java.util.Set<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>> comparableAbstractMapEntryEntrySet7 = strComparableAbstractMapEntryMap0.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableEntry9 = strComparableAbstractMapEntryMap0.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableAbstractMapEntryEntrySet1);
        org.junit.Assert.assertNull(strComparableAbstractMapEntry4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(comparableAbstractMapEntryEntrySet7);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.collections4.map.ListOrderedMap<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>> strComparableAbstractMapEntryMap0 = new org.apache.commons.collections4.map.ListOrderedMap<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>();
        java.util.Set<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>> comparableAbstractMapEntryEntrySet1 = strComparableAbstractMapEntryMap0.entrySet();
        strComparableAbstractMapEntryMap0.clear();
        java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableEntry4 = strComparableAbstractMapEntryMap0.get((java.lang.Object) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableAbstractMapEntry5 = strComparableAbstractMapEntryMap0.lastKey();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Map is empty");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableAbstractMapEntryEntrySet1);
        org.junit.Assert.assertNull(strComparableEntry4);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.collections4.map.ListOrderedMap<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>> strComparableAbstractMapEntryMap0 = new org.apache.commons.collections4.map.ListOrderedMap<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>();
        java.util.Set<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>> comparableAbstractMapEntryEntrySet1 = strComparableAbstractMapEntryMap0.entrySet();
        strComparableAbstractMapEntryMap0.clear();
        java.lang.Object obj3 = null;
        org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableAbstractMapEntry4 = strComparableAbstractMapEntryMap0.previousKey(obj3);
        org.apache.commons.collections4.map.ListOrderedMap<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>> strComparableAbstractMapEntryMap5 = new org.apache.commons.collections4.map.ListOrderedMap<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>((java.util.Map<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>) strComparableAbstractMapEntryMap0);
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>> strComparableAbstractMapEntryItor6 = strComparableAbstractMapEntryMap5.mapIterator();
        org.junit.Assert.assertNotNull(comparableAbstractMapEntryEntrySet1);
        org.junit.Assert.assertNull(strComparableAbstractMapEntry4);
        org.junit.Assert.assertNotNull(strComparableAbstractMapEntryItor6);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.collections4.map.ListOrderedMap<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>> strComparableAbstractMapEntryMap0 = new org.apache.commons.collections4.map.ListOrderedMap<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>();
        java.util.Set<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>> comparableAbstractMapEntryEntrySet1 = strComparableAbstractMapEntryMap0.entrySet();
        strComparableAbstractMapEntryMap0.clear();
        java.lang.Object obj3 = null;
        org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableAbstractMapEntry4 = strComparableAbstractMapEntryMap0.previousKey(obj3);
        java.util.Set<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>> strComparableAbstractMapEntrySet5 = strComparableAbstractMapEntryMap0.keySet();
        org.junit.Assert.assertNotNull(comparableAbstractMapEntryEntrySet1);
        org.junit.Assert.assertNull(strComparableAbstractMapEntry4);
        org.junit.Assert.assertNotNull(strComparableAbstractMapEntrySet5);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.collections4.map.ListOrderedMap<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>> strComparableAbstractMapEntryMap0 = new org.apache.commons.collections4.map.ListOrderedMap<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>();
        java.lang.String str1 = strComparableAbstractMapEntryMap0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{}" + "'", str1, "{}");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.collections4.map.ListOrderedMap<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>> strComparableAbstractMapEntryMap0 = new org.apache.commons.collections4.map.ListOrderedMap<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>();
        java.util.Set<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>> comparableAbstractMapEntryEntrySet1 = strComparableAbstractMapEntryMap0.entrySet();
        strComparableAbstractMapEntryMap0.clear();
        java.lang.Object obj3 = null;
        org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableAbstractMapEntry4 = strComparableAbstractMapEntryMap0.previousKey(obj3);
        boolean boolean6 = strComparableAbstractMapEntryMap0.equals((java.lang.Object) '4');
        java.lang.String str7 = strComparableAbstractMapEntryMap0.toString();
        java.util.List<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>> strComparableAbstractMapEntryList8 = strComparableAbstractMapEntryMap0.keyList();
        java.lang.Class<?> wildcardClass9 = strComparableAbstractMapEntryMap0.getClass();
        org.junit.Assert.assertNotNull(comparableAbstractMapEntryEntrySet1);
        org.junit.Assert.assertNull(strComparableAbstractMapEntry4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{}" + "'", str7, "{}");
        org.junit.Assert.assertNotNull(strComparableAbstractMapEntryList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.collections4.map.ListOrderedMap<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>> strComparableAbstractMapEntryMap0 = new org.apache.commons.collections4.map.ListOrderedMap<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>();
        java.util.Set<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>> comparableAbstractMapEntryEntrySet1 = strComparableAbstractMapEntryMap0.entrySet();
        strComparableAbstractMapEntryMap0.clear();
        java.lang.Object obj3 = null;
        org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableAbstractMapEntry4 = strComparableAbstractMapEntryMap0.previousKey(obj3);
        boolean boolean6 = strComparableAbstractMapEntryMap0.equals((java.lang.Object) '4');
        java.util.Set<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>> comparableAbstractMapEntryEntrySet7 = strComparableAbstractMapEntryMap0.entrySet();
        java.util.List<java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>> strComparableEntryList8 = strComparableAbstractMapEntryMap0.valueList();
        java.util.Spliterator<java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>> strComparableEntrySpliterator9 = strComparableEntryList8.spliterator();
        org.junit.Assert.assertNotNull(comparableAbstractMapEntryEntrySet1);
        org.junit.Assert.assertNull(strComparableAbstractMapEntry4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(comparableAbstractMapEntryEntrySet7);
        org.junit.Assert.assertNotNull(strComparableEntryList8);
        org.junit.Assert.assertNotNull(strComparableEntrySpliterator9);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.util.LinkedHashSet<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>> comparableAbstractMapEntryEntrySet0 = new java.util.LinkedHashSet<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>>();
        java.util.LinkedHashSet<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>> comparableAbstractMapEntryEntrySet1 = new java.util.LinkedHashSet<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>>();
        java.util.Spliterator<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>> comparableAbstractMapEntryEntrySpliterator2 = comparableAbstractMapEntryEntrySet1.spliterator();
        boolean boolean3 = comparableAbstractMapEntryEntrySet0.removeAll((java.util.Collection<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>>) comparableAbstractMapEntryEntrySet1);
        java.util.ArrayList<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>> comparableAbstractMapEntryEntryList4 = new java.util.ArrayList<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>>();
        boolean boolean5 = comparableAbstractMapEntryEntrySet1.containsAll((java.util.Collection<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>>) comparableAbstractMapEntryEntryList4);
        org.junit.Assert.assertNotNull(comparableAbstractMapEntryEntrySpliterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.collections4.map.ListOrderedMap<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>> strComparableAbstractMapEntryMap0 = new org.apache.commons.collections4.map.ListOrderedMap<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>();
        java.util.Set<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>> comparableAbstractMapEntryEntrySet1 = strComparableAbstractMapEntryMap0.entrySet();
        strComparableAbstractMapEntryMap0.clear();
        java.lang.Object obj3 = null;
        org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableAbstractMapEntry4 = strComparableAbstractMapEntryMap0.previousKey(obj3);
        boolean boolean6 = strComparableAbstractMapEntryMap0.equals((java.lang.Object) '4');
        java.util.Set<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>> comparableAbstractMapEntryEntrySet7 = strComparableAbstractMapEntryMap0.entrySet();
        java.util.List<java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>> strComparableEntryList8 = strComparableAbstractMapEntryMap0.valueList();
        org.apache.commons.collections4.map.ListOrderedMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap10 = null;
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableListOrderedMapEntry12 = new org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>(strComparableMap10, strComparable11);
        org.apache.commons.collections4.map.ListOrderedMap<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap13 = null;
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableListOrderedMapEntry15 = new org.apache.commons.collections4.map.ListOrderedMap.ListOrderedMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>(strComparableMap13, strComparable14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableEntry16 = strComparableAbstractMapEntryMap0.put((-1), (org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>) strComparableListOrderedMapEntry12, (java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>) strComparableListOrderedMapEntry15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableAbstractMapEntryEntrySet1);
        org.junit.Assert.assertNull(strComparableAbstractMapEntry4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(comparableAbstractMapEntryEntrySet7);
        org.junit.Assert.assertNotNull(strComparableEntryList8);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.util.LinkedHashSet<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>> comparableAbstractMapEntryEntrySet0 = new java.util.LinkedHashSet<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>>();
        java.util.LinkedHashSet<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>> comparableAbstractMapEntryEntrySet1 = new java.util.LinkedHashSet<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>>();
        java.util.Spliterator<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>> comparableAbstractMapEntryEntrySpliterator2 = comparableAbstractMapEntryEntrySet1.spliterator();
        boolean boolean3 = comparableAbstractMapEntryEntrySet0.removeAll((java.util.Collection<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>>) comparableAbstractMapEntryEntrySet1);
        java.util.stream.Stream<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>> comparableAbstractMapEntryEntryStream4 = comparableAbstractMapEntryEntrySet1.stream();
        org.junit.Assert.assertNotNull(comparableAbstractMapEntryEntrySpliterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(comparableAbstractMapEntryEntryStream4);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.util.LinkedHashSet<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>> comparableAbstractMapEntryEntrySet0 = new java.util.LinkedHashSet<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>>();
        java.util.LinkedHashSet<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>> comparableAbstractMapEntryEntrySet1 = new java.util.LinkedHashSet<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>>();
        java.util.Spliterator<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>> comparableAbstractMapEntryEntrySpliterator2 = comparableAbstractMapEntryEntrySet1.spliterator();
        boolean boolean3 = comparableAbstractMapEntryEntrySet0.removeAll((java.util.Collection<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>>) comparableAbstractMapEntryEntrySet1);
        boolean boolean5 = comparableAbstractMapEntryEntrySet0.remove((java.lang.Object) (byte) 100);
        org.junit.Assert.assertNotNull(comparableAbstractMapEntryEntrySpliterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.util.LinkedHashSet<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>> comparableAbstractMapEntryEntrySet0 = new java.util.LinkedHashSet<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>>();
        java.util.LinkedHashSet<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>> comparableAbstractMapEntryEntrySet1 = new java.util.LinkedHashSet<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>>();
        java.util.Spliterator<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>> comparableAbstractMapEntryEntrySpliterator2 = comparableAbstractMapEntryEntrySet1.spliterator();
        boolean boolean3 = comparableAbstractMapEntryEntrySet0.removeAll((java.util.Collection<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>>) comparableAbstractMapEntryEntrySet1);
        java.lang.String str4 = comparableAbstractMapEntryEntrySet1.toString();
        boolean boolean6 = comparableAbstractMapEntryEntrySet1.equals((java.lang.Object) (-1L));
        org.junit.Assert.assertNotNull(comparableAbstractMapEntryEntrySpliterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.collections4.map.ListOrderedMap<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>> strComparableAbstractMapEntryMap0 = new org.apache.commons.collections4.map.ListOrderedMap<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>();
        java.util.Set<java.util.Map.Entry<org.apache.commons.collections4.keyvalue.AbstractMapEntry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>> comparableAbstractMapEntryEntrySet1 = strComparableAbstractMapEntryMap0.entrySet();
        strComparableAbstractMapEntryMap0.clear();
        java.util.Map.Entry<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableEntry4 = strComparableAbstractMapEntryMap0.get((java.lang.Object) 1);
        strComparableAbstractMapEntryMap0.clear();
        org.junit.Assert.assertNotNull(comparableAbstractMapEntryEntrySet1);
        org.junit.Assert.assertNull(strComparableEntry4);
    }
}

