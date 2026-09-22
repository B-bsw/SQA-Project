package org.apache.commons.collections.set;

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
        java.lang.Object[] objArray28 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet29 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet29, objArray28);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet31 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet29);
        java.lang.Object[] objArray42 = new java.lang.Object[] { 10.0d, true, "", (byte) 10, "hi!", 1.0f, (short) -1, 0, 0L, (short) -1, objSet31, 1.0d, 1.0d, 0, 1L, (short) 10, (byte) 10, (-1), (short) -1, 10L, 0.0f };
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet43 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet43, objArray42);
        boolean boolean46 = objSet43.add((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray47 = objSet43.toArray();
        java.util.List<java.lang.Object> objList48 = objSet43.setOrder;
        int int49 = objSet43.size();
        boolean boolean51 = objSet43.remove((java.lang.Object) (short) 1);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1, 10, -1, 10, 0.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1, 10, -1, 10, 0.0, 0]");
        org.junit.Assert.assertNotNull(objList48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 17 + "'", int49 == 17);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Object[] objArray18 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet19 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet19, objArray18);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet21 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet19);
        java.util.LinkedHashSet<java.util.AbstractSet<java.lang.Object>> objSetSet22 = new java.util.LinkedHashSet<java.util.AbstractSet<java.lang.Object>>();
        boolean boolean23 = objSetSet22.add((java.util.AbstractSet<java.lang.Object>) objSet19);
        java.lang.Object[] objArray42 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet43 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet43, objArray42);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet45 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet43);
        java.util.ArrayList<java.util.AbstractSet<java.lang.Object>> objSetList46 = new java.util.ArrayList<java.util.AbstractSet<java.lang.Object>>();
        boolean boolean47 = objSetList46.add((java.util.AbstractSet<java.lang.Object>) objSet43);
        org.apache.commons.collections.set.ListOrderedSet<java.util.AbstractSet<java.lang.Object>> objSetSet48 = new org.apache.commons.collections.set.ListOrderedSet<java.util.AbstractSet<java.lang.Object>>((java.util.Set<java.util.AbstractSet<java.lang.Object>>) objSetSet22, (java.util.List<java.util.AbstractSet<java.lang.Object>>) objSetList46);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.collections.set.ListOrderedSet<org.apache.commons.collections.set.AbstractSerializableSetDecorator<java.lang.Object>> objSetSet0 = new org.apache.commons.collections.set.ListOrderedSet<org.apache.commons.collections.set.AbstractSerializableSetDecorator<java.lang.Object>>();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.collections.set.ListOrderedSet<java.util.Set<java.lang.Object>> objSetSet0 = new org.apache.commons.collections.set.ListOrderedSet<java.util.Set<java.lang.Object>>();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.lang.Object[] objArray28 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet29 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet29, objArray28);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet31 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet29);
        java.lang.Object[] objArray42 = new java.lang.Object[] { 10.0d, true, "", (byte) 10, "hi!", 1.0f, (short) -1, 0, 0L, (short) -1, objSet31, 1.0d, 1.0d, 0, 1L, (short) 10, (byte) 10, (-1), (short) -1, 10L, 0.0f };
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet43 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet43, objArray42);
        boolean boolean46 = objSet43.add((java.lang.Object) (byte) 0);
        org.apache.commons.collections.OrderedIterator<java.lang.Object> objItor47 = objSet43.iterator();
        java.lang.Object[] objArray76 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet77 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet77, objArray76);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet79 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet77);
        java.lang.Object[] objArray90 = new java.lang.Object[] { 10.0d, true, "", (byte) 10, "hi!", 1.0f, (short) -1, 0, 0L, (short) -1, objSet79, 1.0d, 1.0d, 0, 1L, (short) 10, (byte) 10, (-1), (short) -1, 10L, 0.0f };
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet91 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet91, objArray90);
        boolean boolean94 = objSet91.add((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray95 = objSet91.toArray();
        java.util.List<java.lang.Object> objList96 = objSet91.setOrder;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet97 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.lang.Object>) objSet43, objList96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Set and List must be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objItor47);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(objArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray90), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray90), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(objArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray95), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1, 10, -1, 10, 0.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray95), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1, 10, -1, 10, 0.0, 0]");
        org.junit.Assert.assertNotNull(objList96);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.Object[] objArray28 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet29 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet29, objArray28);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet31 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet29);
        java.lang.Object[] objArray42 = new java.lang.Object[] { 10.0d, true, "", (byte) 10, "hi!", 1.0f, (short) -1, 0, 0L, (short) -1, objSet31, 1.0d, 1.0d, 0, 1L, (short) 10, (byte) 10, (-1), (short) -1, 10L, 0.0f };
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet43 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet43, objArray42);
        boolean boolean46 = objSet43.add((java.lang.Object) (byte) 0);
        org.apache.commons.collections.OrderedIterator<java.lang.Object> objItor47 = objSet43.iterator();
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet48 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.lang.Object>) objSet43);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet49 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet43);
        java.lang.Object[] objArray78 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet79 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet79, objArray78);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet81 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet79);
        java.lang.Object[] objArray92 = new java.lang.Object[] { 10.0d, true, "", (byte) 10, "hi!", 1.0f, (short) -1, 0, 0L, (short) -1, objSet81, 1.0d, 1.0d, 0, 1L, (short) 10, (byte) 10, (-1), (short) -1, 10L, 0.0f };
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet93 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet93, objArray92);
        boolean boolean96 = objSet93.add((java.lang.Object) (byte) 0);
        org.apache.commons.collections.OrderedIterator<java.lang.Object> objItor97 = objSet93.iterator();
        java.lang.Class<?> wildcardClass98 = objItor97.getClass();
        boolean boolean99 = objSet43.contains((java.lang.Object) objItor97);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objItor47);
        org.junit.Assert.assertNotNull(objSet48);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(objArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray92), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray92), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertNotNull(objItor97);
        org.junit.Assert.assertNotNull(wildcardClass98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.Object[] objArray28 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet29 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet29, objArray28);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet31 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet29);
        java.lang.Object[] objArray42 = new java.lang.Object[] { 10.0d, true, "", (byte) 10, "hi!", 1.0f, (short) -1, 0, 0L, (short) -1, objSet31, 1.0d, 1.0d, 0, 1L, (short) 10, (byte) 10, (-1), (short) -1, 10L, 0.0f };
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet43 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet43, objArray42);
        boolean boolean46 = objSet43.add((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray47 = objSet43.toArray();
        java.lang.Class<?> wildcardClass48 = objSet43.getClass();
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1, 10, -1, 10, 0.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1, 10, -1, 10, 0.0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.lang.Object[] objArray28 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet29 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet29, objArray28);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet31 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet29);
        java.lang.Object[] objArray42 = new java.lang.Object[] { 10.0d, true, "", (byte) 10, "hi!", 1.0f, (short) -1, 0, 0L, (short) -1, objSet31, 1.0d, 1.0d, 0, 1L, (short) 10, (byte) 10, (-1), (short) -1, 10L, 0.0f };
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet43 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet43, objArray42);
        boolean boolean46 = objSet43.add((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray47 = objSet43.toArray();
        java.lang.Object[] objArray76 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet77 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet77, objArray76);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet79 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet77);
        java.lang.Object[] objArray90 = new java.lang.Object[] { 10.0d, true, "", (byte) 10, "hi!", 1.0f, (short) -1, 0, 0L, (short) -1, objSet79, 1.0d, 1.0d, 0, 1L, (short) 10, (byte) 10, (-1), (short) -1, 10L, 0.0f };
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet91 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet91, objArray90);
        boolean boolean94 = objSet91.add((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray95 = objSet91.toArray();
        java.util.List<java.lang.Object> objList96 = objSet91.setOrder;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet97 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.lang.Object>) objSet43, objList96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Set and List must be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1, 10, -1, 10, 0.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1, 10, -1, 10, 0.0, 0]");
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(objArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray90), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray90), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(objArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray95), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1, 10, -1, 10, 0.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray95), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1, 10, -1, 10, 0.0, 0]");
        org.junit.Assert.assertNotNull(objList96);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.lang.Object[] objArray28 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet29 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet29, objArray28);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet31 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet29);
        java.lang.Object[] objArray42 = new java.lang.Object[] { 10.0d, true, "", (byte) 10, "hi!", 1.0f, (short) -1, 0, 0L, (short) -1, objSet31, 1.0d, 1.0d, 0, 1L, (short) 10, (byte) 10, (-1), (short) -1, 10L, 0.0f };
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet43 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet43, objArray42);
        boolean boolean46 = objSet43.add((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray47 = objSet43.toArray();
        java.lang.Object[] objArray77 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet78 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet78, objArray77);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet80 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet78);
        java.lang.Object[] objArray91 = new java.lang.Object[] { 10.0d, true, "", (byte) 10, "hi!", 1.0f, (short) -1, 0, 0L, (short) -1, objSet80, 1.0d, 1.0d, 0, 1L, (short) 10, (byte) 10, (-1), (short) -1, 10L, 0.0f };
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet92 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet92, objArray91);
        boolean boolean95 = objSet92.add((java.lang.Object) (byte) 0);
        org.apache.commons.collections.OrderedIterator<java.lang.Object> objItor96 = objSet92.iterator();
        java.util.List<java.lang.Object> objList97 = objSet92.setOrder;
        // The following exception was thrown during execution in test generation
        try {
            objSet43.add((int) (byte) 100, (java.lang.Object) objSet92);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 17");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1, 10, -1, 10, 0.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1, 10, -1, 10, 0.0, 0]");
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(objArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray91), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray91), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(objItor96);
        org.junit.Assert.assertNotNull(objList97);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.lang.Object[] objArray28 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet29 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet29, objArray28);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet31 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet29);
        java.lang.Object[] objArray42 = new java.lang.Object[] { 10.0d, true, "", (byte) 10, "hi!", 1.0f, (short) -1, 0, 0L, (short) -1, objSet31, 1.0d, 1.0d, 0, 1L, (short) 10, (byte) 10, (-1), (short) -1, 10L, 0.0f };
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet43 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet43, objArray42);
        boolean boolean46 = objSet43.add((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray47 = objSet43.toArray();
        java.util.List<java.lang.Object> objList48 = objSet43.setOrder;
        int int49 = objSet43.size();
        java.lang.Object[] objArray68 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet69 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet69, objArray68);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet71 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet69);
        org.apache.commons.collections.OrderedIterator<java.lang.Object> objItor72 = objSet71.iterator();
        boolean boolean73 = objSet43.contains((java.lang.Object) objSet71);
        org.apache.commons.collections.OrderedIterator<java.lang.Object> objItor74 = objSet71.iterator();
        java.util.Collection<java.lang.Object> objCollection75 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean76 = objSet71.removeAll(objCollection75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1, 10, -1, 10, 0.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1, 10, -1, 10, 0.0, 0]");
        org.junit.Assert.assertNotNull(objList48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 17 + "'", int49 == 17);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(objItor72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(objItor74);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.lang.Object[] objArray28 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet29 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet29, objArray28);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet31 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet29);
        java.lang.Object[] objArray42 = new java.lang.Object[] { 10.0d, true, "", (byte) 10, "hi!", 1.0f, (short) -1, 0, 0L, (short) -1, objSet31, 1.0d, 1.0d, 0, 1L, (short) 10, (byte) 10, (-1), (short) -1, 10L, 0.0f };
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet43 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet43, objArray42);
        boolean boolean46 = objSet43.add((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray47 = objSet43.toArray();
        java.util.List<java.lang.Object> objList48 = objSet43.setOrder;
        int int49 = objSet43.size();
        java.lang.Object[] objArray68 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet69 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet69, objArray68);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet71 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet69);
        org.apache.commons.collections.OrderedIterator<java.lang.Object> objItor72 = objSet71.iterator();
        boolean boolean73 = objSet43.contains((java.lang.Object) objSet71);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj75 = objSet43.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 17");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1, 10, -1, 10, 0.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1, 10, -1, 10, 0.0, 0]");
        org.junit.Assert.assertNotNull(objList48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 17 + "'", int49 == 17);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(objItor72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.collections.set.ListOrderedSet<java.util.AbstractSet<java.lang.Object>> objSetSet0 = new org.apache.commons.collections.set.ListOrderedSet<java.util.AbstractSet<java.lang.Object>>();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.lang.Object[] objArray28 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet29 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet29, objArray28);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet31 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet29);
        java.lang.Object[] objArray42 = new java.lang.Object[] { 10.0d, true, "", (byte) 10, "hi!", 1.0f, (short) -1, 0, 0L, (short) -1, objSet31, 1.0d, 1.0d, 0, 1L, (short) 10, (byte) 10, (-1), (short) -1, 10L, 0.0f };
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet43 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet43, objArray42);
        boolean boolean46 = objSet43.add((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray47 = objSet43.toArray();
        java.util.List<java.lang.Object> objList48 = objSet43.setOrder;
        java.lang.Object obj50 = objSet43.remove((int) (short) 10);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1, 10, -1, 10, 0.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1, 10, -1, 10, 0.0, 0]");
        org.junit.Assert.assertNotNull(objList48);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 1.0d + "'", obj50, 1.0d);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet0 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>();
        java.lang.Object[] objArray30 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet31 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet31, objArray30);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet33 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet31);
        java.lang.Object[] objArray44 = new java.lang.Object[] { 10.0d, true, "", (byte) 10, "hi!", 1.0f, (short) -1, 0, 0L, (short) -1, objSet33, 1.0d, 1.0d, 0, 1L, (short) 10, (byte) 10, (-1), (short) -1, 10L, 0.0f };
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet45 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet45, objArray44);
        boolean boolean48 = objSet45.add((java.lang.Object) (byte) 0);
        org.apache.commons.collections.OrderedIterator<java.lang.Object> objItor49 = objSet45.iterator();
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet50 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.lang.Object>) objSet45);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet51 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.lang.Object>) objSet45);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = objSet0.addAll((int) (byte) 1, (java.util.Collection<java.lang.Object>) objSet45);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(objItor49);
        org.junit.Assert.assertNotNull(objSet50);
        org.junit.Assert.assertNotNull(objSet51);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.lang.Object[] objArray28 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet29 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet29, objArray28);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet31 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet29);
        java.lang.Object[] objArray42 = new java.lang.Object[] { 10.0d, true, "", (byte) 10, "hi!", 1.0f, (short) -1, 0, 0L, (short) -1, objSet31, 1.0d, 1.0d, 0, 1L, (short) 10, (byte) 10, (-1), (short) -1, 10L, 0.0f };
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet43 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet43, objArray42);
        boolean boolean46 = objSet43.add((java.lang.Object) (byte) 0);
        org.apache.commons.collections.OrderedIterator<java.lang.Object> objItor47 = objSet43.iterator();
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet48 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.lang.Object>) objSet43);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet49 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet43);
        java.lang.String str50 = objSet43.toString();
        org.apache.commons.collections.OrderedIterator<java.lang.Object> objItor51 = objSet43.iterator();
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objItor47);
        org.junit.Assert.assertNotNull(objSet48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1, 10, -1, 10, 0.0, 0]" + "'", str50, "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1, 10, -1, 10, 0.0, 0]");
        org.junit.Assert.assertNotNull(objItor51);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.lang.Object[] objArray28 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet29 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet29, objArray28);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet31 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet29);
        java.lang.Object[] objArray42 = new java.lang.Object[] { 10.0d, true, "", (byte) 10, "hi!", 1.0f, (short) -1, 0, 0L, (short) -1, objSet31, 1.0d, 1.0d, 0, 1L, (short) 10, (byte) 10, (-1), (short) -1, 10L, 0.0f };
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet43 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet43, objArray42);
        boolean boolean46 = objSet43.add((java.lang.Object) (byte) 0);
        org.apache.commons.collections.OrderedIterator<java.lang.Object> objItor47 = objSet43.iterator();
        java.util.List<java.lang.Object> objList48 = objSet43.setOrder;
        java.lang.String str49 = objSet43.toString();
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objItor47);
        org.junit.Assert.assertNotNull(objList48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1, 10, -1, 10, 0.0, 0]" + "'", str49, "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1, 10, -1, 10, 0.0, 0]");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.lang.Object[] objArray18 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet19 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet19, objArray18);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet21 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet19);
        objSet21.clear();
        boolean boolean24 = objSet21.remove((java.lang.Object) 10.0f);
        boolean boolean25 = objSet21.isEmpty();
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.lang.Object[] objArray28 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet29 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet29, objArray28);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet31 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet29);
        java.lang.Object[] objArray42 = new java.lang.Object[] { 10.0d, true, "", (byte) 10, "hi!", 1.0f, (short) -1, 0, 0L, (short) -1, objSet31, 1.0d, 1.0d, 0, 1L, (short) 10, (byte) 10, (-1), (short) -1, 10L, 0.0f };
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet43 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet43, objArray42);
        boolean boolean46 = objSet43.add((java.lang.Object) (byte) 0);
        org.apache.commons.collections.OrderedIterator<java.lang.Object> objItor47 = objSet43.iterator();
        boolean boolean49 = objSet43.add((java.lang.Object) 'a');
        java.lang.Object[] objArray68 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet69 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet69, objArray68);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet71 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet69);
        boolean boolean72 = objSet43.retainAll((java.util.Collection<java.lang.Object>) objSet71);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objItor47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.lang.Object[] objArray18 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet19 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet19, objArray18);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet21 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet19);
        objSet21.clear();
        java.lang.Object[] objArray52 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet53 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet53, objArray52);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet55 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet53);
        java.lang.Object[] objArray66 = new java.lang.Object[] { 10.0d, true, "", (byte) 10, "hi!", 1.0f, (short) -1, 0, 0L, (short) -1, objSet55, 1.0d, 1.0d, 0, 1L, (short) 10, (byte) 10, (-1), (short) -1, 10L, 0.0f };
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet67 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet67, objArray66);
        boolean boolean70 = objSet67.add((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray71 = objSet67.toArray();
        java.util.List<java.lang.Object> objList72 = objSet67.setOrder;
        boolean boolean74 = objSet67.remove((java.lang.Object) 10.0d);
        boolean boolean75 = objSet21.addAll((int) (byte) 0, (java.util.Collection<java.lang.Object>) objSet67);
        java.lang.Object obj77 = objSet21.get(10);
        org.apache.commons.collections.OrderedIterator<java.lang.Object> objItor78 = objSet21.iterator();
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1, 10, -1, 10, 0.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1, 10, -1, 10, 0.0, 0]");
        org.junit.Assert.assertNotNull(objList72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + 1L + "'", obj77, 1L);
        org.junit.Assert.assertNotNull(objItor78);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.lang.Object[] objArray18 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet19 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet19, objArray18);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet21 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet19);
        java.util.List<java.lang.Object> objList22 = objSet21.setOrder;
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet23 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet(objList22);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objList22);
        org.junit.Assert.assertNotNull(objSet23);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.lang.Object[] objArray28 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet29 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet29, objArray28);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet31 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet29);
        java.lang.Object[] objArray42 = new java.lang.Object[] { 10.0d, true, "", (byte) 10, "hi!", 1.0f, (short) -1, 0, 0L, (short) -1, objSet31, 1.0d, 1.0d, 0, 1L, (short) 10, (byte) 10, (-1), (short) -1, 10L, 0.0f };
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet43 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet43, objArray42);
        boolean boolean46 = objSet43.add((java.lang.Object) (byte) 0);
        org.apache.commons.collections.OrderedIterator<java.lang.Object> objItor47 = objSet43.iterator();
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet48 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.lang.Object>) objSet43);
        objSet43.add((int) '4', (java.lang.Object) 1L);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objItor47);
        org.junit.Assert.assertNotNull(objSet48);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.lang.Object[] objArray28 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet29 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet29, objArray28);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet31 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet29);
        java.lang.Object[] objArray42 = new java.lang.Object[] { 10.0d, true, "", (byte) 10, "hi!", 1.0f, (short) -1, 0, 0L, (short) -1, objSet31, 1.0d, 1.0d, 0, 1L, (short) 10, (byte) 10, (-1), (short) -1, 10L, 0.0f };
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet43 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet43, objArray42);
        boolean boolean46 = objSet43.add((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray47 = objSet43.toArray();
        java.util.List<java.lang.Object> objList48 = objSet43.setOrder;
        int int49 = objSet43.size();
        java.lang.Object[] objArray68 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet69 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet69, objArray68);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet71 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet69);
        org.apache.commons.collections.OrderedIterator<java.lang.Object> objItor72 = objSet71.iterator();
        boolean boolean73 = objSet43.contains((java.lang.Object) objSet71);
        org.apache.commons.collections.OrderedIterator<java.lang.Object> objItor74 = objSet71.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj76 = objSet71.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 16");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1, 10, -1, 10, 0.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1, 10, -1, 10, 0.0, 0]");
        org.junit.Assert.assertNotNull(objList48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 17 + "'", int49 == 17);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(objItor72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(objItor74);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.lang.Object[] objArray28 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet29 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet29, objArray28);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet31 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet29);
        java.lang.Object[] objArray42 = new java.lang.Object[] { 10.0d, true, "", (byte) 10, "hi!", 1.0f, (short) -1, 0, 0L, (short) -1, objSet31, 1.0d, 1.0d, 0, 1L, (short) 10, (byte) 10, (-1), (short) -1, 10L, 0.0f };
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet43 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet43, objArray42);
        boolean boolean46 = objSet43.add((java.lang.Object) (byte) 0);
        java.lang.Object obj48 = objSet43.remove((int) (short) 1);
        java.util.Spliterator<java.lang.Object> objSpliterator49 = objSet43.spliterator();
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + true + "'", obj48, true);
        org.junit.Assert.assertNotNull(objSpliterator49);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.collections.set.ListOrderedSet<java.lang.reflect.GenericDeclaration> genericDeclarationSet0 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.lang.Object[] objArray18 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet19 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet19, objArray18);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet21 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet19);
        objSet21.clear();
        boolean boolean24 = objSet21.remove((java.lang.Object) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = objSet21.remove(17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 17, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.lang.Object[] objArray18 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet19 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet19, objArray18);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet21 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet19);
        java.util.Spliterator<java.lang.Object> objSpliterator22 = objSet19.spliterator();
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objSpliterator22);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.lang.Object[] objArray18 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet19 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet19, objArray18);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet21 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet19);
        objSet21.clear();
        java.lang.Object[] objArray52 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet53 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet53, objArray52);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet55 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet53);
        java.lang.Object[] objArray66 = new java.lang.Object[] { 10.0d, true, "", (byte) 10, "hi!", 1.0f, (short) -1, 0, 0L, (short) -1, objSet55, 1.0d, 1.0d, 0, 1L, (short) 10, (byte) 10, (-1), (short) -1, 10L, 0.0f };
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet67 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet67, objArray66);
        boolean boolean70 = objSet67.add((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray71 = objSet67.toArray();
        java.util.List<java.lang.Object> objList72 = objSet67.setOrder;
        boolean boolean74 = objSet67.remove((java.lang.Object) 10.0d);
        boolean boolean75 = objSet21.addAll((int) (byte) 0, (java.util.Collection<java.lang.Object>) objSet67);
        boolean boolean77 = objSet21.equals((java.lang.Object) 100);
        java.lang.Object obj79 = objSet21.get((int) (byte) 10);
        org.apache.commons.collections.set.AbstractSetDecorator[] abstractSetDecoratorArray81 = new org.apache.commons.collections.set.AbstractSetDecorator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections.set.AbstractSetDecorator<java.lang.Object>[] objSetArray82 = (org.apache.commons.collections.set.AbstractSetDecorator<java.lang.Object>[]) abstractSetDecoratorArray81;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.set.AbstractSetDecorator<java.lang.Object>[] objSetArray83 = objSet21.toArray((org.apache.commons.collections.set.AbstractSetDecorator<java.lang.Object>[]) abstractSetDecoratorArray81);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1, 10, -1, 10, 0.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1, 10, -1, 10, 0.0, 0]");
        org.junit.Assert.assertNotNull(objList72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + obj79 + "' != '" + 1L + "'", obj79, 1L);
        org.junit.Assert.assertNotNull(abstractSetDecoratorArray81);
        org.junit.Assert.assertArrayEquals(abstractSetDecoratorArray81, new org.apache.commons.collections.set.AbstractSetDecorator[] {});
        org.junit.Assert.assertNotNull(objSetArray82);
        org.junit.Assert.assertArrayEquals(objSetArray82, new org.apache.commons.collections.set.AbstractSetDecorator[] {});
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.lang.Object[] objArray28 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet29 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet29, objArray28);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet31 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet29);
        java.lang.Object[] objArray42 = new java.lang.Object[] { 10.0d, true, "", (byte) 10, "hi!", 1.0f, (short) -1, 0, 0L, (short) -1, objSet31, 1.0d, 1.0d, 0, 1L, (short) 10, (byte) 10, (-1), (short) -1, 10L, 0.0f };
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet43 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet43, objArray42);
        boolean boolean46 = objSet43.add((java.lang.Object) (byte) 0);
        org.apache.commons.collections.OrderedIterator<java.lang.Object> objItor47 = objSet43.iterator();
        boolean boolean49 = objSet43.add((java.lang.Object) 'a');
        java.lang.Object[] objArray68 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet69 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet69, objArray68);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet71 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet69);
        java.util.List<java.lang.Object> objList72 = objSet71.setOrder;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet73 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.lang.Object>) objSet43, objList72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Set and List must be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objItor47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(objList72);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        java.lang.Object[] objArray28 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet29 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet29, objArray28);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet31 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet29);
        java.lang.Object[] objArray42 = new java.lang.Object[] { 10.0d, true, "", (byte) 10, "hi!", 1.0f, (short) -1, 0, 0L, (short) -1, objSet31, 1.0d, 1.0d, 0, 1L, (short) 10, (byte) 10, (-1), (short) -1, 10L, 0.0f };
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet43 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet43, objArray42);
        boolean boolean46 = objSet43.add((java.lang.Object) (byte) 0);
        java.lang.Object[] objArray47 = objSet43.toArray();
        java.util.List<java.lang.Object> objList48 = objSet43.setOrder;
        int int49 = objSet43.size();
        java.lang.Object obj50 = null;
        int int51 = objSet43.indexOf(obj50);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1, 10, -1, 10, 0.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1, 10, -1, 10, 0.0, 0]");
        org.junit.Assert.assertNotNull(objList48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 17 + "'", int49 == 17);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.lang.Object[] objArray28 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet29 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet29, objArray28);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet31 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet29);
        java.lang.Object[] objArray42 = new java.lang.Object[] { 10.0d, true, "", (byte) 10, "hi!", 1.0f, (short) -1, 0, 0L, (short) -1, objSet31, 1.0d, 1.0d, 0, 1L, (short) 10, (byte) 10, (-1), (short) -1, 10L, 0.0f };
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet43 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet43, objArray42);
        boolean boolean46 = objSet43.add((java.lang.Object) (byte) 0);
        java.lang.Object obj48 = objSet43.remove((int) (short) 1);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet49 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet43);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + true + "'", obj48, true);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        java.lang.Object[] objArray18 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet19 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet19, objArray18);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet21 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet19);
        java.lang.Object[] objArray50 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet51 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet51, objArray50);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet53 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet51);
        java.lang.Object[] objArray64 = new java.lang.Object[] { 10.0d, true, "", (byte) 10, "hi!", 1.0f, (short) -1, 0, 0L, (short) -1, objSet53, 1.0d, 1.0d, 0, 1L, (short) 10, (byte) 10, (-1), (short) -1, 10L, 0.0f };
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet65 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet65, objArray64);
        boolean boolean68 = objSet65.add((java.lang.Object) (byte) 0);
        org.apache.commons.collections.OrderedIterator<java.lang.Object> objItor69 = objSet65.iterator();
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet70 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.lang.Object>) objSet65);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet71 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet65);
        boolean boolean72 = objSet21.equals((java.lang.Object) objSet65);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objItor69);
        org.junit.Assert.assertNotNull(objSet70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.commons.collections.set.ListOrderedSet<java.lang.String> strSet0 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.String>();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        java.lang.Object[] objArray28 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet29 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet29, objArray28);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet31 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet29);
        java.lang.Object[] objArray42 = new java.lang.Object[] { 10.0d, true, "", (byte) 10, "hi!", 1.0f, (short) -1, 0, 0L, (short) -1, objSet31, 1.0d, 1.0d, 0, 1L, (short) 10, (byte) 10, (-1), (short) -1, 10L, 0.0f };
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet43 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet43, objArray42);
        boolean boolean46 = objSet43.add((java.lang.Object) (byte) 0);
        org.apache.commons.collections.OrderedIterator<java.lang.Object> objItor47 = objSet43.iterator();
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet48 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.lang.Object>) objSet43);
        java.lang.Object[] objArray68 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet69 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet69, objArray68);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet71 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet69);
        java.util.List<java.lang.Object> objList72 = objSet71.setOrder;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean73 = objSet43.addAll((int) (byte) 100, (java.util.Collection<java.lang.Object>) objSet71);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 17");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objItor47);
        org.junit.Assert.assertNotNull(objSet48);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(objList72);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        java.lang.Object[] objArray28 = new java.lang.Object[] { 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L) };
        java.util.LinkedHashSet<java.lang.Object> objSet29 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet29, objArray28);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet31 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>((java.util.Set<java.lang.Object>) objSet29);
        java.lang.Object[] objArray42 = new java.lang.Object[] { 10.0d, true, "", (byte) 10, "hi!", 1.0f, (short) -1, 0, 0L, (short) -1, objSet31, 1.0d, 1.0d, 0, 1L, (short) 10, (byte) 10, (-1), (short) -1, 10L, 0.0f };
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet43 = new org.apache.commons.collections.set.ListOrderedSet<java.lang.Object>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet43, objArray42);
        boolean boolean46 = objSet43.add((java.lang.Object) (byte) 0);
        org.apache.commons.collections.OrderedIterator<java.lang.Object> objItor47 = objSet43.iterator();
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet48 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.lang.Object>) objSet43);
        org.apache.commons.collections.set.ListOrderedSet<java.lang.Object> objSet49 = org.apache.commons.collections.set.ListOrderedSet.listOrderedSet((java.util.Set<java.lang.Object>) objSet43);
        boolean boolean51 = objSet43.equals((java.lang.Object) 100.0d);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10.0, true, , 10, hi!, 1.0, -1, 0, 0, -1, [100, -1.0,  , 0.0, 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1], 1.0, 1.0, 0, 1, 10, 10, -1, -1, 10, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objItor47);
        org.junit.Assert.assertNotNull(objSet48);
        org.junit.Assert.assertNotNull(objSet49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }
}

