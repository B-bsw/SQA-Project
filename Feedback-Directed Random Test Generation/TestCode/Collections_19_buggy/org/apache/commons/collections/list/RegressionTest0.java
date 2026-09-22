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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.util.ListIterator<java.lang.Comparable<java.lang.String>> strComparableItor0 = null;
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet2 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableSet2.add((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.lang.Comparable<java.lang.String>>(strComparableItor0, (java.util.Set<java.lang.Comparable<java.lang.String>>) strComparableSet2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ListIterator must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor0 = null;
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.list.SetUniqueList.SetListIterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = new org.apache.commons.collections.list.SetUniqueList.SetListIterator<java.lang.Comparable<java.lang.String>>(strComparableItor0, (java.util.Set<java.lang.Comparable<java.lang.String>>) strComparableSet3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Iterator must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList19 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList19, serializableArray18);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet34 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet34, serializableArray33);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList36 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList19, (java.util.Set<java.io.Serializable>) serializableSet34);
        boolean boolean38 = serializableList36.remove((java.lang.Object) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable40 = serializableList36.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 18");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(serializableArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList19 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList19, serializableArray18);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet34 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet34, serializableArray33);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList36 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList19, (java.util.Set<java.io.Serializable>) serializableSet34);
        boolean boolean38 = serializableList36.remove((java.lang.Object) (-1));
        serializableList36.add((int) (byte) -1, (java.io.Serializable) 0.0f);
        java.io.Serializable[] serializableArray60 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList61 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList61, serializableArray60);
        java.io.Serializable[] serializableArray75 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet76 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet76, serializableArray75);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList78 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList61, (java.util.Set<java.io.Serializable>) serializableSet76);
        boolean boolean79 = serializableList36.add((java.io.Serializable) serializableList78);
        java.lang.Object[] objArray80 = serializableList78.toArray();
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(serializableArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(serializableArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(serializableArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[1.0, 100, 100, 10, 0, 1.0, 10, 100.0, -1, 10, , -1.0, -1.0, 100, 0, 100, 0.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[1.0, 100, 100, 10, 0, 1.0, 10, 100.0, -1, 10, , -1.0, -1.0, 100, 0, 100, 0.0, 0.0]");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList19 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList19, serializableArray18);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet34 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet34, serializableArray33);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList36 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList19, (java.util.Set<java.io.Serializable>) serializableSet34);
        boolean boolean38 = serializableList36.remove((java.lang.Object) (-1));
        serializableList36.add((int) (byte) -1, (java.io.Serializable) 0.0f);
        java.io.Serializable[] serializableArray60 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList61 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList61, serializableArray60);
        java.io.Serializable[] serializableArray75 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet76 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet76, serializableArray75);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList78 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList61, (java.util.Set<java.io.Serializable>) serializableSet76);
        boolean boolean79 = serializableList36.add((java.io.Serializable) serializableList78);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.io.Serializable> serializableList82 = serializableList78.subList(0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(serializableArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(serializableArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(serializableArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList19 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList19, serializableArray18);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet34 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet34, serializableArray33);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList36 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList19, (java.util.Set<java.io.Serializable>) serializableSet34);
        boolean boolean38 = serializableList36.remove((java.lang.Object) 1.0d);
        boolean boolean40 = serializableList36.remove((java.lang.Object) 18);
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(serializableArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList19 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList19, serializableArray18);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet34 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet34, serializableArray33);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList36 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList19, (java.util.Set<java.io.Serializable>) serializableSet34);
        boolean boolean38 = serializableList36.remove((java.lang.Object) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.io.Serializable> serializableItor40 = serializableList36.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(serializableArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList19 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList19, serializableArray18);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet34 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet34, serializableArray33);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList36 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList19, (java.util.Set<java.io.Serializable>) serializableSet34);
        boolean boolean38 = serializableList36.contains((java.lang.Object) 0.0d);
        int int39 = serializableList36.size();
        serializableList36.clear();
        java.io.Serializable[] serializableArray60 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList61 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList61, serializableArray60);
        java.io.Serializable[] serializableArray75 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet76 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet76, serializableArray75);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList78 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList61, (java.util.Set<java.io.Serializable>) serializableSet76);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean79 = serializableList36.addAll((int) (short) 10, (java.util.Collection<java.io.Serializable>) serializableList78);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(serializableArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 18 + "'", int39 == 18);
        org.junit.Assert.assertNotNull(serializableArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(serializableArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList19 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList19, serializableArray18);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet34 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet34, serializableArray33);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList36 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList19, (java.util.Set<java.io.Serializable>) serializableSet34);
        boolean boolean38 = serializableList36.remove((java.lang.Object) (-1));
        java.io.Serializable[] serializableArray57 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList58 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList58, serializableArray57);
        java.io.Serializable[] serializableArray72 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet73 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet73, serializableArray72);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList75 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList58, (java.util.Set<java.io.Serializable>) serializableSet73);
        boolean boolean77 = serializableList75.contains((java.lang.Object) 0.0d);
        boolean boolean78 = serializableList36.containsAll((java.util.Collection<java.io.Serializable>) serializableList75);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator79 = serializableList36.spliterator();
        java.util.stream.Stream<java.io.Serializable> serializableStream80 = serializableList36.parallelStream();
        java.util.Set<java.io.Serializable> serializableSet81 = serializableList36.set;
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(serializableArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(serializableArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(serializableArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(serializableSpliterator79);
        org.junit.Assert.assertNotNull(serializableStream80);
        org.junit.Assert.assertNotNull(serializableSet81);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList19 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList19, serializableArray18);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet34 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet34, serializableArray33);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList36 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList19, (java.util.Set<java.io.Serializable>) serializableSet34);
        boolean boolean38 = serializableList36.contains((java.lang.Object) 0.0d);
        java.util.ListIterator<java.io.Serializable> serializableItor40 = serializableList36.listIterator((int) (byte) 1);
        java.io.Serializable[] serializableArray59 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList60 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList60, serializableArray59);
        java.io.Serializable[] serializableArray74 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet75 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet75, serializableArray74);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList77 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList60, (java.util.Set<java.io.Serializable>) serializableSet75);
        boolean boolean79 = serializableList77.contains((java.lang.Object) 0.0d);
        boolean boolean80 = serializableList36.removeAll((java.util.Collection<java.io.Serializable>) serializableList77);
        boolean boolean82 = serializableList36.add((java.io.Serializable) 0.0d);
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(serializableArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(serializableItor40);
        org.junit.Assert.assertNotNull(serializableArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(serializableArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList19 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList19, serializableArray18);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet34 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet34, serializableArray33);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList36 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList19, (java.util.Set<java.io.Serializable>) serializableSet34);
        boolean boolean38 = serializableList36.remove((java.lang.Object) (-1));
        java.io.Serializable[] serializableArray57 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList58 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList58, serializableArray57);
        java.io.Serializable[] serializableArray72 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet73 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet73, serializableArray72);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList75 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList58, (java.util.Set<java.io.Serializable>) serializableSet73);
        boolean boolean77 = serializableList75.contains((java.lang.Object) 0.0d);
        boolean boolean78 = serializableList36.containsAll((java.util.Collection<java.io.Serializable>) serializableList75);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator79 = serializableList36.spliterator();
        boolean boolean81 = serializableList36.contains((java.lang.Object) 10.0f);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList36.spliterator();
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(serializableArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(serializableArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(serializableArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(serializableSpliterator79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator82);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList19 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList19, serializableArray18);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet34 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet34, serializableArray33);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList36 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList19, (java.util.Set<java.io.Serializable>) serializableSet34);
        boolean boolean38 = serializableList36.remove((java.lang.Object) (-1));
        java.io.Serializable[] serializableArray57 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList58 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList58, serializableArray57);
        java.io.Serializable[] serializableArray72 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet73 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet73, serializableArray72);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList75 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList58, (java.util.Set<java.io.Serializable>) serializableSet73);
        boolean boolean77 = serializableList75.contains((java.lang.Object) 0.0d);
        boolean boolean78 = serializableList36.containsAll((java.util.Collection<java.io.Serializable>) serializableList75);
        java.lang.Object[] objArray79 = serializableList36.toArray();
        java.lang.Object obj80 = null;
        int int81 = serializableList36.lastIndexOf(obj80);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator82 = serializableList36.spliterator();
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(serializableArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(serializableArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(serializableArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[1.0, 100, 100, 10, 0, 1.0, 10, 100.0, -1, 10, , -1.0, -1.0, 100, 0, 100, 0.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[1.0, 100, 100, 10, 0, 1.0, 10, 100.0, -1, 10, , -1.0, -1.0, 100, 0, 100, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(serializableSpliterator82);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList19 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList19, serializableArray18);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet34 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet34, serializableArray33);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList36 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList19, (java.util.Set<java.io.Serializable>) serializableSet34);
        boolean boolean38 = serializableList36.remove((java.lang.Object) (-1));
        java.io.Serializable[] serializableArray57 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList58 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList58, serializableArray57);
        java.io.Serializable[] serializableArray72 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet73 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet73, serializableArray72);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList75 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList58, (java.util.Set<java.io.Serializable>) serializableSet73);
        boolean boolean77 = serializableList75.contains((java.lang.Object) 0.0d);
        boolean boolean78 = serializableList36.containsAll((java.util.Collection<java.io.Serializable>) serializableList75);
        java.lang.Object[] objArray79 = serializableList36.toArray();
        boolean boolean81 = serializableList36.contains((java.lang.Object) 100.0d);
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(serializableArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(serializableArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(serializableArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[1.0, 100, 100, 10, 0, 1.0, 10, 100.0, -1, 10, , -1.0, -1.0, 100, 0, 100, 0.0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[1.0, 100, 100, 10, 0, 1.0, 10, 100.0, -1, 10, , -1.0, -1.0, 100, 0, 100, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList19 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList19, serializableArray18);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet34 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet34, serializableArray33);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList36 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList19, (java.util.Set<java.io.Serializable>) serializableSet34);
        boolean boolean38 = serializableList36.contains((java.lang.Object) 0.0d);
        java.util.ListIterator<java.io.Serializable> serializableItor40 = serializableList36.listIterator((int) (byte) 1);
        java.util.function.UnaryOperator<java.io.Serializable> serializableUnaryOperator41 = null;
        // The following exception was thrown during execution in test generation
        try {
            serializableList36.replaceAll(serializableUnaryOperator41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(serializableArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(serializableItor40);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList19 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList19, serializableArray18);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet34 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet34, serializableArray33);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList36 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList19, (java.util.Set<java.io.Serializable>) serializableSet34);
        boolean boolean38 = serializableList36.contains((java.lang.Object) 0.0d);
        java.util.ListIterator<java.io.Serializable> serializableItor40 = serializableList36.listIterator((int) (byte) 1);
        java.io.Serializable[] serializableArray59 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList60 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList60, serializableArray59);
        java.io.Serializable[] serializableArray74 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet75 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet75, serializableArray74);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList77 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList60, (java.util.Set<java.io.Serializable>) serializableSet75);
        boolean boolean79 = serializableList77.contains((java.lang.Object) 0.0d);
        boolean boolean80 = serializableList36.removeAll((java.util.Collection<java.io.Serializable>) serializableList77);
        java.util.ListIterator<java.io.Serializable> serializableItor81 = serializableList77.listIterator();
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(serializableArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(serializableItor40);
        org.junit.Assert.assertNotNull(serializableArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(serializableArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(serializableItor81);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList19 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList19, serializableArray18);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet34 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet34, serializableArray33);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList36 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList19, (java.util.Set<java.io.Serializable>) serializableSet34);
        boolean boolean38 = serializableList36.contains((java.lang.Object) 0.0d);
        int int39 = serializableList36.size();
        int int40 = serializableList36.size();
        java.util.Iterator<java.io.Serializable> serializableItor41 = serializableList36.iterator();
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(serializableArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 18 + "'", int39 == 18);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 18 + "'", int40 == 18);
        org.junit.Assert.assertNotNull(serializableItor41);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList19 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList19, serializableArray18);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet34 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet34, serializableArray33);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList36 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList19, (java.util.Set<java.io.Serializable>) serializableSet34);
        boolean boolean38 = serializableList36.remove((java.lang.Object) 1.0d);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList39 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList36);
        java.lang.String str40 = serializableList36.toString();
        java.io.Serializable[] serializableArray59 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList60 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList60, serializableArray59);
        java.io.Serializable[] serializableArray74 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet75 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet75, serializableArray74);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList77 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList60, (java.util.Set<java.io.Serializable>) serializableSet75);
        boolean boolean79 = serializableList77.contains((java.lang.Object) 0.0d);
        java.util.ListIterator<java.io.Serializable> serializableItor81 = serializableList77.listIterator((int) (byte) 1);
        serializableList77.clear();
        boolean boolean83 = serializableList36.contains((java.lang.Object) serializableList77);
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(serializableArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(serializableList39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[1.0, 100, 100, 10, 0, 100.0, -1, , -1.0, 100, 0, 0.0]" + "'", str40, "[1.0, 100, 100, 10, 0, 100.0, -1, , -1.0, 100, 0, 0.0]");
        org.junit.Assert.assertNotNull(serializableArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(serializableArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(serializableItor81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.util.ListIterator<java.util.ArrayList<java.io.Serializable>> serializableListItor0 = null;
        java.io.Serializable[] serializableArray19 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList20 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList20, serializableArray19);
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet35 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet35, serializableArray34);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList37 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList20, (java.util.Set<java.io.Serializable>) serializableSet35);
        java.util.LinkedHashSet<java.util.ArrayList<java.io.Serializable>> serializableListSet38 = new java.util.LinkedHashSet<java.util.ArrayList<java.io.Serializable>>();
        boolean boolean39 = serializableListSet38.add(serializableList20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.util.ArrayList<java.io.Serializable>> serializableListItor40 = new org.apache.commons.collections.list.SetUniqueList.SetListListIterator<java.util.ArrayList<java.io.Serializable>>(serializableListItor0, (java.util.Set<java.util.ArrayList<java.io.Serializable>>) serializableListSet38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ListIterator must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(serializableArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList19 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList19, serializableArray18);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet34 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet34, serializableArray33);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList36 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList19, (java.util.Set<java.io.Serializable>) serializableSet34);
        boolean boolean38 = serializableList36.remove((java.lang.Object) (-1));
        java.io.Serializable[] serializableArray57 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList58 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList58, serializableArray57);
        java.io.Serializable[] serializableArray72 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet73 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet73, serializableArray72);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList75 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList58, (java.util.Set<java.io.Serializable>) serializableSet73);
        boolean boolean77 = serializableList75.contains((java.lang.Object) 0.0d);
        boolean boolean78 = serializableList36.containsAll((java.util.Collection<java.io.Serializable>) serializableList75);
        java.lang.Object obj79 = null;
        boolean boolean80 = serializableList75.equals(obj79);
        java.util.ListIterator<java.io.Serializable> serializableItor81 = serializableList75.listIterator();
        java.util.stream.Stream<java.io.Serializable> serializableStream82 = serializableList75.parallelStream();
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(serializableArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(serializableArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(serializableArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(serializableItor81);
        org.junit.Assert.assertNotNull(serializableStream82);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.util.Iterator<java.util.HashSet<java.io.Serializable>> serializableSetItor0 = null;
        java.io.Serializable[] serializableArray19 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList20 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList20, serializableArray19);
        java.io.Serializable[] serializableArray34 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet35 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet35, serializableArray34);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList37 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList20, (java.util.Set<java.io.Serializable>) serializableSet35);
        java.util.LinkedHashSet<java.util.HashSet<java.io.Serializable>> serializableSetSet38 = new java.util.LinkedHashSet<java.util.HashSet<java.io.Serializable>>();
        boolean boolean39 = serializableSetSet38.add((java.util.HashSet<java.io.Serializable>) serializableSet35);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.list.SetUniqueList.SetListIterator<java.util.HashSet<java.io.Serializable>> serializableSetItor40 = new org.apache.commons.collections.list.SetUniqueList.SetListIterator<java.util.HashSet<java.io.Serializable>>(serializableSetItor0, (java.util.Set<java.util.HashSet<java.io.Serializable>>) serializableSetSet38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Iterator must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(serializableArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList19 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList19, serializableArray18);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet34 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet34, serializableArray33);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList36 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList19, (java.util.Set<java.io.Serializable>) serializableSet34);
        boolean boolean38 = serializableList36.contains((java.lang.Object) 0.0d);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList39 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList36);
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(serializableArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(serializableList39);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList19 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList19, serializableArray18);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet34 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet34, serializableArray33);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList36 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList19, (java.util.Set<java.io.Serializable>) serializableSet34);
        boolean boolean38 = serializableList36.remove((java.lang.Object) 1.0d);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList39 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList36);
        java.lang.Object[] objArray40 = serializableList39.toArray();
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(serializableArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(serializableList39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[1.0, 100, 100, 10, 0, 100.0, -1, , -1.0, 100, 0, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[1.0, 100, 100, 10, 0, 100.0, -1, , -1.0, 100, 0, 0.0]");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList19 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList19, serializableArray18);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet34 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet34, serializableArray33);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList36 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList19, (java.util.Set<java.io.Serializable>) serializableSet34);
        boolean boolean38 = serializableList36.contains((java.lang.Object) 0.0d);
        int int39 = serializableList36.size();
        serializableList36.clear();
        java.io.Serializable[] serializableArray60 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList61 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList61, serializableArray60);
        java.io.Serializable[] serializableArray75 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet76 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet76, serializableArray75);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList78 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList61, (java.util.Set<java.io.Serializable>) serializableSet76);
        boolean boolean80 = serializableList78.contains((java.lang.Object) 0.0d);
        int int81 = serializableList78.size();
        serializableList78.clear();
        serializableList78.clear();
        java.util.Set<java.io.Serializable> serializableSet84 = serializableList78.set;
        boolean boolean85 = serializableList78.isEmpty();
        boolean boolean86 = serializableList36.addAll((int) (short) 0, (java.util.Collection<java.io.Serializable>) serializableList78);
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(serializableArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 18 + "'", int39 == 18);
        org.junit.Assert.assertNotNull(serializableArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(serializableArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 18 + "'", int81 == 18);
        org.junit.Assert.assertNotNull(serializableSet84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList19 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList19, serializableArray18);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet34 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet34, serializableArray33);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList36 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList19, (java.util.Set<java.io.Serializable>) serializableSet34);
        boolean boolean38 = serializableList36.remove((java.lang.Object) (-1));
        java.io.Serializable[] serializableArray57 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList58 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList58, serializableArray57);
        java.io.Serializable[] serializableArray72 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet73 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet73, serializableArray72);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList75 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList58, (java.util.Set<java.io.Serializable>) serializableSet73);
        boolean boolean77 = serializableList75.contains((java.lang.Object) 0.0d);
        boolean boolean78 = serializableList36.containsAll((java.util.Collection<java.io.Serializable>) serializableList75);
        boolean boolean80 = serializableList36.add((java.io.Serializable) 10L);
        java.util.ListIterator<java.io.Serializable> serializableItor81 = serializableList36.listIterator();
        int int82 = serializableList36.size();
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(serializableArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(serializableArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(serializableArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(serializableItor81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 18 + "'", int82 == 18);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList19 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList19, serializableArray18);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet34 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet34, serializableArray33);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList36 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList19, (java.util.Set<java.io.Serializable>) serializableSet34);
        boolean boolean38 = serializableList36.remove((java.lang.Object) (-1));
        java.io.Serializable[] serializableArray57 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList58 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList58, serializableArray57);
        java.io.Serializable[] serializableArray72 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet73 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet73, serializableArray72);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList75 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList58, (java.util.Set<java.io.Serializable>) serializableSet73);
        boolean boolean77 = serializableList75.contains((java.lang.Object) 0.0d);
        boolean boolean78 = serializableList36.containsAll((java.util.Collection<java.io.Serializable>) serializableList75);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator79 = serializableList36.spliterator();
        java.lang.CharSequence[] charSequenceArray83 = new java.lang.CharSequence[] { "hi!", "hi!", "[1.0, 100, 100, 10, 0, 100.0, -1, , -1.0, 100, 0, 0.0]" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence[] charSequenceArray84 = serializableList36.toArray(charSequenceArray83);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(serializableArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(serializableArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(serializableArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(serializableSpliterator79);
        org.junit.Assert.assertNotNull(charSequenceArray83);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList19 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList19, serializableArray18);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet34 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet34, serializableArray33);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList36 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList19, (java.util.Set<java.io.Serializable>) serializableSet34);
        boolean boolean38 = serializableList36.remove((java.lang.Object) (-1));
        java.util.Spliterator<java.io.Serializable> serializableSpliterator39 = serializableList36.spliterator();
        java.io.Serializable serializable42 = serializableList36.set((int) (byte) 1, (java.io.Serializable) (-1.0f));
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(serializableArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(serializableSpliterator39);
        org.junit.Assert.assertEquals("'" + serializable42 + "' != '" + (byte) 100 + "'", serializable42, (byte) 100);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.util.Iterator<java.lang.CharSequence> charSequenceItor0 = null;
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "hi!" };
        java.util.LinkedHashSet<java.lang.CharSequence> charSequenceSet4 = new java.util.LinkedHashSet<java.lang.CharSequence>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceSet4, charSequenceArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.list.SetUniqueList.SetListIterator<java.lang.CharSequence> charSequenceItor6 = new org.apache.commons.collections.list.SetUniqueList.SetListIterator<java.lang.CharSequence>(charSequenceItor0, (java.util.Set<java.lang.CharSequence>) charSequenceSet4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Iterator must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList19 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList19, serializableArray18);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet34 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet34, serializableArray33);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList36 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList19, (java.util.Set<java.io.Serializable>) serializableSet34);
        boolean boolean38 = serializableList36.contains((java.lang.Object) 0.0d);
        java.util.ListIterator<java.io.Serializable> serializableItor40 = serializableList36.listIterator((int) (byte) 1);
        java.io.Serializable[] serializableArray59 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList60 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList60, serializableArray59);
        java.io.Serializable[] serializableArray74 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet75 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet75, serializableArray74);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList77 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList60, (java.util.Set<java.io.Serializable>) serializableSet75);
        boolean boolean79 = serializableList77.contains((java.lang.Object) 0.0d);
        boolean boolean80 = serializableList36.removeAll((java.util.Collection<java.io.Serializable>) serializableList77);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable82 = serializableList77.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 18");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(serializableArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(serializableItor40);
        org.junit.Assert.assertNotNull(serializableArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(serializableArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList19 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList19, serializableArray18);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet34 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet34, serializableArray33);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList36 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList19, (java.util.Set<java.io.Serializable>) serializableSet34);
        boolean boolean38 = serializableList36.contains((java.lang.Object) 0.0d);
        java.util.ListIterator<java.io.Serializable> serializableItor40 = serializableList36.listIterator((int) (byte) 1);
        java.io.Serializable[] serializableArray59 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList60 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList60, serializableArray59);
        java.io.Serializable[] serializableArray74 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet75 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet75, serializableArray74);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList77 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList60, (java.util.Set<java.io.Serializable>) serializableSet75);
        boolean boolean79 = serializableList77.contains((java.lang.Object) 0.0d);
        int int80 = serializableList77.size();
        serializableList77.clear();
        boolean boolean82 = serializableList36.remove((java.lang.Object) serializableList77);
        boolean boolean83 = serializableList36.isEmpty();
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(serializableArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(serializableItor40);
        org.junit.Assert.assertNotNull(serializableArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(serializableArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 18 + "'", int80 == 18);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList19 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList19, serializableArray18);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet34 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet34, serializableArray33);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList36 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList19, (java.util.Set<java.io.Serializable>) serializableSet34);
        boolean boolean38 = serializableList36.remove((java.lang.Object) 1.0d);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList39 = org.apache.commons.collections.list.SetUniqueList.setUniqueList((java.util.List<java.io.Serializable>) serializableList36);
        serializableList39.clear();
        java.util.Set<java.io.Serializable> serializableSet41 = serializableList39.set;
        java.util.Set<java.io.Serializable> serializableSet42 = serializableList39.set;
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(serializableArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(serializableList39);
        org.junit.Assert.assertNotNull(serializableSet41);
        org.junit.Assert.assertNotNull(serializableSet42);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList19 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList19, serializableArray18);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet34 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet34, serializableArray33);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList36 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList19, (java.util.Set<java.io.Serializable>) serializableSet34);
        boolean boolean38 = serializableList36.contains((java.lang.Object) 0.0d);
        int int39 = serializableList36.size();
        serializableList36.clear();
        serializableList36.clear();
        java.io.Serializable[] serializableArray60 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList61 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList61, serializableArray60);
        java.io.Serializable[] serializableArray75 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet76 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet76, serializableArray75);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList78 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList61, (java.util.Set<java.io.Serializable>) serializableSet76);
        boolean boolean80 = serializableList78.contains((java.lang.Object) 0.0d);
        int int81 = serializableList78.size();
        int int82 = serializableList78.size();
        int int83 = serializableList36.indexOf((java.lang.Object) serializableList78);
        java.util.stream.Stream<java.io.Serializable> serializableStream84 = serializableList36.parallelStream();
        java.util.Set<java.io.Serializable> serializableSet85 = serializableList36.asSet();
        java.lang.String[] strArray87 = new java.lang.String[] { "[1.0, 100, 100, 10, 0, 100.0, -1, , -1.0, 100, 0, 0.0]" };
        java.lang.String[] strArray88 = serializableList36.toArray(strArray87);
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(serializableArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 18 + "'", int39 == 18);
        org.junit.Assert.assertNotNull(serializableArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(serializableArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 18 + "'", int81 == 18);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 18 + "'", int82 == 18);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(serializableStream84);
        org.junit.Assert.assertNotNull(serializableSet85);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertArrayEquals(strArray88, new java.lang.String[] { null });
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        java.io.Serializable[] serializableArray18 = new java.io.Serializable[] { 1.0d, (byte) 100, (short) 100, (short) 10, (byte) 0, 1.0d, (short) 10, 100.0f, (-1L), (short) 10, "", (-1.0f), (-1.0f), 100, 0L, 100, 0.0f, 0.0f };
        java.util.ArrayList<java.io.Serializable> serializableList19 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList19, serializableArray18);
        java.io.Serializable[] serializableArray33 = new java.io.Serializable[] { 100.0f, 0.0d, 10.0f, 0, (short) -1, false, 0.0f, 100.0d, 10L, (short) 0, 100L, "hi!" };
        java.util.LinkedHashSet<java.io.Serializable> serializableSet34 = new java.util.LinkedHashSet<java.io.Serializable>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet34, serializableArray33);
        org.apache.commons.collections.list.SetUniqueList<java.io.Serializable> serializableList36 = new org.apache.commons.collections.list.SetUniqueList<java.io.Serializable>((java.util.List<java.io.Serializable>) serializableList19, (java.util.Set<java.io.Serializable>) serializableSet34);
        boolean boolean38 = serializableList36.contains((java.lang.Object) 0.0d);
        int int39 = serializableList36.size();
        serializableList36.clear();
        serializableList36.clear();
        java.util.Set<java.io.Serializable> serializableSet42 = serializableList36.set;
        java.lang.Class<?> wildcardClass43 = serializableList36.getClass();
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(serializableArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 18 + "'", int39 == 18);
        org.junit.Assert.assertNotNull(serializableSet42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }
}

