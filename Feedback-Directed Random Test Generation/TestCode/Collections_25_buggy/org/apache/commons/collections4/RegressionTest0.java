package org.apache.commons.collections4;

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
        java.util.Iterator<?> wildcardItor1 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) 100.0d);
        org.junit.Assert.assertNotNull(wildcardItor1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.commons.collections4.OrderedIterator orderedIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_ITERATOR;
        org.junit.Assert.assertNotNull(orderedIterator0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.util.Iterator<?> wildcardItor1 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) 10.0f);
        org.junit.Assert.assertNotNull(wildcardItor1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) (byte) 1, 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor1 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor3 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor4 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor4);
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor6 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray8 = new org.apache.commons.collections4.OrderedMapIterator[6];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[] objItorArray9 = (org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>[]) orderedMapIteratorArray8;
        objItorArray9[0] = objItor0;
        objItorArray9[1] = objItor1;
        objItorArray9[2] = objItor2;
        objItorArray9[3] = objItor3;
        objItorArray9[4] = objItor4;
        objItorArray9[5] = objItor6;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor24 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(objItorArray9, 3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(objItor3);
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertNotNull(objItor5);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray8);
        org.junit.Assert.assertNotNull(objItorArray9);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.Iterator<?>> wildcardItorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_ORDERED_MAP_ITERATOR;
        org.junit.Assert.assertNotNull(orderedMapIterator0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.w3c.dom.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.iterators.NodeListIterator nodeListIterator1 = org.apache.commons.collections4.IteratorUtils.nodeListIterator(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Node must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.util.Iterator<?> wildcardItor1 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(wildcardItor1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.collections4.MapIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[], org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> wildcardItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(wildcardItorArrayItor0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator> resettableListIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) 0L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass3 = objItor2.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor4 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass5 = objItor4.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor6 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass7 = objItor6.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor8 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass9 = objItor8.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray10 = new java.lang.reflect.GenericDeclaration[] { wildcardClass1, wildcardClass3, wildcardClass5, wildcardClass7, wildcardClass9 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor12 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(genericDeclarationArray10, 0);
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(genericDeclarationArray10);
        org.junit.Assert.assertNotNull(genericDeclarationItor12);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends org.apache.commons.collections4.OrderedIterator<java.lang.Object>>[]> wildcardItorArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.collections4.ResettableIterator resettableIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.junit.Assert.assertNotNull(resettableIterator0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.w3c.dom.NodeList nodeList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.iterators.NodeListIterator nodeListIterator1 = org.apache.commons.collections4.IteratorUtils.nodeListIterator(nodeList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: NodeList must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.util.Iterator<?>[] wildcardItorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.Iterator<?>> wildcardItorItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardItorArray0, (int) (byte) -1, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>, org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(objItorItor0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertNotNull(objItor2);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) "hi!", (int) (short) 10, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(annotatedElementItor0);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[] wildcardItorArray2 = (java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1;
        java.util.Iterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>>[]) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertArrayEquals(iteratorArray1, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertArrayEquals(wildcardItorArray2, new java.util.Iterator[] {});
        org.junit.Assert.assertNotNull(objItorItor3);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass3 = objItor2.getClass();
        java.lang.reflect.Type[] typeArray4 = new java.lang.reflect.Type[] { wildcardClass1, wildcardClass3 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type> typeItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(typeArray4, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(typeArray4);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) (short) 10, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(genericDeclarationItor0);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.commons.collections4.OrderedMapIterator<java.util.ListIterator, java.lang.reflect.Type> listIteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(listIteratorItor0);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.lang.Object[] objArray3 = new java.lang.Object[] { 100.0d, (byte) -1, 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objArray3, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[100.0, -1, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[100.0, -1, 0]");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass3 = objItor2.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor4 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass5 = objItor4.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor6 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass7 = objItor6.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor8 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass9 = objItor8.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray10 = new java.lang.reflect.GenericDeclaration[] { wildcardClass1, wildcardClass3, wildcardClass5, wildcardClass7, wildcardClass9 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor11 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(genericDeclarationArray10);
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objItor4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(objItor8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(genericDeclarationArray10);
        org.junit.Assert.assertNotNull(genericDeclarationItor11);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.commons.collections4.ResettableIterator<java.lang.String> strItor1 = org.apache.commons.collections4.IteratorUtils.singletonIterator("");
        org.junit.Assert.assertNotNull(strItor1);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor0);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.ResettableIterator[], java.lang.reflect.GenericDeclaration> resettableIteratorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(resettableIteratorArrayItor0);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.apache.commons.collections4.OrderedIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(objItorItor0);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor1 = org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor2 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((org.apache.commons.collections4.MapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>) objItor0);
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(objItor1);
        org.junit.Assert.assertNotNull(objItorItor2);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) ' ', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.apache.commons.collections4.ResettableListIterator resettableListIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_LIST_ITERATOR;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>>> objItorItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) resettableListIterator0, 4, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableListIterator0);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedIterator<java.lang.Object>> objItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>> wildcardClassItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) objItorItor0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objItorItor0);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        java.lang.Object[][] objArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Object[]> objArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(objArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass1 = objItor0.getClass();
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Object, java.lang.Comparable<java.lang.String>> objItor2 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        java.lang.Class<?> wildcardClass3 = objItor2.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray4 = new java.lang.reflect.GenericDeclaration[] { wildcardClass1, wildcardClass3 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray5 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray4 };
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayIterator(genericDeclarationArray5, 0);
        org.junit.Assert.assertNotNull(objItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(objItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(genericDeclarationArray4);
        org.junit.Assert.assertNotNull(genericDeclarationArray5);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor7);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray0 = new org.apache.commons.collections4.ResettableIterator[] {};
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator> resettableIteratorItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(resettableIteratorArray0);
        java.lang.Class<?> wildcardClass3 = resettableIteratorItor2.getClass();
        org.junit.Assert.assertNotNull(resettableIteratorArray0);
        org.junit.Assert.assertArrayEquals(resettableIteratorArray0, new org.apache.commons.collections4.ResettableIterator[] {});
        org.junit.Assert.assertNotNull(resettableIteratorItor1);
        org.junit.Assert.assertNotNull(resettableIteratorItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }
}

