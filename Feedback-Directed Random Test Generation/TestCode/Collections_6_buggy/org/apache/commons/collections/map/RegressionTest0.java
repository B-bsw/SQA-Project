package org.apache.commons.collections.map;

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
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap1 = flat3Map0.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map flat3Map2 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj3 = flat3Map2.clone();
        boolean boolean5 = flat3Map2.containsValue((java.lang.Object) "hi!");
        boolean boolean6 = flat3Map0.equals((java.lang.Object) boolean5);
        org.junit.Assert.assertNotNull(abstractHashedMap1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "{}");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        int int1 = flat3Map0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj1 = flat3Map0.clone();
        org.apache.commons.collections.map.Flat3Map flat3Map3 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap4 = flat3Map3.createDelegateMap();
        java.lang.Object obj5 = flat3Map0.put((java.lang.Object) (short) 1, (java.lang.Object) flat3Map3);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "{}");
        org.junit.Assert.assertNotNull(abstractHashedMap4);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap1 = flat3Map0.createDelegateMap();
        java.lang.Object obj4 = flat3Map0.put((java.lang.Object) (-1.0f), (java.lang.Object) false);
        org.junit.Assert.assertNotNull(abstractHashedMap1);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = null;
        org.apache.commons.collections.map.Flat3Map.FlatMapIterator flatMapIterator1 = new org.apache.commons.collections.map.Flat3Map.FlatMapIterator(flat3Map0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = flatMapIterator1.setValue((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: setValue() can only be called after next() and before remove()");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        java.lang.Object obj1 = flat3Map0.clone();
        boolean boolean3 = flat3Map0.containsValue((java.lang.Object) "hi!");
        java.lang.Object obj4 = null;
        boolean boolean5 = flat3Map0.equals(obj4);
        java.lang.String str6 = flat3Map0.toString();
        org.apache.commons.collections.map.Flat3Map.EntrySet entrySet7 = new org.apache.commons.collections.map.Flat3Map.EntrySet(flat3Map0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "{}");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{}" + "'", str6, "{}");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap1 = flat3Map0.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map.KeySet keySet2 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.Values values3 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        boolean boolean5 = values3.contains((java.lang.Object) 100);
        org.junit.Assert.assertNotNull(abstractHashedMap1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap1 = flat3Map0.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map.KeySet keySet2 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        boolean boolean4 = keySet2.contains((java.lang.Object) (byte) 0);
        org.junit.Assert.assertNotNull(abstractHashedMap1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap1 = flat3Map0.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map.KeySet keySet2 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        int int3 = keySet2.size();
        org.junit.Assert.assertNotNull(abstractHashedMap1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.collections.map.Flat3Map flat3Map0 = new org.apache.commons.collections.map.Flat3Map();
        org.apache.commons.collections.map.AbstractHashedMap abstractHashedMap1 = flat3Map0.createDelegateMap();
        org.apache.commons.collections.map.Flat3Map.KeySet keySet2 = new org.apache.commons.collections.map.Flat3Map.KeySet(flat3Map0);
        org.apache.commons.collections.map.Flat3Map.Values values3 = new org.apache.commons.collections.map.Flat3Map.Values(flat3Map0);
        int int4 = flat3Map0.size();
        org.junit.Assert.assertNotNull(abstractHashedMap1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }
}

