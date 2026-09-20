package org.jfree.chart.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        int int4 = shapeList0.size();
        shapeList0.clear();
        int int6 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        shapeList7.clear();
        java.awt.Shape shape11 = shapeList7.getShape((int) (short) 1);
        java.lang.Object obj12 = shapeList7.clone();
        java.lang.Object obj13 = shapeList7.clone();
        boolean boolean14 = shapeList0.equals((java.lang.Object) shapeList7);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        shapeList16.clear();
        java.lang.Object obj18 = shapeList16.clone();
        boolean boolean20 = shapeList16.equals((java.lang.Object) (-1));
        int int21 = shapeList16.size();
        java.awt.Shape shape23 = shapeList16.getShape((int) (byte) -1);
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj25 = shapeList24.clone();
        shapeList24.clear();
        java.awt.Shape shape28 = shapeList24.getShape((int) (short) 1);
        boolean boolean30 = shapeList24.equals((java.lang.Object) (short) -1);
        java.lang.Object obj31 = null;
        boolean boolean32 = shapeList24.equals(obj31);
        int int33 = shapeList24.size();
        java.lang.Object obj34 = null;
        boolean boolean35 = shapeList24.equals(obj34);
        java.awt.Shape shape37 = shapeList24.getShape((int) 'a');
        java.awt.Shape shape39 = shapeList24.getShape((int) (byte) 0);
        boolean boolean40 = shapeList16.equals((java.lang.Object) shapeList24);
        java.awt.Shape shape42 = shapeList24.getShape(33);
        org.jfree.chart.util.ShapeList shapeList43 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape45 = null;
        shapeList43.setShape(8, shape45);
        java.awt.Shape shape48 = shapeList43.getShape((int) (byte) 100);
        java.awt.Shape shape50 = shapeList43.getShape((int) (byte) 100);
        java.awt.Shape shape52 = null;
        shapeList43.setShape(10, shape52);
        shapeList43.clear();
        boolean boolean55 = shapeList24.equals((java.lang.Object) shapeList43);
        java.lang.Object obj56 = shapeList43.clone();
        boolean boolean57 = shapeList0.equals(obj56);
        java.awt.Shape shape59 = null;
        shapeList0.setShape((int) (byte) 1, shape59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        java.lang.Object obj5 = shapeList0.clone();
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) (short) 1, shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        java.lang.Object obj5 = null;
        boolean boolean6 = shapeList0.equals(obj5);
        boolean boolean8 = shapeList0.equals((java.lang.Object) 0.0f);
        int int9 = shapeList0.size();
        java.lang.Object obj10 = shapeList0.clone();
        int int11 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj13 = shapeList0.clone();
        java.awt.Shape shape15 = null;
        shapeList0.setShape(0, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        boolean boolean5 = shapeList3.equals((java.lang.Object) (short) 1);
        boolean boolean7 = shapeList3.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = shapeList3.clone();
        java.awt.Shape shape10 = shapeList3.getShape((int) (short) -1);
        int int11 = shapeList3.size();
        boolean boolean12 = shapeList0.equals((java.lang.Object) int11);
        java.awt.Shape shape14 = shapeList0.getShape(9);
        int int15 = shapeList0.size();
        java.lang.Object obj16 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        boolean boolean18 = shapeList0.equals((java.lang.Object) shapeList17);
        java.awt.Shape shape20 = shapeList17.getShape((int) (byte) 100);
        shapeList17.clear();
        java.awt.Shape shape23 = null;
        shapeList17.setShape((int) '#', shape23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList17", shapeList0.equals(shapeList17) ? shapeList0.hashCode() == shapeList17.hashCode() : true);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        int int2 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj5 = shapeList4.clone();
        shapeList4.clear();
        shapeList4.clear();
        java.lang.Object obj8 = shapeList4.clone();
        java.lang.Object obj9 = null;
        boolean boolean10 = shapeList4.equals(obj9);
        boolean boolean12 = shapeList4.equals((java.lang.Object) 0.0f);
        int int13 = shapeList4.size();
        java.lang.Object obj14 = shapeList4.clone();
        boolean boolean15 = shapeList0.equals(obj14);
        shapeList0.clear();
        java.awt.Shape shape18 = null;
        shapeList0.setShape(53, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 10);
        java.awt.Shape shape9 = null;
        shapeList0.setShape(10, shape9);
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj12 = shapeList11.clone();
        shapeList11.clear();
        java.awt.Shape shape15 = shapeList11.getShape((int) (short) 1);
        java.lang.Object obj16 = shapeList11.clone();
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj18 = shapeList17.clone();
        shapeList17.clear();
        java.awt.Shape shape21 = shapeList17.getShape((int) (short) 1);
        boolean boolean23 = shapeList17.equals((java.lang.Object) (short) -1);
        java.lang.Object obj24 = null;
        boolean boolean25 = shapeList17.equals(obj24);
        int int26 = shapeList17.size();
        boolean boolean27 = shapeList11.equals((java.lang.Object) shapeList17);
        java.lang.Object obj28 = shapeList11.clone();
        java.lang.Object obj29 = shapeList11.clone();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        boolean boolean31 = shapeList0.equals(obj29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj5 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj7 = shapeList6.clone();
        shapeList6.clear();
        java.awt.Shape shape10 = shapeList6.getShape((int) (short) 1);
        boolean boolean12 = shapeList6.equals((java.lang.Object) (short) -1);
        java.lang.Object obj13 = null;
        boolean boolean14 = shapeList6.equals(obj13);
        int int15 = shapeList6.size();
        boolean boolean16 = shapeList0.equals((java.lang.Object) shapeList6);
        java.awt.Shape shape18 = shapeList0.getShape(100);
        boolean boolean20 = shapeList0.equals((java.lang.Object) false);
        int int21 = shapeList0.size();
        java.lang.Object obj22 = shapeList0.clone();
        java.awt.Shape shape24 = null;
        shapeList0.setShape(36, shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        boolean boolean6 = shapeList0.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        shapeList7.clear();
        int int9 = shapeList7.size();
        int int10 = shapeList7.size();
        boolean boolean11 = shapeList0.equals((java.lang.Object) int10);
        java.lang.Object obj12 = shapeList0.clone();
        java.awt.Shape shape14 = shapeList0.getShape((int) (short) 0);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        int int17 = shapeList16.size();
        shapeList16.clear();
        java.awt.Shape shape20 = null;
        shapeList16.setShape((int) (short) 100, shape20);
        java.lang.Object obj22 = shapeList16.clone();
        java.lang.Object obj23 = shapeList16.clone();
        java.lang.Object obj24 = shapeList16.clone();
        java.awt.Shape shape26 = shapeList16.getShape(0);
        java.awt.Shape shape28 = shapeList16.getShape(0);
        java.awt.Shape shape30 = null;
        shapeList16.setShape((int) (short) 0, shape30);
        java.awt.Shape shape33 = null;
        shapeList16.setShape(0, shape33);
        boolean boolean35 = shapeList0.equals((java.lang.Object) shape33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList16", shapeList0.equals(shapeList16) ? shapeList0.hashCode() == shapeList16.hashCode() : true);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        java.lang.Object obj5 = shapeList0.clone();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        shapeList7.clear();
        java.awt.Shape shape11 = shapeList7.getShape((int) (short) 1);
        boolean boolean13 = shapeList7.equals((java.lang.Object) 'a');
        java.lang.Object obj14 = shapeList7.clone();
        java.lang.Object obj15 = shapeList7.clone();
        boolean boolean16 = shapeList0.equals((java.lang.Object) shapeList7);
        int int17 = shapeList0.size();
        java.lang.Object obj18 = shapeList0.clone();
        java.awt.Shape shape20 = null;
        shapeList0.setShape((int) '#', shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        boolean boolean5 = shapeList3.equals((java.lang.Object) (short) 1);
        boolean boolean7 = shapeList3.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = shapeList3.clone();
        java.awt.Shape shape10 = shapeList3.getShape((int) (short) -1);
        int int11 = shapeList3.size();
        boolean boolean12 = shapeList0.equals((java.lang.Object) int11);
        shapeList0.clear();
        java.awt.Shape shape15 = shapeList0.getShape((int) (short) 0);
        shapeList0.clear();
        java.awt.Shape shape18 = shapeList0.getShape(33);
        java.awt.Shape shape20 = shapeList0.getShape((int) ' ');
        java.lang.Object obj21 = shapeList0.clone();
        java.awt.Shape shape23 = null;
        shapeList0.setShape((int) (short) 1, shape23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = null;
        boolean boolean8 = shapeList0.equals(obj7);
        int int9 = shapeList0.size();
        java.lang.Object obj10 = null;
        boolean boolean11 = shapeList0.equals(obj10);
        java.awt.Shape shape13 = shapeList0.getShape((int) 'a');
        java.awt.Shape shape15 = shapeList0.getShape(33);
        java.awt.Shape shape17 = null;
        shapeList0.setShape((int) (short) 10, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = shapeList0.getShape(1);
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        shapeList7.clear();
        java.awt.Shape shape11 = shapeList7.getShape((int) (short) 1);
        shapeList7.clear();
        shapeList7.clear();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj15 = shapeList14.clone();
        shapeList14.clear();
        java.awt.Shape shape18 = shapeList14.getShape((int) (short) 1);
        boolean boolean20 = shapeList14.equals((java.lang.Object) (short) -1);
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj22 = shapeList21.clone();
        shapeList21.clear();
        java.awt.Shape shape25 = shapeList21.getShape((int) (short) 1);
        boolean boolean27 = shapeList21.equals((java.lang.Object) 0);
        shapeList21.clear();
        boolean boolean29 = shapeList14.equals((java.lang.Object) shapeList21);
        boolean boolean30 = shapeList7.equals((java.lang.Object) boolean29);
        java.lang.Object obj31 = shapeList7.clone();
        boolean boolean32 = shapeList0.equals((java.lang.Object) shapeList7);
        java.awt.Shape shape34 = null;
        shapeList7.setShape((int) (short) 10, shape34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) 1.0d);
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj6 = shapeList5.clone();
        shapeList5.clear();
        java.awt.Shape shape9 = shapeList5.getShape((int) (short) 1);
        boolean boolean11 = shapeList5.equals((java.lang.Object) 0);
        java.lang.Object obj12 = shapeList5.clone();
        boolean boolean14 = shapeList5.equals((java.lang.Object) false);
        java.lang.Object obj15 = shapeList5.clone();
        boolean boolean16 = shapeList0.equals((java.lang.Object) shapeList5);
        shapeList0.clear();
        java.lang.Object obj18 = shapeList0.clone();
        java.lang.Object obj19 = shapeList0.clone();
        java.awt.Shape shape21 = null;
        shapeList0.setShape(0, shape21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        shapeList0.clear();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        shapeList7.clear();
        int int9 = shapeList7.size();
        java.lang.Object obj10 = shapeList7.clone();
        boolean boolean11 = shapeList0.equals(obj10);
        java.awt.Shape shape13 = shapeList0.getShape((int) (short) 10);
        java.lang.Object obj14 = null;
        boolean boolean15 = shapeList0.equals(obj14);
        java.awt.Shape shape17 = null;
        shapeList0.setShape((int) (byte) 100, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (byte) 1, shape4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(1);
        int int5 = shapeList0.size();
        shapeList0.clear();
        int int7 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        boolean boolean10 = shapeList8.equals((java.lang.Object) (short) 1);
        boolean boolean12 = shapeList8.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj13 = shapeList8.clone();
        java.awt.Shape shape15 = shapeList8.getShape((int) (short) -1);
        boolean boolean17 = shapeList8.equals((java.lang.Object) (-1.0d));
        int int18 = shapeList8.size();
        java.lang.Class<?> wildcardClass19 = shapeList8.getClass();
        boolean boolean20 = shapeList0.equals((java.lang.Object) wildcardClass19);
        java.awt.Shape shape22 = null;
        shapeList0.setShape(10, shape22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        java.lang.Object obj3 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj5 = shapeList4.clone();
        shapeList4.clear();
        java.awt.Shape shape8 = shapeList4.getShape((int) ' ');
        java.lang.Object obj9 = shapeList4.clone();
        shapeList4.clear();
        boolean boolean11 = shapeList0.equals((java.lang.Object) shapeList4);
        java.awt.Shape shape13 = shapeList0.getShape(10);
        int int14 = shapeList0.size();
        java.lang.Object obj15 = shapeList0.clone();
        java.awt.Shape shape17 = null;
        shapeList0.setShape(0, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape(1);
        java.awt.Shape shape9 = shapeList0.getShape(36);
        java.awt.Shape shape11 = shapeList0.getShape((int) (short) 100);
        java.awt.Shape shape13 = null;
        shapeList0.setShape(34, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = null;
        boolean boolean8 = shapeList0.equals(obj7);
        int int9 = shapeList0.size();
        java.lang.Object obj10 = null;
        boolean boolean11 = shapeList0.equals(obj10);
        java.awt.Shape shape13 = shapeList0.getShape((int) 'a');
        java.awt.Shape shape15 = shapeList0.getShape((int) '4');
        java.awt.Shape shape17 = shapeList0.getShape((int) '#');
        java.awt.Shape shape19 = shapeList0.getShape((int) (byte) -1);
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        int int21 = shapeList20.size();
        shapeList20.clear();
        java.lang.Object obj23 = shapeList20.clone();
        shapeList20.clear();
        shapeList20.clear();
        boolean boolean26 = shapeList0.equals((java.lang.Object) shapeList20);
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        shapeList27.clear();
        java.lang.Object obj29 = shapeList27.clone();
        boolean boolean31 = shapeList27.equals((java.lang.Object) (-1));
        int int32 = shapeList27.size();
        java.awt.Shape shape34 = shapeList27.getShape((int) (byte) -1);
        org.jfree.chart.util.ShapeList shapeList35 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj36 = shapeList35.clone();
        shapeList35.clear();
        java.awt.Shape shape39 = shapeList35.getShape((int) (short) 1);
        boolean boolean41 = shapeList35.equals((java.lang.Object) (short) -1);
        java.lang.Object obj42 = null;
        boolean boolean43 = shapeList35.equals(obj42);
        int int44 = shapeList35.size();
        java.lang.Object obj45 = null;
        boolean boolean46 = shapeList35.equals(obj45);
        java.awt.Shape shape48 = shapeList35.getShape((int) 'a');
        java.awt.Shape shape50 = shapeList35.getShape((int) (byte) 0);
        boolean boolean51 = shapeList27.equals((java.lang.Object) shapeList35);
        java.awt.Shape shape53 = shapeList35.getShape(33);
        org.jfree.chart.util.ShapeList shapeList54 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape56 = null;
        shapeList54.setShape(8, shape56);
        java.awt.Shape shape59 = shapeList54.getShape((int) (byte) 100);
        java.awt.Shape shape61 = shapeList54.getShape((int) (byte) 100);
        java.awt.Shape shape63 = null;
        shapeList54.setShape(10, shape63);
        shapeList54.clear();
        boolean boolean66 = shapeList35.equals((java.lang.Object) shapeList54);
        int int67 = shapeList35.size();
        java.awt.Shape shape69 = shapeList35.getShape((int) (byte) 0);
        int int70 = shapeList35.size();
        boolean boolean71 = shapeList0.equals((java.lang.Object) shapeList35);
        java.awt.Shape shape73 = null;
        shapeList35.setShape((int) 'a', shape73);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList35", shapeList0.equals(shapeList35) ? shapeList0.hashCode() == shapeList35.hashCode() : true);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        int int4 = shapeList0.size();
        shapeList0.clear();
        int int6 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        shapeList7.clear();
        java.awt.Shape shape11 = shapeList7.getShape((int) (short) 1);
        java.lang.Object obj12 = shapeList7.clone();
        java.lang.Object obj13 = shapeList7.clone();
        boolean boolean14 = shapeList0.equals((java.lang.Object) shapeList7);
        shapeList0.clear();
        java.awt.Shape shape17 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        boolean boolean20 = shapeList18.equals((java.lang.Object) (short) 1);
        boolean boolean22 = shapeList18.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj23 = shapeList18.clone();
        java.awt.Shape shape25 = shapeList18.getShape((int) (short) -1);
        int int26 = shapeList18.size();
        int int27 = shapeList18.size();
        int int28 = shapeList18.size();
        java.awt.Shape shape30 = shapeList18.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList31 = new org.jfree.chart.util.ShapeList();
        shapeList31.clear();
        java.lang.Object obj33 = shapeList31.clone();
        org.jfree.chart.util.ShapeList shapeList34 = new org.jfree.chart.util.ShapeList();
        boolean boolean36 = shapeList34.equals((java.lang.Object) (short) 1);
        boolean boolean38 = shapeList34.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj39 = shapeList34.clone();
        java.awt.Shape shape41 = shapeList34.getShape((int) (short) -1);
        int int42 = shapeList34.size();
        boolean boolean43 = shapeList31.equals((java.lang.Object) int42);
        java.awt.Shape shape45 = shapeList31.getShape(9);
        int int46 = shapeList31.size();
        java.lang.Object obj47 = shapeList31.clone();
        java.lang.Class<?> wildcardClass48 = obj47.getClass();
        boolean boolean49 = shapeList18.equals((java.lang.Object) wildcardClass48);
        java.awt.Shape shape51 = shapeList18.getShape(0);
        java.lang.Object obj52 = shapeList18.clone();
        boolean boolean53 = shapeList0.equals(obj52);
        org.jfree.chart.util.ShapeList shapeList54 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape56 = null;
        shapeList54.setShape(8, shape56);
        java.awt.Shape shape59 = shapeList54.getShape((int) (byte) 100);
        java.awt.Shape shape61 = null;
        shapeList54.setShape(0, shape61);
        java.awt.Shape shape64 = null;
        shapeList54.setShape((int) (short) 0, shape64);
        int int66 = shapeList54.size();
        boolean boolean67 = shapeList0.equals((java.lang.Object) int66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList54", shapeList0.equals(shapeList54) ? shapeList0.hashCode() == shapeList54.hashCode() : true);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.awt.Shape shape7 = shapeList0.getShape((int) '4');
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = null;
        shapeList0.setShape(9, shape10);
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        shapeList12.clear();
        int int14 = shapeList12.size();
        java.awt.Shape shape16 = null;
        shapeList12.setShape((int) '#', shape16);
        java.lang.Object obj18 = shapeList12.clone();
        java.lang.Object obj19 = shapeList12.clone();
        java.awt.Shape shape21 = shapeList12.getShape(0);
        boolean boolean22 = shapeList0.equals((java.lang.Object) shapeList12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) 1.0d);
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 10);
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) '4', shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj8 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj10 = shapeList9.clone();
        shapeList9.clear();
        java.awt.Shape shape13 = shapeList9.getShape((int) (short) 1);
        boolean boolean15 = shapeList9.equals((java.lang.Object) 'a');
        java.lang.Object obj16 = shapeList9.clone();
        int int17 = shapeList9.size();
        java.lang.Object obj18 = shapeList9.clone();
        boolean boolean19 = shapeList0.equals((java.lang.Object) shapeList9);
        int int20 = shapeList0.size();
        java.awt.Shape shape22 = shapeList0.getShape(36);
        java.awt.Shape shape24 = null;
        shapeList0.setShape((int) (byte) 0, shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        java.awt.Shape shape5 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape7 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape9 = shapeList0.getShape(11);
        java.awt.Shape shape11 = null;
        shapeList0.setShape(1, shape11);
        int int13 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        shapeList14.clear();
        shapeList14.clear();
        int int17 = shapeList14.size();
        java.lang.Object obj18 = shapeList14.clone();
        boolean boolean19 = shapeList0.equals((java.lang.Object) shapeList14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        boolean boolean6 = shapeList0.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        shapeList7.clear();
        int int9 = shapeList7.size();
        int int10 = shapeList7.size();
        boolean boolean11 = shapeList0.equals((java.lang.Object) int10);
        java.lang.Object obj12 = shapeList0.clone();
        java.lang.Object obj13 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape16 = shapeList0.getShape((int) (byte) 0);
        shapeList0.clear();
        java.lang.Object obj18 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj20 = shapeList19.clone();
        shapeList19.clear();
        java.awt.Shape shape23 = shapeList19.getShape((int) (short) 1);
        java.lang.Object obj24 = shapeList19.clone();
        java.lang.Object obj25 = shapeList19.clone();
        boolean boolean26 = shapeList0.equals(obj25);
        java.awt.Shape shape28 = null;
        shapeList0.setShape(36, shape28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        java.awt.Shape shape5 = shapeList0.getShape(100);
        java.awt.Shape shape7 = null;
        shapeList0.setShape(10, shape7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj3", shapeList0.equals(obj3) ? shapeList0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 'a');
        java.lang.Object obj7 = shapeList0.clone();
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = shapeList0.getShape(101);
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj12 = shapeList11.clone();
        shapeList11.clear();
        java.awt.Shape shape15 = shapeList11.getShape((int) (short) 1);
        boolean boolean17 = shapeList11.equals((java.lang.Object) (short) -1);
        shapeList11.clear();
        java.awt.Shape shape20 = shapeList11.getShape((int) (short) 100);
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        shapeList21.clear();
        int int23 = shapeList21.size();
        shapeList21.clear();
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj26 = shapeList25.clone();
        shapeList25.clear();
        java.awt.Shape shape29 = shapeList25.getShape((int) (short) 1);
        boolean boolean31 = shapeList25.equals((java.lang.Object) 'a');
        java.lang.Object obj32 = shapeList25.clone();
        int int33 = shapeList25.size();
        boolean boolean34 = shapeList21.equals((java.lang.Object) shapeList25);
        java.lang.Object obj35 = shapeList25.clone();
        boolean boolean36 = shapeList11.equals((java.lang.Object) shapeList25);
        boolean boolean37 = shapeList0.equals((java.lang.Object) shapeList11);
        int int38 = shapeList11.size();
        java.awt.Shape shape40 = null;
        shapeList11.setShape(0, shape40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj5 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj7 = shapeList6.clone();
        shapeList6.clear();
        java.awt.Shape shape10 = shapeList6.getShape((int) (short) 1);
        boolean boolean12 = shapeList6.equals((java.lang.Object) (short) -1);
        java.lang.Object obj13 = null;
        boolean boolean14 = shapeList6.equals(obj13);
        int int15 = shapeList6.size();
        boolean boolean16 = shapeList0.equals((java.lang.Object) shapeList6);
        java.awt.Shape shape18 = shapeList0.getShape(100);
        boolean boolean20 = shapeList0.equals((java.lang.Object) false);
        java.awt.Shape shape22 = shapeList0.getShape(9);
        java.awt.Shape shape24 = null;
        shapeList0.setShape(100, shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape(101);
        int int11 = shapeList0.size();
        int int12 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape15 = null;
        shapeList13.setShape(8, shape15);
        java.awt.Shape shape18 = shapeList13.getShape((int) (byte) 100);
        java.awt.Shape shape20 = null;
        shapeList13.setShape(0, shape20);
        java.awt.Shape shape23 = null;
        shapeList13.setShape((int) (short) 0, shape23);
        java.lang.Object obj25 = shapeList13.clone();
        boolean boolean26 = shapeList0.equals(obj25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.lang.Object obj6 = shapeList0.clone();
        java.lang.Object obj7 = shapeList0.clone();
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape(0);
        java.awt.Shape shape12 = shapeList0.getShape(0);
        java.awt.Shape shape14 = null;
        shapeList0.setShape((int) (short) 0, shape14);
        java.awt.Shape shape17 = shapeList0.getShape(100);
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj5 = shapeList4.clone();
        shapeList4.clear();
        java.awt.Shape shape8 = shapeList4.getShape((int) (short) 1);
        boolean boolean10 = shapeList4.equals((java.lang.Object) (short) -1);
        boolean boolean11 = shapeList0.equals((java.lang.Object) shapeList4);
        int int12 = shapeList4.size();
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj14 = shapeList13.clone();
        shapeList13.clear();
        java.awt.Shape shape17 = shapeList13.getShape((int) (short) 1);
        boolean boolean19 = shapeList13.equals((java.lang.Object) 0);
        java.lang.Object obj20 = shapeList13.clone();
        java.lang.Object obj21 = shapeList13.clone();
        java.lang.Class<?> wildcardClass22 = shapeList13.getClass();
        boolean boolean23 = shapeList4.equals((java.lang.Object) shapeList13);
        java.awt.Shape shape25 = shapeList4.getShape((int) (byte) 0);
        java.awt.Shape shape27 = null;
        shapeList4.setShape((int) (byte) 10, shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1));
        int int5 = shapeList0.size();
        java.awt.Shape shape7 = shapeList0.getShape((int) (byte) -1);
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj9 = shapeList8.clone();
        shapeList8.clear();
        java.awt.Shape shape12 = shapeList8.getShape((int) (short) 1);
        boolean boolean14 = shapeList8.equals((java.lang.Object) (short) -1);
        java.lang.Object obj15 = null;
        boolean boolean16 = shapeList8.equals(obj15);
        int int17 = shapeList8.size();
        java.lang.Object obj18 = null;
        boolean boolean19 = shapeList8.equals(obj18);
        java.awt.Shape shape21 = shapeList8.getShape((int) 'a');
        java.awt.Shape shape23 = shapeList8.getShape((int) (byte) 0);
        boolean boolean24 = shapeList0.equals((java.lang.Object) shapeList8);
        java.awt.Shape shape26 = null;
        shapeList0.setShape(2, shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        int int4 = shapeList0.size();
        shapeList0.clear();
        int int6 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        shapeList7.clear();
        java.awt.Shape shape11 = shapeList7.getShape((int) (short) 1);
        java.lang.Object obj12 = shapeList7.clone();
        java.lang.Object obj13 = shapeList7.clone();
        boolean boolean14 = shapeList0.equals((java.lang.Object) shapeList7);
        java.awt.Shape shape16 = null;
        shapeList0.setShape(8, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        boolean boolean5 = shapeList3.equals((java.lang.Object) (short) 1);
        boolean boolean7 = shapeList3.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = shapeList3.clone();
        java.awt.Shape shape10 = shapeList3.getShape((int) (short) -1);
        int int11 = shapeList3.size();
        boolean boolean12 = shapeList0.equals((java.lang.Object) int11);
        shapeList0.clear();
        java.awt.Shape shape15 = shapeList0.getShape((int) (short) 0);
        shapeList0.clear();
        java.awt.Shape shape18 = shapeList0.getShape((int) (short) -1);
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj20 = shapeList19.clone();
        shapeList19.clear();
        java.awt.Shape shape23 = shapeList19.getShape((int) (short) 1);
        java.lang.Object obj24 = shapeList19.clone();
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj26 = shapeList25.clone();
        shapeList25.clear();
        java.awt.Shape shape29 = shapeList25.getShape((int) (short) 1);
        boolean boolean31 = shapeList25.equals((java.lang.Object) (short) -1);
        java.lang.Object obj32 = null;
        boolean boolean33 = shapeList25.equals(obj32);
        int int34 = shapeList25.size();
        boolean boolean35 = shapeList19.equals((java.lang.Object) shapeList25);
        shapeList19.clear();
        int int37 = shapeList19.size();
        java.lang.Object obj38 = shapeList19.clone();
        boolean boolean39 = shapeList0.equals((java.lang.Object) shapeList19);
        java.awt.Shape shape41 = null;
        shapeList19.setShape((int) (byte) 100, shape41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList19", shapeList0.equals(shapeList19) ? shapeList0.hashCode() == shapeList19.hashCode() : true);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        int int4 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        shapeList6.clear();
        java.lang.Object obj8 = shapeList6.clone();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) (short) 1);
        boolean boolean13 = shapeList9.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = shapeList9.clone();
        java.awt.Shape shape16 = shapeList9.getShape((int) (short) -1);
        int int17 = shapeList9.size();
        boolean boolean18 = shapeList6.equals((java.lang.Object) int17);
        shapeList6.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList6);
        java.lang.Object obj21 = shapeList6.clone();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        shapeList22.clear();
        java.lang.Object obj24 = shapeList22.clone();
        boolean boolean25 = shapeList6.equals((java.lang.Object) shapeList22);
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        boolean boolean28 = shapeList26.equals((java.lang.Object) (short) 1);
        boolean boolean30 = shapeList26.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape32 = null;
        shapeList26.setShape(0, shape32);
        java.lang.Object obj34 = shapeList26.clone();
        java.lang.Object obj35 = shapeList26.clone();
        int int36 = shapeList26.size();
        java.lang.Class<?> wildcardClass37 = shapeList26.getClass();
        boolean boolean38 = shapeList6.equals((java.lang.Object) wildcardClass37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList26", shapeList0.equals(shapeList26) ? shapeList0.hashCode() == shapeList26.hashCode() : true);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) -1);
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        int int10 = shapeList0.size();
        java.awt.Shape shape12 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        shapeList13.clear();
        java.lang.Object obj15 = shapeList13.clone();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        boolean boolean18 = shapeList16.equals((java.lang.Object) (short) 1);
        boolean boolean20 = shapeList16.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj21 = shapeList16.clone();
        java.awt.Shape shape23 = shapeList16.getShape((int) (short) -1);
        int int24 = shapeList16.size();
        boolean boolean25 = shapeList13.equals((java.lang.Object) int24);
        java.awt.Shape shape27 = shapeList13.getShape(9);
        int int28 = shapeList13.size();
        java.lang.Object obj29 = shapeList13.clone();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        boolean boolean31 = shapeList0.equals((java.lang.Object) wildcardClass30);
        int int32 = shapeList0.size();
        java.awt.Shape shape34 = null;
        shapeList0.setShape((int) 'a', shape34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 0, shape6);
        int int8 = shapeList0.size();
        boolean boolean10 = shapeList0.equals((java.lang.Object) (byte) 1);
        java.awt.Shape shape12 = shapeList0.getShape((int) '4');
        java.awt.Shape shape14 = null;
        shapeList0.setShape(9, shape14);
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj17 = shapeList16.clone();
        shapeList16.clear();
        java.awt.Shape shape20 = shapeList16.getShape((int) (short) 1);
        boolean boolean22 = shapeList16.equals((java.lang.Object) (short) -1);
        java.lang.Object obj23 = null;
        boolean boolean24 = shapeList16.equals(obj23);
        int int25 = shapeList16.size();
        java.lang.Object obj26 = null;
        boolean boolean27 = shapeList16.equals(obj26);
        java.awt.Shape shape29 = shapeList16.getShape((int) 'a');
        java.awt.Shape shape31 = shapeList16.getShape((int) '4');
        java.awt.Shape shape33 = shapeList16.getShape((int) '#');
        java.awt.Shape shape35 = shapeList16.getShape((int) (byte) -1);
        java.lang.Object obj36 = shapeList16.clone();
        shapeList16.clear();
        boolean boolean38 = shapeList0.equals((java.lang.Object) shapeList16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList16", shapeList0.equals(shapeList16) ? shapeList0.hashCode() == shapeList16.hashCode() : true);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape(0, shape6);
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = shapeList0.getShape((int) (byte) 10);
        java.awt.Shape shape13 = null;
        shapeList0.setShape((int) '#', shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = null;
        boolean boolean8 = shapeList0.equals(obj7);
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) (short) 1);
        boolean boolean13 = shapeList9.equals((java.lang.Object) 1.0d);
        java.lang.Object obj14 = shapeList9.clone();
        boolean boolean15 = shapeList0.equals(obj14);
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj17 = shapeList16.clone();
        shapeList16.clear();
        java.awt.Shape shape20 = shapeList16.getShape((int) (short) 1);
        java.lang.Object obj21 = shapeList16.clone();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj23 = shapeList22.clone();
        shapeList22.clear();
        java.awt.Shape shape26 = shapeList22.getShape((int) (short) 1);
        boolean boolean28 = shapeList22.equals((java.lang.Object) (short) -1);
        java.lang.Object obj29 = null;
        boolean boolean30 = shapeList22.equals(obj29);
        int int31 = shapeList22.size();
        boolean boolean32 = shapeList16.equals((java.lang.Object) shapeList22);
        boolean boolean33 = shapeList0.equals((java.lang.Object) shapeList22);
        org.jfree.chart.util.ShapeList shapeList34 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj35 = shapeList34.clone();
        shapeList34.clear();
        boolean boolean37 = shapeList0.equals((java.lang.Object) shapeList34);
        shapeList34.clear();
        java.lang.Object obj39 = shapeList34.clone();
        java.awt.Shape shape41 = null;
        shapeList34.setShape(2, shape41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList34", shapeList0.equals(shapeList34) ? shapeList0.hashCode() == shapeList34.hashCode() : true);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        boolean boolean5 = shapeList3.equals((java.lang.Object) (short) 1);
        boolean boolean7 = shapeList3.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = shapeList3.clone();
        java.awt.Shape shape10 = shapeList3.getShape((int) (short) -1);
        int int11 = shapeList3.size();
        boolean boolean12 = shapeList0.equals((java.lang.Object) int11);
        int int13 = shapeList0.size();
        java.awt.Shape shape15 = shapeList0.getShape(0);
        java.awt.Shape shape17 = shapeList0.getShape(101);
        java.lang.Object obj18 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj20 = shapeList19.clone();
        shapeList19.clear();
        java.awt.Shape shape23 = shapeList19.getShape((int) (short) 1);
        java.lang.Object obj24 = shapeList19.clone();
        java.awt.Shape shape26 = shapeList19.getShape((int) (short) 100);
        java.awt.Shape shape28 = shapeList19.getShape((int) '#');
        boolean boolean29 = shapeList0.equals((java.lang.Object) shape28);
        int int30 = shapeList0.size();
        java.lang.Object obj31 = shapeList0.clone();
        java.awt.Shape shape33 = null;
        shapeList0.setShape(0, shape33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = shapeList0.clone();
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape((int) (byte) 10);
        java.awt.Shape shape12 = shapeList0.getShape(101);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        int int14 = shapeList13.size();
        shapeList13.clear();
        java.lang.Object obj16 = shapeList13.clone();
        java.awt.Shape shape18 = shapeList13.getShape((int) (short) -1);
        shapeList13.clear();
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        boolean boolean22 = shapeList20.equals((java.lang.Object) (short) 1);
        boolean boolean24 = shapeList20.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj25 = shapeList20.clone();
        java.awt.Shape shape27 = shapeList20.getShape((int) (short) -1);
        int int28 = shapeList20.size();
        int int29 = shapeList20.size();
        int int30 = shapeList20.size();
        java.awt.Shape shape32 = shapeList20.getShape((int) '#');
        int int33 = shapeList20.size();
        java.lang.Object obj34 = shapeList20.clone();
        int int35 = shapeList20.size();
        shapeList20.clear();
        java.lang.Object obj37 = shapeList20.clone();
        boolean boolean38 = shapeList13.equals(obj37);
        boolean boolean39 = shapeList0.equals((java.lang.Object) shapeList13);
        java.awt.Shape shape41 = null;
        shapeList13.setShape(100, shape41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape((int) (short) 0);
        java.awt.Shape shape12 = shapeList0.getShape((int) (byte) 10);
        java.lang.Object obj13 = shapeList0.clone();
        java.awt.Shape shape15 = null;
        shapeList0.setShape((int) '#', shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        int int4 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        shapeList6.clear();
        java.lang.Object obj8 = shapeList6.clone();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) (short) 1);
        boolean boolean13 = shapeList9.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = shapeList9.clone();
        java.awt.Shape shape16 = shapeList9.getShape((int) (short) -1);
        int int17 = shapeList9.size();
        boolean boolean18 = shapeList6.equals((java.lang.Object) int17);
        shapeList6.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList6);
        shapeList6.clear();
        java.lang.Object obj22 = shapeList6.clone();
        java.awt.Shape shape24 = shapeList6.getShape((int) 'a');
        java.awt.Shape shape26 = shapeList6.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj28 = shapeList27.clone();
        shapeList27.clear();
        java.awt.Shape shape31 = shapeList27.getShape((int) (short) 1);
        boolean boolean33 = shapeList27.equals((java.lang.Object) (short) -1);
        shapeList27.clear();
        shapeList27.clear();
        java.lang.Object obj36 = shapeList27.clone();
        java.awt.Shape shape38 = shapeList27.getShape(1);
        boolean boolean39 = shapeList6.equals((java.lang.Object) shapeList27);
        java.awt.Shape shape41 = null;
        shapeList6.setShape(1, shape41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj7 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj9 = shapeList8.clone();
        shapeList8.clear();
        java.lang.Object obj11 = shapeList8.clone();
        int int12 = shapeList8.size();
        java.lang.Object obj13 = shapeList8.clone();
        int int14 = shapeList8.size();
        java.lang.Class<?> wildcardClass15 = shapeList8.getClass();
        boolean boolean16 = shapeList0.equals((java.lang.Object) wildcardClass15);
        java.awt.Shape shape18 = null;
        shapeList0.setShape((int) ' ', shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        boolean boolean5 = shapeList3.equals((java.lang.Object) (short) 1);
        boolean boolean7 = shapeList3.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = shapeList3.clone();
        java.awt.Shape shape10 = shapeList3.getShape((int) (short) -1);
        int int11 = shapeList3.size();
        boolean boolean12 = shapeList0.equals((java.lang.Object) int11);
        shapeList0.clear();
        java.awt.Shape shape15 = null;
        shapeList0.setShape((int) (short) 1, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj8 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj10 = shapeList9.clone();
        shapeList9.clear();
        java.awt.Shape shape13 = shapeList9.getShape((int) (short) 1);
        boolean boolean15 = shapeList9.equals((java.lang.Object) 'a');
        java.lang.Object obj16 = shapeList9.clone();
        int int17 = shapeList9.size();
        java.lang.Object obj18 = shapeList9.clone();
        boolean boolean19 = shapeList0.equals((java.lang.Object) shapeList9);
        int int20 = shapeList0.size();
        java.awt.Shape shape22 = null;
        shapeList0.setShape(33, shape22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        int int2 = shapeList0.size();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) '#', shape4);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        shapeList7.clear();
        java.awt.Shape shape11 = shapeList7.getShape((int) (short) 1);
        boolean boolean13 = shapeList7.equals((java.lang.Object) 0);
        int int14 = shapeList7.size();
        int int15 = shapeList7.size();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        shapeList16.clear();
        java.awt.Shape shape19 = shapeList16.getShape(10);
        boolean boolean20 = shapeList7.equals((java.lang.Object) shapeList16);
        boolean boolean21 = shapeList0.equals((java.lang.Object) boolean20);
        java.awt.Shape shape23 = shapeList0.getShape((int) 'a');
        int int24 = shapeList0.size();
        int int25 = shapeList0.size();
        java.awt.Shape shape27 = null;
        shapeList0.setShape((int) '#', shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 0);
        shapeList0.clear();
        java.awt.Shape shape9 = null;
        shapeList0.setShape(8, shape9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape7 = null;
        shapeList0.setShape(101, shape7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj3", shapeList0.equals(obj3) ? shapeList0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        java.lang.Object obj3 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj5 = shapeList4.clone();
        shapeList4.clear();
        java.awt.Shape shape8 = shapeList4.getShape((int) ' ');
        java.lang.Object obj9 = shapeList4.clone();
        shapeList4.clear();
        boolean boolean11 = shapeList0.equals((java.lang.Object) shapeList4);
        java.awt.Shape shape13 = null;
        shapeList0.setShape(11, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.awt.Shape shape7 = null;
        shapeList0.setShape((int) '#', shape7);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj11 = shapeList10.clone();
        shapeList10.clear();
        java.lang.Object obj13 = shapeList10.clone();
        int int14 = shapeList10.size();
        shapeList10.clear();
        shapeList10.clear();
        shapeList10.clear();
        java.lang.Object obj18 = shapeList10.clone();
        boolean boolean19 = shapeList0.equals((java.lang.Object) shapeList10);
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj21 = shapeList20.clone();
        shapeList20.clear();
        java.awt.Shape shape24 = shapeList20.getShape((int) (short) 1);
        boolean boolean26 = shapeList20.equals((java.lang.Object) (short) -1);
        java.lang.Object obj27 = shapeList20.clone();
        java.awt.Shape shape29 = shapeList20.getShape((int) (short) -1);
        org.jfree.chart.util.ShapeList shapeList30 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj31 = shapeList30.clone();
        shapeList30.clear();
        java.lang.Object obj33 = shapeList30.clone();
        org.jfree.chart.util.ShapeList shapeList34 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj35 = shapeList34.clone();
        shapeList34.clear();
        java.awt.Shape shape38 = shapeList34.getShape((int) (short) 1);
        boolean boolean40 = shapeList34.equals((java.lang.Object) (short) -1);
        boolean boolean41 = shapeList30.equals((java.lang.Object) shapeList34);
        java.lang.Object obj42 = shapeList30.clone();
        java.awt.Shape shape44 = shapeList30.getShape(8);
        org.jfree.chart.util.ShapeList shapeList45 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj46 = shapeList45.clone();
        shapeList45.clear();
        java.awt.Shape shape49 = shapeList45.getShape((int) (short) 1);
        boolean boolean51 = shapeList45.equals((java.lang.Object) (short) -1);
        java.lang.Object obj52 = null;
        boolean boolean53 = shapeList45.equals(obj52);
        int int54 = shapeList45.size();
        java.lang.Object obj55 = null;
        boolean boolean56 = shapeList45.equals(obj55);
        java.awt.Shape shape58 = shapeList45.getShape((int) 'a');
        java.awt.Shape shape60 = shapeList45.getShape((int) '4');
        java.awt.Shape shape62 = shapeList45.getShape((int) '#');
        java.awt.Shape shape64 = shapeList45.getShape((int) (byte) -1);
        java.lang.Object obj65 = shapeList45.clone();
        boolean boolean66 = shapeList30.equals((java.lang.Object) shapeList45);
        java.lang.Object obj67 = shapeList30.clone();
        boolean boolean68 = shapeList20.equals((java.lang.Object) shapeList30);
        boolean boolean69 = shapeList0.equals((java.lang.Object) boolean68);
        java.awt.Shape shape71 = null;
        shapeList0.setShape((int) 'a', shape71);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        java.lang.Object obj5 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj9 = shapeList8.clone();
        shapeList8.clear();
        shapeList8.clear();
        java.awt.Shape shape13 = shapeList8.getShape((int) '#');
        java.awt.Shape shape15 = shapeList8.getShape(1);
        java.awt.Shape shape17 = shapeList8.getShape((int) (byte) 0);
        boolean boolean18 = shapeList0.equals((java.lang.Object) shapeList8);
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        int int20 = shapeList19.size();
        shapeList19.clear();
        java.lang.Object obj22 = shapeList19.clone();
        java.awt.Shape shape24 = shapeList19.getShape((int) (short) -1);
        shapeList19.clear();
        boolean boolean26 = shapeList0.equals((java.lang.Object) shapeList19);
        java.awt.Shape shape28 = null;
        shapeList0.setShape(2, shape28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(1);
        shapeList0.clear();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        shapeList7.clear();
        java.awt.Shape shape11 = shapeList7.getShape((int) (short) 1);
        boolean boolean13 = shapeList7.equals((java.lang.Object) (short) -1);
        shapeList7.clear();
        shapeList7.clear();
        java.awt.Shape shape17 = shapeList7.getShape((int) (short) 0);
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj19 = shapeList18.clone();
        shapeList18.clear();
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        int int22 = shapeList21.size();
        int int23 = shapeList21.size();
        java.lang.Object obj24 = shapeList21.clone();
        boolean boolean25 = shapeList18.equals(obj24);
        boolean boolean26 = shapeList7.equals((java.lang.Object) shapeList18);
        java.lang.Object obj27 = shapeList18.clone();
        boolean boolean28 = shapeList0.equals(obj27);
        java.awt.Shape shape30 = shapeList0.getShape((int) 'a');
        java.lang.Object obj31 = shapeList0.clone();
        java.awt.Shape shape33 = null;
        shapeList0.setShape(0, shape33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        int int4 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        shapeList6.clear();
        java.lang.Object obj8 = shapeList6.clone();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) (short) 1);
        boolean boolean13 = shapeList9.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = shapeList9.clone();
        java.awt.Shape shape16 = shapeList9.getShape((int) (short) -1);
        int int17 = shapeList9.size();
        boolean boolean18 = shapeList6.equals((java.lang.Object) int17);
        shapeList6.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList6);
        shapeList6.clear();
        shapeList6.clear();
        java.awt.Shape shape24 = null;
        shapeList6.setShape(100, shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        java.awt.Shape shape5 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape7 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape9 = shapeList0.getShape(11);
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) ' ', shape11);
        java.awt.Shape shape14 = shapeList0.getShape((int) (short) 1);
        int int15 = shapeList0.size();
        java.lang.Object obj16 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        shapeList17.clear();
        java.lang.Object obj19 = shapeList17.clone();
        boolean boolean21 = shapeList17.equals((java.lang.Object) (-1));
        int int22 = shapeList17.size();
        java.lang.Object obj23 = shapeList17.clone();
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape26 = null;
        shapeList24.setShape(8, shape26);
        int int28 = shapeList24.size();
        shapeList24.clear();
        org.jfree.chart.util.ShapeList shapeList30 = new org.jfree.chart.util.ShapeList();
        shapeList30.clear();
        java.lang.Object obj32 = shapeList30.clone();
        org.jfree.chart.util.ShapeList shapeList33 = new org.jfree.chart.util.ShapeList();
        boolean boolean35 = shapeList33.equals((java.lang.Object) (short) 1);
        boolean boolean37 = shapeList33.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj38 = shapeList33.clone();
        java.awt.Shape shape40 = shapeList33.getShape((int) (short) -1);
        int int41 = shapeList33.size();
        boolean boolean42 = shapeList30.equals((java.lang.Object) int41);
        shapeList30.clear();
        boolean boolean44 = shapeList24.equals((java.lang.Object) shapeList30);
        shapeList30.clear();
        shapeList30.clear();
        shapeList30.clear();
        shapeList30.clear();
        boolean boolean49 = shapeList17.equals((java.lang.Object) shapeList30);
        java.lang.Object obj50 = shapeList17.clone();
        boolean boolean51 = shapeList0.equals(obj50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList17", shapeList0.equals(shapeList17) ? shapeList0.hashCode() == shapeList17.hashCode() : true);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        int int4 = shapeList0.size();
        shapeList0.clear();
        int int6 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        shapeList7.clear();
        java.awt.Shape shape11 = shapeList7.getShape((int) (short) 1);
        java.lang.Object obj12 = shapeList7.clone();
        java.lang.Object obj13 = shapeList7.clone();
        boolean boolean14 = shapeList0.equals((java.lang.Object) shapeList7);
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape17 = null;
        shapeList15.setShape(8, shape17);
        int int19 = shapeList15.size();
        shapeList15.clear();
        int int21 = shapeList15.size();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj23 = shapeList22.clone();
        shapeList22.clear();
        java.awt.Shape shape26 = shapeList22.getShape((int) (short) 1);
        java.lang.Object obj27 = shapeList22.clone();
        java.lang.Object obj28 = shapeList22.clone();
        boolean boolean29 = shapeList15.equals((java.lang.Object) shapeList22);
        java.awt.Shape shape31 = shapeList15.getShape((int) (short) 10);
        boolean boolean32 = shapeList7.equals((java.lang.Object) shapeList15);
        java.lang.Object obj33 = shapeList15.clone();
        shapeList15.clear();
        int int35 = shapeList15.size();
        java.awt.Shape shape37 = null;
        shapeList15.setShape((int) (byte) 10, shape37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList15", shapeList0.equals(shapeList15) ? shapeList0.hashCode() == shapeList15.hashCode() : true);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        shapeList0.clear();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        shapeList7.clear();
        java.awt.Shape shape11 = shapeList7.getShape((int) (short) 1);
        boolean boolean13 = shapeList7.equals((java.lang.Object) (short) -1);
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj15 = shapeList14.clone();
        shapeList14.clear();
        java.awt.Shape shape18 = shapeList14.getShape((int) (short) 1);
        boolean boolean20 = shapeList14.equals((java.lang.Object) 0);
        shapeList14.clear();
        boolean boolean22 = shapeList7.equals((java.lang.Object) shapeList14);
        boolean boolean23 = shapeList0.equals((java.lang.Object) boolean22);
        int int24 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj26 = shapeList25.clone();
        shapeList25.clear();
        java.awt.Shape shape29 = shapeList25.getShape((int) (short) 1);
        java.lang.Object obj30 = shapeList25.clone();
        org.jfree.chart.util.ShapeList shapeList31 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj32 = shapeList31.clone();
        shapeList31.clear();
        java.awt.Shape shape35 = shapeList31.getShape((int) (short) 1);
        boolean boolean37 = shapeList31.equals((java.lang.Object) (short) -1);
        java.lang.Object obj38 = null;
        boolean boolean39 = shapeList31.equals(obj38);
        int int40 = shapeList31.size();
        boolean boolean41 = shapeList25.equals((java.lang.Object) shapeList31);
        java.awt.Shape shape43 = shapeList25.getShape(100);
        boolean boolean45 = shapeList25.equals((java.lang.Object) false);
        java.awt.Shape shape47 = shapeList25.getShape(9);
        java.awt.Shape shape49 = shapeList25.getShape(100);
        java.lang.Object obj50 = shapeList25.clone();
        boolean boolean51 = shapeList0.equals((java.lang.Object) shapeList25);
        java.awt.Shape shape53 = null;
        shapeList25.setShape((int) '#', shape53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList25", shapeList0.equals(shapeList25) ? shapeList0.hashCode() == shapeList25.hashCode() : true);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 'a');
        java.lang.Object obj7 = shapeList0.clone();
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = shapeList0.getShape(101);
        java.lang.Object obj11 = shapeList0.clone();
        int int12 = shapeList0.size();
        int int13 = shapeList0.size();
        java.awt.Shape shape15 = null;
        shapeList0.setShape((int) '4', shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 'a');
        java.lang.Object obj7 = shapeList0.clone();
        int int8 = shapeList0.size();
        java.lang.Object obj9 = shapeList0.clone();
        java.lang.Object obj10 = shapeList0.clone();
        java.awt.Shape shape12 = null;
        shapeList0.setShape((int) ' ', shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        java.lang.Object obj3 = shapeList0.clone();
        java.awt.Shape shape5 = shapeList0.getShape(33);
        java.awt.Shape shape7 = shapeList0.getShape(11);
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        int int9 = shapeList8.size();
        shapeList8.clear();
        java.awt.Shape shape12 = null;
        shapeList8.setShape((int) (short) 100, shape12);
        java.lang.Object obj14 = shapeList8.clone();
        boolean boolean15 = shapeList0.equals(obj14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.lang.Object obj6 = shapeList0.clone();
        java.lang.Object obj7 = shapeList0.clone();
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape(0);
        java.awt.Shape shape12 = shapeList0.getShape(0);
        java.awt.Shape shape14 = shapeList0.getShape((int) (byte) -1);
        int int15 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj17 = shapeList16.clone();
        shapeList16.clear();
        shapeList16.clear();
        java.lang.Object obj20 = shapeList16.clone();
        java.lang.Object obj21 = shapeList16.clone();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj23 = shapeList22.clone();
        shapeList22.clear();
        shapeList22.clear();
        java.lang.Object obj26 = shapeList22.clone();
        boolean boolean28 = shapeList22.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        shapeList29.clear();
        int int31 = shapeList29.size();
        int int32 = shapeList29.size();
        boolean boolean33 = shapeList22.equals((java.lang.Object) int32);
        java.lang.Object obj34 = shapeList22.clone();
        boolean boolean35 = shapeList16.equals((java.lang.Object) shapeList22);
        boolean boolean36 = shapeList0.equals((java.lang.Object) shapeList16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList16", shapeList0.equals(shapeList16) ? shapeList0.hashCode() == shapeList16.hashCode() : true);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.awt.Shape shape7 = shapeList0.getShape((int) '4');
        java.lang.Object obj8 = shapeList0.clone();
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape13 = null;
        shapeList0.setShape(1, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 100);
        java.lang.Object obj8 = shapeList0.clone();
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = shapeList0.getShape(1);
        java.awt.Shape shape13 = null;
        shapeList0.setShape(100, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 0, shape6);
        java.awt.Shape shape9 = null;
        shapeList0.setShape((int) (byte) 10, shape9);
        boolean boolean12 = shapeList0.equals((java.lang.Object) (-1));
        java.awt.Shape shape14 = null;
        shapeList0.setShape(8, shape14);
        int int16 = shapeList0.size();
        int int17 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj19 = shapeList18.clone();
        shapeList18.clear();
        java.awt.Shape shape22 = shapeList18.getShape((int) (short) 1);
        java.lang.Object obj23 = shapeList18.clone();
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj25 = shapeList24.clone();
        shapeList24.clear();
        java.awt.Shape shape28 = shapeList24.getShape((int) (short) 1);
        boolean boolean30 = shapeList24.equals((java.lang.Object) (short) -1);
        java.lang.Object obj31 = null;
        boolean boolean32 = shapeList24.equals(obj31);
        int int33 = shapeList24.size();
        boolean boolean34 = shapeList18.equals((java.lang.Object) shapeList24);
        java.awt.Shape shape36 = shapeList24.getShape((int) '4');
        java.awt.Shape shape38 = shapeList24.getShape((int) (byte) 0);
        boolean boolean39 = shapeList0.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList18", shapeList0.equals(shapeList18) ? shapeList0.hashCode() == shapeList18.hashCode() : true);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        shapeList0.clear();
        java.awt.Shape shape9 = shapeList0.getShape((int) (short) 100);
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        shapeList10.clear();
        int int12 = shapeList10.size();
        shapeList10.clear();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj15 = shapeList14.clone();
        shapeList14.clear();
        java.awt.Shape shape18 = shapeList14.getShape((int) (short) 1);
        boolean boolean20 = shapeList14.equals((java.lang.Object) 'a');
        java.lang.Object obj21 = shapeList14.clone();
        int int22 = shapeList14.size();
        boolean boolean23 = shapeList10.equals((java.lang.Object) shapeList14);
        java.lang.Object obj24 = shapeList14.clone();
        boolean boolean25 = shapeList0.equals((java.lang.Object) shapeList14);
        java.lang.Object obj26 = null;
        boolean boolean27 = shapeList0.equals(obj26);
        int int28 = shapeList0.size();
        java.awt.Shape shape30 = null;
        shapeList0.setShape((int) (short) 10, shape30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 'a');
        java.lang.Object obj7 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj9 = shapeList8.clone();
        java.lang.Object obj10 = shapeList8.clone();
        java.awt.Shape shape12 = shapeList8.getShape(1);
        shapeList8.clear();
        shapeList8.clear();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj16 = shapeList15.clone();
        shapeList15.clear();
        java.awt.Shape shape19 = shapeList15.getShape((int) (short) 1);
        boolean boolean21 = shapeList15.equals((java.lang.Object) 'a');
        java.lang.Object obj22 = shapeList15.clone();
        boolean boolean23 = shapeList8.equals(obj22);
        boolean boolean24 = shapeList0.equals((java.lang.Object) shapeList8);
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        boolean boolean27 = shapeList25.equals((java.lang.Object) (short) 1);
        boolean boolean29 = shapeList25.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape31 = null;
        shapeList25.setShape((int) (byte) 0, shape31);
        int int33 = shapeList25.size();
        boolean boolean35 = shapeList25.equals((java.lang.Object) (byte) 1);
        java.awt.Shape shape37 = shapeList25.getShape((int) (byte) 100);
        shapeList25.clear();
        java.lang.Class<?> wildcardClass39 = shapeList25.getClass();
        boolean boolean40 = shapeList0.equals((java.lang.Object) wildcardClass39);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList42 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj43 = shapeList42.clone();
        shapeList42.clear();
        java.awt.Shape shape46 = shapeList42.getShape((int) (short) 1);
        boolean boolean48 = shapeList42.equals((java.lang.Object) (short) -1);
        shapeList42.clear();
        java.awt.Shape shape51 = shapeList42.getShape((int) (short) 100);
        org.jfree.chart.util.ShapeList shapeList52 = new org.jfree.chart.util.ShapeList();
        shapeList52.clear();
        int int54 = shapeList52.size();
        shapeList52.clear();
        org.jfree.chart.util.ShapeList shapeList56 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj57 = shapeList56.clone();
        shapeList56.clear();
        java.awt.Shape shape60 = shapeList56.getShape((int) (short) 1);
        boolean boolean62 = shapeList56.equals((java.lang.Object) 'a');
        java.lang.Object obj63 = shapeList56.clone();
        int int64 = shapeList56.size();
        boolean boolean65 = shapeList52.equals((java.lang.Object) shapeList56);
        java.lang.Object obj66 = shapeList56.clone();
        boolean boolean67 = shapeList42.equals((java.lang.Object) shapeList56);
        java.lang.Object obj68 = shapeList56.clone();
        java.awt.Shape shape70 = shapeList56.getShape(0);
        boolean boolean71 = shapeList0.equals((java.lang.Object) shapeList56);
        java.awt.Shape shape73 = null;
        shapeList0.setShape((int) (byte) 1, shape73);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        java.lang.Object obj5 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape9 = null;
        shapeList0.setShape((int) (byte) 100, shape9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) -1);
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        java.lang.Object obj10 = shapeList0.clone();
        java.awt.Shape shape12 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj13 = shapeList0.clone();
        java.lang.Object obj14 = shapeList0.clone();
        java.awt.Shape shape16 = null;
        shapeList0.setShape((int) (short) 100, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape(1);
        java.awt.Shape shape9 = shapeList0.getShape((int) (byte) 0);
        java.awt.Shape shape11 = shapeList0.getShape((int) (short) 100);
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj13 = shapeList12.clone();
        shapeList12.clear();
        java.awt.Shape shape16 = shapeList12.getShape((int) (short) 1);
        java.lang.Object obj17 = shapeList12.clone();
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj19 = shapeList18.clone();
        shapeList18.clear();
        java.awt.Shape shape22 = shapeList18.getShape((int) (short) 1);
        boolean boolean24 = shapeList18.equals((java.lang.Object) (short) -1);
        java.lang.Object obj25 = null;
        boolean boolean26 = shapeList18.equals(obj25);
        int int27 = shapeList18.size();
        boolean boolean28 = shapeList12.equals((java.lang.Object) shapeList18);
        shapeList12.clear();
        shapeList12.clear();
        java.lang.Object obj31 = shapeList12.clone();
        boolean boolean32 = shapeList0.equals(obj31);
        java.lang.Object obj33 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape36 = null;
        shapeList0.setShape(2, shape36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape9 = shapeList0.getShape((int) '#');
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) (short) 0, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape(1);
        java.awt.Shape shape9 = shapeList0.getShape(100);
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj11 = shapeList10.clone();
        shapeList10.clear();
        java.awt.Shape shape14 = shapeList10.getShape((int) (short) 1);
        boolean boolean16 = shapeList10.equals((java.lang.Object) (short) -1);
        shapeList10.clear();
        shapeList10.clear();
        java.lang.Object obj19 = shapeList10.clone();
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj21 = shapeList20.clone();
        shapeList20.clear();
        java.awt.Shape shape24 = shapeList20.getShape((int) (short) 1);
        boolean boolean26 = shapeList20.equals((java.lang.Object) 0L);
        boolean boolean27 = shapeList10.equals((java.lang.Object) 0L);
        boolean boolean28 = shapeList0.equals((java.lang.Object) shapeList10);
        java.awt.Shape shape30 = null;
        shapeList0.setShape((int) (byte) 0, shape30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj5 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj7 = shapeList6.clone();
        shapeList6.clear();
        java.awt.Shape shape10 = shapeList6.getShape((int) (short) 1);
        boolean boolean12 = shapeList6.equals((java.lang.Object) (short) -1);
        java.lang.Object obj13 = null;
        boolean boolean14 = shapeList6.equals(obj13);
        int int15 = shapeList6.size();
        boolean boolean16 = shapeList0.equals((java.lang.Object) shapeList6);
        java.lang.Object obj17 = shapeList0.clone();
        java.awt.Shape shape19 = shapeList0.getShape(10);
        int int20 = shapeList0.size();
        java.awt.Shape shape22 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape24 = null;
        shapeList0.setShape((int) (byte) 0, shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.lang.Object obj6 = shapeList0.clone();
        java.lang.Object obj7 = shapeList0.clone();
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape(0);
        java.awt.Shape shape12 = shapeList0.getShape(0);
        java.awt.Shape shape14 = null;
        shapeList0.setShape((int) (short) 0, shape14);
        java.awt.Shape shape17 = shapeList0.getShape(100);
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj19 = shapeList18.clone();
        shapeList18.clear();
        java.awt.Shape shape22 = shapeList18.getShape((int) (short) 1);
        shapeList18.clear();
        shapeList18.clear();
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj26 = shapeList25.clone();
        shapeList25.clear();
        java.awt.Shape shape29 = shapeList25.getShape((int) (short) 1);
        boolean boolean31 = shapeList25.equals((java.lang.Object) (short) -1);
        org.jfree.chart.util.ShapeList shapeList32 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj33 = shapeList32.clone();
        shapeList32.clear();
        java.awt.Shape shape36 = shapeList32.getShape((int) (short) 1);
        boolean boolean38 = shapeList32.equals((java.lang.Object) 0);
        shapeList32.clear();
        boolean boolean40 = shapeList25.equals((java.lang.Object) shapeList32);
        boolean boolean41 = shapeList18.equals((java.lang.Object) boolean40);
        org.jfree.chart.util.ShapeList shapeList42 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj43 = shapeList42.clone();
        shapeList42.clear();
        java.awt.Shape shape46 = shapeList42.getShape((int) (short) 1);
        boolean boolean48 = shapeList42.equals((java.lang.Object) 0);
        int int49 = shapeList42.size();
        int int50 = shapeList42.size();
        org.jfree.chart.util.ShapeList shapeList51 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape53 = null;
        shapeList51.setShape(8, shape53);
        int int55 = shapeList51.size();
        shapeList51.clear();
        org.jfree.chart.util.ShapeList shapeList57 = new org.jfree.chart.util.ShapeList();
        shapeList57.clear();
        java.lang.Object obj59 = shapeList57.clone();
        org.jfree.chart.util.ShapeList shapeList60 = new org.jfree.chart.util.ShapeList();
        boolean boolean62 = shapeList60.equals((java.lang.Object) (short) 1);
        boolean boolean64 = shapeList60.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj65 = shapeList60.clone();
        java.awt.Shape shape67 = shapeList60.getShape((int) (short) -1);
        int int68 = shapeList60.size();
        boolean boolean69 = shapeList57.equals((java.lang.Object) int68);
        shapeList57.clear();
        boolean boolean71 = shapeList51.equals((java.lang.Object) shapeList57);
        java.lang.Object obj72 = shapeList57.clone();
        boolean boolean73 = shapeList42.equals((java.lang.Object) shapeList57);
        boolean boolean74 = shapeList18.equals((java.lang.Object) shapeList57);
        boolean boolean75 = shapeList0.equals((java.lang.Object) shapeList18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList18", shapeList0.equals(shapeList18) ? shapeList0.hashCode() == shapeList18.hashCode() : true);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        int int2 = shapeList0.size();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) '#', shape4);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        shapeList7.clear();
        java.awt.Shape shape11 = shapeList7.getShape((int) (short) 1);
        boolean boolean13 = shapeList7.equals((java.lang.Object) 0);
        int int14 = shapeList7.size();
        int int15 = shapeList7.size();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        shapeList16.clear();
        java.awt.Shape shape19 = shapeList16.getShape(10);
        boolean boolean20 = shapeList7.equals((java.lang.Object) shapeList16);
        boolean boolean21 = shapeList0.equals((java.lang.Object) boolean20);
        java.awt.Shape shape23 = shapeList0.getShape((int) 'a');
        int int24 = shapeList0.size();
        int int25 = shapeList0.size();
        java.awt.Shape shape27 = null;
        shapeList0.setShape(11, shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1));
        int int5 = shapeList0.size();
        java.lang.Object obj6 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape9 = null;
        shapeList7.setShape(8, shape9);
        int int11 = shapeList7.size();
        shapeList7.clear();
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        shapeList13.clear();
        java.lang.Object obj15 = shapeList13.clone();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        boolean boolean18 = shapeList16.equals((java.lang.Object) (short) 1);
        boolean boolean20 = shapeList16.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj21 = shapeList16.clone();
        java.awt.Shape shape23 = shapeList16.getShape((int) (short) -1);
        int int24 = shapeList16.size();
        boolean boolean25 = shapeList13.equals((java.lang.Object) int24);
        shapeList13.clear();
        boolean boolean27 = shapeList7.equals((java.lang.Object) shapeList13);
        shapeList13.clear();
        shapeList13.clear();
        shapeList13.clear();
        shapeList13.clear();
        boolean boolean32 = shapeList0.equals((java.lang.Object) shapeList13);
        java.awt.Shape shape34 = null;
        shapeList13.setShape(10, shape34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape((int) (short) 0);
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj12 = shapeList11.clone();
        shapeList11.clear();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        int int15 = shapeList14.size();
        int int16 = shapeList14.size();
        java.lang.Object obj17 = shapeList14.clone();
        boolean boolean18 = shapeList11.equals(obj17);
        boolean boolean19 = shapeList0.equals((java.lang.Object) shapeList11);
        java.awt.Shape shape21 = null;
        shapeList0.setShape(0, shape21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape(0, shape6);
        java.lang.Object obj8 = shapeList0.clone();
        java.lang.Object obj9 = shapeList0.clone();
        java.lang.Object obj10 = null;
        boolean boolean11 = shapeList0.equals(obj10);
        java.awt.Shape shape13 = shapeList0.getShape(0);
        java.awt.Shape shape15 = shapeList0.getShape((int) '#');
        java.awt.Shape shape17 = null;
        shapeList0.setShape((int) (byte) 10, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) ' ');
        java.lang.Object obj5 = shapeList0.clone();
        java.lang.Object obj6 = shapeList0.clone();
        int int7 = shapeList0.size();
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) (byte) 10, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        java.lang.Object obj5 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj9 = shapeList8.clone();
        shapeList8.clear();
        shapeList8.clear();
        java.awt.Shape shape13 = shapeList8.getShape((int) '#');
        java.awt.Shape shape15 = shapeList8.getShape(1);
        java.awt.Shape shape17 = shapeList8.getShape((int) (byte) 0);
        boolean boolean18 = shapeList0.equals((java.lang.Object) shapeList8);
        java.awt.Shape shape20 = shapeList0.getShape((int) (short) 100);
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj22 = shapeList21.clone();
        shapeList21.clear();
        java.awt.Shape shape25 = shapeList21.getShape((int) (short) 1);
        java.lang.Object obj26 = shapeList21.clone();
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape29 = null;
        shapeList27.setShape(8, shape29);
        int int31 = shapeList27.size();
        shapeList27.clear();
        int int33 = shapeList27.size();
        org.jfree.chart.util.ShapeList shapeList34 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj35 = shapeList34.clone();
        shapeList34.clear();
        java.awt.Shape shape38 = shapeList34.getShape((int) (short) 1);
        java.lang.Object obj39 = shapeList34.clone();
        java.lang.Object obj40 = shapeList34.clone();
        boolean boolean41 = shapeList27.equals((java.lang.Object) shapeList34);
        org.jfree.chart.util.ShapeList shapeList42 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape44 = null;
        shapeList42.setShape(8, shape44);
        int int46 = shapeList42.size();
        shapeList42.clear();
        int int48 = shapeList42.size();
        org.jfree.chart.util.ShapeList shapeList49 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj50 = shapeList49.clone();
        shapeList49.clear();
        java.awt.Shape shape53 = shapeList49.getShape((int) (short) 1);
        java.lang.Object obj54 = shapeList49.clone();
        java.lang.Object obj55 = shapeList49.clone();
        boolean boolean56 = shapeList42.equals((java.lang.Object) shapeList49);
        java.awt.Shape shape58 = shapeList42.getShape((int) (short) 10);
        boolean boolean59 = shapeList34.equals((java.lang.Object) shapeList42);
        java.lang.Class<?> wildcardClass60 = shapeList34.getClass();
        boolean boolean61 = shapeList21.equals((java.lang.Object) wildcardClass60);
        boolean boolean62 = shapeList0.equals((java.lang.Object) wildcardClass60);
        java.awt.Shape shape64 = null;
        shapeList0.setShape((int) (byte) 10, shape64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        int int4 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        shapeList6.clear();
        java.lang.Object obj8 = shapeList6.clone();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) (short) 1);
        boolean boolean13 = shapeList9.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = shapeList9.clone();
        java.awt.Shape shape16 = shapeList9.getShape((int) (short) -1);
        int int17 = shapeList9.size();
        boolean boolean18 = shapeList6.equals((java.lang.Object) int17);
        shapeList6.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList6);
        shapeList6.clear();
        java.lang.Object obj22 = shapeList6.clone();
        java.awt.Shape shape24 = shapeList6.getShape((int) 'a');
        java.awt.Shape shape26 = shapeList6.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj28 = shapeList27.clone();
        shapeList27.clear();
        java.awt.Shape shape31 = shapeList27.getShape((int) (short) 1);
        boolean boolean33 = shapeList27.equals((java.lang.Object) (short) -1);
        shapeList27.clear();
        shapeList27.clear();
        java.lang.Object obj36 = shapeList27.clone();
        java.awt.Shape shape38 = shapeList27.getShape(1);
        boolean boolean39 = shapeList6.equals((java.lang.Object) shapeList27);
        org.jfree.chart.util.ShapeList shapeList40 = new org.jfree.chart.util.ShapeList();
        shapeList40.clear();
        java.lang.Object obj42 = shapeList40.clone();
        org.jfree.chart.util.ShapeList shapeList43 = new org.jfree.chart.util.ShapeList();
        boolean boolean45 = shapeList43.equals((java.lang.Object) (short) 1);
        boolean boolean47 = shapeList43.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj48 = shapeList43.clone();
        java.awt.Shape shape50 = shapeList43.getShape((int) (short) -1);
        int int51 = shapeList43.size();
        boolean boolean52 = shapeList40.equals((java.lang.Object) int51);
        boolean boolean53 = shapeList27.equals((java.lang.Object) shapeList40);
        java.awt.Shape shape55 = shapeList27.getShape((int) 'a');
        java.awt.Shape shape57 = null;
        shapeList27.setShape((int) (byte) 1, shape57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList27", shapeList0.equals(shapeList27) ? shapeList0.hashCode() == shapeList27.hashCode() : true);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        boolean boolean5 = shapeList3.equals((java.lang.Object) (short) 1);
        boolean boolean7 = shapeList3.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = shapeList3.clone();
        java.awt.Shape shape10 = shapeList3.getShape((int) (short) -1);
        int int11 = shapeList3.size();
        boolean boolean12 = shapeList0.equals((java.lang.Object) int11);
        java.awt.Shape shape14 = shapeList0.getShape(9);
        int int15 = shapeList0.size();
        java.lang.Object obj16 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        boolean boolean18 = shapeList0.equals((java.lang.Object) shapeList17);
        java.awt.Shape shape20 = shapeList17.getShape(0);
        java.lang.Object obj21 = null;
        boolean boolean22 = shapeList17.equals(obj21);
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        boolean boolean25 = shapeList23.equals((java.lang.Object) (short) 1);
        boolean boolean27 = shapeList23.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj28 = shapeList23.clone();
        java.awt.Shape shape30 = shapeList23.getShape((int) (short) -1);
        int int31 = shapeList23.size();
        int int32 = shapeList23.size();
        java.lang.Object obj33 = shapeList23.clone();
        boolean boolean34 = shapeList17.equals((java.lang.Object) shapeList23);
        java.awt.Shape shape36 = null;
        shapeList23.setShape((int) (byte) 10, shape36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList23", shapeList0.equals(shapeList23) ? shapeList0.hashCode() == shapeList23.hashCode() : true);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = null;
        boolean boolean8 = shapeList0.equals(obj7);
        int int9 = shapeList0.size();
        java.lang.Object obj10 = null;
        boolean boolean11 = shapeList0.equals(obj10);
        java.awt.Shape shape13 = shapeList0.getShape((int) 'a');
        java.awt.Shape shape15 = shapeList0.getShape((int) '4');
        shapeList0.clear();
        java.awt.Shape shape18 = null;
        shapeList0.setShape(11, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 0);
        int int7 = shapeList0.size();
        int int8 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        shapeList9.clear();
        java.awt.Shape shape12 = shapeList9.getShape(10);
        boolean boolean13 = shapeList0.equals((java.lang.Object) shapeList9);
        java.awt.Shape shape15 = shapeList9.getShape((int) '4');
        java.lang.Object obj16 = shapeList9.clone();
        java.awt.Shape shape18 = null;
        shapeList9.setShape((int) (byte) 1, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj6 = shapeList5.clone();
        shapeList5.clear();
        java.awt.Shape shape9 = shapeList5.getShape((int) (short) 1);
        boolean boolean11 = shapeList5.equals((java.lang.Object) (short) -1);
        shapeList5.clear();
        shapeList5.clear();
        java.awt.Shape shape15 = shapeList5.getShape((int) (short) 0);
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj17 = shapeList16.clone();
        shapeList16.clear();
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        int int20 = shapeList19.size();
        int int21 = shapeList19.size();
        java.lang.Object obj22 = shapeList19.clone();
        boolean boolean23 = shapeList16.equals(obj22);
        boolean boolean24 = shapeList5.equals((java.lang.Object) shapeList16);
        boolean boolean25 = shapeList0.equals((java.lang.Object) shapeList16);
        java.awt.Shape shape27 = shapeList16.getShape((int) (short) 0);
        java.awt.Shape shape29 = null;
        shapeList16.setShape((int) (short) 100, shape29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList16", shapeList0.equals(shapeList16) ? shapeList0.hashCode() == shapeList16.hashCode() : true);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape6 = null;
        shapeList0.setShape(36, shape6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj3", shapeList0.equals(obj3) ? shapeList0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        int int4 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        shapeList6.clear();
        java.lang.Object obj8 = shapeList6.clone();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) (short) 1);
        boolean boolean13 = shapeList9.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = shapeList9.clone();
        java.awt.Shape shape16 = shapeList9.getShape((int) (short) -1);
        int int17 = shapeList9.size();
        boolean boolean18 = shapeList6.equals((java.lang.Object) int17);
        shapeList6.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList6);
        shapeList6.clear();
        int int22 = shapeList6.size();
        java.awt.Shape shape24 = null;
        shapeList6.setShape(100, shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 0, shape6);
        java.awt.Shape shape9 = null;
        shapeList0.setShape((int) (byte) 10, shape9);
        boolean boolean12 = shapeList0.equals((java.lang.Object) (-1));
        int int13 = shapeList0.size();
        java.lang.Object obj14 = shapeList0.clone();
        int int15 = shapeList0.size();
        java.awt.Shape shape17 = shapeList0.getShape((int) (short) 0);
        java.lang.Object obj18 = shapeList0.clone();
        java.awt.Shape shape20 = shapeList0.getShape(33);
        java.awt.Shape shape22 = shapeList0.getShape((int) (byte) 1);
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        shapeList23.clear();
        java.lang.Object obj25 = shapeList23.clone();
        java.lang.Object obj26 = shapeList23.clone();
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj28 = shapeList27.clone();
        shapeList27.clear();
        java.lang.Object obj30 = shapeList27.clone();
        org.jfree.chart.util.ShapeList shapeList31 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj32 = shapeList31.clone();
        shapeList31.clear();
        java.awt.Shape shape35 = shapeList31.getShape((int) (short) 1);
        boolean boolean37 = shapeList31.equals((java.lang.Object) (short) -1);
        boolean boolean38 = shapeList27.equals((java.lang.Object) shapeList31);
        org.jfree.chart.util.ShapeList shapeList39 = new org.jfree.chart.util.ShapeList();
        boolean boolean41 = shapeList39.equals((java.lang.Object) (short) 1);
        boolean boolean43 = shapeList39.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj44 = shapeList39.clone();
        java.awt.Shape shape46 = shapeList39.getShape((int) (short) -1);
        int int47 = shapeList39.size();
        boolean boolean48 = shapeList27.equals((java.lang.Object) int47);
        boolean boolean49 = shapeList23.equals((java.lang.Object) boolean48);
        boolean boolean50 = shapeList0.equals((java.lang.Object) boolean48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList23", shapeList0.equals(shapeList23) ? shapeList0.hashCode() == shapeList23.hashCode() : true);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = null;
        boolean boolean8 = shapeList0.equals(obj7);
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) (short) 1);
        boolean boolean13 = shapeList9.equals((java.lang.Object) 1.0d);
        java.lang.Object obj14 = shapeList9.clone();
        boolean boolean15 = shapeList0.equals(obj14);
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj17 = shapeList16.clone();
        shapeList16.clear();
        java.awt.Shape shape20 = shapeList16.getShape((int) (short) 1);
        java.lang.Object obj21 = shapeList16.clone();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj23 = shapeList22.clone();
        shapeList22.clear();
        java.awt.Shape shape26 = shapeList22.getShape((int) (short) 1);
        boolean boolean28 = shapeList22.equals((java.lang.Object) (short) -1);
        java.lang.Object obj29 = null;
        boolean boolean30 = shapeList22.equals(obj29);
        int int31 = shapeList22.size();
        boolean boolean32 = shapeList16.equals((java.lang.Object) shapeList22);
        boolean boolean33 = shapeList0.equals((java.lang.Object) shapeList22);
        java.awt.Shape shape35 = shapeList22.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList36 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj37 = shapeList36.clone();
        shapeList36.clear();
        java.lang.Object obj39 = shapeList36.clone();
        int int40 = shapeList36.size();
        org.jfree.chart.util.ShapeList shapeList41 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj42 = shapeList41.clone();
        shapeList41.clear();
        java.awt.Shape shape45 = shapeList41.getShape((int) (short) 1);
        java.lang.Object obj46 = shapeList41.clone();
        shapeList41.clear();
        boolean boolean48 = shapeList36.equals((java.lang.Object) shapeList41);
        boolean boolean49 = shapeList22.equals((java.lang.Object) shapeList36);
        shapeList36.clear();
        java.awt.Shape shape52 = null;
        shapeList36.setShape(36, shape52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList36", shapeList0.equals(shapeList36) ? shapeList0.hashCode() == shapeList36.hashCode() : true);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj5 = shapeList0.clone();
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj10 = shapeList0.clone();
        java.awt.Shape shape12 = null;
        shapeList0.setShape((int) (short) 0, shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 0);
        java.lang.Object obj7 = shapeList0.clone();
        boolean boolean9 = shapeList0.equals((java.lang.Object) false);
        java.lang.Object obj10 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape13 = null;
        shapeList11.setShape(8, shape13);
        int int15 = shapeList11.size();
        shapeList11.clear();
        int int17 = shapeList11.size();
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj19 = shapeList18.clone();
        shapeList18.clear();
        java.awt.Shape shape22 = shapeList18.getShape((int) (short) 1);
        java.lang.Object obj23 = shapeList18.clone();
        java.lang.Object obj24 = shapeList18.clone();
        boolean boolean25 = shapeList11.equals((java.lang.Object) shapeList18);
        java.awt.Shape shape27 = shapeList11.getShape((int) (short) 10);
        shapeList11.clear();
        boolean boolean29 = shapeList0.equals((java.lang.Object) shapeList11);
        int int30 = shapeList11.size();
        java.awt.Shape shape32 = shapeList11.getShape((int) (short) 100);
        java.awt.Shape shape34 = null;
        shapeList11.setShape((int) (byte) 1, shape34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj5 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj7 = shapeList6.clone();
        shapeList6.clear();
        java.awt.Shape shape10 = shapeList6.getShape((int) (short) 1);
        boolean boolean12 = shapeList6.equals((java.lang.Object) (short) -1);
        java.lang.Object obj13 = null;
        boolean boolean14 = shapeList6.equals(obj13);
        int int15 = shapeList6.size();
        boolean boolean16 = shapeList0.equals((java.lang.Object) shapeList6);
        java.lang.Object obj17 = shapeList0.clone();
        java.awt.Shape shape19 = shapeList0.getShape(33);
        java.awt.Shape shape21 = null;
        shapeList0.setShape(9, shape21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        java.lang.Object obj5 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj9 = shapeList8.clone();
        shapeList8.clear();
        shapeList8.clear();
        java.awt.Shape shape13 = shapeList8.getShape((int) '#');
        java.awt.Shape shape15 = shapeList8.getShape(1);
        java.awt.Shape shape17 = shapeList8.getShape((int) (byte) 0);
        boolean boolean18 = shapeList0.equals((java.lang.Object) shapeList8);
        java.awt.Shape shape20 = shapeList8.getShape((int) ' ');
        java.lang.Object obj21 = shapeList8.clone();
        java.awt.Shape shape23 = null;
        shapeList8.setShape(36, shape23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj5 = shapeList4.clone();
        shapeList4.clear();
        java.awt.Shape shape8 = shapeList4.getShape((int) (short) 1);
        boolean boolean10 = shapeList4.equals((java.lang.Object) (short) -1);
        boolean boolean11 = shapeList0.equals((java.lang.Object) shapeList4);
        java.lang.Object obj12 = shapeList0.clone();
        java.awt.Shape shape14 = shapeList0.getShape(8);
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj16 = shapeList15.clone();
        shapeList15.clear();
        java.awt.Shape shape19 = shapeList15.getShape((int) (short) 1);
        boolean boolean21 = shapeList15.equals((java.lang.Object) (short) -1);
        java.lang.Object obj22 = null;
        boolean boolean23 = shapeList15.equals(obj22);
        int int24 = shapeList15.size();
        java.lang.Object obj25 = null;
        boolean boolean26 = shapeList15.equals(obj25);
        java.awt.Shape shape28 = shapeList15.getShape((int) 'a');
        java.awt.Shape shape30 = shapeList15.getShape((int) '4');
        java.awt.Shape shape32 = shapeList15.getShape((int) '#');
        java.awt.Shape shape34 = shapeList15.getShape((int) (byte) -1);
        java.lang.Object obj35 = shapeList15.clone();
        boolean boolean36 = shapeList0.equals((java.lang.Object) shapeList15);
        java.awt.Shape shape38 = null;
        shapeList0.setShape(36, shape38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        int int2 = shapeList0.size();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) '#', shape4);
        java.lang.Object obj6 = shapeList0.clone();
        java.lang.Object obj7 = shapeList0.clone();
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) ' ');
        boolean boolean6 = shapeList0.equals((java.lang.Object) 10);
        int int7 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj9 = shapeList8.clone();
        shapeList8.clear();
        java.awt.Shape shape12 = shapeList8.getShape((int) (short) 1);
        boolean boolean14 = shapeList8.equals((java.lang.Object) (short) -1);
        shapeList8.clear();
        shapeList8.clear();
        java.awt.Shape shape18 = shapeList8.getShape((int) (short) 0);
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        boolean boolean21 = shapeList19.equals((java.lang.Object) (short) 1);
        boolean boolean23 = shapeList19.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj24 = shapeList19.clone();
        java.awt.Shape shape26 = shapeList19.getShape((int) (short) -1);
        boolean boolean28 = shapeList19.equals((java.lang.Object) (-1.0d));
        boolean boolean29 = shapeList8.equals((java.lang.Object) shapeList19);
        java.awt.Shape shape31 = shapeList8.getShape((int) (byte) -1);
        java.lang.Object obj32 = shapeList8.clone();
        boolean boolean33 = shapeList0.equals(obj32);
        java.awt.Shape shape35 = null;
        shapeList0.setShape(0, shape35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        java.lang.Object obj5 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape8 = shapeList0.getShape((int) '#');
        int int9 = shapeList0.size();
        java.awt.Shape shape11 = null;
        shapeList0.setShape(3, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        java.awt.Shape shape5 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape7 = shapeList0.getShape((int) (byte) 100);
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        shapeList8.clear();
        int int10 = shapeList8.size();
        int int11 = shapeList8.size();
        int int12 = shapeList8.size();
        java.awt.Shape shape14 = shapeList8.getShape((int) (short) 1);
        boolean boolean15 = shapeList0.equals((java.lang.Object) shapeList8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        java.awt.Shape shape5 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape7 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape9 = shapeList0.getShape(11);
        java.awt.Shape shape11 = null;
        shapeList0.setShape(1, shape11);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj14 = shapeList13.clone();
        shapeList13.clear();
        java.awt.Shape shape17 = shapeList13.getShape((int) (short) 1);
        boolean boolean19 = shapeList13.equals((java.lang.Object) (short) -1);
        java.lang.Object obj20 = null;
        boolean boolean21 = shapeList13.equals(obj20);
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        boolean boolean24 = shapeList22.equals((java.lang.Object) (short) 1);
        boolean boolean26 = shapeList22.equals((java.lang.Object) 1.0d);
        java.lang.Object obj27 = shapeList22.clone();
        boolean boolean28 = shapeList13.equals(obj27);
        java.awt.Shape shape30 = shapeList13.getShape((int) (short) 0);
        org.jfree.chart.util.ShapeList shapeList31 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj32 = shapeList31.clone();
        shapeList31.clear();
        java.awt.Shape shape35 = shapeList31.getShape((int) (short) 1);
        java.lang.Object obj36 = shapeList31.clone();
        org.jfree.chart.util.ShapeList shapeList37 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj38 = shapeList37.clone();
        shapeList37.clear();
        java.awt.Shape shape41 = shapeList37.getShape((int) (short) 1);
        boolean boolean43 = shapeList37.equals((java.lang.Object) (short) -1);
        java.lang.Object obj44 = null;
        boolean boolean45 = shapeList37.equals(obj44);
        int int46 = shapeList37.size();
        boolean boolean47 = shapeList31.equals((java.lang.Object) shapeList37);
        java.lang.Object obj48 = shapeList31.clone();
        java.lang.Class<?> wildcardClass49 = shapeList31.getClass();
        boolean boolean50 = shapeList13.equals((java.lang.Object) wildcardClass49);
        java.lang.Object obj51 = shapeList13.clone();
        boolean boolean52 = shapeList0.equals((java.lang.Object) shapeList13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        boolean boolean5 = shapeList3.equals((java.lang.Object) (short) 1);
        boolean boolean7 = shapeList3.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = shapeList3.clone();
        java.awt.Shape shape10 = shapeList3.getShape((int) (short) -1);
        int int11 = shapeList3.size();
        boolean boolean12 = shapeList0.equals((java.lang.Object) int11);
        int int13 = shapeList0.size();
        java.awt.Shape shape15 = shapeList0.getShape(0);
        shapeList0.clear();
        int int17 = shapeList0.size();
        java.awt.Shape shape19 = null;
        shapeList0.setShape((int) (short) 0, shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        shapeList0.clear();
        java.awt.Shape shape9 = shapeList0.getShape((int) (short) 100);
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        shapeList10.clear();
        int int12 = shapeList10.size();
        shapeList10.clear();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj15 = shapeList14.clone();
        shapeList14.clear();
        java.awt.Shape shape18 = shapeList14.getShape((int) (short) 1);
        boolean boolean20 = shapeList14.equals((java.lang.Object) 'a');
        java.lang.Object obj21 = shapeList14.clone();
        int int22 = shapeList14.size();
        boolean boolean23 = shapeList10.equals((java.lang.Object) shapeList14);
        java.lang.Object obj24 = shapeList14.clone();
        boolean boolean25 = shapeList0.equals((java.lang.Object) shapeList14);
        java.lang.Object obj26 = shapeList14.clone();
        java.lang.Object obj27 = shapeList14.clone();
        org.jfree.chart.util.ShapeList shapeList28 = new org.jfree.chart.util.ShapeList();
        boolean boolean30 = shapeList28.equals((java.lang.Object) (short) 1);
        boolean boolean32 = shapeList28.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape34 = null;
        shapeList28.setShape(0, shape34);
        java.lang.Object obj36 = shapeList28.clone();
        boolean boolean37 = shapeList14.equals((java.lang.Object) shapeList28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList28", shapeList0.equals(shapeList28) ? shapeList0.hashCode() == shapeList28.hashCode() : true);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj4 = shapeList3.clone();
        shapeList3.clear();
        java.awt.Shape shape7 = shapeList3.getShape((int) (short) 1);
        boolean boolean9 = shapeList3.equals((java.lang.Object) (short) -1);
        shapeList3.clear();
        shapeList3.clear();
        java.awt.Shape shape13 = shapeList3.getShape((int) (short) 0);
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        boolean boolean16 = shapeList14.equals((java.lang.Object) (short) 1);
        boolean boolean18 = shapeList14.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj19 = shapeList14.clone();
        java.awt.Shape shape21 = shapeList14.getShape((int) (short) -1);
        boolean boolean23 = shapeList14.equals((java.lang.Object) (-1.0d));
        boolean boolean24 = shapeList3.equals((java.lang.Object) shapeList14);
        java.awt.Shape shape26 = shapeList3.getShape((int) (byte) -1);
        boolean boolean27 = shapeList0.equals((java.lang.Object) shape26);
        shapeList0.clear();
        java.awt.Shape shape30 = shapeList0.getShape((int) 'a');
        org.jfree.chart.util.ShapeList shapeList31 = new org.jfree.chart.util.ShapeList();
        shapeList31.clear();
        shapeList31.clear();
        int int34 = shapeList31.size();
        java.awt.Shape shape36 = null;
        shapeList31.setShape((int) (byte) 100, shape36);
        int int38 = shapeList31.size();
        boolean boolean39 = shapeList0.equals((java.lang.Object) int38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList31", shapeList0.equals(shapeList31) ? shapeList0.hashCode() == shapeList31.hashCode() : true);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 0, shape6);
        java.awt.Shape shape9 = null;
        shapeList0.setShape((int) (byte) 10, shape9);
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj12 = shapeList11.clone();
        shapeList11.clear();
        java.lang.Object obj14 = shapeList11.clone();
        int int15 = shapeList11.size();
        java.lang.Object obj16 = shapeList11.clone();
        shapeList11.clear();
        shapeList11.clear();
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj20 = shapeList19.clone();
        shapeList19.clear();
        shapeList19.clear();
        java.awt.Shape shape24 = shapeList19.getShape((int) '#');
        java.awt.Shape shape26 = shapeList19.getShape(1);
        java.awt.Shape shape28 = shapeList19.getShape((int) (byte) 0);
        boolean boolean29 = shapeList11.equals((java.lang.Object) shapeList19);
        shapeList19.clear();
        java.lang.Object obj31 = shapeList19.clone();
        java.lang.Object obj32 = shapeList19.clone();
        boolean boolean33 = shapeList0.equals(obj32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(1);
        shapeList0.clear();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        shapeList7.clear();
        java.awt.Shape shape11 = shapeList7.getShape((int) (short) 1);
        boolean boolean13 = shapeList7.equals((java.lang.Object) 'a');
        java.lang.Object obj14 = shapeList7.clone();
        boolean boolean15 = shapeList0.equals(obj14);
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj17 = shapeList16.clone();
        shapeList16.clear();
        java.awt.Shape shape20 = shapeList16.getShape((int) (short) 1);
        java.lang.Object obj21 = shapeList16.clone();
        boolean boolean22 = shapeList0.equals((java.lang.Object) shapeList16);
        int int23 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj25 = shapeList24.clone();
        shapeList24.clear();
        java.awt.Shape shape28 = shapeList24.getShape((int) (short) 1);
        boolean boolean30 = shapeList24.equals((java.lang.Object) (short) -1);
        java.lang.Object obj31 = shapeList24.clone();
        java.lang.Object obj32 = shapeList24.clone();
        java.lang.Object obj33 = shapeList24.clone();
        java.lang.Class<?> wildcardClass34 = obj33.getClass();
        boolean boolean35 = shapeList0.equals(obj33);
        org.jfree.chart.util.ShapeList shapeList36 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj37 = shapeList36.clone();
        shapeList36.clear();
        java.awt.Shape shape40 = shapeList36.getShape((int) (short) 1);
        boolean boolean42 = shapeList36.equals((java.lang.Object) 0);
        java.lang.Object obj43 = shapeList36.clone();
        boolean boolean45 = shapeList36.equals((java.lang.Object) false);
        java.lang.Object obj46 = shapeList36.clone();
        org.jfree.chart.util.ShapeList shapeList47 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape49 = null;
        shapeList47.setShape(8, shape49);
        int int51 = shapeList47.size();
        shapeList47.clear();
        int int53 = shapeList47.size();
        org.jfree.chart.util.ShapeList shapeList54 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj55 = shapeList54.clone();
        shapeList54.clear();
        java.awt.Shape shape58 = shapeList54.getShape((int) (short) 1);
        java.lang.Object obj59 = shapeList54.clone();
        java.lang.Object obj60 = shapeList54.clone();
        boolean boolean61 = shapeList47.equals((java.lang.Object) shapeList54);
        java.awt.Shape shape63 = shapeList47.getShape((int) (short) 10);
        shapeList47.clear();
        boolean boolean65 = shapeList36.equals((java.lang.Object) shapeList47);
        java.lang.Object obj66 = shapeList36.clone();
        boolean boolean67 = shapeList0.equals((java.lang.Object) shapeList36);
        java.lang.Object obj68 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList69 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj70 = shapeList69.clone();
        shapeList69.clear();
        java.lang.Object obj72 = shapeList69.clone();
        int int73 = shapeList69.size();
        java.lang.Object obj74 = shapeList69.clone();
        shapeList69.clear();
        shapeList69.clear();
        shapeList69.clear();
        java.awt.Shape shape79 = shapeList69.getShape((int) (byte) -1);
        int int80 = shapeList69.size();
        boolean boolean81 = shapeList0.equals((java.lang.Object) shapeList69);
        int int82 = shapeList69.size();
        java.awt.Shape shape84 = null;
        shapeList69.setShape((int) (short) 100, shape84);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList69", shapeList0.equals(shapeList69) ? shapeList0.hashCode() == shapeList69.hashCode() : true);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = null;
        boolean boolean8 = shapeList0.equals(obj7);
        java.awt.Shape shape10 = shapeList0.getShape((int) (byte) 1);
        java.awt.Shape shape12 = shapeList0.getShape(2);
        int int13 = shapeList0.size();
        int int14 = shapeList0.size();
        java.awt.Shape shape16 = null;
        shapeList0.setShape(11, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = null;
        boolean boolean8 = shapeList0.equals(obj7);
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) (short) 1);
        boolean boolean13 = shapeList9.equals((java.lang.Object) 1.0d);
        java.lang.Object obj14 = shapeList9.clone();
        boolean boolean15 = shapeList0.equals(obj14);
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj17 = shapeList16.clone();
        shapeList16.clear();
        java.awt.Shape shape20 = shapeList16.getShape((int) (short) 1);
        java.lang.Object obj21 = shapeList16.clone();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj23 = shapeList22.clone();
        shapeList22.clear();
        java.awt.Shape shape26 = shapeList22.getShape((int) (short) 1);
        boolean boolean28 = shapeList22.equals((java.lang.Object) (short) -1);
        java.lang.Object obj29 = null;
        boolean boolean30 = shapeList22.equals(obj29);
        int int31 = shapeList22.size();
        boolean boolean32 = shapeList16.equals((java.lang.Object) shapeList22);
        boolean boolean33 = shapeList0.equals((java.lang.Object) shapeList22);
        java.awt.Shape shape35 = shapeList0.getShape(1);
        org.jfree.chart.util.ShapeList shapeList36 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape38 = null;
        shapeList36.setShape(8, shape38);
        java.awt.Shape shape41 = shapeList36.getShape((int) (byte) 100);
        java.awt.Shape shape43 = shapeList36.getShape((int) (byte) 100);
        java.awt.Shape shape45 = shapeList36.getShape(11);
        java.awt.Shape shape47 = null;
        shapeList36.setShape((int) ' ', shape47);
        java.lang.Class<?> wildcardClass49 = shapeList36.getClass();
        boolean boolean50 = shapeList0.equals((java.lang.Object) wildcardClass49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList36", shapeList0.equals(shapeList36) ? shapeList0.hashCode() == shapeList36.hashCode() : true);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape(9);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape8 = null;
        shapeList0.setShape(3, shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '4');
        java.awt.Shape shape7 = shapeList0.getShape((int) (byte) -1);
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) (byte) 10, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) -1);
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        java.awt.Shape shape11 = shapeList0.getShape((int) '4');
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj13 = shapeList12.clone();
        shapeList12.clear();
        java.awt.Shape shape16 = shapeList12.getShape((int) (short) 1);
        boolean boolean18 = shapeList12.equals((java.lang.Object) (short) -1);
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj20 = shapeList19.clone();
        shapeList19.clear();
        java.awt.Shape shape23 = shapeList19.getShape((int) (short) 1);
        boolean boolean25 = shapeList19.equals((java.lang.Object) 0);
        shapeList19.clear();
        boolean boolean27 = shapeList12.equals((java.lang.Object) shapeList19);
        java.lang.Object obj28 = shapeList12.clone();
        boolean boolean29 = shapeList0.equals((java.lang.Object) shapeList12);
        java.awt.Shape shape31 = null;
        shapeList12.setShape(34, shape31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 10);
        shapeList0.clear();
        java.lang.Object obj5 = shapeList0.clone();
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = null;
        shapeList0.setShape(34, shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape(0, shape6);
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = null;
        shapeList0.setShape(0, shape10);
        int int12 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj14 = shapeList13.clone();
        java.lang.Object obj15 = shapeList13.clone();
        java.awt.Shape shape17 = shapeList13.getShape(1);
        shapeList13.clear();
        shapeList13.clear();
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj21 = shapeList20.clone();
        shapeList20.clear();
        java.awt.Shape shape24 = shapeList20.getShape((int) (short) 1);
        boolean boolean26 = shapeList20.equals((java.lang.Object) 'a');
        java.lang.Object obj27 = shapeList20.clone();
        boolean boolean28 = shapeList13.equals(obj27);
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj30 = shapeList29.clone();
        shapeList29.clear();
        java.awt.Shape shape33 = shapeList29.getShape((int) (short) 1);
        java.lang.Object obj34 = shapeList29.clone();
        boolean boolean35 = shapeList13.equals((java.lang.Object) shapeList29);
        java.lang.Object obj36 = shapeList13.clone();
        java.lang.Class<?> wildcardClass37 = shapeList13.getClass();
        boolean boolean38 = shapeList0.equals((java.lang.Object) shapeList13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        int int4 = shapeList0.size();
        shapeList0.clear();
        int int6 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        shapeList7.clear();
        java.awt.Shape shape11 = shapeList7.getShape((int) (short) 1);
        java.lang.Object obj12 = shapeList7.clone();
        java.lang.Object obj13 = shapeList7.clone();
        boolean boolean14 = shapeList0.equals((java.lang.Object) shapeList7);
        int int15 = shapeList7.size();
        java.lang.Object obj16 = shapeList7.clone();
        shapeList7.clear();
        java.lang.Object obj18 = shapeList7.clone();
        java.awt.Shape shape20 = null;
        shapeList7.setShape((int) (short) 10, shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '4');
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        shapeList7.clear();
        java.lang.Object obj10 = shapeList7.clone();
        int int11 = shapeList7.size();
        java.lang.Object obj12 = shapeList7.clone();
        int int13 = shapeList7.size();
        int int14 = shapeList7.size();
        shapeList7.clear();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj17 = shapeList16.clone();
        shapeList16.clear();
        shapeList16.clear();
        java.lang.Object obj20 = shapeList16.clone();
        boolean boolean22 = shapeList16.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj24 = shapeList23.clone();
        java.lang.Class<?> wildcardClass25 = shapeList23.getClass();
        boolean boolean26 = shapeList16.equals((java.lang.Object) shapeList23);
        boolean boolean27 = shapeList7.equals((java.lang.Object) shapeList23);
        shapeList7.clear();
        boolean boolean29 = shapeList0.equals((java.lang.Object) shapeList7);
        shapeList0.clear();
        java.lang.Object obj31 = shapeList0.clone();
        java.awt.Shape shape33 = null;
        shapeList0.setShape((int) 'a', shape33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape8 = null;
        shapeList6.setShape(8, shape8);
        int int10 = shapeList6.size();
        shapeList6.clear();
        int int12 = shapeList6.size();
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj14 = shapeList13.clone();
        shapeList13.clear();
        java.awt.Shape shape17 = shapeList13.getShape((int) (short) 1);
        java.lang.Object obj18 = shapeList13.clone();
        java.lang.Object obj19 = shapeList13.clone();
        boolean boolean20 = shapeList6.equals((java.lang.Object) shapeList13);
        int int21 = shapeList13.size();
        boolean boolean22 = shapeList0.equals((java.lang.Object) int21);
        java.awt.Shape shape24 = null;
        shapeList0.setShape(2, shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        int int2 = shapeList0.size();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 1, shape4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(1);
        shapeList0.clear();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        shapeList7.clear();
        java.awt.Shape shape11 = shapeList7.getShape((int) (short) 1);
        boolean boolean13 = shapeList7.equals((java.lang.Object) 'a');
        java.lang.Object obj14 = shapeList7.clone();
        boolean boolean15 = shapeList0.equals(obj14);
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape18 = null;
        shapeList16.setShape(8, shape18);
        int int20 = shapeList16.size();
        shapeList16.clear();
        int int22 = shapeList16.size();
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj24 = shapeList23.clone();
        shapeList23.clear();
        java.awt.Shape shape27 = shapeList23.getShape((int) (short) 1);
        java.lang.Object obj28 = shapeList23.clone();
        java.lang.Object obj29 = shapeList23.clone();
        boolean boolean30 = shapeList16.equals((java.lang.Object) shapeList23);
        org.jfree.chart.util.ShapeList shapeList31 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape33 = null;
        shapeList31.setShape(8, shape33);
        int int35 = shapeList31.size();
        shapeList31.clear();
        int int37 = shapeList31.size();
        org.jfree.chart.util.ShapeList shapeList38 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj39 = shapeList38.clone();
        shapeList38.clear();
        java.awt.Shape shape42 = shapeList38.getShape((int) (short) 1);
        java.lang.Object obj43 = shapeList38.clone();
        java.lang.Object obj44 = shapeList38.clone();
        boolean boolean45 = shapeList31.equals((java.lang.Object) shapeList38);
        java.awt.Shape shape47 = shapeList31.getShape((int) (short) 10);
        boolean boolean48 = shapeList23.equals((java.lang.Object) shapeList31);
        boolean boolean49 = shapeList0.equals((java.lang.Object) shapeList31);
        int int50 = shapeList0.size();
        java.awt.Shape shape52 = null;
        shapeList0.setShape((int) (short) 100, shape52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj6 = shapeList5.clone();
        shapeList5.clear();
        java.awt.Shape shape9 = shapeList5.getShape((int) (short) 1);
        java.lang.Object obj10 = shapeList5.clone();
        shapeList5.clear();
        boolean boolean12 = shapeList0.equals((java.lang.Object) shapeList5);
        java.lang.Object obj13 = shapeList0.clone();
        java.awt.Shape shape15 = null;
        shapeList0.setShape(33, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj5 = shapeList0.clone();
        java.lang.Object obj6 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        int int9 = shapeList0.size();
        java.awt.Shape shape11 = null;
        shapeList0.setShape(36, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape(0, shape6);
        java.lang.Object obj8 = shapeList0.clone();
        java.lang.Object obj9 = shapeList0.clone();
        java.lang.Object obj10 = null;
        boolean boolean11 = shapeList0.equals(obj10);
        java.awt.Shape shape13 = shapeList0.getShape(0);
        java.awt.Shape shape15 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        boolean boolean18 = shapeList16.equals((java.lang.Object) (short) 1);
        boolean boolean20 = shapeList16.equals((java.lang.Object) 1.0d);
        shapeList16.clear();
        shapeList16.clear();
        java.awt.Shape shape24 = shapeList16.getShape(1);
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj26 = shapeList25.clone();
        shapeList25.clear();
        java.lang.Object obj28 = shapeList25.clone();
        int int29 = shapeList25.size();
        java.lang.Object obj30 = shapeList25.clone();
        shapeList25.clear();
        shapeList25.clear();
        org.jfree.chart.util.ShapeList shapeList33 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj34 = shapeList33.clone();
        shapeList33.clear();
        shapeList33.clear();
        java.awt.Shape shape38 = shapeList33.getShape((int) '#');
        java.awt.Shape shape40 = shapeList33.getShape(1);
        java.awt.Shape shape42 = shapeList33.getShape((int) (byte) 0);
        boolean boolean43 = shapeList25.equals((java.lang.Object) shapeList33);
        shapeList33.clear();
        java.awt.Shape shape46 = shapeList33.getShape(9);
        boolean boolean47 = shapeList16.equals((java.lang.Object) 9);
        boolean boolean48 = shapeList0.equals((java.lang.Object) shapeList16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList16", shapeList0.equals(shapeList16) ? shapeList0.hashCode() == shapeList16.hashCode() : true);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        java.lang.Object obj3 = shapeList0.clone();
        java.awt.Shape shape5 = shapeList0.getShape(33);
        int int6 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        shapeList7.clear();
        shapeList7.clear();
        java.awt.Shape shape12 = shapeList7.getShape((int) '#');
        shapeList7.clear();
        java.lang.Object obj14 = shapeList7.clone();
        java.awt.Shape shape16 = shapeList7.getShape(10);
        boolean boolean17 = shapeList0.equals((java.lang.Object) 10);
        java.awt.Shape shape19 = null;
        shapeList0.setShape(0, shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj3", shapeList0.equals(obj3) ? shapeList0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape(1);
        java.awt.Shape shape9 = shapeList0.getShape(100);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        java.lang.Object obj12 = shapeList0.clone();
        int int13 = shapeList0.size();
        java.awt.Shape shape15 = null;
        shapeList0.setShape((int) (byte) 0, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = null;
        boolean boolean8 = shapeList0.equals(obj7);
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) (short) 1);
        boolean boolean13 = shapeList9.equals((java.lang.Object) 1.0d);
        java.lang.Object obj14 = shapeList9.clone();
        boolean boolean15 = shapeList0.equals(obj14);
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj17 = shapeList16.clone();
        shapeList16.clear();
        java.awt.Shape shape20 = shapeList16.getShape((int) (short) 1);
        java.lang.Object obj21 = shapeList16.clone();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj23 = shapeList22.clone();
        shapeList22.clear();
        java.awt.Shape shape26 = shapeList22.getShape((int) (short) 1);
        boolean boolean28 = shapeList22.equals((java.lang.Object) (short) -1);
        java.lang.Object obj29 = null;
        boolean boolean30 = shapeList22.equals(obj29);
        int int31 = shapeList22.size();
        boolean boolean32 = shapeList16.equals((java.lang.Object) shapeList22);
        boolean boolean33 = shapeList0.equals((java.lang.Object) shapeList22);
        java.awt.Shape shape35 = shapeList22.getShape((int) '#');
        java.awt.Shape shape37 = shapeList22.getShape((int) (byte) -1);
        java.awt.Shape shape39 = null;
        shapeList22.setShape((int) (byte) 1, shape39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList22", shapeList0.equals(shapeList22) ? shapeList0.hashCode() == shapeList22.hashCode() : true);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        java.awt.Shape shape5 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape7 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape9 = shapeList0.getShape(11);
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) ' ', shape11);
        java.awt.Shape shape14 = shapeList0.getShape((int) (short) 1);
        int int15 = shapeList0.size();
        int int16 = shapeList0.size();
        int int17 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj19 = shapeList18.clone();
        java.lang.Object obj20 = shapeList18.clone();
        shapeList18.clear();
        int int22 = shapeList18.size();
        boolean boolean23 = shapeList0.equals((java.lang.Object) shapeList18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList18", shapeList0.equals(shapeList18) ? shapeList0.hashCode() == shapeList18.hashCode() : true);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape(0, shape6);
        java.lang.Object obj8 = shapeList0.clone();
        java.lang.Object obj9 = shapeList0.clone();
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) -1);
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        java.lang.Object obj10 = shapeList0.clone();
        java.lang.Object obj11 = shapeList0.clone();
        java.awt.Shape shape13 = null;
        shapeList0.setShape(2, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 100);
        java.lang.Object obj8 = shapeList0.clone();
        java.lang.Object obj9 = shapeList0.clone();
        java.lang.Object obj10 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj12 = shapeList11.clone();
        shapeList11.clear();
        java.lang.Object obj14 = shapeList11.clone();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj16 = shapeList15.clone();
        shapeList15.clear();
        java.awt.Shape shape19 = shapeList15.getShape((int) (short) 1);
        boolean boolean21 = shapeList15.equals((java.lang.Object) (short) -1);
        boolean boolean22 = shapeList11.equals((java.lang.Object) shapeList15);
        java.lang.Object obj23 = shapeList11.clone();
        boolean boolean24 = shapeList0.equals(obj23);
        int int25 = shapeList0.size();
        java.awt.Shape shape27 = null;
        shapeList0.setShape((int) (byte) 0, shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.awt.Shape shape7 = null;
        shapeList0.setShape((int) '#', shape7);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj11 = shapeList10.clone();
        shapeList10.clear();
        java.lang.Object obj13 = shapeList10.clone();
        int int14 = shapeList10.size();
        shapeList10.clear();
        shapeList10.clear();
        shapeList10.clear();
        java.lang.Object obj18 = shapeList10.clone();
        boolean boolean19 = shapeList0.equals((java.lang.Object) shapeList10);
        java.awt.Shape shape21 = shapeList10.getShape((int) (byte) 10);
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        boolean boolean24 = shapeList22.equals((java.lang.Object) (short) 1);
        boolean boolean26 = shapeList22.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj28 = shapeList27.clone();
        shapeList27.clear();
        java.awt.Shape shape31 = shapeList27.getShape((int) (short) 1);
        boolean boolean33 = shapeList27.equals((java.lang.Object) (short) -1);
        shapeList27.clear();
        shapeList27.clear();
        java.awt.Shape shape37 = shapeList27.getShape((int) (short) 0);
        org.jfree.chart.util.ShapeList shapeList38 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj39 = shapeList38.clone();
        shapeList38.clear();
        org.jfree.chart.util.ShapeList shapeList41 = new org.jfree.chart.util.ShapeList();
        int int42 = shapeList41.size();
        int int43 = shapeList41.size();
        java.lang.Object obj44 = shapeList41.clone();
        boolean boolean45 = shapeList38.equals(obj44);
        boolean boolean46 = shapeList27.equals((java.lang.Object) shapeList38);
        boolean boolean47 = shapeList22.equals((java.lang.Object) shapeList38);
        java.awt.Shape shape49 = shapeList38.getShape((int) ' ');
        java.lang.Object obj50 = shapeList38.clone();
        boolean boolean51 = shapeList10.equals(obj50);
        java.awt.Shape shape53 = null;
        shapeList10.setShape(101, shape53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 'a');
        int int7 = shapeList0.size();
        java.awt.Shape shape9 = null;
        shapeList0.setShape(0, shape9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = null;
        boolean boolean8 = shapeList0.equals(obj7);
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) (short) 1);
        boolean boolean13 = shapeList9.equals((java.lang.Object) 1.0d);
        java.lang.Object obj14 = shapeList9.clone();
        boolean boolean15 = shapeList0.equals(obj14);
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj17 = shapeList16.clone();
        shapeList16.clear();
        java.awt.Shape shape20 = shapeList16.getShape((int) (short) 1);
        java.lang.Object obj21 = shapeList16.clone();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj23 = shapeList22.clone();
        shapeList22.clear();
        java.awt.Shape shape26 = shapeList22.getShape((int) (short) 1);
        boolean boolean28 = shapeList22.equals((java.lang.Object) (short) -1);
        java.lang.Object obj29 = null;
        boolean boolean30 = shapeList22.equals(obj29);
        int int31 = shapeList22.size();
        boolean boolean32 = shapeList16.equals((java.lang.Object) shapeList22);
        boolean boolean33 = shapeList0.equals((java.lang.Object) shapeList22);
        java.lang.Object obj34 = shapeList22.clone();
        java.awt.Shape shape36 = null;
        shapeList22.setShape(0, shape36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList22", shapeList0.equals(shapeList22) ? shapeList0.hashCode() == shapeList22.hashCode() : true);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1));
        int int5 = shapeList0.size();
        java.awt.Shape shape7 = shapeList0.getShape((int) (byte) -1);
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj9 = shapeList8.clone();
        shapeList8.clear();
        java.awt.Shape shape12 = shapeList8.getShape((int) (short) 1);
        boolean boolean14 = shapeList8.equals((java.lang.Object) (short) -1);
        java.lang.Object obj15 = null;
        boolean boolean16 = shapeList8.equals(obj15);
        int int17 = shapeList8.size();
        java.lang.Object obj18 = null;
        boolean boolean19 = shapeList8.equals(obj18);
        java.awt.Shape shape21 = shapeList8.getShape((int) 'a');
        java.awt.Shape shape23 = shapeList8.getShape((int) (byte) 0);
        boolean boolean24 = shapeList0.equals((java.lang.Object) shapeList8);
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        boolean boolean27 = shapeList25.equals((java.lang.Object) (short) 1);
        boolean boolean28 = shapeList8.equals((java.lang.Object) shapeList25);
        java.awt.Shape shape30 = null;
        shapeList25.setShape((int) (byte) 0, shape30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList25", shapeList0.equals(shapeList25) ? shapeList0.hashCode() == shapeList25.hashCode() : true);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = shapeList0.clone();
        java.awt.Shape shape9 = shapeList0.getShape((int) (short) -1);
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) (short) 0, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        shapeList0.clear();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        shapeList7.clear();
        java.awt.Shape shape11 = shapeList7.getShape((int) (short) 1);
        boolean boolean13 = shapeList7.equals((java.lang.Object) (short) -1);
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj15 = shapeList14.clone();
        shapeList14.clear();
        java.awt.Shape shape18 = shapeList14.getShape((int) (short) 1);
        boolean boolean20 = shapeList14.equals((java.lang.Object) 0);
        shapeList14.clear();
        boolean boolean22 = shapeList7.equals((java.lang.Object) shapeList14);
        boolean boolean23 = shapeList0.equals((java.lang.Object) boolean22);
        java.lang.Object obj24 = shapeList0.clone();
        java.awt.Shape shape26 = null;
        shapeList0.setShape((int) (short) 0, shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape(1);
        java.awt.Shape shape9 = shapeList0.getShape((int) (byte) 0);
        java.awt.Shape shape11 = shapeList0.getShape((int) (short) 100);
        shapeList0.clear();
        java.awt.Shape shape14 = null;
        shapeList0.setShape((int) (byte) 0, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1));
        int int5 = shapeList0.size();
        java.awt.Shape shape7 = shapeList0.getShape((int) (byte) -1);
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj9 = shapeList8.clone();
        shapeList8.clear();
        java.awt.Shape shape12 = shapeList8.getShape((int) (short) 1);
        boolean boolean14 = shapeList8.equals((java.lang.Object) (short) -1);
        java.lang.Object obj15 = null;
        boolean boolean16 = shapeList8.equals(obj15);
        int int17 = shapeList8.size();
        java.lang.Object obj18 = null;
        boolean boolean19 = shapeList8.equals(obj18);
        java.awt.Shape shape21 = shapeList8.getShape((int) 'a');
        java.awt.Shape shape23 = shapeList8.getShape((int) (byte) 0);
        boolean boolean24 = shapeList0.equals((java.lang.Object) shapeList8);
        java.awt.Shape shape26 = null;
        shapeList8.setShape(2, shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape(0, shape6);
        int int8 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape11 = null;
        shapeList0.setShape(0, shape11);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        shapeList13.clear();
        java.lang.Object obj15 = shapeList13.clone();
        boolean boolean17 = shapeList13.equals((java.lang.Object) (-1));
        int int18 = shapeList13.size();
        java.awt.Shape shape20 = shapeList13.getShape((int) (byte) -1);
        int int21 = shapeList13.size();
        java.lang.Object obj22 = shapeList13.clone();
        boolean boolean23 = shapeList0.equals(obj22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.awt.Shape shape3 = shapeList0.getShape(10);
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 1);
        java.awt.Shape shape7 = null;
        shapeList0.setShape(10, shape7);
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj10 = shapeList9.clone();
        shapeList9.clear();
        java.awt.Shape shape13 = shapeList9.getShape((int) (short) 1);
        boolean boolean15 = shapeList9.equals((java.lang.Object) (short) -1);
        shapeList9.clear();
        shapeList9.clear();
        java.awt.Shape shape19 = shapeList9.getShape((int) (short) 0);
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        boolean boolean22 = shapeList20.equals((java.lang.Object) (short) 1);
        boolean boolean24 = shapeList20.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj25 = shapeList20.clone();
        java.awt.Shape shape27 = shapeList20.getShape((int) (short) -1);
        boolean boolean29 = shapeList20.equals((java.lang.Object) (-1.0d));
        boolean boolean30 = shapeList9.equals((java.lang.Object) shapeList20);
        java.lang.Object obj31 = shapeList9.clone();
        shapeList9.clear();
        shapeList9.clear();
        int int34 = shapeList9.size();
        boolean boolean35 = shapeList0.equals((java.lang.Object) shapeList9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = null;
        boolean boolean8 = shapeList0.equals(obj7);
        int int9 = shapeList0.size();
        java.lang.Object obj10 = null;
        boolean boolean11 = shapeList0.equals(obj10);
        java.awt.Shape shape13 = shapeList0.getShape((int) 'a');
        java.awt.Shape shape15 = shapeList0.getShape((int) '4');
        java.awt.Shape shape17 = shapeList0.getShape((int) (byte) 10);
        int int18 = shapeList0.size();
        java.awt.Shape shape20 = null;
        shapeList0.setShape(0, shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        java.lang.Object obj5 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape8 = shapeList0.getShape(0);
        java.lang.Object obj9 = shapeList0.clone();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape13 = null;
        shapeList11.setShape(8, shape13);
        int int15 = shapeList11.size();
        shapeList11.clear();
        int int17 = shapeList11.size();
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj19 = shapeList18.clone();
        shapeList18.clear();
        java.awt.Shape shape22 = shapeList18.getShape((int) (short) 1);
        java.lang.Object obj23 = shapeList18.clone();
        java.lang.Object obj24 = shapeList18.clone();
        boolean boolean25 = shapeList11.equals((java.lang.Object) shapeList18);
        java.awt.Shape shape27 = shapeList11.getShape((int) (short) 10);
        shapeList11.clear();
        java.awt.Shape shape30 = shapeList11.getShape((int) (short) 1);
        boolean boolean31 = shapeList0.equals((java.lang.Object) shape30);
        java.awt.Shape shape33 = null;
        shapeList0.setShape(100, shape33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 'a');
        java.lang.Object obj7 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj9 = shapeList8.clone();
        java.lang.Object obj10 = shapeList8.clone();
        java.awt.Shape shape12 = shapeList8.getShape(1);
        shapeList8.clear();
        shapeList8.clear();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj16 = shapeList15.clone();
        shapeList15.clear();
        java.awt.Shape shape19 = shapeList15.getShape((int) (short) 1);
        boolean boolean21 = shapeList15.equals((java.lang.Object) 'a');
        java.lang.Object obj22 = shapeList15.clone();
        boolean boolean23 = shapeList8.equals(obj22);
        boolean boolean24 = shapeList0.equals((java.lang.Object) shapeList8);
        java.lang.Object obj25 = shapeList0.clone();
        java.lang.Object obj26 = shapeList0.clone();
        java.awt.Shape shape28 = shapeList0.getShape((int) (short) 100);
        java.awt.Shape shape30 = null;
        shapeList0.setShape((int) '4', shape30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj5 = shapeList4.clone();
        shapeList4.clear();
        java.awt.Shape shape8 = shapeList4.getShape((int) (short) 1);
        boolean boolean10 = shapeList4.equals((java.lang.Object) (short) -1);
        boolean boolean11 = shapeList0.equals((java.lang.Object) shapeList4);
        java.awt.Shape shape13 = shapeList4.getShape((int) 'a');
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj15 = shapeList14.clone();
        shapeList14.clear();
        java.awt.Shape shape18 = shapeList14.getShape((int) (short) 1);
        boolean boolean20 = shapeList14.equals((java.lang.Object) 'a');
        java.lang.Object obj21 = shapeList14.clone();
        int int22 = shapeList14.size();
        java.awt.Shape shape24 = shapeList14.getShape(101);
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj26 = shapeList25.clone();
        shapeList25.clear();
        java.awt.Shape shape29 = shapeList25.getShape((int) (short) 1);
        boolean boolean31 = shapeList25.equals((java.lang.Object) (short) -1);
        shapeList25.clear();
        java.awt.Shape shape34 = shapeList25.getShape((int) (short) 100);
        org.jfree.chart.util.ShapeList shapeList35 = new org.jfree.chart.util.ShapeList();
        shapeList35.clear();
        int int37 = shapeList35.size();
        shapeList35.clear();
        org.jfree.chart.util.ShapeList shapeList39 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj40 = shapeList39.clone();
        shapeList39.clear();
        java.awt.Shape shape43 = shapeList39.getShape((int) (short) 1);
        boolean boolean45 = shapeList39.equals((java.lang.Object) 'a');
        java.lang.Object obj46 = shapeList39.clone();
        int int47 = shapeList39.size();
        boolean boolean48 = shapeList35.equals((java.lang.Object) shapeList39);
        java.lang.Object obj49 = shapeList39.clone();
        boolean boolean50 = shapeList25.equals((java.lang.Object) shapeList39);
        boolean boolean51 = shapeList14.equals((java.lang.Object) shapeList25);
        shapeList14.clear();
        int int53 = shapeList14.size();
        org.jfree.chart.util.ShapeList shapeList54 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj55 = shapeList54.clone();
        shapeList54.clear();
        java.awt.Shape shape58 = shapeList54.getShape((int) (short) 1);
        boolean boolean60 = shapeList54.equals((java.lang.Object) (short) -1);
        java.lang.Object obj61 = null;
        boolean boolean62 = shapeList54.equals(obj61);
        org.jfree.chart.util.ShapeList shapeList63 = new org.jfree.chart.util.ShapeList();
        boolean boolean65 = shapeList63.equals((java.lang.Object) (short) 1);
        boolean boolean67 = shapeList63.equals((java.lang.Object) 1.0d);
        java.lang.Object obj68 = shapeList63.clone();
        boolean boolean69 = shapeList54.equals(obj68);
        java.awt.Shape shape71 = shapeList54.getShape(9);
        int int72 = shapeList54.size();
        int int73 = shapeList54.size();
        boolean boolean74 = shapeList14.equals((java.lang.Object) shapeList54);
        boolean boolean75 = shapeList4.equals((java.lang.Object) shapeList14);
        java.awt.Shape shape77 = null;
        shapeList14.setShape((int) (short) 10, shape77);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) -1);
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        int int10 = shapeList0.size();
        java.awt.Shape shape12 = shapeList0.getShape((int) '#');
        int int13 = shapeList0.size();
        java.awt.Shape shape15 = null;
        shapeList0.setShape((int) ' ', shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.awt.Shape shape7 = null;
        shapeList0.setShape((int) '#', shape7);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj11 = shapeList10.clone();
        shapeList10.clear();
        java.lang.Object obj13 = shapeList10.clone();
        int int14 = shapeList10.size();
        shapeList10.clear();
        shapeList10.clear();
        shapeList10.clear();
        java.lang.Object obj18 = shapeList10.clone();
        boolean boolean19 = shapeList0.equals((java.lang.Object) shapeList10);
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj21 = shapeList20.clone();
        shapeList20.clear();
        java.awt.Shape shape24 = shapeList20.getShape((int) (short) 1);
        boolean boolean26 = shapeList20.equals((java.lang.Object) (short) -1);
        java.lang.Object obj27 = shapeList20.clone();
        java.awt.Shape shape29 = shapeList20.getShape((int) (short) -1);
        org.jfree.chart.util.ShapeList shapeList30 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj31 = shapeList30.clone();
        shapeList30.clear();
        java.lang.Object obj33 = shapeList30.clone();
        org.jfree.chart.util.ShapeList shapeList34 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj35 = shapeList34.clone();
        shapeList34.clear();
        java.awt.Shape shape38 = shapeList34.getShape((int) (short) 1);
        boolean boolean40 = shapeList34.equals((java.lang.Object) (short) -1);
        boolean boolean41 = shapeList30.equals((java.lang.Object) shapeList34);
        java.lang.Object obj42 = shapeList30.clone();
        java.awt.Shape shape44 = shapeList30.getShape(8);
        org.jfree.chart.util.ShapeList shapeList45 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj46 = shapeList45.clone();
        shapeList45.clear();
        java.awt.Shape shape49 = shapeList45.getShape((int) (short) 1);
        boolean boolean51 = shapeList45.equals((java.lang.Object) (short) -1);
        java.lang.Object obj52 = null;
        boolean boolean53 = shapeList45.equals(obj52);
        int int54 = shapeList45.size();
        java.lang.Object obj55 = null;
        boolean boolean56 = shapeList45.equals(obj55);
        java.awt.Shape shape58 = shapeList45.getShape((int) 'a');
        java.awt.Shape shape60 = shapeList45.getShape((int) '4');
        java.awt.Shape shape62 = shapeList45.getShape((int) '#');
        java.awt.Shape shape64 = shapeList45.getShape((int) (byte) -1);
        java.lang.Object obj65 = shapeList45.clone();
        boolean boolean66 = shapeList30.equals((java.lang.Object) shapeList45);
        java.lang.Object obj67 = shapeList30.clone();
        boolean boolean68 = shapeList20.equals((java.lang.Object) shapeList30);
        boolean boolean69 = shapeList0.equals((java.lang.Object) boolean68);
        java.lang.Object obj70 = shapeList0.clone();
        java.awt.Shape shape72 = null;
        shapeList0.setShape((int) (short) 0, shape72);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 1);
        shapeList0.clear();
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) '4', shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        int int4 = shapeList0.size();
        shapeList0.clear();
        int int6 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        shapeList7.clear();
        java.awt.Shape shape11 = shapeList7.getShape((int) (short) 1);
        java.lang.Object obj12 = shapeList7.clone();
        java.lang.Object obj13 = shapeList7.clone();
        boolean boolean14 = shapeList0.equals((java.lang.Object) shapeList7);
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj17 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj19 = shapeList0.clone();
        java.awt.Shape shape21 = null;
        shapeList0.setShape(34, shape21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        int int2 = shapeList0.size();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) '#', shape4);
        java.lang.Object obj6 = shapeList0.clone();
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) (byte) 1, shape8);
        java.awt.Shape shape11 = null;
        shapeList0.setShape(101, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        int int2 = shapeList0.size();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) '#', shape4);
        shapeList0.clear();
        java.awt.Shape shape8 = null;
        shapeList0.setShape(1, shape8);
        java.awt.Shape shape11 = shapeList0.getShape((int) (short) 100);
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        boolean boolean14 = shapeList12.equals((java.lang.Object) (short) 1);
        boolean boolean16 = shapeList12.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape18 = null;
        shapeList12.setShape((int) (byte) 0, shape18);
        java.awt.Shape shape21 = null;
        shapeList12.setShape((int) (byte) 10, shape21);
        boolean boolean24 = shapeList12.equals((java.lang.Object) (-1));
        shapeList12.clear();
        java.lang.Object obj26 = shapeList12.clone();
        boolean boolean27 = shapeList0.equals((java.lang.Object) shapeList12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        boolean boolean5 = shapeList3.equals((java.lang.Object) (short) 1);
        boolean boolean7 = shapeList3.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = shapeList3.clone();
        java.awt.Shape shape10 = shapeList3.getShape((int) (short) -1);
        int int11 = shapeList3.size();
        boolean boolean12 = shapeList0.equals((java.lang.Object) int11);
        java.awt.Shape shape14 = shapeList0.getShape(9);
        int int15 = shapeList0.size();
        java.lang.Object obj16 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        boolean boolean18 = shapeList0.equals((java.lang.Object) shapeList17);
        java.awt.Shape shape20 = shapeList17.getShape((int) (byte) 100);
        java.awt.Shape shape22 = shapeList17.getShape(3);
        java.awt.Shape shape24 = null;
        shapeList17.setShape(36, shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList17", shapeList0.equals(shapeList17) ? shapeList0.hashCode() == shapeList17.hashCode() : true);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = null;
        boolean boolean8 = shapeList0.equals(obj7);
        int int9 = shapeList0.size();
        java.lang.Object obj10 = null;
        boolean boolean11 = shapeList0.equals(obj10);
        java.awt.Shape shape13 = shapeList0.getShape((int) 'a');
        java.awt.Shape shape15 = shapeList0.getShape((int) '4');
        java.lang.Object obj16 = shapeList0.clone();
        java.awt.Shape shape18 = null;
        shapeList0.setShape(8, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        java.lang.Object obj5 = shapeList0.clone();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        shapeList7.clear();
        java.awt.Shape shape11 = shapeList7.getShape((int) (short) 1);
        boolean boolean13 = shapeList7.equals((java.lang.Object) 'a');
        java.lang.Object obj14 = shapeList7.clone();
        java.lang.Object obj15 = shapeList7.clone();
        boolean boolean16 = shapeList0.equals((java.lang.Object) shapeList7);
        shapeList7.clear();
        java.lang.Object obj18 = shapeList7.clone();
        java.lang.Object obj19 = shapeList7.clone();
        java.awt.Shape shape21 = null;
        shapeList7.setShape((int) (byte) 0, shape21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape((int) (short) 0);
        shapeList0.clear();
        java.awt.Shape shape13 = null;
        shapeList0.setShape(101, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        int int2 = shapeList0.size();
        int int3 = shapeList0.size();
        int int4 = shapeList0.size();
        java.awt.Shape shape6 = shapeList0.getShape((int) (short) 1);
        int int7 = shapeList0.size();
        java.awt.Shape shape9 = shapeList0.getShape((int) (byte) 100);
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj11 = shapeList10.clone();
        shapeList10.clear();
        java.lang.Object obj13 = shapeList10.clone();
        int int14 = shapeList10.size();
        shapeList10.clear();
        shapeList10.clear();
        boolean boolean17 = shapeList0.equals((java.lang.Object) shapeList10);
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj19 = shapeList18.clone();
        java.lang.Object obj20 = shapeList18.clone();
        java.awt.Shape shape22 = shapeList18.getShape(1);
        int int23 = shapeList18.size();
        shapeList18.clear();
        int int25 = shapeList18.size();
        java.lang.Object obj26 = shapeList18.clone();
        boolean boolean27 = shapeList0.equals((java.lang.Object) shapeList18);
        java.lang.Object obj28 = shapeList18.clone();
        java.awt.Shape shape30 = null;
        shapeList18.setShape(10, shape30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList18", shapeList0.equals(shapeList18) ? shapeList0.hashCode() == shapeList18.hashCode() : true);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '4');
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        shapeList7.clear();
        java.lang.Object obj10 = shapeList7.clone();
        int int11 = shapeList7.size();
        java.lang.Object obj12 = shapeList7.clone();
        int int13 = shapeList7.size();
        int int14 = shapeList7.size();
        shapeList7.clear();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj17 = shapeList16.clone();
        shapeList16.clear();
        shapeList16.clear();
        java.lang.Object obj20 = shapeList16.clone();
        boolean boolean22 = shapeList16.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj24 = shapeList23.clone();
        java.lang.Class<?> wildcardClass25 = shapeList23.getClass();
        boolean boolean26 = shapeList16.equals((java.lang.Object) shapeList23);
        boolean boolean27 = shapeList7.equals((java.lang.Object) shapeList23);
        shapeList7.clear();
        boolean boolean29 = shapeList0.equals((java.lang.Object) shapeList7);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape33 = null;
        shapeList0.setShape((int) '#', shape33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        java.lang.Object obj3 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj5 = shapeList4.clone();
        shapeList4.clear();
        java.awt.Shape shape8 = shapeList4.getShape((int) ' ');
        java.lang.Object obj9 = shapeList4.clone();
        shapeList4.clear();
        boolean boolean11 = shapeList0.equals((java.lang.Object) shapeList4);
        java.awt.Shape shape13 = shapeList0.getShape(10);
        int int14 = shapeList0.size();
        java.awt.Shape shape16 = null;
        shapeList0.setShape(10, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 0, shape6);
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) 'a', shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        int int2 = shapeList0.size();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) '#', shape4);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        shapeList7.clear();
        java.awt.Shape shape11 = shapeList7.getShape((int) (short) 1);
        boolean boolean13 = shapeList7.equals((java.lang.Object) 0);
        int int14 = shapeList7.size();
        int int15 = shapeList7.size();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        shapeList16.clear();
        java.awt.Shape shape19 = shapeList16.getShape(10);
        boolean boolean20 = shapeList7.equals((java.lang.Object) shapeList16);
        boolean boolean21 = shapeList0.equals((java.lang.Object) boolean20);
        java.awt.Shape shape23 = shapeList0.getShape((int) 'a');
        int int24 = shapeList0.size();
        int int25 = shapeList0.size();
        java.lang.Object obj26 = shapeList0.clone();
        java.awt.Shape shape28 = null;
        shapeList0.setShape((int) ' ', shape28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) -1);
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        int int10 = shapeList0.size();
        java.awt.Shape shape12 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        shapeList13.clear();
        java.lang.Object obj15 = shapeList13.clone();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        boolean boolean18 = shapeList16.equals((java.lang.Object) (short) 1);
        boolean boolean20 = shapeList16.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj21 = shapeList16.clone();
        java.awt.Shape shape23 = shapeList16.getShape((int) (short) -1);
        int int24 = shapeList16.size();
        boolean boolean25 = shapeList13.equals((java.lang.Object) int24);
        java.awt.Shape shape27 = shapeList13.getShape(9);
        int int28 = shapeList13.size();
        java.lang.Object obj29 = shapeList13.clone();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        boolean boolean31 = shapeList0.equals((java.lang.Object) wildcardClass30);
        java.awt.Shape shape33 = shapeList0.getShape(0);
        java.lang.Object obj34 = shapeList0.clone();
        java.lang.Object obj35 = shapeList0.clone();
        java.awt.Shape shape37 = null;
        shapeList0.setShape(34, shape37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        java.awt.Shape shape5 = shapeList0.getShape((int) (short) -1);
        shapeList0.clear();
        java.lang.Object obj7 = shapeList0.clone();
        java.awt.Shape shape9 = null;
        shapeList0.setShape(10, shape9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj3", shapeList0.equals(obj3) ? shapeList0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj6 = shapeList5.clone();
        shapeList5.clear();
        java.awt.Shape shape9 = shapeList5.getShape((int) (short) 1);
        boolean boolean11 = shapeList5.equals((java.lang.Object) (short) -1);
        shapeList5.clear();
        shapeList5.clear();
        java.awt.Shape shape15 = shapeList5.getShape((int) (short) 0);
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj17 = shapeList16.clone();
        shapeList16.clear();
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        int int20 = shapeList19.size();
        int int21 = shapeList19.size();
        java.lang.Object obj22 = shapeList19.clone();
        boolean boolean23 = shapeList16.equals(obj22);
        boolean boolean24 = shapeList5.equals((java.lang.Object) shapeList16);
        boolean boolean25 = shapeList0.equals((java.lang.Object) shapeList16);
        int int26 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        int int28 = shapeList27.size();
        shapeList27.clear();
        java.awt.Shape shape31 = null;
        shapeList27.setShape((int) (short) 100, shape31);
        java.awt.Shape shape34 = null;
        shapeList27.setShape((int) '#', shape34);
        java.lang.Object obj36 = shapeList27.clone();
        int int37 = shapeList27.size();
        boolean boolean38 = shapeList0.equals((java.lang.Object) shapeList27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList27", shapeList0.equals(shapeList27) ? shapeList0.hashCode() == shapeList27.hashCode() : true);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        java.awt.Shape shape5 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape7 = null;
        shapeList0.setShape(0, shape7);
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj10 = shapeList9.clone();
        shapeList9.clear();
        java.awt.Shape shape13 = shapeList9.getShape((int) (short) 1);
        boolean boolean15 = shapeList9.equals((java.lang.Object) (short) -1);
        shapeList9.clear();
        java.awt.Shape shape18 = shapeList9.getShape((int) (short) 100);
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj20 = shapeList19.clone();
        shapeList19.clear();
        java.awt.Shape shape23 = shapeList19.getShape((int) (short) 1);
        boolean boolean25 = shapeList19.equals((java.lang.Object) (short) -1);
        java.lang.Object obj26 = null;
        boolean boolean27 = shapeList19.equals(obj26);
        int int28 = shapeList19.size();
        java.lang.Object obj29 = null;
        boolean boolean30 = shapeList19.equals(obj29);
        java.awt.Shape shape32 = shapeList19.getShape((int) 'a');
        java.awt.Shape shape34 = shapeList19.getShape((int) '4');
        boolean boolean35 = shapeList9.equals((java.lang.Object) '4');
        int int36 = shapeList9.size();
        java.awt.Shape shape38 = shapeList9.getShape((int) (short) 10);
        boolean boolean39 = shapeList0.equals((java.lang.Object) shapeList9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        java.awt.Shape shape5 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape7 = shapeList0.getShape((int) (byte) 100);
        shapeList0.clear();
        int int9 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj11 = shapeList10.clone();
        shapeList10.clear();
        java.awt.Shape shape14 = shapeList10.getShape((int) (short) 1);
        boolean boolean16 = shapeList10.equals((java.lang.Object) (short) -1);
        java.lang.Object obj17 = null;
        boolean boolean18 = shapeList10.equals(obj17);
        shapeList10.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList10);
        java.awt.Shape shape22 = null;
        shapeList10.setShape((int) (byte) 1, shape22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = null;
        boolean boolean8 = shapeList0.equals(obj7);
        int int9 = shapeList0.size();
        java.lang.Object obj10 = null;
        boolean boolean11 = shapeList0.equals(obj10);
        java.awt.Shape shape13 = shapeList0.getShape((int) 'a');
        java.awt.Shape shape15 = shapeList0.getShape((int) '4');
        java.awt.Shape shape17 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj19 = shapeList18.clone();
        shapeList18.clear();
        shapeList18.clear();
        java.awt.Shape shape23 = shapeList18.getShape((int) '#');
        java.awt.Shape shape25 = shapeList18.getShape(1);
        boolean boolean26 = shapeList0.equals((java.lang.Object) shapeList18);
        java.awt.Shape shape28 = shapeList0.getShape(1);
        shapeList0.clear();
        java.awt.Shape shape31 = null;
        shapeList0.setShape((int) (byte) 1, shape31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        int int2 = shapeList0.size();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) '#', shape4);
        java.lang.Object obj6 = shapeList0.clone();
        java.lang.Object obj7 = shapeList0.clone();
        java.awt.Shape shape9 = shapeList0.getShape(0);
        int int10 = shapeList0.size();
        java.lang.Object obj11 = shapeList0.clone();
        java.awt.Shape shape13 = shapeList0.getShape((int) (short) -1);
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj7 = shapeList6.clone();
        shapeList6.clear();
        java.awt.Shape shape10 = shapeList6.getShape((int) (short) 1);
        java.lang.Object obj11 = shapeList6.clone();
        java.lang.Object obj12 = shapeList6.clone();
        boolean boolean13 = shapeList0.equals(obj12);
        shapeList0.clear();
        java.lang.Object obj15 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        int int17 = shapeList16.size();
        int int18 = shapeList16.size();
        java.awt.Shape shape20 = null;
        shapeList16.setShape((int) ' ', shape20);
        java.lang.Object obj22 = shapeList16.clone();
        java.awt.Shape shape24 = shapeList16.getShape(9);
        java.awt.Shape shape26 = shapeList16.getShape((int) (byte) 100);
        java.awt.Shape shape28 = shapeList16.getShape(100);
        boolean boolean29 = shapeList0.equals((java.lang.Object) shape28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList16", shapeList0.equals(shapeList16) ? shapeList0.hashCode() == shapeList16.hashCode() : true);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        shapeList3.clear();
        java.lang.Object obj5 = shapeList3.clone();
        shapeList3.clear();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) (byte) 1, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        java.awt.Shape shape5 = shapeList0.getShape((int) (short) -1);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        boolean boolean9 = shapeList7.equals((java.lang.Object) (short) 1);
        boolean boolean11 = shapeList7.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj12 = shapeList7.clone();
        java.awt.Shape shape14 = shapeList7.getShape((int) (short) -1);
        int int15 = shapeList7.size();
        int int16 = shapeList7.size();
        int int17 = shapeList7.size();
        java.awt.Shape shape19 = shapeList7.getShape((int) '#');
        int int20 = shapeList7.size();
        java.lang.Object obj21 = shapeList7.clone();
        int int22 = shapeList7.size();
        shapeList7.clear();
        java.lang.Object obj24 = shapeList7.clone();
        boolean boolean25 = shapeList0.equals(obj24);
        java.awt.Shape shape27 = null;
        shapeList0.setShape(0, shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj3", shapeList0.equals(obj3) ? shapeList0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) -1);
        boolean boolean9 = shapeList0.equals((java.lang.Object) (-1.0d));
        int int10 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj12 = shapeList11.clone();
        shapeList11.clear();
        java.lang.Object obj14 = shapeList11.clone();
        int int15 = shapeList11.size();
        java.lang.Object obj16 = shapeList11.clone();
        int int17 = shapeList11.size();
        int int18 = shapeList11.size();
        shapeList11.clear();
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj21 = shapeList20.clone();
        shapeList20.clear();
        shapeList20.clear();
        java.lang.Object obj24 = shapeList20.clone();
        boolean boolean26 = shapeList20.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj28 = shapeList27.clone();
        java.lang.Class<?> wildcardClass29 = shapeList27.getClass();
        boolean boolean30 = shapeList20.equals((java.lang.Object) shapeList27);
        boolean boolean31 = shapeList11.equals((java.lang.Object) shapeList27);
        shapeList11.clear();
        int int33 = shapeList11.size();
        boolean boolean34 = shapeList0.equals((java.lang.Object) shapeList11);
        java.awt.Shape shape36 = null;
        shapeList11.setShape(1, shape36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape(0, shape6);
        java.lang.Object obj8 = shapeList0.clone();
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) (byte) 10, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 'a');
        java.lang.Object obj7 = shapeList0.clone();
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = shapeList0.getShape(101);
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj12 = shapeList11.clone();
        shapeList11.clear();
        java.awt.Shape shape15 = shapeList11.getShape((int) (short) 1);
        boolean boolean17 = shapeList11.equals((java.lang.Object) (short) -1);
        shapeList11.clear();
        java.awt.Shape shape20 = shapeList11.getShape((int) (short) 100);
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        shapeList21.clear();
        int int23 = shapeList21.size();
        shapeList21.clear();
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj26 = shapeList25.clone();
        shapeList25.clear();
        java.awt.Shape shape29 = shapeList25.getShape((int) (short) 1);
        boolean boolean31 = shapeList25.equals((java.lang.Object) 'a');
        java.lang.Object obj32 = shapeList25.clone();
        int int33 = shapeList25.size();
        boolean boolean34 = shapeList21.equals((java.lang.Object) shapeList25);
        java.lang.Object obj35 = shapeList25.clone();
        boolean boolean36 = shapeList11.equals((java.lang.Object) shapeList25);
        boolean boolean37 = shapeList0.equals((java.lang.Object) shapeList11);
        int int38 = shapeList11.size();
        int int39 = shapeList11.size();
        org.jfree.chart.util.ShapeList shapeList40 = new org.jfree.chart.util.ShapeList();
        shapeList40.clear();
        java.lang.Object obj42 = shapeList40.clone();
        boolean boolean44 = shapeList40.equals((java.lang.Object) (-1));
        int int45 = shapeList40.size();
        java.awt.Shape shape47 = shapeList40.getShape((int) (byte) -1);
        int int48 = shapeList40.size();
        java.lang.Object obj49 = shapeList40.clone();
        boolean boolean50 = shapeList11.equals((java.lang.Object) shapeList40);
        org.jfree.chart.util.ShapeList shapeList51 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj52 = shapeList51.clone();
        shapeList51.clear();
        java.awt.Shape shape55 = shapeList51.getShape((int) (short) 1);
        boolean boolean57 = shapeList51.equals((java.lang.Object) (short) -1);
        java.lang.Object obj58 = null;
        boolean boolean59 = shapeList51.equals(obj58);
        int int60 = shapeList51.size();
        java.lang.Object obj61 = null;
        boolean boolean62 = shapeList51.equals(obj61);
        java.awt.Shape shape64 = shapeList51.getShape((int) 'a');
        java.awt.Shape shape66 = shapeList51.getShape((int) '4');
        java.awt.Shape shape68 = shapeList51.getShape((int) (byte) 10);
        java.lang.Object obj69 = shapeList51.clone();
        int int70 = shapeList51.size();
        java.awt.Shape shape72 = shapeList51.getShape((int) (short) 1);
        boolean boolean73 = shapeList11.equals((java.lang.Object) (short) 1);
        java.awt.Shape shape75 = null;
        shapeList11.setShape((int) '#', shape75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape(1);
        java.awt.Shape shape9 = shapeList0.getShape((int) ' ');
        int int10 = shapeList0.size();
        int int11 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj14 = shapeList13.clone();
        shapeList13.clear();
        shapeList13.clear();
        java.lang.Object obj17 = shapeList13.clone();
        boolean boolean19 = shapeList13.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj21 = shapeList20.clone();
        java.lang.Class<?> wildcardClass22 = shapeList20.getClass();
        boolean boolean23 = shapeList13.equals((java.lang.Object) shapeList20);
        shapeList13.clear();
        shapeList13.clear();
        int int26 = shapeList13.size();
        shapeList13.clear();
        java.lang.Object obj28 = shapeList13.clone();
        boolean boolean29 = shapeList0.equals((java.lang.Object) shapeList13);
        int int30 = shapeList13.size();
        java.awt.Shape shape32 = null;
        shapeList13.setShape((int) (byte) 100, shape32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.lang.Object obj6 = shapeList0.clone();
        java.lang.Object obj7 = shapeList0.clone();
        java.lang.Object obj8 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) (short) 1);
        java.awt.Shape shape13 = shapeList9.getShape((int) (byte) 10);
        java.lang.Object obj14 = shapeList9.clone();
        boolean boolean15 = shapeList0.equals(obj14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        shapeList0.clear();
        java.awt.Shape shape9 = shapeList0.getShape((int) (short) 100);
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        shapeList10.clear();
        int int12 = shapeList10.size();
        shapeList10.clear();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj15 = shapeList14.clone();
        shapeList14.clear();
        java.awt.Shape shape18 = shapeList14.getShape((int) (short) 1);
        boolean boolean20 = shapeList14.equals((java.lang.Object) 'a');
        java.lang.Object obj21 = shapeList14.clone();
        int int22 = shapeList14.size();
        boolean boolean23 = shapeList10.equals((java.lang.Object) shapeList14);
        java.lang.Object obj24 = shapeList14.clone();
        boolean boolean25 = shapeList0.equals((java.lang.Object) shapeList14);
        java.lang.Object obj26 = null;
        boolean boolean27 = shapeList0.equals(obj26);
        org.jfree.chart.util.ShapeList shapeList28 = new org.jfree.chart.util.ShapeList();
        shapeList28.clear();
        java.lang.Object obj30 = shapeList28.clone();
        boolean boolean32 = shapeList28.equals((java.lang.Object) (-1));
        int int33 = shapeList28.size();
        java.awt.Shape shape35 = shapeList28.getShape((int) (byte) -1);
        java.awt.Shape shape37 = shapeList28.getShape((int) (short) 0);
        boolean boolean38 = shapeList0.equals((java.lang.Object) shapeList28);
        java.awt.Shape shape40 = null;
        shapeList28.setShape(101, shape40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList28", shapeList0.equals(shapeList28) ? shapeList0.hashCode() == shapeList28.hashCode() : true);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.awt.Shape shape7 = null;
        shapeList0.setShape((int) (byte) 100, shape7);
        int int9 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        shapeList10.clear();
        java.lang.Object obj12 = shapeList10.clone();
        boolean boolean14 = shapeList10.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass15 = shapeList10.getClass();
        boolean boolean16 = shapeList0.equals((java.lang.Object) shapeList10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        boolean boolean6 = shapeList0.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        java.lang.Class<?> wildcardClass9 = shapeList7.getClass();
        boolean boolean10 = shapeList0.equals((java.lang.Object) shapeList7);
        shapeList0.clear();
        java.lang.Object obj12 = shapeList0.clone();
        java.awt.Shape shape14 = null;
        shapeList0.setShape((int) '#', shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(1);
        shapeList0.clear();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        shapeList7.clear();
        java.awt.Shape shape11 = shapeList7.getShape((int) (short) 1);
        boolean boolean13 = shapeList7.equals((java.lang.Object) 'a');
        java.lang.Object obj14 = shapeList7.clone();
        boolean boolean15 = shapeList0.equals(obj14);
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj17 = shapeList16.clone();
        shapeList16.clear();
        java.awt.Shape shape20 = shapeList16.getShape((int) (short) 1);
        java.lang.Object obj21 = shapeList16.clone();
        boolean boolean22 = shapeList0.equals((java.lang.Object) shapeList16);
        int int23 = shapeList0.size();
        int int24 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        boolean boolean27 = shapeList25.equals((java.lang.Object) (short) 1);
        boolean boolean29 = shapeList25.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj30 = shapeList25.clone();
        java.awt.Shape shape32 = shapeList25.getShape((int) (short) -1);
        int int33 = shapeList25.size();
        int int34 = shapeList25.size();
        int int35 = shapeList25.size();
        boolean boolean36 = shapeList0.equals((java.lang.Object) shapeList25);
        java.awt.Shape shape38 = shapeList0.getShape((int) (short) 1);
        int int39 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape42 = null;
        shapeList0.setShape((int) (short) 100, shape42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test675");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        boolean boolean6 = shapeList0.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        shapeList7.clear();
        int int9 = shapeList7.size();
        int int10 = shapeList7.size();
        boolean boolean11 = shapeList0.equals((java.lang.Object) int10);
        java.lang.Object obj12 = shapeList0.clone();
        java.lang.Object obj13 = shapeList0.clone();
        int int14 = shapeList0.size();
        java.awt.Shape shape16 = shapeList0.getShape(53);
        java.awt.Shape shape18 = null;
        shapeList0.setShape(10, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test676");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.awt.Shape shape7 = null;
        shapeList0.setShape((int) '#', shape7);
        java.lang.Object obj9 = shapeList0.clone();
        int int10 = shapeList0.size();
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test677");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = null;
        boolean boolean8 = shapeList0.equals(obj7);
        int int9 = shapeList0.size();
        java.lang.Object obj10 = null;
        boolean boolean11 = shapeList0.equals(obj10);
        java.awt.Shape shape13 = shapeList0.getShape((int) 'a');
        java.awt.Shape shape15 = shapeList0.getShape((int) '4');
        java.awt.Shape shape17 = shapeList0.getShape((int) (byte) 10);
        java.lang.Object obj18 = shapeList0.clone();
        int int19 = shapeList0.size();
        java.awt.Shape shape21 = shapeList0.getShape((int) (short) 1);
        int int22 = shapeList0.size();
        java.awt.Shape shape24 = null;
        shapeList0.setShape(33, shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test678");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        int int4 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        shapeList6.clear();
        java.lang.Object obj8 = shapeList6.clone();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) (short) 1);
        boolean boolean13 = shapeList9.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = shapeList9.clone();
        java.awt.Shape shape16 = shapeList9.getShape((int) (short) -1);
        int int17 = shapeList9.size();
        boolean boolean18 = shapeList6.equals((java.lang.Object) int17);
        shapeList6.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList6);
        shapeList6.clear();
        java.lang.Object obj22 = shapeList6.clone();
        java.awt.Shape shape24 = shapeList6.getShape((int) 'a');
        shapeList6.clear();
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj27 = shapeList26.clone();
        shapeList26.clear();
        shapeList26.clear();
        java.awt.Shape shape31 = shapeList26.getShape((int) '#');
        java.awt.Shape shape33 = shapeList26.getShape(1);
        java.awt.Shape shape35 = shapeList26.getShape((int) ' ');
        int int36 = shapeList26.size();
        java.awt.Shape shape38 = shapeList26.getShape(100);
        boolean boolean39 = shapeList6.equals((java.lang.Object) 100);
        java.lang.Object obj40 = shapeList6.clone();
        org.jfree.chart.util.ShapeList shapeList41 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj42 = shapeList41.clone();
        shapeList41.clear();
        java.awt.Shape shape45 = shapeList41.getShape((int) (short) 1);
        boolean boolean47 = shapeList41.equals((java.lang.Object) 0);
        java.awt.Shape shape49 = shapeList41.getShape(0);
        shapeList41.clear();
        int int51 = shapeList41.size();
        boolean boolean52 = shapeList6.equals((java.lang.Object) shapeList41);
        org.jfree.chart.util.ShapeList shapeList53 = new org.jfree.chart.util.ShapeList();
        boolean boolean55 = shapeList53.equals((java.lang.Object) (short) 1);
        boolean boolean57 = shapeList53.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape59 = null;
        shapeList53.setShape(11, shape59);
        shapeList53.clear();
        boolean boolean62 = shapeList41.equals((java.lang.Object) shapeList53);
        java.awt.Shape shape64 = null;
        shapeList53.setShape(8, shape64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList53", shapeList0.equals(shapeList53) ? shapeList0.hashCode() == shapeList53.hashCode() : true);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test679");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 0, shape6);
        java.awt.Shape shape9 = null;
        shapeList0.setShape((int) (byte) 10, shape9);
        boolean boolean12 = shapeList0.equals((java.lang.Object) (-1));
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj15 = shapeList14.clone();
        java.lang.Object obj16 = shapeList14.clone();
        java.awt.Shape shape18 = shapeList14.getShape(1);
        int int19 = shapeList14.size();
        shapeList14.clear();
        int int21 = shapeList14.size();
        java.lang.Object obj22 = shapeList14.clone();
        boolean boolean23 = shapeList0.equals((java.lang.Object) shapeList14);
        java.awt.Shape shape25 = null;
        shapeList0.setShape(1, shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test680");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) ' ', shape4);
        java.lang.Object obj6 = shapeList0.clone();
        java.awt.Shape shape8 = shapeList0.getShape(9);
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) (short) 100, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test681");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        java.lang.Object obj5 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj9 = shapeList8.clone();
        shapeList8.clear();
        java.lang.Object obj11 = shapeList8.clone();
        int int12 = shapeList8.size();
        java.lang.Object obj13 = shapeList8.clone();
        shapeList8.clear();
        shapeList8.clear();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj17 = shapeList16.clone();
        shapeList16.clear();
        shapeList16.clear();
        java.awt.Shape shape21 = shapeList16.getShape((int) '#');
        java.awt.Shape shape23 = shapeList16.getShape(1);
        java.awt.Shape shape25 = shapeList16.getShape((int) (byte) 0);
        boolean boolean26 = shapeList8.equals((java.lang.Object) shapeList16);
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj28 = shapeList27.clone();
        java.lang.Object obj29 = shapeList27.clone();
        boolean boolean30 = shapeList8.equals((java.lang.Object) shapeList27);
        boolean boolean31 = shapeList0.equals((java.lang.Object) boolean30);
        int int32 = shapeList0.size();
        java.awt.Shape shape34 = shapeList0.getShape((int) '4');
        java.lang.Object obj35 = shapeList0.clone();
        java.lang.Object obj36 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList37 = new org.jfree.chart.util.ShapeList();
        int int38 = shapeList37.size();
        shapeList37.clear();
        java.lang.Object obj40 = shapeList37.clone();
        java.awt.Shape shape42 = shapeList37.getShape((int) (short) -1);
        shapeList37.clear();
        org.jfree.chart.util.ShapeList shapeList44 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj45 = shapeList44.clone();
        shapeList44.clear();
        java.awt.Shape shape48 = shapeList44.getShape((int) (short) 1);
        boolean boolean50 = shapeList44.equals((java.lang.Object) (short) -1);
        java.lang.Object obj51 = null;
        boolean boolean52 = shapeList44.equals(obj51);
        int int53 = shapeList44.size();
        java.lang.Object obj54 = null;
        boolean boolean55 = shapeList44.equals(obj54);
        java.awt.Shape shape57 = shapeList44.getShape((int) 'a');
        boolean boolean58 = shapeList37.equals((java.lang.Object) 'a');
        int int59 = shapeList37.size();
        boolean boolean60 = shapeList0.equals((java.lang.Object) int59);
        int int61 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList62 = new org.jfree.chart.util.ShapeList();
        int int63 = shapeList62.size();
        shapeList62.clear();
        java.awt.Shape shape66 = null;
        shapeList62.setShape((int) (short) 100, shape66);
        java.lang.Object obj68 = shapeList62.clone();
        java.lang.Object obj69 = shapeList62.clone();
        boolean boolean70 = shapeList0.equals((java.lang.Object) shapeList62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList62", shapeList0.equals(shapeList62) ? shapeList0.hashCode() == shapeList62.hashCode() : true);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test682");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 0, shape6);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj10 = shapeList9.clone();
        shapeList9.clear();
        java.awt.Shape shape13 = shapeList9.getShape((int) (short) 1);
        java.lang.Object obj14 = shapeList9.clone();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj16 = shapeList15.clone();
        shapeList15.clear();
        java.awt.Shape shape19 = shapeList15.getShape((int) (short) 1);
        boolean boolean21 = shapeList15.equals((java.lang.Object) (short) -1);
        java.lang.Object obj22 = null;
        boolean boolean23 = shapeList15.equals(obj22);
        int int24 = shapeList15.size();
        boolean boolean25 = shapeList9.equals((java.lang.Object) shapeList15);
        java.awt.Shape shape27 = shapeList9.getShape(100);
        boolean boolean29 = shapeList9.equals((java.lang.Object) false);
        java.awt.Shape shape31 = shapeList9.getShape(9);
        java.awt.Shape shape33 = shapeList9.getShape(100);
        shapeList9.clear();
        org.jfree.chart.util.ShapeList shapeList35 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj36 = shapeList35.clone();
        shapeList35.clear();
        java.awt.Shape shape39 = shapeList35.getShape((int) (short) 1);
        java.lang.Object obj40 = shapeList35.clone();
        java.awt.Shape shape42 = shapeList35.getShape((int) (short) 100);
        java.lang.Object obj43 = shapeList35.clone();
        boolean boolean44 = shapeList9.equals((java.lang.Object) shapeList35);
        boolean boolean45 = shapeList0.equals((java.lang.Object) shapeList35);
        java.awt.Shape shape47 = null;
        shapeList0.setShape((int) (short) 100, shape47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test683");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape(1);
        java.awt.Shape shape9 = shapeList0.getShape((int) ' ');
        int int10 = shapeList0.size();
        int int11 = shapeList0.size();
        java.awt.Shape shape13 = null;
        shapeList0.setShape(11, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test684");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        shapeList3.clear();
        java.lang.Object obj5 = shapeList3.clone();
        shapeList3.clear();
        java.lang.Object obj7 = shapeList3.clone();
        boolean boolean8 = shapeList0.equals((java.lang.Object) shapeList3);
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) (byte) 0, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test685");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj5 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj7 = shapeList6.clone();
        shapeList6.clear();
        java.awt.Shape shape10 = shapeList6.getShape((int) (short) 1);
        boolean boolean12 = shapeList6.equals((java.lang.Object) (short) -1);
        java.lang.Object obj13 = null;
        boolean boolean14 = shapeList6.equals(obj13);
        int int15 = shapeList6.size();
        boolean boolean16 = shapeList0.equals((java.lang.Object) shapeList6);
        java.awt.Shape shape18 = null;
        shapeList6.setShape(36, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test686");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj4 = shapeList3.clone();
        shapeList3.clear();
        java.awt.Shape shape7 = shapeList3.getShape((int) (short) 1);
        shapeList3.clear();
        shapeList3.clear();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj11 = shapeList10.clone();
        shapeList10.clear();
        java.awt.Shape shape14 = shapeList10.getShape((int) (short) 1);
        boolean boolean16 = shapeList10.equals((java.lang.Object) (short) -1);
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj18 = shapeList17.clone();
        shapeList17.clear();
        java.awt.Shape shape21 = shapeList17.getShape((int) (short) 1);
        boolean boolean23 = shapeList17.equals((java.lang.Object) 0);
        shapeList17.clear();
        boolean boolean25 = shapeList10.equals((java.lang.Object) shapeList17);
        boolean boolean26 = shapeList3.equals((java.lang.Object) boolean25);
        boolean boolean27 = shapeList0.equals((java.lang.Object) boolean25);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape31 = null;
        shapeList29.setShape(8, shape31);
        int int33 = shapeList29.size();
        shapeList29.clear();
        shapeList29.clear();
        boolean boolean36 = shapeList0.equals((java.lang.Object) shapeList29);
        org.jfree.chart.util.ShapeList shapeList37 = new org.jfree.chart.util.ShapeList();
        boolean boolean39 = shapeList37.equals((java.lang.Object) (short) 1);
        boolean boolean41 = shapeList37.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape43 = null;
        shapeList37.setShape((int) (byte) 0, shape43);
        java.awt.Shape shape46 = null;
        shapeList37.setShape((int) (byte) 10, shape46);
        boolean boolean49 = shapeList37.equals((java.lang.Object) (-1));
        java.awt.Shape shape51 = null;
        shapeList37.setShape(8, shape51);
        int int53 = shapeList37.size();
        shapeList37.clear();
        java.awt.Shape shape56 = null;
        shapeList37.setShape(100, shape56);
        boolean boolean58 = shapeList29.equals((java.lang.Object) shape56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList37", shapeList0.equals(shapeList37) ? shapeList0.hashCode() == shapeList37.hashCode() : true);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test687");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1));
        int int5 = shapeList0.size();
        java.awt.Shape shape7 = shapeList0.getShape((int) (byte) -1);
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj9 = shapeList8.clone();
        shapeList8.clear();
        java.awt.Shape shape12 = shapeList8.getShape((int) (short) 1);
        boolean boolean14 = shapeList8.equals((java.lang.Object) (short) -1);
        java.lang.Object obj15 = null;
        boolean boolean16 = shapeList8.equals(obj15);
        int int17 = shapeList8.size();
        java.lang.Object obj18 = null;
        boolean boolean19 = shapeList8.equals(obj18);
        java.awt.Shape shape21 = shapeList8.getShape((int) 'a');
        java.awt.Shape shape23 = shapeList8.getShape((int) (byte) 0);
        boolean boolean24 = shapeList0.equals((java.lang.Object) shapeList8);
        java.awt.Shape shape26 = shapeList8.getShape(33);
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape29 = null;
        shapeList27.setShape(8, shape29);
        java.awt.Shape shape32 = shapeList27.getShape((int) (byte) 100);
        java.awt.Shape shape34 = shapeList27.getShape((int) (byte) 100);
        java.awt.Shape shape36 = null;
        shapeList27.setShape(10, shape36);
        shapeList27.clear();
        boolean boolean39 = shapeList8.equals((java.lang.Object) shapeList27);
        int int40 = shapeList8.size();
        java.awt.Shape shape42 = shapeList8.getShape((int) (byte) 0);
        java.awt.Shape shape44 = null;
        shapeList8.setShape((int) '4', shape44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test688");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 0, shape6);
        java.awt.Shape shape9 = null;
        shapeList0.setShape((int) (byte) 10, shape9);
        boolean boolean12 = shapeList0.equals((java.lang.Object) (-1));
        java.awt.Shape shape14 = null;
        shapeList0.setShape(8, shape14);
        int int16 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape19 = null;
        shapeList0.setShape(100, shape19);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        boolean boolean24 = shapeList22.equals((java.lang.Object) (short) 1);
        boolean boolean26 = shapeList22.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape28 = null;
        shapeList22.setShape((int) (byte) 0, shape28);
        java.awt.Shape shape31 = null;
        shapeList22.setShape((int) (byte) 10, shape31);
        boolean boolean34 = shapeList22.equals((java.lang.Object) (-1));
        java.awt.Shape shape36 = null;
        shapeList22.setShape(8, shape36);
        java.lang.Class<?> wildcardClass38 = shapeList22.getClass();
        boolean boolean39 = shapeList0.equals((java.lang.Object) wildcardClass38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList22", shapeList0.equals(shapeList22) ? shapeList0.hashCode() == shapeList22.hashCode() : true);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test689");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        java.lang.Object obj5 = shapeList0.clone();
        int int6 = shapeList0.size();
        int int7 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj9 = shapeList8.clone();
        shapeList8.clear();
        shapeList8.clear();
        java.awt.Shape shape13 = shapeList8.getShape((int) '#');
        shapeList8.clear();
        shapeList8.clear();
        java.awt.Shape shape17 = shapeList8.getShape(11);
        boolean boolean18 = shapeList0.equals((java.lang.Object) shapeList8);
        java.lang.Object obj19 = shapeList8.clone();
        shapeList8.clear();
        java.awt.Shape shape22 = null;
        shapeList8.setShape((int) (short) 100, shape22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test690");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        boolean boolean5 = shapeList3.equals((java.lang.Object) (short) 1);
        boolean boolean7 = shapeList3.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = shapeList3.clone();
        java.awt.Shape shape10 = shapeList3.getShape((int) (short) -1);
        int int11 = shapeList3.size();
        boolean boolean12 = shapeList0.equals((java.lang.Object) int11);
        int int13 = shapeList0.size();
        java.awt.Shape shape15 = shapeList0.getShape(0);
        shapeList0.clear();
        int int17 = shapeList0.size();
        java.awt.Shape shape19 = null;
        shapeList0.setShape(10, shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test691");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) -1);
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        int int10 = shapeList0.size();
        java.awt.Shape shape12 = shapeList0.getShape((int) '#');
        int int13 = shapeList0.size();
        java.lang.Object obj14 = shapeList0.clone();
        java.awt.Shape shape16 = null;
        shapeList0.setShape(101, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test692");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        int int2 = shapeList0.size();
        int int3 = shapeList0.size();
        int int4 = shapeList0.size();
        java.awt.Shape shape6 = shapeList0.getShape((int) (short) 1);
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) '4', shape8);
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        boolean boolean12 = shapeList10.equals((java.lang.Object) (short) 1);
        boolean boolean14 = shapeList10.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj16 = shapeList15.clone();
        shapeList15.clear();
        java.awt.Shape shape19 = shapeList15.getShape((int) (short) 1);
        boolean boolean21 = shapeList15.equals((java.lang.Object) (short) -1);
        shapeList15.clear();
        shapeList15.clear();
        java.awt.Shape shape25 = shapeList15.getShape((int) (short) 0);
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj27 = shapeList26.clone();
        shapeList26.clear();
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        int int30 = shapeList29.size();
        int int31 = shapeList29.size();
        java.lang.Object obj32 = shapeList29.clone();
        boolean boolean33 = shapeList26.equals(obj32);
        boolean boolean34 = shapeList15.equals((java.lang.Object) shapeList26);
        boolean boolean35 = shapeList10.equals((java.lang.Object) shapeList26);
        java.awt.Shape shape37 = shapeList26.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList38 = new org.jfree.chart.util.ShapeList();
        shapeList38.clear();
        int int40 = shapeList38.size();
        shapeList38.clear();
        org.jfree.chart.util.ShapeList shapeList42 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj43 = shapeList42.clone();
        shapeList42.clear();
        java.awt.Shape shape46 = shapeList42.getShape((int) (short) 1);
        boolean boolean48 = shapeList42.equals((java.lang.Object) 'a');
        java.lang.Object obj49 = shapeList42.clone();
        int int50 = shapeList42.size();
        boolean boolean51 = shapeList38.equals((java.lang.Object) shapeList42);
        java.lang.Object obj52 = shapeList42.clone();
        java.lang.Class<?> wildcardClass53 = obj52.getClass();
        boolean boolean54 = shapeList26.equals((java.lang.Object) wildcardClass53);
        java.lang.Object obj55 = shapeList26.clone();
        org.jfree.chart.util.ShapeList shapeList56 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj57 = shapeList56.clone();
        java.lang.Object obj58 = shapeList56.clone();
        java.awt.Shape shape60 = shapeList56.getShape(1);
        int int61 = shapeList56.size();
        shapeList56.clear();
        java.lang.Class<?> wildcardClass63 = shapeList56.getClass();
        boolean boolean64 = shapeList26.equals((java.lang.Object) wildcardClass63);
        java.lang.Object obj65 = shapeList26.clone();
        boolean boolean66 = shapeList0.equals((java.lang.Object) shapeList26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test693");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = null;
        shapeList0.setShape((int) ' ', shape5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test694");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 0);
        int int7 = shapeList0.size();
        int int8 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        shapeList9.clear();
        java.awt.Shape shape12 = shapeList9.getShape(10);
        boolean boolean13 = shapeList0.equals((java.lang.Object) shapeList9);
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj15 = shapeList14.clone();
        java.lang.Object obj16 = shapeList14.clone();
        java.awt.Shape shape18 = shapeList14.getShape(1);
        shapeList14.clear();
        shapeList14.clear();
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj22 = shapeList21.clone();
        shapeList21.clear();
        java.awt.Shape shape25 = shapeList21.getShape((int) (short) 1);
        boolean boolean27 = shapeList21.equals((java.lang.Object) 'a');
        java.lang.Object obj28 = shapeList21.clone();
        boolean boolean29 = shapeList14.equals(obj28);
        boolean boolean30 = shapeList0.equals((java.lang.Object) shapeList14);
        shapeList14.clear();
        java.awt.Shape shape33 = null;
        shapeList14.setShape((int) '#', shape33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test695");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        int int4 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        shapeList6.clear();
        java.lang.Object obj8 = shapeList6.clone();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) (short) 1);
        boolean boolean13 = shapeList9.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = shapeList9.clone();
        java.awt.Shape shape16 = shapeList9.getShape((int) (short) -1);
        int int17 = shapeList9.size();
        boolean boolean18 = shapeList6.equals((java.lang.Object) int17);
        shapeList6.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList6);
        java.lang.Object obj21 = shapeList6.clone();
        int int22 = shapeList6.size();
        int int23 = shapeList6.size();
        java.awt.Shape shape25 = null;
        shapeList6.setShape(11, shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test696");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) -1);
        int int8 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) (short) 1);
        boolean boolean13 = shapeList9.equals((java.lang.Object) 1.0d);
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj15 = shapeList14.clone();
        shapeList14.clear();
        java.awt.Shape shape18 = shapeList14.getShape((int) (short) 1);
        boolean boolean20 = shapeList14.equals((java.lang.Object) 0);
        java.lang.Object obj21 = shapeList14.clone();
        boolean boolean23 = shapeList14.equals((java.lang.Object) false);
        java.lang.Object obj24 = shapeList14.clone();
        boolean boolean25 = shapeList9.equals((java.lang.Object) shapeList14);
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj27 = shapeList26.clone();
        java.lang.Object obj28 = shapeList26.clone();
        java.awt.Shape shape30 = shapeList26.getShape(1);
        shapeList26.clear();
        shapeList26.clear();
        org.jfree.chart.util.ShapeList shapeList33 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj34 = shapeList33.clone();
        shapeList33.clear();
        java.awt.Shape shape37 = shapeList33.getShape((int) (short) 1);
        boolean boolean39 = shapeList33.equals((java.lang.Object) (short) -1);
        shapeList33.clear();
        shapeList33.clear();
        java.awt.Shape shape43 = shapeList33.getShape((int) (short) 0);
        org.jfree.chart.util.ShapeList shapeList44 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj45 = shapeList44.clone();
        shapeList44.clear();
        org.jfree.chart.util.ShapeList shapeList47 = new org.jfree.chart.util.ShapeList();
        int int48 = shapeList47.size();
        int int49 = shapeList47.size();
        java.lang.Object obj50 = shapeList47.clone();
        boolean boolean51 = shapeList44.equals(obj50);
        boolean boolean52 = shapeList33.equals((java.lang.Object) shapeList44);
        java.lang.Object obj53 = shapeList44.clone();
        boolean boolean54 = shapeList26.equals(obj53);
        java.awt.Shape shape56 = shapeList26.getShape((int) 'a');
        boolean boolean57 = shapeList9.equals((java.lang.Object) 'a');
        org.jfree.chart.util.ShapeList shapeList58 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj59 = shapeList58.clone();
        shapeList58.clear();
        java.awt.Shape shape62 = shapeList58.getShape((int) (short) 1);
        boolean boolean64 = shapeList58.equals((java.lang.Object) 'a');
        java.lang.Object obj65 = shapeList58.clone();
        java.lang.Object obj66 = shapeList58.clone();
        boolean boolean67 = shapeList9.equals(obj66);
        boolean boolean68 = shapeList0.equals((java.lang.Object) shapeList9);
        java.awt.Shape shape70 = null;
        shapeList0.setShape(2, shape70);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test697");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        int int4 = shapeList0.size();
        shapeList0.clear();
        int int6 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        shapeList7.clear();
        java.awt.Shape shape11 = shapeList7.getShape((int) (short) 1);
        java.lang.Object obj12 = shapeList7.clone();
        java.lang.Object obj13 = shapeList7.clone();
        boolean boolean14 = shapeList0.equals((java.lang.Object) shapeList7);
        shapeList0.clear();
        shapeList0.clear();
        int int17 = shapeList0.size();
        java.awt.Shape shape19 = null;
        shapeList0.setShape(33, shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test698");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) ' ', shape4);
        java.lang.Object obj6 = shapeList0.clone();
        java.lang.Object obj7 = shapeList0.clone();
        java.awt.Shape shape9 = shapeList0.getShape(33);
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) '#', shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test699");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        int int2 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj5 = shapeList4.clone();
        shapeList4.clear();
        java.awt.Shape shape8 = shapeList4.getShape((int) (short) 1);
        boolean boolean10 = shapeList4.equals((java.lang.Object) 'a');
        java.lang.Object obj11 = shapeList4.clone();
        int int12 = shapeList4.size();
        boolean boolean13 = shapeList0.equals((java.lang.Object) shapeList4);
        java.lang.Object obj14 = shapeList4.clone();
        java.awt.Shape shape16 = shapeList4.getShape(9);
        shapeList4.clear();
        java.awt.Shape shape19 = null;
        shapeList4.setShape((int) (short) 1, shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test700");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.lang.Object obj6 = shapeList0.clone();
        java.lang.Object obj7 = shapeList0.clone();
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        java.lang.Object obj10 = shapeList0.clone();
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test701");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) -1);
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        java.awt.Shape shape11 = shapeList0.getShape((int) '4');
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj13 = shapeList12.clone();
        shapeList12.clear();
        java.awt.Shape shape16 = shapeList12.getShape((int) (short) 1);
        java.lang.Object obj17 = shapeList12.clone();
        java.awt.Shape shape19 = shapeList12.getShape((int) (short) 100);
        java.lang.Object obj20 = shapeList12.clone();
        java.lang.Object obj21 = shapeList12.clone();
        boolean boolean22 = shapeList0.equals(obj21);
        java.lang.Object obj23 = null;
        boolean boolean24 = shapeList0.equals(obj23);
        java.awt.Shape shape26 = null;
        shapeList0.setShape(34, shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test702");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        int int4 = shapeList0.size();
        shapeList0.clear();
        int int6 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        shapeList7.clear();
        java.awt.Shape shape11 = shapeList7.getShape((int) (short) 1);
        java.lang.Object obj12 = shapeList7.clone();
        java.lang.Object obj13 = shapeList7.clone();
        boolean boolean14 = shapeList0.equals((java.lang.Object) shapeList7);
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape17 = null;
        shapeList15.setShape(8, shape17);
        int int19 = shapeList15.size();
        shapeList15.clear();
        int int21 = shapeList15.size();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj23 = shapeList22.clone();
        shapeList22.clear();
        java.awt.Shape shape26 = shapeList22.getShape((int) (short) 1);
        java.lang.Object obj27 = shapeList22.clone();
        java.lang.Object obj28 = shapeList22.clone();
        boolean boolean29 = shapeList15.equals((java.lang.Object) shapeList22);
        java.awt.Shape shape31 = shapeList15.getShape((int) (short) 10);
        boolean boolean32 = shapeList7.equals((java.lang.Object) shapeList15);
        shapeList7.clear();
        java.awt.Shape shape35 = null;
        shapeList7.setShape((int) (short) 0, shape35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test703");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 'a');
        java.lang.Object obj7 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj9 = shapeList8.clone();
        java.lang.Object obj10 = shapeList8.clone();
        java.awt.Shape shape12 = shapeList8.getShape(1);
        shapeList8.clear();
        shapeList8.clear();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj16 = shapeList15.clone();
        shapeList15.clear();
        java.awt.Shape shape19 = shapeList15.getShape((int) (short) 1);
        boolean boolean21 = shapeList15.equals((java.lang.Object) 'a');
        java.lang.Object obj22 = shapeList15.clone();
        boolean boolean23 = shapeList8.equals(obj22);
        boolean boolean24 = shapeList0.equals((java.lang.Object) shapeList8);
        shapeList0.clear();
        java.lang.Object obj26 = shapeList0.clone();
        java.awt.Shape shape28 = null;
        shapeList0.setShape(11, shape28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test704");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = null;
        boolean boolean8 = shapeList0.equals(obj7);
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) (short) 1);
        boolean boolean13 = shapeList9.equals((java.lang.Object) 1.0d);
        java.lang.Object obj14 = shapeList9.clone();
        boolean boolean15 = shapeList0.equals(obj14);
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj17 = shapeList16.clone();
        shapeList16.clear();
        java.awt.Shape shape20 = shapeList16.getShape((int) (short) 1);
        java.lang.Object obj21 = shapeList16.clone();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj23 = shapeList22.clone();
        shapeList22.clear();
        java.awt.Shape shape26 = shapeList22.getShape((int) (short) 1);
        boolean boolean28 = shapeList22.equals((java.lang.Object) (short) -1);
        java.lang.Object obj29 = null;
        boolean boolean30 = shapeList22.equals(obj29);
        int int31 = shapeList22.size();
        boolean boolean32 = shapeList16.equals((java.lang.Object) shapeList22);
        boolean boolean33 = shapeList0.equals((java.lang.Object) shapeList22);
        org.jfree.chart.util.ShapeList shapeList34 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj35 = shapeList34.clone();
        shapeList34.clear();
        boolean boolean37 = shapeList0.equals((java.lang.Object) shapeList34);
        java.lang.Object obj38 = shapeList34.clone();
        shapeList34.clear();
        java.awt.Shape shape41 = null;
        shapeList34.setShape((int) '#', shape41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList34", shapeList0.equals(shapeList34) ? shapeList0.hashCode() == shapeList34.hashCode() : true);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test705");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        boolean boolean5 = shapeList3.equals((java.lang.Object) (short) 1);
        boolean boolean7 = shapeList3.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = shapeList3.clone();
        java.awt.Shape shape10 = shapeList3.getShape((int) (short) -1);
        int int11 = shapeList3.size();
        boolean boolean12 = shapeList0.equals((java.lang.Object) int11);
        java.awt.Shape shape14 = shapeList0.getShape(9);
        int int15 = shapeList0.size();
        java.lang.Object obj16 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        boolean boolean18 = shapeList0.equals((java.lang.Object) shapeList17);
        java.awt.Shape shape20 = shapeList17.getShape(0);
        java.lang.Object obj21 = null;
        boolean boolean22 = shapeList17.equals(obj21);
        java.lang.Object obj23 = shapeList17.clone();
        shapeList17.clear();
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        int int26 = shapeList25.size();
        int int27 = shapeList25.size();
        java.awt.Shape shape29 = null;
        shapeList25.setShape((int) ' ', shape29);
        shapeList25.clear();
        int int32 = shapeList25.size();
        int int33 = shapeList25.size();
        java.lang.Object obj34 = shapeList25.clone();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        boolean boolean36 = shapeList17.equals(obj34);
        java.awt.Shape shape38 = null;
        shapeList17.setShape(36, shape38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList17", shapeList0.equals(shapeList17) ? shapeList0.hashCode() == shapeList17.hashCode() : true);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test706");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj6 = shapeList5.clone();
        shapeList5.clear();
        java.awt.Shape shape9 = shapeList5.getShape((int) (short) 1);
        boolean boolean11 = shapeList5.equals((java.lang.Object) (short) -1);
        shapeList5.clear();
        shapeList5.clear();
        java.awt.Shape shape15 = shapeList5.getShape((int) (short) 0);
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj17 = shapeList16.clone();
        shapeList16.clear();
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        int int20 = shapeList19.size();
        int int21 = shapeList19.size();
        java.lang.Object obj22 = shapeList19.clone();
        boolean boolean23 = shapeList16.equals(obj22);
        boolean boolean24 = shapeList5.equals((java.lang.Object) shapeList16);
        boolean boolean25 = shapeList0.equals((java.lang.Object) shapeList16);
        java.awt.Shape shape27 = shapeList16.getShape(8);
        org.jfree.chart.util.ShapeList shapeList28 = new org.jfree.chart.util.ShapeList();
        shapeList28.clear();
        int int30 = shapeList28.size();
        java.awt.Shape shape32 = null;
        shapeList28.setShape((int) '#', shape32);
        boolean boolean34 = shapeList16.equals((java.lang.Object) shape32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList28", shapeList0.equals(shapeList28) ? shapeList0.hashCode() == shapeList28.hashCode() : true);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test707");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        int int2 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj5 = shapeList4.clone();
        shapeList4.clear();
        shapeList4.clear();
        java.lang.Object obj8 = shapeList4.clone();
        java.lang.Object obj9 = null;
        boolean boolean10 = shapeList4.equals(obj9);
        boolean boolean12 = shapeList4.equals((java.lang.Object) 0.0f);
        int int13 = shapeList4.size();
        java.lang.Object obj14 = shapeList4.clone();
        boolean boolean15 = shapeList0.equals(obj14);
        java.lang.Object obj16 = shapeList0.clone();
        java.awt.Shape shape18 = shapeList0.getShape(8);
        java.awt.Shape shape20 = null;
        shapeList0.setShape(11, shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test708");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 'a');
        java.lang.Object obj7 = shapeList0.clone();
        int int8 = shapeList0.size();
        java.lang.Object obj9 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        shapeList10.clear();
        int int12 = shapeList10.size();
        shapeList10.clear();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj15 = shapeList14.clone();
        shapeList14.clear();
        java.awt.Shape shape18 = shapeList14.getShape((int) (short) 1);
        boolean boolean20 = shapeList14.equals((java.lang.Object) 'a');
        java.lang.Object obj21 = shapeList14.clone();
        int int22 = shapeList14.size();
        boolean boolean23 = shapeList10.equals((java.lang.Object) shapeList14);
        java.lang.Object obj24 = shapeList14.clone();
        boolean boolean25 = shapeList0.equals(obj24);
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj27 = shapeList26.clone();
        shapeList26.clear();
        java.awt.Shape shape30 = shapeList26.getShape((int) (short) 1);
        boolean boolean32 = shapeList26.equals((java.lang.Object) 'a');
        java.lang.Object obj33 = shapeList26.clone();
        int int34 = shapeList26.size();
        java.awt.Shape shape36 = shapeList26.getShape(101);
        org.jfree.chart.util.ShapeList shapeList37 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj38 = shapeList37.clone();
        shapeList37.clear();
        java.awt.Shape shape41 = shapeList37.getShape((int) (short) 1);
        boolean boolean43 = shapeList37.equals((java.lang.Object) (short) -1);
        shapeList37.clear();
        java.awt.Shape shape46 = shapeList37.getShape((int) (short) 100);
        org.jfree.chart.util.ShapeList shapeList47 = new org.jfree.chart.util.ShapeList();
        shapeList47.clear();
        int int49 = shapeList47.size();
        shapeList47.clear();
        org.jfree.chart.util.ShapeList shapeList51 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj52 = shapeList51.clone();
        shapeList51.clear();
        java.awt.Shape shape55 = shapeList51.getShape((int) (short) 1);
        boolean boolean57 = shapeList51.equals((java.lang.Object) 'a');
        java.lang.Object obj58 = shapeList51.clone();
        int int59 = shapeList51.size();
        boolean boolean60 = shapeList47.equals((java.lang.Object) shapeList51);
        java.lang.Object obj61 = shapeList51.clone();
        boolean boolean62 = shapeList37.equals((java.lang.Object) shapeList51);
        boolean boolean63 = shapeList26.equals((java.lang.Object) shapeList37);
        org.jfree.chart.util.ShapeList shapeList64 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj65 = shapeList64.clone();
        shapeList64.clear();
        java.awt.Shape shape68 = shapeList64.getShape((int) (short) 1);
        shapeList64.clear();
        shapeList64.clear();
        org.jfree.chart.util.ShapeList shapeList71 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj72 = shapeList71.clone();
        shapeList71.clear();
        java.awt.Shape shape75 = shapeList71.getShape((int) (short) 1);
        boolean boolean77 = shapeList71.equals((java.lang.Object) (short) -1);
        org.jfree.chart.util.ShapeList shapeList78 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj79 = shapeList78.clone();
        shapeList78.clear();
        java.awt.Shape shape82 = shapeList78.getShape((int) (short) 1);
        boolean boolean84 = shapeList78.equals((java.lang.Object) 0);
        shapeList78.clear();
        boolean boolean86 = shapeList71.equals((java.lang.Object) shapeList78);
        boolean boolean87 = shapeList64.equals((java.lang.Object) boolean86);
        java.lang.Object obj88 = shapeList64.clone();
        boolean boolean89 = shapeList26.equals(obj88);
        java.awt.Shape shape91 = shapeList26.getShape(33);
        boolean boolean92 = shapeList0.equals((java.lang.Object) shapeList26);
        java.awt.Shape shape94 = null;
        shapeList26.setShape(36, shape94);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList26", shapeList0.equals(shapeList26) ? shapeList0.hashCode() == shapeList26.hashCode() : true);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test709");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        int int4 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        shapeList6.clear();
        java.lang.Object obj8 = shapeList6.clone();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) (short) 1);
        boolean boolean13 = shapeList9.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = shapeList9.clone();
        java.awt.Shape shape16 = shapeList9.getShape((int) (short) -1);
        int int17 = shapeList9.size();
        boolean boolean18 = shapeList6.equals((java.lang.Object) int17);
        shapeList6.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList6);
        shapeList6.clear();
        java.lang.Object obj22 = shapeList6.clone();
        java.awt.Shape shape24 = null;
        shapeList6.setShape(33, shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test710");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        java.awt.Shape shape5 = shapeList0.getShape((int) (short) -1);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        shapeList7.clear();
        java.awt.Shape shape11 = shapeList7.getShape((int) (short) 1);
        boolean boolean13 = shapeList7.equals((java.lang.Object) (short) -1);
        java.lang.Object obj14 = null;
        boolean boolean15 = shapeList7.equals(obj14);
        int int16 = shapeList7.size();
        java.lang.Object obj17 = null;
        boolean boolean18 = shapeList7.equals(obj17);
        java.awt.Shape shape20 = shapeList7.getShape((int) 'a');
        boolean boolean21 = shapeList0.equals((java.lang.Object) 'a');
        java.awt.Shape shape23 = shapeList0.getShape((int) (short) 0);
        int int24 = shapeList0.size();
        java.awt.Shape shape26 = null;
        shapeList0.setShape((int) (byte) 10, shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj3", shapeList0.equals(obj3) ? shapeList0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test711");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = null;
        boolean boolean8 = shapeList0.equals(obj7);
        int int9 = shapeList0.size();
        java.lang.Object obj10 = null;
        boolean boolean11 = shapeList0.equals(obj10);
        java.awt.Shape shape13 = shapeList0.getShape((int) 'a');
        java.awt.Shape shape15 = shapeList0.getShape((int) '4');
        java.awt.Shape shape17 = shapeList0.getShape((int) '#');
        java.awt.Shape shape19 = shapeList0.getShape((int) (byte) -1);
        java.awt.Shape shape21 = null;
        shapeList0.setShape((int) 'a', shape21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test712");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        shapeList0.clear();
        java.awt.Shape shape9 = shapeList0.getShape((int) (short) 100);
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        shapeList10.clear();
        int int12 = shapeList10.size();
        shapeList10.clear();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj15 = shapeList14.clone();
        shapeList14.clear();
        java.awt.Shape shape18 = shapeList14.getShape((int) (short) 1);
        boolean boolean20 = shapeList14.equals((java.lang.Object) 'a');
        java.lang.Object obj21 = shapeList14.clone();
        int int22 = shapeList14.size();
        boolean boolean23 = shapeList10.equals((java.lang.Object) shapeList14);
        java.lang.Object obj24 = shapeList14.clone();
        boolean boolean25 = shapeList0.equals((java.lang.Object) shapeList14);
        java.awt.Shape shape27 = shapeList14.getShape(101);
        org.jfree.chart.util.ShapeList shapeList28 = new org.jfree.chart.util.ShapeList();
        boolean boolean30 = shapeList28.equals((java.lang.Object) (short) 1);
        boolean boolean32 = shapeList28.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape34 = null;
        shapeList28.setShape((int) (byte) 0, shape34);
        int int36 = shapeList28.size();
        shapeList28.clear();
        java.awt.Shape shape39 = null;
        shapeList28.setShape((int) ' ', shape39);
        java.lang.Object obj41 = shapeList28.clone();
        java.awt.Shape shape43 = shapeList28.getShape((int) ' ');
        boolean boolean44 = shapeList14.equals((java.lang.Object) shapeList28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList28", shapeList0.equals(shapeList28) ? shapeList0.hashCode() == shapeList28.hashCode() : true);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test713");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        int int4 = shapeList0.size();
        shapeList0.clear();
        int int6 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        shapeList7.clear();
        java.awt.Shape shape11 = shapeList7.getShape((int) (short) 1);
        java.lang.Object obj12 = shapeList7.clone();
        java.lang.Object obj13 = shapeList7.clone();
        boolean boolean14 = shapeList0.equals((java.lang.Object) shapeList7);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        shapeList16.clear();
        java.lang.Object obj18 = shapeList16.clone();
        boolean boolean20 = shapeList16.equals((java.lang.Object) (-1));
        int int21 = shapeList16.size();
        java.awt.Shape shape23 = shapeList16.getShape((int) (byte) -1);
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj25 = shapeList24.clone();
        shapeList24.clear();
        java.awt.Shape shape28 = shapeList24.getShape((int) (short) 1);
        boolean boolean30 = shapeList24.equals((java.lang.Object) (short) -1);
        java.lang.Object obj31 = null;
        boolean boolean32 = shapeList24.equals(obj31);
        int int33 = shapeList24.size();
        java.lang.Object obj34 = null;
        boolean boolean35 = shapeList24.equals(obj34);
        java.awt.Shape shape37 = shapeList24.getShape((int) 'a');
        java.awt.Shape shape39 = shapeList24.getShape((int) (byte) 0);
        boolean boolean40 = shapeList16.equals((java.lang.Object) shapeList24);
        java.awt.Shape shape42 = shapeList24.getShape(33);
        org.jfree.chart.util.ShapeList shapeList43 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape45 = null;
        shapeList43.setShape(8, shape45);
        java.awt.Shape shape48 = shapeList43.getShape((int) (byte) 100);
        java.awt.Shape shape50 = shapeList43.getShape((int) (byte) 100);
        java.awt.Shape shape52 = null;
        shapeList43.setShape(10, shape52);
        shapeList43.clear();
        boolean boolean55 = shapeList24.equals((java.lang.Object) shapeList43);
        java.lang.Object obj56 = shapeList43.clone();
        boolean boolean57 = shapeList0.equals(obj56);
        shapeList0.clear();
        java.awt.Shape shape60 = null;
        shapeList0.setShape(33, shape60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test714");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.lang.Object obj6 = shapeList0.clone();
        java.lang.Object obj7 = shapeList0.clone();
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape(0);
        java.awt.Shape shape12 = null;
        shapeList0.setShape(0, shape12);
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        boolean boolean16 = shapeList14.equals((java.lang.Object) (short) 1);
        java.awt.Shape shape18 = shapeList14.getShape((int) (byte) 10);
        java.lang.Object obj19 = shapeList14.clone();
        boolean boolean20 = shapeList0.equals(obj19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test715");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape12 = shapeList0.getShape(101);
        int int13 = shapeList0.size();
        java.lang.Object obj14 = shapeList0.clone();
        java.awt.Shape shape16 = shapeList0.getShape((int) (byte) -1);
        java.lang.Object obj17 = shapeList0.clone();
        int int18 = shapeList0.size();
        java.awt.Shape shape20 = null;
        shapeList0.setShape((int) (short) 1, shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test716");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj5 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj7 = shapeList6.clone();
        shapeList6.clear();
        java.awt.Shape shape10 = shapeList6.getShape((int) (short) 1);
        boolean boolean12 = shapeList6.equals((java.lang.Object) (short) -1);
        java.lang.Object obj13 = null;
        boolean boolean14 = shapeList6.equals(obj13);
        int int15 = shapeList6.size();
        boolean boolean16 = shapeList0.equals((java.lang.Object) shapeList6);
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj19 = shapeList0.clone();
        java.awt.Shape shape21 = shapeList0.getShape((int) '#');
        java.awt.Shape shape23 = null;
        shapeList0.setShape((int) (byte) 10, shape23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test717");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        int int2 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj5 = shapeList4.clone();
        shapeList4.clear();
        java.awt.Shape shape8 = shapeList4.getShape((int) (short) 1);
        boolean boolean10 = shapeList4.equals((java.lang.Object) 'a');
        java.lang.Object obj11 = shapeList4.clone();
        int int12 = shapeList4.size();
        boolean boolean13 = shapeList0.equals((java.lang.Object) shapeList4);
        java.lang.Object obj14 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        boolean boolean17 = shapeList15.equals((java.lang.Object) (short) 1);
        boolean boolean19 = shapeList15.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape21 = null;
        shapeList15.setShape((int) (byte) 0, shape21);
        int int23 = shapeList15.size();
        boolean boolean25 = shapeList15.equals((java.lang.Object) (byte) 1);
        java.awt.Shape shape27 = shapeList15.getShape((int) '4');
        java.awt.Shape shape29 = null;
        shapeList15.setShape(9, shape29);
        boolean boolean31 = shapeList0.equals((java.lang.Object) shape29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList15", shapeList0.equals(shapeList15) ? shapeList0.hashCode() == shapeList15.hashCode() : true);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test718");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.lang.Object obj6 = shapeList0.clone();
        java.lang.Object obj7 = shapeList0.clone();
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape(0);
        java.awt.Shape shape12 = shapeList0.getShape(0);
        java.awt.Shape shape14 = shapeList0.getShape((int) (byte) -1);
        int int15 = shapeList0.size();
        java.awt.Shape shape17 = shapeList0.getShape((int) 'a');
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test719");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj8 = shapeList0.clone();
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = shapeList0.getShape((int) ' ');
        java.awt.Shape shape13 = null;
        shapeList0.setShape(33, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test720");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        boolean boolean8 = shapeList6.equals((java.lang.Object) (short) 1);
        boolean boolean10 = shapeList6.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj11 = shapeList6.clone();
        java.awt.Shape shape13 = shapeList6.getShape((int) (short) -1);
        int int14 = shapeList6.size();
        int int15 = shapeList6.size();
        java.lang.Object obj16 = shapeList6.clone();
        java.awt.Shape shape18 = shapeList6.getShape((int) (short) 1);
        int int19 = shapeList6.size();
        boolean boolean20 = shapeList0.equals((java.lang.Object) int19);
        java.awt.Shape shape22 = null;
        shapeList0.setShape((int) (byte) 0, shape22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test721");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape((int) (short) 0);
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        boolean boolean13 = shapeList11.equals((java.lang.Object) (short) 1);
        boolean boolean15 = shapeList11.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj16 = shapeList11.clone();
        java.awt.Shape shape18 = shapeList11.getShape((int) (short) -1);
        boolean boolean20 = shapeList11.equals((java.lang.Object) (-1.0d));
        boolean boolean21 = shapeList0.equals((java.lang.Object) shapeList11);
        java.lang.Object obj22 = shapeList0.clone();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        shapeList24.clear();
        java.lang.Object obj26 = shapeList24.clone();
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        boolean boolean29 = shapeList27.equals((java.lang.Object) (short) 1);
        boolean boolean31 = shapeList27.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj32 = shapeList27.clone();
        java.awt.Shape shape34 = shapeList27.getShape((int) (short) -1);
        int int35 = shapeList27.size();
        boolean boolean36 = shapeList24.equals((java.lang.Object) int35);
        shapeList24.clear();
        java.awt.Shape shape39 = shapeList24.getShape((int) (short) 0);
        shapeList24.clear();
        java.awt.Shape shape42 = shapeList24.getShape(33);
        java.awt.Shape shape44 = shapeList24.getShape((int) ' ');
        boolean boolean45 = shapeList0.equals((java.lang.Object) ' ');
        java.awt.Shape shape47 = shapeList0.getShape(34);
        java.awt.Shape shape49 = null;
        shapeList0.setShape((int) (short) 100, shape49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test722");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) ' ');
        boolean boolean6 = shapeList0.equals((java.lang.Object) 10);
        int int7 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj9 = shapeList8.clone();
        shapeList8.clear();
        java.awt.Shape shape12 = shapeList8.getShape((int) (short) 1);
        boolean boolean14 = shapeList8.equals((java.lang.Object) (short) -1);
        shapeList8.clear();
        shapeList8.clear();
        java.awt.Shape shape18 = shapeList8.getShape((int) (short) 0);
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        boolean boolean21 = shapeList19.equals((java.lang.Object) (short) 1);
        boolean boolean23 = shapeList19.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj24 = shapeList19.clone();
        java.awt.Shape shape26 = shapeList19.getShape((int) (short) -1);
        boolean boolean28 = shapeList19.equals((java.lang.Object) (-1.0d));
        boolean boolean29 = shapeList8.equals((java.lang.Object) shapeList19);
        java.awt.Shape shape31 = shapeList8.getShape((int) (byte) -1);
        java.lang.Object obj32 = shapeList8.clone();
        boolean boolean33 = shapeList0.equals(obj32);
        org.jfree.chart.util.ShapeList shapeList34 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape36 = null;
        shapeList34.setShape(8, shape36);
        java.awt.Shape shape39 = shapeList34.getShape((int) (byte) 100);
        java.awt.Shape shape41 = shapeList34.getShape((int) (byte) 100);
        java.awt.Shape shape43 = null;
        shapeList34.setShape(10, shape43);
        int int45 = shapeList34.size();
        java.lang.Object obj46 = shapeList34.clone();
        boolean boolean47 = shapeList0.equals((java.lang.Object) shapeList34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList34", shapeList0.equals(shapeList34) ? shapeList0.hashCode() == shapeList34.hashCode() : true);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test723");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj5 = shapeList4.clone();
        shapeList4.clear();
        java.awt.Shape shape8 = shapeList4.getShape((int) (short) 1);
        boolean boolean10 = shapeList4.equals((java.lang.Object) (short) -1);
        boolean boolean11 = shapeList0.equals((java.lang.Object) shapeList4);
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        shapeList12.clear();
        int int14 = shapeList12.size();
        java.awt.Shape shape16 = null;
        shapeList12.setShape((int) '#', shape16);
        java.lang.Object obj18 = shapeList12.clone();
        java.lang.Object obj19 = shapeList12.clone();
        java.awt.Shape shape21 = shapeList12.getShape(0);
        int int22 = shapeList12.size();
        java.lang.Object obj23 = shapeList12.clone();
        java.awt.Shape shape25 = shapeList12.getShape((int) (short) -1);
        java.lang.Object obj26 = shapeList12.clone();
        boolean boolean27 = shapeList0.equals((java.lang.Object) shapeList12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test724");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 0);
        int int7 = shapeList0.size();
        int int8 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        shapeList9.clear();
        java.awt.Shape shape12 = shapeList9.getShape(10);
        boolean boolean13 = shapeList0.equals((java.lang.Object) shapeList9);
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj15 = shapeList14.clone();
        java.lang.Object obj16 = shapeList14.clone();
        java.awt.Shape shape18 = shapeList14.getShape(1);
        shapeList14.clear();
        shapeList14.clear();
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj22 = shapeList21.clone();
        shapeList21.clear();
        java.awt.Shape shape25 = shapeList21.getShape((int) (short) 1);
        boolean boolean27 = shapeList21.equals((java.lang.Object) 'a');
        java.lang.Object obj28 = shapeList21.clone();
        boolean boolean29 = shapeList14.equals(obj28);
        boolean boolean30 = shapeList0.equals((java.lang.Object) shapeList14);
        shapeList14.clear();
        java.awt.Shape shape33 = null;
        shapeList14.setShape(33, shape33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test725");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(1);
        shapeList0.clear();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        shapeList7.clear();
        java.awt.Shape shape11 = shapeList7.getShape((int) (short) 1);
        boolean boolean13 = shapeList7.equals((java.lang.Object) 'a');
        java.lang.Object obj14 = shapeList7.clone();
        boolean boolean15 = shapeList0.equals(obj14);
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj17 = shapeList16.clone();
        shapeList16.clear();
        java.awt.Shape shape20 = shapeList16.getShape((int) (short) 1);
        java.lang.Object obj21 = shapeList16.clone();
        boolean boolean22 = shapeList0.equals((java.lang.Object) shapeList16);
        int int23 = shapeList0.size();
        int int24 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        boolean boolean27 = shapeList25.equals((java.lang.Object) (short) 1);
        boolean boolean29 = shapeList25.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj30 = shapeList25.clone();
        java.awt.Shape shape32 = shapeList25.getShape((int) (short) -1);
        int int33 = shapeList25.size();
        int int34 = shapeList25.size();
        int int35 = shapeList25.size();
        boolean boolean36 = shapeList0.equals((java.lang.Object) shapeList25);
        java.awt.Shape shape38 = shapeList0.getShape((int) (short) 1);
        int int39 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape42 = null;
        shapeList0.setShape((int) (byte) 100, shape42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test726");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        int int4 = shapeList0.size();
        shapeList0.clear();
        int int6 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        shapeList7.clear();
        java.awt.Shape shape11 = shapeList7.getShape((int) (short) 1);
        java.lang.Object obj12 = shapeList7.clone();
        java.lang.Object obj13 = shapeList7.clone();
        boolean boolean14 = shapeList0.equals((java.lang.Object) shapeList7);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        shapeList16.clear();
        java.lang.Object obj18 = shapeList16.clone();
        boolean boolean20 = shapeList16.equals((java.lang.Object) (-1));
        int int21 = shapeList16.size();
        java.awt.Shape shape23 = shapeList16.getShape((int) (byte) -1);
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj25 = shapeList24.clone();
        shapeList24.clear();
        java.awt.Shape shape28 = shapeList24.getShape((int) (short) 1);
        boolean boolean30 = shapeList24.equals((java.lang.Object) (short) -1);
        java.lang.Object obj31 = null;
        boolean boolean32 = shapeList24.equals(obj31);
        int int33 = shapeList24.size();
        java.lang.Object obj34 = null;
        boolean boolean35 = shapeList24.equals(obj34);
        java.awt.Shape shape37 = shapeList24.getShape((int) 'a');
        java.awt.Shape shape39 = shapeList24.getShape((int) (byte) 0);
        boolean boolean40 = shapeList16.equals((java.lang.Object) shapeList24);
        java.awt.Shape shape42 = shapeList24.getShape(33);
        org.jfree.chart.util.ShapeList shapeList43 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape45 = null;
        shapeList43.setShape(8, shape45);
        java.awt.Shape shape48 = shapeList43.getShape((int) (byte) 100);
        java.awt.Shape shape50 = shapeList43.getShape((int) (byte) 100);
        java.awt.Shape shape52 = null;
        shapeList43.setShape(10, shape52);
        shapeList43.clear();
        boolean boolean55 = shapeList24.equals((java.lang.Object) shapeList43);
        java.lang.Object obj56 = shapeList43.clone();
        boolean boolean57 = shapeList0.equals(obj56);
        java.lang.Object obj58 = shapeList0.clone();
        java.awt.Shape shape60 = null;
        shapeList0.setShape((int) (short) 100, shape60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test727");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1));
        int int5 = shapeList0.size();
        java.awt.Shape shape7 = shapeList0.getShape((int) (byte) -1);
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        java.lang.Object obj10 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj12 = shapeList11.clone();
        shapeList11.clear();
        java.awt.Shape shape15 = shapeList11.getShape((int) (short) 1);
        boolean boolean17 = shapeList11.equals((java.lang.Object) 'a');
        boolean boolean18 = shapeList0.equals((java.lang.Object) 'a');
        java.awt.Shape shape20 = null;
        shapeList0.setShape(10, shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test728");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1));
        int int5 = shapeList0.size();
        java.awt.Shape shape7 = shapeList0.getShape((int) (byte) -1);
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        int int10 = shapeList0.size();
        java.awt.Shape shape12 = shapeList0.getShape(100);
        java.awt.Shape shape14 = null;
        shapeList0.setShape((int) (byte) 1, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test729");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) -1);
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        int int10 = shapeList0.size();
        java.awt.Shape shape12 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        shapeList13.clear();
        java.lang.Object obj15 = shapeList13.clone();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        boolean boolean18 = shapeList16.equals((java.lang.Object) (short) 1);
        boolean boolean20 = shapeList16.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj21 = shapeList16.clone();
        java.awt.Shape shape23 = shapeList16.getShape((int) (short) -1);
        int int24 = shapeList16.size();
        boolean boolean25 = shapeList13.equals((java.lang.Object) int24);
        java.awt.Shape shape27 = shapeList13.getShape(9);
        int int28 = shapeList13.size();
        java.lang.Object obj29 = shapeList13.clone();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        boolean boolean31 = shapeList0.equals((java.lang.Object) wildcardClass30);
        java.awt.Shape shape33 = shapeList0.getShape(53);
        java.awt.Shape shape35 = shapeList0.getShape(34);
        java.awt.Shape shape37 = null;
        shapeList0.setShape((int) ' ', shape37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test730");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 'a');
        java.lang.Object obj7 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj9 = shapeList8.clone();
        java.lang.Object obj10 = shapeList8.clone();
        java.awt.Shape shape12 = shapeList8.getShape(1);
        shapeList8.clear();
        shapeList8.clear();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj16 = shapeList15.clone();
        shapeList15.clear();
        java.awt.Shape shape19 = shapeList15.getShape((int) (short) 1);
        boolean boolean21 = shapeList15.equals((java.lang.Object) 'a');
        java.lang.Object obj22 = shapeList15.clone();
        boolean boolean23 = shapeList8.equals(obj22);
        boolean boolean24 = shapeList0.equals((java.lang.Object) shapeList8);
        shapeList0.clear();
        java.awt.Shape shape27 = shapeList0.getShape(11);
        shapeList0.clear();
        java.awt.Shape shape30 = shapeList0.getShape((int) (byte) 100);
        org.jfree.chart.util.ShapeList shapeList31 = new org.jfree.chart.util.ShapeList();
        shapeList31.clear();
        int int33 = shapeList31.size();
        java.awt.Shape shape35 = null;
        shapeList31.setShape((int) '#', shape35);
        java.lang.Object obj37 = shapeList31.clone();
        boolean boolean38 = shapeList0.equals(obj37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList31", shapeList0.equals(shapeList31) ? shapeList0.hashCode() == shapeList31.hashCode() : true);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test731");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) ' ', shape4);
        shapeList0.clear();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        boolean boolean10 = shapeList8.equals((java.lang.Object) (short) 1);
        boolean boolean12 = shapeList8.equals((java.lang.Object) 1.0d);
        java.lang.Object obj13 = shapeList8.clone();
        java.awt.Shape shape15 = shapeList8.getShape((int) (short) 10);
        int int16 = shapeList8.size();
        java.lang.Object obj17 = shapeList8.clone();
        boolean boolean18 = shapeList0.equals(obj17);
        java.awt.Shape shape20 = null;
        shapeList0.setShape((int) (short) 10, shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test732");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(1);
        int int5 = shapeList0.size();
        shapeList0.clear();
        int int7 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj9 = shapeList8.clone();
        shapeList8.clear();
        java.awt.Shape shape12 = shapeList8.getShape((int) (short) 1);
        boolean boolean14 = shapeList8.equals((java.lang.Object) (short) -1);
        java.lang.Object obj15 = shapeList8.clone();
        java.lang.Object obj16 = shapeList8.clone();
        int int17 = shapeList8.size();
        boolean boolean18 = shapeList0.equals((java.lang.Object) shapeList8);
        shapeList0.clear();
        int int20 = shapeList0.size();
        java.awt.Shape shape22 = null;
        shapeList0.setShape((int) (short) 1, shape22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test733");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(1);
        int int5 = shapeList0.size();
        shapeList0.clear();
        int int7 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        boolean boolean10 = shapeList8.equals((java.lang.Object) (short) 1);
        boolean boolean12 = shapeList8.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj13 = shapeList8.clone();
        java.awt.Shape shape15 = shapeList8.getShape((int) (short) -1);
        boolean boolean17 = shapeList8.equals((java.lang.Object) (-1.0d));
        int int18 = shapeList8.size();
        java.lang.Class<?> wildcardClass19 = shapeList8.getClass();
        boolean boolean20 = shapeList0.equals((java.lang.Object) wildcardClass19);
        java.awt.Shape shape22 = null;
        shapeList0.setShape(0, shape22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test734");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 'a');
        java.lang.Object obj7 = shapeList0.clone();
        int int8 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        int int10 = shapeList9.size();
        shapeList9.clear();
        java.lang.Object obj12 = shapeList9.clone();
        java.awt.Shape shape14 = shapeList9.getShape(100);
        java.lang.Object obj15 = shapeList9.clone();
        java.lang.Object obj16 = shapeList9.clone();
        boolean boolean17 = shapeList0.equals(obj16);
        java.awt.Shape shape19 = null;
        shapeList0.setShape(98, shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test735");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        java.awt.Shape shape4 = shapeList0.getShape(101);
        java.awt.Shape shape6 = null;
        shapeList0.setShape(3, shape6);
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj9 = shapeList8.clone();
        shapeList8.clear();
        java.awt.Shape shape12 = shapeList8.getShape((int) (short) 1);
        boolean boolean14 = shapeList8.equals((java.lang.Object) (short) -1);
        java.lang.Object obj15 = null;
        boolean boolean16 = shapeList8.equals(obj15);
        int int17 = shapeList8.size();
        java.lang.Object obj18 = null;
        boolean boolean19 = shapeList8.equals(obj18);
        java.awt.Shape shape21 = shapeList8.getShape((int) 'a');
        java.awt.Shape shape23 = shapeList8.getShape((int) '4');
        java.awt.Shape shape25 = shapeList8.getShape((int) (byte) 10);
        java.lang.Object obj26 = null;
        boolean boolean27 = shapeList8.equals(obj26);
        boolean boolean28 = shapeList0.equals((java.lang.Object) shapeList8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test736");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape(1);
        java.awt.Shape shape9 = shapeList0.getShape(100);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        java.awt.Shape shape13 = shapeList0.getShape(100);
        int int14 = shapeList0.size();
        java.awt.Shape shape16 = null;
        shapeList0.setShape((int) ' ', shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test737");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        int int4 = shapeList0.size();
        shapeList0.clear();
        int int6 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        shapeList7.clear();
        java.awt.Shape shape11 = shapeList7.getShape((int) (short) 1);
        java.lang.Object obj12 = shapeList7.clone();
        java.lang.Object obj13 = shapeList7.clone();
        boolean boolean14 = shapeList0.equals((java.lang.Object) shapeList7);
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape17 = null;
        shapeList15.setShape(8, shape17);
        int int19 = shapeList15.size();
        shapeList15.clear();
        int int21 = shapeList15.size();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj23 = shapeList22.clone();
        shapeList22.clear();
        java.awt.Shape shape26 = shapeList22.getShape((int) (short) 1);
        java.lang.Object obj27 = shapeList22.clone();
        java.lang.Object obj28 = shapeList22.clone();
        boolean boolean29 = shapeList15.equals((java.lang.Object) shapeList22);
        java.awt.Shape shape31 = shapeList15.getShape((int) (short) 10);
        boolean boolean32 = shapeList7.equals((java.lang.Object) shapeList15);
        java.lang.Object obj33 = shapeList15.clone();
        java.lang.Object obj34 = shapeList15.clone();
        int int35 = shapeList15.size();
        java.awt.Shape shape37 = null;
        shapeList15.setShape(9, shape37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList15", shapeList0.equals(shapeList15) ? shapeList0.hashCode() == shapeList15.hashCode() : true);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test738");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj7 = shapeList6.clone();
        shapeList6.clear();
        java.awt.Shape shape10 = shapeList6.getShape((int) (short) 1);
        boolean boolean12 = shapeList6.equals((java.lang.Object) (short) -1);
        java.lang.Object obj13 = null;
        boolean boolean14 = shapeList6.equals(obj13);
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        boolean boolean17 = shapeList15.equals((java.lang.Object) (short) 1);
        boolean boolean19 = shapeList15.equals((java.lang.Object) 1.0d);
        java.lang.Object obj20 = shapeList15.clone();
        boolean boolean21 = shapeList6.equals(obj20);
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj23 = shapeList22.clone();
        shapeList22.clear();
        java.awt.Shape shape26 = shapeList22.getShape((int) (short) 1);
        java.lang.Object obj27 = shapeList22.clone();
        org.jfree.chart.util.ShapeList shapeList28 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj29 = shapeList28.clone();
        shapeList28.clear();
        java.awt.Shape shape32 = shapeList28.getShape((int) (short) 1);
        boolean boolean34 = shapeList28.equals((java.lang.Object) (short) -1);
        java.lang.Object obj35 = null;
        boolean boolean36 = shapeList28.equals(obj35);
        int int37 = shapeList28.size();
        boolean boolean38 = shapeList22.equals((java.lang.Object) shapeList28);
        boolean boolean39 = shapeList6.equals((java.lang.Object) shapeList28);
        org.jfree.chart.util.ShapeList shapeList40 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj41 = shapeList40.clone();
        shapeList40.clear();
        boolean boolean43 = shapeList6.equals((java.lang.Object) shapeList40);
        boolean boolean44 = shapeList0.equals((java.lang.Object) shapeList40);
        shapeList40.clear();
        org.jfree.chart.util.ShapeList shapeList46 = new org.jfree.chart.util.ShapeList();
        shapeList46.clear();
        java.lang.Object obj48 = shapeList46.clone();
        boolean boolean50 = shapeList46.equals((java.lang.Object) (-1));
        int int51 = shapeList46.size();
        java.awt.Shape shape53 = shapeList46.getShape((int) (byte) -1);
        shapeList46.clear();
        shapeList46.clear();
        shapeList46.clear();
        java.awt.Shape shape58 = shapeList46.getShape(8);
        boolean boolean59 = shapeList40.equals((java.lang.Object) 8);
        int int60 = shapeList40.size();
        java.awt.Shape shape62 = null;
        shapeList40.setShape(33, shape62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList40", shapeList0.equals(shapeList40) ? shapeList0.hashCode() == shapeList40.hashCode() : true);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test739");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        boolean boolean5 = shapeList3.equals((java.lang.Object) (short) 1);
        boolean boolean7 = shapeList3.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = shapeList3.clone();
        java.awt.Shape shape10 = shapeList3.getShape((int) (short) -1);
        int int11 = shapeList3.size();
        boolean boolean12 = shapeList0.equals((java.lang.Object) int11);
        int int13 = shapeList0.size();
        java.awt.Shape shape15 = shapeList0.getShape(0);
        shapeList0.clear();
        java.awt.Shape shape18 = null;
        shapeList0.setShape(0, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test740");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape(1);
        java.awt.Shape shape9 = shapeList0.getShape(100);
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj11 = shapeList10.clone();
        shapeList10.clear();
        java.awt.Shape shape14 = shapeList10.getShape((int) (short) 1);
        boolean boolean16 = shapeList10.equals((java.lang.Object) (short) -1);
        shapeList10.clear();
        shapeList10.clear();
        java.lang.Object obj19 = shapeList10.clone();
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj21 = shapeList20.clone();
        shapeList20.clear();
        java.awt.Shape shape24 = shapeList20.getShape((int) (short) 1);
        boolean boolean26 = shapeList20.equals((java.lang.Object) 0L);
        boolean boolean27 = shapeList10.equals((java.lang.Object) 0L);
        boolean boolean28 = shapeList0.equals((java.lang.Object) shapeList10);
        java.awt.Shape shape30 = shapeList0.getShape(0);
        java.awt.Shape shape32 = null;
        shapeList0.setShape((int) '4', shape32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test741");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = null;
        boolean boolean8 = shapeList0.equals(obj7);
        int int9 = shapeList0.size();
        java.lang.Object obj10 = null;
        boolean boolean11 = shapeList0.equals(obj10);
        java.awt.Shape shape13 = shapeList0.getShape((int) 'a');
        java.awt.Shape shape15 = shapeList0.getShape((int) '4');
        java.awt.Shape shape17 = shapeList0.getShape((int) (short) 1);
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj19 = shapeList18.clone();
        shapeList18.clear();
        java.awt.Shape shape22 = shapeList18.getShape((int) (short) 1);
        java.lang.Object obj23 = shapeList18.clone();
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj25 = shapeList24.clone();
        shapeList24.clear();
        java.awt.Shape shape28 = shapeList24.getShape((int) (short) 1);
        boolean boolean30 = shapeList24.equals((java.lang.Object) (short) -1);
        java.lang.Object obj31 = null;
        boolean boolean32 = shapeList24.equals(obj31);
        int int33 = shapeList24.size();
        boolean boolean34 = shapeList18.equals((java.lang.Object) shapeList24);
        shapeList18.clear();
        boolean boolean36 = shapeList0.equals((java.lang.Object) shapeList18);
        org.jfree.chart.util.ShapeList shapeList37 = new org.jfree.chart.util.ShapeList();
        int int38 = shapeList37.size();
        shapeList37.clear();
        java.awt.Shape shape41 = null;
        shapeList37.setShape((int) (short) 100, shape41);
        java.lang.Object obj43 = shapeList37.clone();
        int int44 = shapeList37.size();
        boolean boolean45 = shapeList0.equals((java.lang.Object) shapeList37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList37", shapeList0.equals(shapeList37) ? shapeList0.hashCode() == shapeList37.hashCode() : true);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test742");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        int int2 = shapeList0.size();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) '#', shape4);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        shapeList7.clear();
        java.awt.Shape shape11 = shapeList7.getShape((int) (short) 1);
        boolean boolean13 = shapeList7.equals((java.lang.Object) 0);
        int int14 = shapeList7.size();
        int int15 = shapeList7.size();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        shapeList16.clear();
        java.awt.Shape shape19 = shapeList16.getShape(10);
        boolean boolean20 = shapeList7.equals((java.lang.Object) shapeList16);
        boolean boolean21 = shapeList0.equals((java.lang.Object) boolean20);
        java.awt.Shape shape23 = shapeList0.getShape((int) 'a');
        int int24 = shapeList0.size();
        int int25 = shapeList0.size();
        java.lang.Object obj26 = shapeList0.clone();
        java.awt.Shape shape28 = null;
        shapeList0.setShape(0, shape28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test743");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = null;
        boolean boolean8 = shapeList0.equals(obj7);
        int int9 = shapeList0.size();
        java.lang.Object obj10 = null;
        boolean boolean11 = shapeList0.equals(obj10);
        java.awt.Shape shape13 = shapeList0.getShape((int) 'a');
        java.awt.Shape shape15 = shapeList0.getShape((int) '4');
        java.lang.Object obj16 = shapeList0.clone();
        java.awt.Shape shape18 = null;
        shapeList0.setShape(101, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test744");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        java.lang.Object obj5 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj9 = shapeList8.clone();
        shapeList8.clear();
        shapeList8.clear();
        java.awt.Shape shape13 = shapeList8.getShape((int) '#');
        java.awt.Shape shape15 = shapeList8.getShape(1);
        java.awt.Shape shape17 = shapeList8.getShape((int) (byte) 0);
        boolean boolean18 = shapeList0.equals((java.lang.Object) shapeList8);
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj20 = shapeList19.clone();
        java.lang.Object obj21 = shapeList19.clone();
        boolean boolean22 = shapeList0.equals((java.lang.Object) shapeList19);
        java.lang.Object obj23 = shapeList0.clone();
        java.awt.Shape shape25 = null;
        shapeList0.setShape((int) (byte) 0, shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test745");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.awt.Shape shape7 = null;
        shapeList0.setShape((int) '#', shape7);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj11 = shapeList10.clone();
        shapeList10.clear();
        java.lang.Object obj13 = shapeList10.clone();
        int int14 = shapeList10.size();
        shapeList10.clear();
        shapeList10.clear();
        shapeList10.clear();
        java.lang.Object obj18 = shapeList10.clone();
        boolean boolean19 = shapeList0.equals((java.lang.Object) shapeList10);
        int int20 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj23 = shapeList22.clone();
        shapeList22.clear();
        java.awt.Shape shape26 = shapeList22.getShape((int) ' ');
        java.lang.Object obj27 = shapeList22.clone();
        java.lang.Object obj28 = shapeList22.clone();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        boolean boolean30 = shapeList0.equals(obj28);
        java.awt.Shape shape32 = null;
        shapeList0.setShape((int) (byte) 1, shape32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test746");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 'a');
        java.lang.Object obj7 = shapeList0.clone();
        int int8 = shapeList0.size();
        java.lang.Object obj9 = shapeList0.clone();
        int int10 = shapeList0.size();
        java.awt.Shape shape12 = null;
        shapeList0.setShape((int) 'a', shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test747");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.awt.Shape shape8 = shapeList0.getShape((-1));
        java.awt.Shape shape10 = shapeList0.getShape((int) (short) 100);
        shapeList0.clear();
        java.lang.Object obj12 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        shapeList13.clear();
        int int15 = shapeList13.size();
        int int16 = shapeList13.size();
        int int17 = shapeList13.size();
        java.awt.Shape shape19 = shapeList13.getShape((int) (short) 1);
        int int20 = shapeList13.size();
        java.awt.Shape shape22 = shapeList13.getShape((int) (byte) 100);
        shapeList13.clear();
        java.awt.Shape shape25 = null;
        shapeList13.setShape(36, shape25);
        java.lang.Object obj27 = shapeList13.clone();
        boolean boolean28 = shapeList0.equals((java.lang.Object) shapeList13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test748");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        int int2 = shapeList0.size();
        int int3 = shapeList0.size();
        int int4 = shapeList0.size();
        java.awt.Shape shape6 = shapeList0.getShape((int) (short) 1);
        int int7 = shapeList0.size();
        java.awt.Shape shape9 = shapeList0.getShape((int) (byte) 100);
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj11 = shapeList10.clone();
        shapeList10.clear();
        java.lang.Object obj13 = shapeList10.clone();
        int int14 = shapeList10.size();
        shapeList10.clear();
        shapeList10.clear();
        boolean boolean17 = shapeList0.equals((java.lang.Object) shapeList10);
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj19 = shapeList18.clone();
        java.lang.Object obj20 = shapeList18.clone();
        java.awt.Shape shape22 = shapeList18.getShape(1);
        int int23 = shapeList18.size();
        shapeList18.clear();
        int int25 = shapeList18.size();
        java.lang.Object obj26 = shapeList18.clone();
        boolean boolean27 = shapeList0.equals((java.lang.Object) shapeList18);
        java.lang.Object obj28 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj30 = shapeList29.clone();
        shapeList29.clear();
        java.awt.Shape shape33 = shapeList29.getShape((int) (short) 1);
        boolean boolean35 = shapeList29.equals((java.lang.Object) 'a');
        java.lang.Object obj36 = shapeList29.clone();
        int int37 = shapeList29.size();
        java.lang.Object obj38 = shapeList29.clone();
        int int39 = shapeList29.size();
        shapeList29.clear();
        boolean boolean41 = shapeList0.equals((java.lang.Object) shapeList29);
        org.jfree.chart.util.ShapeList shapeList42 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape44 = null;
        shapeList42.setShape(8, shape44);
        int int46 = shapeList42.size();
        shapeList42.clear();
        org.jfree.chart.util.ShapeList shapeList48 = new org.jfree.chart.util.ShapeList();
        shapeList48.clear();
        java.lang.Object obj50 = shapeList48.clone();
        org.jfree.chart.util.ShapeList shapeList51 = new org.jfree.chart.util.ShapeList();
        boolean boolean53 = shapeList51.equals((java.lang.Object) (short) 1);
        boolean boolean55 = shapeList51.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj56 = shapeList51.clone();
        java.awt.Shape shape58 = shapeList51.getShape((int) (short) -1);
        int int59 = shapeList51.size();
        boolean boolean60 = shapeList48.equals((java.lang.Object) int59);
        shapeList48.clear();
        boolean boolean62 = shapeList42.equals((java.lang.Object) shapeList48);
        java.awt.Shape shape64 = shapeList48.getShape((int) (byte) 10);
        boolean boolean65 = shapeList29.equals((java.lang.Object) shapeList48);
        shapeList48.clear();
        java.awt.Shape shape68 = null;
        shapeList48.setShape(10, shape68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList48", shapeList0.equals(shapeList48) ? shapeList0.hashCode() == shapeList48.hashCode() : true);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test749");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = null;
        boolean boolean8 = shapeList0.equals(obj7);
        int int9 = shapeList0.size();
        java.lang.Object obj10 = null;
        boolean boolean11 = shapeList0.equals(obj10);
        java.awt.Shape shape13 = shapeList0.getShape((int) 'a');
        java.awt.Shape shape15 = shapeList0.getShape((int) '4');
        java.awt.Shape shape17 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj19 = shapeList18.clone();
        shapeList18.clear();
        shapeList18.clear();
        java.awt.Shape shape23 = shapeList18.getShape((int) '#');
        java.awt.Shape shape25 = shapeList18.getShape(1);
        boolean boolean26 = shapeList0.equals((java.lang.Object) shapeList18);
        java.awt.Shape shape28 = shapeList0.getShape(1);
        java.awt.Shape shape30 = shapeList0.getShape(8);
        java.lang.Object obj31 = null;
        boolean boolean32 = shapeList0.equals(obj31);
        java.awt.Shape shape34 = null;
        shapeList0.setShape((int) '#', shape34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test750");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(1);
        shapeList0.clear();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        shapeList7.clear();
        java.awt.Shape shape11 = shapeList7.getShape((int) (short) 1);
        boolean boolean13 = shapeList7.equals((java.lang.Object) 'a');
        java.lang.Object obj14 = shapeList7.clone();
        boolean boolean15 = shapeList0.equals(obj14);
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj17 = shapeList16.clone();
        shapeList16.clear();
        java.awt.Shape shape20 = shapeList16.getShape((int) (short) 1);
        java.lang.Object obj21 = shapeList16.clone();
        boolean boolean22 = shapeList0.equals((java.lang.Object) shapeList16);
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj24 = shapeList23.clone();
        shapeList23.clear();
        java.awt.Shape shape27 = shapeList23.getShape((int) (short) 1);
        boolean boolean29 = shapeList23.equals((java.lang.Object) (short) -1);
        java.lang.Object obj30 = shapeList23.clone();
        java.awt.Shape shape32 = shapeList23.getShape((int) (short) -1);
        org.jfree.chart.util.ShapeList shapeList33 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj34 = shapeList33.clone();
        shapeList33.clear();
        java.lang.Object obj36 = shapeList33.clone();
        org.jfree.chart.util.ShapeList shapeList37 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj38 = shapeList37.clone();
        shapeList37.clear();
        java.awt.Shape shape41 = shapeList37.getShape((int) (short) 1);
        boolean boolean43 = shapeList37.equals((java.lang.Object) (short) -1);
        boolean boolean44 = shapeList33.equals((java.lang.Object) shapeList37);
        java.lang.Object obj45 = shapeList33.clone();
        java.awt.Shape shape47 = shapeList33.getShape(8);
        org.jfree.chart.util.ShapeList shapeList48 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj49 = shapeList48.clone();
        shapeList48.clear();
        java.awt.Shape shape52 = shapeList48.getShape((int) (short) 1);
        boolean boolean54 = shapeList48.equals((java.lang.Object) (short) -1);
        java.lang.Object obj55 = null;
        boolean boolean56 = shapeList48.equals(obj55);
        int int57 = shapeList48.size();
        java.lang.Object obj58 = null;
        boolean boolean59 = shapeList48.equals(obj58);
        java.awt.Shape shape61 = shapeList48.getShape((int) 'a');
        java.awt.Shape shape63 = shapeList48.getShape((int) '4');
        java.awt.Shape shape65 = shapeList48.getShape((int) '#');
        java.awt.Shape shape67 = shapeList48.getShape((int) (byte) -1);
        java.lang.Object obj68 = shapeList48.clone();
        boolean boolean69 = shapeList33.equals((java.lang.Object) shapeList48);
        java.lang.Object obj70 = shapeList33.clone();
        boolean boolean71 = shapeList23.equals((java.lang.Object) shapeList33);
        shapeList23.clear();
        java.lang.Object obj73 = shapeList23.clone();
        boolean boolean74 = shapeList16.equals((java.lang.Object) shapeList23);
        shapeList23.clear();
        java.awt.Shape shape77 = null;
        shapeList23.setShape(8, shape77);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList23", shapeList0.equals(shapeList23) ? shapeList0.hashCode() == shapeList23.hashCode() : true);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test751");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        shapeList7.clear();
        java.awt.Shape shape11 = shapeList7.getShape((int) (short) 1);
        boolean boolean13 = shapeList7.equals((java.lang.Object) 0);
        shapeList7.clear();
        boolean boolean15 = shapeList0.equals((java.lang.Object) shapeList7);
        java.awt.Shape shape17 = shapeList7.getShape(36);
        java.awt.Shape shape19 = null;
        shapeList7.setShape(0, shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test752");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 'a');
        shapeList0.clear();
        shapeList0.clear();
        int int9 = shapeList0.size();
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) (byte) 1, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test753");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        int int4 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        shapeList6.clear();
        java.lang.Object obj8 = shapeList6.clone();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) (short) 1);
        boolean boolean13 = shapeList9.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = shapeList9.clone();
        java.awt.Shape shape16 = shapeList9.getShape((int) (short) -1);
        int int17 = shapeList9.size();
        boolean boolean18 = shapeList6.equals((java.lang.Object) int17);
        shapeList6.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList6);
        shapeList6.clear();
        java.lang.Object obj22 = shapeList6.clone();
        java.awt.Shape shape24 = shapeList6.getShape((int) 'a');
        shapeList6.clear();
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj27 = shapeList26.clone();
        shapeList26.clear();
        shapeList26.clear();
        java.awt.Shape shape31 = shapeList26.getShape((int) '#');
        java.awt.Shape shape33 = shapeList26.getShape(1);
        java.awt.Shape shape35 = shapeList26.getShape((int) ' ');
        int int36 = shapeList26.size();
        java.awt.Shape shape38 = shapeList26.getShape(100);
        boolean boolean39 = shapeList6.equals((java.lang.Object) 100);
        java.lang.Object obj40 = shapeList6.clone();
        org.jfree.chart.util.ShapeList shapeList41 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj42 = shapeList41.clone();
        shapeList41.clear();
        java.awt.Shape shape45 = shapeList41.getShape((int) (short) 1);
        boolean boolean47 = shapeList41.equals((java.lang.Object) 0);
        java.awt.Shape shape49 = shapeList41.getShape(0);
        shapeList41.clear();
        int int51 = shapeList41.size();
        boolean boolean52 = shapeList6.equals((java.lang.Object) shapeList41);
        org.jfree.chart.util.ShapeList shapeList53 = new org.jfree.chart.util.ShapeList();
        boolean boolean55 = shapeList53.equals((java.lang.Object) (short) 1);
        boolean boolean57 = shapeList53.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape59 = null;
        shapeList53.setShape(11, shape59);
        shapeList53.clear();
        boolean boolean62 = shapeList41.equals((java.lang.Object) shapeList53);
        java.awt.Shape shape64 = shapeList41.getShape(9);
        java.awt.Shape shape66 = null;
        shapeList41.setShape((int) (byte) 100, shape66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList41", shapeList0.equals(shapeList41) ? shapeList0.hashCode() == shapeList41.hashCode() : true);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test754");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        boolean boolean5 = shapeList3.equals((java.lang.Object) (short) 1);
        boolean boolean7 = shapeList3.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = shapeList3.clone();
        java.awt.Shape shape10 = shapeList3.getShape((int) (short) -1);
        int int11 = shapeList3.size();
        boolean boolean12 = shapeList0.equals((java.lang.Object) int11);
        java.awt.Shape shape14 = shapeList0.getShape(9);
        int int15 = shapeList0.size();
        java.lang.Object obj16 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        boolean boolean18 = shapeList0.equals((java.lang.Object) shapeList17);
        java.awt.Shape shape20 = shapeList17.getShape(0);
        java.lang.Object obj21 = null;
        boolean boolean22 = shapeList17.equals(obj21);
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        int int24 = shapeList23.size();
        shapeList23.clear();
        java.awt.Shape shape27 = null;
        shapeList23.setShape((int) (short) 100, shape27);
        shapeList23.clear();
        shapeList23.clear();
        java.lang.Object obj31 = shapeList23.clone();
        org.jfree.chart.util.ShapeList shapeList32 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj33 = shapeList32.clone();
        shapeList32.clear();
        java.awt.Shape shape36 = shapeList32.getShape((int) (short) 1);
        boolean boolean38 = shapeList32.equals((java.lang.Object) 'a');
        java.lang.Object obj39 = shapeList32.clone();
        int int40 = shapeList32.size();
        java.lang.Object obj41 = shapeList32.clone();
        boolean boolean42 = shapeList23.equals((java.lang.Object) shapeList32);
        java.lang.Object obj43 = shapeList23.clone();
        boolean boolean44 = shapeList17.equals((java.lang.Object) shapeList23);
        java.awt.Shape shape46 = null;
        shapeList23.setShape(98, shape46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList23", shapeList0.equals(shapeList23) ? shapeList0.hashCode() == shapeList23.hashCode() : true);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test755");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        java.lang.Object obj5 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj9 = shapeList8.clone();
        shapeList8.clear();
        shapeList8.clear();
        java.awt.Shape shape13 = shapeList8.getShape((int) '#');
        java.awt.Shape shape15 = shapeList8.getShape(1);
        java.awt.Shape shape17 = shapeList8.getShape((int) (byte) 0);
        boolean boolean18 = shapeList0.equals((java.lang.Object) shapeList8);
        java.awt.Shape shape20 = shapeList8.getShape((int) ' ');
        int int21 = shapeList8.size();
        java.awt.Shape shape23 = shapeList8.getShape((int) ' ');
        java.lang.Object obj24 = shapeList8.clone();
        java.awt.Shape shape26 = null;
        shapeList8.setShape(98, shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test756");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 0);
        java.lang.Object obj7 = shapeList0.clone();
        boolean boolean9 = shapeList0.equals((java.lang.Object) false);
        shapeList0.clear();
        int int11 = shapeList0.size();
        int int12 = shapeList0.size();
        java.awt.Shape shape14 = null;
        shapeList0.setShape(34, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test757");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) -1);
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        int int10 = shapeList0.size();
        java.awt.Shape shape12 = shapeList0.getShape((int) '#');
        int int13 = shapeList0.size();
        java.lang.Object obj14 = shapeList0.clone();
        int int15 = shapeList0.size();
        java.awt.Shape shape17 = null;
        shapeList0.setShape(8, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test758");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj5 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj7 = shapeList6.clone();
        shapeList6.clear();
        java.awt.Shape shape10 = shapeList6.getShape((int) (short) 1);
        boolean boolean12 = shapeList6.equals((java.lang.Object) (short) -1);
        java.lang.Object obj13 = null;
        boolean boolean14 = shapeList6.equals(obj13);
        int int15 = shapeList6.size();
        boolean boolean16 = shapeList0.equals((java.lang.Object) shapeList6);
        java.awt.Shape shape18 = shapeList0.getShape(100);
        boolean boolean20 = shapeList0.equals((java.lang.Object) false);
        java.awt.Shape shape22 = shapeList0.getShape(9);
        java.awt.Shape shape24 = shapeList0.getShape(100);
        java.lang.Object obj25 = shapeList0.clone();
        java.lang.Object obj26 = shapeList0.clone();
        int int27 = shapeList0.size();
        java.lang.Object obj28 = shapeList0.clone();
        java.awt.Shape shape30 = shapeList0.getShape(101);
        java.awt.Shape shape32 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape34 = null;
        shapeList0.setShape(11, shape34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test759");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape((int) (short) 0);
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        boolean boolean13 = shapeList11.equals((java.lang.Object) (short) 1);
        boolean boolean15 = shapeList11.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj16 = shapeList11.clone();
        java.awt.Shape shape18 = shapeList11.getShape((int) (short) -1);
        boolean boolean20 = shapeList11.equals((java.lang.Object) (-1.0d));
        boolean boolean21 = shapeList0.equals((java.lang.Object) shapeList11);
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj23 = shapeList22.clone();
        shapeList22.clear();
        java.awt.Shape shape26 = shapeList22.getShape((int) (short) 1);
        boolean boolean28 = shapeList22.equals((java.lang.Object) (short) -1);
        shapeList22.clear();
        shapeList22.clear();
        java.awt.Shape shape32 = shapeList22.getShape((int) (short) 0);
        org.jfree.chart.util.ShapeList shapeList33 = new org.jfree.chart.util.ShapeList();
        boolean boolean35 = shapeList33.equals((java.lang.Object) (short) 1);
        boolean boolean37 = shapeList33.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj38 = shapeList33.clone();
        java.awt.Shape shape40 = shapeList33.getShape((int) (short) -1);
        boolean boolean42 = shapeList33.equals((java.lang.Object) (-1.0d));
        boolean boolean43 = shapeList22.equals((java.lang.Object) shapeList33);
        boolean boolean44 = shapeList11.equals((java.lang.Object) shapeList33);
        org.jfree.chart.util.ShapeList shapeList45 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape47 = null;
        shapeList45.setShape(8, shape47);
        int int49 = shapeList45.size();
        shapeList45.clear();
        shapeList45.clear();
        java.awt.Shape shape53 = null;
        shapeList45.setShape((int) (short) 0, shape53);
        boolean boolean55 = shapeList11.equals((java.lang.Object) shape53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList45", shapeList0.equals(shapeList45) ? shapeList0.hashCode() == shapeList45.hashCode() : true);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test760");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        java.lang.Object obj5 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        boolean boolean10 = shapeList8.equals((java.lang.Object) (short) 1);
        boolean boolean12 = shapeList8.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj13 = shapeList8.clone();
        java.awt.Shape shape15 = shapeList8.getShape((int) (short) -1);
        int int16 = shapeList8.size();
        boolean boolean17 = shapeList0.equals((java.lang.Object) shapeList8);
        int int18 = shapeList8.size();
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj20 = shapeList19.clone();
        shapeList19.clear();
        java.awt.Shape shape23 = shapeList19.getShape(9);
        shapeList19.clear();
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj26 = shapeList25.clone();
        boolean boolean27 = shapeList19.equals((java.lang.Object) shapeList25);
        boolean boolean28 = shapeList8.equals((java.lang.Object) shapeList25);
        shapeList8.clear();
        java.awt.Shape shape31 = null;
        shapeList8.setShape(0, shape31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test761");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(1);
        shapeList0.clear();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        shapeList7.clear();
        java.awt.Shape shape11 = shapeList7.getShape((int) (short) 1);
        boolean boolean13 = shapeList7.equals((java.lang.Object) 'a');
        java.lang.Object obj14 = shapeList7.clone();
        boolean boolean15 = shapeList0.equals(obj14);
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj17 = shapeList16.clone();
        shapeList16.clear();
        java.awt.Shape shape20 = shapeList16.getShape((int) (short) 1);
        java.lang.Object obj21 = shapeList16.clone();
        boolean boolean22 = shapeList0.equals((java.lang.Object) shapeList16);
        java.awt.Shape shape24 = null;
        shapeList0.setShape(1, shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test762");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj5 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj7 = shapeList6.clone();
        shapeList6.clear();
        java.awt.Shape shape10 = shapeList6.getShape((int) (short) 1);
        boolean boolean12 = shapeList6.equals((java.lang.Object) (short) -1);
        java.lang.Object obj13 = null;
        boolean boolean14 = shapeList6.equals(obj13);
        int int15 = shapeList6.size();
        boolean boolean16 = shapeList0.equals((java.lang.Object) shapeList6);
        java.awt.Shape shape18 = shapeList0.getShape(100);
        java.lang.Object obj19 = shapeList0.clone();
        java.awt.Shape shape21 = null;
        shapeList0.setShape((int) '4', shape21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test763");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        boolean boolean5 = shapeList3.equals((java.lang.Object) (short) 1);
        boolean boolean7 = shapeList3.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = shapeList3.clone();
        java.awt.Shape shape10 = shapeList3.getShape((int) (short) -1);
        int int11 = shapeList3.size();
        boolean boolean12 = shapeList0.equals((java.lang.Object) int11);
        java.awt.Shape shape14 = shapeList0.getShape((int) (short) 10);
        java.awt.Shape shape16 = null;
        shapeList0.setShape(9, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test764");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = null;
        boolean boolean8 = shapeList0.equals(obj7);
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) (short) 1);
        boolean boolean13 = shapeList9.equals((java.lang.Object) 1.0d);
        java.lang.Object obj14 = shapeList9.clone();
        boolean boolean15 = shapeList0.equals(obj14);
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj17 = shapeList16.clone();
        shapeList16.clear();
        java.awt.Shape shape20 = shapeList16.getShape((int) (short) 1);
        java.lang.Object obj21 = shapeList16.clone();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj23 = shapeList22.clone();
        shapeList22.clear();
        java.awt.Shape shape26 = shapeList22.getShape((int) (short) 1);
        boolean boolean28 = shapeList22.equals((java.lang.Object) (short) -1);
        java.lang.Object obj29 = null;
        boolean boolean30 = shapeList22.equals(obj29);
        int int31 = shapeList22.size();
        boolean boolean32 = shapeList16.equals((java.lang.Object) shapeList22);
        boolean boolean33 = shapeList0.equals((java.lang.Object) shapeList22);
        java.awt.Shape shape35 = shapeList22.getShape(10);
        java.awt.Shape shape37 = shapeList22.getShape((int) '4');
        java.lang.Object obj38 = shapeList22.clone();
        java.awt.Shape shape40 = null;
        shapeList22.setShape(0, shape40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList22", shapeList0.equals(shapeList22) ? shapeList0.hashCode() == shapeList22.hashCode() : true);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test765");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        boolean boolean5 = shapeList3.equals((java.lang.Object) (short) 1);
        boolean boolean7 = shapeList3.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = shapeList3.clone();
        java.awt.Shape shape10 = shapeList3.getShape((int) (short) -1);
        int int11 = shapeList3.size();
        boolean boolean12 = shapeList0.equals((java.lang.Object) int11);
        java.awt.Shape shape14 = shapeList0.getShape(9);
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        shapeList15.clear();
        int int17 = shapeList15.size();
        int int18 = shapeList15.size();
        int int19 = shapeList15.size();
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj21 = shapeList20.clone();
        shapeList20.clear();
        java.awt.Shape shape24 = shapeList20.getShape((int) (short) 1);
        java.lang.Object obj25 = shapeList20.clone();
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj27 = shapeList26.clone();
        shapeList26.clear();
        java.awt.Shape shape30 = shapeList26.getShape((int) (short) 1);
        boolean boolean32 = shapeList26.equals((java.lang.Object) (short) -1);
        java.lang.Object obj33 = null;
        boolean boolean34 = shapeList26.equals(obj33);
        int int35 = shapeList26.size();
        boolean boolean36 = shapeList20.equals((java.lang.Object) shapeList26);
        java.awt.Shape shape38 = shapeList20.getShape(100);
        boolean boolean40 = shapeList20.equals((java.lang.Object) false);
        java.awt.Shape shape42 = shapeList20.getShape(9);
        boolean boolean43 = shapeList15.equals((java.lang.Object) shapeList20);
        boolean boolean44 = shapeList0.equals((java.lang.Object) shapeList15);
        int int45 = shapeList15.size();
        shapeList15.clear();
        java.awt.Shape shape48 = null;
        shapeList15.setShape(100, shape48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList15", shapeList0.equals(shapeList15) ? shapeList0.hashCode() == shapeList15.hashCode() : true);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test766");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) -1);
        java.awt.Shape shape9 = shapeList0.getShape((int) 'a');
        java.lang.Object obj10 = shapeList0.clone();
        java.awt.Shape shape12 = null;
        shapeList0.setShape((int) '4', shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test767");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape(1);
        java.awt.Shape shape9 = shapeList0.getShape(100);
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) (byte) 10, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test768");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        shapeList0.clear();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        shapeList7.clear();
        int int9 = shapeList7.size();
        java.lang.Object obj10 = shapeList7.clone();
        boolean boolean11 = shapeList0.equals(obj10);
        java.awt.Shape shape13 = shapeList0.getShape((int) '#');
        java.awt.Shape shape15 = shapeList0.getShape((int) (byte) -1);
        java.lang.Object obj16 = shapeList0.clone();
        int int17 = shapeList0.size();
        boolean boolean19 = shapeList0.equals((java.lang.Object) 34);
        java.awt.Shape shape21 = null;
        shapeList0.setShape(8, shape21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test769");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape(1);
        java.awt.Shape shape9 = shapeList0.getShape(100);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        int int12 = shapeList0.size();
        java.awt.Shape shape14 = shapeList0.getShape((int) (byte) 1);
        java.awt.Shape shape16 = null;
        shapeList0.setShape(9, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test770");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 0, shape6);
        java.awt.Shape shape9 = null;
        shapeList0.setShape((int) (byte) 10, shape9);
        boolean boolean12 = shapeList0.equals((java.lang.Object) (-1));
        int int13 = shapeList0.size();
        java.lang.Object obj14 = shapeList0.clone();
        int int15 = shapeList0.size();
        java.awt.Shape shape17 = shapeList0.getShape((int) (short) 0);
        java.lang.Object obj18 = shapeList0.clone();
        int int19 = shapeList0.size();
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj14", shapeList0.equals(obj14) ? shapeList0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test771");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape(101);
        int int11 = shapeList0.size();
        java.awt.Shape shape13 = null;
        shapeList0.setShape(1, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test772");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 0, shape6);
        java.awt.Shape shape9 = null;
        shapeList0.setShape((int) (byte) 10, shape9);
        boolean boolean12 = shapeList0.equals((java.lang.Object) (-1));
        shapeList0.clear();
        java.lang.Object obj14 = shapeList0.clone();
        java.awt.Shape shape16 = shapeList0.getShape(2);
        shapeList0.clear();
        int int18 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj20 = shapeList0.clone();
        java.awt.Shape shape22 = null;
        shapeList0.setShape(1, shape22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj14", shapeList0.equals(obj14) ? shapeList0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test773");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        boolean boolean5 = shapeList3.equals((java.lang.Object) (short) 1);
        boolean boolean7 = shapeList3.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = shapeList3.clone();
        java.awt.Shape shape10 = shapeList3.getShape((int) (short) -1);
        int int11 = shapeList3.size();
        boolean boolean12 = shapeList0.equals((java.lang.Object) int11);
        int int13 = shapeList0.size();
        java.awt.Shape shape15 = shapeList0.getShape(0);
        java.awt.Shape shape17 = shapeList0.getShape(101);
        java.lang.Object obj18 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj20 = shapeList19.clone();
        shapeList19.clear();
        java.lang.Object obj22 = shapeList19.clone();
        int int23 = shapeList19.size();
        java.lang.Object obj24 = shapeList19.clone();
        shapeList19.clear();
        shapeList19.clear();
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj28 = shapeList27.clone();
        shapeList27.clear();
        java.lang.Object obj30 = shapeList27.clone();
        int int31 = shapeList27.size();
        java.lang.Object obj32 = shapeList27.clone();
        shapeList27.clear();
        shapeList27.clear();
        org.jfree.chart.util.ShapeList shapeList35 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj36 = shapeList35.clone();
        shapeList35.clear();
        shapeList35.clear();
        java.awt.Shape shape40 = shapeList35.getShape((int) '#');
        java.awt.Shape shape42 = shapeList35.getShape(1);
        java.awt.Shape shape44 = shapeList35.getShape((int) (byte) 0);
        boolean boolean45 = shapeList27.equals((java.lang.Object) shapeList35);
        org.jfree.chart.util.ShapeList shapeList46 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj47 = shapeList46.clone();
        java.lang.Object obj48 = shapeList46.clone();
        boolean boolean49 = shapeList27.equals((java.lang.Object) shapeList46);
        boolean boolean50 = shapeList19.equals((java.lang.Object) boolean49);
        int int51 = shapeList19.size();
        java.awt.Shape shape53 = shapeList19.getShape((int) '4');
        java.lang.Object obj54 = shapeList19.clone();
        java.lang.Class<?> wildcardClass55 = shapeList19.getClass();
        boolean boolean56 = shapeList0.equals((java.lang.Object) shapeList19);
        java.awt.Shape shape58 = null;
        shapeList0.setShape((int) (byte) 100, shape58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test774");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) ' ', shape4);
        java.lang.Object obj6 = shapeList0.clone();
        java.lang.Object obj7 = shapeList0.clone();
        java.awt.Shape shape9 = shapeList0.getShape(33);
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape12 = null;
        shapeList10.setShape(8, shape12);
        int int14 = shapeList10.size();
        shapeList10.clear();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        shapeList16.clear();
        java.lang.Object obj18 = shapeList16.clone();
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        boolean boolean21 = shapeList19.equals((java.lang.Object) (short) 1);
        boolean boolean23 = shapeList19.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj24 = shapeList19.clone();
        java.awt.Shape shape26 = shapeList19.getShape((int) (short) -1);
        int int27 = shapeList19.size();
        boolean boolean28 = shapeList16.equals((java.lang.Object) int27);
        shapeList16.clear();
        boolean boolean30 = shapeList10.equals((java.lang.Object) shapeList16);
        shapeList10.clear();
        java.lang.Class<?> wildcardClass32 = shapeList10.getClass();
        boolean boolean33 = shapeList0.equals((java.lang.Object) wildcardClass32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test775");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        int int2 = shapeList0.size();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) '#', shape4);
        java.lang.Object obj6 = shapeList0.clone();
        java.lang.Object obj7 = shapeList0.clone();
        java.awt.Shape shape9 = null;
        shapeList0.setShape(1, shape9);
        java.awt.Shape shape12 = null;
        shapeList0.setShape((int) (byte) 0, shape12);
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test776");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj5 = shapeList4.clone();
        shapeList4.clear();
        java.awt.Shape shape8 = shapeList4.getShape((int) (short) 1);
        boolean boolean10 = shapeList4.equals((java.lang.Object) (short) -1);
        boolean boolean11 = shapeList0.equals((java.lang.Object) shapeList4);
        java.awt.Shape shape13 = null;
        shapeList0.setShape(101, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test777");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        int int4 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        shapeList6.clear();
        java.lang.Object obj8 = shapeList6.clone();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) (short) 1);
        boolean boolean13 = shapeList9.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = shapeList9.clone();
        java.awt.Shape shape16 = shapeList9.getShape((int) (short) -1);
        int int17 = shapeList9.size();
        boolean boolean18 = shapeList6.equals((java.lang.Object) int17);
        shapeList6.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList6);
        shapeList6.clear();
        java.lang.Object obj22 = shapeList6.clone();
        java.awt.Shape shape24 = shapeList6.getShape((int) 'a');
        shapeList6.clear();
        int int26 = shapeList6.size();
        java.awt.Shape shape28 = null;
        shapeList6.setShape(36, shape28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test778");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        int int4 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        shapeList6.clear();
        java.lang.Object obj8 = shapeList6.clone();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) (short) 1);
        boolean boolean13 = shapeList9.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = shapeList9.clone();
        java.awt.Shape shape16 = shapeList9.getShape((int) (short) -1);
        int int17 = shapeList9.size();
        boolean boolean18 = shapeList6.equals((java.lang.Object) int17);
        shapeList6.clear();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList6);
        java.awt.Shape shape22 = shapeList6.getShape((int) (byte) 10);
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape25 = null;
        shapeList23.setShape(8, shape25);
        int int27 = shapeList23.size();
        shapeList23.clear();
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        shapeList29.clear();
        java.lang.Object obj31 = shapeList29.clone();
        org.jfree.chart.util.ShapeList shapeList32 = new org.jfree.chart.util.ShapeList();
        boolean boolean34 = shapeList32.equals((java.lang.Object) (short) 1);
        boolean boolean36 = shapeList32.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj37 = shapeList32.clone();
        java.awt.Shape shape39 = shapeList32.getShape((int) (short) -1);
        int int40 = shapeList32.size();
        boolean boolean41 = shapeList29.equals((java.lang.Object) int40);
        shapeList29.clear();
        boolean boolean43 = shapeList23.equals((java.lang.Object) shapeList29);
        shapeList29.clear();
        java.lang.Object obj45 = shapeList29.clone();
        java.awt.Shape shape47 = shapeList29.getShape((int) 'a');
        shapeList29.clear();
        int int49 = shapeList29.size();
        java.lang.Class<?> wildcardClass50 = shapeList29.getClass();
        boolean boolean51 = shapeList6.equals((java.lang.Object) wildcardClass50);
        org.jfree.chart.util.ShapeList shapeList52 = new org.jfree.chart.util.ShapeList();
        boolean boolean54 = shapeList52.equals((java.lang.Object) (short) 1);
        boolean boolean56 = shapeList52.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape58 = null;
        shapeList52.setShape((int) (byte) 0, shape58);
        int int60 = shapeList52.size();
        shapeList52.clear();
        shapeList52.clear();
        boolean boolean63 = shapeList6.equals((java.lang.Object) shapeList52);
        java.awt.Shape shape65 = null;
        shapeList6.setShape((int) (byte) 10, shape65);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test779");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 'a');
        java.lang.Object obj7 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj9 = shapeList8.clone();
        java.lang.Object obj10 = shapeList8.clone();
        java.awt.Shape shape12 = shapeList8.getShape(1);
        shapeList8.clear();
        shapeList8.clear();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj16 = shapeList15.clone();
        shapeList15.clear();
        java.awt.Shape shape19 = shapeList15.getShape((int) (short) 1);
        boolean boolean21 = shapeList15.equals((java.lang.Object) 'a');
        java.lang.Object obj22 = shapeList15.clone();
        boolean boolean23 = shapeList8.equals(obj22);
        boolean boolean24 = shapeList0.equals((java.lang.Object) shapeList8);
        shapeList0.clear();
        java.awt.Shape shape27 = shapeList0.getShape(11);
        shapeList0.clear();
        java.lang.Object obj29 = shapeList0.clone();
        java.awt.Shape shape31 = null;
        shapeList0.setShape((int) (byte) 100, shape31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test780");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj5 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj7 = shapeList6.clone();
        shapeList6.clear();
        java.awt.Shape shape10 = shapeList6.getShape((int) (short) 1);
        boolean boolean12 = shapeList6.equals((java.lang.Object) (short) -1);
        java.lang.Object obj13 = null;
        boolean boolean14 = shapeList6.equals(obj13);
        int int15 = shapeList6.size();
        boolean boolean16 = shapeList0.equals((java.lang.Object) shapeList6);
        java.awt.Shape shape18 = shapeList0.getShape(100);
        boolean boolean20 = shapeList0.equals((java.lang.Object) false);
        java.awt.Shape shape22 = shapeList0.getShape(9);
        java.awt.Shape shape24 = shapeList0.getShape(100);
        java.lang.Object obj25 = shapeList0.clone();
        java.lang.Object obj26 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape29 = null;
        shapeList0.setShape(9, shape29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test781");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1));
        int int5 = shapeList0.size();
        java.awt.Shape shape7 = shapeList0.getShape((int) (byte) -1);
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = shapeList0.getShape((int) (short) 100);
        java.awt.Shape shape13 = null;
        shapeList0.setShape(11, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test782");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj5 = shapeList0.clone();
        java.lang.Object obj6 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        java.lang.Object obj9 = shapeList7.clone();
        java.awt.Shape shape11 = shapeList7.getShape(1);
        shapeList7.clear();
        java.awt.Shape shape14 = shapeList7.getShape((int) (short) -1);
        shapeList7.clear();
        boolean boolean16 = shapeList0.equals((java.lang.Object) shapeList7);
        java.awt.Shape shape18 = null;
        shapeList7.setShape(101, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test783");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj5 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj7 = shapeList6.clone();
        shapeList6.clear();
        java.awt.Shape shape10 = shapeList6.getShape((int) (short) 1);
        boolean boolean12 = shapeList6.equals((java.lang.Object) (short) -1);
        java.lang.Object obj13 = null;
        boolean boolean14 = shapeList6.equals(obj13);
        int int15 = shapeList6.size();
        boolean boolean16 = shapeList0.equals((java.lang.Object) shapeList6);
        java.awt.Shape shape18 = shapeList0.getShape(100);
        shapeList0.clear();
        int int20 = shapeList0.size();
        int int21 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj23 = shapeList0.clone();
        java.lang.Object obj24 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape27 = null;
        shapeList0.setShape(9, shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test784");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape((int) (short) 0);
        java.awt.Shape shape12 = shapeList0.getShape((int) (byte) 10);
        java.lang.Object obj13 = shapeList0.clone();
        java.lang.Object obj14 = shapeList0.clone();
        java.awt.Shape shape16 = null;
        shapeList0.setShape(0, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test785");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 10);
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj5 = shapeList4.clone();
        shapeList4.clear();
        shapeList4.clear();
        java.lang.Object obj8 = shapeList4.clone();
        boolean boolean10 = shapeList4.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        shapeList11.clear();
        int int13 = shapeList11.size();
        int int14 = shapeList11.size();
        boolean boolean15 = shapeList4.equals((java.lang.Object) int14);
        boolean boolean16 = shapeList0.equals((java.lang.Object) int14);
        shapeList0.clear();
        java.awt.Shape shape19 = shapeList0.getShape((int) (short) 100);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj22 = shapeList21.clone();
        shapeList21.clear();
        java.awt.Shape shape25 = shapeList21.getShape((int) (short) 1);
        boolean boolean27 = shapeList21.equals((java.lang.Object) (short) -1);
        shapeList21.clear();
        shapeList21.clear();
        java.awt.Shape shape31 = shapeList21.getShape((int) (short) 0);
        java.awt.Shape shape33 = shapeList21.getShape((int) (byte) 10);
        org.jfree.chart.util.ShapeList shapeList34 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj35 = shapeList34.clone();
        shapeList34.clear();
        java.awt.Shape shape38 = shapeList34.getShape((int) ' ');
        shapeList34.clear();
        boolean boolean40 = shapeList21.equals((java.lang.Object) shapeList34);
        boolean boolean41 = shapeList0.equals((java.lang.Object) shapeList21);
        java.awt.Shape shape43 = shapeList0.getShape(53);
        java.awt.Shape shape45 = null;
        shapeList0.setShape((int) (short) 1, shape45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test786");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 10);
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj5 = shapeList4.clone();
        shapeList4.clear();
        shapeList4.clear();
        java.lang.Object obj8 = shapeList4.clone();
        boolean boolean10 = shapeList4.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        shapeList11.clear();
        int int13 = shapeList11.size();
        int int14 = shapeList11.size();
        boolean boolean15 = shapeList4.equals((java.lang.Object) int14);
        boolean boolean16 = shapeList0.equals((java.lang.Object) int14);
        shapeList0.clear();
        java.lang.Object obj18 = shapeList0.clone();
        java.awt.Shape shape20 = null;
        shapeList0.setShape((int) (byte) 10, shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test787");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        boolean boolean5 = shapeList3.equals((java.lang.Object) (short) 1);
        boolean boolean7 = shapeList3.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = shapeList3.clone();
        java.awt.Shape shape10 = shapeList3.getShape((int) (short) -1);
        int int11 = shapeList3.size();
        boolean boolean12 = shapeList0.equals((java.lang.Object) int11);
        java.awt.Shape shape14 = shapeList0.getShape((int) (short) 10);
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        boolean boolean17 = shapeList15.equals((java.lang.Object) (short) 1);
        boolean boolean19 = shapeList15.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = shapeList15.clone();
        java.awt.Shape shape22 = shapeList15.getShape((int) (short) -1);
        int int23 = shapeList15.size();
        int int24 = shapeList15.size();
        java.awt.Shape shape26 = shapeList15.getShape((int) '4');
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj28 = shapeList27.clone();
        shapeList27.clear();
        java.awt.Shape shape31 = shapeList27.getShape((int) (short) 1);
        java.lang.Object obj32 = shapeList27.clone();
        java.awt.Shape shape34 = shapeList27.getShape((int) (short) 100);
        java.lang.Object obj35 = shapeList27.clone();
        java.lang.Object obj36 = shapeList27.clone();
        boolean boolean37 = shapeList15.equals(obj36);
        boolean boolean38 = shapeList0.equals((java.lang.Object) boolean37);
        java.lang.Object obj39 = shapeList0.clone();
        java.awt.Shape shape41 = null;
        shapeList0.setShape(10, shape41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test788");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.awt.Shape shape3 = shapeList0.getShape(10);
        int int4 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj6 = shapeList5.clone();
        shapeList5.clear();
        java.awt.Shape shape9 = shapeList5.getShape((int) (short) 1);
        java.lang.Object obj10 = shapeList5.clone();
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj12 = shapeList11.clone();
        shapeList11.clear();
        java.awt.Shape shape15 = shapeList11.getShape((int) (short) 1);
        boolean boolean17 = shapeList11.equals((java.lang.Object) (short) -1);
        java.lang.Object obj18 = null;
        boolean boolean19 = shapeList11.equals(obj18);
        int int20 = shapeList11.size();
        boolean boolean21 = shapeList5.equals((java.lang.Object) shapeList11);
        java.awt.Shape shape23 = shapeList5.getShape(100);
        boolean boolean25 = shapeList5.equals((java.lang.Object) false);
        shapeList5.clear();
        java.awt.Shape shape28 = shapeList5.getShape(8);
        boolean boolean29 = shapeList0.equals((java.lang.Object) 8);
        java.awt.Shape shape31 = null;
        shapeList0.setShape(11, shape31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test789");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        boolean boolean5 = shapeList3.equals((java.lang.Object) (short) 1);
        boolean boolean7 = shapeList3.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj8 = shapeList3.clone();
        java.awt.Shape shape10 = shapeList3.getShape((int) (short) -1);
        int int11 = shapeList3.size();
        boolean boolean12 = shapeList0.equals((java.lang.Object) int11);
        int int13 = shapeList0.size();
        java.awt.Shape shape15 = shapeList0.getShape((int) (short) 10);
        java.lang.Object obj16 = shapeList0.clone();
        java.lang.Object obj17 = shapeList0.clone();
        java.lang.Object obj18 = shapeList0.clone();
        java.lang.Object obj19 = shapeList0.clone();
        java.awt.Shape shape21 = null;
        shapeList0.setShape(36, shape21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test790");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj12 = shapeList0.clone();
        java.awt.Shape shape14 = null;
        shapeList0.setShape(98, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }
}

