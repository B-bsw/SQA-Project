package org.apache.commons.math3.distribution;

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
        java.util.ArrayList<org.apache.commons.math3.util.Pair<java.lang.CharSequence, java.lang.Double>> charSequencePairList0 = new java.util.ArrayList<org.apache.commons.math3.util.Pair<java.lang.CharSequence, java.lang.Double>>();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.CharSequence> charSequenceDiscreteDistribution1 = new org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.CharSequence>((java.util.List<org.apache.commons.math3.util.Pair<java.lang.CharSequence, java.lang.Double>>) charSequencePairList0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: array sums to zero");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.util.ArrayList<org.apache.commons.math3.util.Pair<java.lang.String, java.lang.Double>> strPairList0 = new java.util.ArrayList<org.apache.commons.math3.util.Pair<java.lang.String, java.lang.Double>>();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.String> strDiscreteDistribution1 = new org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.String>((java.util.List<org.apache.commons.math3.util.Pair<java.lang.String, java.lang.Double>>) strPairList0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: array sums to zero");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.util.List<org.apache.commons.math3.util.Pair<java.lang.Object, java.lang.Double>> objPairList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.Object> objDiscreteDistribution1 = new org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.Object>(objPairList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        java.util.ArrayList<org.apache.commons.math3.util.Pair<java.lang.reflect.AnnotatedElement, java.lang.Double>> annotatedElementPairList1 = new java.util.ArrayList<org.apache.commons.math3.util.Pair<java.lang.reflect.AnnotatedElement, java.lang.Double>>();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.reflect.AnnotatedElement> annotatedElementDiscreteDistribution2 = new org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.reflect.AnnotatedElement>(randomGenerator0, (java.util.List<org.apache.commons.math3.util.Pair<java.lang.reflect.AnnotatedElement, java.lang.Double>>) annotatedElementPairList1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: array sums to zero");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        java.util.ArrayList<org.apache.commons.math3.util.Pair<java.lang.reflect.Type, java.lang.Double>> typePairList1 = new java.util.ArrayList<org.apache.commons.math3.util.Pair<java.lang.reflect.Type, java.lang.Double>>();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.reflect.Type> typeDiscreteDistribution2 = new org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.reflect.Type>(randomGenerator0, (java.util.List<org.apache.commons.math3.util.Pair<java.lang.reflect.Type, java.lang.Double>>) typePairList1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: array sums to zero");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        java.util.ArrayList<org.apache.commons.math3.util.Pair<java.lang.reflect.GenericDeclaration, java.lang.Double>> genericDeclarationPairList1 = new java.util.ArrayList<org.apache.commons.math3.util.Pair<java.lang.reflect.GenericDeclaration, java.lang.Double>>();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.reflect.GenericDeclaration> genericDeclarationDiscreteDistribution2 = new org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.reflect.GenericDeclaration>(randomGenerator0, (java.util.List<org.apache.commons.math3.util.Pair<java.lang.reflect.GenericDeclaration, java.lang.Double>>) genericDeclarationPairList1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: array sums to zero");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.util.ArrayList<org.apache.commons.math3.util.Pair<java.lang.Object, java.lang.Double>> objPairList0 = new java.util.ArrayList<org.apache.commons.math3.util.Pair<java.lang.Object, java.lang.Double>>();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.Object> objDiscreteDistribution1 = new org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.Object>((java.util.List<org.apache.commons.math3.util.Pair<java.lang.Object, java.lang.Double>>) objPairList0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: array sums to zero");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        java.util.List<org.apache.commons.math3.util.Pair<java.io.Serializable, java.lang.Double>> serializablePairList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.DiscreteDistribution<java.io.Serializable> serializableDiscreteDistribution2 = new org.apache.commons.math3.distribution.DiscreteDistribution<java.io.Serializable>(randomGenerator0, serializablePairList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.util.ArrayList<org.apache.commons.math3.util.Pair<java.lang.reflect.Type, java.lang.Double>> typePairList0 = new java.util.ArrayList<org.apache.commons.math3.util.Pair<java.lang.reflect.Type, java.lang.Double>>();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.reflect.Type> typeDiscreteDistribution1 = new org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.reflect.Type>((java.util.List<org.apache.commons.math3.util.Pair<java.lang.reflect.Type, java.lang.Double>>) typePairList0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: array sums to zero");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.util.ArrayList<org.apache.commons.math3.util.Pair<java.lang.reflect.AnnotatedElement, java.lang.Double>> annotatedElementPairList0 = new java.util.ArrayList<org.apache.commons.math3.util.Pair<java.lang.reflect.AnnotatedElement, java.lang.Double>>();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.reflect.AnnotatedElement> annotatedElementDiscreteDistribution1 = new org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.reflect.AnnotatedElement>((java.util.List<org.apache.commons.math3.util.Pair<java.lang.reflect.AnnotatedElement, java.lang.Double>>) annotatedElementPairList0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: array sums to zero");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.util.ArrayList<org.apache.commons.math3.util.Pair<java.lang.Comparable<java.lang.String>, java.lang.Double>> strComparablePairList0 = new java.util.ArrayList<org.apache.commons.math3.util.Pair<java.lang.Comparable<java.lang.String>, java.lang.Double>>();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.Comparable<java.lang.String>> strComparableDiscreteDistribution1 = new org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.Comparable<java.lang.String>>((java.util.List<org.apache.commons.math3.util.Pair<java.lang.Comparable<java.lang.String>, java.lang.Double>>) strComparablePairList0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: array sums to zero");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        java.util.ArrayList<org.apache.commons.math3.util.Pair<java.lang.String, java.lang.Double>> strPairList1 = new java.util.ArrayList<org.apache.commons.math3.util.Pair<java.lang.String, java.lang.Double>>();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.String> strDiscreteDistribution2 = new org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.String>(randomGenerator0, (java.util.List<org.apache.commons.math3.util.Pair<java.lang.String, java.lang.Double>>) strPairList1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: array sums to zero");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        java.util.ArrayList<org.apache.commons.math3.util.Pair<java.lang.Object, java.lang.Double>> objPairList1 = new java.util.ArrayList<org.apache.commons.math3.util.Pair<java.lang.Object, java.lang.Double>>();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.Object> objDiscreteDistribution2 = new org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.Object>(randomGenerator0, (java.util.List<org.apache.commons.math3.util.Pair<java.lang.Object, java.lang.Double>>) objPairList1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: array sums to zero");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        java.util.ArrayList<org.apache.commons.math3.util.Pair<java.io.Serializable, java.lang.Double>> serializablePairList1 = new java.util.ArrayList<org.apache.commons.math3.util.Pair<java.io.Serializable, java.lang.Double>>();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.DiscreteDistribution<java.io.Serializable> serializableDiscreteDistribution2 = new org.apache.commons.math3.distribution.DiscreteDistribution<java.io.Serializable>(randomGenerator0, (java.util.List<org.apache.commons.math3.util.Pair<java.io.Serializable, java.lang.Double>>) serializablePairList1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: array sums to zero");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.util.ArrayList<org.apache.commons.math3.util.Pair<java.io.Serializable, java.lang.Double>> serializablePairList0 = new java.util.ArrayList<org.apache.commons.math3.util.Pair<java.io.Serializable, java.lang.Double>>();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.DiscreteDistribution<java.io.Serializable> serializableDiscreteDistribution1 = new org.apache.commons.math3.distribution.DiscreteDistribution<java.io.Serializable>((java.util.List<org.apache.commons.math3.util.Pair<java.io.Serializable, java.lang.Double>>) serializablePairList0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: array sums to zero");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        java.util.ArrayList<org.apache.commons.math3.util.Pair<java.lang.Comparable<java.lang.String>, java.lang.Double>> strComparablePairList1 = new java.util.ArrayList<org.apache.commons.math3.util.Pair<java.lang.Comparable<java.lang.String>, java.lang.Double>>();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.Comparable<java.lang.String>> strComparableDiscreteDistribution2 = new org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.Comparable<java.lang.String>>(randomGenerator0, (java.util.List<org.apache.commons.math3.util.Pair<java.lang.Comparable<java.lang.String>, java.lang.Double>>) strComparablePairList1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: array sums to zero");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        java.util.ArrayList<org.apache.commons.math3.util.Pair<java.lang.CharSequence, java.lang.Double>> charSequencePairList1 = new java.util.ArrayList<org.apache.commons.math3.util.Pair<java.lang.CharSequence, java.lang.Double>>();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.CharSequence> charSequenceDiscreteDistribution2 = new org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.CharSequence>(randomGenerator0, (java.util.List<org.apache.commons.math3.util.Pair<java.lang.CharSequence, java.lang.Double>>) charSequencePairList1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: array sums to zero");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        java.util.List<org.apache.commons.math3.util.Pair<java.lang.reflect.Type, java.lang.Double>> typePairList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.reflect.Type> typeDiscreteDistribution2 = new org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.reflect.Type>(randomGenerator0, typePairList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        java.util.List<org.apache.commons.math3.util.Pair<java.lang.String, java.lang.Double>> strPairList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.String> strDiscreteDistribution2 = new org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.String>(randomGenerator0, strPairList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.util.ArrayList<org.apache.commons.math3.util.Pair<java.lang.reflect.GenericDeclaration, java.lang.Double>> genericDeclarationPairList0 = new java.util.ArrayList<org.apache.commons.math3.util.Pair<java.lang.reflect.GenericDeclaration, java.lang.Double>>();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.reflect.GenericDeclaration> genericDeclarationDiscreteDistribution1 = new org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.reflect.GenericDeclaration>((java.util.List<org.apache.commons.math3.util.Pair<java.lang.reflect.GenericDeclaration, java.lang.Double>>) genericDeclarationPairList0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.MathArithmeticException; message: array sums to zero");
        } catch (org.apache.commons.math3.exception.MathArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        java.util.List<org.apache.commons.math3.util.Pair<java.lang.Object, java.lang.Double>> objPairList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.Object> objDiscreteDistribution2 = new org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.Object>(randomGenerator0, objPairList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.util.List<org.apache.commons.math3.util.Pair<java.lang.Comparable<java.lang.String>, java.lang.Double>> strComparablePairList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.Comparable<java.lang.String>> strComparableDiscreteDistribution1 = new org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.Comparable<java.lang.String>>(strComparablePairList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        java.util.List<org.apache.commons.math3.util.Pair<java.lang.Comparable<java.lang.String>, java.lang.Double>> strComparablePairList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.Comparable<java.lang.String>> strComparableDiscreteDistribution2 = new org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.Comparable<java.lang.String>>(randomGenerator0, strComparablePairList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.util.List<org.apache.commons.math3.util.Pair<java.lang.reflect.Type, java.lang.Double>> typePairList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.reflect.Type> typeDiscreteDistribution1 = new org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.reflect.Type>(typePairList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        java.util.List<org.apache.commons.math3.util.Pair<java.lang.reflect.AnnotatedElement, java.lang.Double>> annotatedElementPairList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.reflect.AnnotatedElement> annotatedElementDiscreteDistribution2 = new org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.reflect.AnnotatedElement>(randomGenerator0, annotatedElementPairList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.util.List<org.apache.commons.math3.util.Pair<java.lang.reflect.GenericDeclaration, java.lang.Double>> genericDeclarationPairList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.reflect.GenericDeclaration> genericDeclarationDiscreteDistribution1 = new org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.reflect.GenericDeclaration>(genericDeclarationPairList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        java.util.List<org.apache.commons.math3.util.Pair<java.lang.reflect.GenericDeclaration, java.lang.Double>> genericDeclarationPairList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.reflect.GenericDeclaration> genericDeclarationDiscreteDistribution2 = new org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.reflect.GenericDeclaration>(randomGenerator0, genericDeclarationPairList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        java.util.List<org.apache.commons.math3.util.Pair<java.lang.String, java.lang.Double>> strPairList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.String> strDiscreteDistribution1 = new org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.String>(strPairList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.util.List<org.apache.commons.math3.util.Pair<java.lang.reflect.AnnotatedElement, java.lang.Double>> annotatedElementPairList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.reflect.AnnotatedElement> annotatedElementDiscreteDistribution1 = new org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.reflect.AnnotatedElement>(annotatedElementPairList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        java.util.List<org.apache.commons.math3.util.Pair<java.lang.CharSequence, java.lang.Double>> charSequencePairList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.CharSequence> charSequenceDiscreteDistribution1 = new org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.CharSequence>(charSequencePairList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        java.util.List<org.apache.commons.math3.util.Pair<java.io.Serializable, java.lang.Double>> serializablePairList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.DiscreteDistribution<java.io.Serializable> serializableDiscreteDistribution1 = new org.apache.commons.math3.distribution.DiscreteDistribution<java.io.Serializable>(serializablePairList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.apache.commons.math3.random.RandomGenerator randomGenerator0 = null;
        java.util.List<org.apache.commons.math3.util.Pair<java.lang.CharSequence, java.lang.Double>> charSequencePairList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.CharSequence> charSequenceDiscreteDistribution2 = new org.apache.commons.math3.distribution.DiscreteDistribution<java.lang.CharSequence>(randomGenerator0, charSequencePairList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

