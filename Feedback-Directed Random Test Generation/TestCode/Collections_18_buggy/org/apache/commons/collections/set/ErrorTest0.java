package org.apache.commons.collections.set;

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
        objSet49.clear();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objSet43 and objSet48.", objSet43.equals(objSet48) == objSet48.equals(objSet43));
    }
}

