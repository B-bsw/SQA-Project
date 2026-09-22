package org.apache.commons.collections;

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
        java.util.Collection collection0 = null;
        java.util.Collection collection1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection2 = org.apache.commons.collections.CollectionUtils.union(collection0, collection1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.util.Collection collection0 = null;
        org.apache.commons.collections.Predicate predicate1 = null;
        int int2 = org.apache.commons.collections.CollectionUtils.countMatches(collection0, predicate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.Object obj2 = org.apache.commons.collections.CollectionUtils.index((java.lang.Object) 0.0d, 0);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 0.0d + "'", obj2, 0.0d);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.util.Iterator iterator0 = null;
        org.apache.commons.collections.Transformer transformer1 = null;
        java.util.Collection collection2 = org.apache.commons.collections.CollectionUtils.collect(iterator0, transformer1);
        int int3 = org.apache.commons.collections.CollectionUtils.maxSize(collection2);
        org.apache.commons.collections.Predicate predicate4 = null;
        org.apache.commons.collections.CollectionUtils.filter(collection2, predicate4);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.apache.commons.collections.CollectionUtils.get((java.lang.Object) 0.0f, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.util.Iterator iterator0 = null;
        org.apache.commons.collections.Transformer transformer1 = null;
        java.util.Collection collection2 = org.apache.commons.collections.CollectionUtils.collect(iterator0, transformer1);
        java.util.Collection collection3 = org.apache.commons.collections.CollectionUtils.synchronizedCollection(collection2);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.util.Iterator iterator0 = null;
        org.apache.commons.collections.Transformer transformer1 = null;
        java.util.Collection collection2 = org.apache.commons.collections.CollectionUtils.collect(iterator0, transformer1);
        int int3 = org.apache.commons.collections.CollectionUtils.maxSize(collection2);
        org.apache.commons.collections.Predicate predicate4 = null;
        java.util.Iterator iterator5 = null;
        org.apache.commons.collections.Transformer transformer6 = null;
        java.util.Collection collection7 = org.apache.commons.collections.CollectionUtils.collect(iterator5, transformer6);
        org.apache.commons.collections.CollectionUtils.select(collection2, predicate4, collection7);
        java.util.Iterator iterator9 = null;
        org.apache.commons.collections.Transformer transformer10 = null;
        java.util.Collection collection11 = org.apache.commons.collections.CollectionUtils.collect(iterator9, transformer10);
        org.apache.commons.collections.Predicate predicate12 = null;
        java.util.Collection collection13 = null;
        org.apache.commons.collections.CollectionUtils.selectRejected(collection11, predicate12, collection13);
        java.util.Collection collection15 = org.apache.commons.collections.CollectionUtils.retainAll(collection7, collection11);
        org.apache.commons.collections.Predicate predicate16 = null;
        int int17 = org.apache.commons.collections.CollectionUtils.countMatches(collection15, predicate16);
        org.apache.commons.collections.Predicate predicate18 = null;
        java.util.Iterator iterator19 = null;
        org.apache.commons.collections.Transformer transformer20 = null;
        java.util.Collection collection21 = org.apache.commons.collections.CollectionUtils.collect(iterator19, transformer20);
        int int22 = org.apache.commons.collections.CollectionUtils.maxSize(collection21);
        org.apache.commons.collections.Predicate predicate23 = null;
        java.util.Iterator iterator24 = null;
        org.apache.commons.collections.Transformer transformer25 = null;
        java.util.Collection collection26 = org.apache.commons.collections.CollectionUtils.collect(iterator24, transformer25);
        org.apache.commons.collections.CollectionUtils.select(collection21, predicate23, collection26);
        org.apache.commons.collections.CollectionUtils.selectRejected(collection15, predicate18, collection26);
        java.util.Enumeration enumeration29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections.CollectionUtils.addAll(collection15, enumeration29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.util.Iterator iterator0 = null;
        org.apache.commons.collections.Transformer transformer1 = null;
        java.util.Collection collection2 = org.apache.commons.collections.CollectionUtils.collect(iterator0, transformer1);
        int int3 = org.apache.commons.collections.CollectionUtils.maxSize(collection2);
        org.apache.commons.collections.Predicate predicate4 = null;
        java.util.Iterator iterator5 = null;
        org.apache.commons.collections.Transformer transformer6 = null;
        java.util.Collection collection7 = org.apache.commons.collections.CollectionUtils.collect(iterator5, transformer6);
        org.apache.commons.collections.CollectionUtils.select(collection2, predicate4, collection7);
        java.util.Iterator iterator9 = null;
        org.apache.commons.collections.Transformer transformer10 = null;
        java.util.Collection collection11 = org.apache.commons.collections.CollectionUtils.collect(iterator9, transformer10);
        org.apache.commons.collections.Predicate predicate12 = null;
        java.util.Collection collection13 = null;
        org.apache.commons.collections.CollectionUtils.selectRejected(collection11, predicate12, collection13);
        java.util.Collection collection15 = org.apache.commons.collections.CollectionUtils.retainAll(collection7, collection11);
        org.apache.commons.collections.Predicate predicate16 = null;
        int int17 = org.apache.commons.collections.CollectionUtils.countMatches(collection15, predicate16);
        java.lang.Class class18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection19 = org.apache.commons.collections.CollectionUtils.typedCollection(collection15, class18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The type to check instanceof must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections.CollectionUtils.sizeIsEmpty((java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.util.Iterator iterator0 = null;
        org.apache.commons.collections.Transformer transformer1 = null;
        java.util.Collection collection2 = org.apache.commons.collections.CollectionUtils.collect(iterator0, transformer1);
        int int3 = org.apache.commons.collections.CollectionUtils.maxSize(collection2);
        org.apache.commons.collections.Predicate predicate4 = null;
        java.util.Iterator iterator5 = null;
        org.apache.commons.collections.Transformer transformer6 = null;
        java.util.Collection collection7 = org.apache.commons.collections.CollectionUtils.collect(iterator5, transformer6);
        org.apache.commons.collections.CollectionUtils.select(collection2, predicate4, collection7);
        java.util.Iterator iterator9 = null;
        org.apache.commons.collections.Transformer transformer10 = null;
        java.util.Collection collection11 = org.apache.commons.collections.CollectionUtils.collect(iterator9, transformer10);
        org.apache.commons.collections.Predicate predicate12 = null;
        java.util.Collection collection13 = null;
        org.apache.commons.collections.CollectionUtils.selectRejected(collection11, predicate12, collection13);
        java.util.Collection collection15 = org.apache.commons.collections.CollectionUtils.retainAll(collection7, collection11);
        java.util.Iterator iterator16 = null;
        org.apache.commons.collections.Transformer transformer17 = null;
        java.util.Collection collection18 = org.apache.commons.collections.CollectionUtils.collect(iterator16, transformer17);
        int int19 = org.apache.commons.collections.CollectionUtils.maxSize(collection18);
        org.apache.commons.collections.Predicate predicate20 = null;
        java.util.Iterator iterator21 = null;
        org.apache.commons.collections.Transformer transformer22 = null;
        java.util.Collection collection23 = org.apache.commons.collections.CollectionUtils.collect(iterator21, transformer22);
        org.apache.commons.collections.CollectionUtils.select(collection18, predicate20, collection23);
        java.util.Iterator iterator25 = null;
        org.apache.commons.collections.Transformer transformer26 = null;
        java.util.Collection collection27 = org.apache.commons.collections.CollectionUtils.collect(iterator25, transformer26);
        org.apache.commons.collections.Predicate predicate28 = null;
        java.util.Collection collection29 = null;
        org.apache.commons.collections.CollectionUtils.selectRejected(collection27, predicate28, collection29);
        java.util.Collection collection31 = org.apache.commons.collections.CollectionUtils.retainAll(collection23, collection27);
        java.util.Collection collection32 = org.apache.commons.collections.CollectionUtils.intersection(collection11, collection31);
        java.lang.Class<?> wildcardClass33 = collection11.getClass();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.util.Iterator iterator0 = null;
        org.apache.commons.collections.Transformer transformer1 = null;
        java.util.Collection collection2 = org.apache.commons.collections.CollectionUtils.collect(iterator0, transformer1);
        int int3 = org.apache.commons.collections.CollectionUtils.maxSize(collection2);
        org.apache.commons.collections.Predicate predicate4 = null;
        java.util.Iterator iterator5 = null;
        org.apache.commons.collections.Transformer transformer6 = null;
        java.util.Collection collection7 = org.apache.commons.collections.CollectionUtils.collect(iterator5, transformer6);
        org.apache.commons.collections.CollectionUtils.select(collection2, predicate4, collection7);
        java.util.Iterator iterator9 = null;
        org.apache.commons.collections.Transformer transformer10 = null;
        java.util.Collection collection11 = org.apache.commons.collections.CollectionUtils.collect(iterator9, transformer10);
        org.apache.commons.collections.Predicate predicate12 = null;
        java.util.Collection collection13 = null;
        org.apache.commons.collections.CollectionUtils.selectRejected(collection11, predicate12, collection13);
        java.util.Collection collection15 = org.apache.commons.collections.CollectionUtils.retainAll(collection7, collection11);
        org.apache.commons.collections.Predicate predicate16 = null;
        int int17 = org.apache.commons.collections.CollectionUtils.countMatches(collection15, predicate16);
        org.apache.commons.collections.Transformer transformer18 = null;
        java.util.Collection collection19 = org.apache.commons.collections.CollectionUtils.collect(collection15, transformer18);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.util.Iterator iterator0 = null;
        org.apache.commons.collections.Transformer transformer1 = null;
        java.util.Collection collection2 = org.apache.commons.collections.CollectionUtils.collect(iterator0, transformer1);
        int int3 = org.apache.commons.collections.CollectionUtils.maxSize(collection2);
        org.apache.commons.collections.Predicate predicate4 = null;
        java.util.Iterator iterator5 = null;
        org.apache.commons.collections.Transformer transformer6 = null;
        java.util.Collection collection7 = org.apache.commons.collections.CollectionUtils.collect(iterator5, transformer6);
        org.apache.commons.collections.CollectionUtils.select(collection2, predicate4, collection7);
        java.util.Iterator iterator9 = null;
        org.apache.commons.collections.Transformer transformer10 = null;
        java.util.Collection collection11 = org.apache.commons.collections.CollectionUtils.collect(iterator9, transformer10);
        org.apache.commons.collections.Predicate predicate12 = null;
        java.util.Collection collection13 = null;
        org.apache.commons.collections.CollectionUtils.selectRejected(collection11, predicate12, collection13);
        java.util.Collection collection15 = org.apache.commons.collections.CollectionUtils.retainAll(collection7, collection11);
        java.util.Iterator iterator16 = null;
        org.apache.commons.collections.Transformer transformer17 = null;
        java.util.Collection collection18 = org.apache.commons.collections.CollectionUtils.collect(iterator16, transformer17);
        int int19 = org.apache.commons.collections.CollectionUtils.maxSize(collection18);
        org.apache.commons.collections.Predicate predicate20 = null;
        java.util.Iterator iterator21 = null;
        org.apache.commons.collections.Transformer transformer22 = null;
        java.util.Collection collection23 = org.apache.commons.collections.CollectionUtils.collect(iterator21, transformer22);
        org.apache.commons.collections.CollectionUtils.select(collection18, predicate20, collection23);
        java.util.Iterator iterator25 = null;
        org.apache.commons.collections.Transformer transformer26 = null;
        java.util.Collection collection27 = org.apache.commons.collections.CollectionUtils.collect(iterator25, transformer26);
        org.apache.commons.collections.Predicate predicate28 = null;
        java.util.Collection collection29 = null;
        org.apache.commons.collections.CollectionUtils.selectRejected(collection27, predicate28, collection29);
        java.util.Collection collection31 = org.apache.commons.collections.CollectionUtils.retainAll(collection23, collection27);
        java.util.Iterator iterator32 = null;
        org.apache.commons.collections.Transformer transformer33 = null;
        java.util.Collection collection34 = org.apache.commons.collections.CollectionUtils.collect(iterator32, transformer33);
        int int35 = org.apache.commons.collections.CollectionUtils.maxSize(collection34);
        org.apache.commons.collections.Predicate predicate36 = null;
        java.util.Iterator iterator37 = null;
        org.apache.commons.collections.Transformer transformer38 = null;
        java.util.Collection collection39 = org.apache.commons.collections.CollectionUtils.collect(iterator37, transformer38);
        org.apache.commons.collections.CollectionUtils.select(collection34, predicate36, collection39);
        java.util.Iterator iterator41 = null;
        org.apache.commons.collections.Transformer transformer42 = null;
        java.util.Collection collection43 = org.apache.commons.collections.CollectionUtils.collect(iterator41, transformer42);
        org.apache.commons.collections.Predicate predicate44 = null;
        java.util.Collection collection45 = null;
        org.apache.commons.collections.CollectionUtils.selectRejected(collection43, predicate44, collection45);
        java.util.Collection collection47 = org.apache.commons.collections.CollectionUtils.retainAll(collection39, collection43);
        java.util.Collection collection48 = org.apache.commons.collections.CollectionUtils.intersection(collection27, collection47);
        boolean boolean50 = org.apache.commons.collections.CollectionUtils.addIgnoreNull(collection48, (java.lang.Object) (short) -1);
        java.util.Collection collection51 = org.apache.commons.collections.CollectionUtils.intersection(collection15, collection48);
        boolean boolean52 = org.apache.commons.collections.CollectionUtils.isEmpty(collection15);
        java.util.Iterator iterator53 = null;
        org.apache.commons.collections.Transformer transformer54 = null;
        java.util.Collection collection55 = org.apache.commons.collections.CollectionUtils.collect(iterator53, transformer54);
        int int56 = org.apache.commons.collections.CollectionUtils.maxSize(collection55);
        org.apache.commons.collections.Predicate predicate57 = null;
        java.util.Iterator iterator58 = null;
        org.apache.commons.collections.Transformer transformer59 = null;
        java.util.Collection collection60 = org.apache.commons.collections.CollectionUtils.collect(iterator58, transformer59);
        org.apache.commons.collections.CollectionUtils.select(collection55, predicate57, collection60);
        java.util.Iterator iterator62 = null;
        org.apache.commons.collections.Transformer transformer63 = null;
        java.util.Collection collection64 = org.apache.commons.collections.CollectionUtils.collect(iterator62, transformer63);
        org.apache.commons.collections.Predicate predicate65 = null;
        java.util.Collection collection66 = null;
        org.apache.commons.collections.CollectionUtils.selectRejected(collection64, predicate65, collection66);
        java.util.Collection collection68 = org.apache.commons.collections.CollectionUtils.retainAll(collection60, collection64);
        boolean boolean69 = org.apache.commons.collections.CollectionUtils.isEmpty(collection60);
        boolean boolean70 = org.apache.commons.collections.CollectionUtils.isEmpty(collection60);
        boolean boolean71 = org.apache.commons.collections.CollectionUtils.isEqualCollection(collection15, collection60);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.collections.CollectionUtils collectionUtils0 = new org.apache.commons.collections.CollectionUtils();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.util.Collection collection0 = null;
        java.util.Iterator iterator1 = null;
        org.apache.commons.collections.Transformer transformer2 = null;
        java.util.Collection collection3 = org.apache.commons.collections.CollectionUtils.collect(iterator1, transformer2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.apache.commons.collections.CollectionUtils.isSubCollection(collection0, collection3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.util.Iterator iterator0 = null;
        org.apache.commons.collections.Transformer transformer1 = null;
        java.util.Collection collection2 = org.apache.commons.collections.CollectionUtils.collect(iterator0, transformer1);
        int int3 = org.apache.commons.collections.CollectionUtils.maxSize(collection2);
        org.apache.commons.collections.Predicate predicate4 = null;
        java.util.Iterator iterator5 = null;
        org.apache.commons.collections.Transformer transformer6 = null;
        java.util.Collection collection7 = org.apache.commons.collections.CollectionUtils.collect(iterator5, transformer6);
        org.apache.commons.collections.CollectionUtils.select(collection2, predicate4, collection7);
        java.util.Iterator iterator9 = null;
        org.apache.commons.collections.Transformer transformer10 = null;
        java.util.Collection collection11 = org.apache.commons.collections.CollectionUtils.collect(iterator9, transformer10);
        org.apache.commons.collections.Predicate predicate12 = null;
        java.util.Collection collection13 = null;
        org.apache.commons.collections.CollectionUtils.selectRejected(collection11, predicate12, collection13);
        java.util.Collection collection15 = org.apache.commons.collections.CollectionUtils.retainAll(collection7, collection11);
        java.util.Iterator iterator16 = null;
        org.apache.commons.collections.Transformer transformer17 = null;
        java.util.Collection collection18 = org.apache.commons.collections.CollectionUtils.collect(iterator16, transformer17);
        int int19 = org.apache.commons.collections.CollectionUtils.maxSize(collection18);
        org.apache.commons.collections.Predicate predicate20 = null;
        java.util.Iterator iterator21 = null;
        org.apache.commons.collections.Transformer transformer22 = null;
        java.util.Collection collection23 = org.apache.commons.collections.CollectionUtils.collect(iterator21, transformer22);
        org.apache.commons.collections.CollectionUtils.select(collection18, predicate20, collection23);
        java.util.Iterator iterator25 = null;
        org.apache.commons.collections.Transformer transformer26 = null;
        java.util.Collection collection27 = org.apache.commons.collections.CollectionUtils.collect(iterator25, transformer26);
        org.apache.commons.collections.Predicate predicate28 = null;
        java.util.Collection collection29 = null;
        org.apache.commons.collections.CollectionUtils.selectRejected(collection27, predicate28, collection29);
        java.util.Collection collection31 = org.apache.commons.collections.CollectionUtils.retainAll(collection23, collection27);
        java.util.Collection collection32 = org.apache.commons.collections.CollectionUtils.intersection(collection11, collection31);
        boolean boolean34 = org.apache.commons.collections.CollectionUtils.addIgnoreNull(collection32, (java.lang.Object) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = org.apache.commons.collections.CollectionUtils.index((java.lang.Object) collection32, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.util.Iterator iterator0 = null;
        org.apache.commons.collections.Transformer transformer1 = null;
        java.util.Collection collection2 = org.apache.commons.collections.CollectionUtils.collect(iterator0, transformer1);
        int int3 = org.apache.commons.collections.CollectionUtils.maxSize(collection2);
        org.apache.commons.collections.Predicate predicate4 = null;
        java.util.Iterator iterator5 = null;
        org.apache.commons.collections.Transformer transformer6 = null;
        java.util.Collection collection7 = org.apache.commons.collections.CollectionUtils.collect(iterator5, transformer6);
        org.apache.commons.collections.CollectionUtils.select(collection2, predicate4, collection7);
        java.util.Iterator iterator9 = null;
        org.apache.commons.collections.Transformer transformer10 = null;
        java.util.Collection collection11 = org.apache.commons.collections.CollectionUtils.collect(iterator9, transformer10);
        org.apache.commons.collections.Predicate predicate12 = null;
        java.util.Collection collection13 = null;
        org.apache.commons.collections.CollectionUtils.selectRejected(collection11, predicate12, collection13);
        java.util.Collection collection15 = org.apache.commons.collections.CollectionUtils.retainAll(collection7, collection11);
        java.util.Iterator iterator16 = null;
        org.apache.commons.collections.Transformer transformer17 = null;
        java.util.Collection collection18 = org.apache.commons.collections.CollectionUtils.collect(iterator16, transformer17);
        int int19 = org.apache.commons.collections.CollectionUtils.maxSize(collection18);
        org.apache.commons.collections.Predicate predicate20 = null;
        java.util.Iterator iterator21 = null;
        org.apache.commons.collections.Transformer transformer22 = null;
        java.util.Collection collection23 = org.apache.commons.collections.CollectionUtils.collect(iterator21, transformer22);
        org.apache.commons.collections.CollectionUtils.select(collection18, predicate20, collection23);
        java.util.Iterator iterator25 = null;
        org.apache.commons.collections.Transformer transformer26 = null;
        java.util.Collection collection27 = org.apache.commons.collections.CollectionUtils.collect(iterator25, transformer26);
        org.apache.commons.collections.Predicate predicate28 = null;
        java.util.Collection collection29 = null;
        org.apache.commons.collections.CollectionUtils.selectRejected(collection27, predicate28, collection29);
        java.util.Collection collection31 = org.apache.commons.collections.CollectionUtils.retainAll(collection23, collection27);
        java.util.Collection collection32 = org.apache.commons.collections.CollectionUtils.intersection(collection11, collection31);
        java.util.Iterator iterator33 = null;
        org.apache.commons.collections.Transformer transformer34 = null;
        java.util.Collection collection35 = org.apache.commons.collections.CollectionUtils.collect(iterator33, transformer34);
        int int36 = org.apache.commons.collections.CollectionUtils.maxSize(collection35);
        org.apache.commons.collections.Predicate predicate37 = null;
        java.util.Iterator iterator38 = null;
        org.apache.commons.collections.Transformer transformer39 = null;
        java.util.Collection collection40 = org.apache.commons.collections.CollectionUtils.collect(iterator38, transformer39);
        org.apache.commons.collections.CollectionUtils.select(collection35, predicate37, collection40);
        java.util.Collection collection42 = org.apache.commons.collections.CollectionUtils.subtract(collection11, collection35);
        java.util.Iterator iterator43 = null;
        org.apache.commons.collections.Transformer transformer44 = null;
        java.util.Collection collection45 = org.apache.commons.collections.CollectionUtils.collect(iterator43, transformer44);
        int int46 = org.apache.commons.collections.CollectionUtils.maxSize(collection45);
        org.apache.commons.collections.Predicate predicate47 = null;
        java.util.Iterator iterator48 = null;
        org.apache.commons.collections.Transformer transformer49 = null;
        java.util.Collection collection50 = org.apache.commons.collections.CollectionUtils.collect(iterator48, transformer49);
        org.apache.commons.collections.CollectionUtils.select(collection45, predicate47, collection50);
        java.util.Iterator iterator52 = null;
        org.apache.commons.collections.Transformer transformer53 = null;
        java.util.Collection collection54 = org.apache.commons.collections.CollectionUtils.collect(iterator52, transformer53);
        org.apache.commons.collections.Predicate predicate55 = null;
        java.util.Collection collection56 = null;
        org.apache.commons.collections.CollectionUtils.selectRejected(collection54, predicate55, collection56);
        java.util.Collection collection58 = org.apache.commons.collections.CollectionUtils.retainAll(collection50, collection54);
        java.util.Iterator iterator59 = null;
        org.apache.commons.collections.Transformer transformer60 = null;
        java.util.Collection collection61 = org.apache.commons.collections.CollectionUtils.collect(iterator59, transformer60);
        int int62 = org.apache.commons.collections.CollectionUtils.maxSize(collection61);
        org.apache.commons.collections.Predicate predicate63 = null;
        java.util.Iterator iterator64 = null;
        org.apache.commons.collections.Transformer transformer65 = null;
        java.util.Collection collection66 = org.apache.commons.collections.CollectionUtils.collect(iterator64, transformer65);
        org.apache.commons.collections.CollectionUtils.select(collection61, predicate63, collection66);
        java.util.Iterator iterator68 = null;
        org.apache.commons.collections.Transformer transformer69 = null;
        java.util.Collection collection70 = org.apache.commons.collections.CollectionUtils.collect(iterator68, transformer69);
        org.apache.commons.collections.Predicate predicate71 = null;
        java.util.Collection collection72 = null;
        org.apache.commons.collections.CollectionUtils.selectRejected(collection70, predicate71, collection72);
        java.util.Collection collection74 = org.apache.commons.collections.CollectionUtils.retainAll(collection66, collection70);
        java.util.Iterator iterator75 = null;
        org.apache.commons.collections.Transformer transformer76 = null;
        java.util.Collection collection77 = org.apache.commons.collections.CollectionUtils.collect(iterator75, transformer76);
        int int78 = org.apache.commons.collections.CollectionUtils.maxSize(collection77);
        org.apache.commons.collections.Predicate predicate79 = null;
        java.util.Iterator iterator80 = null;
        org.apache.commons.collections.Transformer transformer81 = null;
        java.util.Collection collection82 = org.apache.commons.collections.CollectionUtils.collect(iterator80, transformer81);
        org.apache.commons.collections.CollectionUtils.select(collection77, predicate79, collection82);
        java.util.Iterator iterator84 = null;
        org.apache.commons.collections.Transformer transformer85 = null;
        java.util.Collection collection86 = org.apache.commons.collections.CollectionUtils.collect(iterator84, transformer85);
        org.apache.commons.collections.Predicate predicate87 = null;
        java.util.Collection collection88 = null;
        org.apache.commons.collections.CollectionUtils.selectRejected(collection86, predicate87, collection88);
        java.util.Collection collection90 = org.apache.commons.collections.CollectionUtils.retainAll(collection82, collection86);
        java.util.Collection collection91 = org.apache.commons.collections.CollectionUtils.intersection(collection70, collection90);
        boolean boolean93 = org.apache.commons.collections.CollectionUtils.addIgnoreNull(collection91, (java.lang.Object) (short) -1);
        java.util.Collection collection94 = org.apache.commons.collections.CollectionUtils.intersection(collection58, collection91);
        boolean boolean95 = org.apache.commons.collections.CollectionUtils.isNotEmpty(collection91);
        java.util.Collection collection96 = org.apache.commons.collections.CollectionUtils.disjunction(collection42, collection91);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertNotNull(collection86);
        org.junit.Assert.assertNotNull(collection90);
        org.junit.Assert.assertNotNull(collection91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(collection94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(collection96);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.util.Iterator iterator0 = null;
        org.apache.commons.collections.Transformer transformer1 = null;
        java.util.Collection collection2 = org.apache.commons.collections.CollectionUtils.collect(iterator0, transformer1);
        int int3 = org.apache.commons.collections.CollectionUtils.maxSize(collection2);
        org.apache.commons.collections.Predicate predicate4 = null;
        java.util.Iterator iterator5 = null;
        org.apache.commons.collections.Transformer transformer6 = null;
        java.util.Collection collection7 = org.apache.commons.collections.CollectionUtils.collect(iterator5, transformer6);
        org.apache.commons.collections.CollectionUtils.select(collection2, predicate4, collection7);
        java.util.Iterator iterator9 = null;
        org.apache.commons.collections.Transformer transformer10 = null;
        java.util.Collection collection11 = org.apache.commons.collections.CollectionUtils.collect(iterator9, transformer10);
        org.apache.commons.collections.Predicate predicate12 = null;
        java.util.Collection collection13 = null;
        org.apache.commons.collections.CollectionUtils.selectRejected(collection11, predicate12, collection13);
        java.util.Collection collection15 = org.apache.commons.collections.CollectionUtils.retainAll(collection7, collection11);
        boolean boolean16 = org.apache.commons.collections.CollectionUtils.isEmpty(collection11);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.collections.CollectionUtils.sizeIsEmpty((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unsupported object type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.util.Iterator iterator0 = null;
        org.apache.commons.collections.Transformer transformer1 = null;
        java.util.Collection collection2 = org.apache.commons.collections.CollectionUtils.collect(iterator0, transformer1);
        int int3 = org.apache.commons.collections.CollectionUtils.maxSize(collection2);
        org.apache.commons.collections.Predicate predicate4 = null;
        java.util.Iterator iterator5 = null;
        org.apache.commons.collections.Transformer transformer6 = null;
        java.util.Collection collection7 = org.apache.commons.collections.CollectionUtils.collect(iterator5, transformer6);
        org.apache.commons.collections.CollectionUtils.select(collection2, predicate4, collection7);
        java.util.Iterator iterator9 = null;
        org.apache.commons.collections.Transformer transformer10 = null;
        java.util.Collection collection11 = org.apache.commons.collections.CollectionUtils.collect(iterator9, transformer10);
        org.apache.commons.collections.Predicate predicate12 = null;
        java.util.Collection collection13 = null;
        org.apache.commons.collections.CollectionUtils.selectRejected(collection11, predicate12, collection13);
        java.util.Collection collection15 = org.apache.commons.collections.CollectionUtils.retainAll(collection7, collection11);
        org.apache.commons.collections.Predicate predicate16 = null;
        int int17 = org.apache.commons.collections.CollectionUtils.countMatches(collection15, predicate16);
        org.apache.commons.collections.Predicate predicate18 = null;
        java.util.Iterator iterator19 = null;
        org.apache.commons.collections.Transformer transformer20 = null;
        java.util.Collection collection21 = org.apache.commons.collections.CollectionUtils.collect(iterator19, transformer20);
        int int22 = org.apache.commons.collections.CollectionUtils.maxSize(collection21);
        org.apache.commons.collections.Predicate predicate23 = null;
        java.util.Iterator iterator24 = null;
        org.apache.commons.collections.Transformer transformer25 = null;
        java.util.Collection collection26 = org.apache.commons.collections.CollectionUtils.collect(iterator24, transformer25);
        org.apache.commons.collections.CollectionUtils.select(collection21, predicate23, collection26);
        org.apache.commons.collections.CollectionUtils.selectRejected(collection15, predicate18, collection26);
        org.apache.commons.collections.Predicate predicate29 = null;
        java.util.Iterator iterator30 = null;
        org.apache.commons.collections.Transformer transformer31 = null;
        java.util.Collection collection32 = org.apache.commons.collections.CollectionUtils.collect(iterator30, transformer31);
        int int33 = org.apache.commons.collections.CollectionUtils.maxSize(collection32);
        org.apache.commons.collections.Predicate predicate34 = null;
        java.util.Iterator iterator35 = null;
        org.apache.commons.collections.Transformer transformer36 = null;
        java.util.Collection collection37 = org.apache.commons.collections.CollectionUtils.collect(iterator35, transformer36);
        org.apache.commons.collections.CollectionUtils.select(collection32, predicate34, collection37);
        java.util.Iterator iterator39 = null;
        org.apache.commons.collections.Transformer transformer40 = null;
        java.util.Collection collection41 = org.apache.commons.collections.CollectionUtils.collect(iterator39, transformer40);
        org.apache.commons.collections.Predicate predicate42 = null;
        java.util.Collection collection43 = null;
        org.apache.commons.collections.CollectionUtils.selectRejected(collection41, predicate42, collection43);
        java.util.Collection collection45 = org.apache.commons.collections.CollectionUtils.retainAll(collection37, collection41);
        java.util.Iterator iterator46 = null;
        org.apache.commons.collections.Transformer transformer47 = null;
        java.util.Collection collection48 = org.apache.commons.collections.CollectionUtils.collect(iterator46, transformer47);
        int int49 = org.apache.commons.collections.CollectionUtils.maxSize(collection48);
        org.apache.commons.collections.Predicate predicate50 = null;
        java.util.Iterator iterator51 = null;
        org.apache.commons.collections.Transformer transformer52 = null;
        java.util.Collection collection53 = org.apache.commons.collections.CollectionUtils.collect(iterator51, transformer52);
        org.apache.commons.collections.CollectionUtils.select(collection48, predicate50, collection53);
        java.util.Iterator iterator55 = null;
        org.apache.commons.collections.Transformer transformer56 = null;
        java.util.Collection collection57 = org.apache.commons.collections.CollectionUtils.collect(iterator55, transformer56);
        org.apache.commons.collections.Predicate predicate58 = null;
        java.util.Collection collection59 = null;
        org.apache.commons.collections.CollectionUtils.selectRejected(collection57, predicate58, collection59);
        java.util.Collection collection61 = org.apache.commons.collections.CollectionUtils.retainAll(collection53, collection57);
        java.util.Collection collection62 = org.apache.commons.collections.CollectionUtils.intersection(collection41, collection61);
        boolean boolean64 = org.apache.commons.collections.CollectionUtils.addIgnoreNull(collection62, (java.lang.Object) (short) -1);
        org.apache.commons.collections.CollectionUtils.select(collection26, predicate29, collection62);
        int int66 = org.apache.commons.collections.CollectionUtils.size((java.lang.Object) collection26);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.util.Iterator iterator0 = null;
        org.apache.commons.collections.Transformer transformer1 = null;
        java.util.Collection collection2 = org.apache.commons.collections.CollectionUtils.collect(iterator0, transformer1);
        org.apache.commons.collections.Predicate predicate3 = null;
        java.util.Collection collection4 = null;
        org.apache.commons.collections.CollectionUtils.selectRejected(collection2, predicate3, collection4);
        org.apache.commons.collections.Predicate predicate6 = null;
        java.util.Collection collection7 = org.apache.commons.collections.CollectionUtils.selectRejected(collection2, predicate6);
        org.apache.commons.collections.Predicate predicate8 = null;
        java.util.Collection collection9 = org.apache.commons.collections.CollectionUtils.selectRejected(collection7, predicate8);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.util.Iterator iterator0 = null;
        org.apache.commons.collections.Transformer transformer1 = null;
        java.util.Collection collection2 = org.apache.commons.collections.CollectionUtils.collect(iterator0, transformer1);
        int int3 = org.apache.commons.collections.CollectionUtils.maxSize(collection2);
        org.apache.commons.collections.Predicate predicate4 = null;
        java.util.Iterator iterator5 = null;
        org.apache.commons.collections.Transformer transformer6 = null;
        java.util.Collection collection7 = org.apache.commons.collections.CollectionUtils.collect(iterator5, transformer6);
        org.apache.commons.collections.CollectionUtils.select(collection2, predicate4, collection7);
        java.util.Iterator iterator9 = null;
        org.apache.commons.collections.Transformer transformer10 = null;
        java.util.Collection collection11 = org.apache.commons.collections.CollectionUtils.collect(iterator9, transformer10);
        org.apache.commons.collections.Predicate predicate12 = null;
        java.util.Collection collection13 = null;
        org.apache.commons.collections.CollectionUtils.selectRejected(collection11, predicate12, collection13);
        java.util.Collection collection15 = org.apache.commons.collections.CollectionUtils.retainAll(collection7, collection11);
        java.util.Iterator iterator16 = null;
        org.apache.commons.collections.Transformer transformer17 = null;
        java.util.Collection collection18 = org.apache.commons.collections.CollectionUtils.collect(iterator16, transformer17);
        int int19 = org.apache.commons.collections.CollectionUtils.maxSize(collection18);
        org.apache.commons.collections.Predicate predicate20 = null;
        java.util.Iterator iterator21 = null;
        org.apache.commons.collections.Transformer transformer22 = null;
        java.util.Collection collection23 = org.apache.commons.collections.CollectionUtils.collect(iterator21, transformer22);
        org.apache.commons.collections.CollectionUtils.select(collection18, predicate20, collection23);
        java.util.Iterator iterator25 = null;
        org.apache.commons.collections.Transformer transformer26 = null;
        java.util.Collection collection27 = org.apache.commons.collections.CollectionUtils.collect(iterator25, transformer26);
        org.apache.commons.collections.Predicate predicate28 = null;
        java.util.Collection collection29 = null;
        org.apache.commons.collections.CollectionUtils.selectRejected(collection27, predicate28, collection29);
        java.util.Collection collection31 = org.apache.commons.collections.CollectionUtils.retainAll(collection23, collection27);
        java.util.Collection collection32 = org.apache.commons.collections.CollectionUtils.intersection(collection11, collection31);
        java.util.Iterator iterator33 = null;
        org.apache.commons.collections.Transformer transformer34 = null;
        java.util.Collection collection35 = org.apache.commons.collections.CollectionUtils.collect(iterator33, transformer34);
        int int36 = org.apache.commons.collections.CollectionUtils.maxSize(collection35);
        org.apache.commons.collections.Predicate predicate37 = null;
        java.util.Iterator iterator38 = null;
        org.apache.commons.collections.Transformer transformer39 = null;
        java.util.Collection collection40 = org.apache.commons.collections.CollectionUtils.collect(iterator38, transformer39);
        org.apache.commons.collections.CollectionUtils.select(collection35, predicate37, collection40);
        java.util.Collection collection42 = org.apache.commons.collections.CollectionUtils.subtract(collection11, collection35);
        java.util.Iterator iterator43 = null;
        org.apache.commons.collections.Transformer transformer44 = null;
        java.util.Collection collection45 = org.apache.commons.collections.CollectionUtils.collect(iterator43, transformer44);
        int int46 = org.apache.commons.collections.CollectionUtils.maxSize(collection45);
        org.apache.commons.collections.Predicate predicate47 = null;
        java.util.Iterator iterator48 = null;
        org.apache.commons.collections.Transformer transformer49 = null;
        java.util.Collection collection50 = org.apache.commons.collections.CollectionUtils.collect(iterator48, transformer49);
        org.apache.commons.collections.CollectionUtils.select(collection45, predicate47, collection50);
        java.util.Iterator iterator52 = null;
        org.apache.commons.collections.Transformer transformer53 = null;
        java.util.Collection collection54 = org.apache.commons.collections.CollectionUtils.collect(iterator52, transformer53);
        org.apache.commons.collections.Predicate predicate55 = null;
        java.util.Collection collection56 = null;
        org.apache.commons.collections.CollectionUtils.selectRejected(collection54, predicate55, collection56);
        java.util.Collection collection58 = org.apache.commons.collections.CollectionUtils.retainAll(collection50, collection54);
        org.apache.commons.collections.Predicate predicate59 = null;
        int int60 = org.apache.commons.collections.CollectionUtils.countMatches(collection58, predicate59);
        org.apache.commons.collections.Predicate predicate61 = null;
        java.util.Iterator iterator62 = null;
        org.apache.commons.collections.Transformer transformer63 = null;
        java.util.Collection collection64 = org.apache.commons.collections.CollectionUtils.collect(iterator62, transformer63);
        int int65 = org.apache.commons.collections.CollectionUtils.maxSize(collection64);
        org.apache.commons.collections.Predicate predicate66 = null;
        java.util.Iterator iterator67 = null;
        org.apache.commons.collections.Transformer transformer68 = null;
        java.util.Collection collection69 = org.apache.commons.collections.CollectionUtils.collect(iterator67, transformer68);
        org.apache.commons.collections.CollectionUtils.select(collection64, predicate66, collection69);
        org.apache.commons.collections.CollectionUtils.selectRejected(collection58, predicate61, collection69);
        java.util.Collection collection72 = org.apache.commons.collections.CollectionUtils.subtract(collection11, collection58);
        int int73 = org.apache.commons.collections.CollectionUtils.maxSize(collection11);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.util.Iterator iterator0 = null;
        org.apache.commons.collections.Transformer transformer1 = null;
        java.util.Collection collection2 = org.apache.commons.collections.CollectionUtils.collect(iterator0, transformer1);
        int int3 = org.apache.commons.collections.CollectionUtils.maxSize(collection2);
        org.apache.commons.collections.Predicate predicate4 = null;
        java.util.Iterator iterator5 = null;
        org.apache.commons.collections.Transformer transformer6 = null;
        java.util.Collection collection7 = org.apache.commons.collections.CollectionUtils.collect(iterator5, transformer6);
        org.apache.commons.collections.CollectionUtils.select(collection2, predicate4, collection7);
        java.util.Iterator iterator9 = null;
        org.apache.commons.collections.Transformer transformer10 = null;
        java.util.Collection collection11 = org.apache.commons.collections.CollectionUtils.collect(iterator9, transformer10);
        org.apache.commons.collections.Predicate predicate12 = null;
        java.util.Collection collection13 = null;
        org.apache.commons.collections.CollectionUtils.selectRejected(collection11, predicate12, collection13);
        java.util.Collection collection15 = org.apache.commons.collections.CollectionUtils.retainAll(collection7, collection11);
        java.util.Iterator iterator16 = null;
        org.apache.commons.collections.Transformer transformer17 = null;
        java.util.Collection collection18 = org.apache.commons.collections.CollectionUtils.collect(iterator16, transformer17);
        int int19 = org.apache.commons.collections.CollectionUtils.maxSize(collection18);
        org.apache.commons.collections.Predicate predicate20 = null;
        java.util.Iterator iterator21 = null;
        org.apache.commons.collections.Transformer transformer22 = null;
        java.util.Collection collection23 = org.apache.commons.collections.CollectionUtils.collect(iterator21, transformer22);
        org.apache.commons.collections.CollectionUtils.select(collection18, predicate20, collection23);
        java.util.Iterator iterator25 = null;
        org.apache.commons.collections.Transformer transformer26 = null;
        java.util.Collection collection27 = org.apache.commons.collections.CollectionUtils.collect(iterator25, transformer26);
        org.apache.commons.collections.Predicate predicate28 = null;
        java.util.Collection collection29 = null;
        org.apache.commons.collections.CollectionUtils.selectRejected(collection27, predicate28, collection29);
        java.util.Collection collection31 = org.apache.commons.collections.CollectionUtils.retainAll(collection23, collection27);
        java.util.Collection collection32 = org.apache.commons.collections.CollectionUtils.intersection(collection11, collection31);
        org.apache.commons.collections.Predicate predicate33 = null;
        java.util.Collection collection34 = org.apache.commons.collections.CollectionUtils.select(collection32, predicate33);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection34);
    }
}

