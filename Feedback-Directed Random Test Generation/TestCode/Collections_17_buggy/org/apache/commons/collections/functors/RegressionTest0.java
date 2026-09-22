package org.apache.commons.collections.functors;

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
        org.apache.commons.collections.Predicate<java.io.Serializable> serializablePredicate1 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate((java.io.Serializable) 10.0f);
        org.junit.Assert.assertNotNull(serializablePredicate1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.commons.collections.functors.Equator<java.lang.String> strEquator1 = null;
        org.apache.commons.collections.functors.EqualPredicate<java.lang.String> strEqualPredicate2 = new org.apache.commons.collections.functors.EqualPredicate<java.lang.String>("hi!", strEquator1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = strEqualPredicate2.evaluate("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.collections.functors.Equator<java.lang.String> strEquator1 = null;
        org.apache.commons.collections.functors.EqualPredicate<java.lang.String> strEqualPredicate2 = new org.apache.commons.collections.functors.EqualPredicate<java.lang.String>("hi!", strEquator1);
        org.apache.commons.collections.Predicate<org.apache.commons.collections.functors.EqualPredicate<java.lang.String>> strEqualPredicatePredicate3 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(strEqualPredicate2);
        org.junit.Assert.assertNotNull(strEqualPredicatePredicate3);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.collections.functors.EqualPredicate<java.io.Serializable> serializableEqualPredicate1 = new org.apache.commons.collections.functors.EqualPredicate<java.io.Serializable>((java.io.Serializable) (-1L));
        java.lang.Class<?> wildcardClass2 = serializableEqualPredicate1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.collections.functors.Equator<java.lang.String> strEquator1 = null;
        org.apache.commons.collections.functors.EqualPredicate<java.lang.String> strEqualPredicate2 = new org.apache.commons.collections.functors.EqualPredicate<java.lang.String>("", strEquator1);
        java.lang.Object obj3 = strEqualPredicate2.getValue();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = strEqualPredicate2.evaluate("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "" + "'", obj3, "");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.collections.functors.Equator<java.lang.String> strEquator1 = null;
        org.apache.commons.collections.functors.EqualPredicate<java.lang.String> strEqualPredicate2 = new org.apache.commons.collections.functors.EqualPredicate<java.lang.String>("", strEquator1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = strEqualPredicate2.evaluate("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.collections.functors.EqualPredicate<java.lang.String> strEqualPredicate1 = new org.apache.commons.collections.functors.EqualPredicate<java.lang.String>("");
        java.lang.Object obj2 = strEqualPredicate1.getValue();
        org.apache.commons.collections.functors.Equator<org.apache.commons.collections.functors.EqualPredicate<java.lang.String>> strEqualPredicateEquator3 = null;
        org.apache.commons.collections.functors.EqualPredicate<org.apache.commons.collections.functors.EqualPredicate<java.lang.String>> strEqualPredicateEqualPredicate4 = new org.apache.commons.collections.functors.EqualPredicate<org.apache.commons.collections.functors.EqualPredicate<java.lang.String>>(strEqualPredicate1, strEqualPredicateEquator3);
        boolean boolean6 = strEqualPredicate1.evaluate("");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "" + "'", obj2, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.lang.Object obj0 = null;
        org.apache.commons.collections.functors.EqualPredicate<java.lang.Object> objEqualPredicate1 = new org.apache.commons.collections.functors.EqualPredicate<java.lang.Object>(obj0);
        java.lang.Class<?> wildcardClass2 = objEqualPredicate1.getClass();
        org.apache.commons.collections.functors.Equator<java.lang.reflect.GenericDeclaration> genericDeclarationEquator3 = null;
        org.apache.commons.collections.functors.EqualPredicate<java.lang.reflect.GenericDeclaration> genericDeclarationEqualPredicate4 = new org.apache.commons.collections.functors.EqualPredicate<java.lang.reflect.GenericDeclaration>((java.lang.reflect.GenericDeclaration) wildcardClass2, genericDeclarationEquator3);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.lang.Object obj0 = null;
        org.apache.commons.collections.functors.EqualPredicate<java.lang.Object> objEqualPredicate1 = new org.apache.commons.collections.functors.EqualPredicate<java.lang.Object>(obj0);
        java.lang.Class<?> wildcardClass2 = objEqualPredicate1.getClass();
        org.apache.commons.collections.Predicate<java.lang.reflect.Type> typePredicate3 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate((java.lang.reflect.Type) wildcardClass2);
        org.apache.commons.collections.Predicate<java.lang.reflect.GenericDeclaration> genericDeclarationPredicate4 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate((java.lang.reflect.GenericDeclaration) wildcardClass2);
        org.apache.commons.collections.Predicate<java.lang.Class<?>> wildcardClassPredicate5 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(wildcardClass2);
        org.apache.commons.collections.functors.Equator<java.lang.Object> objEquator6 = null;
        org.apache.commons.collections.functors.EqualPredicate<java.lang.Object> objEqualPredicate7 = new org.apache.commons.collections.functors.EqualPredicate<java.lang.Object>((java.lang.Object) wildcardClass2, objEquator6);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(typePredicate3);
        org.junit.Assert.assertNotNull(genericDeclarationPredicate4);
        org.junit.Assert.assertNotNull(wildcardClassPredicate5);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.collections.functors.Equator<java.lang.String> strEquator1 = null;
        org.apache.commons.collections.functors.EqualPredicate<java.lang.String> strEqualPredicate2 = new org.apache.commons.collections.functors.EqualPredicate<java.lang.String>("", strEquator1);
        java.lang.Class<?> wildcardClass3 = strEqualPredicate2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.collections.functors.Equator<java.lang.String> strEquator1 = null;
        org.apache.commons.collections.functors.EqualPredicate<java.lang.String> strEqualPredicate2 = new org.apache.commons.collections.functors.EqualPredicate<java.lang.String>("hi!", strEquator1);
        java.lang.Class<?> wildcardClass3 = strEqualPredicate2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.collections.functors.EqualPredicate<java.lang.String> strEqualPredicate1 = new org.apache.commons.collections.functors.EqualPredicate<java.lang.String>("");
        java.lang.Object obj2 = strEqualPredicate1.getValue();
        org.apache.commons.collections.functors.Equator<org.apache.commons.collections.functors.EqualPredicate<java.lang.String>> strEqualPredicateEquator3 = null;
        org.apache.commons.collections.functors.EqualPredicate<org.apache.commons.collections.functors.EqualPredicate<java.lang.String>> strEqualPredicateEqualPredicate4 = new org.apache.commons.collections.functors.EqualPredicate<org.apache.commons.collections.functors.EqualPredicate<java.lang.String>>(strEqualPredicate1, strEqualPredicateEquator3);
        boolean boolean6 = strEqualPredicate1.evaluate("hi!");
        boolean boolean8 = strEqualPredicate1.evaluate("hi!");
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "" + "'", obj2, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.collections.functors.EqualPredicate<java.lang.String> strEqualPredicate1 = new org.apache.commons.collections.functors.EqualPredicate<java.lang.String>("");
        java.lang.Object obj2 = strEqualPredicate1.getValue();
        java.lang.Object obj3 = strEqualPredicate1.getValue();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "" + "'", obj2, "");
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "" + "'", obj3, "");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.collections.functors.Equator<java.lang.String> strEquator1 = null;
        org.apache.commons.collections.functors.EqualPredicate<java.lang.String> strEqualPredicate2 = new org.apache.commons.collections.functors.EqualPredicate<java.lang.String>("hi!", strEquator1);
        java.lang.Object obj3 = strEqualPredicate2.getValue();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.collections.Predicate<java.io.Serializable> serializablePredicate1 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate((java.io.Serializable) 0);
        java.lang.Class<?> wildcardClass2 = serializablePredicate1.getClass();
        org.junit.Assert.assertNotNull(serializablePredicate1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.lang.Object obj0 = null;
        org.apache.commons.collections.functors.EqualPredicate<java.lang.Object> objEqualPredicate1 = new org.apache.commons.collections.functors.EqualPredicate<java.lang.Object>(obj0);
        org.apache.commons.collections.functors.Equator<java.io.Serializable> serializableEquator2 = null;
        org.apache.commons.collections.functors.EqualPredicate<java.io.Serializable> serializableEqualPredicate3 = new org.apache.commons.collections.functors.EqualPredicate<java.io.Serializable>((java.io.Serializable) objEqualPredicate1, serializableEquator2);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.collections.functors.EqualPredicate<java.lang.String> strEqualPredicate1 = new org.apache.commons.collections.functors.EqualPredicate<java.lang.String>("");
        java.lang.Object obj2 = strEqualPredicate1.getValue();
        org.apache.commons.collections.functors.Equator<org.apache.commons.collections.functors.EqualPredicate<java.lang.String>> strEqualPredicateEquator3 = null;
        org.apache.commons.collections.functors.EqualPredicate<org.apache.commons.collections.functors.EqualPredicate<java.lang.String>> strEqualPredicateEqualPredicate4 = new org.apache.commons.collections.functors.EqualPredicate<org.apache.commons.collections.functors.EqualPredicate<java.lang.String>>(strEqualPredicate1, strEqualPredicateEquator3);
        org.apache.commons.collections.functors.EqualPredicate<org.apache.commons.collections.functors.EqualPredicate<java.lang.String>> strEqualPredicateEqualPredicate5 = new org.apache.commons.collections.functors.EqualPredicate<org.apache.commons.collections.functors.EqualPredicate<java.lang.String>>(strEqualPredicate1);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "" + "'", obj2, "");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.collections.functors.Equator<java.lang.String> strEquator1 = null;
        org.apache.commons.collections.functors.EqualPredicate<java.lang.String> strEqualPredicate2 = new org.apache.commons.collections.functors.EqualPredicate<java.lang.String>("", strEquator1);
        java.lang.Object obj3 = strEqualPredicate2.getValue();
        java.lang.Class<?> wildcardClass4 = strEqualPredicate2.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "" + "'", obj3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.collections.Predicate<java.lang.Object> objPredicate1 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate((java.lang.Object) 1L);
        org.junit.Assert.assertNotNull(objPredicate1);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.collections.functors.Equator<java.lang.Object> objEquator1 = null;
        org.apache.commons.collections.functors.EqualPredicate<java.lang.Object> objEqualPredicate2 = new org.apache.commons.collections.functors.EqualPredicate<java.lang.Object>((java.lang.Object) (-1L), objEquator1);
        java.lang.Class<?> wildcardClass3 = objEqualPredicate2.getClass();
        org.apache.commons.collections.Predicate<java.lang.reflect.GenericDeclaration> genericDeclarationPredicate4 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate((java.lang.reflect.GenericDeclaration) wildcardClass3);
        org.apache.commons.collections.Predicate<java.lang.Class<?>> wildcardClassPredicate5 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(genericDeclarationPredicate4);
        org.junit.Assert.assertNotNull(wildcardClassPredicate5);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.collections.Predicate<java.lang.Comparable<java.lang.String>> strComparablePredicate1 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass2 = strComparablePredicate1.getClass();
        org.junit.Assert.assertNotNull(strComparablePredicate1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.collections.functors.Equator<java.lang.String> strEquator1 = null;
        org.apache.commons.collections.functors.EqualPredicate<java.lang.String> strEqualPredicate2 = new org.apache.commons.collections.functors.EqualPredicate<java.lang.String>("hi!", strEquator1);
        java.lang.Object obj3 = strEqualPredicate2.getValue();
        org.apache.commons.collections.Predicate<org.apache.commons.collections.Predicate<java.lang.String>> strPredicatePredicate4 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate((org.apache.commons.collections.Predicate<java.lang.String>) strEqualPredicate2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = strEqualPredicate2.evaluate("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertNotNull(strPredicatePredicate4);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.collections.functors.Equator<java.lang.String> strEquator1 = null;
        org.apache.commons.collections.functors.EqualPredicate<java.lang.String> strEqualPredicate2 = new org.apache.commons.collections.functors.EqualPredicate<java.lang.String>("hi!", strEquator1);
        java.lang.Object obj3 = strEqualPredicate2.getValue();
        org.apache.commons.collections.Predicate<org.apache.commons.collections.Predicate<java.lang.String>> strPredicatePredicate4 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate((org.apache.commons.collections.Predicate<java.lang.String>) strEqualPredicate2);
        org.apache.commons.collections.Predicate<org.apache.commons.collections.functors.EqualPredicate<java.lang.String>> strEqualPredicatePredicate5 = org.apache.commons.collections.functors.EqualPredicate.equalPredicate(strEqualPredicate2);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "hi!" + "'", obj3, "hi!");
        org.junit.Assert.assertNotNull(strPredicatePredicate4);
        org.junit.Assert.assertNotNull(strEqualPredicatePredicate5);
    }
}

