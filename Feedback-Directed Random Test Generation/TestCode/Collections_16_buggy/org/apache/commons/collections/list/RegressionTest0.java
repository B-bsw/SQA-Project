package org.apache.commons.collections.list;

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
        java.util.List list0 = null;
        java.util.Set set1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.list.SetUniqueList setUniqueList2 = new org.apache.commons.collections.list.SetUniqueList(list0, set1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Collection must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.util.List list0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.list.SetUniqueList setUniqueList1 = org.apache.commons.collections.list.SetUniqueList.decorate(list0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: List must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        java.util.ListIterator listIterator0 = null;
        java.util.Set set1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.list.SetUniqueList.SetListListIterator setListListIterator2 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator(listIterator0, set1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ListIterator must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        java.util.Iterator iterator0 = null;
        java.util.Set set1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.list.SetUniqueList.SetListIterator setListIterator2 = new org.apache.commons.collections.list.SetUniqueList.SetListIterator(iterator0, set1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Iterator must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

