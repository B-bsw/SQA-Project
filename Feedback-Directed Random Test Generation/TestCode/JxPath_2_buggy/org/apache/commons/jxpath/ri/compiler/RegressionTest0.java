package org.apache.commons.jxpath.ri.compiler;

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
        java.lang.Double double0 = org.apache.commons.jxpath.ri.compiler.Expression.ONE;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Double double0 = org.apache.commons.jxpath.ri.compiler.Expression.ZERO;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = pointerIterator3.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator3, qName4, locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = pointerIterator3.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator3);
        // The following exception was thrown during execution in test generation
        try {
            pointerIterator3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator3);
        java.lang.Class<?> wildcardClass8 = valueIterator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator3, qName4, locale5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = pointerIterator3.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator3, qName4, locale5);
        // The following exception was thrown during execution in test generation
        try {
            pointerIterator6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = valueIterator7.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.lang.Double double0 = org.apache.commons.jxpath.ri.compiler.Expression.NOT_A_NUMBER;
        org.junit.Assert.assertTrue(Double.isNaN(double0));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = valueIterator7.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        java.lang.Class<?> wildcardClass4 = pointerIterator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = pointerIterator3.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = pointerIterator3.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = pointerIterator3.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = valueIterator4.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        // The following exception was thrown during execution in test generation
        try {
            valueIterator4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator3);
        // The following exception was thrown during execution in test generation
        try {
            valueIterator7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator6);
        java.lang.Class<?> wildcardClass8 = valueIterator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        java.lang.Class<?> wildcardClass5 = valueIterator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = valueIterator7.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = valueIterator7.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator3, qName4, locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = pointerIterator6.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator6);
        // The following exception was thrown during execution in test generation
        try {
            valueIterator7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator3, qName4, locale5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = pointerIterator6.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator3);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator7, qName8, locale9);
        java.lang.Class<?> wildcardClass11 = valueIterator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = pointerIterator6.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator3);
        java.lang.Class<?> wildcardClass8 = pointerIterator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator3, qName4, locale5);
        // The following exception was thrown during execution in test generation
        try {
            pointerIterator3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator3);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator7, qName8, locale9);
        // The following exception was thrown during execution in test generation
        try {
            pointerIterator10.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator3);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator7, qName8, locale9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        // The following exception was thrown during execution in test generation
        try {
            valueIterator11.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator3);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator7, qName8, locale9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = valueIterator11.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator3);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator7, qName8, locale9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = pointerIterator10.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator3);
        java.lang.Class<?> wildcardClass5 = valueIterator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = pointerIterator3.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator3);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator7, qName8, locale9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = pointerIterator10.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = pointerIterator6.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = valueIterator4.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator3);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator7, qName8, locale9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        java.lang.Class<?> wildcardClass12 = valueIterator11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator3);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) valueIterator7, qName8, locale9);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator11 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = valueIterator11.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator(iterator0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = valueIterator4.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator3, qName5, locale6);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator10 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator3, qName8, locale9);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator6 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator3, qName4, locale5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator9 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator3, qName7, locale8);
        // The following exception was thrown during execution in test generation
        try {
            pointerIterator9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        java.util.Iterator iterator0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator3 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator(iterator0, qName1, locale2);
        org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator valueIterator4 = new org.apache.commons.jxpath.ri.compiler.Expression.ValueIterator((java.util.Iterator) pointerIterator3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator pointerIterator7 = new org.apache.commons.jxpath.ri.compiler.Expression.PointerIterator((java.util.Iterator) pointerIterator3, qName5, locale6);
        java.lang.Class<?> wildcardClass8 = pointerIterator7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
}

