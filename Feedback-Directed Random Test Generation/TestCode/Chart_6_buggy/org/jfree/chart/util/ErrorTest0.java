package org.jfree.chart.util;

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) 'a', shape6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        java.awt.Shape shape6 = null;
        shapeList0.setShape(100, shape6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.awt.Shape shape3 = null;
        shapeList0.setShape(0, shape3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = null;
        boolean boolean8 = shapeList0.equals(obj7);
        java.awt.Shape shape10 = null;
        shapeList0.setShape(1, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (short) 10, shape6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = null;
        boolean boolean8 = shapeList0.equals(obj7);
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) 'a', shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = null;
        shapeList0.setShape(0, shape7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape(0, shape4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 10, shape6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = null;
        shapeList0.setShape((int) '4', shape5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 10, shape4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = null;
        boolean boolean8 = shapeList0.equals(obj7);
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) (short) 1, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 100);
        java.awt.Shape shape9 = null;
        shapeList0.setShape(10, shape9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
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
        java.awt.Shape shape14 = null;
        shapeList0.setShape((int) (short) 100, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 0, shape6);
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        shapeList8.clear();
        java.lang.Object obj10 = shapeList8.clone();
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        boolean boolean13 = shapeList11.equals((java.lang.Object) (short) 1);
        boolean boolean15 = shapeList11.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj16 = shapeList11.clone();
        java.awt.Shape shape18 = shapeList11.getShape((int) (short) -1);
        int int19 = shapeList11.size();
        boolean boolean20 = shapeList8.equals((java.lang.Object) int19);
        boolean boolean21 = shapeList0.equals((java.lang.Object) shapeList8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        java.lang.Object obj5 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape9 = null;
        shapeList0.setShape((int) (byte) 0, shape9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
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
        shapeList0.setShape((int) '4', shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) -1);
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        int int10 = shapeList0.size();
        java.awt.Shape shape12 = null;
        shapeList0.setShape((int) ' ', shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj5 = shapeList0.clone();
        java.lang.Object obj6 = shapeList0.clone();
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) ' ', shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
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
        java.awt.Shape shape17 = shapeList0.getShape(9);
        java.awt.Shape shape19 = null;
        shapeList0.setShape((int) (short) 0, shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.lang.Object obj6 = shapeList0.clone();
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = null;
        shapeList0.setShape((int) ' ', shape7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        boolean boolean9 = shapeList7.equals((java.lang.Object) (short) 1);
        boolean boolean11 = shapeList7.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape13 = null;
        shapeList7.setShape((int) (byte) 0, shape13);
        boolean boolean15 = shapeList0.equals((java.lang.Object) shapeList7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
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
        int int16 = shapeList0.size();
        java.awt.Shape shape18 = null;
        shapeList0.setShape((int) (byte) 100, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj5 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) (byte) 100, shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj5 = shapeList0.clone();
        java.lang.Object obj6 = shapeList0.clone();
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) (short) 1, shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) '4', shape4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 'a');
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) (byte) 10, shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 10);
        java.awt.Shape shape5 = null;
        shapeList0.setShape(9, shape5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
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
        java.awt.Shape shape16 = shapeList0.getShape((int) (short) 10);
        shapeList0.clear();
        java.awt.Shape shape19 = null;
        shapeList0.setShape((int) (short) 0, shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape(0, shape6);
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = null;
        shapeList0.setShape(8, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 0, shape6);
        int int8 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        boolean boolean12 = shapeList10.equals((java.lang.Object) (short) 1);
        boolean boolean14 = shapeList10.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape16 = null;
        shapeList10.setShape(0, shape16);
        java.lang.Object obj18 = shapeList10.clone();
        boolean boolean19 = shapeList0.equals((java.lang.Object) shapeList10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape(0, shape6);
        java.lang.Object obj8 = shapeList0.clone();
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
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
        java.awt.Shape shape17 = null;
        shapeList0.setShape((int) '#', shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(1);
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (short) 100, shape6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
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
        java.awt.Shape shape16 = shapeList0.getShape((int) (short) 10);
        java.awt.Shape shape18 = null;
        shapeList0.setShape(100, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
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
        java.awt.Shape shape17 = null;
        shapeList0.setShape(10, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj5 = shapeList0.clone();
        shapeList0.clear();
        int int7 = shapeList0.size();
        java.awt.Shape shape9 = null;
        shapeList0.setShape((int) (byte) 1, shape9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) -1);
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        int int10 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape13 = null;
        shapeList0.setShape((int) (byte) 100, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
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
        java.awt.Shape shape35 = null;
        shapeList22.setShape(1, shape35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList22", shapeList0.equals(shapeList22) ? shapeList0.hashCode() == shapeList22.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
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
        java.awt.Shape shape15 = null;
        shapeList0.setShape((int) 'a', shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) ' ');
        shapeList0.clear();
        java.awt.Shape shape7 = null;
        shapeList0.setShape(0, shape7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) -1);
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) 'a', shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        java.lang.Object obj5 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj7 = shapeList6.clone();
        shapeList6.clear();
        shapeList6.clear();
        java.lang.Object obj10 = shapeList6.clone();
        boolean boolean12 = shapeList6.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        shapeList13.clear();
        int int15 = shapeList13.size();
        int int16 = shapeList13.size();
        boolean boolean17 = shapeList6.equals((java.lang.Object) int16);
        java.lang.Object obj18 = shapeList6.clone();
        boolean boolean19 = shapeList0.equals((java.lang.Object) shapeList6);
        java.awt.Shape shape21 = null;
        shapeList6.setShape(101, shape21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        java.awt.Shape shape6 = shapeList0.getShape((int) (short) 1);
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape9 = null;
        shapeList7.setShape(8, shape9);
        java.awt.Shape shape12 = shapeList7.getShape((int) (byte) 100);
        java.awt.Shape shape14 = shapeList7.getShape((int) (byte) 100);
        boolean boolean15 = shapeList0.equals((java.lang.Object) shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        int int2 = shapeList0.size();
        java.awt.Shape shape4 = shapeList0.getShape(8);
        java.awt.Shape shape6 = null;
        shapeList0.setShape(0, shape6);
        java.lang.Object obj8 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape11 = null;
        shapeList9.setShape(8, shape11);
        int int13 = shapeList9.size();
        boolean boolean14 = shapeList0.equals((java.lang.Object) int13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
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
        java.awt.Shape shape14 = null;
        shapeList0.setShape(101, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) -1);
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        int int10 = shapeList0.size();
        java.awt.Shape shape12 = shapeList0.getShape((int) '#');
        java.awt.Shape shape14 = null;
        shapeList0.setShape(10, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = null;
        shapeList0.setShape((int) '#', shape5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        java.awt.Shape shape5 = null;
        shapeList0.setShape((int) '4', shape5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj3", shapeList0.equals(obj3) ? shapeList0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
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
        java.awt.Shape shape19 = null;
        shapeList0.setShape(33, shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) ' ', shape4);
        java.lang.Object obj6 = shapeList0.clone();
        java.lang.Object obj7 = shapeList0.clone();
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
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
        java.awt.Shape shape24 = null;
        shapeList0.setShape(1, shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        int int6 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        int int8 = shapeList7.size();
        shapeList7.clear();
        java.awt.Shape shape11 = null;
        shapeList7.setShape((int) (short) 100, shape11);
        java.lang.Object obj13 = shapeList7.clone();
        java.lang.Object obj14 = shapeList7.clone();
        java.lang.Object obj15 = shapeList7.clone();
        boolean boolean16 = shapeList0.equals(obj15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape8 = null;
        shapeList0.setShape(100, shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
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
        java.awt.Shape shape34 = null;
        shapeList25.setShape((int) (byte) 10, shape34);
        boolean boolean37 = shapeList25.equals((java.lang.Object) (-1));
        int int38 = shapeList25.size();
        boolean boolean39 = shapeList8.equals((java.lang.Object) shapeList25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList25", shapeList0.equals(shapeList25) ? shapeList0.hashCode() == shapeList25.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape(1);
        java.awt.Shape shape9 = shapeList0.getShape((int) ' ');
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) '#', shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape(0, shape6);
        java.lang.Object obj8 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj10 = shapeList9.clone();
        shapeList9.clear();
        java.lang.Object obj12 = shapeList9.clone();
        int int13 = shapeList9.size();
        boolean boolean14 = shapeList0.equals((java.lang.Object) int13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) (byte) 0, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
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
        java.awt.Shape shape17 = null;
        shapeList0.setShape(1, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape((int) '#');
        java.awt.Shape shape11 = null;
        shapeList0.setShape(33, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
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
        java.awt.Shape shape15 = null;
        shapeList0.setShape((int) (short) 10, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
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
        java.awt.Shape shape17 = null;
        shapeList0.setShape((int) (short) 100, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
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
        java.awt.Shape shape18 = null;
        shapeList0.setShape((int) (byte) 100, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
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
        java.awt.Shape shape20 = null;
        shapeList0.setShape((int) (short) 10, shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        java.lang.Object obj5 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape8 = shapeList0.getShape(0);
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) '#', shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
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
        java.awt.Shape shape26 = null;
        shapeList0.setShape((int) (short) 10, shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.lang.Object obj6 = shapeList0.clone();
        java.lang.Object obj7 = shapeList0.clone();
        java.lang.Object obj8 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj10 = shapeList9.clone();
        shapeList9.clear();
        java.awt.Shape shape13 = shapeList9.getShape((int) (short) 1);
        boolean boolean15 = shapeList9.equals((java.lang.Object) (short) -1);
        java.lang.Object obj16 = null;
        boolean boolean17 = shapeList9.equals(obj16);
        int int18 = shapeList9.size();
        java.lang.Object obj19 = null;
        boolean boolean20 = shapeList9.equals(obj19);
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        boolean boolean23 = shapeList21.equals((java.lang.Object) (short) 1);
        boolean boolean25 = shapeList21.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj26 = shapeList21.clone();
        java.awt.Shape shape28 = shapeList21.getShape((int) (short) -1);
        int int29 = shapeList21.size();
        int int30 = shapeList21.size();
        int int31 = shapeList21.size();
        java.awt.Shape shape33 = shapeList21.getShape((int) '#');
        boolean boolean34 = shapeList9.equals((java.lang.Object) '#');
        boolean boolean35 = shapeList0.equals((java.lang.Object) boolean34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
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
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        boolean boolean18 = shapeList16.equals((java.lang.Object) (short) 1);
        boolean boolean20 = shapeList16.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape22 = null;
        shapeList16.setShape((int) (byte) 0, shape22);
        java.awt.Shape shape25 = null;
        shapeList16.setShape((int) (byte) 10, shape25);
        boolean boolean28 = shapeList16.equals((java.lang.Object) (-1));
        java.awt.Shape shape30 = null;
        shapeList16.setShape(8, shape30);
        int int32 = shapeList16.size();
        boolean boolean33 = shapeList0.equals((java.lang.Object) int32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList16", shapeList0.equals(shapeList16) ? shapeList0.hashCode() == shapeList16.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        int int2 = shapeList0.size();
        java.awt.Shape shape4 = shapeList0.getShape(8);
        java.awt.Shape shape6 = null;
        shapeList0.setShape(0, shape6);
        java.lang.Object obj8 = shapeList0.clone();
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
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
        java.awt.Shape shape15 = null;
        shapeList0.setShape(0, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
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
        java.awt.Shape shape26 = null;
        shapeList0.setShape((int) (short) 100, shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        java.awt.Shape shape5 = shapeList0.getShape((int) (byte) 100);
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
        java.awt.Shape shape20 = shapeList6.getShape(9);
        int int21 = shapeList6.size();
        java.lang.Object obj22 = shapeList6.clone();
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        boolean boolean24 = shapeList6.equals((java.lang.Object) shapeList23);
        java.awt.Shape shape26 = shapeList23.getShape((int) (byte) 100);
        boolean boolean27 = shapeList0.equals((java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
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
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        boolean boolean14 = shapeList12.equals((java.lang.Object) (short) 1);
        boolean boolean16 = shapeList12.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj17 = shapeList12.clone();
        java.awt.Shape shape19 = shapeList12.getShape((int) (short) -1);
        int int20 = shapeList12.size();
        int int21 = shapeList12.size();
        int int22 = shapeList12.size();
        java.awt.Shape shape24 = shapeList12.getShape((int) '#');
        boolean boolean25 = shapeList0.equals((java.lang.Object) '#');
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        shapeList26.clear();
        java.lang.Object obj28 = shapeList26.clone();
        boolean boolean30 = shapeList26.equals((java.lang.Object) (-1));
        int int31 = shapeList26.size();
        java.awt.Shape shape33 = shapeList26.getShape((int) (byte) -1);
        java.awt.Shape shape35 = shapeList26.getShape((int) (short) 0);
        boolean boolean36 = shapeList0.equals((java.lang.Object) shapeList26);
        int int37 = shapeList0.size();
        java.awt.Shape shape39 = null;
        shapeList0.setShape((int) (byte) 0, shape39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
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
        java.awt.Shape shape26 = null;
        shapeList8.setShape(9, shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        int int2 = shapeList0.size();
        java.awt.Shape shape4 = shapeList0.getShape(8);
        java.awt.Shape shape6 = null;
        shapeList0.setShape(0, shape6);
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        boolean boolean10 = shapeList8.equals((java.lang.Object) (short) 1);
        boolean boolean12 = shapeList8.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj13 = shapeList8.clone();
        java.awt.Shape shape15 = shapeList8.getShape((int) (short) -1);
        int int16 = shapeList8.size();
        int int17 = shapeList8.size();
        int int18 = shapeList8.size();
        shapeList8.clear();
        java.lang.Object obj20 = shapeList8.clone();
        boolean boolean21 = shapeList0.equals(obj20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
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
        java.awt.Shape shape33 = null;
        shapeList0.setShape((int) (byte) 0, shape33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        java.lang.Object obj5 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) (byte) 0, shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
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
        int int13 = shapeList4.size();
        java.awt.Shape shape15 = null;
        shapeList4.setShape(0, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        int int6 = shapeList0.size();
        java.lang.Object obj7 = null;
        boolean boolean8 = shapeList0.equals(obj7);
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) ' ', shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj8 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        int int10 = shapeList9.size();
        shapeList9.clear();
        java.awt.Shape shape13 = null;
        shapeList9.setShape((int) (short) 100, shape13);
        java.awt.Shape shape16 = shapeList9.getShape((int) '4');
        boolean boolean17 = shapeList0.equals((java.lang.Object) shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) -1);
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        java.awt.Shape shape11 = null;
        shapeList0.setShape(9, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 'a');
        java.lang.Object obj7 = shapeList0.clone();
        int int8 = shapeList0.size();
        java.lang.Object obj9 = shapeList0.clone();
        boolean boolean11 = shapeList0.equals((java.lang.Object) 0.0f);
        java.awt.Shape shape13 = null;
        shapeList0.setShape((int) '#', shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        java.awt.Shape shape4 = shapeList0.getShape((int) (byte) 10);
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) (short) 1);
        boolean boolean9 = shapeList5.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape11 = null;
        shapeList5.setShape(0, shape11);
        java.lang.Class<?> wildcardClass13 = shapeList5.getClass();
        boolean boolean14 = shapeList0.equals((java.lang.Object) shapeList5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) -1);
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        int int10 = shapeList0.size();
        shapeList0.clear();
        int int12 = shapeList0.size();
        java.awt.Shape shape14 = null;
        shapeList0.setShape((int) (short) 10, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) (short) 10, shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '4');
        java.awt.Shape shape7 = null;
        shapeList0.setShape(0, shape7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 'a');
        java.lang.Object obj7 = shapeList0.clone();
        int int8 = shapeList0.size();
        java.lang.Object obj9 = shapeList0.clone();
        java.lang.Object obj10 = null;
        boolean boolean11 = shapeList0.equals(obj10);
        java.awt.Shape shape13 = null;
        shapeList0.setShape(9, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
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
        java.awt.Shape shape17 = null;
        shapeList0.setShape(1, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape12 = null;
        shapeList0.setShape(101, shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 0, shape6);
        java.awt.Shape shape9 = null;
        shapeList0.setShape((int) (byte) 10, shape9);
        boolean boolean12 = shapeList0.equals((java.lang.Object) (-1));
        int int13 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj15 = shapeList14.clone();
        shapeList14.clear();
        java.awt.Shape shape18 = shapeList14.getShape((int) (short) 1);
        java.lang.Object obj19 = shapeList14.clone();
        java.awt.Shape shape21 = shapeList14.getShape((int) (short) 100);
        java.lang.Object obj22 = shapeList14.clone();
        java.lang.Object obj23 = shapeList14.clone();
        java.lang.Object obj24 = shapeList14.clone();
        boolean boolean25 = shapeList0.equals(obj24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        java.lang.Object obj5 = shapeList0.clone();
        int int6 = shapeList0.size();
        int int7 = shapeList0.size();
        java.awt.Shape shape9 = shapeList0.getShape(0);
        int int10 = shapeList0.size();
        java.awt.Shape shape12 = null;
        shapeList0.setShape((int) (byte) 100, shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
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
        shapeList8.clear();
        java.awt.Shape shape21 = shapeList8.getShape(9);
        java.awt.Shape shape23 = null;
        shapeList8.setShape(9, shape23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.lang.Object obj6 = shapeList0.clone();
        java.lang.Object obj7 = shapeList0.clone();
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape(0);
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
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
        java.awt.Shape shape12 = null;
        shapeList0.setShape(0, shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
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
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        shapeList14.clear();
        java.awt.Shape shape17 = shapeList14.getShape(10);
        int int18 = shapeList14.size();
        java.lang.Object obj19 = shapeList14.clone();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
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
        java.awt.Shape shape18 = null;
        shapeList0.setShape(1, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        int int4 = shapeList0.size();
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = null;
        shapeList0.setShape((int) '4', shape7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        shapeList0.clear();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape10 = null;
        shapeList0.setShape(33, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 100, shape6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj4", shapeList0.equals(obj4) ? shapeList0.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(1);
        java.awt.Shape shape6 = null;
        shapeList0.setShape(33, shape6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape5 = null;
        shapeList0.setShape((int) (byte) 0, shape5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 'a');
        int int7 = shapeList0.size();
        java.awt.Shape shape9 = null;
        shapeList0.setShape((int) 'a', shape9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 10);
        java.awt.Shape shape5 = null;
        shapeList0.setShape((int) (short) 10, shape5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        java.lang.Object obj5 = null;
        boolean boolean6 = shapeList0.equals(obj5);
        java.awt.Shape shape8 = null;
        shapeList0.setShape(11, shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 'a');
        java.lang.Object obj7 = shapeList0.clone();
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) (short) 10, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = shapeList0.clone();
        java.lang.Object obj8 = shapeList0.clone();
        java.lang.Object obj9 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        shapeList10.clear();
        int int12 = shapeList10.size();
        java.awt.Shape shape14 = null;
        shapeList10.setShape((int) '#', shape14);
        java.lang.Object obj16 = shapeList10.clone();
        boolean boolean17 = shapeList0.equals((java.lang.Object) shapeList10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
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
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        boolean boolean14 = shapeList12.equals((java.lang.Object) (short) 1);
        boolean boolean16 = shapeList12.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj17 = shapeList12.clone();
        java.awt.Shape shape19 = shapeList12.getShape((int) (short) -1);
        int int20 = shapeList12.size();
        int int21 = shapeList12.size();
        int int22 = shapeList12.size();
        java.awt.Shape shape24 = shapeList12.getShape((int) '#');
        boolean boolean25 = shapeList0.equals((java.lang.Object) '#');
        java.awt.Shape shape27 = null;
        shapeList0.setShape((int) (byte) 100, shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
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
        java.awt.Shape shape28 = null;
        shapeList8.setShape(1, shape28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
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
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj14", shapeList0.equals(obj14) ? shapeList0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
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
        java.lang.Object obj16 = null;
        boolean boolean17 = shapeList0.equals(obj16);
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        int int19 = shapeList18.size();
        shapeList18.clear();
        java.awt.Shape shape22 = null;
        shapeList18.setShape((int) (short) 100, shape22);
        java.lang.Object obj24 = shapeList18.clone();
        java.lang.Object obj25 = shapeList18.clone();
        int int26 = shapeList18.size();
        boolean boolean27 = shapeList0.equals((java.lang.Object) int26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList18", shapeList0.equals(shapeList18) ? shapeList0.hashCode() == shapeList18.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        java.lang.Object obj5 = null;
        boolean boolean6 = shapeList0.equals(obj5);
        boolean boolean8 = shapeList0.equals((java.lang.Object) 0.0f);
        java.awt.Shape shape10 = null;
        shapeList0.setShape(0, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.awt.Shape shape3 = shapeList0.getShape(10);
        int int4 = shapeList0.size();
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = null;
        shapeList0.setShape(33, shape7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape5 = null;
        shapeList0.setShape((int) (short) 10, shape5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) 1.0d);
        java.awt.Shape shape6 = null;
        shapeList0.setShape(33, shape6);
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj9 = shapeList8.clone();
        shapeList8.clear();
        java.awt.Shape shape12 = shapeList8.getShape((int) (short) 1);
        boolean boolean14 = shapeList8.equals((java.lang.Object) 0);
        int int15 = shapeList8.size();
        int int16 = shapeList8.size();
        boolean boolean17 = shapeList0.equals((java.lang.Object) shapeList8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
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
        java.awt.Shape shape20 = null;
        shapeList0.setShape(36, shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) ' ', shape4);
        java.lang.Object obj6 = shapeList0.clone();
        java.awt.Shape shape8 = shapeList0.getShape(9);
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj10 = shapeList9.clone();
        shapeList9.clear();
        java.lang.Object obj12 = shapeList9.clone();
        int int13 = shapeList9.size();
        java.lang.Object obj14 = shapeList9.clone();
        int int15 = shapeList9.size();
        int int16 = shapeList9.size();
        java.awt.Shape shape18 = shapeList9.getShape(0);
        int int19 = shapeList9.size();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
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
        java.awt.Shape shape19 = shapeList0.getShape(101);
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj14", shapeList0.equals(obj14) ? shapeList0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
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
        shapeList6.clear();
        java.awt.Shape shape25 = null;
        shapeList6.setShape(11, shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
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
        java.awt.Shape shape23 = null;
        shapeList6.setShape(9, shape23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
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
        int int18 = shapeList0.size();
        java.awt.Shape shape20 = null;
        shapeList0.setShape(100, shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) ' ', shape4);
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        boolean boolean8 = shapeList6.equals((java.lang.Object) (short) 1);
        boolean boolean10 = shapeList6.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj11 = shapeList6.clone();
        java.awt.Shape shape13 = shapeList6.getShape((int) (short) -1);
        int int14 = shapeList6.size();
        int int15 = shapeList6.size();
        int int16 = shapeList6.size();
        shapeList6.clear();
        java.lang.Object obj18 = shapeList6.clone();
        boolean boolean19 = shapeList0.equals(obj18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        java.lang.Object obj5 = shapeList0.clone();
        int int6 = shapeList0.size();
        int int7 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj10 = shapeList9.clone();
        shapeList9.clear();
        shapeList9.clear();
        java.lang.Object obj13 = shapeList9.clone();
        boolean boolean15 = shapeList9.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj17 = shapeList16.clone();
        java.lang.Class<?> wildcardClass18 = shapeList16.getClass();
        boolean boolean19 = shapeList9.equals((java.lang.Object) shapeList16);
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList16);
        java.awt.Shape shape22 = null;
        shapeList16.setShape(33, shape22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList16", shapeList0.equals(shapeList16) ? shapeList0.hashCode() == shapeList16.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 'a');
        java.lang.Object obj7 = shapeList0.clone();
        java.lang.Object obj8 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape11 = null;
        shapeList9.setShape(8, shape11);
        int int13 = shapeList9.size();
        java.lang.Object obj14 = shapeList9.clone();
        boolean boolean15 = shapeList0.equals(obj14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
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
        java.awt.Shape shape24 = null;
        shapeList6.setShape(8, shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
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
        java.awt.Shape shape18 = null;
        shapeList0.setShape((int) (byte) 0, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        shapeList0.clear();
        java.lang.Object obj7 = shapeList0.clone();
        java.awt.Shape shape9 = shapeList0.getShape(10);
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) '#', shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        java.lang.Object obj3 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj5 = shapeList4.clone();
        shapeList4.clear();
        java.lang.Object obj7 = shapeList4.clone();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj9 = shapeList8.clone();
        shapeList8.clear();
        java.awt.Shape shape12 = shapeList8.getShape((int) (short) 1);
        boolean boolean14 = shapeList8.equals((java.lang.Object) (short) -1);
        boolean boolean15 = shapeList4.equals((java.lang.Object) shapeList8);
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        boolean boolean18 = shapeList16.equals((java.lang.Object) (short) 1);
        boolean boolean20 = shapeList16.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj21 = shapeList16.clone();
        java.awt.Shape shape23 = shapeList16.getShape((int) (short) -1);
        int int24 = shapeList16.size();
        boolean boolean25 = shapeList4.equals((java.lang.Object) int24);
        boolean boolean26 = shapeList0.equals((java.lang.Object) boolean25);
        java.awt.Shape shape28 = null;
        shapeList0.setShape((int) (byte) 10, shape28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
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
        java.awt.Shape shape27 = null;
        shapeList0.setShape((int) (byte) 10, shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(1);
        shapeList0.clear();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) -1);
        shapeList0.clear();
        java.awt.Shape shape10 = null;
        shapeList0.setShape(101, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
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
        java.awt.Shape shape22 = null;
        shapeList17.setShape((int) (byte) 100, shape22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList17", shapeList0.equals(shapeList17) ? shapeList0.hashCode() == shapeList17.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
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
        int int34 = shapeList0.size();
        java.awt.Shape shape36 = shapeList0.getShape(11);
        java.awt.Shape shape38 = null;
        shapeList0.setShape((int) (byte) 1, shape38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = shapeList0.getShape(1);
        shapeList0.clear();
        java.awt.Shape shape14 = null;
        shapeList0.setShape((int) (byte) 100, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 'a');
        java.lang.Object obj7 = shapeList0.clone();
        int int8 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) (short) 1);
        boolean boolean13 = shapeList9.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape15 = null;
        shapeList9.setShape((int) (byte) 0, shape15);
        java.awt.Shape shape18 = shapeList9.getShape(11);
        boolean boolean19 = shapeList0.equals((java.lang.Object) 11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
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
        java.awt.Shape shape15 = null;
        shapeList0.setShape(33, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
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
        java.awt.Shape shape14 = shapeList0.getShape((int) '4');
        java.awt.Shape shape16 = null;
        shapeList0.setShape(8, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
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
        org.jfree.chart.util.ShapeList shapeList38 = new org.jfree.chart.util.ShapeList();
        boolean boolean40 = shapeList38.equals((java.lang.Object) (short) 1);
        boolean boolean42 = shapeList38.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape44 = null;
        shapeList38.setShape((int) (byte) 0, shape44);
        java.awt.Shape shape47 = null;
        shapeList38.setShape((int) (byte) 10, shape47);
        boolean boolean50 = shapeList38.equals((java.lang.Object) (-1));
        int int51 = shapeList38.size();
        java.lang.Object obj52 = shapeList38.clone();
        boolean boolean53 = shapeList0.equals(obj52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList38", shapeList0.equals(shapeList38) ? shapeList0.hashCode() == shapeList38.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
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
        shapeList0.setShape(100, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
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
        shapeList6.clear();
        java.awt.Shape shape25 = null;
        shapeList6.setShape((int) (short) 100, shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj11 = shapeList10.clone();
        shapeList10.clear();
        java.awt.Shape shape14 = shapeList10.getShape((int) (short) 1);
        boolean boolean16 = shapeList10.equals((java.lang.Object) 0L);
        boolean boolean17 = shapeList0.equals((java.lang.Object) 0L);
        java.awt.Shape shape19 = null;
        shapeList0.setShape((int) (short) 10, shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        java.lang.Object obj3 = shapeList0.clone();
        java.awt.Shape shape5 = null;
        shapeList0.setShape(0, shape5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj3", shapeList0.equals(obj3) ? shapeList0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 0L);
        java.awt.Shape shape8 = shapeList0.getShape(0);
        java.lang.Object obj9 = shapeList0.clone();
        java.lang.Object obj10 = shapeList0.clone();
        java.awt.Shape shape12 = null;
        shapeList0.setShape(9, shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        java.lang.Object obj5 = null;
        boolean boolean6 = shapeList0.equals(obj5);
        java.lang.Object obj7 = shapeList0.clone();
        java.awt.Shape shape9 = null;
        shapeList0.setShape(1, shape9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 10);
        shapeList0.clear();
        java.awt.Shape shape6 = null;
        shapeList0.setShape(10, shape6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = null;
        shapeList0.setShape(101, shape7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
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
        java.awt.Shape shape15 = shapeList0.getShape((int) 'a');
        java.awt.Shape shape17 = null;
        shapeList0.setShape(0, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
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
        int int14 = shapeList0.size();
        java.awt.Shape shape16 = null;
        shapeList0.setShape((int) '4', shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        boolean boolean6 = shapeList0.equals((java.lang.Object) ' ');
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape10 = null;
        shapeList0.setShape(1, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        int int4 = shapeList3.size();
        int int5 = shapeList3.size();
        java.lang.Object obj6 = shapeList3.clone();
        boolean boolean7 = shapeList0.equals(obj6);
        java.awt.Shape shape9 = null;
        shapeList0.setShape((int) ' ', shape9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape(1);
        java.awt.Shape shape9 = shapeList0.getShape((int) (byte) 0);
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        boolean boolean12 = shapeList10.equals((java.lang.Object) (short) 1);
        boolean boolean14 = shapeList10.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj15 = shapeList10.clone();
        java.awt.Shape shape17 = shapeList10.getShape((int) (short) -1);
        int int18 = shapeList10.size();
        int int19 = shapeList10.size();
        int int20 = shapeList10.size();
        boolean boolean21 = shapeList0.equals((java.lang.Object) shapeList10);
        java.awt.Shape shape23 = null;
        shapeList0.setShape((int) (short) 1, shape23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
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
        shapeList6.clear();
        shapeList6.clear();
        java.awt.Shape shape26 = null;
        shapeList6.setShape(33, shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
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
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        boolean boolean14 = shapeList12.equals((java.lang.Object) (short) 1);
        boolean boolean16 = shapeList12.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj17 = shapeList12.clone();
        java.awt.Shape shape19 = shapeList12.getShape((int) (short) -1);
        int int20 = shapeList12.size();
        int int21 = shapeList12.size();
        int int22 = shapeList12.size();
        java.awt.Shape shape24 = shapeList12.getShape((int) '#');
        boolean boolean25 = shapeList0.equals((java.lang.Object) '#');
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        shapeList26.clear();
        java.lang.Object obj28 = shapeList26.clone();
        boolean boolean30 = shapeList26.equals((java.lang.Object) (-1));
        int int31 = shapeList26.size();
        java.awt.Shape shape33 = shapeList26.getShape((int) (byte) -1);
        java.awt.Shape shape35 = shapeList26.getShape((int) (short) 0);
        boolean boolean36 = shapeList0.equals((java.lang.Object) shapeList26);
        java.awt.Shape shape38 = null;
        shapeList0.setShape(1, shape38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = null;
        shapeList0.setShape((int) (byte) 100, shape7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
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
        java.awt.Shape shape27 = null;
        shapeList14.setShape((int) (byte) 10, shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
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
        java.awt.Shape shape17 = shapeList0.getShape(9);
        java.awt.Shape shape19 = shapeList0.getShape(33);
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj21 = shapeList20.clone();
        shapeList20.clear();
        java.lang.Object obj23 = shapeList20.clone();
        int int24 = shapeList20.size();
        java.lang.Object obj25 = shapeList20.clone();
        shapeList20.clear();
        shapeList20.clear();
        org.jfree.chart.util.ShapeList shapeList28 = new org.jfree.chart.util.ShapeList();
        boolean boolean30 = shapeList28.equals((java.lang.Object) (short) 1);
        boolean boolean32 = shapeList28.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj33 = shapeList28.clone();
        java.awt.Shape shape35 = shapeList28.getShape((int) (short) -1);
        int int36 = shapeList28.size();
        boolean boolean37 = shapeList20.equals((java.lang.Object) shapeList28);
        java.lang.Object obj38 = shapeList28.clone();
        boolean boolean39 = shapeList0.equals(obj38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList20", shapeList0.equals(shapeList20) ? shapeList0.hashCode() == shapeList20.hashCode() : true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
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
        shapeList0.clear();
        java.awt.Shape shape18 = null;
        shapeList0.setShape(0, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 0, shape6);
        int int8 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) ' ', shape11);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        boolean boolean15 = shapeList13.equals((java.lang.Object) (short) 1);
        java.lang.Object obj16 = shapeList13.clone();
        boolean boolean17 = shapeList0.equals((java.lang.Object) shapeList13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape(0, shape6);
        java.lang.Object obj8 = shapeList0.clone();
        java.lang.Object obj9 = shapeList0.clone();
        java.lang.Object obj10 = null;
        boolean boolean11 = shapeList0.equals(obj10);
        java.awt.Shape shape13 = null;
        shapeList0.setShape(101, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
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
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        int int23 = shapeList22.size();
        shapeList22.clear();
        java.awt.Shape shape26 = null;
        shapeList22.setShape((int) (short) 100, shape26);
        java.awt.Shape shape29 = shapeList22.getShape((int) '4');
        java.lang.Object obj30 = shapeList22.clone();
        boolean boolean31 = shapeList0.equals(obj30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList22", shapeList0.equals(shapeList22) ? shapeList0.hashCode() == shapeList22.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
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
        java.awt.Shape shape16 = shapeList0.getShape((int) (short) 10);
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        boolean boolean19 = shapeList17.equals((java.lang.Object) (short) 1);
        boolean boolean21 = shapeList17.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj22 = shapeList17.clone();
        java.awt.Shape shape24 = shapeList17.getShape((int) (short) -1);
        boolean boolean26 = shapeList17.equals((java.lang.Object) (-1.0d));
        boolean boolean27 = shapeList0.equals((java.lang.Object) boolean26);
        java.awt.Shape shape29 = null;
        shapeList0.setShape((int) (byte) 10, shape29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 0, shape6);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) (short) 1);
        boolean boolean13 = shapeList9.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape15 = null;
        shapeList9.setShape((int) (byte) 0, shape15);
        java.awt.Shape shape18 = null;
        shapeList9.setShape((int) (byte) 10, shape18);
        boolean boolean21 = shapeList9.equals((java.lang.Object) (-1));
        int int22 = shapeList9.size();
        java.lang.Object obj23 = shapeList9.clone();
        int int24 = shapeList9.size();
        java.awt.Shape shape26 = shapeList9.getShape((int) (short) 0);
        java.lang.Object obj27 = shapeList9.clone();
        boolean boolean28 = shapeList0.equals((java.lang.Object) shapeList9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
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
        java.lang.Object obj31 = shapeList0.clone();
        java.awt.Shape shape33 = shapeList0.getShape(8);
        java.awt.Shape shape35 = null;
        shapeList0.setShape(0, shape35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
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
        java.awt.Shape shape37 = null;
        shapeList22.setShape((int) (short) 10, shape37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList22", shapeList0.equals(shapeList22) ? shapeList0.hashCode() == shapeList22.hashCode() : true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
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
        java.awt.Shape shape17 = null;
        shapeList0.setShape(0, shape17);
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
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
        shapeList0.setShape((int) '4', shape21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        java.lang.Object obj5 = null;
        boolean boolean6 = shapeList0.equals(obj5);
        boolean boolean8 = shapeList0.equals((java.lang.Object) 0.0f);
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = null;
        shapeList0.setShape(8, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = null;
        shapeList0.setShape(36, shape7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj4", shapeList0.equals(obj4) ? shapeList0.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
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
        java.awt.Shape shape22 = null;
        shapeList8.setShape((int) '4', shape22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
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
        shapeList0.clear();
        java.awt.Shape shape23 = shapeList0.getShape(8);
        java.awt.Shape shape25 = null;
        shapeList0.setShape(100, shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
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
        java.awt.Shape shape20 = null;
        shapeList0.setShape((int) (short) 1, shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
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
        shapeList0.setShape((int) (short) 0, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
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
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        int int18 = shapeList17.size();
        shapeList17.clear();
        java.awt.Shape shape21 = null;
        shapeList17.setShape((int) (short) 100, shape21);
        java.lang.Object obj23 = shapeList17.clone();
        int int24 = shapeList17.size();
        java.awt.Shape shape26 = shapeList17.getShape(101);
        boolean boolean27 = shapeList0.equals((java.lang.Object) shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList17", shapeList0.equals(shapeList17) ? shapeList0.hashCode() == shapeList17.hashCode() : true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
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
        java.awt.Shape shape25 = null;
        shapeList0.setShape(9, shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj11 = shapeList0.clone();
        int int12 = shapeList0.size();
        int int13 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        boolean boolean16 = shapeList14.equals((java.lang.Object) (short) 1);
        boolean boolean18 = shapeList14.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape20 = null;
        shapeList14.setShape(0, shape20);
        int int22 = shapeList14.size();
        java.awt.Shape shape24 = null;
        shapeList14.setShape(0, shape24);
        java.lang.Object obj26 = shapeList14.clone();
        boolean boolean27 = shapeList0.equals(obj26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = null;
        shapeList0.setShape(0, shape5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.lang.Object obj6 = shapeList0.clone();
        java.lang.Object obj7 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj9 = shapeList8.clone();
        java.lang.Object obj10 = shapeList8.clone();
        java.awt.Shape shape12 = shapeList8.getShape(1);
        shapeList8.clear();
        boolean boolean14 = shapeList0.equals((java.lang.Object) shapeList8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = shapeList0.getShape((int) (short) 1);
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) (short) 1);
        boolean boolean13 = shapeList9.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape15 = null;
        shapeList9.setShape((int) (byte) 0, shape15);
        int int17 = shapeList9.size();
        boolean boolean19 = shapeList9.equals((java.lang.Object) (byte) 1);
        java.awt.Shape shape21 = shapeList9.getShape((int) (byte) 100);
        java.lang.Object obj22 = shapeList9.clone();
        boolean boolean23 = shapeList0.equals((java.lang.Object) shapeList9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
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
        int int34 = shapeList0.size();
        java.awt.Shape shape36 = shapeList0.getShape(11);
        java.awt.Shape shape38 = shapeList0.getShape((int) (byte) 0);
        java.awt.Shape shape40 = null;
        shapeList0.setShape(0, shape40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 'a');
        java.lang.Object obj7 = shapeList0.clone();
        int int8 = shapeList0.size();
        java.lang.Object obj9 = shapeList0.clone();
        boolean boolean11 = shapeList0.equals((java.lang.Object) 0.0f);
        java.awt.Shape shape13 = shapeList0.getShape(10);
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        boolean boolean16 = shapeList14.equals((java.lang.Object) (short) 1);
        boolean boolean18 = shapeList14.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape20 = null;
        shapeList14.setShape((int) (byte) 0, shape20);
        int int22 = shapeList14.size();
        boolean boolean24 = shapeList14.equals((java.lang.Object) (byte) 1);
        java.awt.Shape shape26 = shapeList14.getShape((int) '4');
        boolean boolean27 = shapeList0.equals((java.lang.Object) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.lang.Object obj6 = shapeList0.clone();
        java.lang.Object obj7 = shapeList0.clone();
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        shapeList10.clear();
        int int12 = shapeList10.size();
        shapeList10.clear();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj15 = shapeList14.clone();
        shapeList14.clear();
        shapeList14.clear();
        java.lang.Object obj18 = shapeList14.clone();
        java.lang.Object obj19 = null;
        boolean boolean20 = shapeList14.equals(obj19);
        boolean boolean22 = shapeList14.equals((java.lang.Object) 0.0f);
        int int23 = shapeList14.size();
        java.lang.Object obj24 = shapeList14.clone();
        boolean boolean25 = shapeList10.equals(obj24);
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        boolean boolean28 = shapeList26.equals((java.lang.Object) (short) 1);
        boolean boolean30 = shapeList26.equals((java.lang.Object) 1.0d);
        org.jfree.chart.util.ShapeList shapeList31 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj32 = shapeList31.clone();
        shapeList31.clear();
        java.awt.Shape shape35 = shapeList31.getShape((int) (short) 1);
        boolean boolean37 = shapeList31.equals((java.lang.Object) 0);
        java.lang.Object obj38 = shapeList31.clone();
        boolean boolean40 = shapeList31.equals((java.lang.Object) false);
        java.lang.Object obj41 = shapeList31.clone();
        boolean boolean42 = shapeList26.equals((java.lang.Object) shapeList31);
        shapeList26.clear();
        org.jfree.chart.util.ShapeList shapeList44 = new org.jfree.chart.util.ShapeList();
        shapeList44.clear();
        java.lang.Object obj46 = shapeList44.clone();
        org.jfree.chart.util.ShapeList shapeList47 = new org.jfree.chart.util.ShapeList();
        boolean boolean49 = shapeList47.equals((java.lang.Object) (short) 1);
        boolean boolean51 = shapeList47.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj52 = shapeList47.clone();
        java.awt.Shape shape54 = shapeList47.getShape((int) (short) -1);
        int int55 = shapeList47.size();
        boolean boolean56 = shapeList44.equals((java.lang.Object) int55);
        int int57 = shapeList44.size();
        java.awt.Shape shape59 = shapeList44.getShape((int) (short) 10);
        boolean boolean60 = shapeList26.equals((java.lang.Object) shapeList44);
        boolean boolean61 = shapeList10.equals((java.lang.Object) boolean60);
        boolean boolean62 = shapeList0.equals((java.lang.Object) boolean61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
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
        org.jfree.chart.util.ShapeList shapeList31 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj32 = shapeList31.clone();
        shapeList31.clear();
        java.awt.Shape shape35 = shapeList31.getShape((int) (short) 1);
        boolean boolean37 = shapeList31.equals((java.lang.Object) 0);
        int int38 = shapeList31.size();
        boolean boolean39 = shapeList0.equals((java.lang.Object) int38);
        java.awt.Shape shape41 = null;
        shapeList0.setShape((int) (byte) 100, shape41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 0);
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) '4', shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        int int3 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj5 = shapeList4.clone();
        shapeList4.clear();
        java.awt.Shape shape8 = shapeList4.getShape((int) ' ');
        boolean boolean9 = shapeList0.equals((java.lang.Object) shape8);
        int int10 = shapeList0.size();
        java.awt.Shape shape12 = null;
        shapeList0.setShape(10, shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        java.lang.Object obj5 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj7 = shapeList6.clone();
        shapeList6.clear();
        shapeList6.clear();
        java.lang.Object obj10 = shapeList6.clone();
        boolean boolean12 = shapeList6.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        shapeList13.clear();
        int int15 = shapeList13.size();
        int int16 = shapeList13.size();
        boolean boolean17 = shapeList6.equals((java.lang.Object) int16);
        java.lang.Object obj18 = shapeList6.clone();
        boolean boolean19 = shapeList0.equals((java.lang.Object) shapeList6);
        int int20 = shapeList6.size();
        java.awt.Shape shape22 = null;
        shapeList6.setShape((int) ' ', shape22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
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
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        shapeList19.clear();
        int int21 = shapeList19.size();
        java.awt.Shape shape23 = null;
        shapeList19.setShape((int) '#', shape23);
        java.lang.Object obj25 = shapeList19.clone();
        java.lang.Object obj26 = shapeList19.clone();
        java.awt.Shape shape28 = shapeList19.getShape(0);
        int int29 = shapeList19.size();
        boolean boolean30 = shapeList8.equals((java.lang.Object) int29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList19", shapeList0.equals(shapeList19) ? shapeList0.hashCode() == shapeList19.hashCode() : true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 0);
        java.awt.Shape shape8 = shapeList0.getShape(0);
        java.awt.Shape shape10 = null;
        shapeList0.setShape(100, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
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
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        shapeList18.clear();
        java.lang.Object obj20 = shapeList18.clone();
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        boolean boolean23 = shapeList21.equals((java.lang.Object) (short) 1);
        boolean boolean25 = shapeList21.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj26 = shapeList21.clone();
        java.awt.Shape shape28 = shapeList21.getShape((int) (short) -1);
        int int29 = shapeList21.size();
        boolean boolean30 = shapeList18.equals((java.lang.Object) int29);
        int int31 = shapeList18.size();
        java.awt.Shape shape33 = shapeList18.getShape((int) (short) 10);
        boolean boolean34 = shapeList0.equals((java.lang.Object) shapeList18);
        org.jfree.chart.util.ShapeList shapeList35 = new org.jfree.chart.util.ShapeList();
        int int36 = shapeList35.size();
        shapeList35.clear();
        java.awt.Shape shape39 = null;
        shapeList35.setShape((int) (short) 100, shape39);
        java.lang.Object obj41 = shapeList35.clone();
        java.lang.Object obj42 = shapeList35.clone();
        java.lang.Object obj43 = shapeList35.clone();
        java.awt.Shape shape45 = shapeList35.getShape(0);
        java.awt.Shape shape47 = shapeList35.getShape(0);
        java.awt.Shape shape49 = shapeList35.getShape((int) (byte) -1);
        java.lang.Class<?> wildcardClass50 = shapeList35.getClass();
        boolean boolean51 = shapeList18.equals((java.lang.Object) wildcardClass50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList35", shapeList0.equals(shapeList35) ? shapeList0.hashCode() == shapeList35.hashCode() : true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
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
        java.awt.Shape shape17 = null;
        shapeList0.setShape((int) (byte) 1, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
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
        java.awt.Shape shape16 = shapeList0.getShape((int) (short) 10);
        shapeList0.clear();
        java.awt.Shape shape19 = shapeList0.getShape((int) (short) 1);
        java.awt.Shape shape21 = null;
        shapeList0.setShape((int) (short) 0, shape21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
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
        shapeList0.setShape(10, shape31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
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
        java.awt.Shape shape23 = null;
        shapeList0.setShape(33, shape23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 10);
        shapeList0.clear();
        java.lang.Object obj5 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape8 = null;
        shapeList6.setShape(8, shape8);
        int int10 = shapeList6.size();
        java.lang.Object obj11 = shapeList6.clone();
        java.lang.Class<?> wildcardClass12 = shapeList6.getClass();
        boolean boolean13 = shapeList0.equals((java.lang.Object) wildcardClass12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 'a');
        java.awt.Shape shape8 = shapeList0.getShape(33);
        java.awt.Shape shape10 = null;
        shapeList0.setShape(11, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
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
        shapeList28.setShape(100, shape40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList28", shapeList0.equals(shapeList28) ? shapeList0.hashCode() == shapeList28.hashCode() : true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = shapeList0.getShape(1);
        java.awt.Shape shape13 = null;
        shapeList0.setShape(0, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.awt.Shape shape3 = shapeList0.getShape(10);
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 1);
        java.awt.Shape shape7 = null;
        shapeList0.setShape(10, shape7);
        java.awt.Shape shape10 = null;
        shapeList0.setShape(11, shape10);
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
        boolean boolean30 = shapeList0.equals((java.lang.Object) shapeList12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
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
        org.jfree.chart.util.ShapeList shapeList33 = new org.jfree.chart.util.ShapeList();
        int int34 = shapeList33.size();
        int int35 = shapeList33.size();
        java.awt.Shape shape37 = null;
        shapeList33.setShape((int) ' ', shape37);
        int int39 = shapeList33.size();
        boolean boolean40 = shapeList15.equals((java.lang.Object) int39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList33", shapeList0.equals(shapeList33) ? shapeList0.hashCode() == shapeList33.hashCode() : true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) -1);
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) (byte) 0, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 'a');
        java.lang.Object obj7 = shapeList0.clone();
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape12 = null;
        shapeList10.setShape(8, shape12);
        java.awt.Shape shape15 = shapeList10.getShape((int) (byte) 100);
        java.awt.Shape shape17 = shapeList10.getShape((int) (byte) 100);
        java.awt.Shape shape19 = shapeList10.getShape(11);
        java.awt.Shape shape21 = null;
        shapeList10.setShape((int) ' ', shape21);
        boolean boolean23 = shapeList0.equals((java.lang.Object) shapeList10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 0);
        java.awt.Shape shape8 = shapeList0.getShape(0);
        int int9 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape13 = null;
        shapeList0.setShape(10, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
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
        java.awt.Shape shape16 = shapeList0.getShape((int) (short) 10);
        java.awt.Shape shape18 = null;
        shapeList0.setShape((int) ' ', shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
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
        int int29 = shapeList28.size();
        int int30 = shapeList28.size();
        java.awt.Shape shape32 = null;
        shapeList28.setShape((int) ' ', shape32);
        java.lang.Object obj34 = shapeList28.clone();
        java.lang.Object obj35 = shapeList28.clone();
        java.awt.Shape shape37 = shapeList28.getShape(33);
        boolean boolean38 = shapeList16.equals((java.lang.Object) shapeList28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList28", shapeList0.equals(shapeList28) ? shapeList0.hashCode() == shapeList28.hashCode() : true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        java.awt.Shape shape5 = shapeList0.getShape((int) (short) -1);
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        shapeList6.clear();
        java.lang.Object obj8 = shapeList6.clone();
        boolean boolean10 = shapeList6.equals((java.lang.Object) (-1));
        boolean boolean11 = shapeList0.equals((java.lang.Object) boolean10);
        int int12 = shapeList0.size();
        java.awt.Shape shape14 = null;
        shapeList0.setShape(9, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj3", shapeList0.equals(obj3) ? shapeList0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 0, shape6);
        int int8 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) ' ', shape11);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        shapeList13.clear();
        int int15 = shapeList13.size();
        java.awt.Shape shape17 = null;
        shapeList13.setShape((int) '#', shape17);
        java.lang.Class<?> wildcardClass19 = shapeList13.getClass();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        java.awt.Shape shape5 = shapeList0.getShape((int) (short) -1);
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        shapeList6.clear();
        java.lang.Object obj8 = shapeList6.clone();
        boolean boolean10 = shapeList6.equals((java.lang.Object) (-1));
        boolean boolean11 = shapeList0.equals((java.lang.Object) boolean10);
        int int12 = shapeList0.size();
        java.awt.Shape shape14 = null;
        shapeList0.setShape(53, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj3", shapeList0.equals(obj3) ? shapeList0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
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
        int int14 = shapeList0.size();
        java.awt.Shape shape16 = null;
        shapeList0.setShape(0, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
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
        shapeList0.setShape(100, shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = null;
        shapeList0.setShape(2, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape(100);
        java.awt.Shape shape9 = null;
        shapeList0.setShape((int) (byte) 10, shape9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj11 = shapeList10.clone();
        shapeList10.clear();
        java.awt.Shape shape14 = shapeList10.getShape((int) (short) 1);
        boolean boolean16 = shapeList10.equals((java.lang.Object) 0L);
        boolean boolean17 = shapeList0.equals((java.lang.Object) 0L);
        java.awt.Shape shape19 = null;
        shapeList0.setShape(10, shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
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
        java.awt.Shape shape26 = null;
        shapeList8.setShape(1, shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList8", shapeList0.equals(shapeList8) ? shapeList0.hashCode() == shapeList8.hashCode() : true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj6 = shapeList0.clone();
        java.awt.Shape shape8 = null;
        shapeList0.setShape(0, shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = shapeList0.clone();
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape((int) (byte) 10);
        java.awt.Shape shape12 = shapeList0.getShape((int) (byte) 10);
        java.awt.Shape shape14 = null;
        shapeList0.setShape(8, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 'a');
        java.lang.Object obj7 = shapeList0.clone();
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = null;
        shapeList0.setShape(8, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = null;
        shapeList0.setShape(9, shape7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
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
        shapeList0.setShape((int) (byte) 1, shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) -1);
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        int int10 = shapeList0.size();
        int int11 = shapeList0.size();
        java.lang.Object obj12 = shapeList0.clone();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        shapeList14.clear();
        int int16 = shapeList14.size();
        java.awt.Shape shape18 = shapeList14.getShape(8);
        java.awt.Shape shape20 = null;
        shapeList14.setShape(0, shape20);
        boolean boolean22 = shapeList0.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.awt.Shape shape3 = shapeList0.getShape(10);
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 1);
        java.awt.Shape shape7 = null;
        shapeList0.setShape(10, shape7);
        java.awt.Shape shape10 = null;
        shapeList0.setShape(11, shape10);
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj13 = shapeList12.clone();
        shapeList12.clear();
        java.lang.Object obj15 = shapeList12.clone();
        int int16 = shapeList12.size();
        java.lang.Object obj17 = shapeList12.clone();
        shapeList12.clear();
        shapeList12.clear();
        shapeList12.clear();
        boolean boolean21 = shapeList0.equals((java.lang.Object) shapeList12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 0L);
        java.awt.Shape shape8 = shapeList0.getShape(0);
        java.lang.Object obj9 = shapeList0.clone();
        java.lang.Object obj10 = shapeList0.clone();
        java.lang.Object obj11 = shapeList0.clone();
        java.awt.Shape shape13 = null;
        shapeList0.setShape((int) ' ', shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 0);
        int int7 = shapeList0.size();
        int int8 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape11 = null;
        shapeList9.setShape(8, shape11);
        int int13 = shapeList9.size();
        shapeList9.clear();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        shapeList15.clear();
        java.lang.Object obj17 = shapeList15.clone();
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        boolean boolean20 = shapeList18.equals((java.lang.Object) (short) 1);
        boolean boolean22 = shapeList18.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj23 = shapeList18.clone();
        java.awt.Shape shape25 = shapeList18.getShape((int) (short) -1);
        int int26 = shapeList18.size();
        boolean boolean27 = shapeList15.equals((java.lang.Object) int26);
        shapeList15.clear();
        boolean boolean29 = shapeList9.equals((java.lang.Object) shapeList15);
        java.lang.Object obj30 = shapeList15.clone();
        boolean boolean31 = shapeList0.equals((java.lang.Object) shapeList15);
        java.awt.Shape shape33 = shapeList15.getShape((int) (byte) -1);
        java.awt.Shape shape35 = null;
        shapeList15.setShape((int) (byte) 1, shape35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList15", shapeList0.equals(shapeList15) ? shapeList0.hashCode() == shapeList15.hashCode() : true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
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
        java.awt.Shape shape19 = null;
        shapeList0.setShape(9, shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape(1);
        java.awt.Shape shape9 = shapeList0.getShape(100);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        java.awt.Shape shape13 = shapeList0.getShape(9);
        java.awt.Shape shape15 = null;
        shapeList0.setShape((int) '#', shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 0, shape6);
        java.awt.Shape shape9 = null;
        shapeList0.setShape((int) (byte) 10, shape9);
        boolean boolean12 = shapeList0.equals((java.lang.Object) (-1));
        int int13 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        shapeList14.clear();
        int int16 = shapeList14.size();
        int int17 = shapeList14.size();
        int int18 = shapeList14.size();
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
        java.awt.Shape shape37 = shapeList19.getShape(100);
        boolean boolean39 = shapeList19.equals((java.lang.Object) false);
        java.awt.Shape shape41 = shapeList19.getShape(9);
        boolean boolean42 = shapeList14.equals((java.lang.Object) shapeList19);
        boolean boolean43 = shapeList0.equals((java.lang.Object) shapeList19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 0, shape6);
        int int8 = shapeList0.size();
        boolean boolean10 = shapeList0.equals((java.lang.Object) (byte) 1);
        java.awt.Shape shape12 = shapeList0.getShape((int) '4');
        java.awt.Shape shape14 = shapeList0.getShape(101);
        int int15 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj17 = shapeList16.clone();
        shapeList16.clear();
        shapeList16.clear();
        java.awt.Shape shape21 = shapeList16.getShape((int) '#');
        shapeList16.clear();
        boolean boolean23 = shapeList0.equals((java.lang.Object) shapeList16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList16", shapeList0.equals(shapeList16) ? shapeList0.hashCode() == shapeList16.hashCode() : true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        java.lang.Object obj5 = null;
        boolean boolean6 = shapeList0.equals(obj5);
        boolean boolean8 = shapeList0.equals((java.lang.Object) 0.0f);
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = null;
        shapeList0.setShape(100, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        int int2 = shapeList0.size();
        java.awt.Shape shape4 = shapeList0.getShape(8);
        org.jfree.chart.util.ShapeList shapeList5 = new org.jfree.chart.util.ShapeList();
        boolean boolean7 = shapeList5.equals((java.lang.Object) (short) 1);
        boolean boolean9 = shapeList5.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape11 = null;
        shapeList5.setShape(0, shape11);
        java.lang.Object obj13 = shapeList5.clone();
        boolean boolean14 = shapeList0.equals(obj13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(33);
        java.awt.Shape shape6 = null;
        shapeList0.setShape(33, shape6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
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
        int int29 = shapeList10.size();
        java.awt.Shape shape31 = null;
        shapeList10.setShape((int) '4', shape31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
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
        java.awt.Shape shape17 = null;
        shapeList0.setShape((int) (short) 1, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        java.lang.Object obj5 = shapeList0.clone();
        int int6 = shapeList0.size();
        int int7 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj10 = shapeList9.clone();
        shapeList9.clear();
        shapeList9.clear();
        java.lang.Object obj13 = shapeList9.clone();
        boolean boolean15 = shapeList9.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj17 = shapeList16.clone();
        java.lang.Class<?> wildcardClass18 = shapeList16.getClass();
        boolean boolean19 = shapeList9.equals((java.lang.Object) shapeList16);
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList16);
        shapeList0.clear();
        int int22 = shapeList0.size();
        java.awt.Shape shape24 = null;
        shapeList0.setShape(1, shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape(1);
        java.awt.Shape shape9 = shapeList0.getShape((int) ' ');
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        boolean boolean12 = shapeList10.equals((java.lang.Object) (short) 1);
        boolean boolean14 = shapeList10.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj15 = shapeList10.clone();
        java.awt.Shape shape17 = shapeList10.getShape((int) (short) -1);
        int int18 = shapeList10.size();
        int int19 = shapeList10.size();
        int int20 = shapeList10.size();
        shapeList10.clear();
        int int22 = shapeList10.size();
        shapeList10.clear();
        boolean boolean24 = shapeList0.equals((java.lang.Object) shapeList10);
        java.awt.Shape shape26 = null;
        shapeList10.setShape((int) ' ', shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
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
        java.awt.Shape shape15 = shapeList0.getShape(1);
        java.awt.Shape shape17 = null;
        shapeList0.setShape((int) '#', shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
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
        java.lang.Object obj31 = shapeList0.clone();
        java.awt.Shape shape33 = shapeList0.getShape(8);
        java.awt.Shape shape35 = shapeList0.getShape(0);
        java.awt.Shape shape37 = null;
        shapeList0.setShape((int) (byte) 0, shape37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape(11, shape6);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape11 = null;
        shapeList9.setShape(8, shape11);
        int int13 = shapeList9.size();
        shapeList9.clear();
        int int15 = shapeList9.size();
        java.awt.Shape shape17 = null;
        shapeList9.setShape((int) (byte) 10, shape17);
        java.lang.Object obj19 = shapeList9.clone();
        boolean boolean20 = shapeList0.equals(obj19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
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
        shapeList6.clear();
        int int24 = shapeList6.size();
        java.awt.Shape shape26 = null;
        shapeList6.setShape((int) ' ', shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
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
        java.awt.Shape shape27 = null;
        shapeList16.setShape(2, shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList16", shapeList0.equals(shapeList16) ? shapeList0.hashCode() == shapeList16.hashCode() : true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
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
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj14", shapeList0.equals(obj14) ? shapeList0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) 1.0d);
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 10);
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = shapeList0.getShape((int) ' ');
        java.awt.Shape shape12 = null;
        shapeList0.setShape(2, shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
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
        java.awt.Shape shape19 = null;
        shapeList0.setShape(101, shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
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
        java.awt.Shape shape23 = null;
        shapeList0.setShape(10, shape23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
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
        java.awt.Shape shape46 = null;
        shapeList0.setShape(33, shape46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
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
        java.lang.Object obj31 = shapeList0.clone();
        java.awt.Shape shape33 = shapeList0.getShape(8);
        java.awt.Shape shape35 = null;
        shapeList0.setShape((int) (byte) 1, shape35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
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
        int int13 = shapeList9.size();
        java.lang.Object obj14 = shapeList9.clone();
        boolean boolean15 = shapeList0.equals(obj14);
        java.awt.Shape shape17 = null;
        shapeList0.setShape((int) '#', shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = shapeList0.clone();
        java.lang.Object obj8 = shapeList0.clone();
        int int9 = shapeList0.size();
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) (short) 1, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.awt.Shape shape7 = null;
        shapeList0.setShape((int) ' ', shape7);
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj10 = shapeList9.clone();
        shapeList9.clear();
        java.awt.Shape shape13 = shapeList9.getShape((int) (short) 1);
        boolean boolean15 = shapeList9.equals((java.lang.Object) 'a');
        java.awt.Shape shape17 = shapeList9.getShape(33);
        boolean boolean18 = shapeList0.equals((java.lang.Object) shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 0);
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) 'a', shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape(9);
        shapeList0.clear();
        java.awt.Shape shape7 = null;
        shapeList0.setShape((int) (byte) 10, shape7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
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
        java.lang.Object obj14 = shapeList0.clone();
        java.awt.Shape shape16 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        shapeList17.clear();
        int int19 = shapeList17.size();
        java.awt.Shape shape21 = shapeList17.getShape(8);
        java.awt.Shape shape23 = null;
        shapeList17.setShape(0, shape23);
        java.lang.Object obj25 = shapeList17.clone();
        boolean boolean26 = shapeList0.equals(obj25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList17", shapeList0.equals(shapeList17) ? shapeList0.hashCode() == shapeList17.hashCode() : true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.awt.Shape shape7 = null;
        shapeList0.setShape((int) '#', shape7);
        int int9 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        shapeList10.clear();
        java.lang.Object obj12 = shapeList10.clone();
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        boolean boolean15 = shapeList13.equals((java.lang.Object) (short) 1);
        boolean boolean17 = shapeList13.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj18 = shapeList13.clone();
        java.awt.Shape shape20 = shapeList13.getShape((int) (short) -1);
        int int21 = shapeList13.size();
        boolean boolean22 = shapeList10.equals((java.lang.Object) int21);
        java.awt.Shape shape24 = shapeList10.getShape(9);
        int int25 = shapeList10.size();
        java.lang.Object obj26 = shapeList10.clone();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        boolean boolean28 = shapeList0.equals(obj26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 'a');
        java.lang.Object obj7 = shapeList0.clone();
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = shapeList0.getShape(101);
        java.awt.Shape shape12 = shapeList0.getShape((int) (byte) -1);
        shapeList0.clear();
        java.awt.Shape shape15 = null;
        shapeList0.setShape(1, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape(1);
        java.awt.Shape shape9 = shapeList0.getShape((int) ' ');
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        boolean boolean12 = shapeList10.equals((java.lang.Object) (short) 1);
        boolean boolean14 = shapeList10.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj15 = shapeList10.clone();
        java.awt.Shape shape17 = shapeList10.getShape((int) (short) -1);
        int int18 = shapeList10.size();
        int int19 = shapeList10.size();
        int int20 = shapeList10.size();
        shapeList10.clear();
        int int22 = shapeList10.size();
        shapeList10.clear();
        boolean boolean24 = shapeList0.equals((java.lang.Object) shapeList10);
        int int25 = shapeList10.size();
        java.awt.Shape shape27 = null;
        shapeList10.setShape((int) (byte) 0, shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
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
        java.awt.Shape shape16 = null;
        shapeList0.setShape(53, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
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
        int int22 = shapeList0.size();
        java.awt.Shape shape24 = null;
        shapeList0.setShape((int) 'a', shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
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
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        shapeList14.clear();
        java.lang.Object obj16 = shapeList14.clone();
        boolean boolean18 = shapeList14.equals((java.lang.Object) (-1));
        int int19 = shapeList14.size();
        java.awt.Shape shape21 = shapeList14.getShape((int) ' ');
        shapeList14.clear();
        boolean boolean23 = shapeList0.equals((java.lang.Object) shapeList14);
        java.awt.Shape shape25 = null;
        shapeList14.setShape((int) '#', shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
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
        java.awt.Shape shape27 = null;
        shapeList16.setShape((int) (short) 10, shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList16", shapeList0.equals(shapeList16) ? shapeList0.hashCode() == shapeList16.hashCode() : true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 0);
        java.awt.Shape shape8 = shapeList0.getShape(0);
        int int9 = shapeList0.size();
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) (byte) 0, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
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
        java.awt.Shape shape17 = null;
        shapeList0.setShape(11, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 'a');
        java.lang.Object obj7 = shapeList0.clone();
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        int int10 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        int int12 = shapeList11.size();
        shapeList11.clear();
        java.awt.Shape shape15 = null;
        shapeList11.setShape((int) (short) 100, shape15);
        java.awt.Shape shape18 = null;
        shapeList11.setShape((int) '#', shape18);
        int int20 = shapeList11.size();
        boolean boolean21 = shapeList0.equals((java.lang.Object) shapeList11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
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
        shapeList9.clear();
        java.awt.Shape shape16 = null;
        shapeList9.setShape((int) 'a', shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) -1);
        boolean boolean9 = shapeList0.equals((java.lang.Object) (-1.0d));
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        shapeList10.clear();
        int int12 = shapeList10.size();
        java.awt.Shape shape14 = null;
        shapeList10.setShape((int) '#', shape14);
        shapeList10.clear();
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj18 = shapeList17.clone();
        shapeList17.clear();
        java.awt.Shape shape21 = shapeList17.getShape((int) (short) 1);
        boolean boolean23 = shapeList17.equals((java.lang.Object) 0);
        int int24 = shapeList17.size();
        int int25 = shapeList17.size();
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        shapeList26.clear();
        java.awt.Shape shape29 = shapeList26.getShape(10);
        boolean boolean30 = shapeList17.equals((java.lang.Object) shapeList26);
        boolean boolean31 = shapeList10.equals((java.lang.Object) boolean30);
        boolean boolean32 = shapeList0.equals((java.lang.Object) boolean31);
        org.jfree.chart.util.ShapeList shapeList33 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj34 = shapeList33.clone();
        shapeList33.clear();
        java.awt.Shape shape37 = shapeList33.getShape((int) (short) 1);
        boolean boolean39 = shapeList33.equals((java.lang.Object) (short) -1);
        java.lang.Object obj40 = null;
        boolean boolean41 = shapeList33.equals(obj40);
        int int42 = shapeList33.size();
        java.lang.Object obj43 = null;
        boolean boolean44 = shapeList33.equals(obj43);
        java.awt.Shape shape46 = shapeList33.getShape((int) 'a');
        java.awt.Shape shape48 = shapeList33.getShape((int) (byte) 0);
        shapeList33.clear();
        java.lang.Class<?> wildcardClass50 = shapeList33.getClass();
        boolean boolean51 = shapeList0.equals((java.lang.Object) shapeList33);
        java.awt.Shape shape53 = null;
        shapeList33.setShape((int) (byte) 10, shape53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList33", shapeList0.equals(shapeList33) ? shapeList0.hashCode() == shapeList33.hashCode() : true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        java.awt.Shape shape5 = shapeList0.getShape((int) (byte) 100);
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
        java.awt.Shape shape21 = shapeList6.getShape((int) (short) 0);
        shapeList6.clear();
        java.awt.Shape shape24 = shapeList6.getShape((int) (short) -1);
        boolean boolean25 = shapeList0.equals((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 'a');
        java.lang.Object obj7 = shapeList0.clone();
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = null;
        shapeList0.setShape(33, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1));
        int int5 = shapeList0.size();
        java.awt.Shape shape7 = shapeList0.getShape((int) (byte) -1);
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = null;
        shapeList0.setShape(0, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape(0, shape6);
        java.lang.Object obj8 = shapeList0.clone();
        java.lang.Object obj9 = shapeList0.clone();
        int int10 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        boolean boolean13 = shapeList11.equals((java.lang.Object) (short) 1);
        boolean boolean15 = shapeList11.equals((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass16 = shapeList11.getClass();
        boolean boolean17 = shapeList0.equals((java.lang.Object) shapeList11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
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
        java.awt.Shape shape24 = null;
        shapeList0.setShape(101, shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        int int2 = shapeList0.size();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) '#', shape4);
        java.lang.Object obj6 = shapeList0.clone();
        java.lang.Object obj7 = shapeList0.clone();
        java.awt.Shape shape9 = shapeList0.getShape(0);
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        shapeList10.clear();
        java.awt.Shape shape13 = shapeList10.getShape(10);
        boolean boolean15 = shapeList10.equals((java.lang.Object) (byte) 1);
        java.awt.Shape shape17 = null;
        shapeList10.setShape(10, shape17);
        boolean boolean19 = shapeList0.equals((java.lang.Object) shapeList10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
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
        int int34 = shapeList0.size();
        java.awt.Shape shape36 = shapeList0.getShape(11);
        java.awt.Shape shape38 = shapeList0.getShape((int) (byte) 0);
        org.jfree.chart.util.ShapeList shapeList39 = new org.jfree.chart.util.ShapeList();
        int int40 = shapeList39.size();
        shapeList39.clear();
        java.awt.Shape shape43 = null;
        shapeList39.setShape((int) (short) 100, shape43);
        java.awt.Shape shape46 = null;
        shapeList39.setShape((int) '#', shape46);
        java.awt.Shape shape49 = shapeList39.getShape((int) (byte) 100);
        boolean boolean50 = shapeList0.equals((java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList39", shapeList0.equals(shapeList39) ? shapeList0.hashCode() == shapeList39.hashCode() : true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
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
        shapeList0.clear();
        java.awt.Shape shape13 = null;
        shapeList0.setShape((int) '4', shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.awt.Shape shape7 = null;
        shapeList0.setShape((int) '#', shape7);
        int int9 = shapeList0.size();
        java.awt.Shape shape11 = shapeList0.getShape((int) (byte) -1);
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape14 = null;
        shapeList12.setShape(8, shape14);
        java.awt.Shape shape17 = shapeList12.getShape((int) (byte) 100);
        java.awt.Shape shape19 = shapeList12.getShape((int) (byte) 100);
        java.awt.Shape shape21 = shapeList12.getShape(11);
        java.awt.Shape shape23 = null;
        shapeList12.setShape(1, shape23);
        shapeList12.clear();
        boolean boolean26 = shapeList0.equals((java.lang.Object) shapeList12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = shapeList0.clone();
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) '4', shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
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
        java.awt.Shape shape28 = null;
        shapeList0.setShape((int) (byte) 0, shape28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        java.lang.Object obj5 = null;
        boolean boolean6 = shapeList0.equals(obj5);
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) (short) 100, shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 10);
        java.lang.Object obj4 = shapeList0.clone();
        java.awt.Shape shape6 = shapeList0.getShape(2);
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) (byte) 10, shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
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
        int int14 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        boolean boolean17 = shapeList15.equals((java.lang.Object) (short) 1);
        boolean boolean19 = shapeList15.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape21 = null;
        shapeList15.setShape((int) (byte) 0, shape21);
        int int23 = shapeList15.size();
        boolean boolean25 = shapeList15.equals((java.lang.Object) (byte) 1);
        java.awt.Shape shape27 = shapeList15.getShape((int) (byte) 100);
        java.lang.Object obj28 = shapeList15.clone();
        boolean boolean29 = shapeList0.equals((java.lang.Object) shapeList15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList15", shapeList0.equals(shapeList15) ? shapeList0.hashCode() == shapeList15.hashCode() : true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
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
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj18 = shapeList17.clone();
        shapeList17.clear();
        java.awt.Shape shape21 = shapeList17.getShape((int) (short) 1);
        shapeList17.clear();
        shapeList17.clear();
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj25 = shapeList24.clone();
        shapeList24.clear();
        java.awt.Shape shape28 = shapeList24.getShape((int) (short) 1);
        boolean boolean30 = shapeList24.equals((java.lang.Object) (short) -1);
        org.jfree.chart.util.ShapeList shapeList31 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj32 = shapeList31.clone();
        shapeList31.clear();
        java.awt.Shape shape35 = shapeList31.getShape((int) (short) 1);
        boolean boolean37 = shapeList31.equals((java.lang.Object) 0);
        shapeList31.clear();
        boolean boolean39 = shapeList24.equals((java.lang.Object) shapeList31);
        boolean boolean40 = shapeList17.equals((java.lang.Object) boolean39);
        java.lang.Object obj41 = shapeList17.clone();
        int int42 = shapeList17.size();
        int int43 = shapeList17.size();
        boolean boolean44 = shapeList0.equals((java.lang.Object) int43);
        java.awt.Shape shape46 = null;
        shapeList0.setShape(0, shape46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 0, shape6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj4", shapeList0.equals(obj4) ? shapeList0.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape(9);
        int int5 = shapeList0.size();
        java.awt.Shape shape7 = null;
        shapeList0.setShape(100, shape7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
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
        java.awt.Shape shape46 = null;
        shapeList15.setShape(9, shape46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList15", shapeList0.equals(shapeList15) ? shapeList0.hashCode() == shapeList15.hashCode() : true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        int int4 = shapeList0.size();
        shapeList0.clear();
        int int6 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        int int8 = shapeList7.size();
        shapeList7.clear();
        java.awt.Shape shape11 = null;
        shapeList7.setShape((int) (short) 100, shape11);
        java.awt.Shape shape14 = shapeList7.getShape((int) (short) 10);
        java.awt.Shape shape16 = null;
        shapeList7.setShape(10, shape16);
        boolean boolean18 = shapeList0.equals((java.lang.Object) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        shapeList0.clear();
        shapeList0.clear();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj10 = shapeList9.clone();
        shapeList9.clear();
        java.awt.Shape shape13 = shapeList9.getShape((int) (short) 1);
        boolean boolean15 = shapeList9.equals((java.lang.Object) (short) -1);
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj17 = shapeList16.clone();
        shapeList16.clear();
        java.awt.Shape shape20 = shapeList16.getShape((int) (short) 1);
        boolean boolean22 = shapeList16.equals((java.lang.Object) 0);
        shapeList16.clear();
        boolean boolean24 = shapeList9.equals((java.lang.Object) shapeList16);
        java.lang.Object obj25 = shapeList9.clone();
        boolean boolean26 = shapeList0.equals(obj25);
        java.awt.Shape shape28 = shapeList0.getShape(101);
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape31 = null;
        shapeList29.setShape(8, shape31);
        int int33 = shapeList29.size();
        java.lang.Object obj34 = shapeList29.clone();
        int int35 = shapeList29.size();
        boolean boolean36 = shapeList0.equals((java.lang.Object) int35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList29", shapeList0.equals(shapeList29) ? shapeList0.hashCode() == shapeList29.hashCode() : true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        java.lang.Object obj5 = shapeList0.clone();
        int int6 = shapeList0.size();
        int int7 = shapeList0.size();
        java.awt.Shape shape9 = shapeList0.getShape(0);
        java.awt.Shape shape11 = null;
        shapeList0.setShape(0, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        java.lang.Object obj5 = shapeList0.clone();
        int int6 = shapeList0.size();
        int int7 = shapeList0.size();
        java.awt.Shape shape9 = null;
        shapeList0.setShape(8, shape9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
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
        java.lang.Object obj14 = shapeList13.clone();
        shapeList13.clear();
        java.awt.Shape shape17 = shapeList13.getShape((int) (short) 1);
        boolean boolean19 = shapeList13.equals((java.lang.Object) (short) -1);
        boolean boolean21 = shapeList13.equals((java.lang.Object) 100.0f);
        boolean boolean22 = shapeList0.equals((java.lang.Object) 100.0f);
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape25 = null;
        shapeList23.setShape(8, shape25);
        java.awt.Shape shape28 = shapeList23.getShape((int) (byte) 100);
        java.awt.Shape shape30 = shapeList23.getShape((int) (byte) 100);
        java.awt.Shape shape32 = shapeList23.getShape(11);
        java.awt.Shape shape34 = null;
        shapeList23.setShape((int) ' ', shape34);
        java.awt.Shape shape37 = shapeList23.getShape((int) (short) 1);
        int int38 = shapeList23.size();
        java.lang.Object obj39 = shapeList23.clone();
        boolean boolean40 = shapeList0.equals((java.lang.Object) shapeList23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList23", shapeList0.equals(shapeList23) ? shapeList0.hashCode() == shapeList23.hashCode() : true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        int int4 = shapeList0.size();
        java.lang.Object obj5 = shapeList0.clone();
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = null;
        shapeList0.setShape(10, shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = null;
        shapeList0.setShape(8, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
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
        java.awt.Shape shape37 = null;
        shapeList22.setShape(3, shape37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList22", shapeList0.equals(shapeList22) ? shapeList0.hashCode() == shapeList22.hashCode() : true);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        java.lang.Object obj5 = null;
        boolean boolean6 = shapeList0.equals(obj5);
        boolean boolean8 = shapeList0.equals((java.lang.Object) 0.0f);
        java.awt.Shape shape10 = null;
        shapeList0.setShape(1, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
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
        java.awt.Shape shape18 = null;
        shapeList5.setShape(36, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList5", shapeList0.equals(shapeList5) ? shapeList0.hashCode() == shapeList5.hashCode() : true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
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
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj16 = shapeList15.clone();
        shapeList15.clear();
        java.awt.Shape shape19 = shapeList15.getShape((int) (short) 1);
        boolean boolean21 = shapeList15.equals((java.lang.Object) (short) -1);
        java.lang.Object obj22 = shapeList15.clone();
        java.lang.Object obj23 = shapeList15.clone();
        java.awt.Shape shape25 = shapeList15.getShape((int) (byte) 10);
        java.awt.Shape shape27 = shapeList15.getShape(101);
        int int28 = shapeList15.size();
        boolean boolean29 = shapeList0.equals((java.lang.Object) int28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList15", shapeList0.equals(shapeList15) ? shapeList0.hashCode() == shapeList15.hashCode() : true);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 0L);
        java.awt.Shape shape8 = shapeList0.getShape(0);
        java.lang.Object obj9 = shapeList0.clone();
        java.lang.Object obj10 = shapeList0.clone();
        java.awt.Shape shape12 = null;
        shapeList0.setShape(101, shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
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
        java.awt.Shape shape22 = null;
        shapeList0.setShape((int) (short) 10, shape22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
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
        java.awt.Shape shape25 = shapeList0.getShape(11);
        int int26 = shapeList0.size();
        java.awt.Shape shape28 = null;
        shapeList0.setShape((int) (byte) 10, shape28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
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
        java.lang.Object obj27 = shapeList0.clone();
        java.awt.Shape shape29 = null;
        shapeList0.setShape(53, shape29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
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
        shapeList0.setShape(11, shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        int int4 = shapeList0.size();
        shapeList0.clear();
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) (byte) 10, shape8);
        java.lang.Object obj10 = shapeList0.clone();
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj10", shapeList0.equals(obj10) ? shapeList0.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
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
        java.awt.Shape shape13 = null;
        shapeList0.setShape(1, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
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
        shapeList0.clear();
        java.awt.Shape shape23 = null;
        shapeList0.setShape((int) (short) 0, shape23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = shapeList0.clone();
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape((int) (byte) 10);
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj12 = shapeList11.clone();
        shapeList11.clear();
        shapeList11.clear();
        java.awt.Shape shape16 = shapeList11.getShape((int) '#');
        shapeList11.clear();
        shapeList11.clear();
        java.lang.Class<?> wildcardClass19 = shapeList11.getClass();
        boolean boolean20 = shapeList0.equals((java.lang.Object) shapeList11);
        java.awt.Shape shape22 = null;
        shapeList0.setShape((int) 'a', shape22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) (short) 1, shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        int int4 = shapeList0.size();
        java.lang.Object obj5 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj7 = shapeList6.clone();
        shapeList6.clear();
        java.lang.Object obj9 = shapeList6.clone();
        int int10 = shapeList6.size();
        java.lang.Object obj11 = shapeList6.clone();
        shapeList6.clear();
        shapeList6.clear();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj15 = shapeList14.clone();
        shapeList14.clear();
        shapeList14.clear();
        java.awt.Shape shape19 = shapeList14.getShape((int) '#');
        java.awt.Shape shape21 = shapeList14.getShape(1);
        java.awt.Shape shape23 = shapeList14.getShape((int) (byte) 0);
        boolean boolean24 = shapeList6.equals((java.lang.Object) shapeList14);
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj26 = shapeList25.clone();
        shapeList25.clear();
        java.awt.Shape shape29 = shapeList25.getShape((int) (short) 1);
        boolean boolean31 = shapeList25.equals((java.lang.Object) 'a');
        java.lang.Object obj32 = shapeList25.clone();
        int int33 = shapeList25.size();
        boolean boolean34 = shapeList6.equals((java.lang.Object) shapeList25);
        int int35 = shapeList25.size();
        boolean boolean36 = shapeList0.equals((java.lang.Object) int35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        int int8 = shapeList7.size();
        int int9 = shapeList7.size();
        java.awt.Shape shape11 = null;
        shapeList7.setShape((int) ' ', shape11);
        java.lang.Object obj13 = shapeList7.clone();
        java.awt.Shape shape15 = shapeList7.getShape(9);
        boolean boolean16 = shapeList0.equals((java.lang.Object) 9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj5 = shapeList0.clone();
        shapeList0.clear();
        int int7 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape11 = null;
        shapeList0.setShape(11, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
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
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj20 = shapeList19.clone();
        shapeList19.clear();
        java.awt.Shape shape23 = shapeList19.getShape((int) (short) 1);
        boolean boolean25 = shapeList19.equals((java.lang.Object) (short) -1);
        java.lang.Object obj26 = null;
        boolean boolean27 = shapeList19.equals(obj26);
        java.lang.Class<?> wildcardClass28 = shapeList19.getClass();
        boolean boolean29 = shapeList0.equals((java.lang.Object) shapeList19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList19", shapeList0.equals(shapeList19) ? shapeList0.hashCode() == shapeList19.hashCode() : true);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
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
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj14", shapeList0.equals(obj14) ? shapeList0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        java.awt.Shape shape5 = shapeList0.getShape(100);
        java.lang.Object obj6 = shapeList0.clone();
        java.awt.Shape shape8 = null;
        shapeList0.setShape(3, shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj3", shapeList0.equals(obj3) ? shapeList0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
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
        java.awt.Shape shape14 = shapeList0.getShape(1);
        java.awt.Shape shape16 = null;
        shapeList0.setShape(36, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj11 = shapeList10.clone();
        shapeList10.clear();
        java.awt.Shape shape14 = shapeList10.getShape((int) (short) 1);
        boolean boolean16 = shapeList10.equals((java.lang.Object) 0L);
        boolean boolean17 = shapeList0.equals((java.lang.Object) 0L);
        java.awt.Shape shape19 = null;
        shapeList0.setShape(1, shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(1);
        int int5 = shapeList0.size();
        shapeList0.clear();
        int int7 = shapeList0.size();
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = null;
        shapeList0.setShape(33, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
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
        java.awt.Shape shape26 = null;
        shapeList0.setShape((int) (byte) 1, shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.lang.Object obj6 = shapeList0.clone();
        java.lang.Object obj7 = shapeList0.clone();
        java.lang.Object obj8 = shapeList0.clone();
        java.lang.Object obj9 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj11 = shapeList10.clone();
        shapeList10.clear();
        shapeList10.clear();
        java.lang.Object obj14 = shapeList10.clone();
        boolean boolean16 = shapeList10.equals((java.lang.Object) ' ');
        int int17 = shapeList10.size();
        boolean boolean18 = shapeList0.equals((java.lang.Object) int17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
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
        java.awt.Shape shape25 = null;
        shapeList0.setShape((int) '4', shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
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
        int int19 = shapeList0.size();
        java.awt.Shape shape21 = null;
        shapeList0.setShape((int) (byte) 100, shape21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
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
        shapeList0.clear();
        java.awt.Shape shape40 = null;
        shapeList0.setShape(1, shape40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) ' ', shape4);
        java.lang.Object obj6 = shapeList0.clone();
        java.awt.Shape shape8 = shapeList0.getShape(9);
        java.awt.Shape shape10 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape12 = shapeList0.getShape(100);
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
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
        java.awt.Shape shape46 = null;
        shapeList40.setShape(9, shape46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList40", shapeList0.equals(shapeList40) ? shapeList0.hashCode() == shapeList40.hashCode() : true);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        int int2 = shapeList0.size();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) '#', shape4);
        java.lang.Object obj6 = shapeList0.clone();
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) (byte) 1, shape8);
        java.awt.Shape shape11 = null;
        shapeList0.setShape(11, shape11);
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape(0, shape6);
        shapeList0.clear();
        java.awt.Shape shape10 = null;
        shapeList0.setShape(0, shape10);
        java.awt.Shape shape13 = null;
        shapeList0.setShape(2, shape13);
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj16 = shapeList15.clone();
        shapeList15.clear();
        java.lang.Object obj18 = shapeList15.clone();
        int int19 = shapeList15.size();
        java.lang.Object obj20 = shapeList15.clone();
        shapeList15.clear();
        shapeList15.clear();
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        boolean boolean25 = shapeList23.equals((java.lang.Object) (short) 1);
        boolean boolean27 = shapeList23.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj28 = shapeList23.clone();
        java.awt.Shape shape30 = shapeList23.getShape((int) (short) -1);
        int int31 = shapeList23.size();
        boolean boolean32 = shapeList15.equals((java.lang.Object) shapeList23);
        int int33 = shapeList23.size();
        boolean boolean34 = shapeList0.equals((java.lang.Object) shapeList23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList15", shapeList0.equals(shapeList15) ? shapeList0.hashCode() == shapeList15.hashCode() : true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        java.lang.Object obj3 = shapeList0.clone();
        java.awt.Shape shape5 = shapeList0.getShape(33);
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        int int7 = shapeList6.size();
        shapeList6.clear();
        java.awt.Shape shape10 = null;
        shapeList6.setShape((int) (short) 100, shape10);
        java.awt.Shape shape13 = shapeList6.getShape((int) '4');
        boolean boolean14 = shapeList0.equals((java.lang.Object) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape12 = null;
        shapeList0.setShape((int) ' ', shape12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
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
        int int16 = shapeList0.size();
        java.awt.Shape shape18 = null;
        shapeList0.setShape((int) (byte) 10, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) -1);
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        int int10 = shapeList0.size();
        int int11 = shapeList0.size();
        java.lang.Object obj12 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape15 = null;
        shapeList0.setShape(100, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
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
        java.awt.Shape shape23 = shapeList0.getShape((int) (byte) -1);
        java.awt.Shape shape25 = null;
        shapeList0.setShape(8, shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
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
        java.awt.Shape shape46 = null;
        shapeList11.setShape((int) (byte) 0, shape46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.awt.Shape shape3 = shapeList0.getShape(10);
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 1);
        java.lang.Object obj6 = shapeList0.clone();
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) (byte) 100, shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 0L);
        java.awt.Shape shape8 = shapeList0.getShape(0);
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = null;
        shapeList0.setShape(0, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) ' ', shape4);
        int int6 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        boolean boolean9 = shapeList7.equals((java.lang.Object) (short) 1);
        boolean boolean11 = shapeList7.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj13 = shapeList12.clone();
        shapeList12.clear();
        java.awt.Shape shape16 = shapeList12.getShape((int) (short) 1);
        boolean boolean18 = shapeList12.equals((java.lang.Object) (short) -1);
        shapeList12.clear();
        shapeList12.clear();
        java.awt.Shape shape22 = shapeList12.getShape((int) (short) 0);
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj24 = shapeList23.clone();
        shapeList23.clear();
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        int int27 = shapeList26.size();
        int int28 = shapeList26.size();
        java.lang.Object obj29 = shapeList26.clone();
        boolean boolean30 = shapeList23.equals(obj29);
        boolean boolean31 = shapeList12.equals((java.lang.Object) shapeList23);
        boolean boolean32 = shapeList7.equals((java.lang.Object) shapeList23);
        java.awt.Shape shape34 = shapeList23.getShape(8);
        boolean boolean35 = shapeList0.equals((java.lang.Object) 8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
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
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        shapeList14.clear();
        java.lang.Object obj16 = shapeList14.clone();
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        boolean boolean19 = shapeList17.equals((java.lang.Object) (short) 1);
        boolean boolean21 = shapeList17.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj22 = shapeList17.clone();
        java.awt.Shape shape24 = shapeList17.getShape((int) (short) -1);
        int int25 = shapeList17.size();
        boolean boolean26 = shapeList14.equals((java.lang.Object) int25);
        shapeList14.clear();
        java.awt.Shape shape29 = shapeList14.getShape((int) (short) 0);
        shapeList14.clear();
        java.awt.Shape shape32 = shapeList14.getShape((int) (short) -1);
        boolean boolean33 = shapeList0.equals((java.lang.Object) shape32);
        shapeList0.clear();
        java.awt.Shape shape36 = null;
        shapeList0.setShape((int) 'a', shape36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
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
        java.awt.Shape shape16 = shapeList0.getShape((int) (short) 10);
        java.awt.Shape shape18 = null;
        shapeList0.setShape((int) (byte) 0, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) 1.0d);
        java.awt.Shape shape6 = null;
        shapeList0.setShape(33, shape6);
        shapeList0.clear();
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) 'a', shape10);
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj13 = shapeList12.clone();
        shapeList12.clear();
        java.lang.Object obj15 = shapeList12.clone();
        int int16 = shapeList12.size();
        java.lang.Object obj17 = shapeList12.clone();
        shapeList12.clear();
        shapeList12.clear();
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj21 = shapeList20.clone();
        shapeList20.clear();
        shapeList20.clear();
        java.awt.Shape shape25 = shapeList20.getShape((int) '#');
        java.awt.Shape shape27 = shapeList20.getShape(1);
        java.awt.Shape shape29 = shapeList20.getShape((int) (byte) 0);
        boolean boolean30 = shapeList12.equals((java.lang.Object) shapeList20);
        org.jfree.chart.util.ShapeList shapeList31 = new org.jfree.chart.util.ShapeList();
        int int32 = shapeList31.size();
        shapeList31.clear();
        java.lang.Object obj34 = shapeList31.clone();
        java.awt.Shape shape36 = shapeList31.getShape((int) (short) -1);
        shapeList31.clear();
        boolean boolean38 = shapeList12.equals((java.lang.Object) shapeList31);
        java.lang.Object obj39 = shapeList12.clone();
        boolean boolean40 = shapeList0.equals((java.lang.Object) shapeList12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
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
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        shapeList20.clear();
        java.awt.Shape shape23 = shapeList20.getShape((int) (byte) 10);
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj25 = shapeList24.clone();
        shapeList24.clear();
        shapeList24.clear();
        java.lang.Object obj28 = shapeList24.clone();
        boolean boolean30 = shapeList24.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList31 = new org.jfree.chart.util.ShapeList();
        shapeList31.clear();
        int int33 = shapeList31.size();
        int int34 = shapeList31.size();
        boolean boolean35 = shapeList24.equals((java.lang.Object) int34);
        boolean boolean36 = shapeList20.equals((java.lang.Object) int34);
        shapeList20.clear();
        java.awt.Shape shape39 = shapeList20.getShape((int) (short) 100);
        shapeList20.clear();
        boolean boolean41 = shapeList0.equals((java.lang.Object) shapeList20);
        java.awt.Shape shape43 = null;
        shapeList0.setShape((int) (byte) 10, shape43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
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
        java.awt.Shape shape46 = null;
        shapeList0.setShape((int) (short) 0, shape46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
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
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj17 = shapeList16.clone();
        shapeList16.clear();
        shapeList16.clear();
        java.awt.Shape shape21 = shapeList16.getShape((int) '#');
        java.awt.Shape shape23 = shapeList16.getShape(1);
        java.awt.Shape shape25 = shapeList16.getShape((int) (byte) 0);
        java.awt.Shape shape27 = shapeList16.getShape((int) (short) 100);
        shapeList16.clear();
        java.lang.Class<?> wildcardClass29 = shapeList16.getClass();
        boolean boolean30 = shapeList0.equals((java.lang.Object) shapeList16);
        java.awt.Shape shape32 = null;
        shapeList0.setShape((int) (byte) 10, shape32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        java.lang.Object obj5 = shapeList0.clone();
        int int6 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        shapeList7.clear();
        java.awt.Shape shape11 = shapeList7.getShape((int) (short) 1);
        boolean boolean13 = shapeList7.equals((java.lang.Object) (short) -1);
        java.lang.Object obj14 = shapeList7.clone();
        java.lang.Object obj15 = shapeList7.clone();
        java.lang.Class<?> wildcardClass16 = shapeList7.getClass();
        boolean boolean17 = shapeList0.equals((java.lang.Object) shapeList7);
        java.awt.Shape shape19 = null;
        shapeList0.setShape(36, shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape(1);
        java.awt.Shape shape9 = shapeList0.getShape(100);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        java.awt.Shape shape13 = shapeList0.getShape(100);
        java.awt.Shape shape15 = null;
        shapeList0.setShape((int) (short) 100, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
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
        int int16 = shapeList0.size();
        java.awt.Shape shape18 = shapeList0.getShape((int) '4');
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        boolean boolean21 = shapeList19.equals((java.lang.Object) (short) 1);
        boolean boolean23 = shapeList19.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape25 = null;
        shapeList19.setShape((int) (byte) 0, shape25);
        int int27 = shapeList19.size();
        boolean boolean29 = shapeList19.equals((java.lang.Object) (byte) 1);
        java.awt.Shape shape31 = shapeList19.getShape((int) '4');
        java.awt.Shape shape33 = null;
        shapeList19.setShape(9, shape33);
        boolean boolean35 = shapeList0.equals((java.lang.Object) shapeList19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList19", shapeList0.equals(shapeList19) ? shapeList0.hashCode() == shapeList19.hashCode() : true);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
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
        java.awt.Shape shape28 = shapeList14.getShape(0);
        int int29 = shapeList14.size();
        java.awt.Shape shape31 = null;
        shapeList14.setShape(9, shape31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        java.awt.Shape shape4 = shapeList0.getShape((int) (byte) 10);
        int int5 = shapeList0.size();
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
        shapeList6.clear();
        shapeList6.clear();
        boolean boolean23 = shapeList0.equals((java.lang.Object) shapeList6);
        java.awt.Shape shape25 = null;
        shapeList6.setShape(1, shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
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
        java.awt.Shape shape15 = shapeList0.getShape((int) (byte) 0);
        shapeList0.clear();
        java.lang.Object obj17 = shapeList0.clone();
        java.awt.Shape shape19 = shapeList0.getShape((int) (short) -1);
        java.awt.Shape shape21 = null;
        shapeList0.setShape((int) (byte) 1, shape21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
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
        shapeList25.setShape((int) (byte) 10, shape30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList25", shapeList0.equals(shapeList25) ? shapeList0.hashCode() == shapeList25.hashCode() : true);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
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
        java.awt.Shape shape17 = null;
        shapeList0.setShape(36, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.lang.Object obj6 = shapeList0.clone();
        java.lang.Object obj7 = shapeList0.clone();
        java.lang.Object obj8 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj10 = shapeList9.clone();
        shapeList9.clear();
        java.awt.Shape shape13 = shapeList9.getShape((int) (short) 1);
        boolean boolean15 = shapeList9.equals((java.lang.Object) (short) -1);
        shapeList9.clear();
        shapeList9.clear();
        java.lang.Object obj18 = shapeList9.clone();
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj20 = shapeList19.clone();
        shapeList19.clear();
        java.awt.Shape shape23 = shapeList19.getShape((int) (short) 1);
        boolean boolean25 = shapeList19.equals((java.lang.Object) 0L);
        boolean boolean26 = shapeList9.equals((java.lang.Object) 0L);
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj28 = shapeList27.clone();
        shapeList27.clear();
        java.awt.Shape shape31 = shapeList27.getShape((int) (short) 1);
        java.lang.Object obj32 = shapeList27.clone();
        java.awt.Shape shape34 = shapeList27.getShape((int) (short) 100);
        java.awt.Shape shape36 = shapeList27.getShape(1);
        java.lang.Object obj37 = shapeList27.clone();
        boolean boolean38 = shapeList9.equals(obj37);
        boolean boolean39 = shapeList0.equals(obj37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 'a');
        java.lang.Object obj7 = shapeList0.clone();
        int int8 = shapeList0.size();
        java.lang.Object obj9 = shapeList0.clone();
        boolean boolean11 = shapeList0.equals((java.lang.Object) 0.0f);
        java.awt.Shape shape13 = shapeList0.getShape(10);
        java.awt.Shape shape15 = null;
        shapeList0.setShape(11, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
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
        java.lang.Object obj14 = shapeList0.clone();
        java.awt.Shape shape16 = null;
        shapeList0.setShape(101, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
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
        java.awt.Shape shape15 = shapeList0.getShape((int) (byte) 0);
        shapeList0.clear();
        java.lang.Object obj17 = shapeList0.clone();
        java.awt.Shape shape19 = shapeList0.getShape((int) (short) -1);
        java.awt.Shape shape21 = null;
        shapeList0.setShape(10, shape21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 0);
        java.awt.Shape shape8 = shapeList0.getShape(0);
        int int9 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        boolean boolean14 = shapeList12.equals((java.lang.Object) (short) 1);
        java.lang.Object obj15 = shapeList12.clone();
        boolean boolean16 = shapeList0.equals(obj15);
        java.awt.Shape shape18 = null;
        shapeList0.setShape((int) (byte) 10, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        java.awt.Shape shape5 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape7 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape9 = null;
        shapeList0.setShape(10, shape9);
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        int int12 = shapeList11.size();
        shapeList11.clear();
        java.awt.Shape shape15 = null;
        shapeList11.setShape((int) (short) 100, shape15);
        java.lang.Object obj17 = shapeList11.clone();
        java.lang.Object obj18 = shapeList11.clone();
        boolean boolean19 = shapeList0.equals(obj18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape(1);
        java.awt.Shape shape9 = shapeList0.getShape((int) (byte) 0);
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        boolean boolean12 = shapeList10.equals((java.lang.Object) (short) 1);
        boolean boolean14 = shapeList10.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj15 = shapeList10.clone();
        java.awt.Shape shape17 = shapeList10.getShape((int) (short) -1);
        int int18 = shapeList10.size();
        int int19 = shapeList10.size();
        int int20 = shapeList10.size();
        boolean boolean21 = shapeList0.equals((java.lang.Object) shapeList10);
        java.lang.Object obj22 = shapeList0.clone();
        java.awt.Shape shape24 = null;
        shapeList0.setShape(10, shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        java.lang.Object obj3 = shapeList0.clone();
        java.awt.Shape shape5 = shapeList0.getShape(33);
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = null;
        shapeList0.setShape(8, shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj3", shapeList0.equals(obj3) ? shapeList0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape(1);
        java.awt.Shape shape9 = shapeList0.getShape((int) (byte) 0);
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj11 = shapeList10.clone();
        shapeList10.clear();
        java.lang.Object obj13 = shapeList10.clone();
        int int14 = shapeList10.size();
        java.lang.Object obj15 = shapeList10.clone();
        shapeList10.clear();
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj18 = shapeList17.clone();
        shapeList17.clear();
        java.awt.Shape shape21 = shapeList17.getShape((int) (short) 1);
        boolean boolean23 = shapeList17.equals((java.lang.Object) 'a');
        java.lang.Object obj24 = shapeList17.clone();
        java.lang.Object obj25 = shapeList17.clone();
        boolean boolean26 = shapeList10.equals((java.lang.Object) shapeList17);
        boolean boolean27 = shapeList0.equals((java.lang.Object) shapeList17);
        java.awt.Shape shape29 = null;
        shapeList0.setShape((int) 'a', shape29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
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
        shapeList0.setShape(11, shape30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape(0, shape6);
        int int8 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj12 = shapeList0.clone();
        java.awt.Shape shape14 = null;
        shapeList0.setShape((int) (byte) 100, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj12", shapeList0.equals(obj12) ? shapeList0.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = null;
        boolean boolean8 = shapeList0.equals(obj7);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj11 = shapeList10.clone();
        shapeList10.clear();
        java.awt.Shape shape14 = shapeList10.getShape((int) (short) 1);
        java.lang.Object obj15 = shapeList10.clone();
        java.awt.Shape shape17 = shapeList10.getShape((int) (short) 100);
        java.lang.Object obj18 = shapeList10.clone();
        boolean boolean19 = shapeList0.equals((java.lang.Object) shapeList10);
        java.awt.Shape shape21 = null;
        shapeList0.setShape(8, shape21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
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
        java.lang.Object obj37 = shapeList0.clone();
        java.awt.Shape shape39 = null;
        shapeList0.setShape((int) (byte) 10, shape39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
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
        shapeList0.clear();
        java.awt.Shape shape34 = null;
        shapeList0.setShape((int) (short) 100, shape34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) -1);
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        java.lang.Object obj10 = shapeList0.clone();
        java.awt.Shape shape12 = shapeList0.getShape((int) (short) 1);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        boolean boolean15 = shapeList13.equals((java.lang.Object) (short) 1);
        boolean boolean17 = shapeList13.equals((java.lang.Object) 1.0d);
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj19 = shapeList18.clone();
        shapeList18.clear();
        java.awt.Shape shape22 = shapeList18.getShape((int) (short) 1);
        boolean boolean24 = shapeList18.equals((java.lang.Object) 0);
        java.lang.Object obj25 = shapeList18.clone();
        boolean boolean27 = shapeList18.equals((java.lang.Object) false);
        java.lang.Object obj28 = shapeList18.clone();
        boolean boolean29 = shapeList13.equals((java.lang.Object) shapeList18);
        shapeList13.clear();
        boolean boolean31 = shapeList0.equals((java.lang.Object) shapeList13);
        java.awt.Shape shape33 = null;
        shapeList0.setShape((int) (byte) 0, shape33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
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
        java.awt.Shape shape25 = null;
        shapeList0.setShape(11, shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
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
        java.awt.Shape shape20 = null;
        shapeList0.setShape(33, shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.awt.Shape shape7 = null;
        shapeList0.setShape((int) '#', shape7);
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj10 = shapeList9.clone();
        java.lang.Object obj11 = shapeList9.clone();
        java.awt.Shape shape13 = shapeList9.getShape(1);
        shapeList9.clear();
        shapeList9.clear();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj17 = shapeList16.clone();
        shapeList16.clear();
        java.awt.Shape shape20 = shapeList16.getShape((int) (short) 1);
        boolean boolean22 = shapeList16.equals((java.lang.Object) 'a');
        java.lang.Object obj23 = shapeList16.clone();
        boolean boolean24 = shapeList9.equals(obj23);
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj26 = shapeList25.clone();
        shapeList25.clear();
        java.awt.Shape shape29 = shapeList25.getShape((int) (short) 1);
        java.lang.Object obj30 = shapeList25.clone();
        boolean boolean31 = shapeList9.equals((java.lang.Object) shapeList25);
        java.lang.Object obj32 = shapeList9.clone();
        boolean boolean33 = shapeList0.equals(obj32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        int int2 = shapeList0.size();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) '#', shape4);
        java.lang.Object obj6 = shapeList0.clone();
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) (byte) 1, shape8);
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj11 = shapeList10.clone();
        shapeList10.clear();
        shapeList10.clear();
        java.lang.Object obj14 = shapeList10.clone();
        java.lang.Object obj15 = shapeList10.clone();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj17 = shapeList16.clone();
        shapeList16.clear();
        shapeList16.clear();
        java.lang.Object obj20 = shapeList16.clone();
        boolean boolean22 = shapeList16.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        shapeList23.clear();
        int int25 = shapeList23.size();
        int int26 = shapeList23.size();
        boolean boolean27 = shapeList16.equals((java.lang.Object) int26);
        java.lang.Object obj28 = shapeList16.clone();
        boolean boolean29 = shapeList10.equals((java.lang.Object) shapeList16);
        int int30 = shapeList16.size();
        org.jfree.chart.util.ShapeList shapeList31 = new org.jfree.chart.util.ShapeList();
        shapeList31.clear();
        int int33 = shapeList31.size();
        java.lang.Object obj34 = shapeList31.clone();
        boolean boolean35 = shapeList16.equals(obj34);
        boolean boolean36 = shapeList0.equals(obj34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
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
        java.lang.Object obj15 = shapeList0.clone();
        int int16 = shapeList0.size();
        java.awt.Shape shape18 = null;
        shapeList0.setShape((int) (short) 1, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.util.ShapeList shapeList3 = new org.jfree.chart.util.ShapeList();
        boolean boolean5 = shapeList3.equals((java.lang.Object) (short) 1);
        java.awt.Shape shape7 = null;
        shapeList3.setShape((int) '4', shape7);
        java.lang.Class<?> wildcardClass9 = shapeList3.getClass();
        boolean boolean10 = shapeList0.equals((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
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
        java.awt.Shape shape17 = null;
        shapeList0.setShape((int) (byte) 1, shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
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
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        boolean boolean16 = shapeList14.equals((java.lang.Object) (short) 1);
        boolean boolean18 = shapeList14.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape20 = null;
        shapeList14.setShape((int) (byte) 0, shape20);
        java.awt.Shape shape23 = null;
        shapeList14.setShape((int) (byte) 10, shape23);
        boolean boolean26 = shapeList14.equals((java.lang.Object) (-1));
        java.awt.Shape shape28 = null;
        shapeList14.setShape((int) (short) 0, shape28);
        java.lang.Object obj30 = shapeList14.clone();
        boolean boolean31 = shapeList0.equals((java.lang.Object) shapeList14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
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
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape18 = null;
        shapeList16.setShape(8, shape18);
        int int20 = shapeList16.size();
        shapeList16.clear();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        shapeList22.clear();
        java.lang.Object obj24 = shapeList22.clone();
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        boolean boolean27 = shapeList25.equals((java.lang.Object) (short) 1);
        boolean boolean29 = shapeList25.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj30 = shapeList25.clone();
        java.awt.Shape shape32 = shapeList25.getShape((int) (short) -1);
        int int33 = shapeList25.size();
        boolean boolean34 = shapeList22.equals((java.lang.Object) int33);
        shapeList22.clear();
        boolean boolean36 = shapeList16.equals((java.lang.Object) shapeList22);
        shapeList22.clear();
        java.lang.Object obj38 = shapeList22.clone();
        java.awt.Shape shape40 = shapeList22.getShape((int) 'a');
        boolean boolean41 = shapeList0.equals((java.lang.Object) shape40);
        java.awt.Shape shape43 = shapeList0.getShape((int) (byte) 10);
        org.jfree.chart.util.ShapeList shapeList44 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj45 = shapeList44.clone();
        shapeList44.clear();
        java.awt.Shape shape48 = shapeList44.getShape((int) (short) 1);
        boolean boolean50 = shapeList44.equals((java.lang.Object) (short) -1);
        shapeList44.clear();
        shapeList44.clear();
        java.awt.Shape shape54 = shapeList44.getShape((int) (short) 0);
        org.jfree.chart.util.ShapeList shapeList55 = new org.jfree.chart.util.ShapeList();
        boolean boolean57 = shapeList55.equals((java.lang.Object) (short) 1);
        boolean boolean59 = shapeList55.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj60 = shapeList55.clone();
        java.awt.Shape shape62 = shapeList55.getShape((int) (short) -1);
        boolean boolean64 = shapeList55.equals((java.lang.Object) (-1.0d));
        boolean boolean65 = shapeList44.equals((java.lang.Object) shapeList55);
        java.awt.Shape shape67 = shapeList55.getShape(1);
        org.jfree.chart.util.ShapeList shapeList68 = new org.jfree.chart.util.ShapeList();
        boolean boolean70 = shapeList68.equals((java.lang.Object) (short) 1);
        boolean boolean72 = shapeList68.equals((java.lang.Object) 1.0d);
        java.lang.Object obj73 = shapeList68.clone();
        boolean boolean74 = shapeList55.equals(obj73);
        boolean boolean75 = shapeList0.equals((java.lang.Object) shapeList55);
        java.awt.Shape shape77 = null;
        shapeList55.setShape((int) (short) 1, shape77);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList55", shapeList0.equals(shapeList55) ? shapeList0.hashCode() == shapeList55.hashCode() : true);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.lang.Object obj6 = shapeList0.clone();
        java.lang.Object obj7 = shapeList0.clone();
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = shapeList0.getShape((int) (short) 10);
        java.lang.Object obj11 = shapeList0.clone();
        java.lang.Object obj12 = shapeList0.clone();
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj8 = shapeList0.clone();
        java.lang.Object obj9 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        shapeList10.clear();
        java.lang.Object obj12 = shapeList10.clone();
        java.lang.Object obj13 = shapeList10.clone();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj15 = shapeList14.clone();
        shapeList14.clear();
        java.awt.Shape shape18 = shapeList14.getShape((int) ' ');
        java.lang.Object obj19 = shapeList14.clone();
        shapeList14.clear();
        boolean boolean21 = shapeList10.equals((java.lang.Object) shapeList14);
        boolean boolean22 = shapeList0.equals((java.lang.Object) shapeList14);
        java.awt.Shape shape24 = null;
        shapeList14.setShape((int) (short) 10, shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
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
        java.awt.Shape shape32 = null;
        shapeList14.setShape((int) (byte) 100, shape32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList14", shapeList0.equals(shapeList14) ? shapeList0.hashCode() == shapeList14.hashCode() : true);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = shapeList0.clone();
        java.lang.Object obj8 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj10 = shapeList9.clone();
        shapeList9.clear();
        java.awt.Shape shape13 = shapeList9.getShape((int) (short) 1);
        boolean boolean15 = shapeList9.equals((java.lang.Object) (short) -1);
        java.lang.Object obj16 = null;
        boolean boolean17 = shapeList9.equals(obj16);
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        boolean boolean20 = shapeList18.equals((java.lang.Object) (short) 1);
        boolean boolean22 = shapeList18.equals((java.lang.Object) 1.0d);
        java.lang.Object obj23 = shapeList18.clone();
        boolean boolean24 = shapeList9.equals(obj23);
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
        boolean boolean42 = shapeList9.equals((java.lang.Object) shapeList31);
        org.jfree.chart.util.ShapeList shapeList43 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj44 = shapeList43.clone();
        shapeList43.clear();
        boolean boolean46 = shapeList9.equals((java.lang.Object) shapeList43);
        boolean boolean47 = shapeList0.equals((java.lang.Object) shapeList43);
        java.awt.Shape shape49 = null;
        shapeList43.setShape(9, shape49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList43", shapeList0.equals(shapeList43) ? shapeList0.hashCode() == shapeList43.hashCode() : true);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
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
        java.awt.Shape shape46 = null;
        shapeList11.setShape(3, shape46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        java.lang.Object obj5 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        boolean boolean8 = shapeList6.equals((java.lang.Object) (short) 1);
        boolean boolean10 = shapeList6.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape12 = null;
        shapeList6.setShape(0, shape12);
        java.lang.Object obj14 = shapeList6.clone();
        java.lang.Object obj15 = shapeList6.clone();
        boolean boolean16 = shapeList0.equals(obj15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
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
        java.awt.Shape shape17 = shapeList0.getShape(9);
        java.awt.Shape shape19 = null;
        shapeList0.setShape(34, shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.awt.Shape shape3 = shapeList0.getShape(10);
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj5 = shapeList4.clone();
        shapeList4.clear();
        shapeList4.clear();
        java.awt.Shape shape9 = shapeList4.getShape((int) '#');
        java.awt.Shape shape11 = shapeList4.getShape(1);
        java.awt.Shape shape13 = shapeList4.getShape((int) (byte) 0);
        java.awt.Shape shape15 = shapeList4.getShape((int) (short) 100);
        boolean boolean16 = shapeList0.equals((java.lang.Object) shape15);
        java.awt.Shape shape18 = null;
        shapeList0.setShape((int) (byte) 1, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.awt.Shape shape3 = shapeList0.getShape(10);
        boolean boolean5 = shapeList0.equals((java.lang.Object) (byte) 1);
        java.awt.Shape shape7 = null;
        shapeList0.setShape(10, shape7);
        java.awt.Shape shape10 = null;
        shapeList0.setShape(11, shape10);
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape14 = null;
        shapeList12.setShape(8, shape14);
        int int16 = shapeList12.size();
        shapeList12.clear();
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        shapeList18.clear();
        java.lang.Object obj20 = shapeList18.clone();
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        boolean boolean23 = shapeList21.equals((java.lang.Object) (short) 1);
        boolean boolean25 = shapeList21.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj26 = shapeList21.clone();
        java.awt.Shape shape28 = shapeList21.getShape((int) (short) -1);
        int int29 = shapeList21.size();
        boolean boolean30 = shapeList18.equals((java.lang.Object) int29);
        shapeList18.clear();
        boolean boolean32 = shapeList12.equals((java.lang.Object) shapeList18);
        shapeList18.clear();
        java.lang.Object obj34 = shapeList18.clone();
        java.awt.Shape shape36 = shapeList18.getShape((int) 'a');
        shapeList18.clear();
        int int38 = shapeList18.size();
        java.lang.Class<?> wildcardClass39 = shapeList18.getClass();
        boolean boolean40 = shapeList0.equals((java.lang.Object) wildcardClass39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
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
        java.awt.Shape shape27 = shapeList16.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList28 = new org.jfree.chart.util.ShapeList();
        shapeList28.clear();
        int int30 = shapeList28.size();
        shapeList28.clear();
        org.jfree.chart.util.ShapeList shapeList32 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj33 = shapeList32.clone();
        shapeList32.clear();
        java.awt.Shape shape36 = shapeList32.getShape((int) (short) 1);
        boolean boolean38 = shapeList32.equals((java.lang.Object) 'a');
        java.lang.Object obj39 = shapeList32.clone();
        int int40 = shapeList32.size();
        boolean boolean41 = shapeList28.equals((java.lang.Object) shapeList32);
        java.lang.Object obj42 = shapeList32.clone();
        java.lang.Class<?> wildcardClass43 = obj42.getClass();
        boolean boolean44 = shapeList16.equals((java.lang.Object) wildcardClass43);
        java.awt.Shape shape46 = null;
        shapeList16.setShape((int) (byte) 0, shape46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList16", shapeList0.equals(shapeList16) ? shapeList0.hashCode() == shapeList16.hashCode() : true);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
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
        int int21 = shapeList0.size();
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj14", shapeList0.equals(obj14) ? shapeList0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) -1);
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        int int10 = shapeList0.size();
        java.awt.Shape shape12 = shapeList0.getShape((int) '#');
        java.awt.Shape shape14 = null;
        shapeList0.setShape(36, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = null;
        boolean boolean8 = shapeList0.equals(obj7);
        int int9 = shapeList0.size();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape13 = null;
        shapeList11.setShape(8, shape13);
        int int15 = shapeList11.size();
        int int16 = shapeList11.size();
        java.awt.Shape shape18 = null;
        shapeList11.setShape((int) 'a', shape18);
        boolean boolean20 = shapeList0.equals((java.lang.Object) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
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
        java.awt.Shape shape31 = null;
        shapeList0.setShape(11, shape31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
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
        java.lang.Object obj14 = shapeList0.clone();
        java.awt.Shape shape16 = shapeList0.getShape((-1));
        java.awt.Shape shape18 = shapeList0.getShape((int) (short) 100);
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        boolean boolean21 = shapeList19.equals((java.lang.Object) (short) 1);
        boolean boolean23 = shapeList19.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape25 = null;
        shapeList19.setShape(0, shape25);
        int int27 = shapeList19.size();
        java.awt.Shape shape29 = null;
        shapeList19.setShape(0, shape29);
        java.lang.Object obj31 = shapeList19.clone();
        boolean boolean32 = shapeList0.equals(obj31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList19", shapeList0.equals(shapeList19) ? shapeList0.hashCode() == shapeList19.hashCode() : true);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape(1);
        java.awt.Shape shape9 = shapeList0.getShape(100);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        java.awt.Shape shape13 = shapeList0.getShape(9);
        java.awt.Shape shape15 = shapeList0.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        boolean boolean18 = shapeList16.equals((java.lang.Object) (short) 1);
        boolean boolean20 = shapeList16.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj21 = shapeList16.clone();
        java.awt.Shape shape23 = shapeList16.getShape((int) (short) -1);
        int int24 = shapeList16.size();
        int int25 = shapeList16.size();
        int int26 = shapeList16.size();
        java.awt.Shape shape28 = shapeList16.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj30 = shapeList29.clone();
        shapeList29.clear();
        java.lang.Object obj32 = shapeList29.clone();
        int int33 = shapeList29.size();
        java.lang.Object obj34 = shapeList29.clone();
        shapeList29.clear();
        org.jfree.chart.util.ShapeList shapeList36 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj37 = shapeList36.clone();
        shapeList36.clear();
        java.awt.Shape shape40 = shapeList36.getShape((int) (short) 1);
        boolean boolean42 = shapeList36.equals((java.lang.Object) 'a');
        java.lang.Object obj43 = shapeList36.clone();
        java.lang.Object obj44 = shapeList36.clone();
        boolean boolean45 = shapeList29.equals((java.lang.Object) shapeList36);
        boolean boolean46 = shapeList16.equals((java.lang.Object) boolean45);
        boolean boolean47 = shapeList0.equals((java.lang.Object) boolean45);
        java.awt.Shape shape49 = null;
        shapeList0.setShape(11, shape49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape(0, shape6);
        java.lang.Object obj8 = shapeList0.clone();
        java.lang.Object obj9 = shapeList0.clone();
        int int10 = shapeList0.size();
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj8", shapeList0.equals(obj8) ? shapeList0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
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
        java.awt.Shape shape18 = null;
        shapeList0.setShape(8, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape10 = null;
        shapeList0.setShape(3, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 0);
        java.lang.Object obj7 = shapeList0.clone();
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = null;
        shapeList0.setShape(1, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape(1);
        java.awt.Shape shape9 = shapeList0.getShape((int) (byte) 0);
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj11 = shapeList10.clone();
        shapeList10.clear();
        java.lang.Object obj13 = shapeList10.clone();
        int int14 = shapeList10.size();
        java.lang.Object obj15 = shapeList10.clone();
        shapeList10.clear();
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj18 = shapeList17.clone();
        shapeList17.clear();
        java.awt.Shape shape21 = shapeList17.getShape((int) (short) 1);
        boolean boolean23 = shapeList17.equals((java.lang.Object) 'a');
        java.lang.Object obj24 = shapeList17.clone();
        java.lang.Object obj25 = shapeList17.clone();
        boolean boolean26 = shapeList10.equals((java.lang.Object) shapeList17);
        boolean boolean27 = shapeList0.equals((java.lang.Object) shapeList17);
        java.awt.Shape shape29 = null;
        shapeList0.setShape(101, shape29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
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
        shapeList0.setShape(11, shape71);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        java.lang.Object obj5 = null;
        boolean boolean6 = shapeList0.equals(obj5);
        boolean boolean8 = shapeList0.equals((java.lang.Object) 0.0f);
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = null;
        shapeList0.setShape(33, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
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
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        boolean boolean14 = shapeList12.equals((java.lang.Object) (short) 1);
        boolean boolean16 = shapeList12.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj17 = shapeList12.clone();
        java.awt.Shape shape19 = shapeList12.getShape((int) (short) -1);
        int int20 = shapeList12.size();
        int int21 = shapeList12.size();
        int int22 = shapeList12.size();
        java.awt.Shape shape24 = shapeList12.getShape((int) '#');
        boolean boolean25 = shapeList0.equals((java.lang.Object) '#');
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        shapeList26.clear();
        java.lang.Object obj28 = shapeList26.clone();
        boolean boolean30 = shapeList26.equals((java.lang.Object) (-1));
        int int31 = shapeList26.size();
        java.awt.Shape shape33 = shapeList26.getShape((int) (byte) -1);
        java.awt.Shape shape35 = shapeList26.getShape((int) (short) 0);
        boolean boolean36 = shapeList0.equals((java.lang.Object) shapeList26);
        int int37 = shapeList0.size();
        java.awt.Shape shape39 = null;
        shapeList0.setShape((int) (byte) 1, shape39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
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
        shapeList6.clear();
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        int int25 = shapeList24.size();
        int int26 = shapeList24.size();
        java.awt.Shape shape28 = null;
        shapeList24.setShape((int) ' ', shape28);
        java.awt.Shape shape31 = null;
        shapeList24.setShape(0, shape31);
        boolean boolean33 = shapeList6.equals((java.lang.Object) shape31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList24", shapeList0.equals(shapeList24) ? shapeList0.hashCode() == shapeList24.hashCode() : true);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
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
        java.awt.Shape shape26 = null;
        shapeList0.setShape(0, shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
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
        shapeList0.setShape(36, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList3", shapeList0.equals(shapeList3) ? shapeList0.hashCode() == shapeList3.hashCode() : true);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 0, shape6);
        int int8 = shapeList0.size();
        boolean boolean10 = shapeList0.equals((java.lang.Object) (byte) 1);
        int int11 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj13 = shapeList12.clone();
        shapeList12.clear();
        java.awt.Shape shape16 = shapeList12.getShape((int) (short) 1);
        boolean boolean18 = shapeList12.equals((java.lang.Object) (short) -1);
        java.lang.Object obj19 = null;
        boolean boolean20 = shapeList12.equals(obj19);
        int int21 = shapeList12.size();
        java.lang.Object obj22 = null;
        boolean boolean23 = shapeList12.equals(obj22);
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        boolean boolean26 = shapeList24.equals((java.lang.Object) (short) 1);
        boolean boolean28 = shapeList24.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj29 = shapeList24.clone();
        java.awt.Shape shape31 = shapeList24.getShape((int) (short) -1);
        int int32 = shapeList24.size();
        int int33 = shapeList24.size();
        int int34 = shapeList24.size();
        java.awt.Shape shape36 = shapeList24.getShape((int) '#');
        boolean boolean37 = shapeList12.equals((java.lang.Object) '#');
        int int38 = shapeList12.size();
        java.lang.Object obj39 = shapeList12.clone();
        boolean boolean40 = shapeList0.equals(obj39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape6 = null;
        shapeList4.setShape(8, shape6);
        int int8 = shapeList4.size();
        shapeList4.clear();
        int int10 = shapeList4.size();
        java.awt.Shape shape12 = null;
        shapeList4.setShape((int) (byte) 10, shape12);
        java.lang.Object obj14 = shapeList4.clone();
        boolean boolean15 = shapeList0.equals(obj14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 0);
        int int7 = shapeList0.size();
        int int8 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape11 = null;
        shapeList9.setShape(8, shape11);
        int int13 = shapeList9.size();
        shapeList9.clear();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        shapeList15.clear();
        java.lang.Object obj17 = shapeList15.clone();
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        boolean boolean20 = shapeList18.equals((java.lang.Object) (short) 1);
        boolean boolean22 = shapeList18.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj23 = shapeList18.clone();
        java.awt.Shape shape25 = shapeList18.getShape((int) (short) -1);
        int int26 = shapeList18.size();
        boolean boolean27 = shapeList15.equals((java.lang.Object) int26);
        shapeList15.clear();
        boolean boolean29 = shapeList9.equals((java.lang.Object) shapeList15);
        java.lang.Object obj30 = shapeList15.clone();
        boolean boolean31 = shapeList0.equals((java.lang.Object) shapeList15);
        java.awt.Shape shape33 = shapeList0.getShape(53);
        java.awt.Shape shape35 = null;
        shapeList0.setShape((int) '4', shape35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
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
        shapeList0.setShape(0, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape5 = null;
        shapeList0.setShape(9, shape5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj2", shapeList0.equals(obj2) ? shapeList0.hashCode() == obj2.hashCode() : true);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(1);
        int int5 = shapeList0.size();
        java.awt.Shape shape7 = null;
        shapeList0.setShape((int) '#', shape7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        java.awt.Shape shape5 = null;
        shapeList0.setShape(10, shape5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.awt.Shape shape7 = null;
        shapeList0.setShape((int) (byte) 100, shape7);
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape11 = null;
        shapeList9.setShape(8, shape11);
        int int13 = shapeList9.size();
        shapeList9.clear();
        int int15 = shapeList9.size();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj17 = shapeList16.clone();
        shapeList16.clear();
        java.awt.Shape shape20 = shapeList16.getShape((int) (short) 1);
        java.lang.Object obj21 = shapeList16.clone();
        java.lang.Object obj22 = shapeList16.clone();
        boolean boolean23 = shapeList9.equals((java.lang.Object) shapeList16);
        java.awt.Shape shape25 = shapeList9.getShape((int) (short) 10);
        shapeList9.clear();
        java.awt.Shape shape28 = shapeList9.getShape((int) (short) 1);
        shapeList9.clear();
        org.jfree.chart.util.ShapeList shapeList30 = new org.jfree.chart.util.ShapeList();
        boolean boolean32 = shapeList30.equals((java.lang.Object) (short) 1);
        java.awt.Shape shape34 = shapeList30.getShape((int) (short) 0);
        boolean boolean35 = shapeList9.equals((java.lang.Object) shapeList30);
        boolean boolean36 = shapeList0.equals((java.lang.Object) shapeList9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList9", shapeList0.equals(shapeList9) ? shapeList0.hashCode() == shapeList9.hashCode() : true);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
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
        java.awt.Shape shape15 = shapeList0.getShape((int) (byte) 0);
        shapeList0.clear();
        java.lang.Object obj17 = shapeList0.clone();
        java.awt.Shape shape19 = null;
        shapeList0.setShape((int) '#', shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
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
        int int27 = shapeList7.size();
        boolean boolean28 = shapeList0.equals((java.lang.Object) int27);
        java.awt.Shape shape30 = null;
        shapeList0.setShape((int) ' ', shape30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.lang.Object obj6 = shapeList0.clone();
        java.lang.Object obj7 = shapeList0.clone();
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj5 = shapeList4.clone();
        shapeList4.clear();
        shapeList4.clear();
        java.awt.Shape shape9 = shapeList4.getShape((int) '#');
        java.lang.Class<?> wildcardClass10 = shapeList4.getClass();
        boolean boolean11 = shapeList0.equals((java.lang.Object) shapeList4);
        java.awt.Shape shape13 = null;
        shapeList0.setShape((int) ' ', shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
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
        java.awt.Shape shape32 = null;
        shapeList0.setShape((int) (byte) 100, shape32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
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
        java.awt.Shape shape17 = null;
        shapeList0.setShape(0, shape17);
        java.lang.Object obj19 = shapeList0.clone();
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
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
        boolean boolean14 = shapeList12.equals((java.lang.Object) (short) 1);
        boolean boolean16 = shapeList12.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj17 = shapeList12.clone();
        java.awt.Shape shape19 = shapeList12.getShape((int) (short) -1);
        int int20 = shapeList12.size();
        boolean boolean21 = shapeList0.equals((java.lang.Object) int20);
        java.awt.Shape shape23 = null;
        shapeList0.setShape((int) (byte) 0, shape23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
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
        boolean boolean13 = shapeList11.equals((java.lang.Object) (short) 1);
        boolean boolean15 = shapeList11.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj16 = shapeList11.clone();
        java.awt.Shape shape18 = shapeList11.getShape((int) (short) -1);
        int int19 = shapeList11.size();
        int int20 = shapeList11.size();
        int int21 = shapeList11.size();
        java.awt.Shape shape23 = shapeList11.getShape((int) '#');
        int int24 = shapeList11.size();
        java.lang.Object obj25 = shapeList11.clone();
        int int26 = shapeList11.size();
        shapeList11.clear();
        boolean boolean28 = shapeList0.equals((java.lang.Object) shapeList11);
        java.awt.Shape shape30 = null;
        shapeList0.setShape((int) (byte) 0, shape30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        int int2 = shapeList0.size();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) '#', shape4);
        java.lang.Object obj6 = shapeList0.clone();
        java.lang.Object obj7 = shapeList0.clone();
        java.awt.Shape shape9 = shapeList0.getShape(0);
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
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
        java.awt.Shape shape40 = null;
        shapeList0.setShape(9, shape40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        java.lang.Object obj5 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape8 = null;
        shapeList0.setShape((int) (byte) 10, shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.awt.Shape shape3 = shapeList0.getShape((int) '4');
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        boolean boolean6 = shapeList4.equals((java.lang.Object) (short) 1);
        boolean boolean8 = shapeList4.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape10 = null;
        shapeList4.setShape(0, shape10);
        java.lang.Object obj12 = shapeList4.clone();
        java.lang.Object obj13 = shapeList4.clone();
        boolean boolean14 = shapeList0.equals(obj13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
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
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj18 = shapeList17.clone();
        shapeList17.clear();
        java.awt.Shape shape21 = shapeList17.getShape((int) (short) 1);
        boolean boolean23 = shapeList17.equals((java.lang.Object) (short) -1);
        java.lang.Object obj24 = null;
        boolean boolean25 = shapeList17.equals(obj24);
        int int26 = shapeList17.size();
        java.lang.Object obj27 = null;
        boolean boolean28 = shapeList17.equals(obj27);
        java.awt.Shape shape30 = shapeList17.getShape((int) 'a');
        int int31 = shapeList17.size();
        boolean boolean32 = shapeList0.equals((java.lang.Object) int31);
        shapeList0.clear();
        java.awt.Shape shape35 = null;
        shapeList0.setShape(9, shape35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 0, shape6);
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        java.awt.Shape shape11 = shapeList0.getShape((int) (short) 0);
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj13 = shapeList12.clone();
        shapeList12.clear();
        java.awt.Shape shape16 = shapeList12.getShape((int) (short) 1);
        java.lang.Object obj17 = shapeList12.clone();
        java.awt.Shape shape19 = shapeList12.getShape((int) (short) 100);
        java.awt.Shape shape21 = shapeList12.getShape((int) '#');
        java.lang.Object obj22 = shapeList12.clone();
        java.lang.Object obj23 = shapeList12.clone();
        boolean boolean24 = shapeList0.equals((java.lang.Object) shapeList12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
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
        java.lang.Object obj21 = shapeList0.clone();
        java.awt.Shape shape23 = null;
        shapeList0.setShape((int) (short) 1, shape23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
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
        java.awt.Shape shape27 = shapeList0.getShape((int) (short) 0);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj30 = shapeList29.clone();
        shapeList29.clear();
        java.awt.Shape shape33 = shapeList29.getShape((int) (short) 1);
        shapeList29.clear();
        shapeList29.clear();
        org.jfree.chart.util.ShapeList shapeList36 = new org.jfree.chart.util.ShapeList();
        shapeList36.clear();
        int int38 = shapeList36.size();
        java.lang.Object obj39 = shapeList36.clone();
        boolean boolean40 = shapeList29.equals(obj39);
        java.awt.Shape shape42 = shapeList29.getShape((int) '#');
        java.awt.Shape shape44 = shapeList29.getShape((int) (byte) -1);
        boolean boolean45 = shapeList0.equals((java.lang.Object) (byte) -1);
        java.awt.Shape shape47 = null;
        shapeList0.setShape((int) 'a', shape47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) 1.0d);
        java.awt.Shape shape6 = null;
        shapeList0.setShape(33, shape6);
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape(101);
        int int11 = shapeList0.size();
        int int12 = shapeList0.size();
        java.awt.Shape shape14 = null;
        shapeList0.setShape((int) 'a', shape14);
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
        java.awt.Shape shape30 = shapeList16.getShape(9);
        int int31 = shapeList16.size();
        java.lang.Object obj32 = shapeList16.clone();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        boolean boolean34 = shapeList0.equals(obj32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList16", shapeList0.equals(shapeList16) ? shapeList0.hashCode() == shapeList16.hashCode() : true);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
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
        java.awt.Shape shape27 = shapeList16.getShape((int) ' ');
        java.awt.Shape shape29 = null;
        shapeList16.setShape(9, shape29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList16", shapeList0.equals(shapeList16) ? shapeList0.hashCode() == shapeList16.hashCode() : true);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = shapeList0.clone();
        int int8 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape11 = null;
        shapeList9.setShape(8, shape11);
        int int13 = shapeList9.size();
        shapeList9.clear();
        int int15 = shapeList9.size();
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj17 = shapeList16.clone();
        shapeList16.clear();
        java.awt.Shape shape20 = shapeList16.getShape((int) (short) 1);
        java.lang.Object obj21 = shapeList16.clone();
        java.lang.Object obj22 = shapeList16.clone();
        boolean boolean23 = shapeList9.equals((java.lang.Object) shapeList16);
        boolean boolean24 = shapeList0.equals((java.lang.Object) boolean23);
        java.awt.Shape shape26 = null;
        shapeList0.setShape(34, shape26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 0, shape6);
        int int8 = shapeList0.size();
        boolean boolean10 = shapeList0.equals((java.lang.Object) (byte) 1);
        java.awt.Shape shape12 = shapeList0.getShape((int) '4');
        java.awt.Shape shape14 = shapeList0.getShape(101);
        int int15 = shapeList0.size();
        java.lang.Object obj16 = shapeList0.clone();
        java.awt.Shape shape18 = null;
        shapeList0.setShape((int) (byte) 1, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj16", shapeList0.equals(obj16) ? shapeList0.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = null;
        boolean boolean8 = shapeList0.equals(obj7);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj11 = shapeList10.clone();
        shapeList10.clear();
        java.awt.Shape shape14 = shapeList10.getShape((int) (short) 1);
        java.lang.Object obj15 = shapeList10.clone();
        java.awt.Shape shape17 = shapeList10.getShape((int) (short) 100);
        java.lang.Object obj18 = shapeList10.clone();
        boolean boolean19 = shapeList0.equals((java.lang.Object) shapeList10);
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj21 = shapeList20.clone();
        shapeList20.clear();
        java.awt.Shape shape24 = shapeList20.getShape((int) (short) 1);
        boolean boolean26 = shapeList20.equals((java.lang.Object) 0);
        int int27 = shapeList20.size();
        int int28 = shapeList20.size();
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        shapeList29.clear();
        java.awt.Shape shape32 = shapeList29.getShape(10);
        boolean boolean33 = shapeList20.equals((java.lang.Object) shapeList29);
        java.lang.Class<?> wildcardClass34 = shapeList29.getClass();
        boolean boolean35 = shapeList10.equals((java.lang.Object) shapeList29);
        java.awt.Shape shape37 = null;
        shapeList10.setShape((int) ' ', shape37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        int int2 = shapeList0.size();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) '#', shape4);
        java.lang.Object obj6 = shapeList0.clone();
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
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
        shapeList0.setShape(53, shape59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
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
        shapeList11.setShape((int) (short) 100, shape21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.lang.Object obj6 = shapeList0.clone();
        java.lang.Object obj7 = shapeList0.clone();
        java.lang.Object obj8 = shapeList0.clone();
        java.lang.Object obj9 = shapeList0.clone();
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
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
        int int27 = shapeList8.size();
        org.jfree.chart.util.ShapeList shapeList28 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj29 = shapeList28.clone();
        shapeList28.clear();
        java.awt.Shape shape32 = shapeList28.getShape((int) (short) 1);
        boolean boolean34 = shapeList28.equals((java.lang.Object) 0);
        int int35 = shapeList28.size();
        int int36 = shapeList28.size();
        org.jfree.chart.util.ShapeList shapeList37 = new org.jfree.chart.util.ShapeList();
        shapeList37.clear();
        java.awt.Shape shape40 = shapeList37.getShape(10);
        boolean boolean41 = shapeList28.equals((java.lang.Object) shapeList37);
        org.jfree.chart.util.ShapeList shapeList42 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj43 = shapeList42.clone();
        java.lang.Object obj44 = shapeList42.clone();
        java.awt.Shape shape46 = shapeList42.getShape(1);
        shapeList42.clear();
        shapeList42.clear();
        org.jfree.chart.util.ShapeList shapeList49 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj50 = shapeList49.clone();
        shapeList49.clear();
        java.awt.Shape shape53 = shapeList49.getShape((int) (short) 1);
        boolean boolean55 = shapeList49.equals((java.lang.Object) 'a');
        java.lang.Object obj56 = shapeList49.clone();
        boolean boolean57 = shapeList42.equals(obj56);
        boolean boolean58 = shapeList28.equals((java.lang.Object) shapeList42);
        java.lang.Object obj59 = shapeList28.clone();
        java.awt.Shape shape61 = shapeList28.getShape(8);
        java.awt.Shape shape63 = shapeList28.getShape(0);
        boolean boolean64 = shapeList8.equals((java.lang.Object) shapeList28);
        java.awt.Shape shape66 = null;
        shapeList28.setShape((int) (short) 100, shape66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList28", shapeList0.equals(shapeList28) ? shapeList0.hashCode() == shapeList28.hashCode() : true);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
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
        shapeList0.setShape((int) (short) 10, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
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
        shapeList0.setShape((int) (short) 0, shape12);
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj6", shapeList0.equals(obj6) ? shapeList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        java.lang.Object obj5 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape((int) (byte) -1);
        java.lang.Object obj11 = shapeList0.clone();
        java.awt.Shape shape13 = null;
        shapeList0.setShape((int) (byte) 10, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 0);
        int int7 = shapeList0.size();
        int int8 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape11 = null;
        shapeList9.setShape(8, shape11);
        int int13 = shapeList9.size();
        shapeList9.clear();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        shapeList15.clear();
        java.lang.Object obj17 = shapeList15.clone();
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        boolean boolean20 = shapeList18.equals((java.lang.Object) (short) 1);
        boolean boolean22 = shapeList18.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj23 = shapeList18.clone();
        java.awt.Shape shape25 = shapeList18.getShape((int) (short) -1);
        int int26 = shapeList18.size();
        boolean boolean27 = shapeList15.equals((java.lang.Object) int26);
        shapeList15.clear();
        boolean boolean29 = shapeList9.equals((java.lang.Object) shapeList15);
        java.lang.Object obj30 = shapeList15.clone();
        boolean boolean31 = shapeList0.equals((java.lang.Object) shapeList15);
        java.awt.Shape shape33 = null;
        shapeList0.setShape(3, shape33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
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
        shapeList4.setShape((int) (short) 1, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
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
        int int17 = shapeList16.size();
        shapeList16.clear();
        java.awt.Shape shape20 = null;
        shapeList16.setShape((int) (short) 100, shape20);
        java.awt.Shape shape23 = null;
        shapeList16.setShape((int) '#', shape23);
        java.lang.Object obj25 = shapeList16.clone();
        boolean boolean26 = shapeList0.equals((java.lang.Object) shapeList16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList16", shapeList0.equals(shapeList16) ? shapeList0.hashCode() == shapeList16.hashCode() : true);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 0L);
        java.awt.Shape shape8 = shapeList0.getShape(0);
        java.lang.Object obj9 = shapeList0.clone();
        java.lang.Object obj10 = shapeList0.clone();
        java.lang.Object obj11 = shapeList0.clone();
        java.awt.Shape shape13 = null;
        shapeList0.setShape(10, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 'a');
        java.awt.Shape shape8 = null;
        shapeList0.setShape(10, shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
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
        java.lang.Object obj31 = shapeList0.clone();
        java.awt.Shape shape33 = shapeList0.getShape(8);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList35 = new org.jfree.chart.util.ShapeList();
        int int36 = shapeList35.size();
        int int37 = shapeList35.size();
        java.awt.Shape shape39 = null;
        shapeList35.setShape((int) ' ', shape39);
        java.lang.Object obj41 = shapeList35.clone();
        java.lang.Class<?> wildcardClass42 = obj41.getClass();
        boolean boolean43 = shapeList0.equals(obj41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList35", shapeList0.equals(shapeList35) ? shapeList0.hashCode() == shapeList35.hashCode() : true);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
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
        java.awt.Shape shape20 = null;
        shapeList0.setShape((int) (byte) 100, shape20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        int int2 = shapeList0.size();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) ' ', shape4);
        java.lang.Object obj6 = shapeList0.clone();
        java.awt.Shape shape8 = shapeList0.getShape(9);
        java.awt.Shape shape10 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape12 = shapeList0.getShape(100);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        boolean boolean15 = shapeList13.equals((java.lang.Object) (short) 1);
        int int16 = shapeList13.size();
        java.lang.Object obj17 = shapeList13.clone();
        java.lang.Object obj18 = shapeList13.clone();
        java.awt.Shape shape20 = shapeList13.getShape((int) (short) 10);
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj22 = shapeList21.clone();
        shapeList21.clear();
        shapeList21.clear();
        java.awt.Shape shape26 = shapeList21.getShape((int) '#');
        java.awt.Shape shape28 = shapeList21.getShape(1);
        java.awt.Shape shape30 = shapeList21.getShape(100);
        org.jfree.chart.util.ShapeList shapeList31 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj32 = shapeList31.clone();
        shapeList31.clear();
        java.awt.Shape shape35 = shapeList31.getShape((int) (short) 1);
        boolean boolean37 = shapeList31.equals((java.lang.Object) (short) -1);
        shapeList31.clear();
        shapeList31.clear();
        java.lang.Object obj40 = shapeList31.clone();
        org.jfree.chart.util.ShapeList shapeList41 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj42 = shapeList41.clone();
        shapeList41.clear();
        java.awt.Shape shape45 = shapeList41.getShape((int) (short) 1);
        boolean boolean47 = shapeList41.equals((java.lang.Object) 0L);
        boolean boolean48 = shapeList31.equals((java.lang.Object) 0L);
        boolean boolean49 = shapeList21.equals((java.lang.Object) shapeList31);
        java.awt.Shape shape51 = shapeList21.getShape(0);
        org.jfree.chart.util.ShapeList shapeList52 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj53 = shapeList52.clone();
        shapeList52.clear();
        java.awt.Shape shape56 = shapeList52.getShape((int) (short) 1);
        boolean boolean58 = shapeList52.equals((java.lang.Object) 0);
        int int59 = shapeList52.size();
        boolean boolean60 = shapeList21.equals((java.lang.Object) int59);
        boolean boolean61 = shapeList13.equals((java.lang.Object) int59);
        java.awt.Shape shape63 = shapeList13.getShape((int) '4');
        boolean boolean64 = shapeList0.equals((java.lang.Object) shapeList13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = null;
        boolean boolean8 = shapeList0.equals(obj7);
        shapeList0.clear();
        int int10 = shapeList0.size();
        java.awt.Shape shape12 = shapeList0.getShape(53);
        java.awt.Shape shape14 = null;
        shapeList0.setShape(34, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
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
        java.awt.Shape shape15 = null;
        shapeList0.setShape(0, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) -1);
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        java.lang.Object obj10 = shapeList0.clone();
        java.awt.Shape shape12 = shapeList0.getShape((int) (short) 1);
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        boolean boolean15 = shapeList13.equals((java.lang.Object) (short) 1);
        boolean boolean17 = shapeList13.equals((java.lang.Object) 1.0d);
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj19 = shapeList18.clone();
        shapeList18.clear();
        java.awt.Shape shape22 = shapeList18.getShape((int) (short) 1);
        boolean boolean24 = shapeList18.equals((java.lang.Object) 0);
        java.lang.Object obj25 = shapeList18.clone();
        boolean boolean27 = shapeList18.equals((java.lang.Object) false);
        java.lang.Object obj28 = shapeList18.clone();
        boolean boolean29 = shapeList13.equals((java.lang.Object) shapeList18);
        shapeList13.clear();
        boolean boolean31 = shapeList0.equals((java.lang.Object) shapeList13);
        java.awt.Shape shape33 = null;
        shapeList13.setShape(10, shape33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList13", shapeList0.equals(shapeList13) ? shapeList0.hashCode() == shapeList13.hashCode() : true);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
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
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj24 = shapeList23.clone();
        shapeList23.clear();
        java.awt.Shape shape27 = shapeList23.getShape((int) (short) 1);
        java.lang.Object obj28 = shapeList23.clone();
        java.awt.Shape shape30 = shapeList23.getShape((int) (short) 100);
        java.lang.Object obj31 = shapeList23.clone();
        java.lang.Object obj32 = shapeList23.clone();
        java.lang.Object obj33 = shapeList23.clone();
        org.jfree.chart.util.ShapeList shapeList34 = new org.jfree.chart.util.ShapeList();
        boolean boolean36 = shapeList34.equals((java.lang.Object) (short) 1);
        boolean boolean38 = shapeList34.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj39 = shapeList34.clone();
        java.awt.Shape shape41 = shapeList34.getShape((int) (short) -1);
        int int42 = shapeList34.size();
        int int43 = shapeList34.size();
        int int44 = shapeList34.size();
        java.awt.Shape shape46 = shapeList34.getShape((int) '#');
        int int47 = shapeList34.size();
        java.lang.Object obj48 = shapeList34.clone();
        int int49 = shapeList34.size();
        shapeList34.clear();
        boolean boolean51 = shapeList23.equals((java.lang.Object) shapeList34);
        boolean boolean52 = shapeList6.equals((java.lang.Object) shapeList34);
        org.jfree.chart.util.ShapeList shapeList53 = new org.jfree.chart.util.ShapeList();
        shapeList53.clear();
        int int55 = shapeList53.size();
        java.awt.Shape shape57 = null;
        shapeList53.setShape((int) '#', shape57);
        shapeList53.clear();
        java.awt.Shape shape61 = null;
        shapeList53.setShape(1, shape61);
        java.awt.Shape shape64 = shapeList53.getShape((int) (short) 100);
        boolean boolean65 = shapeList34.equals((java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList53", shapeList0.equals(shapeList53) ? shapeList0.hashCode() == shapeList53.hashCode() : true);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
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
        shapeList0.setShape(0, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
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
        java.awt.Shape shape16 = null;
        shapeList0.setShape((int) '4', shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) '4', shape4);
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        boolean boolean8 = shapeList6.equals((java.lang.Object) (short) 1);
        boolean boolean10 = shapeList6.equals((java.lang.Object) 1.0d);
        java.lang.Object obj11 = shapeList6.clone();
        java.awt.Shape shape13 = shapeList6.getShape((int) (short) 10);
        int int14 = shapeList6.size();
        java.awt.Shape shape16 = shapeList6.getShape((int) ' ');
        boolean boolean17 = shapeList0.equals((java.lang.Object) shapeList6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
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
        java.lang.Object obj25 = shapeList0.clone();
        java.awt.Shape shape27 = null;
        shapeList0.setShape(34, shape27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) -1);
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        int int10 = shapeList0.size();
        int int11 = shapeList0.size();
        java.lang.Object obj12 = shapeList0.clone();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        shapeList14.clear();
        java.awt.Shape shape17 = shapeList14.getShape((int) (byte) 10);
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj19 = shapeList18.clone();
        shapeList18.clear();
        shapeList18.clear();
        java.lang.Object obj22 = shapeList18.clone();
        boolean boolean24 = shapeList18.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        shapeList25.clear();
        int int27 = shapeList25.size();
        int int28 = shapeList25.size();
        boolean boolean29 = shapeList18.equals((java.lang.Object) int28);
        boolean boolean30 = shapeList14.equals((java.lang.Object) int28);
        shapeList14.clear();
        java.awt.Shape shape33 = shapeList14.getShape((int) (short) 100);
        shapeList14.clear();
        org.jfree.chart.util.ShapeList shapeList35 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj36 = shapeList35.clone();
        shapeList35.clear();
        java.awt.Shape shape39 = shapeList35.getShape((int) (short) 1);
        boolean boolean41 = shapeList35.equals((java.lang.Object) (short) -1);
        shapeList35.clear();
        shapeList35.clear();
        java.awt.Shape shape45 = shapeList35.getShape((int) (short) 0);
        java.awt.Shape shape47 = shapeList35.getShape((int) (byte) 10);
        org.jfree.chart.util.ShapeList shapeList48 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj49 = shapeList48.clone();
        shapeList48.clear();
        java.awt.Shape shape52 = shapeList48.getShape((int) ' ');
        shapeList48.clear();
        boolean boolean54 = shapeList35.equals((java.lang.Object) shapeList48);
        boolean boolean55 = shapeList14.equals((java.lang.Object) shapeList35);
        java.awt.Shape shape57 = shapeList14.getShape(53);
        shapeList14.clear();
        boolean boolean59 = shapeList0.equals((java.lang.Object) shapeList14);
        org.jfree.chart.util.ShapeList shapeList60 = new org.jfree.chart.util.ShapeList();
        shapeList60.clear();
        int int62 = shapeList60.size();
        int int63 = shapeList60.size();
        int int64 = shapeList60.size();
        java.awt.Shape shape66 = shapeList60.getShape((int) (short) 1);
        int int67 = shapeList60.size();
        java.awt.Shape shape69 = shapeList60.getShape((int) (byte) 100);
        java.awt.Shape shape71 = null;
        shapeList60.setShape(100, shape71);
        java.lang.Class<?> wildcardClass73 = shapeList60.getClass();
        boolean boolean74 = shapeList14.equals((java.lang.Object) shapeList60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList60", shapeList0.equals(shapeList60) ? shapeList0.hashCode() == shapeList60.hashCode() : true);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
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
        int int22 = shapeList0.size();
        java.awt.Shape shape24 = null;
        shapeList0.setShape((int) (short) 0, shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
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
        shapeList16.clear();
        java.awt.Shape shape21 = shapeList16.getShape((int) '#');
        java.awt.Shape shape23 = shapeList16.getShape(1);
        java.awt.Shape shape25 = shapeList16.getShape((int) ' ');
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        boolean boolean28 = shapeList26.equals((java.lang.Object) (short) 1);
        boolean boolean30 = shapeList26.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj31 = shapeList26.clone();
        java.awt.Shape shape33 = shapeList26.getShape((int) (short) -1);
        int int34 = shapeList26.size();
        int int35 = shapeList26.size();
        int int36 = shapeList26.size();
        shapeList26.clear();
        int int38 = shapeList26.size();
        shapeList26.clear();
        boolean boolean40 = shapeList16.equals((java.lang.Object) shapeList26);
        boolean boolean41 = shapeList0.equals((java.lang.Object) shapeList16);
        int int42 = shapeList0.size();
        java.awt.Shape shape44 = null;
        shapeList0.setShape(9, shape44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
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
        java.awt.Shape shape41 = null;
        shapeList0.setShape(11, shape41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        int int3 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj5 = shapeList4.clone();
        shapeList4.clear();
        java.awt.Shape shape8 = shapeList4.getShape((int) ' ');
        boolean boolean9 = shapeList0.equals((java.lang.Object) shape8);
        java.awt.Shape shape11 = null;
        shapeList0.setShape(33, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
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
        java.awt.Shape shape14 = null;
        shapeList0.setShape(53, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
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
        java.awt.Shape shape15 = null;
        shapeList4.setShape(1, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.awt.Shape shape7 = null;
        shapeList0.setShape((int) '#', shape7);
        int int9 = shapeList0.size();
        java.awt.Shape shape11 = shapeList0.getShape((int) (byte) 100);
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj13 = shapeList12.clone();
        shapeList12.clear();
        java.awt.Shape shape16 = shapeList12.getShape(9);
        shapeList12.clear();
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj19 = shapeList18.clone();
        boolean boolean20 = shapeList12.equals((java.lang.Object) shapeList18);
        boolean boolean21 = shapeList0.equals((java.lang.Object) shapeList12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 0);
        int int7 = shapeList0.size();
        int int8 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape11 = null;
        shapeList9.setShape(8, shape11);
        int int13 = shapeList9.size();
        shapeList9.clear();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        shapeList15.clear();
        java.lang.Object obj17 = shapeList15.clone();
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        boolean boolean20 = shapeList18.equals((java.lang.Object) (short) 1);
        boolean boolean22 = shapeList18.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj23 = shapeList18.clone();
        java.awt.Shape shape25 = shapeList18.getShape((int) (short) -1);
        int int26 = shapeList18.size();
        boolean boolean27 = shapeList15.equals((java.lang.Object) int26);
        shapeList15.clear();
        boolean boolean29 = shapeList9.equals((java.lang.Object) shapeList15);
        java.lang.Object obj30 = shapeList15.clone();
        boolean boolean31 = shapeList0.equals((java.lang.Object) shapeList15);
        java.awt.Shape shape33 = shapeList0.getShape(53);
        java.awt.Shape shape35 = null;
        shapeList0.setShape(10, shape35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape(0, shape6);
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj10 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        int int12 = shapeList11.size();
        shapeList11.clear();
        java.awt.Shape shape15 = null;
        shapeList11.setShape((int) (short) 100, shape15);
        java.awt.Shape shape18 = shapeList11.getShape((int) '4');
        java.lang.Object obj19 = shapeList11.clone();
        boolean boolean20 = shapeList0.equals(obj19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
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
        int int13 = shapeList0.size();
        java.awt.Shape shape15 = null;
        shapeList0.setShape((int) (short) 1, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        java.lang.Object obj3 = shapeList0.clone();
        java.awt.Shape shape5 = shapeList0.getShape(33);
        java.awt.Shape shape7 = shapeList0.getShape(11);
        java.awt.Shape shape9 = null;
        shapeList0.setShape((int) 'a', shape9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj3", shapeList0.equals(obj3) ? shapeList0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
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
        java.awt.Shape shape43 = null;
        shapeList21.setShape((int) (short) 10, shape43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList21", shapeList0.equals(shapeList21) ? shapeList0.hashCode() == shapeList21.hashCode() : true);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
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
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        shapeList12.clear();
        java.lang.Object obj14 = shapeList12.clone();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        boolean boolean17 = shapeList15.equals((java.lang.Object) (short) 1);
        boolean boolean19 = shapeList15.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj20 = shapeList15.clone();
        java.awt.Shape shape22 = shapeList15.getShape((int) (short) -1);
        int int23 = shapeList15.size();
        boolean boolean24 = shapeList12.equals((java.lang.Object) int23);
        java.awt.Shape shape26 = shapeList12.getShape(9);
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        shapeList27.clear();
        int int29 = shapeList27.size();
        int int30 = shapeList27.size();
        int int31 = shapeList27.size();
        org.jfree.chart.util.ShapeList shapeList32 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj33 = shapeList32.clone();
        shapeList32.clear();
        java.awt.Shape shape36 = shapeList32.getShape((int) (short) 1);
        java.lang.Object obj37 = shapeList32.clone();
        org.jfree.chart.util.ShapeList shapeList38 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj39 = shapeList38.clone();
        shapeList38.clear();
        java.awt.Shape shape42 = shapeList38.getShape((int) (short) 1);
        boolean boolean44 = shapeList38.equals((java.lang.Object) (short) -1);
        java.lang.Object obj45 = null;
        boolean boolean46 = shapeList38.equals(obj45);
        int int47 = shapeList38.size();
        boolean boolean48 = shapeList32.equals((java.lang.Object) shapeList38);
        java.awt.Shape shape50 = shapeList32.getShape(100);
        boolean boolean52 = shapeList32.equals((java.lang.Object) false);
        java.awt.Shape shape54 = shapeList32.getShape(9);
        boolean boolean55 = shapeList27.equals((java.lang.Object) shapeList32);
        boolean boolean56 = shapeList12.equals((java.lang.Object) shapeList27);
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
        java.lang.Object obj70 = shapeList57.clone();
        java.lang.Class<?> wildcardClass71 = obj70.getClass();
        boolean boolean72 = shapeList27.equals((java.lang.Object) wildcardClass71);
        boolean boolean73 = shapeList0.equals((java.lang.Object) wildcardClass71);
        java.awt.Shape shape75 = null;
        shapeList0.setShape((int) (byte) 0, shape75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
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
        shapeList0.clear();
        java.awt.Shape shape15 = null;
        shapeList0.setShape((int) (short) 1, shape15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        java.awt.Shape shape5 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape7 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape9 = shapeList0.getShape(11);
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) ' ', shape11);
        java.awt.Shape shape14 = shapeList0.getShape((int) (short) 1);
        java.awt.Shape shape16 = shapeList0.getShape(11);
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
        shapeList18.clear();
        shapeList18.clear();
        java.lang.Object obj37 = shapeList18.clone();
        java.awt.Shape shape39 = shapeList18.getShape((int) '#');
        boolean boolean40 = shapeList0.equals((java.lang.Object) shapeList18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList18", shapeList0.equals(shapeList18) ? shapeList0.hashCode() == shapeList18.hashCode() : true);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.awt.Shape shape7 = null;
        shapeList0.setShape((int) '#', shape7);
        int int9 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        shapeList10.clear();
        int int12 = shapeList10.size();
        int int13 = shapeList10.size();
        int int14 = shapeList10.size();
        java.awt.Shape shape16 = shapeList10.getShape((int) (short) 1);
        int int17 = shapeList10.size();
        int int18 = shapeList10.size();
        boolean boolean19 = shapeList0.equals((java.lang.Object) shapeList10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
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
        java.awt.Shape shape27 = shapeList0.getShape((int) (short) 0);
        int int28 = shapeList0.size();
        java.lang.Object obj29 = shapeList0.clone();
        java.awt.Shape shape31 = shapeList0.getShape((int) (byte) 100);
        java.lang.Object obj32 = shapeList0.clone();
        java.awt.Shape shape34 = null;
        shapeList0.setShape((int) (short) 1, shape34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
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
        shapeList0.setShape(100, shape71);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        boolean boolean6 = shapeList0.equals((java.lang.Object) ' ');
        int int7 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape10 = null;
        shapeList0.setShape(0, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
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
        shapeList0.setShape(0, shape28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
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
        java.awt.Shape shape17 = null;
        shapeList0.setShape((int) ' ', shape17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj14", shapeList0.equals(obj14) ? shapeList0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
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
        java.awt.Shape shape46 = null;
        shapeList11.setShape(10, shape46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList11", shapeList0.equals(shapeList11) ? shapeList0.hashCode() == shapeList11.hashCode() : true);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
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
        shapeList0.setShape(33, shape23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
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
        shapeList19.clear();
        java.awt.Shape shape23 = shapeList19.getShape((int) (short) 1);
        boolean boolean25 = shapeList19.equals((java.lang.Object) 'a');
        java.lang.Object obj26 = shapeList19.clone();
        int int27 = shapeList19.size();
        boolean boolean28 = shapeList0.equals((java.lang.Object) shapeList19);
        shapeList0.clear();
        java.awt.Shape shape31 = null;
        shapeList0.setShape(2, shape31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
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
        java.awt.Shape shape17 = shapeList0.getShape(9);
        java.awt.Shape shape19 = null;
        shapeList0.setShape(33, shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
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
        java.awt.Shape shape19 = shapeList0.getShape((int) '#');
        java.awt.Shape shape21 = null;
        shapeList0.setShape(2, shape21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.awt.Shape shape7 = null;
        shapeList0.setShape((int) '#', shape7);
        int int9 = shapeList0.size();
        java.awt.Shape shape11 = shapeList0.getShape((int) (byte) 100);
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj13 = shapeList12.clone();
        shapeList12.clear();
        shapeList12.clear();
        java.lang.Object obj16 = shapeList12.clone();
        java.lang.Object obj17 = null;
        boolean boolean18 = shapeList12.equals(obj17);
        boolean boolean20 = shapeList12.equals((java.lang.Object) 0.0f);
        int int21 = shapeList12.size();
        java.lang.Object obj22 = shapeList12.clone();
        int int23 = shapeList12.size();
        shapeList12.clear();
        boolean boolean25 = shapeList0.equals((java.lang.Object) shapeList12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
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
        java.awt.Shape shape22 = null;
        shapeList0.setShape((int) '#', shape22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList6", shapeList0.equals(shapeList6) ? shapeList0.hashCode() == shapeList6.hashCode() : true);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        shapeList0.clear();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = null;
        shapeList0.setShape(1, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj9", shapeList0.equals(obj9) ? shapeList0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        java.awt.Shape shape5 = shapeList0.getShape((int) (short) -1);
        int int6 = shapeList0.size();
        java.awt.Shape shape8 = null;
        shapeList0.setShape(0, shape8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj3", shapeList0.equals(obj3) ? shapeList0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
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
        shapeList0.setShape(2, shape72);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList10", shapeList0.equals(shapeList10) ? shapeList0.hashCode() == shapeList10.hashCode() : true);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
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
        shapeList0.setShape(3, shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) -1);
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        java.awt.Shape shape11 = shapeList0.getShape((int) '4');
        java.awt.Shape shape13 = null;
        shapeList0.setShape((int) (short) 100, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape9 = shapeList0.getShape(11);
        java.lang.Object obj10 = null;
        boolean boolean11 = shapeList0.equals(obj10);
        java.awt.Shape shape13 = null;
        shapeList0.setShape((int) (byte) 1, shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
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
        shapeList7.setShape((int) (byte) 1, shape21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        java.awt.Shape shape6 = shapeList0.getShape((int) (short) 1);
        shapeList0.clear();
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = null;
        shapeList0.setShape(34, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
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
        shapeList0.setShape((int) ' ', shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
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
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj27 = shapeList26.clone();
        shapeList26.clear();
        shapeList26.clear();
        java.awt.Shape shape31 = shapeList26.getShape((int) '#');
        boolean boolean32 = shapeList14.equals((java.lang.Object) shapeList26);
        java.awt.Shape shape34 = shapeList26.getShape((int) (byte) 10);
        java.awt.Shape shape36 = null;
        shapeList26.setShape((int) (short) 10, shape36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList26", shapeList0.equals(shapeList26) ? shapeList0.hashCode() == shapeList26.hashCode() : true);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        int int4 = shapeList0.size();
        shapeList0.clear();
        int int6 = shapeList0.size();
        java.lang.Object obj7 = shapeList0.clone();
        java.lang.Object obj8 = shapeList0.clone();
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) (short) 10, shape10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj7", shapeList0.equals(obj7) ? shapeList0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
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
        java.lang.Object obj38 = shapeList0.clone();
        java.awt.Shape shape40 = null;
        shapeList0.setShape((int) '4', shape40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
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
        java.awt.Shape shape21 = shapeList0.getShape(10);
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj23 = shapeList22.clone();
        shapeList22.clear();
        java.awt.Shape shape26 = shapeList22.getShape((int) (short) 1);
        java.lang.Object obj27 = shapeList22.clone();
        java.lang.Object obj28 = shapeList22.clone();
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj30 = shapeList29.clone();
        java.lang.Object obj31 = shapeList29.clone();
        java.awt.Shape shape33 = shapeList29.getShape(1);
        shapeList29.clear();
        java.awt.Shape shape36 = shapeList29.getShape((int) (short) -1);
        shapeList29.clear();
        boolean boolean38 = shapeList22.equals((java.lang.Object) shapeList29);
        boolean boolean39 = shapeList0.equals((java.lang.Object) shapeList22);
        java.lang.Object obj40 = shapeList22.clone();
        java.awt.Shape shape42 = null;
        shapeList22.setShape(10, shape42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList22", shapeList0.equals(shapeList22) ? shapeList0.hashCode() == shapeList22.hashCode() : true);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        java.awt.Shape shape5 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape7 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape9 = shapeList0.getShape(11);
        java.awt.Shape shape11 = null;
        shapeList0.setShape((int) ' ', shape11);
        java.awt.Shape shape14 = shapeList0.getShape((int) (short) 1);
        java.awt.Shape shape16 = shapeList0.getShape(11);
        int int17 = shapeList0.size();
        java.lang.Object obj18 = shapeList0.clone();
        java.lang.Object obj19 = shapeList0.clone();
        java.awt.Shape shape21 = null;
        shapeList0.setShape(10, shape21);
        shapeList0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj18", shapeList0.equals(obj18) ? shapeList0.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = null;
        shapeList0.setShape((int) 'a', shape7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape(1);
        java.awt.Shape shape9 = shapeList0.getShape((int) ' ');
        java.awt.Shape shape11 = null;
        shapeList0.setShape(3, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 0);
        java.awt.Shape shape6 = shapeList0.getShape((int) (byte) 0);
        java.lang.Object obj7 = shapeList0.clone();
        java.awt.Shape shape9 = null;
        shapeList0.setShape((int) (byte) 100, shape9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
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
        java.awt.Shape shape18 = shapeList7.getShape((int) '#');
        int int19 = shapeList7.size();
        java.awt.Shape shape21 = null;
        shapeList7.setShape((int) (short) 10, shape21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList7", shapeList0.equals(shapeList7) ? shapeList0.hashCode() == shapeList7.hashCode() : true);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
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
        java.awt.Shape shape16 = null;
        shapeList0.setShape(0, shape16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
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
        java.awt.Shape shape17 = null;
        shapeList0.setShape(0, shape17);
        java.lang.Object obj19 = shapeList0.clone();
        java.awt.Shape shape21 = null;
        shapeList0.setShape(0, shape21);
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj24 = shapeList23.clone();
        shapeList23.clear();
        java.awt.Shape shape27 = shapeList23.getShape((int) (short) 1);
        shapeList23.clear();
        shapeList23.clear();
        org.jfree.chart.util.ShapeList shapeList30 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj31 = shapeList30.clone();
        shapeList30.clear();
        java.awt.Shape shape34 = shapeList30.getShape((int) (short) 1);
        boolean boolean36 = shapeList30.equals((java.lang.Object) (short) -1);
        org.jfree.chart.util.ShapeList shapeList37 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj38 = shapeList37.clone();
        shapeList37.clear();
        java.awt.Shape shape41 = shapeList37.getShape((int) (short) 1);
        boolean boolean43 = shapeList37.equals((java.lang.Object) 0);
        shapeList37.clear();
        boolean boolean45 = shapeList30.equals((java.lang.Object) shapeList37);
        boolean boolean46 = shapeList23.equals((java.lang.Object) boolean45);
        java.lang.Object obj47 = shapeList23.clone();
        boolean boolean48 = shapeList0.equals((java.lang.Object) shapeList23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList23", shapeList0.equals(shapeList23) ? shapeList0.hashCode() == shapeList23.hashCode() : true);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
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
        java.awt.Shape shape15 = shapeList11.getShape((int) (short) 1);
        boolean boolean17 = shapeList11.equals((java.lang.Object) (short) -1);
        shapeList11.clear();
        shapeList11.clear();
        java.awt.Shape shape21 = shapeList11.getShape((int) (short) 0);
        boolean boolean22 = shapeList0.equals((java.lang.Object) shape21);
        java.awt.Shape shape24 = null;
        shapeList0.setShape((int) (byte) 0, shape24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj5", shapeList0.equals(obj5) ? shapeList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 0);
        shapeList0.clear();
        java.awt.Shape shape9 = null;
        shapeList0.setShape(100, shape9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.awt.Shape shape7 = null;
        shapeList0.setShape((int) '#', shape7);
        int int9 = shapeList0.size();
        java.awt.Shape shape11 = shapeList0.getShape((int) (byte) 100);
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        boolean boolean14 = shapeList12.equals((java.lang.Object) (short) 1);
        boolean boolean16 = shapeList12.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj17 = shapeList12.clone();
        java.awt.Shape shape19 = shapeList12.getShape((int) (short) -1);
        int int20 = shapeList12.size();
        int int21 = shapeList12.size();
        java.lang.Object obj22 = shapeList12.clone();
        java.awt.Shape shape24 = shapeList12.getShape((int) (short) 1);
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        boolean boolean27 = shapeList25.equals((java.lang.Object) (short) 1);
        boolean boolean29 = shapeList25.equals((java.lang.Object) 1.0d);
        org.jfree.chart.util.ShapeList shapeList30 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj31 = shapeList30.clone();
        shapeList30.clear();
        java.awt.Shape shape34 = shapeList30.getShape((int) (short) 1);
        boolean boolean36 = shapeList30.equals((java.lang.Object) 0);
        java.lang.Object obj37 = shapeList30.clone();
        boolean boolean39 = shapeList30.equals((java.lang.Object) false);
        java.lang.Object obj40 = shapeList30.clone();
        boolean boolean41 = shapeList25.equals((java.lang.Object) shapeList30);
        shapeList25.clear();
        boolean boolean43 = shapeList12.equals((java.lang.Object) shapeList25);
        boolean boolean44 = shapeList0.equals((java.lang.Object) boolean43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList12", shapeList0.equals(shapeList12) ? shapeList0.hashCode() == shapeList12.hashCode() : true);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 'a');
        shapeList0.clear();
        java.awt.Shape shape9 = shapeList0.getShape((int) (short) 1);
        java.awt.Shape shape11 = null;
        shapeList0.setShape(100, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test498");
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
        java.lang.Object obj17 = shapeList0.clone();
        java.awt.Shape shape19 = null;
        shapeList0.setShape(3, shape19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
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
        java.lang.Object obj12 = shapeList4.clone();
        java.awt.Shape shape14 = null;
        shapeList4.setShape(2, shape14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and shapeList4", shapeList0.equals(shapeList4) ? shapeList0.hashCode() == shapeList4.hashCode() : true);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        boolean boolean6 = shapeList0.equals((java.lang.Object) ' ');
        java.lang.Object obj7 = shapeList0.clone();
        java.awt.Shape shape9 = shapeList0.getShape((int) ' ');
        java.awt.Shape shape11 = null;
        shapeList0.setShape(53, shape11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on shapeList0 and obj1", shapeList0.equals(obj1) ? shapeList0.hashCode() == obj1.hashCode() : true);
    }
}

