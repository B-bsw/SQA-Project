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
        org.apache.commons.collections.map.CaseInsensitiveMap caseInsensitiveMap0 = new org.apache.commons.collections.map.CaseInsensitiveMap();
        org.apache.commons.collections.map.CaseInsensitiveMap caseInsensitiveMap1 = new org.apache.commons.collections.map.CaseInsensitiveMap();
        boolean boolean2 = caseInsensitiveMap1.isEmpty();
        boolean boolean3 = caseInsensitiveMap0.equals((java.lang.Object) caseInsensitiveMap1);
        java.util.Set set4 = caseInsensitiveMap1.entrySet();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.map.CaseInsensitiveMap caseInsensitiveMap1 = new org.apache.commons.collections.map.CaseInsensitiveMap((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Initial capacity must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.collections.map.CaseInsensitiveMap caseInsensitiveMap0 = new org.apache.commons.collections.map.CaseInsensitiveMap();
        org.apache.commons.collections.map.CaseInsensitiveMap caseInsensitiveMap1 = new org.apache.commons.collections.map.CaseInsensitiveMap();
        boolean boolean2 = caseInsensitiveMap1.isEmpty();
        boolean boolean3 = caseInsensitiveMap0.equals((java.lang.Object) caseInsensitiveMap1);
        java.lang.Object obj5 = caseInsensitiveMap0.get((java.lang.Object) 'a');
        caseInsensitiveMap0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.collections.map.CaseInsensitiveMap caseInsensitiveMap1 = new org.apache.commons.collections.map.CaseInsensitiveMap((int) 'a');
        java.lang.Object obj4 = caseInsensitiveMap1.put((java.lang.Object) "", (java.lang.Object) true);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.collections.map.CaseInsensitiveMap caseInsensitiveMap0 = new org.apache.commons.collections.map.CaseInsensitiveMap();
        java.util.Collection collection1 = caseInsensitiveMap0.values();
        java.lang.Object obj3 = caseInsensitiveMap0.convertKey((java.lang.Object) (short) 1);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "1" + "'", obj3, "1");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.collections.map.CaseInsensitiveMap caseInsensitiveMap0 = new org.apache.commons.collections.map.CaseInsensitiveMap();
        java.lang.Object obj2 = caseInsensitiveMap0.get((java.lang.Object) 0.0f);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.map.CaseInsensitiveMap caseInsensitiveMap2 = new org.apache.commons.collections.map.CaseInsensitiveMap((int) (byte) -1, (float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Initial capacity must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.collections.map.CaseInsensitiveMap caseInsensitiveMap2 = new org.apache.commons.collections.map.CaseInsensitiveMap((int) (byte) 1, (float) 1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.collections.map.CaseInsensitiveMap caseInsensitiveMap0 = new org.apache.commons.collections.map.CaseInsensitiveMap();
        org.apache.commons.collections.map.CaseInsensitiveMap caseInsensitiveMap1 = new org.apache.commons.collections.map.CaseInsensitiveMap();
        boolean boolean2 = caseInsensitiveMap1.isEmpty();
        boolean boolean3 = caseInsensitiveMap0.equals((java.lang.Object) caseInsensitiveMap1);
        int int4 = caseInsensitiveMap0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.collections.map.CaseInsensitiveMap caseInsensitiveMap0 = new org.apache.commons.collections.map.CaseInsensitiveMap();
        org.apache.commons.collections.map.CaseInsensitiveMap caseInsensitiveMap1 = new org.apache.commons.collections.map.CaseInsensitiveMap();
        org.apache.commons.collections.map.CaseInsensitiveMap caseInsensitiveMap2 = new org.apache.commons.collections.map.CaseInsensitiveMap();
        boolean boolean3 = caseInsensitiveMap2.isEmpty();
        boolean boolean4 = caseInsensitiveMap1.equals((java.lang.Object) caseInsensitiveMap2);
        caseInsensitiveMap0.putAll((java.util.Map) caseInsensitiveMap1);
        org.apache.commons.collections.MapIterator mapIterator6 = caseInsensitiveMap0.mapIterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(mapIterator6);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.collections.map.CaseInsensitiveMap caseInsensitiveMap0 = new org.apache.commons.collections.map.CaseInsensitiveMap();
        org.apache.commons.collections.map.CaseInsensitiveMap caseInsensitiveMap1 = new org.apache.commons.collections.map.CaseInsensitiveMap();
        boolean boolean2 = caseInsensitiveMap1.isEmpty();
        boolean boolean3 = caseInsensitiveMap0.equals((java.lang.Object) caseInsensitiveMap1);
        org.apache.commons.collections.MapIterator mapIterator4 = caseInsensitiveMap1.mapIterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(mapIterator4);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.collections.map.CaseInsensitiveMap caseInsensitiveMap1 = new org.apache.commons.collections.map.CaseInsensitiveMap((int) (byte) 100);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.collections.map.CaseInsensitiveMap caseInsensitiveMap0 = new org.apache.commons.collections.map.CaseInsensitiveMap();
        org.apache.commons.collections.map.CaseInsensitiveMap caseInsensitiveMap1 = new org.apache.commons.collections.map.CaseInsensitiveMap();
        boolean boolean2 = caseInsensitiveMap1.isEmpty();
        boolean boolean3 = caseInsensitiveMap0.equals((java.lang.Object) caseInsensitiveMap1);
        java.lang.Object obj5 = caseInsensitiveMap0.get((java.lang.Object) 'a');
        java.util.Set set6 = caseInsensitiveMap0.keySet();
        java.util.Set set7 = caseInsensitiveMap0.entrySet();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.map.CaseInsensitiveMap caseInsensitiveMap1 = new org.apache.commons.collections.map.CaseInsensitiveMap(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Initial capacity must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.collections.map.CaseInsensitiveMap caseInsensitiveMap0 = new org.apache.commons.collections.map.CaseInsensitiveMap();
        org.apache.commons.collections.map.CaseInsensitiveMap caseInsensitiveMap1 = new org.apache.commons.collections.map.CaseInsensitiveMap();
        boolean boolean2 = caseInsensitiveMap1.isEmpty();
        boolean boolean3 = caseInsensitiveMap0.equals((java.lang.Object) caseInsensitiveMap1);
        java.lang.Object obj5 = caseInsensitiveMap0.get((java.lang.Object) 'a');
        java.lang.Object obj6 = caseInsensitiveMap0.clone();
        java.lang.Object obj7 = caseInsensitiveMap0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "{}");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "{}");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.collections.map.CaseInsensitiveMap caseInsensitiveMap0 = new org.apache.commons.collections.map.CaseInsensitiveMap();
        org.apache.commons.collections.map.CaseInsensitiveMap caseInsensitiveMap1 = new org.apache.commons.collections.map.CaseInsensitiveMap();
        boolean boolean2 = caseInsensitiveMap1.isEmpty();
        boolean boolean3 = caseInsensitiveMap0.equals((java.lang.Object) caseInsensitiveMap1);
        java.lang.Object obj5 = caseInsensitiveMap0.get((java.lang.Object) 'a');
        boolean boolean7 = caseInsensitiveMap0.equals((java.lang.Object) 10.0d);
        boolean boolean9 = caseInsensitiveMap0.containsValue((java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.collections.map.CaseInsensitiveMap caseInsensitiveMap0 = new org.apache.commons.collections.map.CaseInsensitiveMap();
        org.apache.commons.collections.map.CaseInsensitiveMap caseInsensitiveMap1 = new org.apache.commons.collections.map.CaseInsensitiveMap();
        boolean boolean2 = caseInsensitiveMap1.isEmpty();
        boolean boolean3 = caseInsensitiveMap0.equals((java.lang.Object) caseInsensitiveMap1);
        java.lang.Object obj5 = caseInsensitiveMap0.get((java.lang.Object) 'a');
        boolean boolean7 = caseInsensitiveMap0.equals((java.lang.Object) 10.0d);
        java.lang.Object obj9 = caseInsensitiveMap0.get((java.lang.Object) 0L);
        org.apache.commons.collections.map.CaseInsensitiveMap caseInsensitiveMap10 = new org.apache.commons.collections.map.CaseInsensitiveMap();
        org.apache.commons.collections.map.CaseInsensitiveMap caseInsensitiveMap11 = new org.apache.commons.collections.map.CaseInsensitiveMap();
        org.apache.commons.collections.map.CaseInsensitiveMap caseInsensitiveMap12 = new org.apache.commons.collections.map.CaseInsensitiveMap();
        boolean boolean13 = caseInsensitiveMap12.isEmpty();
        boolean boolean14 = caseInsensitiveMap11.equals((java.lang.Object) caseInsensitiveMap12);
        caseInsensitiveMap10.putAll((java.util.Map) caseInsensitiveMap11);
        java.lang.Object obj16 = caseInsensitiveMap0.remove((java.lang.Object) caseInsensitiveMap11);
        java.util.Set set17 = caseInsensitiveMap11.entrySet();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.collections.map.CaseInsensitiveMap caseInsensitiveMap0 = new org.apache.commons.collections.map.CaseInsensitiveMap();
        org.apache.commons.collections.map.CaseInsensitiveMap caseInsensitiveMap1 = new org.apache.commons.collections.map.CaseInsensitiveMap();
        boolean boolean2 = caseInsensitiveMap1.isEmpty();
        boolean boolean3 = caseInsensitiveMap0.equals((java.lang.Object) caseInsensitiveMap1);
        java.lang.Object obj5 = caseInsensitiveMap0.get((java.lang.Object) 'a');
        boolean boolean7 = caseInsensitiveMap0.equals((java.lang.Object) 10.0d);
        java.lang.Object obj9 = caseInsensitiveMap0.get((java.lang.Object) 0L);
        org.apache.commons.collections.map.CaseInsensitiveMap caseInsensitiveMap10 = new org.apache.commons.collections.map.CaseInsensitiveMap();
        org.apache.commons.collections.map.CaseInsensitiveMap caseInsensitiveMap11 = new org.apache.commons.collections.map.CaseInsensitiveMap();
        org.apache.commons.collections.map.CaseInsensitiveMap caseInsensitiveMap12 = new org.apache.commons.collections.map.CaseInsensitiveMap();
        boolean boolean13 = caseInsensitiveMap12.isEmpty();
        boolean boolean14 = caseInsensitiveMap11.equals((java.lang.Object) caseInsensitiveMap12);
        caseInsensitiveMap10.putAll((java.util.Map) caseInsensitiveMap11);
        java.lang.Object obj16 = caseInsensitiveMap0.remove((java.lang.Object) caseInsensitiveMap11);
        java.lang.Object obj18 = caseInsensitiveMap11.convertKey((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "-1" + "'", obj18, "-1");
    }
}

