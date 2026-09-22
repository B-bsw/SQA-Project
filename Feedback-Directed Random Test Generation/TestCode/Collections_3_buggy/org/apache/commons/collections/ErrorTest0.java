package org.apache.commons.collections;

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
        java.util.Iterator iterator66 = null;
        org.apache.commons.collections.Transformer transformer67 = null;
        java.util.Collection collection68 = org.apache.commons.collections.CollectionUtils.collect(iterator66, transformer67);
        java.util.Collection collection69 = org.apache.commons.collections.CollectionUtils.synchronizedCollection(collection68);
        java.util.Collection collection70 = org.apache.commons.collections.CollectionUtils.disjunction(collection26, collection69);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on collection2 and collection69.", collection2.equals(collection69) == collection69.equals(collection2));
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        java.util.Iterator iterator0 = null;
        org.apache.commons.collections.Transformer transformer1 = null;
        java.util.Collection collection2 = org.apache.commons.collections.CollectionUtils.collect(iterator0, transformer1);
        java.util.Collection collection3 = org.apache.commons.collections.CollectionUtils.synchronizedCollection(collection2);
        boolean boolean4 = org.apache.commons.collections.CollectionUtils.isEmpty(collection3);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on collection2 and collection3.", collection2.equals(collection3) == collection3.equals(collection2));
    }
}

