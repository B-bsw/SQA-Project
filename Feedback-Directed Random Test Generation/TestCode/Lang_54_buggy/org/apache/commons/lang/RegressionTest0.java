package org.apache.commons.lang;

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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = org.apache.commons.lang.LocaleUtils.toLocale("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.util.Locale locale0 = null;
        boolean boolean1 = org.apache.commons.lang.LocaleUtils.isAvailableLocale(locale0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = org.apache.commons.lang.LocaleUtils.toLocale("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.util.List list0 = org.apache.commons.lang.LocaleUtils.availableLocaleList();
        java.lang.Class<?> wildcardClass1 = list0.getClass();
        org.junit.Assert.assertNotNull(list0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.util.List list1 = org.apache.commons.lang.LocaleUtils.languagesByCountry("hi!");
        java.lang.Class<?> wildcardClass2 = list1.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.util.List list1 = org.apache.commons.lang.LocaleUtils.countriesByLanguage("");
        java.lang.Class<?> wildcardClass2 = list1.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.util.List list1 = org.apache.commons.lang.LocaleUtils.countriesByLanguage("hi!");
        java.lang.Class<?> wildcardClass2 = list1.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.util.Locale locale0 = null;
        java.util.List list1 = org.apache.commons.lang.LocaleUtils.localeLookupList(locale0);
        java.lang.Class<?> wildcardClass2 = list1.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.util.Locale locale0 = null;
        java.util.Locale locale1 = null;
        java.util.List list2 = org.apache.commons.lang.LocaleUtils.localeLookupList(locale0, locale1);
        java.lang.Class<?> wildcardClass3 = list2.getClass();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.lang.LocaleUtils localeUtils0 = new org.apache.commons.lang.LocaleUtils();
        java.lang.Class<?> wildcardClass1 = localeUtils0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.util.Set set0 = org.apache.commons.lang.LocaleUtils.availableLocaleSet();
        java.lang.Class<?> wildcardClass1 = set0.getClass();
        org.junit.Assert.assertNotNull(set0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.util.List list1 = org.apache.commons.lang.LocaleUtils.languagesByCountry("");
        java.lang.Class<?> wildcardClass2 = list1.getClass();
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }
}

