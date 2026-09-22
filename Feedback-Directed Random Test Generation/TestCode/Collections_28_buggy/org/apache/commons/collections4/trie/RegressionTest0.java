package org.apache.commons.collections4.trie;

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
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry3 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        java.lang.Object obj4 = strComparableTrieEntry3.getValue();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 0 + "'", obj4, (byte) 0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry3 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry7 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry3.right = strComparableTrieEntry7;
        java.lang.String str9 = strComparableTrieEntry3.toString();
        strComparableTrieEntry3.bitIndex = (short) 1;
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableTrieEntry3.getKey();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Entry(key=hi! [10], value=0, parent=null, left=hi! [10], right=hi! [10], predecessor=hi! [10])" + "'", str9, "Entry(key=hi! [10], value=0, parent=null, left=hi! [10], right=hi! [10], predecessor=hi! [10])");
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "hi!" + "'", strComparable12, "hi!");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry3 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry7 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry11 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry7.right = strComparableTrieEntry11;
        java.lang.String str13 = strComparableTrieEntry7.toString();
        strComparableTrieEntry7.bitIndex = (short) 1;
        strComparableTrieEntry3.left = strComparableTrieEntry7;
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Entry(key=hi! [10], value=0, parent=null, left=hi! [10], right=hi! [10], predecessor=hi! [10])" + "'", str13, "Entry(key=hi! [10], value=0, parent=null, left=hi! [10], right=hi! [10], predecessor=hi! [10])");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry3 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>, java.lang.Object> strComparableTrieEntryTrieEntry6 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>, java.lang.Object>(strComparableTrieEntry3, (java.lang.Object) (byte) 1, (int) (short) 100);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableTrieEntry3.getKey();
        java.lang.Class<?> wildcardClass8 = strComparable7.getClass();
        org.junit.Assert.assertEquals("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry3 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry7 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry3.right = strComparableTrieEntry7;
        java.lang.String str9 = strComparableTrieEntry3.toString();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry13 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry17 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry13.right = strComparableTrieEntry17;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry22 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry26 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry22.right = strComparableTrieEntry26;
        strComparableTrieEntry17.parent = strComparableTrieEntry26;
        java.lang.Object obj29 = strComparableTrieEntry17.getValue();
        java.lang.Object obj31 = strComparableTrieEntry17.setValue((java.lang.Object) 0);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry35 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry39 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry35.right = strComparableTrieEntry39;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry44 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry48 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry44.right = strComparableTrieEntry48;
        strComparableTrieEntry39.parent = strComparableTrieEntry48;
        java.lang.Object obj51 = strComparableTrieEntry39.getValue();
        strComparableTrieEntry17.left = strComparableTrieEntry39;
        java.lang.Object obj54 = strComparableTrieEntry17.setValue((java.lang.Object) 100L);
        strComparableTrieEntry3.left = strComparableTrieEntry17;
        java.lang.Object obj57 = strComparableTrieEntry3.setValue((java.lang.Object) (short) 1);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry61 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry65 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry69 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry65.right = strComparableTrieEntry69;
        java.lang.String str71 = strComparableTrieEntry65.toString();
        strComparableTrieEntry61.parent = strComparableTrieEntry65;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry73 = strComparableTrieEntry61.left;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry77 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "", (java.lang.Object) 100, (int) (short) 0);
        strComparableTrieEntry73.right = strComparableTrieEntry77;
        strComparableTrieEntry3.left = strComparableTrieEntry77;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Entry(key=hi! [10], value=0, parent=null, left=hi! [10], right=hi! [10], predecessor=hi! [10])" + "'", str9, "Entry(key=hi! [10], value=0, parent=null, left=hi! [10], right=hi! [10], predecessor=hi! [10])");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 0 + "'", obj29, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) 0 + "'", obj31, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (byte) 0 + "'", obj51, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 0 + "'", obj54, 0);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (byte) 0 + "'", obj57, (byte) 0);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Entry(key=hi! [10], value=0, parent=null, left=hi! [10], right=hi! [10], predecessor=hi! [10])" + "'", str71, "Entry(key=hi! [10], value=0, parent=null, left=hi! [10], right=hi! [10], predecessor=hi! [10])");
        org.junit.Assert.assertNotNull(strComparableTrieEntry73);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry3 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry7 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry11 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry7.right = strComparableTrieEntry11;
        java.lang.String str13 = strComparableTrieEntry7.toString();
        strComparableTrieEntry3.parent = strComparableTrieEntry7;
        java.lang.Class<?> wildcardClass15 = strComparableTrieEntry3.getClass();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Entry(key=hi! [10], value=0, parent=null, left=hi! [10], right=hi! [10], predecessor=hi! [10])" + "'", str13, "Entry(key=hi! [10], value=0, parent=null, left=hi! [10], right=hi! [10], predecessor=hi! [10])");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry3 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry7 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry3.right = strComparableTrieEntry7;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry9 = strComparableTrieEntry3.predecessor;
        java.lang.Object obj11 = strComparableTrieEntry9.setValue((java.lang.Object) (byte) 10);
        boolean boolean12 = strComparableTrieEntry9.isInternalNode();
        org.junit.Assert.assertNotNull(strComparableTrieEntry9);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry3 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry7 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry3.right = strComparableTrieEntry7;
        boolean boolean9 = strComparableTrieEntry3.isExternalNode();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry13 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry17 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry21 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry17.right = strComparableTrieEntry21;
        java.lang.String str23 = strComparableTrieEntry17.toString();
        strComparableTrieEntry13.parent = strComparableTrieEntry17;
        strComparableTrieEntry3.right = strComparableTrieEntry13;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Entry(key=hi! [10], value=0, parent=null, left=hi! [10], right=hi! [10], predecessor=hi! [10])" + "'", str23, "Entry(key=hi! [10], value=0, parent=null, left=hi! [10], right=hi! [10], predecessor=hi! [10])");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry3 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>, java.lang.Object> strComparableTrieEntryTrieEntry6 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>, java.lang.Object>(strComparableTrieEntry3, (java.lang.Object) (byte) 1, (int) (short) 100);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableTrieEntry3.getKey();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry8 = strComparableTrieEntry3.left;
        org.junit.Assert.assertEquals("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7, "hi!");
        org.junit.Assert.assertNotNull(strComparableTrieEntry8);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry3 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry7 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry3.right = strComparableTrieEntry7;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry9 = strComparableTrieEntry3.predecessor;
        java.lang.Object obj11 = strComparableTrieEntry9.setValue((java.lang.Object) (byte) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry12 = strComparableTrieEntry9.left;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry16 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry20 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry16.right = strComparableTrieEntry20;
        boolean boolean22 = strComparableTrieEntry16.isExternalNode();
        boolean boolean23 = strComparableTrieEntry12.equals((java.lang.Object) boolean22);
        org.junit.Assert.assertNotNull(strComparableTrieEntry9);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertNotNull(strComparableTrieEntry12);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry3 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        boolean boolean4 = strComparableTrieEntry3.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry3 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry7 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry3.right = strComparableTrieEntry7;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry12 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry16 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry12.right = strComparableTrieEntry16;
        strComparableTrieEntry7.parent = strComparableTrieEntry16;
        java.lang.Object obj19 = strComparableTrieEntry7.getValue();
        java.lang.Object obj21 = strComparableTrieEntry7.setValue((java.lang.Object) 0);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry25 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry29 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry33 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry29.right = strComparableTrieEntry33;
        java.lang.String str35 = strComparableTrieEntry29.toString();
        strComparableTrieEntry25.parent = strComparableTrieEntry29;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry37 = strComparableTrieEntry25.left;
        strComparableTrieEntry7.left = strComparableTrieEntry37;
        java.lang.Class<?> wildcardClass39 = strComparableTrieEntry7.getClass();
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 0 + "'", obj21, (byte) 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Entry(key=hi! [10], value=0, parent=null, left=hi! [10], right=hi! [10], predecessor=hi! [10])" + "'", str35, "Entry(key=hi! [10], value=0, parent=null, left=hi! [10], right=hi! [10], predecessor=hi! [10])");
        org.junit.Assert.assertNotNull(strComparableTrieEntry37);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry3 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry7 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry3.right = strComparableTrieEntry7;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry9 = strComparableTrieEntry3.predecessor;
        boolean boolean10 = strComparableTrieEntry9.isEmpty();
        org.junit.Assert.assertNotNull(strComparableTrieEntry9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry3 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry7 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry3.right = strComparableTrieEntry7;
        java.lang.String str9 = strComparableTrieEntry3.toString();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry13 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry17 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry13.right = strComparableTrieEntry17;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry22 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry26 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry22.right = strComparableTrieEntry26;
        strComparableTrieEntry17.parent = strComparableTrieEntry26;
        java.lang.Object obj29 = strComparableTrieEntry17.getValue();
        java.lang.Object obj31 = strComparableTrieEntry17.setValue((java.lang.Object) 0);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry35 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry39 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry35.right = strComparableTrieEntry39;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry44 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry48 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry44.right = strComparableTrieEntry48;
        strComparableTrieEntry39.parent = strComparableTrieEntry48;
        java.lang.Object obj51 = strComparableTrieEntry39.getValue();
        strComparableTrieEntry17.left = strComparableTrieEntry39;
        java.lang.Object obj54 = strComparableTrieEntry17.setValue((java.lang.Object) 100L);
        strComparableTrieEntry3.left = strComparableTrieEntry17;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry56 = strComparableTrieEntry17.parent;
        boolean boolean57 = strComparableTrieEntry17.isExternalNode();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Entry(key=hi! [10], value=0, parent=null, left=hi! [10], right=hi! [10], predecessor=hi! [10])" + "'", str9, "Entry(key=hi! [10], value=0, parent=null, left=hi! [10], right=hi! [10], predecessor=hi! [10])");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 0 + "'", obj29, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) 0 + "'", obj31, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (byte) 0 + "'", obj51, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 0 + "'", obj54, 0);
        org.junit.Assert.assertNotNull(strComparableTrieEntry56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry3 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry7 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry3.right = strComparableTrieEntry7;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry9 = strComparableTrieEntry3.predecessor;
        java.lang.Object obj11 = strComparableTrieEntry9.setValue((java.lang.Object) (byte) 10);
        java.lang.String str12 = strComparableTrieEntry9.toString();
        java.lang.Class<?> wildcardClass13 = strComparableTrieEntry9.getClass();
        org.junit.Assert.assertNotNull(strComparableTrieEntry9);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Entry(key=hi! [10], value=10, parent=null, left=hi! [10], right=hi! [10], predecessor=hi! [10])" + "'", str12, "Entry(key=hi! [10], value=10, parent=null, left=hi! [10], right=hi! [10], predecessor=hi! [10])");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry3 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry7 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry3.right = strComparableTrieEntry7;
        java.lang.String str9 = strComparableTrieEntry3.toString();
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry13 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>, java.lang.Object> strComparableTrieEntryTrieEntry16 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>, java.lang.Object>(strComparableTrieEntry13, (java.lang.Object) (byte) 1, (int) (short) 100);
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableTrieEntry13.getKey();
        strComparableTrieEntry3.right = strComparableTrieEntry13;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Entry(key=hi! [10], value=0, parent=null, left=hi! [10], right=hi! [10], predecessor=hi! [10])" + "'", str9, "Entry(key=hi! [10], value=0, parent=null, left=hi! [10], right=hi! [10], predecessor=hi! [10])");
        org.junit.Assert.assertEquals("'" + strComparable17 + "' != '" + "hi!" + "'", strComparable17, "hi!");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry3 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry7 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry11 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry7.right = strComparableTrieEntry11;
        java.lang.String str13 = strComparableTrieEntry7.toString();
        strComparableTrieEntry3.parent = strComparableTrieEntry7;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry15 = strComparableTrieEntry3.left;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry19 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "", (java.lang.Object) 100, (int) (short) 0);
        strComparableTrieEntry15.right = strComparableTrieEntry19;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry24 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry28 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry24.right = strComparableTrieEntry28;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry30 = strComparableTrieEntry24.predecessor;
        java.lang.Object obj31 = strComparableTrieEntry15.setValue((java.lang.Object) strComparableTrieEntry24);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Entry(key=hi! [10], value=0, parent=null, left=hi! [10], right=hi! [10], predecessor=hi! [10])" + "'", str13, "Entry(key=hi! [10], value=0, parent=null, left=hi! [10], right=hi! [10], predecessor=hi! [10])");
        org.junit.Assert.assertNotNull(strComparableTrieEntry15);
        org.junit.Assert.assertNotNull(strComparableTrieEntry30);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) 0 + "'", obj31, (byte) 0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry3 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry7 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry3.right = strComparableTrieEntry7;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry9 = strComparableTrieEntry3.predecessor;
        java.lang.Object obj11 = strComparableTrieEntry9.setValue((java.lang.Object) (byte) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry12 = strComparableTrieEntry9.left;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry16 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry20 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry16.right = strComparableTrieEntry20;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry25 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry29 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry25.right = strComparableTrieEntry29;
        strComparableTrieEntry20.parent = strComparableTrieEntry29;
        java.lang.Object obj32 = strComparableTrieEntry20.getValue();
        java.lang.Object obj34 = strComparableTrieEntry20.setValue((java.lang.Object) 0);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry38 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry42 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry38.right = strComparableTrieEntry42;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry47 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry51 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry47.right = strComparableTrieEntry51;
        strComparableTrieEntry42.parent = strComparableTrieEntry51;
        strComparableTrieEntry20.right = strComparableTrieEntry51;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry55 = strComparableTrieEntry51.predecessor;
        strComparableTrieEntry9.right = strComparableTrieEntry55;
        org.junit.Assert.assertNotNull(strComparableTrieEntry9);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (byte) 0 + "'", obj11, (byte) 0);
        org.junit.Assert.assertNotNull(strComparableTrieEntry12);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (byte) 0 + "'", obj32, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) 0 + "'", obj34, (byte) 0);
        org.junit.Assert.assertNotNull(strComparableTrieEntry55);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry3 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry7 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry3.right = strComparableTrieEntry7;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry12 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry16 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry12.right = strComparableTrieEntry16;
        strComparableTrieEntry7.parent = strComparableTrieEntry16;
        java.lang.Object obj19 = strComparableTrieEntry7.getValue();
        java.lang.Object obj21 = strComparableTrieEntry7.setValue((java.lang.Object) 0);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry25 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry29 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry25.right = strComparableTrieEntry29;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry34 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry38 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry34.right = strComparableTrieEntry38;
        strComparableTrieEntry29.parent = strComparableTrieEntry38;
        java.lang.Object obj41 = strComparableTrieEntry29.getValue();
        strComparableTrieEntry7.left = strComparableTrieEntry29;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry43 = strComparableTrieEntry7.right;
        // The following exception was thrown during execution in test generation
        try {
            strComparableTrieEntry43.bitIndex = (byte) 10;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 0 + "'", obj19, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 0 + "'", obj21, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) 0 + "'", obj41, (byte) 0);
        org.junit.Assert.assertNull(strComparableTrieEntry43);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry3 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry7 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry11 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry7.right = strComparableTrieEntry11;
        java.lang.String str13 = strComparableTrieEntry7.toString();
        strComparableTrieEntry3.parent = strComparableTrieEntry7;
        java.lang.Object obj17 = strComparableTrieEntry7.setKeyValue((java.lang.Comparable<java.lang.String>) "Entry(key=hi! [10], value=0, parent=null, left=hi! [10], right=hi! [10], predecessor=hi! [10])", (java.lang.Object) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Entry(key=hi! [10], value=0, parent=null, left=hi! [10], right=hi! [10], predecessor=hi! [10])" + "'", str13, "Entry(key=hi! [10], value=0, parent=null, left=hi! [10], right=hi! [10], predecessor=hi! [10])");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 0 + "'", obj17, (byte) 0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry3 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry7 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>, java.lang.Object> strComparableTrieEntryTrieEntry10 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>, java.lang.Object>(strComparableTrieEntry7, (java.lang.Object) (byte) 1, (int) (short) 100);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry14 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry18 = new org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object>((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Object) (byte) 0, (int) (short) 10);
        strComparableTrieEntry14.right = strComparableTrieEntry18;
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry20 = strComparableTrieEntry14.predecessor;
        java.lang.Object obj22 = strComparableTrieEntry20.setValue((java.lang.Object) (byte) 10);
        org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableTrieEntry23 = strComparableTrieEntry20.left;
        strComparableTrieEntry7.predecessor = strComparableTrieEntry23;
        strComparableTrieEntry3.left = strComparableTrieEntry23;
        org.junit.Assert.assertNotNull(strComparableTrieEntry20);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 0 + "'", obj22, (byte) 0);
        org.junit.Assert.assertNotNull(strComparableTrieEntry23);
    }
}

