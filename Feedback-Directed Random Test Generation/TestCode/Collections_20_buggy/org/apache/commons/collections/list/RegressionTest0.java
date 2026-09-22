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
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList0 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.util.function.UnaryOperator<java.io.Serializable> serializableUnaryOperator1 = null;
        // The following exception was thrown during execution in test generation
        try {
            serializableList0.replaceAll(serializableUnaryOperator1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList0 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Class<?> wildcardClass1 = serializableList0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.io.Serializable[] serializableArray32 = new java.io.Serializable[] { (-1L), (short) -1, 1.0f, 100.0d, '4', "hi!", 100.0f, (short) 1, (byte) 100, 100L, (byte) 10, ' ', 100.0f, 0.0d, (byte) 10, 100.0f, (byte) 0, 10.0d, (short) -1, 100.0f, 1.0f, 100, (byte) 100, 10.0d, 1.0d, (short) 100, 10L, 10, (short) -1, (byte) 0, 1, 0 };
        java.util.ArrayList<java.io.Serializable> serializableList33 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList33, serializableArray32);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.io.Serializable> serializableList37 = serializableList33.subList((int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: fromIndex = -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList12 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Class<?> wildcardClass13 = serializableList12.getClass();
        java.io.Serializable[] serializableArray35 = new java.io.Serializable[] { 'a', 0L, "", '#', (short) 1, (-1), (short) 100, (byte) 0, 'a', 1.0f, (short) 0, 10L, wildcardClass13, (-1.0d), (short) 100, (short) 0, (byte) -1, 100.0f, 100, (byte) -1, false, (short) 10, "", (-1.0d), "", 1, 1.0d, (-1.0d), true, '4', (-1), (-1), 1.0f, (byte) 0 };
        java.util.ArrayList<java.io.Serializable> serializableList36 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList36, serializableArray35);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList39 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Class<?> wildcardClass40 = serializableList39.getClass();
        java.io.Serializable[] serializableArray43 = new java.io.Serializable[] { (short) 100, wildcardClass40, (byte) 1, (byte) 0 };
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList44, serializableArray43);
        boolean boolean46 = serializableList36.removeAll((java.util.Collection<java.io.Serializable>) serializableList44);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator47 = serializableList44.spliterator();
        boolean boolean49 = serializableList44.add((java.io.Serializable) true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(serializableArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(serializableArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList12 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Class<?> wildcardClass13 = serializableList12.getClass();
        java.io.Serializable[] serializableArray35 = new java.io.Serializable[] { 'a', 0L, "", '#', (short) 1, (-1), (short) 100, (byte) 0, 'a', 1.0f, (short) 0, 10L, wildcardClass13, (-1.0d), (short) 100, (short) 0, (byte) -1, 100.0f, 100, (byte) -1, false, (short) 10, "", (-1.0d), "", 1, 1.0d, (-1.0d), true, '4', (-1), (-1), 1.0f, (byte) 0 };
        java.util.ArrayList<java.io.Serializable> serializableList36 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList36, serializableArray35);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList39 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Class<?> wildcardClass40 = serializableList39.getClass();
        java.io.Serializable[] serializableArray43 = new java.io.Serializable[] { (short) 100, wildcardClass40, (byte) 1, (byte) 0 };
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList44, serializableArray43);
        boolean boolean46 = serializableList36.removeAll((java.util.Collection<java.io.Serializable>) serializableList44);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList59 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Class<?> wildcardClass60 = serializableList59.getClass();
        java.io.Serializable[] serializableArray82 = new java.io.Serializable[] { 'a', 0L, "", '#', (short) 1, (-1), (short) 100, (byte) 0, 'a', 1.0f, (short) 0, 10L, wildcardClass60, (-1.0d), (short) 100, (short) 0, (byte) -1, 100.0f, 100, (byte) -1, false, (short) 10, "", (-1.0d), "", 1, 1.0d, (-1.0d), true, '4', (-1), (-1), 1.0f, (byte) 0 };
        java.util.ArrayList<java.io.Serializable> serializableList83 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList83, serializableArray82);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList86 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Class<?> wildcardClass87 = serializableList86.getClass();
        java.io.Serializable[] serializableArray90 = new java.io.Serializable[] { (short) 100, wildcardClass87, (byte) 1, (byte) 0 };
        java.util.ArrayList<java.io.Serializable> serializableList91 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList91, serializableArray90);
        boolean boolean93 = serializableList83.removeAll((java.util.Collection<java.io.Serializable>) serializableList91);
        boolean boolean94 = serializableList36.retainAll((java.util.Collection<java.io.Serializable>) serializableList83);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList96 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean97 = serializableList83.addAll((int) '4', (java.util.Collection<java.io.Serializable>) serializableList96);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 29");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(serializableArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(serializableArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(serializableArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(wildcardClass87);
        org.junit.Assert.assertNotNull(serializableArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList12 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Class<?> wildcardClass13 = serializableList12.getClass();
        java.io.Serializable[] serializableArray35 = new java.io.Serializable[] { 'a', 0L, "", '#', (short) 1, (-1), (short) 100, (byte) 0, 'a', 1.0f, (short) 0, 10L, wildcardClass13, (-1.0d), (short) 100, (short) 0, (byte) -1, 100.0f, 100, (byte) -1, false, (short) 10, "", (-1.0d), "", 1, 1.0d, (-1.0d), true, '4', (-1), (-1), 1.0f, (byte) 0 };
        java.util.ArrayList<java.io.Serializable> serializableList36 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList36, serializableArray35);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList39 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Class<?> wildcardClass40 = serializableList39.getClass();
        java.io.Serializable[] serializableArray43 = new java.io.Serializable[] { (short) 100, wildcardClass40, (byte) 1, (byte) 0 };
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList44, serializableArray43);
        boolean boolean46 = serializableList36.removeAll((java.util.Collection<java.io.Serializable>) serializableList44);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.io.Serializable> serializableList49 = serializableList36.subList((int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(52) > toIndex(10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(serializableArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(serializableArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList12 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Class<?> wildcardClass13 = serializableList12.getClass();
        java.io.Serializable[] serializableArray35 = new java.io.Serializable[] { 'a', 0L, "", '#', (short) 1, (-1), (short) 100, (byte) 0, 'a', 1.0f, (short) 0, 10L, wildcardClass13, (-1.0d), (short) 100, (short) 0, (byte) -1, 100.0f, 100, (byte) -1, false, (short) 10, "", (-1.0d), "", 1, 1.0d, (-1.0d), true, '4', (-1), (-1), 1.0f, (byte) 0 };
        java.util.ArrayList<java.io.Serializable> serializableList36 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList36, serializableArray35);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList39 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Class<?> wildcardClass40 = serializableList39.getClass();
        java.io.Serializable[] serializableArray43 = new java.io.Serializable[] { (short) 100, wildcardClass40, (byte) 1, (byte) 0 };
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList44, serializableArray43);
        boolean boolean46 = serializableList36.removeAll((java.util.Collection<java.io.Serializable>) serializableList44);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList48 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean50 = serializableList48.equals((java.lang.Object) (short) -1);
        serializableList48.clear();
        boolean boolean52 = serializableList48.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList53 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean54 = serializableList48.containsAll((java.util.Collection<java.io.Serializable>) serializableList53);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator55 = serializableList53.spliterator();
        boolean boolean56 = serializableList44.addAll((int) (short) 1, (java.util.Collection<java.io.Serializable>) serializableList53);
        boolean boolean58 = serializableList44.remove((java.lang.Object) (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(serializableArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(serializableArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList0 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean2 = serializableList0.equals((java.lang.Object) (short) -1);
        serializableList0.clear();
        boolean boolean4 = serializableList0.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList5 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean6 = serializableList0.containsAll((java.util.Collection<java.io.Serializable>) serializableList5);
        java.util.function.UnaryOperator<java.io.Serializable> serializableUnaryOperator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            serializableList0.replaceAll(serializableUnaryOperator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList0 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean2 = serializableList0.equals((java.lang.Object) (short) -1);
        serializableList0.clear();
        boolean boolean4 = serializableList0.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList5 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean6 = serializableList0.containsAll((java.util.Collection<java.io.Serializable>) serializableList5);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList7 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean9 = serializableList7.equals((java.lang.Object) (short) -1);
        int int11 = serializableList7.indexOf((java.lang.Object) false);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList12 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList13 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Object[] objArray14 = serializableList13.toArray();
        boolean boolean15 = serializableList13.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList16 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean18 = serializableList16.equals((java.lang.Object) (short) -1);
        int int20 = serializableList16.indexOf((java.lang.Object) false);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList21 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Object[] objArray22 = serializableList21.toArray();
        boolean boolean23 = serializableList21.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList24 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean26 = serializableList24.equals((java.lang.Object) (short) -1);
        serializableList24.clear();
        boolean boolean28 = serializableList24.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList29 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean30 = serializableList24.containsAll((java.util.Collection<java.io.Serializable>) serializableList29);
        org.apache.commons.collections.list.TreeList<java.util.AbstractList<java.io.Serializable>> serializableListList31 = new org.apache.commons.collections.list.TreeList<java.util.AbstractList<java.io.Serializable>>();
        boolean boolean32 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList0);
        boolean boolean33 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList7);
        boolean boolean34 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList12);
        boolean boolean35 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList13);
        boolean boolean36 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList16);
        boolean boolean37 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList21);
        boolean boolean38 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList29);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.util.AbstractList<java.io.Serializable>> serializableListItor40 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.util.AbstractList<java.io.Serializable>>(serializableListList31, 0);
        int int41 = serializableListItor40.nextIndex;
        serializableListItor40.checkModCount();
        serializableListItor40.nextIndex = (-1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertArrayEquals(objArray22, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList0 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Object[] objArray1 = serializableList0.toArray();
        boolean boolean2 = serializableList0.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList3 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean5 = serializableList3.equals((java.lang.Object) (short) -1);
        boolean boolean6 = serializableList0.containsAll((java.util.Collection<java.io.Serializable>) serializableList3);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList0 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.String str1 = serializableList0.toString();
        java.util.Collection<java.io.Serializable> serializableCollection2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = serializableList0.retainAll(serializableCollection2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList0 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean2 = serializableList0.equals((java.lang.Object) (short) -1);
        int int4 = serializableList0.indexOf((java.lang.Object) false);
        java.util.stream.Stream<java.io.Serializable> serializableStream5 = serializableList0.stream();
        java.util.stream.Stream<java.io.Serializable> serializableStream6 = serializableList0.stream();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(serializableStream5);
        org.junit.Assert.assertNotNull(serializableStream6);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList0 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean2 = serializableList0.equals((java.lang.Object) (short) -1);
        serializableList0.clear();
        boolean boolean4 = serializableList0.isEmpty();
        int int5 = serializableList0.size();
        // The following exception was thrown during execution in test generation
        try {
            serializableList0.add((int) (short) 1, (java.io.Serializable) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:1, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList0 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean2 = serializableList0.equals((java.lang.Object) (short) -1);
        serializableList0.clear();
        boolean boolean4 = serializableList0.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList5 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean6 = serializableList0.containsAll((java.util.Collection<java.io.Serializable>) serializableList5);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList7 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean9 = serializableList7.equals((java.lang.Object) (short) -1);
        int int11 = serializableList7.indexOf((java.lang.Object) false);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList12 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList13 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Object[] objArray14 = serializableList13.toArray();
        boolean boolean15 = serializableList13.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList16 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean18 = serializableList16.equals((java.lang.Object) (short) -1);
        int int20 = serializableList16.indexOf((java.lang.Object) false);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList21 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Object[] objArray22 = serializableList21.toArray();
        boolean boolean23 = serializableList21.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList24 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean26 = serializableList24.equals((java.lang.Object) (short) -1);
        serializableList24.clear();
        boolean boolean28 = serializableList24.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList29 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean30 = serializableList24.containsAll((java.util.Collection<java.io.Serializable>) serializableList29);
        org.apache.commons.collections.list.TreeList<java.util.AbstractList<java.io.Serializable>> serializableListList31 = new org.apache.commons.collections.list.TreeList<java.util.AbstractList<java.io.Serializable>>();
        boolean boolean32 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList0);
        boolean boolean33 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList7);
        boolean boolean34 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList12);
        boolean boolean35 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList13);
        boolean boolean36 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList16);
        boolean boolean37 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList21);
        boolean boolean38 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList29);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.util.AbstractList<java.io.Serializable>> serializableListItor40 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.util.AbstractList<java.io.Serializable>>(serializableListList31, 0);
        int int41 = serializableListItor40.nextIndex;
        serializableListItor40.checkModCount();
        // The following exception was thrown during execution in test generation
        try {
            java.util.AbstractList<java.io.Serializable> serializableList43 = serializableListItor40.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Already at start of list.");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertArrayEquals(objArray22, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList0 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean2 = serializableList0.equals((java.lang.Object) (short) -1);
        serializableList0.clear();
        boolean boolean4 = serializableList0.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList5 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean6 = serializableList0.containsAll((java.util.Collection<java.io.Serializable>) serializableList5);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList7 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean9 = serializableList7.equals((java.lang.Object) (short) -1);
        int int11 = serializableList7.indexOf((java.lang.Object) false);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList12 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList13 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Object[] objArray14 = serializableList13.toArray();
        boolean boolean15 = serializableList13.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList16 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean18 = serializableList16.equals((java.lang.Object) (short) -1);
        int int20 = serializableList16.indexOf((java.lang.Object) false);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList21 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Object[] objArray22 = serializableList21.toArray();
        boolean boolean23 = serializableList21.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList24 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean26 = serializableList24.equals((java.lang.Object) (short) -1);
        serializableList24.clear();
        boolean boolean28 = serializableList24.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList29 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean30 = serializableList24.containsAll((java.util.Collection<java.io.Serializable>) serializableList29);
        org.apache.commons.collections.list.TreeList<java.util.AbstractList<java.io.Serializable>> serializableListList31 = new org.apache.commons.collections.list.TreeList<java.util.AbstractList<java.io.Serializable>>();
        boolean boolean32 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList0);
        boolean boolean33 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList7);
        boolean boolean34 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList12);
        boolean boolean35 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList13);
        boolean boolean36 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList16);
        boolean boolean37 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList21);
        boolean boolean38 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList29);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.util.AbstractList<java.io.Serializable>> serializableListItor40 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.util.AbstractList<java.io.Serializable>>(serializableListList31, 0);
        org.apache.commons.collections.list.TreeList.AVLNode<java.util.AbstractList<java.io.Serializable>> serializableListAVLNode41 = null;
        serializableListItor40.next = serializableListAVLNode41;
        org.apache.commons.collections.list.TreeList<java.util.AbstractList<java.io.Serializable>> serializableListList43 = serializableListItor40.parent;
        serializableListItor40.currentIndex = 100;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertArrayEquals(objArray22, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(serializableListList43);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList0 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean2 = serializableList0.contains((java.lang.Object) 1.0d);
        java.lang.Object[] objArray3 = serializableList0.toArray();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList4 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Object[] objArray5 = serializableList4.toArray();
        boolean boolean6 = serializableList4.isEmpty();
        int int7 = serializableList0.lastIndexOf((java.lang.Object) serializableList4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertArrayEquals(objArray3, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList0 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean2 = serializableList0.equals((java.lang.Object) (short) -1);
        serializableList0.clear();
        boolean boolean4 = serializableList0.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList5 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean6 = serializableList0.containsAll((java.util.Collection<java.io.Serializable>) serializableList5);
        int int8 = serializableList0.indexOf((java.lang.Object) (byte) -1);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList9 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.io.Serializable> serializableList12 = serializableList9.subList((int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(1) > toIndex(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList0 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean2 = serializableList0.equals((java.lang.Object) (short) -1);
        serializableList0.clear();
        boolean boolean4 = serializableList0.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList5 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean6 = serializableList0.containsAll((java.util.Collection<java.io.Serializable>) serializableList5);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList7 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean9 = serializableList7.equals((java.lang.Object) (short) -1);
        int int11 = serializableList7.indexOf((java.lang.Object) false);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList12 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList13 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Object[] objArray14 = serializableList13.toArray();
        boolean boolean15 = serializableList13.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList16 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean18 = serializableList16.equals((java.lang.Object) (short) -1);
        int int20 = serializableList16.indexOf((java.lang.Object) false);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList21 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Object[] objArray22 = serializableList21.toArray();
        boolean boolean23 = serializableList21.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList24 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean26 = serializableList24.equals((java.lang.Object) (short) -1);
        serializableList24.clear();
        boolean boolean28 = serializableList24.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList29 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean30 = serializableList24.containsAll((java.util.Collection<java.io.Serializable>) serializableList29);
        org.apache.commons.collections.list.TreeList<java.util.AbstractList<java.io.Serializable>> serializableListList31 = new org.apache.commons.collections.list.TreeList<java.util.AbstractList<java.io.Serializable>>();
        boolean boolean32 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList0);
        boolean boolean33 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList7);
        boolean boolean34 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList12);
        boolean boolean35 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList13);
        boolean boolean36 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList16);
        boolean boolean37 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList21);
        boolean boolean38 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList29);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.util.AbstractList<java.io.Serializable>> serializableListItor40 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.util.AbstractList<java.io.Serializable>>(serializableListList31, 0);
        int int41 = serializableListItor40.nextIndex;
        java.util.AbstractList<java.io.Serializable> serializableList42 = serializableListItor40.next();
        serializableListItor40.checkModCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertArrayEquals(objArray22, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(serializableList42);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList0 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Object[] objArray1 = serializableList0.toArray();
        boolean boolean2 = serializableList0.isEmpty();
        int int3 = serializableList0.size();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertArrayEquals(objArray1, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList0 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList1 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean3 = serializableList1.equals((java.lang.Object) (short) -1);
        boolean boolean4 = serializableList0.retainAll((java.util.Collection<java.io.Serializable>) serializableList1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList0 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean2 = serializableList0.equals((java.lang.Object) (short) -1);
        serializableList0.clear();
        boolean boolean4 = serializableList0.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList5 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean6 = serializableList0.containsAll((java.util.Collection<java.io.Serializable>) serializableList5);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList7 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean9 = serializableList7.equals((java.lang.Object) (short) -1);
        int int11 = serializableList7.indexOf((java.lang.Object) false);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList12 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList13 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Object[] objArray14 = serializableList13.toArray();
        boolean boolean15 = serializableList13.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList16 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean18 = serializableList16.equals((java.lang.Object) (short) -1);
        int int20 = serializableList16.indexOf((java.lang.Object) false);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList21 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Object[] objArray22 = serializableList21.toArray();
        boolean boolean23 = serializableList21.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList24 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean26 = serializableList24.equals((java.lang.Object) (short) -1);
        serializableList24.clear();
        boolean boolean28 = serializableList24.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList29 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean30 = serializableList24.containsAll((java.util.Collection<java.io.Serializable>) serializableList29);
        org.apache.commons.collections.list.TreeList<java.util.AbstractList<java.io.Serializable>> serializableListList31 = new org.apache.commons.collections.list.TreeList<java.util.AbstractList<java.io.Serializable>>();
        boolean boolean32 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList0);
        boolean boolean33 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList7);
        boolean boolean34 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList12);
        boolean boolean35 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList13);
        boolean boolean36 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList16);
        boolean boolean37 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList21);
        boolean boolean38 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList29);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.util.AbstractList<java.io.Serializable>> serializableListItor40 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.util.AbstractList<java.io.Serializable>>(serializableListList31, 0);
        org.apache.commons.collections.list.TreeList.AVLNode<java.util.AbstractList<java.io.Serializable>> serializableListAVLNode41 = null;
        serializableListItor40.next = serializableListAVLNode41;
        org.apache.commons.collections.list.TreeList<java.util.AbstractList<java.io.Serializable>> serializableListList43 = serializableListItor40.parent;
        serializableListItor40.expectedModCount = (byte) 0;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertArrayEquals(objArray22, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(serializableListList43);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList0 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean2 = serializableList0.equals((java.lang.Object) (short) -1);
        serializableList0.clear();
        boolean boolean4 = serializableList0.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList5 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean6 = serializableList0.containsAll((java.util.Collection<java.io.Serializable>) serializableList5);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList7 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean9 = serializableList7.equals((java.lang.Object) (short) -1);
        int int11 = serializableList7.indexOf((java.lang.Object) false);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList12 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList13 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Object[] objArray14 = serializableList13.toArray();
        boolean boolean15 = serializableList13.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList16 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean18 = serializableList16.equals((java.lang.Object) (short) -1);
        int int20 = serializableList16.indexOf((java.lang.Object) false);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList21 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Object[] objArray22 = serializableList21.toArray();
        boolean boolean23 = serializableList21.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList24 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean26 = serializableList24.equals((java.lang.Object) (short) -1);
        serializableList24.clear();
        boolean boolean28 = serializableList24.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList29 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean30 = serializableList24.containsAll((java.util.Collection<java.io.Serializable>) serializableList29);
        org.apache.commons.collections.list.TreeList<java.util.AbstractList<java.io.Serializable>> serializableListList31 = new org.apache.commons.collections.list.TreeList<java.util.AbstractList<java.io.Serializable>>();
        boolean boolean32 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList0);
        boolean boolean33 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList7);
        boolean boolean34 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList12);
        boolean boolean35 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList13);
        boolean boolean36 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList16);
        boolean boolean37 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList21);
        boolean boolean38 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList29);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.util.AbstractList<java.io.Serializable>> serializableListItor40 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.util.AbstractList<java.io.Serializable>>(serializableListList31, 0);
        org.apache.commons.collections.list.TreeList.AVLNode<java.util.AbstractList<java.io.Serializable>> serializableListAVLNode41 = null;
        serializableListItor40.next = serializableListAVLNode41;
        boolean boolean43 = serializableListItor40.hasPrevious();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertArrayEquals(objArray22, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList0 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean2 = serializableList0.equals((java.lang.Object) (short) -1);
        serializableList0.clear();
        boolean boolean4 = serializableList0.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList5 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean6 = serializableList0.containsAll((java.util.Collection<java.io.Serializable>) serializableList5);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList7 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean9 = serializableList7.equals((java.lang.Object) (short) -1);
        int int11 = serializableList7.indexOf((java.lang.Object) false);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList12 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList13 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Object[] objArray14 = serializableList13.toArray();
        boolean boolean15 = serializableList13.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList16 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean18 = serializableList16.equals((java.lang.Object) (short) -1);
        int int20 = serializableList16.indexOf((java.lang.Object) false);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList21 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Object[] objArray22 = serializableList21.toArray();
        boolean boolean23 = serializableList21.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList24 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean26 = serializableList24.equals((java.lang.Object) (short) -1);
        serializableList24.clear();
        boolean boolean28 = serializableList24.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList29 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean30 = serializableList24.containsAll((java.util.Collection<java.io.Serializable>) serializableList29);
        org.apache.commons.collections.list.TreeList<java.util.AbstractList<java.io.Serializable>> serializableListList31 = new org.apache.commons.collections.list.TreeList<java.util.AbstractList<java.io.Serializable>>();
        boolean boolean32 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList0);
        boolean boolean33 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList7);
        boolean boolean34 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList12);
        boolean boolean35 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList13);
        boolean boolean36 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList16);
        boolean boolean37 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList21);
        boolean boolean38 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList29);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.util.AbstractList<java.io.Serializable>> serializableListItor40 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.util.AbstractList<java.io.Serializable>>(serializableListList31, 0);
        org.apache.commons.collections.list.TreeList.AVLNode<java.util.AbstractList<java.io.Serializable>> serializableListAVLNode41 = null;
        serializableListItor40.next = serializableListAVLNode41;
        int int43 = serializableListItor40.currentIndex;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertArrayEquals(objArray22, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList0 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean2 = serializableList0.equals((java.lang.Object) (short) -1);
        serializableList0.clear();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList4 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean6 = serializableList4.equals((java.lang.Object) (short) -1);
        serializableList4.clear();
        boolean boolean8 = serializableList4.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList9 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean10 = serializableList4.containsAll((java.util.Collection<java.io.Serializable>) serializableList9);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator11 = serializableList9.spliterator();
        boolean boolean12 = serializableList9.isEmpty();
        boolean boolean13 = serializableList0.addAll((java.util.Collection<java.io.Serializable>) serializableList9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.io.Serializable> serializableItor15 = serializableList9.listIterator((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index:52, size=0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList0 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean2 = serializableList0.equals((java.lang.Object) (short) -1);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList3 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean5 = serializableList3.equals((java.lang.Object) (short) -1);
        int int7 = serializableList3.indexOf((java.lang.Object) false);
        java.lang.String[] strArray10 = new java.lang.String[] { "[]", "[]" };
        java.lang.Comparable<java.lang.String>[] strComparableArray11 = serializableList3.toArray((java.lang.Comparable<java.lang.String>[]) strArray10);
        boolean boolean12 = serializableList0.equals((java.lang.Object) strArray10);
        int int13 = serializableList0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { null, "[]" });
        org.junit.Assert.assertNotNull(strComparableArray11);
        org.junit.Assert.assertArrayEquals(strComparableArray11, new java.lang.String[] { null, "[]" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList0 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean2 = serializableList0.equals((java.lang.Object) (short) -1);
        serializableList0.clear();
        boolean boolean4 = serializableList0.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList5 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean6 = serializableList0.containsAll((java.util.Collection<java.io.Serializable>) serializableList5);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList7 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean9 = serializableList7.equals((java.lang.Object) (short) -1);
        int int11 = serializableList7.indexOf((java.lang.Object) false);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList12 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList13 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Object[] objArray14 = serializableList13.toArray();
        boolean boolean15 = serializableList13.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList16 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean18 = serializableList16.equals((java.lang.Object) (short) -1);
        int int20 = serializableList16.indexOf((java.lang.Object) false);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList21 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Object[] objArray22 = serializableList21.toArray();
        boolean boolean23 = serializableList21.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList24 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean26 = serializableList24.equals((java.lang.Object) (short) -1);
        serializableList24.clear();
        boolean boolean28 = serializableList24.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList29 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean30 = serializableList24.containsAll((java.util.Collection<java.io.Serializable>) serializableList29);
        org.apache.commons.collections.list.TreeList<java.util.AbstractList<java.io.Serializable>> serializableListList31 = new org.apache.commons.collections.list.TreeList<java.util.AbstractList<java.io.Serializable>>();
        boolean boolean32 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList0);
        boolean boolean33 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList7);
        boolean boolean34 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList12);
        boolean boolean35 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList13);
        boolean boolean36 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList16);
        boolean boolean37 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList21);
        boolean boolean38 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList29);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.util.AbstractList<java.io.Serializable>> serializableListItor40 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.util.AbstractList<java.io.Serializable>>(serializableListList31, 0);
        int int41 = serializableListItor40.nextIndex;
        java.util.AbstractList<java.io.Serializable> serializableList42 = serializableListItor40.next();
        org.apache.commons.collections.list.TreeList.AVLNode<java.util.AbstractList<java.io.Serializable>> serializableListAVLNode43 = null;
        serializableListItor40.next = serializableListAVLNode43;
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList45 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean47 = serializableList45.equals((java.lang.Object) (short) -1);
        serializableList45.clear();
        boolean boolean49 = serializableList45.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList50 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean51 = serializableList45.containsAll((java.util.Collection<java.io.Serializable>) serializableList50);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList52 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean54 = serializableList52.equals((java.lang.Object) (short) -1);
        int int56 = serializableList52.indexOf((java.lang.Object) false);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList57 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList58 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Object[] objArray59 = serializableList58.toArray();
        boolean boolean60 = serializableList58.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList61 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean63 = serializableList61.equals((java.lang.Object) (short) -1);
        int int65 = serializableList61.indexOf((java.lang.Object) false);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList66 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Object[] objArray67 = serializableList66.toArray();
        boolean boolean68 = serializableList66.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList69 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean71 = serializableList69.equals((java.lang.Object) (short) -1);
        serializableList69.clear();
        boolean boolean73 = serializableList69.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList74 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean75 = serializableList69.containsAll((java.util.Collection<java.io.Serializable>) serializableList74);
        org.apache.commons.collections.list.TreeList<java.util.AbstractList<java.io.Serializable>> serializableListList76 = new org.apache.commons.collections.list.TreeList<java.util.AbstractList<java.io.Serializable>>();
        boolean boolean77 = serializableListList76.add((java.util.AbstractList<java.io.Serializable>) serializableList45);
        boolean boolean78 = serializableListList76.add((java.util.AbstractList<java.io.Serializable>) serializableList52);
        boolean boolean79 = serializableListList76.add((java.util.AbstractList<java.io.Serializable>) serializableList57);
        boolean boolean80 = serializableListList76.add((java.util.AbstractList<java.io.Serializable>) serializableList58);
        boolean boolean81 = serializableListList76.add((java.util.AbstractList<java.io.Serializable>) serializableList61);
        boolean boolean82 = serializableListList76.add((java.util.AbstractList<java.io.Serializable>) serializableList66);
        boolean boolean83 = serializableListList76.add((java.util.AbstractList<java.io.Serializable>) serializableList74);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.util.AbstractList<java.io.Serializable>> serializableListItor85 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.util.AbstractList<java.io.Serializable>>(serializableListList76, 0);
        int int86 = serializableListItor85.nextIndex;
        java.util.AbstractList<java.io.Serializable> serializableList87 = serializableListItor85.next();
        serializableListItor40.add(serializableList87);
        org.apache.commons.collections.list.TreeList.AVLNode<java.util.AbstractList<java.io.Serializable>> serializableListAVLNode89 = null;
        serializableListItor40.current = serializableListAVLNode89;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertArrayEquals(objArray22, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(serializableList42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertArrayEquals(objArray59, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertArrayEquals(objArray67, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(serializableList87);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList12 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Class<?> wildcardClass13 = serializableList12.getClass();
        java.io.Serializable[] serializableArray35 = new java.io.Serializable[] { 'a', 0L, "", '#', (short) 1, (-1), (short) 100, (byte) 0, 'a', 1.0f, (short) 0, 10L, wildcardClass13, (-1.0d), (short) 100, (short) 0, (byte) -1, 100.0f, 100, (byte) -1, false, (short) 10, "", (-1.0d), "", 1, 1.0d, (-1.0d), true, '4', (-1), (-1), 1.0f, (byte) 0 };
        java.util.ArrayList<java.io.Serializable> serializableList36 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList36, serializableArray35);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList39 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Class<?> wildcardClass40 = serializableList39.getClass();
        java.io.Serializable[] serializableArray43 = new java.io.Serializable[] { (short) 100, wildcardClass40, (byte) 1, (byte) 0 };
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList44, serializableArray43);
        boolean boolean46 = serializableList36.removeAll((java.util.Collection<java.io.Serializable>) serializableList44);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList59 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Class<?> wildcardClass60 = serializableList59.getClass();
        java.io.Serializable[] serializableArray82 = new java.io.Serializable[] { 'a', 0L, "", '#', (short) 1, (-1), (short) 100, (byte) 0, 'a', 1.0f, (short) 0, 10L, wildcardClass60, (-1.0d), (short) 100, (short) 0, (byte) -1, 100.0f, 100, (byte) -1, false, (short) 10, "", (-1.0d), "", 1, 1.0d, (-1.0d), true, '4', (-1), (-1), 1.0f, (byte) 0 };
        java.util.ArrayList<java.io.Serializable> serializableList83 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList83, serializableArray82);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList86 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Class<?> wildcardClass87 = serializableList86.getClass();
        java.io.Serializable[] serializableArray90 = new java.io.Serializable[] { (short) 100, wildcardClass87, (byte) 1, (byte) 0 };
        java.util.ArrayList<java.io.Serializable> serializableList91 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList91, serializableArray90);
        boolean boolean93 = serializableList83.removeAll((java.util.Collection<java.io.Serializable>) serializableList91);
        boolean boolean94 = serializableList36.retainAll((java.util.Collection<java.io.Serializable>) serializableList83);
        boolean boolean96 = serializableList83.equals((java.lang.Object) 1);
        java.util.stream.Stream<java.io.Serializable> serializableStream97 = serializableList83.parallelStream();
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(serializableArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(serializableArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(serializableArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(wildcardClass87);
        org.junit.Assert.assertNotNull(serializableArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(serializableStream97);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList0 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean2 = serializableList0.equals((java.lang.Object) (short) -1);
        serializableList0.clear();
        boolean boolean4 = serializableList0.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList5 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean6 = serializableList0.containsAll((java.util.Collection<java.io.Serializable>) serializableList5);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList7 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean9 = serializableList7.equals((java.lang.Object) (short) -1);
        int int11 = serializableList7.indexOf((java.lang.Object) false);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList12 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList13 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Object[] objArray14 = serializableList13.toArray();
        boolean boolean15 = serializableList13.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList16 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean18 = serializableList16.equals((java.lang.Object) (short) -1);
        int int20 = serializableList16.indexOf((java.lang.Object) false);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList21 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Object[] objArray22 = serializableList21.toArray();
        boolean boolean23 = serializableList21.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList24 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean26 = serializableList24.equals((java.lang.Object) (short) -1);
        serializableList24.clear();
        boolean boolean28 = serializableList24.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList29 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean30 = serializableList24.containsAll((java.util.Collection<java.io.Serializable>) serializableList29);
        org.apache.commons.collections.list.TreeList<java.util.AbstractList<java.io.Serializable>> serializableListList31 = new org.apache.commons.collections.list.TreeList<java.util.AbstractList<java.io.Serializable>>();
        boolean boolean32 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList0);
        boolean boolean33 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList7);
        boolean boolean34 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList12);
        boolean boolean35 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList13);
        boolean boolean36 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList16);
        boolean boolean37 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList21);
        boolean boolean38 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList29);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.util.AbstractList<java.io.Serializable>> serializableListItor40 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.util.AbstractList<java.io.Serializable>>(serializableListList31, 0);
        int int41 = serializableListItor40.nextIndex;
        int int42 = serializableListItor40.nextIndex;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertArrayEquals(objArray22, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList12 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Class<?> wildcardClass13 = serializableList12.getClass();
        java.io.Serializable[] serializableArray35 = new java.io.Serializable[] { 'a', 0L, "", '#', (short) 1, (-1), (short) 100, (byte) 0, 'a', 1.0f, (short) 0, 10L, wildcardClass13, (-1.0d), (short) 100, (short) 0, (byte) -1, 100.0f, 100, (byte) -1, false, (short) 10, "", (-1.0d), "", 1, 1.0d, (-1.0d), true, '4', (-1), (-1), 1.0f, (byte) 0 };
        java.util.ArrayList<java.io.Serializable> serializableList36 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList36, serializableArray35);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList39 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Class<?> wildcardClass40 = serializableList39.getClass();
        java.io.Serializable[] serializableArray43 = new java.io.Serializable[] { (short) 100, wildcardClass40, (byte) 1, (byte) 0 };
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList44, serializableArray43);
        boolean boolean46 = serializableList36.removeAll((java.util.Collection<java.io.Serializable>) serializableList44);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList48 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean50 = serializableList48.equals((java.lang.Object) (short) -1);
        serializableList48.clear();
        boolean boolean52 = serializableList48.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList53 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean54 = serializableList48.containsAll((java.util.Collection<java.io.Serializable>) serializableList53);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator55 = serializableList53.spliterator();
        boolean boolean56 = serializableList44.addAll((int) (short) 1, (java.util.Collection<java.io.Serializable>) serializableList53);
        boolean boolean58 = serializableList44.remove((java.lang.Object) 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(serializableArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(serializableArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList0 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean2 = serializableList0.equals((java.lang.Object) (short) -1);
        serializableList0.clear();
        boolean boolean4 = serializableList0.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList5 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean6 = serializableList0.containsAll((java.util.Collection<java.io.Serializable>) serializableList5);
        int int8 = serializableList0.indexOf((java.lang.Object) (byte) -1);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList9 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList0);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList10 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList0);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList11 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean13 = serializableList11.equals((java.lang.Object) (short) -1);
        serializableList11.clear();
        boolean boolean15 = serializableList11.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList16 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean17 = serializableList11.containsAll((java.util.Collection<java.io.Serializable>) serializableList16);
        int int19 = serializableList11.indexOf((java.lang.Object) (byte) -1);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList20 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList11);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList21 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList11);
        boolean boolean22 = serializableList10.equals((java.lang.Object) serializableList11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList0 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean2 = serializableList0.equals((java.lang.Object) (short) -1);
        serializableList0.clear();
        boolean boolean4 = serializableList0.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList5 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean6 = serializableList0.containsAll((java.util.Collection<java.io.Serializable>) serializableList5);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList7 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean9 = serializableList7.equals((java.lang.Object) (short) -1);
        int int11 = serializableList7.indexOf((java.lang.Object) false);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList12 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList13 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Object[] objArray14 = serializableList13.toArray();
        boolean boolean15 = serializableList13.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList16 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean18 = serializableList16.equals((java.lang.Object) (short) -1);
        int int20 = serializableList16.indexOf((java.lang.Object) false);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList21 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Object[] objArray22 = serializableList21.toArray();
        boolean boolean23 = serializableList21.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList24 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean26 = serializableList24.equals((java.lang.Object) (short) -1);
        serializableList24.clear();
        boolean boolean28 = serializableList24.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList29 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean30 = serializableList24.containsAll((java.util.Collection<java.io.Serializable>) serializableList29);
        org.apache.commons.collections.list.TreeList<java.util.AbstractList<java.io.Serializable>> serializableListList31 = new org.apache.commons.collections.list.TreeList<java.util.AbstractList<java.io.Serializable>>();
        boolean boolean32 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList0);
        boolean boolean33 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList7);
        boolean boolean34 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList12);
        boolean boolean35 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList13);
        boolean boolean36 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList16);
        boolean boolean37 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList21);
        boolean boolean38 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList29);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.util.AbstractList<java.io.Serializable>> serializableListItor40 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.util.AbstractList<java.io.Serializable>>(serializableListList31, 0);
        int int41 = serializableListItor40.nextIndex;
        java.util.AbstractList<java.io.Serializable> serializableList42 = serializableListItor40.next();
        org.apache.commons.collections.list.TreeList.AVLNode<java.util.AbstractList<java.io.Serializable>> serializableListAVLNode43 = null;
        serializableListItor40.next = serializableListAVLNode43;
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList45 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean47 = serializableList45.equals((java.lang.Object) (short) -1);
        serializableList45.clear();
        boolean boolean49 = serializableList45.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList50 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean51 = serializableList45.containsAll((java.util.Collection<java.io.Serializable>) serializableList50);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList52 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean54 = serializableList52.equals((java.lang.Object) (short) -1);
        int int56 = serializableList52.indexOf((java.lang.Object) false);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList57 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList58 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Object[] objArray59 = serializableList58.toArray();
        boolean boolean60 = serializableList58.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList61 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean63 = serializableList61.equals((java.lang.Object) (short) -1);
        int int65 = serializableList61.indexOf((java.lang.Object) false);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList66 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Object[] objArray67 = serializableList66.toArray();
        boolean boolean68 = serializableList66.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList69 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean71 = serializableList69.equals((java.lang.Object) (short) -1);
        serializableList69.clear();
        boolean boolean73 = serializableList69.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList74 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean75 = serializableList69.containsAll((java.util.Collection<java.io.Serializable>) serializableList74);
        org.apache.commons.collections.list.TreeList<java.util.AbstractList<java.io.Serializable>> serializableListList76 = new org.apache.commons.collections.list.TreeList<java.util.AbstractList<java.io.Serializable>>();
        boolean boolean77 = serializableListList76.add((java.util.AbstractList<java.io.Serializable>) serializableList45);
        boolean boolean78 = serializableListList76.add((java.util.AbstractList<java.io.Serializable>) serializableList52);
        boolean boolean79 = serializableListList76.add((java.util.AbstractList<java.io.Serializable>) serializableList57);
        boolean boolean80 = serializableListList76.add((java.util.AbstractList<java.io.Serializable>) serializableList58);
        boolean boolean81 = serializableListList76.add((java.util.AbstractList<java.io.Serializable>) serializableList61);
        boolean boolean82 = serializableListList76.add((java.util.AbstractList<java.io.Serializable>) serializableList66);
        boolean boolean83 = serializableListList76.add((java.util.AbstractList<java.io.Serializable>) serializableList74);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.util.AbstractList<java.io.Serializable>> serializableListItor85 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.util.AbstractList<java.io.Serializable>>(serializableListList76, 0);
        int int86 = serializableListItor85.nextIndex;
        java.util.AbstractList<java.io.Serializable> serializableList87 = serializableListItor85.next();
        serializableListItor40.add(serializableList87);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.io.Serializable> serializableList91 = serializableList87.subList(10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertArrayEquals(objArray22, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(serializableList42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertArrayEquals(objArray59, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertArrayEquals(objArray67, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(serializableList87);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList0 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean2 = serializableList0.equals((java.lang.Object) (short) -1);
        serializableList0.clear();
        boolean boolean4 = serializableList0.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList5 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean6 = serializableList0.containsAll((java.util.Collection<java.io.Serializable>) serializableList5);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList7 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean9 = serializableList7.equals((java.lang.Object) (short) -1);
        int int11 = serializableList7.indexOf((java.lang.Object) false);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList12 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList13 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Object[] objArray14 = serializableList13.toArray();
        boolean boolean15 = serializableList13.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList16 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean18 = serializableList16.equals((java.lang.Object) (short) -1);
        int int20 = serializableList16.indexOf((java.lang.Object) false);
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList21 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        java.lang.Object[] objArray22 = serializableList21.toArray();
        boolean boolean23 = serializableList21.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList24 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean26 = serializableList24.equals((java.lang.Object) (short) -1);
        serializableList24.clear();
        boolean boolean28 = serializableList24.isEmpty();
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList29 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean30 = serializableList24.containsAll((java.util.Collection<java.io.Serializable>) serializableList29);
        org.apache.commons.collections.list.TreeList<java.util.AbstractList<java.io.Serializable>> serializableListList31 = new org.apache.commons.collections.list.TreeList<java.util.AbstractList<java.io.Serializable>>();
        boolean boolean32 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList0);
        boolean boolean33 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList7);
        boolean boolean34 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList12);
        boolean boolean35 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList13);
        boolean boolean36 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList16);
        boolean boolean37 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList21);
        boolean boolean38 = serializableListList31.add((java.util.AbstractList<java.io.Serializable>) serializableList29);
        org.apache.commons.collections.list.TreeList.TreeListIterator<java.util.AbstractList<java.io.Serializable>> serializableListItor40 = new org.apache.commons.collections.list.TreeList.TreeListIterator<java.util.AbstractList<java.io.Serializable>>(serializableListList31, 0);
        int int41 = serializableListItor40.nextIndex;
        java.util.AbstractList<java.io.Serializable> serializableList42 = serializableListItor40.next();
        org.apache.commons.collections.list.TreeList.AVLNode<java.util.AbstractList<java.io.Serializable>> serializableListAVLNode43 = null;
        serializableListItor40.next = serializableListAVLNode43;
        org.apache.commons.collections.list.TreeList<java.util.AbstractList<java.io.Serializable>> serializableListList45 = serializableListItor40.parent;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertArrayEquals(objArray22, new java.lang.Object[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(serializableList42);
        org.junit.Assert.assertNotNull(serializableListList45);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.apache.commons.collections.list.TreeList<java.io.Serializable> serializableList0 = new org.apache.commons.collections.list.TreeList<java.io.Serializable>();
        boolean boolean2 = serializableList0.contains((java.lang.Object) 1.0d);
        boolean boolean4 = serializableList0.remove((java.lang.Object) 1L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }
}

