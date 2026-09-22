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
        java.util.Map map0 = null;
        org.apache.commons.collections.Factory factory1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.map.MultiValueMap multiValueMap2 = org.apache.commons.collections.map.MultiValueMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Map must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.util.Map map0 = null;
        org.apache.commons.collections.Factory factory1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.map.MultiValueMap multiValueMap2 = new org.apache.commons.collections.map.MultiValueMap(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Map must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.util.Map map0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.map.MultiValueMap multiValueMap3 = org.apache.commons.collections.map.MultiValueMap.decorate(map0, (java.lang.Class) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Map must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.util.Map map0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.map.MultiValueMap multiValueMap1 = org.apache.commons.collections.map.MultiValueMap.decorate(map0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Map must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.util.Map map0 = null;
        java.lang.Class class1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.map.MultiValueMap multiValueMap2 = org.apache.commons.collections.map.MultiValueMap.decorate(map0, class1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Map must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.collections.map.MultiValueMap multiValueMap0 = new org.apache.commons.collections.map.MultiValueMap();
        int int1 = multiValueMap0.size();
        int int3 = multiValueMap0.size((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.collections.map.MultiValueMap multiValueMap0 = new org.apache.commons.collections.map.MultiValueMap();
        int int1 = multiValueMap0.size();
        int int2 = multiValueMap0.totalSize();
        int int3 = multiValueMap0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.collections.map.MultiValueMap multiValueMap0 = new org.apache.commons.collections.map.MultiValueMap();
        int int1 = multiValueMap0.size();
        int int2 = multiValueMap0.totalSize();
        org.apache.commons.collections.map.MultiValueMap multiValueMap3 = new org.apache.commons.collections.map.MultiValueMap();
        int int4 = multiValueMap3.size();
        int int5 = multiValueMap3.totalSize();
        java.util.Collection collection7 = null;
        boolean boolean8 = multiValueMap3.putAll((java.lang.Object) 0.0f, collection7);
        java.util.Iterator iterator9 = multiValueMap0.iterator((java.lang.Object) 0.0f);
        java.util.Collection collection10 = multiValueMap0.values();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.collections.map.MultiValueMap multiValueMap0 = new org.apache.commons.collections.map.MultiValueMap();
        int int1 = multiValueMap0.size();
        org.apache.commons.collections.map.MultiValueMap multiValueMap3 = new org.apache.commons.collections.map.MultiValueMap();
        int int4 = multiValueMap3.size();
        int int5 = multiValueMap3.totalSize();
        org.apache.commons.collections.map.MultiValueMap multiValueMap6 = new org.apache.commons.collections.map.MultiValueMap();
        int int7 = multiValueMap6.size();
        int int8 = multiValueMap6.totalSize();
        java.util.Collection collection10 = null;
        boolean boolean11 = multiValueMap6.putAll((java.lang.Object) 0.0f, collection10);
        java.util.Iterator iterator12 = multiValueMap3.iterator((java.lang.Object) 0.0f);
        boolean boolean13 = multiValueMap0.containsValue((java.lang.Object) 10.0d, (java.lang.Object) 0.0f);
        org.apache.commons.collections.map.MultiValueMap multiValueMap14 = new org.apache.commons.collections.map.MultiValueMap();
        int int15 = multiValueMap14.size();
        boolean boolean17 = multiValueMap14.containsValue((java.lang.Object) true);
        java.util.Collection collection19 = multiValueMap14.createCollection((int) (short) 1);
        boolean boolean20 = multiValueMap0.containsValue((java.lang.Object) collection19);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.collections.map.MultiValueMap multiValueMap0 = new org.apache.commons.collections.map.MultiValueMap();
        int int1 = multiValueMap0.size();
        int int2 = multiValueMap0.totalSize();
        boolean boolean3 = multiValueMap0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.collections.map.MultiValueMap multiValueMap0 = new org.apache.commons.collections.map.MultiValueMap();
        int int1 = multiValueMap0.size();
        java.util.Collection collection3 = multiValueMap0.getCollection((java.lang.Object) 100L);
        org.apache.commons.collections.Factory factory4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.map.MultiValueMap multiValueMap5 = org.apache.commons.collections.map.MultiValueMap.decorate((java.util.Map) multiValueMap0, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The factory must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(collection3);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.collections.map.MultiValueMap multiValueMap0 = new org.apache.commons.collections.map.MultiValueMap();
        int int1 = multiValueMap0.size();
        java.util.Collection collection3 = multiValueMap0.getCollection((java.lang.Object) 100L);
        java.util.Set set4 = multiValueMap0.keySet();
        java.lang.String str5 = multiValueMap0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{}" + "'", str5, "{}");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.collections.map.MultiValueMap multiValueMap0 = new org.apache.commons.collections.map.MultiValueMap();
        int int1 = multiValueMap0.size();
        int int2 = multiValueMap0.totalSize();
        java.util.Collection collection4 = null;
        boolean boolean5 = multiValueMap0.putAll((java.lang.Object) 0.0f, collection4);
        boolean boolean7 = multiValueMap0.equals((java.lang.Object) 1.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.collections.map.MultiValueMap multiValueMap0 = new org.apache.commons.collections.map.MultiValueMap();
        int int1 = multiValueMap0.size();
        org.apache.commons.collections.map.MultiValueMap multiValueMap3 = new org.apache.commons.collections.map.MultiValueMap();
        int int4 = multiValueMap3.size();
        int int5 = multiValueMap3.totalSize();
        org.apache.commons.collections.map.MultiValueMap multiValueMap6 = new org.apache.commons.collections.map.MultiValueMap();
        int int7 = multiValueMap6.size();
        int int8 = multiValueMap6.totalSize();
        java.util.Collection collection10 = null;
        boolean boolean11 = multiValueMap6.putAll((java.lang.Object) 0.0f, collection10);
        java.util.Iterator iterator12 = multiValueMap3.iterator((java.lang.Object) 0.0f);
        boolean boolean13 = multiValueMap0.containsValue((java.lang.Object) 10.0d, (java.lang.Object) 0.0f);
        org.apache.commons.collections.map.MultiValueMap multiValueMap14 = new org.apache.commons.collections.map.MultiValueMap();
        int int15 = multiValueMap14.size();
        java.util.Iterator iterator17 = multiValueMap14.iterator((java.lang.Object) (-1.0f));
        java.lang.Object obj19 = multiValueMap0.removeMapping((java.lang.Object) iterator17, (java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.collections.map.MultiValueMap multiValueMap0 = new org.apache.commons.collections.map.MultiValueMap();
        int int1 = multiValueMap0.size();
        int int2 = multiValueMap0.totalSize();
        int int4 = multiValueMap0.size((java.lang.Object) 10);
        java.util.Set set5 = multiValueMap0.keySet();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.collections.map.MultiValueMap multiValueMap0 = new org.apache.commons.collections.map.MultiValueMap();
        int int1 = multiValueMap0.size();
        int int2 = multiValueMap0.totalSize();
        java.util.Set set3 = multiValueMap0.keySet();
        boolean boolean4 = multiValueMap0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.collections.map.MultiValueMap multiValueMap0 = new org.apache.commons.collections.map.MultiValueMap();
        org.apache.commons.collections.map.MultiValueMap multiValueMap1 = org.apache.commons.collections.map.MultiValueMap.decorate((java.util.Map) multiValueMap0);
        org.junit.Assert.assertNotNull(multiValueMap1);
    }
}

