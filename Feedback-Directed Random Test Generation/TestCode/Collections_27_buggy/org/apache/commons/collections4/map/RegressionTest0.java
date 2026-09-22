package org.apache.commons.collections4.map;

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
        org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence> charSequenceMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence>();
        int int1 = charSequenceMap0.totalSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence> charSequenceMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = charSequenceMap0.containsValue((java.lang.Object) (byte) 1);
        org.apache.commons.collections4.MapIterator<java.lang.CharSequence, java.lang.Object> charSequenceItor3 = charSequenceMap0.mapIterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(charSequenceItor3);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.String, java.io.Serializable> strMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.String, java.io.Serializable>();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence> charSequenceMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = charSequenceMap0.containsValue((java.lang.Object) (byte) 1);
        java.lang.Object obj4 = charSequenceMap0.remove((java.lang.Object) 100);
        java.util.Iterator<java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence>> charSequenceEntryItor5 = charSequenceMap0.iterator();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.util.Map<java.lang.CharSequence, java.lang.Object>> charSequenceMap6 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap((java.util.Map<java.lang.CharSequence, java.lang.Object>) charSequenceMap0);
        java.lang.Object obj9 = charSequenceMap6.putIfAbsent((java.lang.CharSequence) "", (java.lang.Object) 10L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(charSequenceEntryItor5);
        org.junit.Assert.assertNotNull(charSequenceMap6);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 10L + "'", obj9, 10L);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence> charSequenceMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = charSequenceMap0.containsValue((java.lang.Object) (byte) 1);
        java.lang.Object obj4 = charSequenceMap0.remove((java.lang.Object) 100);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence> charSequenceMap5 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean7 = charSequenceMap5.containsValue((java.lang.Object) (byte) 1);
        java.lang.Object obj9 = charSequenceMap5.remove((java.lang.Object) 100);
        charSequenceMap0.putAll((java.util.Map<java.lang.CharSequence, java.lang.Object>) charSequenceMap5);
        boolean boolean12 = charSequenceMap5.containsValue((java.lang.Object) 1.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence> charSequenceMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = charSequenceMap0.containsValue((java.lang.Object) (byte) 1);
        java.lang.Object obj4 = charSequenceMap0.remove((java.lang.Object) 100);
        java.util.Iterator<java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence>> charSequenceEntryItor5 = charSequenceMap0.iterator();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.util.Map<java.lang.CharSequence, java.lang.Object>> charSequenceMap6 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap((java.util.Map<java.lang.CharSequence, java.lang.Object>) charSequenceMap0);
        boolean boolean9 = charSequenceMap0.remove((java.lang.Object) (short) -1, (java.lang.Object) 1.0f);
        boolean boolean11 = charSequenceMap0.containsValue((java.lang.Object) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(charSequenceEntryItor5);
        org.junit.Assert.assertNotNull(charSequenceMap6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence> charSequenceMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = charSequenceMap0.containsValue((java.lang.Object) (byte) 1);
        java.lang.Object obj4 = charSequenceMap0.remove((java.lang.Object) 100);
        java.util.Iterator<java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence>> charSequenceEntryItor5 = charSequenceMap0.iterator();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence> charSequenceMap7 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean9 = charSequenceMap7.containsValue((java.lang.Object) (byte) 1);
        java.lang.Object obj11 = charSequenceMap7.remove((java.lang.Object) 100);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence> charSequenceMap12 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean14 = charSequenceMap12.containsValue((java.lang.Object) (byte) 1);
        java.lang.Object obj16 = charSequenceMap12.remove((java.lang.Object) 100);
        charSequenceMap7.putAll((java.util.Map<java.lang.CharSequence, java.lang.Object>) charSequenceMap12);
        boolean boolean19 = charSequenceMap0.replace((java.lang.CharSequence) "", (java.lang.Object) charSequenceMap7, (java.lang.Object) 10L);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "" };
        java.util.ArrayList<java.lang.CharSequence> charSequenceList23 = new java.util.ArrayList<java.lang.CharSequence>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.CharSequence>) charSequenceList23, charSequenceArray22);
        boolean boolean25 = charSequenceMap7.putAll((java.lang.CharSequence) "hi!", (java.util.Collection<java.lang.CharSequence>) charSequenceList23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(charSequenceEntryItor5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(charSequenceArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence> charSequenceMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = charSequenceMap0.equals((java.lang.Object) (short) 100);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence> charSequenceMap3 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence>();
        charSequenceMap0.putAll((java.util.Map<java.lang.CharSequence, java.lang.Object>) charSequenceMap3);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence> charSequenceMap6 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj8 = charSequenceMap6.remove((java.lang.Object) (byte) -1);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, org.apache.commons.collections4.IterableGet<java.lang.CharSequence, java.lang.Object>> charSequenceMap9 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap((java.util.Map<java.lang.CharSequence, java.lang.Object>) charSequenceMap6);
        java.lang.Object obj10 = charSequenceMap3.putIfAbsent((java.lang.CharSequence) "", (java.lang.Object) charSequenceMap6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(charSequenceMap9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "{}");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence> charSequenceMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = charSequenceMap0.containsValue((java.lang.Object) (byte) 1);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence> charSequenceMap3 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean5 = charSequenceMap3.containsValue((java.lang.Object) (byte) 1);
        java.lang.Object obj7 = charSequenceMap3.remove((java.lang.Object) 100);
        java.util.Iterator<java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence>> charSequenceEntryItor8 = charSequenceMap3.iterator();
        boolean boolean10 = charSequenceMap0.remove((java.lang.Object) charSequenceEntryItor8, (java.lang.Object) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(charSequenceEntryItor8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence> charSequenceMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = charSequenceMap0.containsValue((java.lang.Object) (byte) 1);
        java.lang.Object obj4 = charSequenceMap0.remove((java.lang.Object) 100);
        java.util.Iterator<java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence>> charSequenceEntryItor5 = charSequenceMap0.iterator();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.util.Map<java.lang.CharSequence, java.lang.Object>> charSequenceMap6 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap((java.util.Map<java.lang.CharSequence, java.lang.Object>) charSequenceMap0);
        boolean boolean9 = charSequenceMap0.remove((java.lang.Object) (short) -1, (java.lang.Object) 1.0f);
        boolean boolean13 = charSequenceMap0.replace((java.lang.CharSequence) "hi!", (java.lang.Object) 1L, (java.lang.Object) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(charSequenceEntryItor5);
        org.junit.Assert.assertNotNull(charSequenceMap6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence> charSequenceMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = charSequenceMap0.containsValue((java.lang.Object) (byte) 1);
        java.lang.Object obj4 = charSequenceMap0.remove((java.lang.Object) 100);
        java.util.Iterator<java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence>> charSequenceEntryItor5 = charSequenceMap0.iterator();
        org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence> charSequenceMap7 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean9 = charSequenceMap7.containsValue((java.lang.Object) (byte) 1);
        java.lang.Object obj11 = charSequenceMap7.remove((java.lang.Object) 100);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence> charSequenceMap12 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean14 = charSequenceMap12.containsValue((java.lang.Object) (byte) 1);
        java.lang.Object obj16 = charSequenceMap12.remove((java.lang.Object) 100);
        charSequenceMap7.putAll((java.util.Map<java.lang.CharSequence, java.lang.Object>) charSequenceMap12);
        boolean boolean19 = charSequenceMap0.replace((java.lang.CharSequence) "", (java.lang.Object) charSequenceMap7, (java.lang.Object) 10L);
        java.lang.String str20 = charSequenceMap0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(charSequenceEntryItor5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence> charSequenceMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = charSequenceMap0.equals((java.lang.Object) (short) 100);
        java.lang.Object obj5 = charSequenceMap0.getOrDefault((java.lang.Object) "hi!", (java.lang.Object) 10.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence> charSequenceMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = charSequenceMap0.containsValue((java.lang.Object) (byte) 1);
        java.lang.Object obj4 = charSequenceMap0.remove((java.lang.Object) 100);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence> charSequenceMap5 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean7 = charSequenceMap5.containsValue((java.lang.Object) (byte) 1);
        java.lang.Object obj9 = charSequenceMap5.remove((java.lang.Object) 100);
        charSequenceMap0.putAll((java.util.Map<java.lang.CharSequence, java.lang.Object>) charSequenceMap5);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence> charSequenceMap11 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean13 = charSequenceMap11.equals((java.lang.Object) (short) 100);
        java.lang.Object obj16 = charSequenceMap11.replace((java.lang.CharSequence) "", (java.lang.Object) "hi!");
        java.lang.Object obj18 = charSequenceMap0.getOrDefault(obj16, (java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0 + "'", obj18, 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence> charSequenceMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence>();
        java.lang.Object obj3 = charSequenceMap0.getOrDefault((java.lang.Object) 0, (java.lang.Object) '#');
        org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence> charSequenceMap4 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean6 = charSequenceMap4.containsValue((java.lang.Object) (byte) 1);
        java.lang.Object obj8 = charSequenceMap4.remove((java.lang.Object) 100);
        java.util.Iterator<java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence>> charSequenceEntryItor9 = charSequenceMap4.iterator();
        boolean boolean12 = charSequenceMap4.containsValue((java.lang.Object) true, (java.lang.Object) (short) 10);
        java.util.Collection<java.lang.CharSequence> charSequenceCollection14 = charSequenceMap4.getCollection((java.lang.Object) 100);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence> charSequenceMap15 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean17 = charSequenceMap15.containsValue((java.lang.Object) (byte) 1);
        java.lang.Object obj19 = charSequenceMap15.remove((java.lang.Object) 100);
        java.util.Iterator<java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence>> charSequenceEntryItor20 = charSequenceMap15.iterator();
        boolean boolean21 = charSequenceMap0.remove((java.lang.Object) 100, (java.lang.Object) charSequenceEntryItor20);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + '#' + "'", obj3, '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(charSequenceEntryItor9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(charSequenceCollection14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(charSequenceEntryItor20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence> charSequenceMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = charSequenceMap0.containsValue((java.lang.Object) (byte) 1);
        java.lang.Object obj4 = charSequenceMap0.remove((java.lang.Object) 100);
        java.util.Iterator<java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence>> charSequenceEntryItor5 = charSequenceMap0.iterator();
        int int6 = charSequenceMap0.totalSize();
        java.util.Iterator<java.lang.CharSequence> charSequenceItor8 = charSequenceMap0.iterator((java.lang.Object) "{}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(charSequenceEntryItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(charSequenceItor8);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence> charSequenceMap0 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean2 = charSequenceMap0.equals((java.lang.Object) (short) 100);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence> charSequenceMap3 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence>();
        charSequenceMap0.putAll((java.util.Map<java.lang.CharSequence, java.lang.Object>) charSequenceMap3);
        org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence> charSequenceMap6 = new org.apache.commons.collections4.map.MultiValueMap<java.lang.CharSequence, java.lang.CharSequence>();
        boolean boolean8 = charSequenceMap6.containsValue((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = charSequenceMap6.remove((java.lang.Object) 100);
        java.util.Iterator<java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence>> charSequenceEntryItor11 = charSequenceMap6.iterator();
        boolean boolean12 = charSequenceMap3.containsValue((java.lang.Object) (short) -1, (java.lang.Object) charSequenceEntryItor11);
        org.apache.commons.collections4.MapIterator<java.lang.CharSequence, java.lang.Object> charSequenceItor13 = charSequenceMap3.mapIterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(charSequenceEntryItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charSequenceItor13);
    }
}

