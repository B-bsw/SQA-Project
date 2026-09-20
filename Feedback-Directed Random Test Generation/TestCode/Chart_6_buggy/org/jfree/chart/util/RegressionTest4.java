package org.jfree.chart.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        shapeList0.clear();
        int int6 = shapeList0.size();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
        int int18 = shapeList0.size();
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        org.jfree.chart.util.ShapeList shapeList40 = new org.jfree.chart.util.ShapeList();
        shapeList40.clear();
        java.lang.Object obj42 = shapeList40.clone();
        boolean boolean44 = shapeList40.equals((java.lang.Object) (-1));
        int int45 = shapeList40.size();
        java.awt.Shape shape47 = shapeList40.getShape((int) (byte) -1);
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
        java.awt.Shape shape63 = shapeList48.getShape((int) (byte) 0);
        boolean boolean64 = shapeList40.equals((java.lang.Object) shapeList48);
        java.awt.Shape shape66 = shapeList48.getShape(33);
        org.jfree.chart.util.ShapeList shapeList67 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape69 = null;
        shapeList67.setShape(8, shape69);
        java.awt.Shape shape72 = shapeList67.getShape((int) (byte) 100);
        java.awt.Shape shape74 = shapeList67.getShape((int) (byte) 100);
        java.awt.Shape shape76 = null;
        shapeList67.setShape(10, shape76);
        shapeList67.clear();
        boolean boolean79 = shapeList48.equals((java.lang.Object) shapeList67);
        java.lang.Object obj80 = shapeList67.clone();
        boolean boolean81 = shapeList27.equals((java.lang.Object) shapeList67);
        shapeList67.clear();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(shape21);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertNull(shape32);
        org.junit.Assert.assertNull(shape34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(shape47);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNull(shape52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(shape61);
        org.junit.Assert.assertNull(shape63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNull(shape66);
        org.junit.Assert.assertNull(shape72);
        org.junit.Assert.assertNull(shape74);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        shapeList7.clear();
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj21 = shapeList20.clone();
        shapeList20.clear();
        java.awt.Shape shape24 = shapeList20.getShape((int) (short) 1);
        boolean boolean26 = shapeList20.equals((java.lang.Object) (short) -1);
        java.lang.Object obj27 = null;
        boolean boolean28 = shapeList20.equals(obj27);
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        boolean boolean31 = shapeList29.equals((java.lang.Object) (short) 1);
        boolean boolean33 = shapeList29.equals((java.lang.Object) 1.0d);
        java.lang.Object obj34 = shapeList29.clone();
        boolean boolean35 = shapeList20.equals(obj34);
        org.jfree.chart.util.ShapeList shapeList36 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj37 = shapeList36.clone();
        shapeList36.clear();
        java.awt.Shape shape40 = shapeList36.getShape((int) (short) 1);
        java.lang.Object obj41 = shapeList36.clone();
        org.jfree.chart.util.ShapeList shapeList42 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj43 = shapeList42.clone();
        shapeList42.clear();
        java.awt.Shape shape46 = shapeList42.getShape((int) (short) 1);
        boolean boolean48 = shapeList42.equals((java.lang.Object) (short) -1);
        java.lang.Object obj49 = null;
        boolean boolean50 = shapeList42.equals(obj49);
        int int51 = shapeList42.size();
        boolean boolean52 = shapeList36.equals((java.lang.Object) shapeList42);
        boolean boolean53 = shapeList20.equals((java.lang.Object) shapeList42);
        int int54 = shapeList42.size();
        boolean boolean55 = shapeList7.equals((java.lang.Object) shapeList42);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNull(shape40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNull(shape46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 0, shape6);
        java.awt.Shape shape9 = null;
        shapeList0.setShape((int) (byte) 10, shape9);
        boolean boolean12 = shapeList0.equals((java.lang.Object) (-1));
        int int13 = shapeList0.size();
        java.awt.Shape shape15 = shapeList0.getShape((int) (short) 10);
        shapeList0.clear();
        java.lang.Object obj17 = shapeList0.clone();
        int int18 = shapeList0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
        java.awt.Shape shape21 = shapeList0.getShape((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNull(shape21);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        shapeList0.clear();
        java.lang.Object obj18 = null;
        boolean boolean19 = shapeList0.equals(obj18);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        java.lang.Object obj26 = shapeList0.clone();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        java.lang.Class<?> wildcardClass46 = shapeList40.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNull(shape32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 100);
        java.lang.Object obj8 = shapeList0.clone();
        java.lang.Object obj9 = shapeList0.clone();
        java.lang.Object obj10 = shapeList0.clone();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj13 = shapeList12.clone();
        shapeList12.clear();
        java.awt.Shape shape16 = shapeList12.getShape((int) (short) 1);
        boolean boolean18 = shapeList12.equals((java.lang.Object) (short) -1);
        java.lang.Object obj19 = null;
        boolean boolean20 = shapeList12.equals(obj19);
        int int21 = shapeList12.size();
        shapeList12.clear();
        boolean boolean23 = shapeList0.equals((java.lang.Object) shapeList12);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape(1);
        java.awt.Shape shape9 = shapeList0.getShape(100);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        org.jfree.chart.util.ShapeList shapeList12 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj13 = shapeList12.clone();
        shapeList12.clear();
        java.awt.Shape shape16 = shapeList12.getShape((int) (short) 1);
        boolean boolean18 = shapeList12.equals((java.lang.Object) (short) -1);
        java.lang.Object obj19 = null;
        boolean boolean20 = shapeList12.equals(obj19);
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        boolean boolean23 = shapeList21.equals((java.lang.Object) (short) 1);
        boolean boolean25 = shapeList21.equals((java.lang.Object) 1.0d);
        java.lang.Object obj26 = shapeList21.clone();
        boolean boolean27 = shapeList12.equals(obj26);
        org.jfree.chart.util.ShapeList shapeList28 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj29 = shapeList28.clone();
        shapeList28.clear();
        java.awt.Shape shape32 = shapeList28.getShape((int) (short) 1);
        java.lang.Object obj33 = shapeList28.clone();
        org.jfree.chart.util.ShapeList shapeList34 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj35 = shapeList34.clone();
        shapeList34.clear();
        java.awt.Shape shape38 = shapeList34.getShape((int) (short) 1);
        boolean boolean40 = shapeList34.equals((java.lang.Object) (short) -1);
        java.lang.Object obj41 = null;
        boolean boolean42 = shapeList34.equals(obj41);
        int int43 = shapeList34.size();
        boolean boolean44 = shapeList28.equals((java.lang.Object) shapeList34);
        boolean boolean45 = shapeList12.equals((java.lang.Object) shapeList34);
        java.awt.Shape shape47 = shapeList34.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList48 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj49 = shapeList48.clone();
        shapeList48.clear();
        java.lang.Object obj51 = shapeList48.clone();
        int int52 = shapeList48.size();
        org.jfree.chart.util.ShapeList shapeList53 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj54 = shapeList53.clone();
        shapeList53.clear();
        java.awt.Shape shape57 = shapeList53.getShape((int) (short) 1);
        java.lang.Object obj58 = shapeList53.clone();
        shapeList53.clear();
        boolean boolean60 = shapeList48.equals((java.lang.Object) shapeList53);
        boolean boolean61 = shapeList34.equals((java.lang.Object) shapeList48);
        java.lang.Object obj62 = null;
        boolean boolean63 = shapeList34.equals(obj62);
        boolean boolean64 = shapeList0.equals(obj62);
        org.jfree.chart.util.ShapeList shapeList65 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj66 = shapeList65.clone();
        shapeList65.clear();
        java.lang.Object obj68 = shapeList65.clone();
        int int69 = shapeList65.size();
        shapeList65.clear();
        java.awt.Shape shape72 = shapeList65.getShape(101);
        boolean boolean73 = shapeList0.equals((java.lang.Object) shape72);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNull(shape32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNull(shape38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(shape47);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNull(shape57);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNull(shape72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
        org.jfree.chart.util.ShapeList shapeList31 = new org.jfree.chart.util.ShapeList();
        shapeList31.clear();
        java.lang.Object obj33 = shapeList31.clone();
        java.lang.Object obj34 = shapeList31.clone();
        org.jfree.chart.util.ShapeList shapeList35 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj36 = shapeList35.clone();
        shapeList35.clear();
        java.awt.Shape shape39 = shapeList35.getShape((int) ' ');
        java.lang.Object obj40 = shapeList35.clone();
        shapeList35.clear();
        boolean boolean42 = shapeList31.equals((java.lang.Object) shapeList35);
        java.awt.Shape shape44 = shapeList31.getShape(10);
        java.lang.Object obj45 = shapeList31.clone();
        boolean boolean46 = shapeList0.equals((java.lang.Object) shapeList31);
        java.awt.Shape shape48 = shapeList0.getShape((int) (byte) 1);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(shape30);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNull(shape39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(shape44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(shape48);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        java.awt.Shape shape37 = shapeList0.getShape(2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(shape27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(shape33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNull(shape37);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        java.awt.Shape shape15 = shapeList0.getShape(101);
        java.lang.Object obj16 = shapeList0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        java.awt.Shape shape33 = shapeList14.getShape(34);
        org.jfree.chart.util.ShapeList shapeList34 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj35 = shapeList34.clone();
        shapeList34.clear();
        java.awt.Shape shape38 = shapeList34.getShape((int) (short) 1);
        boolean boolean40 = shapeList34.equals((java.lang.Object) (short) -1);
        shapeList34.clear();
        java.awt.Shape shape43 = shapeList34.getShape((int) (short) 100);
        boolean boolean44 = shapeList14.equals((java.lang.Object) shape43);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(shape33);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNull(shape38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(shape43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        java.lang.Class<?> wildcardClass22 = shapeList6.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape(1);
        java.awt.Shape shape9 = shapeList0.getShape(36);
        java.lang.Object obj10 = shapeList0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
        org.jfree.chart.util.ShapeList shapeList57 = new org.jfree.chart.util.ShapeList();
        shapeList57.clear();
        java.lang.Object obj59 = shapeList57.clone();
        boolean boolean61 = shapeList57.equals((java.lang.Object) (-1));
        int int62 = shapeList57.size();
        java.awt.Shape shape64 = shapeList57.getShape((int) (byte) -1);
        org.jfree.chart.util.ShapeList shapeList65 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj66 = shapeList65.clone();
        shapeList65.clear();
        java.awt.Shape shape69 = shapeList65.getShape((int) (short) 1);
        boolean boolean71 = shapeList65.equals((java.lang.Object) (short) -1);
        java.lang.Object obj72 = null;
        boolean boolean73 = shapeList65.equals(obj72);
        int int74 = shapeList65.size();
        java.lang.Object obj75 = null;
        boolean boolean76 = shapeList65.equals(obj75);
        java.awt.Shape shape78 = shapeList65.getShape((int) 'a');
        java.awt.Shape shape80 = shapeList65.getShape((int) (byte) 0);
        boolean boolean81 = shapeList57.equals((java.lang.Object) shapeList65);
        java.awt.Shape shape83 = shapeList65.getShape(33);
        org.jfree.chart.util.ShapeList shapeList84 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape86 = null;
        shapeList84.setShape(8, shape86);
        java.awt.Shape shape89 = shapeList84.getShape((int) (byte) 100);
        java.awt.Shape shape91 = shapeList84.getShape((int) (byte) 100);
        java.awt.Shape shape93 = null;
        shapeList84.setShape(10, shape93);
        shapeList84.clear();
        boolean boolean96 = shapeList65.equals((java.lang.Object) shapeList84);
        boolean boolean97 = shapeList19.equals((java.lang.Object) boolean96);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNull(shape40);
        org.junit.Assert.assertNull(shape42);
        org.junit.Assert.assertNull(shape44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(shape53);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNull(shape64);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertNull(shape69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(shape78);
        org.junit.Assert.assertNull(shape80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNull(shape83);
        org.junit.Assert.assertNull(shape89);
        org.junit.Assert.assertNull(shape91);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        java.lang.Class<?> wildcardClass33 = shapeList15.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(shape31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = shapeList0.clone();
        java.awt.Shape shape9 = shapeList0.getShape((int) (short) -1);
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj11 = shapeList10.clone();
        shapeList10.clear();
        java.lang.Object obj13 = shapeList10.clone();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj15 = shapeList14.clone();
        shapeList14.clear();
        java.awt.Shape shape18 = shapeList14.getShape((int) (short) 1);
        boolean boolean20 = shapeList14.equals((java.lang.Object) (short) -1);
        boolean boolean21 = shapeList10.equals((java.lang.Object) shapeList14);
        java.lang.Object obj22 = shapeList10.clone();
        java.awt.Shape shape24 = shapeList10.getShape(8);
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj26 = shapeList25.clone();
        shapeList25.clear();
        java.awt.Shape shape29 = shapeList25.getShape((int) (short) 1);
        boolean boolean31 = shapeList25.equals((java.lang.Object) (short) -1);
        java.lang.Object obj32 = null;
        boolean boolean33 = shapeList25.equals(obj32);
        int int34 = shapeList25.size();
        java.lang.Object obj35 = null;
        boolean boolean36 = shapeList25.equals(obj35);
        java.awt.Shape shape38 = shapeList25.getShape((int) 'a');
        java.awt.Shape shape40 = shapeList25.getShape((int) '4');
        java.awt.Shape shape42 = shapeList25.getShape((int) '#');
        java.awt.Shape shape44 = shapeList25.getShape((int) (byte) -1);
        java.lang.Object obj45 = shapeList25.clone();
        boolean boolean46 = shapeList10.equals((java.lang.Object) shapeList25);
        java.lang.Object obj47 = shapeList10.clone();
        boolean boolean48 = shapeList0.equals((java.lang.Object) shapeList10);
        shapeList10.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(shape24);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(shape38);
        org.junit.Assert.assertNull(shape40);
        org.junit.Assert.assertNull(shape42);
        org.junit.Assert.assertNull(shape44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = null;
        boolean boolean8 = shapeList0.equals(obj7);
        java.awt.Shape shape10 = shapeList0.getShape((int) (byte) 1);
        java.awt.Shape shape12 = shapeList0.getShape((int) '4');
        java.lang.Object obj13 = shapeList0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        shapeList18.clear();
        java.lang.Object obj20 = shapeList18.clone();
        boolean boolean22 = shapeList18.equals((java.lang.Object) (-1));
        int int23 = shapeList18.size();
        java.awt.Shape shape25 = shapeList18.getShape(0);
        java.awt.Shape shape27 = shapeList18.getShape(9);
        org.jfree.chart.util.ShapeList shapeList28 = new org.jfree.chart.util.ShapeList();
        int int29 = shapeList28.size();
        shapeList28.clear();
        java.awt.Shape shape32 = null;
        shapeList28.setShape((int) (short) 100, shape32);
        shapeList28.clear();
        shapeList28.clear();
        shapeList28.clear();
        boolean boolean37 = shapeList18.equals((java.lang.Object) shapeList28);
        org.jfree.chart.util.ShapeList shapeList38 = new org.jfree.chart.util.ShapeList();
        boolean boolean40 = shapeList38.equals((java.lang.Object) (short) 1);
        boolean boolean42 = shapeList38.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj43 = shapeList38.clone();
        org.jfree.chart.util.ShapeList shapeList44 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape46 = null;
        shapeList44.setShape(8, shape46);
        int int48 = shapeList44.size();
        shapeList44.clear();
        int int50 = shapeList44.size();
        org.jfree.chart.util.ShapeList shapeList51 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj52 = shapeList51.clone();
        shapeList51.clear();
        java.awt.Shape shape55 = shapeList51.getShape((int) (short) 1);
        java.lang.Object obj56 = shapeList51.clone();
        java.lang.Object obj57 = shapeList51.clone();
        boolean boolean58 = shapeList44.equals((java.lang.Object) shapeList51);
        int int59 = shapeList51.size();
        boolean boolean60 = shapeList38.equals((java.lang.Object) int59);
        boolean boolean61 = shapeList18.equals((java.lang.Object) boolean60);
        boolean boolean62 = shapeList4.equals((java.lang.Object) boolean61);
        shapeList4.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertNull(shape27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 9 + "'", int48 == 9);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNull(shape55);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape(0, shape6);
        int int8 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape11 = null;
        shapeList0.setShape(0, shape11);
        java.awt.Shape shape14 = shapeList0.getShape(11);
        java.lang.Object obj15 = shapeList0.clone();
        boolean boolean17 = shapeList0.equals((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        java.lang.Object obj16 = shapeList13.clone();
        int int17 = shapeList13.size();
        java.lang.Object obj18 = shapeList13.clone();
        shapeList13.clear();
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj21 = shapeList20.clone();
        shapeList20.clear();
        java.awt.Shape shape24 = shapeList20.getShape((int) (short) 1);
        boolean boolean26 = shapeList20.equals((java.lang.Object) 'a');
        java.lang.Object obj27 = shapeList20.clone();
        java.lang.Object obj28 = shapeList20.clone();
        boolean boolean29 = shapeList13.equals((java.lang.Object) shapeList20);
        boolean boolean30 = shapeList0.equals((java.lang.Object) boolean29);
        java.lang.Object obj31 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList32 = new org.jfree.chart.util.ShapeList();
        boolean boolean34 = shapeList32.equals((java.lang.Object) (short) 1);
        boolean boolean36 = shapeList32.equals((java.lang.Object) 1.0d);
        java.awt.Shape shape38 = null;
        shapeList32.setShape(33, shape38);
        shapeList32.clear();
        java.awt.Shape shape42 = shapeList32.getShape(101);
        int int43 = shapeList32.size();
        boolean boolean44 = shapeList0.equals((java.lang.Object) int43);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(shape42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj12 = shapeList11.clone();
        shapeList11.clear();
        java.awt.Shape shape15 = shapeList11.getShape((int) (short) 1);
        boolean boolean17 = shapeList11.equals((java.lang.Object) 'a');
        java.awt.Shape shape19 = shapeList11.getShape(33);
        java.awt.Shape shape21 = shapeList11.getShape(0);
        boolean boolean22 = shapeList0.equals((java.lang.Object) 0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape26 = shapeList0.getShape(1);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(shape26);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        java.awt.Shape shape55 = shapeList40.getShape((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(shape24);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNull(shape31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNull(shape38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNull(shape50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(shape55);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
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
        shapeList0.clear();
        int int21 = shapeList0.size();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) -1);
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        int int10 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj12 = shapeList0.clone();
        java.lang.Object obj13 = null;
        boolean boolean14 = shapeList0.equals(obj13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 0, shape6);
        int int8 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj10 = shapeList0.clone();
        java.awt.Shape shape12 = shapeList0.getShape(33);
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(shape12);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        java.awt.Shape shape4 = shapeList0.getShape((int) (byte) 10);
        int int5 = shapeList0.size();
        java.awt.Shape shape7 = shapeList0.getShape((int) (byte) 100);
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj9 = shapeList8.clone();
        shapeList8.clear();
        java.awt.Shape shape12 = shapeList8.getShape((int) (short) 1);
        java.lang.Object obj13 = shapeList8.clone();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj15 = shapeList14.clone();
        shapeList14.clear();
        java.awt.Shape shape18 = shapeList14.getShape((int) (short) 1);
        boolean boolean20 = shapeList14.equals((java.lang.Object) (short) -1);
        java.lang.Object obj21 = null;
        boolean boolean22 = shapeList14.equals(obj21);
        int int23 = shapeList14.size();
        boolean boolean24 = shapeList8.equals((java.lang.Object) shapeList14);
        java.awt.Shape shape26 = shapeList8.getShape(100);
        boolean boolean28 = shapeList8.equals((java.lang.Object) false);
        java.awt.Shape shape30 = shapeList8.getShape(9);
        java.awt.Shape shape32 = shapeList8.getShape(100);
        shapeList8.clear();
        org.jfree.chart.util.ShapeList shapeList34 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj35 = shapeList34.clone();
        shapeList34.clear();
        java.awt.Shape shape38 = shapeList34.getShape((int) (short) 1);
        java.lang.Object obj39 = shapeList34.clone();
        java.awt.Shape shape41 = shapeList34.getShape((int) (short) 100);
        java.lang.Object obj42 = shapeList34.clone();
        boolean boolean43 = shapeList8.equals((java.lang.Object) shapeList34);
        boolean boolean44 = shapeList0.equals((java.lang.Object) boolean43);
        int int45 = shapeList0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(shape30);
        org.junit.Assert.assertNull(shape32);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNull(shape38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNull(shape41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj7 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        boolean boolean10 = shapeList8.equals((java.lang.Object) (short) 1);
        java.lang.Object obj11 = shapeList8.clone();
        java.lang.Object obj12 = shapeList8.clone();
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj14 = shapeList13.clone();
        shapeList13.clear();
        shapeList13.clear();
        java.lang.Object obj17 = shapeList13.clone();
        java.lang.Object obj18 = null;
        boolean boolean19 = shapeList13.equals(obj18);
        boolean boolean21 = shapeList13.equals((java.lang.Object) 0.0f);
        int int22 = shapeList13.size();
        java.lang.Object obj23 = shapeList13.clone();
        int int24 = shapeList13.size();
        boolean boolean25 = shapeList8.equals((java.lang.Object) int24);
        shapeList8.clear();
        boolean boolean27 = shapeList0.equals((java.lang.Object) shapeList8);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        int int25 = shapeList12.size();
        java.awt.Shape shape27 = shapeList12.getShape(0);
        boolean boolean28 = shapeList4.equals((java.lang.Object) shapeList12);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(shape27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
        java.lang.Object obj38 = shapeList20.clone();
        boolean boolean39 = shapeList8.equals(obj38);
        int int40 = shapeList8.size();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
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
        java.lang.Object obj20 = shapeList0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) 1.0d);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape8 = shapeList0.getShape(1);
        shapeList0.clear();
        java.lang.Object obj10 = shapeList0.clone();
        java.lang.Object obj11 = shapeList0.clone();
        java.lang.Object obj12 = shapeList0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        int int4 = shapeList0.size();
        java.awt.Shape shape6 = shapeList0.getShape(0);
        java.awt.Shape shape8 = shapeList0.getShape(2);
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) (short) 100, shape10);
        java.awt.Shape shape13 = null;
        shapeList0.setShape((int) '#', shape13);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(shape8);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        java.lang.Object obj20 = null;
        boolean boolean21 = shapeList0.equals(obj20);
        shapeList0.clear();
        java.awt.Shape shape24 = shapeList0.getShape(9);
        java.awt.Shape shape26 = shapeList0.getShape((int) (short) 100);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(shape24);
        org.junit.Assert.assertNull(shape26);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
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
        java.lang.Object obj20 = shapeList10.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        shapeList0.clear();
        java.lang.Object obj7 = shapeList0.clone();
        java.awt.Shape shape9 = shapeList0.getShape(2);
        java.awt.Shape shape11 = shapeList0.getShape((int) (short) 1);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertNull(shape11);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        shapeList0.clear();
        java.lang.Class<?> wildcardClass16 = shapeList0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 0, shape6);
        int int8 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj10 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj12 = shapeList11.clone();
        shapeList11.clear();
        shapeList11.clear();
        java.awt.Shape shape16 = shapeList11.getShape((int) '#');
        java.awt.Shape shape18 = shapeList11.getShape(1);
        java.awt.Shape shape20 = shapeList11.getShape((int) ' ');
        int int21 = shapeList11.size();
        java.awt.Shape shape23 = shapeList11.getShape(100);
        boolean boolean24 = shapeList0.equals((java.lang.Object) shape23);
        shapeList0.clear();
        java.lang.Class<?> wildcardClass26 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
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
        java.lang.Class<?> wildcardClass17 = shapeList9.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
        java.awt.Shape shape36 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj37 = shapeList0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(shape36);
        org.junit.Assert.assertNotNull(obj37);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
        int int19 = shapeList8.size();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        org.jfree.chart.util.ShapeList shapeList40 = new org.jfree.chart.util.ShapeList();
        shapeList40.clear();
        java.lang.Object obj42 = shapeList40.clone();
        boolean boolean44 = shapeList40.equals((java.lang.Object) (-1));
        int int45 = shapeList40.size();
        java.awt.Shape shape47 = shapeList40.getShape((int) (byte) -1);
        shapeList40.clear();
        java.lang.Object obj49 = shapeList40.clone();
        int int50 = shapeList40.size();
        boolean boolean51 = shapeList34.equals((java.lang.Object) shapeList40);
        java.lang.Object obj52 = shapeList34.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(shape47);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(obj52);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
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
        java.lang.Class<?> wildcardClass18 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 0);
        java.awt.Shape shape8 = shapeList0.getShape(0);
        int int9 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape12 = shapeList0.getShape(33);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(shape12);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        int int2 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape(0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(shape5);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
        java.lang.Object obj20 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        shapeList21.clear();
        java.lang.Object obj23 = shapeList21.clone();
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        boolean boolean26 = shapeList24.equals((java.lang.Object) (short) 1);
        boolean boolean28 = shapeList24.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj29 = shapeList24.clone();
        java.awt.Shape shape31 = shapeList24.getShape((int) (short) -1);
        int int32 = shapeList24.size();
        boolean boolean33 = shapeList21.equals((java.lang.Object) int32);
        java.awt.Shape shape35 = shapeList21.getShape(9);
        int int36 = shapeList21.size();
        java.lang.Object obj37 = shapeList21.clone();
        java.lang.Object obj38 = shapeList21.clone();
        boolean boolean39 = shapeList0.equals((java.lang.Object) shapeList21);
        java.lang.Object obj40 = shapeList0.clone();
        java.lang.Class<?> wildcardClass41 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNull(shape31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(shape35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        java.awt.Shape shape4 = shapeList0.getShape((int) (byte) 10);
        int int5 = shapeList0.size();
        java.awt.Shape shape7 = null;
        shapeList0.setShape(11, shape7);
        shapeList0.clear();
        int int10 = shapeList0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
        int int13 = shapeList0.size();
        shapeList0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList2 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape4 = null;
        shapeList2.setShape(8, shape4);
        int int6 = shapeList2.size();
        shapeList2.clear();
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
        shapeList8.clear();
        boolean boolean22 = shapeList2.equals((java.lang.Object) shapeList8);
        shapeList2.clear();
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj25 = shapeList24.clone();
        java.lang.Object obj26 = shapeList24.clone();
        java.awt.Shape shape28 = shapeList24.getShape(1);
        int int29 = shapeList24.size();
        java.lang.Class<?> wildcardClass30 = shapeList24.getClass();
        boolean boolean31 = shapeList2.equals((java.lang.Object) wildcardClass30);
        boolean boolean32 = shapeList0.equals((java.lang.Object) wildcardClass30);
        int int33 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape36 = shapeList0.getShape(9);
        org.jfree.chart.util.ShapeList shapeList37 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj38 = shapeList37.clone();
        shapeList37.clear();
        java.awt.Shape shape41 = shapeList37.getShape((int) (short) 1);
        boolean boolean43 = shapeList37.equals((java.lang.Object) 'a');
        java.lang.Object obj44 = shapeList37.clone();
        org.jfree.chart.util.ShapeList shapeList45 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj46 = shapeList45.clone();
        java.lang.Object obj47 = shapeList45.clone();
        java.awt.Shape shape49 = shapeList45.getShape(1);
        shapeList45.clear();
        shapeList45.clear();
        org.jfree.chart.util.ShapeList shapeList52 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj53 = shapeList52.clone();
        shapeList52.clear();
        java.awt.Shape shape56 = shapeList52.getShape((int) (short) 1);
        boolean boolean58 = shapeList52.equals((java.lang.Object) 'a');
        java.lang.Object obj59 = shapeList52.clone();
        boolean boolean60 = shapeList45.equals(obj59);
        boolean boolean61 = shapeList37.equals((java.lang.Object) shapeList45);
        shapeList37.clear();
        java.awt.Shape shape64 = shapeList37.getShape(11);
        shapeList37.clear();
        java.awt.Shape shape67 = shapeList37.getShape((int) (byte) 100);
        shapeList37.clear();
        boolean boolean69 = shapeList0.equals((java.lang.Object) shapeList37);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNull(shape28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(shape36);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNull(shape41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNull(shape49);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNull(shape56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNull(shape64);
        org.junit.Assert.assertNull(shape67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
        shapeList0.clear();
        java.lang.Class<?> wildcardClass25 = shapeList0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass28 = shape26.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
        java.awt.Shape shape20 = shapeList0.getShape((int) (byte) 10);
        java.awt.Shape shape22 = shapeList0.getShape((int) (byte) 10);
        java.awt.Shape shape24 = shapeList0.getShape(1);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertNull(shape24);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape(1);
        java.awt.Shape shape9 = shapeList0.getShape(100);
        java.awt.Shape shape11 = shapeList0.getShape(0);
        java.awt.Shape shape13 = shapeList0.getShape(9);
        shapeList0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNull(shape13);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) 1.0d);
        shapeList0.clear();
        shapeList0.clear();
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.awt.Shape shape3 = shapeList0.getShape(1);
        java.awt.Shape shape5 = shapeList0.getShape(101);
        int int6 = shapeList0.size();
        java.lang.Object obj7 = shapeList0.clone();
        int int8 = shapeList0.size();
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        java.lang.Object obj5 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj7 = shapeList0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
        java.lang.Object obj35 = shapeList18.clone();
        java.lang.Class<?> wildcardClass36 = shapeList18.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNull(shape28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(shape33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) 1.0d);
        java.awt.Shape shape6 = null;
        shapeList0.setShape(33, shape6);
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape(101);
        java.awt.Shape shape12 = null;
        shapeList0.setShape((int) (short) 10, shape12);
        java.awt.Shape shape15 = shapeList0.getShape((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNull(shape15);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
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
        shapeList0.clear();
        java.lang.Object obj33 = shapeList0.clone();
        java.lang.Class<?> wildcardClass34 = shapeList0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        java.lang.Object obj38 = shapeList0.clone();
        shapeList0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(shape28);
        org.junit.Assert.assertNull(shape30);
        org.junit.Assert.assertNull(shape32);
        org.junit.Assert.assertNull(shape34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj38);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.awt.Shape shape7 = shapeList0.getShape((int) '4');
        java.awt.Shape shape9 = shapeList0.getShape((int) (byte) 0);
        java.awt.Shape shape11 = shapeList0.getShape((int) (byte) 100);
        shapeList0.clear();
        java.awt.Shape shape14 = null;
        shapeList0.setShape(101, shape14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertNull(shape11);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        shapeList0.clear();
        int int31 = shapeList0.size();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(shape27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
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
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj21 = shapeList20.clone();
        shapeList20.clear();
        java.awt.Shape shape24 = shapeList20.getShape((int) (short) 1);
        boolean boolean26 = shapeList20.equals((java.lang.Object) (short) -1);
        java.lang.Object obj27 = shapeList20.clone();
        int int28 = shapeList20.size();
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape31 = null;
        shapeList29.setShape(8, shape31);
        int int33 = shapeList29.size();
        shapeList29.clear();
        int int35 = shapeList29.size();
        org.jfree.chart.util.ShapeList shapeList36 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj37 = shapeList36.clone();
        shapeList36.clear();
        java.awt.Shape shape40 = shapeList36.getShape((int) (short) 1);
        java.lang.Object obj41 = shapeList36.clone();
        java.lang.Object obj42 = shapeList36.clone();
        boolean boolean43 = shapeList29.equals((java.lang.Object) shapeList36);
        boolean boolean44 = shapeList20.equals((java.lang.Object) boolean43);
        java.awt.Shape shape46 = shapeList20.getShape((int) (short) 0);
        boolean boolean47 = shapeList0.equals((java.lang.Object) shapeList20);
        java.lang.Class<?> wildcardClass48 = shapeList20.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9 + "'", int33 == 9);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNull(shape40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(shape46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
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
        org.jfree.chart.util.ShapeList shapeList39 = new org.jfree.chart.util.ShapeList();
        boolean boolean41 = shapeList39.equals((java.lang.Object) (short) 1);
        boolean boolean43 = shapeList39.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj44 = shapeList39.clone();
        org.jfree.chart.util.ShapeList shapeList45 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj46 = shapeList45.clone();
        shapeList45.clear();
        java.awt.Shape shape49 = shapeList45.getShape((int) (short) 1);
        java.lang.Object obj50 = shapeList45.clone();
        java.lang.Object obj51 = shapeList45.clone();
        boolean boolean52 = shapeList39.equals(obj51);
        java.awt.Shape shape54 = shapeList39.getShape((int) (byte) 10);
        org.jfree.chart.util.ShapeList shapeList55 = new org.jfree.chart.util.ShapeList();
        shapeList55.clear();
        int int57 = shapeList55.size();
        int int58 = shapeList55.size();
        int int59 = shapeList55.size();
        java.awt.Shape shape61 = shapeList55.getShape((int) (short) 1);
        int int62 = shapeList55.size();
        java.awt.Shape shape64 = shapeList55.getShape((int) (byte) 100);
        shapeList55.clear();
        java.awt.Shape shape67 = shapeList55.getShape((int) ' ');
        int int68 = shapeList55.size();
        java.lang.Object obj69 = shapeList55.clone();
        boolean boolean70 = shapeList39.equals(obj69);
        boolean boolean71 = shapeList34.equals((java.lang.Object) shapeList39);
        org.jfree.chart.util.ShapeList shapeList72 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape74 = null;
        shapeList72.setShape(8, shape74);
        int int76 = shapeList72.size();
        shapeList72.clear();
        org.jfree.chart.util.ShapeList shapeList78 = new org.jfree.chart.util.ShapeList();
        shapeList78.clear();
        java.lang.Object obj80 = shapeList78.clone();
        org.jfree.chart.util.ShapeList shapeList81 = new org.jfree.chart.util.ShapeList();
        boolean boolean83 = shapeList81.equals((java.lang.Object) (short) 1);
        boolean boolean85 = shapeList81.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj86 = shapeList81.clone();
        java.awt.Shape shape88 = shapeList81.getShape((int) (short) -1);
        int int89 = shapeList81.size();
        boolean boolean90 = shapeList78.equals((java.lang.Object) int89);
        shapeList78.clear();
        boolean boolean92 = shapeList72.equals((java.lang.Object) shapeList78);
        shapeList78.clear();
        java.lang.Object obj94 = shapeList78.clone();
        boolean boolean95 = shapeList34.equals(obj94);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNull(shape49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(shape54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNull(shape61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNull(shape64);
        org.junit.Assert.assertNull(shape67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(obj69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 9 + "'", int76 == 9);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(obj86);
        org.junit.Assert.assertNull(shape88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(obj94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
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
        java.awt.Shape shape17 = shapeList0.getShape((int) (short) -1);
        int int18 = shapeList0.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        boolean boolean23 = shapeList21.equals((java.lang.Object) (short) 1);
        java.awt.Shape shape25 = shapeList21.getShape((int) (short) 0);
        boolean boolean26 = shapeList0.equals((java.lang.Object) shapeList21);
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        boolean boolean29 = shapeList27.equals((java.lang.Object) (short) 1);
        boolean boolean31 = shapeList27.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj32 = shapeList27.clone();
        boolean boolean33 = shapeList0.equals(obj32);
        org.jfree.chart.util.ShapeList shapeList34 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj35 = shapeList34.clone();
        shapeList34.clear();
        java.awt.Shape shape38 = shapeList34.getShape((int) (short) 1);
        boolean boolean40 = shapeList34.equals((java.lang.Object) 'a');
        java.lang.Object obj41 = shapeList34.clone();
        int int42 = shapeList34.size();
        java.lang.Object obj43 = shapeList34.clone();
        boolean boolean45 = shapeList34.equals((java.lang.Object) 0.0f);
        shapeList34.clear();
        boolean boolean47 = shapeList0.equals((java.lang.Object) shapeList34);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNull(shape38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
        org.jfree.chart.util.ShapeList shapeList28 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj29 = shapeList28.clone();
        shapeList28.clear();
        java.awt.Shape shape32 = shapeList28.getShape((int) (short) 1);
        boolean boolean34 = shapeList28.equals((java.lang.Object) (short) -1);
        shapeList28.clear();
        shapeList28.clear();
        java.awt.Shape shape38 = shapeList28.getShape((int) (short) 0);
        java.awt.Shape shape40 = shapeList28.getShape((int) (byte) 10);
        java.lang.Object obj41 = shapeList28.clone();
        boolean boolean42 = shapeList17.equals(obj41);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNull(shape32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(shape38);
        org.junit.Assert.assertNull(shape40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
        shapeList0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
        shapeList0.clear();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
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
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj19 = shapeList18.clone();
        java.lang.Object obj20 = shapeList18.clone();
        java.awt.Shape shape22 = shapeList18.getShape(1);
        shapeList18.clear();
        shapeList18.clear();
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj26 = shapeList25.clone();
        shapeList25.clear();
        java.awt.Shape shape29 = shapeList25.getShape((int) (short) 1);
        boolean boolean31 = shapeList25.equals((java.lang.Object) 'a');
        java.lang.Object obj32 = shapeList25.clone();
        boolean boolean33 = shapeList18.equals(obj32);
        org.jfree.chart.util.ShapeList shapeList34 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj35 = shapeList34.clone();
        shapeList34.clear();
        java.awt.Shape shape38 = shapeList34.getShape((int) (short) 1);
        java.lang.Object obj39 = shapeList34.clone();
        boolean boolean40 = shapeList18.equals((java.lang.Object) shapeList34);
        int int41 = shapeList18.size();
        int int42 = shapeList18.size();
        org.jfree.chart.util.ShapeList shapeList43 = new org.jfree.chart.util.ShapeList();
        boolean boolean45 = shapeList43.equals((java.lang.Object) (short) 1);
        boolean boolean47 = shapeList43.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj48 = shapeList43.clone();
        java.awt.Shape shape50 = shapeList43.getShape((int) (short) -1);
        int int51 = shapeList43.size();
        int int52 = shapeList43.size();
        int int53 = shapeList43.size();
        boolean boolean54 = shapeList18.equals((java.lang.Object) shapeList43);
        boolean boolean55 = shapeList0.equals((java.lang.Object) shapeList43);
        java.awt.Shape shape57 = shapeList43.getShape(0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNull(shape38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNull(shape50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(shape57);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
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
        java.awt.Shape shape16 = shapeList4.getShape(2);
        int int17 = shapeList4.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
        java.lang.Object obj17 = shapeList7.clone();
        java.lang.Object obj18 = shapeList7.clone();
        int int19 = shapeList7.size();
        java.lang.Class<?> wildcardClass20 = shapeList7.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
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
        java.lang.Class<?> wildcardClass14 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
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
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
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
        int int14 = shapeList0.size();
        java.lang.Object obj15 = shapeList0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 101 + "'", int14 == 101);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '4');
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj7 = shapeList6.clone();
        shapeList6.clear();
        java.awt.Shape shape10 = shapeList6.getShape((int) (short) 1);
        java.lang.Object obj11 = shapeList6.clone();
        java.lang.Object obj12 = shapeList6.clone();
        shapeList6.clear();
        boolean boolean14 = shapeList0.equals((java.lang.Object) shapeList6);
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj16 = shapeList15.clone();
        shapeList15.clear();
        java.lang.Object obj18 = shapeList15.clone();
        int int19 = shapeList15.size();
        java.lang.Object obj20 = shapeList15.clone();
        shapeList15.clear();
        shapeList15.clear();
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj24 = shapeList23.clone();
        shapeList23.clear();
        shapeList23.clear();
        java.awt.Shape shape28 = shapeList23.getShape((int) '#');
        java.awt.Shape shape30 = shapeList23.getShape(1);
        java.awt.Shape shape32 = shapeList23.getShape((int) (byte) 0);
        boolean boolean33 = shapeList15.equals((java.lang.Object) shapeList23);
        org.jfree.chart.util.ShapeList shapeList34 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj35 = shapeList34.clone();
        java.lang.Object obj36 = shapeList34.clone();
        boolean boolean37 = shapeList15.equals((java.lang.Object) shapeList34);
        java.lang.Object obj38 = shapeList15.clone();
        boolean boolean39 = shapeList0.equals((java.lang.Object) shapeList15);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNull(shape28);
        org.junit.Assert.assertNull(shape30);
        org.junit.Assert.assertNull(shape32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj5 = shapeList0.clone();
        shapeList0.clear();
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
        shapeList9.clear();
        shapeList9.clear();
        java.awt.Shape shape23 = shapeList9.getShape((int) (short) 100);
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj25 = shapeList24.clone();
        shapeList24.clear();
        java.awt.Shape shape28 = shapeList24.getShape((int) (short) 1);
        boolean boolean30 = shapeList24.equals((java.lang.Object) 'a');
        shapeList24.clear();
        java.awt.Shape shape33 = shapeList24.getShape((int) (short) 1);
        shapeList24.clear();
        boolean boolean35 = shapeList9.equals((java.lang.Object) shapeList24);
        boolean boolean36 = shapeList0.equals((java.lang.Object) shapeList24);
        java.lang.Class<?> wildcardClass37 = shapeList24.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(shape33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
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
        int int26 = shapeList13.size();
        java.awt.Shape shape28 = shapeList13.getShape((int) (short) 10);
        java.lang.Object obj29 = shapeList13.clone();
        java.lang.Object obj30 = shapeList13.clone();
        boolean boolean31 = shapeList0.equals((java.lang.Object) shapeList13);
        shapeList0.clear();
        int int33 = shapeList0.size();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(shape28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        int int2 = shapeList0.size();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) '#', shape4);
        shapeList0.clear();
        java.awt.Shape shape8 = null;
        shapeList0.setShape(1, shape8);
        java.awt.Shape shape11 = shapeList0.getShape((int) (short) 100);
        int int12 = shapeList0.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
        shapeList0.clear();
        java.lang.Object obj25 = shapeList0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj8 = shapeList0.clone();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj11 = shapeList10.clone();
        shapeList10.clear();
        java.lang.Object obj13 = shapeList10.clone();
        int int14 = shapeList10.size();
        java.lang.Object obj15 = shapeList10.clone();
        int int16 = shapeList10.size();
        int int17 = shapeList10.size();
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj19 = shapeList18.clone();
        shapeList18.clear();
        shapeList18.clear();
        java.awt.Shape shape23 = shapeList18.getShape((int) '#');
        shapeList18.clear();
        shapeList18.clear();
        java.awt.Shape shape27 = shapeList18.getShape(11);
        boolean boolean28 = shapeList10.equals((java.lang.Object) shapeList18);
        boolean boolean29 = shapeList0.equals((java.lang.Object) boolean28);
        java.lang.Object obj30 = shapeList0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertNull(shape27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
        java.awt.Shape shape25 = shapeList17.getShape(0);
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        shapeList26.clear();
        java.lang.Object obj28 = shapeList26.clone();
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        boolean boolean31 = shapeList29.equals((java.lang.Object) (short) 1);
        boolean boolean33 = shapeList29.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj34 = shapeList29.clone();
        java.awt.Shape shape36 = shapeList29.getShape((int) (short) -1);
        int int37 = shapeList29.size();
        boolean boolean38 = shapeList26.equals((java.lang.Object) int37);
        java.awt.Shape shape40 = shapeList26.getShape(9);
        int int41 = shapeList26.size();
        java.lang.Object obj42 = shapeList26.clone();
        org.jfree.chart.util.ShapeList shapeList43 = new org.jfree.chart.util.ShapeList();
        boolean boolean44 = shapeList26.equals((java.lang.Object) shapeList43);
        java.lang.Class<?> wildcardClass45 = shapeList26.getClass();
        boolean boolean46 = shapeList17.equals((java.lang.Object) shapeList26);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNull(shape36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(shape40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
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
        java.lang.Object obj20 = shapeList0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = shape10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(shape10);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 0, shape6);
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        int int10 = shapeList0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
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
        java.awt.Shape shape21 = shapeList0.getShape(2);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertNull(shape21);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
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
        java.awt.Shape shape19 = shapeList0.getShape((int) '4');
        java.awt.Shape shape21 = shapeList0.getShape(11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertNull(shape21);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        int int48 = shapeList0.size();
        java.lang.Object obj49 = shapeList0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(shape28);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNull(shape40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(obj49);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) 1.0d);
        java.awt.Shape shape6 = shapeList0.getShape(53);
        java.awt.Shape shape8 = shapeList0.getShape((int) (byte) 100);
        int int9 = shapeList0.size();
        java.lang.Object obj10 = shapeList0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
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
        java.awt.Shape shape18 = shapeList0.getShape(0);
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj20 = shapeList19.clone();
        shapeList19.clear();
        java.lang.Object obj22 = shapeList19.clone();
        int int23 = shapeList19.size();
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj25 = shapeList24.clone();
        shapeList24.clear();
        java.awt.Shape shape28 = shapeList24.getShape((int) (short) 1);
        java.lang.Object obj29 = shapeList24.clone();
        shapeList24.clear();
        boolean boolean31 = shapeList19.equals((java.lang.Object) shapeList24);
        boolean boolean32 = shapeList0.equals((java.lang.Object) shapeList19);
        java.lang.Object obj33 = shapeList0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNull(shape28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 0, shape6);
        int int8 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape12 = null;
        shapeList0.setShape(34, shape12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        int int2 = shapeList0.size();
        java.lang.Object obj3 = shapeList0.clone();
        java.lang.Class<?> wildcardClass4 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
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
        int int27 = shapeList19.size();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
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
        java.lang.Object obj56 = shapeList27.clone();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(shape24);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNull(shape31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNull(shape38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNull(shape50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(shape55);
        org.junit.Assert.assertNotNull(obj56);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
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
        int int21 = shapeList10.size();
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
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
        java.lang.Object obj22 = shapeList0.clone();
        int int23 = shapeList0.size();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNull(shape21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) ' ');
        java.lang.Object obj5 = shapeList0.clone();
        int int6 = shapeList0.size();
        int int7 = shapeList0.size();
        java.lang.Object obj8 = shapeList0.clone();
        java.lang.Object obj9 = shapeList0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
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
        java.lang.Object obj20 = null;
        boolean boolean21 = shapeList0.equals(obj20);
        shapeList0.clear();
        java.awt.Shape shape24 = shapeList0.getShape(101);
        int int25 = shapeList0.size();
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(shape24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
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
        shapeList0.clear();
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 0);
        java.lang.Object obj7 = shapeList0.clone();
        boolean boolean9 = shapeList0.equals((java.lang.Object) false);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj12 = shapeList11.clone();
        shapeList11.clear();
        shapeList11.clear();
        java.awt.Shape shape16 = shapeList11.getShape((int) '#');
        shapeList11.clear();
        java.lang.Object obj18 = shapeList11.clone();
        java.awt.Shape shape20 = shapeList11.getShape(10);
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj22 = shapeList21.clone();
        shapeList21.clear();
        java.awt.Shape shape25 = shapeList21.getShape((int) (short) 1);
        boolean boolean27 = shapeList21.equals((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass28 = shapeList21.getClass();
        boolean boolean29 = shapeList11.equals((java.lang.Object) wildcardClass28);
        shapeList11.clear();
        boolean boolean31 = shapeList0.equals((java.lang.Object) shapeList11);
        shapeList0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
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
        java.lang.Object obj32 = shapeList0.clone();
        java.lang.Object obj33 = shapeList0.clone();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
        java.awt.Shape shape14 = shapeList0.getShape(10);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertNull(shape14);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        java.awt.Shape shape5 = shapeList0.getShape((int) (byte) 100);
        shapeList0.clear();
        java.lang.Object obj7 = shapeList0.clone();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 100);
        java.lang.Object obj8 = shapeList0.clone();
        int int9 = shapeList0.size();
        java.lang.Class<?> wildcardClass10 = shapeList0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
        shapeList0.clear();
        java.lang.Object obj19 = shapeList0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
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
        org.jfree.chart.util.ShapeList shapeList40 = new org.jfree.chart.util.ShapeList();
        shapeList40.clear();
        java.lang.Object obj42 = shapeList40.clone();
        boolean boolean44 = shapeList40.equals((java.lang.Object) (-1));
        int int45 = shapeList40.size();
        java.awt.Shape shape47 = shapeList40.getShape((int) (byte) -1);
        shapeList40.clear();
        java.lang.Object obj49 = shapeList40.clone();
        int int50 = shapeList40.size();
        boolean boolean51 = shapeList34.equals((java.lang.Object) shapeList40);
        java.awt.Shape shape53 = shapeList34.getShape((int) (byte) 100);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(shape47);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(shape53);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
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
        java.lang.Object obj76 = shapeList4.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(shape24);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(shape34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNull(shape43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNull(shape58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNull(shape71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(obj76);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        int int2 = shapeList0.size();
        shapeList0.clear();
        int int4 = shapeList0.size();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
        org.jfree.chart.util.ShapeList shapeList17 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj18 = shapeList17.clone();
        shapeList17.clear();
        shapeList17.clear();
        java.lang.Object obj21 = shapeList17.clone();
        java.lang.Object obj22 = null;
        boolean boolean23 = shapeList17.equals(obj22);
        boolean boolean25 = shapeList17.equals((java.lang.Object) 0.0f);
        int int26 = shapeList17.size();
        java.lang.Object obj27 = shapeList17.clone();
        int int28 = shapeList17.size();
        shapeList17.clear();
        java.lang.Class<?> wildcardClass30 = shapeList17.getClass();
        boolean boolean31 = shapeList0.equals((java.lang.Object) wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
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
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj14 = shapeList13.clone();
        shapeList13.clear();
        shapeList13.clear();
        java.awt.Shape shape18 = shapeList13.getShape((int) '#');
        shapeList13.clear();
        shapeList13.clear();
        java.lang.Object obj21 = shapeList13.clone();
        boolean boolean22 = shapeList0.equals((java.lang.Object) shapeList13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
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
        int int25 = shapeList0.size();
        shapeList0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
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
        java.lang.Class<?> wildcardClass40 = shapeList27.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(shape21);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertNull(shape32);
        org.junit.Assert.assertNull(shape34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        int int3 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        boolean boolean6 = shapeList4.equals((java.lang.Object) (short) 1);
        boolean boolean8 = shapeList4.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj10 = shapeList9.clone();
        shapeList9.clear();
        java.awt.Shape shape13 = shapeList9.getShape((int) (short) 1);
        boolean boolean15 = shapeList9.equals((java.lang.Object) (short) -1);
        shapeList9.clear();
        shapeList9.clear();
        java.awt.Shape shape19 = shapeList9.getShape((int) (short) 0);
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj21 = shapeList20.clone();
        shapeList20.clear();
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        int int24 = shapeList23.size();
        int int25 = shapeList23.size();
        java.lang.Object obj26 = shapeList23.clone();
        boolean boolean27 = shapeList20.equals(obj26);
        boolean boolean28 = shapeList9.equals((java.lang.Object) shapeList20);
        boolean boolean29 = shapeList4.equals((java.lang.Object) shapeList20);
        java.awt.Shape shape31 = shapeList20.getShape((int) '#');
        boolean boolean32 = shapeList0.equals((java.lang.Object) shape31);
        java.lang.Object obj33 = shapeList0.clone();
        java.awt.Shape shape35 = shapeList0.getShape(3);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(shape31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNull(shape35);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
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
        java.lang.Object obj20 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        shapeList21.clear();
        java.lang.Object obj23 = shapeList21.clone();
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        boolean boolean26 = shapeList24.equals((java.lang.Object) (short) 1);
        boolean boolean28 = shapeList24.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj29 = shapeList24.clone();
        java.awt.Shape shape31 = shapeList24.getShape((int) (short) -1);
        int int32 = shapeList24.size();
        boolean boolean33 = shapeList21.equals((java.lang.Object) int32);
        java.awt.Shape shape35 = shapeList21.getShape(9);
        int int36 = shapeList21.size();
        java.lang.Object obj37 = shapeList21.clone();
        java.lang.Object obj38 = shapeList21.clone();
        boolean boolean39 = shapeList0.equals((java.lang.Object) shapeList21);
        java.lang.Object obj40 = shapeList0.clone();
        java.awt.Shape shape42 = shapeList0.getShape(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNull(shape31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(shape35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNull(shape42);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 0, shape6);
        int int8 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj10 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj12 = shapeList11.clone();
        shapeList11.clear();
        shapeList11.clear();
        java.awt.Shape shape16 = shapeList11.getShape((int) '#');
        java.awt.Shape shape18 = shapeList11.getShape(1);
        java.awt.Shape shape20 = shapeList11.getShape((int) ' ');
        int int21 = shapeList11.size();
        java.awt.Shape shape23 = shapeList11.getShape(100);
        boolean boolean24 = shapeList0.equals((java.lang.Object) shape23);
        shapeList0.clear();
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
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
        // The following exception was thrown during execution in test generation
        try {
            shapeList27.setShape((int) (short) -1, shape57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(shape24);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNull(shape31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNull(shape38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNull(shape50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(shape55);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
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
        shapeList7.clear();
        java.awt.Shape shape18 = shapeList7.getShape((int) 'a');
        shapeList7.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(shape18);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        java.lang.Object obj5 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        int int8 = shapeList0.size();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
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
        java.lang.Object obj51 = shapeList36.clone();
        shapeList36.clear();
        java.lang.Object obj53 = shapeList36.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(shape35);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNull(shape45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(obj53);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(1);
        int int5 = shapeList0.size();
        shapeList0.clear();
        int int7 = shapeList0.size();
        java.lang.Object obj8 = shapeList0.clone();
        java.lang.Object obj9 = shapeList0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
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
        java.lang.Object obj22 = shapeList0.clone();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
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
        java.lang.Object obj22 = shapeList10.clone();
        java.lang.Class<?> wildcardClass23 = shapeList10.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 0, shape6);
        java.awt.Shape shape9 = null;
        shapeList0.setShape(1, shape9);
        java.lang.Class<?> wildcardClass11 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
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
        int int26 = shapeList13.size();
        java.awt.Shape shape28 = shapeList13.getShape((int) (short) 10);
        java.lang.Object obj29 = shapeList13.clone();
        java.lang.Object obj30 = shapeList13.clone();
        boolean boolean31 = shapeList0.equals((java.lang.Object) shapeList13);
        shapeList0.clear();
        java.awt.Shape shape34 = shapeList0.getShape(1);
        java.lang.Object obj35 = shapeList0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(shape28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(shape34);
        org.junit.Assert.assertNotNull(obj35);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
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
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        boolean boolean26 = shapeList24.equals((java.lang.Object) (short) 1);
        boolean boolean28 = shapeList24.equals((java.lang.Object) 1.0d);
        java.lang.Object obj29 = shapeList24.clone();
        boolean boolean30 = shapeList13.equals((java.lang.Object) shapeList24);
        org.jfree.chart.util.ShapeList shapeList31 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape33 = null;
        shapeList31.setShape(8, shape33);
        int int35 = shapeList31.size();
        shapeList31.clear();
        org.jfree.chart.util.ShapeList shapeList37 = new org.jfree.chart.util.ShapeList();
        shapeList37.clear();
        java.lang.Object obj39 = shapeList37.clone();
        org.jfree.chart.util.ShapeList shapeList40 = new org.jfree.chart.util.ShapeList();
        boolean boolean42 = shapeList40.equals((java.lang.Object) (short) 1);
        boolean boolean44 = shapeList40.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj45 = shapeList40.clone();
        java.awt.Shape shape47 = shapeList40.getShape((int) (short) -1);
        int int48 = shapeList40.size();
        boolean boolean49 = shapeList37.equals((java.lang.Object) int48);
        shapeList37.clear();
        boolean boolean51 = shapeList31.equals((java.lang.Object) shapeList37);
        shapeList37.clear();
        java.lang.Object obj53 = shapeList37.clone();
        java.awt.Shape shape55 = shapeList37.getShape((int) 'a');
        shapeList37.clear();
        org.jfree.chart.util.ShapeList shapeList57 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj58 = shapeList57.clone();
        shapeList57.clear();
        shapeList57.clear();
        java.awt.Shape shape62 = shapeList57.getShape((int) '#');
        java.awt.Shape shape64 = shapeList57.getShape(1);
        java.awt.Shape shape66 = shapeList57.getShape((int) ' ');
        int int67 = shapeList57.size();
        java.awt.Shape shape69 = shapeList57.getShape(100);
        boolean boolean70 = shapeList37.equals((java.lang.Object) 100);
        java.lang.Object obj71 = shapeList37.clone();
        org.jfree.chart.util.ShapeList shapeList72 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj73 = shapeList72.clone();
        shapeList72.clear();
        java.awt.Shape shape76 = shapeList72.getShape((int) (short) 1);
        boolean boolean78 = shapeList72.equals((java.lang.Object) 0);
        java.awt.Shape shape80 = shapeList72.getShape(0);
        shapeList72.clear();
        int int82 = shapeList72.size();
        boolean boolean83 = shapeList37.equals((java.lang.Object) shapeList72);
        boolean boolean84 = shapeList13.equals((java.lang.Object) shapeList72);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 9 + "'", int35 == 9);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNull(shape47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNull(shape55);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNull(shape62);
        org.junit.Assert.assertNull(shape64);
        org.junit.Assert.assertNull(shape66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNull(shape69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertNull(shape76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(shape80);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
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
        java.awt.Shape shape24 = shapeList0.getShape(98);
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(shape24);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        java.awt.Shape shape5 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape7 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape9 = null;
        shapeList0.setShape(10, shape9);
        int int11 = shapeList0.size();
        java.lang.Object obj12 = shapeList0.clone();
        java.lang.Object obj13 = shapeList0.clone();
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        java.lang.Object obj3 = shapeList0.clone();
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
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
        org.jfree.chart.util.ShapeList shapeList30 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj31 = shapeList30.clone();
        shapeList30.clear();
        java.awt.Shape shape34 = shapeList30.getShape((int) (short) 1);
        boolean boolean36 = shapeList30.equals((java.lang.Object) 'a');
        java.lang.Object obj37 = shapeList30.clone();
        org.jfree.chart.util.ShapeList shapeList38 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj39 = shapeList38.clone();
        java.lang.Object obj40 = shapeList38.clone();
        java.awt.Shape shape42 = shapeList38.getShape(1);
        shapeList38.clear();
        shapeList38.clear();
        org.jfree.chart.util.ShapeList shapeList45 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj46 = shapeList45.clone();
        shapeList45.clear();
        java.awt.Shape shape49 = shapeList45.getShape((int) (short) 1);
        boolean boolean51 = shapeList45.equals((java.lang.Object) 'a');
        java.lang.Object obj52 = shapeList45.clone();
        boolean boolean53 = shapeList38.equals(obj52);
        boolean boolean54 = shapeList30.equals((java.lang.Object) shapeList38);
        java.lang.Object obj55 = shapeList30.clone();
        java.lang.Object obj56 = shapeList30.clone();
        int int57 = shapeList30.size();
        boolean boolean58 = shapeList0.equals((java.lang.Object) int57);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(shape28);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNull(shape34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNull(shape42);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNull(shape49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        int int2 = shapeList0.size();
        int int3 = shapeList0.size();
        int int4 = shapeList0.size();
        java.awt.Shape shape6 = shapeList0.getShape((int) (short) 1);
        int int7 = shapeList0.size();
        java.awt.Shape shape9 = shapeList0.getShape((int) (byte) 100);
        shapeList0.clear();
        java.awt.Shape shape12 = null;
        shapeList0.setShape((int) (short) 100, shape12);
        java.lang.Object obj14 = shapeList0.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
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
        int int61 = shapeList40.size();
        java.lang.Class<?> wildcardClass62 = shapeList40.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNull(shape32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(shape53);
        org.junit.Assert.assertNull(shape58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) 1.0d);
        java.awt.Shape shape6 = null;
        shapeList0.setShape(33, shape6);
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj8 = shapeList0.clone();
        boolean boolean10 = shapeList0.equals((java.lang.Object) 34);
        java.lang.Object obj11 = shapeList0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
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
        shapeList0.clear();
        int int14 = shapeList0.size();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
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
        int int26 = shapeList0.size();
        shapeList0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
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
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj19 = shapeList18.clone();
        shapeList18.clear();
        java.awt.Shape shape22 = shapeList18.getShape((int) (short) 1);
        boolean boolean24 = shapeList18.equals((java.lang.Object) (short) -1);
        shapeList18.clear();
        shapeList18.clear();
        java.awt.Shape shape28 = shapeList18.getShape((int) (short) 0);
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj30 = shapeList29.clone();
        shapeList29.clear();
        org.jfree.chart.util.ShapeList shapeList32 = new org.jfree.chart.util.ShapeList();
        int int33 = shapeList32.size();
        int int34 = shapeList32.size();
        java.lang.Object obj35 = shapeList32.clone();
        boolean boolean36 = shapeList29.equals(obj35);
        boolean boolean37 = shapeList18.equals((java.lang.Object) shapeList29);
        int int38 = shapeList18.size();
        boolean boolean39 = shapeList0.equals((java.lang.Object) int38);
        org.jfree.chart.util.ShapeList shapeList40 = new org.jfree.chart.util.ShapeList();
        int int41 = shapeList40.size();
        shapeList40.clear();
        java.awt.Shape shape44 = null;
        shapeList40.setShape((int) (short) 100, shape44);
        shapeList40.clear();
        shapeList40.clear();
        java.lang.Object obj48 = shapeList40.clone();
        org.jfree.chart.util.ShapeList shapeList49 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj50 = shapeList49.clone();
        shapeList49.clear();
        java.awt.Shape shape53 = shapeList49.getShape((int) (short) 1);
        boolean boolean55 = shapeList49.equals((java.lang.Object) 'a');
        java.lang.Object obj56 = shapeList49.clone();
        int int57 = shapeList49.size();
        java.lang.Object obj58 = shapeList49.clone();
        boolean boolean59 = shapeList40.equals((java.lang.Object) shapeList49);
        java.lang.Object obj60 = shapeList40.clone();
        java.awt.Shape shape62 = shapeList40.getShape((int) ' ');
        boolean boolean63 = shapeList0.equals((java.lang.Object) shape62);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(shape28);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNull(shape53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNull(shape62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
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
        java.awt.Shape shape20 = shapeList17.getShape(33);
        java.lang.Object obj21 = shapeList17.clone();
        java.awt.Shape shape23 = shapeList17.getShape(100);
        java.lang.Object obj24 = shapeList17.clone();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
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
        java.lang.Object obj34 = shapeList0.clone();
        shapeList0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNull(shape33);
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 0, shape6);
        java.awt.Shape shape9 = null;
        shapeList0.setShape((int) (byte) 10, shape9);
        int int11 = shapeList0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
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
        int int12 = shapeList0.size();
        shapeList0.clear();
        int int14 = shapeList0.size();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) ' ');
        java.lang.Object obj5 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList6 = new org.jfree.chart.util.ShapeList();
        boolean boolean8 = shapeList6.equals((java.lang.Object) (short) 1);
        boolean boolean10 = shapeList6.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj11 = shapeList6.clone();
        java.awt.Shape shape13 = shapeList6.getShape((int) (short) -1);
        int int14 = shapeList6.size();
        int int15 = shapeList6.size();
        int int16 = shapeList6.size();
        java.awt.Shape shape18 = shapeList6.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        shapeList19.clear();
        java.lang.Object obj21 = shapeList19.clone();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        boolean boolean24 = shapeList22.equals((java.lang.Object) (short) 1);
        boolean boolean26 = shapeList22.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj27 = shapeList22.clone();
        java.awt.Shape shape29 = shapeList22.getShape((int) (short) -1);
        int int30 = shapeList22.size();
        boolean boolean31 = shapeList19.equals((java.lang.Object) int30);
        java.awt.Shape shape33 = shapeList19.getShape(9);
        int int34 = shapeList19.size();
        java.lang.Object obj35 = shapeList19.clone();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        boolean boolean37 = shapeList6.equals((java.lang.Object) wildcardClass36);
        java.awt.Shape shape39 = shapeList6.getShape(0);
        java.lang.Object obj40 = shapeList6.clone();
        java.awt.Shape shape42 = shapeList6.getShape((int) (byte) -1);
        boolean boolean43 = shapeList0.equals((java.lang.Object) shape42);
        shapeList0.clear();
        shapeList0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNull(shape29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(shape33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(shape39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNull(shape42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        int int2 = shapeList0.size();
        java.awt.Shape shape4 = shapeList0.getShape((-1));
        java.lang.Object obj5 = shapeList0.clone();
        java.lang.Object obj6 = shapeList0.clone();
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
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
        java.lang.Object obj32 = shapeList14.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
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
        java.awt.Shape shape18 = shapeList0.getShape(0);
        int int19 = shapeList0.size();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
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
        java.lang.Object obj23 = shapeList0.clone();
        java.awt.Shape shape25 = shapeList0.getShape(3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNull(shape25);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape((int) '#');
        java.lang.Object obj10 = shapeList0.clone();
        java.lang.Object obj11 = shapeList0.clone();
        java.lang.Object obj12 = shapeList0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
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
        int int32 = shapeList0.size();
        java.lang.Class<?> wildcardClass33 = shapeList0.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1));
        int int5 = shapeList0.size();
        java.awt.Shape shape7 = shapeList0.getShape(0);
        java.lang.Object obj8 = shapeList0.clone();
        java.lang.Class<?> wildcardClass9 = shapeList0.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
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
        java.awt.Shape shape15 = shapeList11.getShape((int) (short) 1);
        boolean boolean17 = shapeList11.equals((java.lang.Object) 0);
        java.lang.Object obj18 = shapeList11.clone();
        boolean boolean20 = shapeList11.equals((java.lang.Object) false);
        shapeList11.clear();
        int int22 = shapeList11.size();
        java.awt.Shape shape24 = shapeList11.getShape(2);
        int int25 = shapeList11.size();
        boolean boolean26 = shapeList0.equals((java.lang.Object) shapeList11);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(shape24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
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
        java.lang.Class<?> wildcardClass33 = shapeList7.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(1);
        int int5 = shapeList0.size();
        shapeList0.clear();
        int int7 = shapeList0.size();
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        java.awt.Shape shape11 = shapeList0.getShape(34);
        java.lang.Class<?> wildcardClass12 = shapeList0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.awt.Shape shape3 = shapeList0.getShape((int) (byte) 10);
        boolean boolean5 = shapeList0.equals((java.lang.Object) 11);
        java.awt.Shape shape7 = shapeList0.getShape((int) ' ');
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(shape7);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) -1);
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        java.lang.Object obj10 = shapeList0.clone();
        int int11 = shapeList0.size();
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
        boolean boolean28 = shapeList0.equals((java.lang.Object) boolean27);
        java.lang.Object obj29 = shapeList0.clone();
        shapeList0.clear();
        int int31 = shapeList0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        shapeList0.clear();
        java.awt.Shape shape9 = shapeList0.getShape((int) (short) 100);
        java.lang.Object obj10 = shapeList0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
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
        java.lang.Object obj13 = shapeList0.clone();
        java.awt.Shape shape15 = shapeList0.getShape((int) (byte) 10);
        java.awt.Shape shape17 = shapeList0.getShape((int) (short) 0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertNull(shape17);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
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
        java.awt.Shape shape49 = shapeList0.getShape((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass50 = shape49.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(shape28);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNull(shape40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(shape49);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
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
        java.lang.Object obj16 = shapeList0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
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
        java.lang.Object obj36 = null;
        boolean boolean37 = shapeList22.equals(obj36);
        int int38 = shapeList22.size();
        shapeList22.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(shape35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 0);
        java.lang.Object obj7 = shapeList0.clone();
        boolean boolean9 = shapeList0.equals((java.lang.Object) false);
        shapeList0.clear();
        int int11 = shapeList0.size();
        java.awt.Shape shape13 = shapeList0.getShape(2);
        int int14 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList15 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape17 = null;
        shapeList15.setShape(8, shape17);
        java.awt.Shape shape20 = shapeList15.getShape((int) (byte) 100);
        java.awt.Shape shape22 = shapeList15.getShape((int) (byte) 100);
        java.awt.Shape shape24 = shapeList15.getShape(11);
        java.awt.Shape shape26 = null;
        shapeList15.setShape((int) ' ', shape26);
        java.awt.Shape shape29 = shapeList15.getShape((int) (short) 1);
        int int30 = shapeList15.size();
        int int31 = shapeList15.size();
        int int32 = shapeList15.size();
        shapeList15.clear();
        shapeList15.clear();
        boolean boolean35 = shapeList0.equals((java.lang.Object) shapeList15);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertNull(shape24);
        org.junit.Assert.assertNull(shape29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 33 + "'", int30 == 33);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 33 + "'", int31 == 33);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 33 + "'", int32 == 33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
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
        int int45 = shapeList23.size();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNull(shape36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
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
        shapeList15.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
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
        int int17 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList18 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj19 = shapeList18.clone();
        shapeList18.clear();
        java.lang.Object obj21 = shapeList18.clone();
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj23 = shapeList22.clone();
        shapeList22.clear();
        java.awt.Shape shape26 = shapeList22.getShape((int) (short) 1);
        boolean boolean28 = shapeList22.equals((java.lang.Object) (short) -1);
        boolean boolean29 = shapeList18.equals((java.lang.Object) shapeList22);
        java.lang.Object obj30 = shapeList18.clone();
        java.awt.Shape shape32 = shapeList18.getShape(8);
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
        java.awt.Shape shape48 = shapeList33.getShape((int) '4');
        java.awt.Shape shape50 = shapeList33.getShape((int) '#');
        java.awt.Shape shape52 = shapeList33.getShape((int) (byte) -1);
        java.lang.Object obj53 = shapeList33.clone();
        boolean boolean54 = shapeList18.equals((java.lang.Object) shapeList33);
        org.jfree.chart.util.ShapeList shapeList55 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj56 = shapeList55.clone();
        shapeList55.clear();
        java.lang.Object obj58 = shapeList55.clone();
        int int59 = shapeList55.size();
        java.lang.Object obj60 = shapeList55.clone();
        shapeList55.clear();
        shapeList55.clear();
        org.jfree.chart.util.ShapeList shapeList63 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj64 = shapeList63.clone();
        shapeList63.clear();
        java.lang.Object obj66 = shapeList63.clone();
        int int67 = shapeList63.size();
        java.lang.Object obj68 = shapeList63.clone();
        shapeList63.clear();
        shapeList63.clear();
        org.jfree.chart.util.ShapeList shapeList71 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj72 = shapeList71.clone();
        shapeList71.clear();
        shapeList71.clear();
        java.awt.Shape shape76 = shapeList71.getShape((int) '#');
        java.awt.Shape shape78 = shapeList71.getShape(1);
        java.awt.Shape shape80 = shapeList71.getShape((int) (byte) 0);
        boolean boolean81 = shapeList63.equals((java.lang.Object) shapeList71);
        org.jfree.chart.util.ShapeList shapeList82 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj83 = shapeList82.clone();
        java.lang.Object obj84 = shapeList82.clone();
        boolean boolean85 = shapeList63.equals((java.lang.Object) shapeList82);
        boolean boolean86 = shapeList55.equals((java.lang.Object) boolean85);
        int int87 = shapeList55.size();
        java.awt.Shape shape89 = shapeList55.getShape((int) '4');
        java.lang.Object obj90 = shapeList55.clone();
        java.awt.Shape shape92 = shapeList55.getShape(53);
        boolean boolean93 = shapeList18.equals((java.lang.Object) shapeList55);
        java.lang.Class<?> wildcardClass94 = shapeList55.getClass();
        boolean boolean95 = shapeList0.equals((java.lang.Object) wildcardClass94);
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNull(shape32);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNull(shape37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(shape46);
        org.junit.Assert.assertNull(shape48);
        org.junit.Assert.assertNull(shape50);
        org.junit.Assert.assertNull(shape52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertNull(shape76);
        org.junit.Assert.assertNull(shape78);
        org.junit.Assert.assertNull(shape80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertNotNull(obj84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNull(shape89);
        org.junit.Assert.assertNotNull(obj90);
        org.junit.Assert.assertNull(shape92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(wildcardClass94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 100);
        java.awt.Shape shape9 = shapeList0.getShape((int) '#');
        java.lang.Object obj10 = shapeList0.clone();
        java.lang.Object obj11 = shapeList0.clone();
        java.awt.Shape shape13 = shapeList0.getShape(101);
        java.awt.Shape shape15 = shapeList0.getShape((int) ' ');
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertNull(shape15);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
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
        boolean boolean16 = shapeList10.equals((java.lang.Object) 'a');
        java.lang.Object obj17 = shapeList10.clone();
        int int18 = shapeList10.size();
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        int int20 = shapeList19.size();
        shapeList19.clear();
        java.lang.Object obj22 = shapeList19.clone();
        java.awt.Shape shape24 = shapeList19.getShape(100);
        java.lang.Object obj25 = shapeList19.clone();
        java.lang.Object obj26 = shapeList19.clone();
        boolean boolean27 = shapeList10.equals(obj26);
        boolean boolean28 = shapeList0.equals((java.lang.Object) boolean27);
        java.lang.Object obj29 = shapeList0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(shape24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
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
        boolean boolean16 = shapeList0.equals((java.lang.Object) shapeList15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
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
        java.awt.Shape shape15 = shapeList0.getShape(33);
        java.lang.Object obj16 = shapeList0.clone();
        java.awt.Shape shape18 = shapeList0.getShape((int) (short) 1);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(shape18);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
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
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj22 = shapeList21.clone();
        shapeList21.clear();
        java.awt.Shape shape25 = shapeList21.getShape((int) (short) 1);
        boolean boolean27 = shapeList21.equals((java.lang.Object) (short) -1);
        java.lang.Object obj28 = null;
        boolean boolean29 = shapeList21.equals(obj28);
        org.jfree.chart.util.ShapeList shapeList30 = new org.jfree.chart.util.ShapeList();
        boolean boolean32 = shapeList30.equals((java.lang.Object) (short) 1);
        boolean boolean34 = shapeList30.equals((java.lang.Object) 1.0d);
        java.lang.Object obj35 = shapeList30.clone();
        boolean boolean36 = shapeList21.equals(obj35);
        org.jfree.chart.util.ShapeList shapeList37 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj38 = shapeList37.clone();
        shapeList37.clear();
        java.awt.Shape shape41 = shapeList37.getShape((int) (short) 1);
        java.lang.Object obj42 = shapeList37.clone();
        org.jfree.chart.util.ShapeList shapeList43 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj44 = shapeList43.clone();
        shapeList43.clear();
        java.awt.Shape shape47 = shapeList43.getShape((int) (short) 1);
        boolean boolean49 = shapeList43.equals((java.lang.Object) (short) -1);
        java.lang.Object obj50 = null;
        boolean boolean51 = shapeList43.equals(obj50);
        int int52 = shapeList43.size();
        boolean boolean53 = shapeList37.equals((java.lang.Object) shapeList43);
        boolean boolean54 = shapeList21.equals((java.lang.Object) shapeList43);
        java.lang.Class<?> wildcardClass55 = shapeList21.getClass();
        boolean boolean56 = shapeList0.equals((java.lang.Object) wildcardClass55);
        java.awt.Shape shape58 = shapeList0.getShape((int) ' ');
        org.jfree.chart.util.ShapeList shapeList59 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj60 = shapeList59.clone();
        shapeList59.clear();
        java.awt.Shape shape63 = shapeList59.getShape((int) (short) 1);
        boolean boolean65 = shapeList59.equals((java.lang.Object) (short) -1);
        java.lang.Object obj66 = null;
        boolean boolean67 = shapeList59.equals(obj66);
        int int68 = shapeList59.size();
        java.lang.Object obj69 = null;
        boolean boolean70 = shapeList59.equals(obj69);
        java.awt.Shape shape72 = shapeList59.getShape((int) 'a');
        java.awt.Shape shape74 = shapeList59.getShape((int) '4');
        shapeList59.clear();
        shapeList59.clear();
        boolean boolean77 = shapeList0.equals((java.lang.Object) shapeList59);
        shapeList59.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNull(shape41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNull(shape47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(shape58);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNull(shape63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(shape72);
        org.junit.Assert.assertNull(shape74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
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
        java.awt.Shape shape18 = shapeList0.getShape(8);
        shapeList0.clear();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertNull(shape18);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
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
        org.jfree.chart.util.ShapeList shapeList31 = new org.jfree.chart.util.ShapeList();
        shapeList31.clear();
        java.lang.Object obj33 = shapeList31.clone();
        java.lang.Object obj34 = shapeList31.clone();
        org.jfree.chart.util.ShapeList shapeList35 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj36 = shapeList35.clone();
        shapeList35.clear();
        java.awt.Shape shape39 = shapeList35.getShape((int) ' ');
        java.lang.Object obj40 = shapeList35.clone();
        shapeList35.clear();
        boolean boolean42 = shapeList31.equals((java.lang.Object) shapeList35);
        java.awt.Shape shape44 = shapeList31.getShape(10);
        java.lang.Object obj45 = shapeList31.clone();
        boolean boolean46 = shapeList0.equals((java.lang.Object) shapeList31);
        int int47 = shapeList0.size();
        shapeList0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(shape30);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNull(shape39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(shape44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
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
        int int33 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList34 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj35 = shapeList34.clone();
        java.lang.Object obj36 = shapeList34.clone();
        java.awt.Shape shape38 = shapeList34.getShape(1);
        shapeList34.clear();
        shapeList34.clear();
        shapeList34.clear();
        org.jfree.chart.util.ShapeList shapeList42 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj43 = shapeList42.clone();
        java.lang.Object obj44 = shapeList42.clone();
        org.jfree.chart.util.ShapeList shapeList45 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj46 = shapeList45.clone();
        shapeList45.clear();
        java.awt.Shape shape49 = shapeList45.getShape((int) (short) 1);
        shapeList45.clear();
        shapeList45.clear();
        org.jfree.chart.util.ShapeList shapeList52 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj53 = shapeList52.clone();
        shapeList52.clear();
        java.awt.Shape shape56 = shapeList52.getShape((int) (short) 1);
        boolean boolean58 = shapeList52.equals((java.lang.Object) (short) -1);
        org.jfree.chart.util.ShapeList shapeList59 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj60 = shapeList59.clone();
        shapeList59.clear();
        java.awt.Shape shape63 = shapeList59.getShape((int) (short) 1);
        boolean boolean65 = shapeList59.equals((java.lang.Object) 0);
        shapeList59.clear();
        boolean boolean67 = shapeList52.equals((java.lang.Object) shapeList59);
        boolean boolean68 = shapeList45.equals((java.lang.Object) boolean67);
        boolean boolean69 = shapeList42.equals((java.lang.Object) boolean67);
        org.jfree.chart.util.ShapeList shapeList70 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj71 = shapeList70.clone();
        shapeList70.clear();
        shapeList70.clear();
        java.lang.Object obj74 = shapeList70.clone();
        boolean boolean76 = shapeList70.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList77 = new org.jfree.chart.util.ShapeList();
        shapeList77.clear();
        int int79 = shapeList77.size();
        int int80 = shapeList77.size();
        boolean boolean81 = shapeList70.equals((java.lang.Object) int80);
        java.lang.Object obj82 = shapeList70.clone();
        java.lang.Object obj83 = shapeList70.clone();
        shapeList70.clear();
        java.awt.Shape shape86 = shapeList70.getShape((int) (byte) 0);
        boolean boolean87 = shapeList42.equals((java.lang.Object) (byte) 0);
        boolean boolean88 = shapeList34.equals((java.lang.Object) shapeList42);
        boolean boolean89 = shapeList0.equals((java.lang.Object) boolean88);
        java.lang.Object obj90 = shapeList0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNull(shape38);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNull(shape49);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNull(shape56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNull(shape63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(obj82);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertNull(shape86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(obj90);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
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
        org.jfree.chart.util.ShapeList shapeList42 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj43 = shapeList42.clone();
        shapeList42.clear();
        java.awt.Shape shape46 = shapeList42.getShape((int) (short) 1);
        java.lang.Object obj47 = shapeList42.clone();
        org.jfree.chart.util.ShapeList shapeList48 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj49 = shapeList48.clone();
        shapeList48.clear();
        java.awt.Shape shape52 = shapeList48.getShape((int) (short) 1);
        boolean boolean54 = shapeList48.equals((java.lang.Object) (short) -1);
        java.lang.Object obj55 = null;
        boolean boolean56 = shapeList48.equals(obj55);
        int int57 = shapeList48.size();
        boolean boolean58 = shapeList42.equals((java.lang.Object) shapeList48);
        shapeList42.clear();
        java.lang.Object obj60 = shapeList42.clone();
        java.lang.Object obj61 = shapeList42.clone();
        boolean boolean62 = shapeList20.equals((java.lang.Object) shapeList42);
        java.lang.Object obj63 = shapeList20.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(shape39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNull(shape46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNull(shape52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(obj63);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
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
        shapeList0.clear();
        int int16 = shapeList0.size();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
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
        shapeList6.clear();
        shapeList6.clear();
        java.awt.Shape shape27 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList6.setShape((-1), shape27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
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
        java.lang.Object obj12 = shapeList0.clone();
        shapeList0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
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
        shapeList14.clear();
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        shapeList26.clear();
        java.awt.Shape shape29 = shapeList26.getShape((int) (byte) 10);
        org.jfree.chart.util.ShapeList shapeList30 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj31 = shapeList30.clone();
        shapeList30.clear();
        shapeList30.clear();
        java.lang.Object obj34 = shapeList30.clone();
        boolean boolean36 = shapeList30.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList37 = new org.jfree.chart.util.ShapeList();
        shapeList37.clear();
        int int39 = shapeList37.size();
        int int40 = shapeList37.size();
        boolean boolean41 = shapeList30.equals((java.lang.Object) int40);
        boolean boolean42 = shapeList26.equals((java.lang.Object) int40);
        shapeList26.clear();
        java.lang.Object obj44 = shapeList26.clone();
        boolean boolean45 = shapeList14.equals(obj44);
        org.jfree.chart.util.ShapeList shapeList46 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape48 = null;
        shapeList46.setShape(8, shape48);
        int int50 = shapeList46.size();
        shapeList46.clear();
        org.jfree.chart.util.ShapeList shapeList52 = new org.jfree.chart.util.ShapeList();
        shapeList52.clear();
        java.lang.Object obj54 = shapeList52.clone();
        org.jfree.chart.util.ShapeList shapeList55 = new org.jfree.chart.util.ShapeList();
        boolean boolean57 = shapeList55.equals((java.lang.Object) (short) 1);
        boolean boolean59 = shapeList55.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj60 = shapeList55.clone();
        java.awt.Shape shape62 = shapeList55.getShape((int) (short) -1);
        int int63 = shapeList55.size();
        boolean boolean64 = shapeList52.equals((java.lang.Object) int63);
        shapeList52.clear();
        boolean boolean66 = shapeList46.equals((java.lang.Object) shapeList52);
        shapeList52.clear();
        java.lang.Object obj68 = shapeList52.clone();
        java.awt.Shape shape70 = shapeList52.getShape((int) 'a');
        org.jfree.chart.util.ShapeList shapeList71 = new org.jfree.chart.util.ShapeList();
        boolean boolean73 = shapeList71.equals((java.lang.Object) (short) 1);
        boolean boolean75 = shapeList71.equals((java.lang.Object) 1.0d);
        shapeList71.clear();
        boolean boolean77 = shapeList52.equals((java.lang.Object) shapeList71);
        boolean boolean78 = shapeList14.equals((java.lang.Object) shapeList52);
        boolean boolean79 = shapeList0.equals((java.lang.Object) boolean78);
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertNull(shape21);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(shape29);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 9 + "'", int50 == 9);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNull(shape62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertNull(shape70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        java.lang.Object obj3 = shapeList0.clone();
        java.lang.Object obj4 = shapeList0.clone();
        java.awt.Shape shape6 = shapeList0.getShape((int) (short) 0);
        java.lang.Object obj7 = shapeList0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        java.awt.Shape shape5 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape7 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape9 = shapeList0.getShape(11);
        java.awt.Shape shape11 = shapeList0.getShape((int) '#');
        int int12 = shapeList0.size();
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.awt.Shape shape3 = shapeList0.getShape((int) '4');
        java.awt.Shape shape5 = shapeList0.getShape(0);
        java.lang.Object obj6 = shapeList0.clone();
        org.junit.Assert.assertNull(shape3);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
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
        int int15 = shapeList0.size();
        java.awt.Shape shape17 = null;
        shapeList0.setShape((int) (short) 100, shape17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        shapeList0.clear();
        java.lang.Object obj7 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj9 = shapeList8.clone();
        shapeList8.clear();
        shapeList8.clear();
        java.lang.Object obj12 = shapeList8.clone();
        java.lang.Object obj13 = shapeList8.clone();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj15 = shapeList14.clone();
        shapeList14.clear();
        shapeList14.clear();
        java.lang.Object obj18 = shapeList14.clone();
        boolean boolean20 = shapeList14.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        shapeList21.clear();
        int int23 = shapeList21.size();
        int int24 = shapeList21.size();
        boolean boolean25 = shapeList14.equals((java.lang.Object) int24);
        java.lang.Object obj26 = shapeList14.clone();
        boolean boolean27 = shapeList8.equals((java.lang.Object) shapeList14);
        boolean boolean29 = shapeList8.equals((java.lang.Object) (short) 0);
        boolean boolean30 = shapeList0.equals((java.lang.Object) (short) 0);
        int int31 = shapeList0.size();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
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
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj30 = shapeList29.clone();
        shapeList29.clear();
        shapeList29.clear();
        java.awt.Shape shape34 = shapeList29.getShape((int) '#');
        java.awt.Shape shape36 = shapeList29.getShape(1);
        java.awt.Shape shape38 = shapeList29.getShape(100);
        java.awt.Shape shape40 = shapeList29.getShape(0);
        boolean boolean41 = shapeList25.equals((java.lang.Object) shape40);
        int int42 = shapeList25.size();
        java.awt.Shape shape44 = shapeList25.getShape(36);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(shape21);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNull(shape34);
        org.junit.Assert.assertNull(shape36);
        org.junit.Assert.assertNull(shape38);
        org.junit.Assert.assertNull(shape40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(shape44);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        java.awt.Shape shape5 = shapeList0.getShape((int) (byte) 1);
        org.junit.Assert.assertNull(shape5);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
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
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        shapeList21.clear();
        java.lang.Object obj23 = shapeList21.clone();
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        boolean boolean26 = shapeList24.equals((java.lang.Object) (short) 1);
        boolean boolean28 = shapeList24.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj29 = shapeList24.clone();
        java.awt.Shape shape31 = shapeList24.getShape((int) (short) -1);
        int int32 = shapeList24.size();
        boolean boolean33 = shapeList21.equals((java.lang.Object) int32);
        shapeList21.clear();
        java.awt.Shape shape36 = shapeList21.getShape((int) (short) 0);
        shapeList21.clear();
        java.awt.Shape shape39 = shapeList21.getShape(8);
        boolean boolean40 = shapeList0.equals((java.lang.Object) shape39);
        int int41 = shapeList0.size();
        java.awt.Shape shape43 = shapeList0.getShape(33);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNull(shape31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(shape36);
        org.junit.Assert.assertNull(shape39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(shape43);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj8 = shapeList0.clone();
        shapeList0.clear();
        int int10 = shapeList0.size();
        java.lang.Object obj11 = shapeList0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj3 = shapeList0.clone();
        int int4 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj8 = shapeList0.clone();
        java.lang.Object obj9 = shapeList0.clone();
        shapeList0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        java.lang.Object obj5 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape8 = shapeList0.getShape(0);
        int int9 = shapeList0.size();
        int int10 = shapeList0.size();
        int int11 = shapeList0.size();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) -1);
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        int int10 = shapeList0.size();
        shapeList0.clear();
        java.lang.Object obj12 = shapeList0.clone();
        shapeList0.clear();
        java.lang.Object obj14 = shapeList0.clone();
        java.awt.Shape shape16 = shapeList0.getShape((int) (short) 100);
        java.lang.Object obj17 = shapeList0.clone();
        java.awt.Shape shape19 = shapeList0.getShape((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(shape19);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        shapeList0.clear();
        java.awt.Shape shape9 = shapeList0.getShape((int) (short) 100);
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj11 = shapeList10.clone();
        shapeList10.clear();
        java.awt.Shape shape14 = shapeList10.getShape((int) (short) 1);
        boolean boolean16 = shapeList10.equals((java.lang.Object) (short) -1);
        java.lang.Object obj17 = null;
        boolean boolean18 = shapeList10.equals(obj17);
        int int19 = shapeList10.size();
        java.lang.Object obj20 = null;
        boolean boolean21 = shapeList10.equals(obj20);
        java.awt.Shape shape23 = shapeList10.getShape((int) 'a');
        java.awt.Shape shape25 = shapeList10.getShape((int) '4');
        boolean boolean26 = shapeList0.equals((java.lang.Object) '4');
        int int27 = shapeList0.size();
        java.awt.Shape shape29 = shapeList0.getShape((int) (short) 10);
        int int30 = shapeList0.size();
        java.lang.Class<?> wildcardClass31 = shapeList0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(shape29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
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
        int int46 = shapeList40.size();
        shapeList40.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNull(shape32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
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
        java.awt.Shape shape23 = shapeList0.getShape(10);
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
        java.lang.Object obj46 = shapeList30.clone();
        java.awt.Shape shape48 = shapeList30.getShape((int) 'a');
        org.jfree.chart.util.ShapeList shapeList49 = new org.jfree.chart.util.ShapeList();
        boolean boolean51 = shapeList49.equals((java.lang.Object) (short) 1);
        boolean boolean53 = shapeList49.equals((java.lang.Object) 1.0d);
        shapeList49.clear();
        boolean boolean55 = shapeList30.equals((java.lang.Object) shapeList49);
        boolean boolean56 = shapeList0.equals((java.lang.Object) shapeList30);
        java.awt.Shape shape58 = shapeList30.getShape(33);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNull(shape21);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 9 + "'", int28 == 9);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNull(shape40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNull(shape48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(shape58);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        java.lang.Object obj5 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape8 = shapeList0.getShape(0);
        java.lang.Object obj9 = shapeList0.clone();
        int int10 = shapeList0.size();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
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
        java.awt.Shape shape23 = shapeList0.getShape((int) '#');
        java.awt.Shape shape25 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList0.setShape((int) (short) -1, shape25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(shape23);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
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
        int int18 = shapeList7.size();
        java.lang.Object obj19 = shapeList7.clone();
        int int20 = shapeList7.size();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 0);
        java.awt.Shape shape8 = shapeList0.getShape(0);
        shapeList0.clear();
        int int10 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj12 = shapeList11.clone();
        shapeList11.clear();
        shapeList11.clear();
        java.lang.Object obj15 = shapeList11.clone();
        java.lang.Object obj16 = shapeList11.clone();
        shapeList11.clear();
        java.awt.Shape shape19 = shapeList11.getShape(0);
        java.lang.Object obj20 = shapeList11.clone();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        boolean boolean22 = shapeList0.equals((java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = shapeList0.clone();
        java.lang.Object obj24 = shapeList0.clone();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) 100);
        java.lang.Object obj8 = shapeList0.clone();
        java.lang.Object obj9 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj11 = shapeList10.clone();
        shapeList10.clear();
        java.lang.Object obj13 = shapeList10.clone();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj15 = shapeList14.clone();
        shapeList14.clear();
        java.awt.Shape shape18 = shapeList14.getShape((int) (short) 1);
        boolean boolean20 = shapeList14.equals((java.lang.Object) (short) -1);
        boolean boolean21 = shapeList10.equals((java.lang.Object) shapeList14);
        shapeList10.clear();
        boolean boolean23 = shapeList0.equals((java.lang.Object) shapeList10);
        java.lang.Object obj24 = shapeList0.clone();
        shapeList0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) ' ');
        java.lang.Object obj5 = shapeList0.clone();
        int int6 = shapeList0.size();
        int int7 = shapeList0.size();
        java.lang.Object obj8 = shapeList0.clone();
        shapeList0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape2 = null;
        shapeList0.setShape(8, shape2);
        java.awt.Shape shape5 = shapeList0.getShape((int) (byte) 100);
        java.awt.Shape shape7 = null;
        shapeList0.setShape(0, shape7);
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) (short) 0, shape10);
        java.lang.Object obj12 = shapeList0.clone();
        java.awt.Shape shape14 = shapeList0.getShape((int) (byte) -1);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(shape14);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        java.awt.Shape shape6 = shapeList0.getShape((int) (short) 100);
        java.awt.Shape shape8 = shapeList0.getShape((int) (short) 1);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(shape8);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.awt.Shape shape7 = null;
        shapeList0.setShape((int) '#', shape7);
        java.awt.Shape shape10 = shapeList0.getShape((int) (byte) 100);
        int int11 = shapeList0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = shapeList0.clone();
        java.awt.Shape shape9 = shapeList0.getShape((int) (short) -1);
        int int10 = shapeList0.size();
        java.lang.Object obj11 = shapeList0.clone();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
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
        int int25 = shapeList0.size();
        java.awt.Shape shape27 = shapeList0.getShape((int) 'a');
        java.lang.Object obj28 = shapeList0.clone();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(shape21);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(shape27);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = shapeList0.clone();
        java.awt.Shape shape9 = shapeList0.getShape((int) (short) -1);
        org.jfree.chart.util.ShapeList shapeList10 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj11 = shapeList10.clone();
        shapeList10.clear();
        java.lang.Object obj13 = shapeList10.clone();
        org.jfree.chart.util.ShapeList shapeList14 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj15 = shapeList14.clone();
        shapeList14.clear();
        java.awt.Shape shape18 = shapeList14.getShape((int) (short) 1);
        boolean boolean20 = shapeList14.equals((java.lang.Object) (short) -1);
        boolean boolean21 = shapeList10.equals((java.lang.Object) shapeList14);
        java.lang.Object obj22 = shapeList10.clone();
        java.awt.Shape shape24 = shapeList10.getShape(8);
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj26 = shapeList25.clone();
        shapeList25.clear();
        java.awt.Shape shape29 = shapeList25.getShape((int) (short) 1);
        boolean boolean31 = shapeList25.equals((java.lang.Object) (short) -1);
        java.lang.Object obj32 = null;
        boolean boolean33 = shapeList25.equals(obj32);
        int int34 = shapeList25.size();
        java.lang.Object obj35 = null;
        boolean boolean36 = shapeList25.equals(obj35);
        java.awt.Shape shape38 = shapeList25.getShape((int) 'a');
        java.awt.Shape shape40 = shapeList25.getShape((int) '4');
        java.awt.Shape shape42 = shapeList25.getShape((int) '#');
        java.awt.Shape shape44 = shapeList25.getShape((int) (byte) -1);
        java.lang.Object obj45 = shapeList25.clone();
        boolean boolean46 = shapeList10.equals((java.lang.Object) shapeList25);
        java.lang.Object obj47 = shapeList10.clone();
        boolean boolean48 = shapeList0.equals((java.lang.Object) shapeList10);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList50 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj51 = shapeList50.clone();
        org.jfree.chart.util.ShapeList shapeList52 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape54 = null;
        shapeList52.setShape(8, shape54);
        int int56 = shapeList52.size();
        shapeList52.clear();
        org.jfree.chart.util.ShapeList shapeList58 = new org.jfree.chart.util.ShapeList();
        shapeList58.clear();
        java.lang.Object obj60 = shapeList58.clone();
        org.jfree.chart.util.ShapeList shapeList61 = new org.jfree.chart.util.ShapeList();
        boolean boolean63 = shapeList61.equals((java.lang.Object) (short) 1);
        boolean boolean65 = shapeList61.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj66 = shapeList61.clone();
        java.awt.Shape shape68 = shapeList61.getShape((int) (short) -1);
        int int69 = shapeList61.size();
        boolean boolean70 = shapeList58.equals((java.lang.Object) int69);
        shapeList58.clear();
        boolean boolean72 = shapeList52.equals((java.lang.Object) shapeList58);
        shapeList52.clear();
        org.jfree.chart.util.ShapeList shapeList74 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj75 = shapeList74.clone();
        java.lang.Object obj76 = shapeList74.clone();
        java.awt.Shape shape78 = shapeList74.getShape(1);
        int int79 = shapeList74.size();
        java.lang.Class<?> wildcardClass80 = shapeList74.getClass();
        boolean boolean81 = shapeList52.equals((java.lang.Object) wildcardClass80);
        boolean boolean82 = shapeList50.equals((java.lang.Object) wildcardClass80);
        int int83 = shapeList50.size();
        boolean boolean84 = shapeList0.equals((java.lang.Object) shapeList50);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(shape24);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(shape38);
        org.junit.Assert.assertNull(shape40);
        org.junit.Assert.assertNull(shape42);
        org.junit.Assert.assertNull(shape44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 9 + "'", int56 == 9);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertNull(shape68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertNull(shape78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape(1);
        java.awt.Shape shape9 = shapeList0.getShape((int) (byte) 0);
        java.awt.Shape shape11 = shapeList0.getShape((int) (short) 100);
        int int12 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape15 = shapeList0.getShape(100);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(shape15);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
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
        java.awt.Shape shape26 = shapeList0.getShape((int) 'a');
        int int27 = shapeList0.size();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
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
        java.awt.Shape shape20 = shapeList0.getShape(53);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNull(shape20);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
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
        java.lang.Object obj24 = shapeList0.clone();
        org.jfree.chart.util.ShapeList shapeList25 = new org.jfree.chart.util.ShapeList();
        boolean boolean27 = shapeList25.equals((java.lang.Object) (short) 1);
        boolean boolean29 = shapeList25.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj30 = shapeList25.clone();
        java.awt.Shape shape32 = shapeList25.getShape((int) (short) -1);
        boolean boolean34 = shapeList25.equals((java.lang.Object) (-1.0d));
        int int35 = shapeList25.size();
        boolean boolean36 = shapeList0.equals((java.lang.Object) shapeList25);
        int int37 = shapeList0.size();
        shapeList0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNull(shape32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
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
        org.jfree.chart.util.ShapeList shapeList30 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj31 = shapeList30.clone();
        java.lang.Object obj32 = shapeList30.clone();
        java.awt.Shape shape34 = shapeList30.getShape(1);
        shapeList30.clear();
        shapeList30.clear();
        org.jfree.chart.util.ShapeList shapeList37 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj38 = shapeList37.clone();
        shapeList37.clear();
        java.awt.Shape shape41 = shapeList37.getShape((int) (short) 1);
        boolean boolean43 = shapeList37.equals((java.lang.Object) 'a');
        java.lang.Object obj44 = shapeList37.clone();
        boolean boolean45 = shapeList30.equals(obj44);
        org.jfree.chart.util.ShapeList shapeList46 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj47 = shapeList46.clone();
        shapeList46.clear();
        java.awt.Shape shape50 = shapeList46.getShape((int) (short) 1);
        java.lang.Object obj51 = shapeList46.clone();
        boolean boolean52 = shapeList30.equals((java.lang.Object) shapeList46);
        int int53 = shapeList30.size();
        int int54 = shapeList30.size();
        org.jfree.chart.util.ShapeList shapeList55 = new org.jfree.chart.util.ShapeList();
        boolean boolean57 = shapeList55.equals((java.lang.Object) (short) 1);
        boolean boolean59 = shapeList55.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj60 = shapeList55.clone();
        java.awt.Shape shape62 = shapeList55.getShape((int) (short) -1);
        int int63 = shapeList55.size();
        int int64 = shapeList55.size();
        int int65 = shapeList55.size();
        boolean boolean66 = shapeList30.equals((java.lang.Object) shapeList55);
        org.jfree.chart.util.ShapeList shapeList67 = new org.jfree.chart.util.ShapeList();
        shapeList67.clear();
        int int69 = shapeList67.size();
        shapeList67.clear();
        boolean boolean71 = shapeList55.equals((java.lang.Object) shapeList67);
        java.lang.Object obj72 = shapeList67.clone();
        boolean boolean73 = shapeList0.equals(obj72);
        java.lang.Class<?> wildcardClass74 = obj72.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNull(shape34);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNull(shape41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNull(shape50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNull(shape62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        java.awt.Shape shape7 = shapeList0.getShape((int) (short) -1);
        int int8 = shapeList0.size();
        int int9 = shapeList0.size();
        int int10 = shapeList0.size();
        java.awt.Shape shape12 = shapeList0.getShape((int) '#');
        java.lang.Object obj13 = shapeList0.clone();
        java.awt.Shape shape15 = shapeList0.getShape(34);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(shape15);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
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
        int int42 = shapeList20.size();
        int int43 = shapeList20.size();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(shape39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList9 = new org.jfree.chart.util.ShapeList();
        boolean boolean11 = shapeList9.equals((java.lang.Object) (short) 1);
        boolean boolean13 = shapeList9.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj14 = shapeList9.clone();
        java.awt.Shape shape16 = shapeList9.getShape((int) (short) -1);
        int int17 = shapeList9.size();
        int int18 = shapeList9.size();
        int int19 = shapeList9.size();
        java.awt.Shape shape21 = shapeList9.getShape((int) '#');
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
        java.awt.Shape shape36 = shapeList22.getShape(9);
        int int37 = shapeList22.size();
        java.lang.Object obj38 = shapeList22.clone();
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        boolean boolean40 = shapeList9.equals((java.lang.Object) wildcardClass39);
        int int41 = shapeList9.size();
        java.lang.Object obj42 = shapeList9.clone();
        boolean boolean43 = shapeList0.equals(obj42);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(shape21);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNull(shape32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(shape36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
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
        java.lang.Class<?> wildcardClass15 = shapeList0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) 1.0d);
        java.awt.Shape shape6 = null;
        shapeList0.setShape(33, shape6);
        int int8 = shapeList0.size();
        java.awt.Shape shape10 = null;
        shapeList0.setShape((int) 'a', shape10);
        java.awt.Shape shape13 = null;
        shapeList0.setShape(11, shape13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape(0, shape6);
        shapeList0.clear();
        java.lang.Object obj9 = shapeList0.clone();
        java.awt.Shape shape11 = shapeList0.getShape(0);
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(shape11);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
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
        shapeList6.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.lang.Object obj6 = shapeList0.clone();
        java.lang.Object obj7 = shapeList0.clone();
        java.awt.Shape shape9 = shapeList0.getShape(1);
        java.awt.Shape shape11 = shapeList0.getShape((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertNull(shape11);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
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
        org.jfree.chart.util.ShapeList shapeList28 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj29 = shapeList28.clone();
        shapeList28.clear();
        java.awt.Shape shape32 = shapeList28.getShape((int) (short) 1);
        boolean boolean34 = shapeList28.equals((java.lang.Object) (short) -1);
        boolean boolean36 = shapeList28.equals((java.lang.Object) 100.0f);
        int int37 = shapeList28.size();
        java.lang.Object obj38 = shapeList28.clone();
        boolean boolean39 = shapeList0.equals((java.lang.Object) shapeList28);
        int int40 = shapeList28.size();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertNull(shape24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNull(shape32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        int int3 = shapeList0.size();
        java.lang.Object obj4 = shapeList0.clone();
        java.lang.Object obj5 = shapeList0.clone();
        java.lang.Object obj6 = null;
        boolean boolean7 = shapeList0.equals(obj6);
        org.jfree.chart.util.ShapeList shapeList8 = new org.jfree.chart.util.ShapeList();
        boolean boolean10 = shapeList8.equals((java.lang.Object) (short) 1);
        boolean boolean12 = shapeList8.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj13 = shapeList8.clone();
        int int14 = shapeList8.size();
        boolean boolean15 = shapeList0.equals((java.lang.Object) shapeList8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        java.lang.Object obj2 = shapeList0.clone();
        java.awt.Shape shape4 = shapeList0.getShape(1);
        shapeList0.clear();
        shapeList0.clear();
        shapeList0.clear();
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
        org.jfree.chart.util.ShapeList shapeList24 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj25 = shapeList24.clone();
        shapeList24.clear();
        java.awt.Shape shape28 = shapeList24.getShape((int) (short) 1);
        java.lang.Object obj29 = shapeList24.clone();
        boolean boolean30 = shapeList8.equals((java.lang.Object) shapeList24);
        org.jfree.chart.util.ShapeList shapeList31 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj32 = shapeList31.clone();
        shapeList31.clear();
        java.awt.Shape shape35 = shapeList31.getShape((int) (short) 1);
        boolean boolean37 = shapeList31.equals((java.lang.Object) (short) -1);
        java.lang.Object obj38 = shapeList31.clone();
        java.awt.Shape shape40 = shapeList31.getShape((int) (short) -1);
        org.jfree.chart.util.ShapeList shapeList41 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj42 = shapeList41.clone();
        shapeList41.clear();
        java.lang.Object obj44 = shapeList41.clone();
        org.jfree.chart.util.ShapeList shapeList45 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj46 = shapeList45.clone();
        shapeList45.clear();
        java.awt.Shape shape49 = shapeList45.getShape((int) (short) 1);
        boolean boolean51 = shapeList45.equals((java.lang.Object) (short) -1);
        boolean boolean52 = shapeList41.equals((java.lang.Object) shapeList45);
        java.lang.Object obj53 = shapeList41.clone();
        java.awt.Shape shape55 = shapeList41.getShape(8);
        org.jfree.chart.util.ShapeList shapeList56 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj57 = shapeList56.clone();
        shapeList56.clear();
        java.awt.Shape shape60 = shapeList56.getShape((int) (short) 1);
        boolean boolean62 = shapeList56.equals((java.lang.Object) (short) -1);
        java.lang.Object obj63 = null;
        boolean boolean64 = shapeList56.equals(obj63);
        int int65 = shapeList56.size();
        java.lang.Object obj66 = null;
        boolean boolean67 = shapeList56.equals(obj66);
        java.awt.Shape shape69 = shapeList56.getShape((int) 'a');
        java.awt.Shape shape71 = shapeList56.getShape((int) '4');
        java.awt.Shape shape73 = shapeList56.getShape((int) '#');
        java.awt.Shape shape75 = shapeList56.getShape((int) (byte) -1);
        java.lang.Object obj76 = shapeList56.clone();
        boolean boolean77 = shapeList41.equals((java.lang.Object) shapeList56);
        java.lang.Object obj78 = shapeList41.clone();
        boolean boolean79 = shapeList31.equals((java.lang.Object) shapeList41);
        shapeList31.clear();
        java.lang.Object obj81 = shapeList31.clone();
        boolean boolean82 = shapeList24.equals((java.lang.Object) shapeList31);
        boolean boolean83 = shapeList0.equals((java.lang.Object) shapeList31);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNull(shape28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNull(shape35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNull(shape40);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNull(shape49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNull(shape55);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNull(shape60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(shape69);
        org.junit.Assert.assertNull(shape71);
        org.junit.Assert.assertNull(shape73);
        org.junit.Assert.assertNull(shape75);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        java.lang.Object obj2 = shapeList0.clone();
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1));
        int int5 = shapeList0.size();
        java.awt.Shape shape7 = shapeList0.getShape((int) (byte) -1);
        java.awt.Shape shape9 = shapeList0.getShape((int) (short) 0);
        java.awt.Shape shape11 = shapeList0.getShape(53);
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
        java.awt.Shape shape25 = shapeList12.getShape((int) 'a');
        java.awt.Shape shape27 = shapeList12.getShape((int) '4');
        java.lang.Object obj28 = shapeList12.clone();
        org.jfree.chart.util.ShapeList shapeList29 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj30 = shapeList29.clone();
        shapeList29.clear();
        java.awt.Shape shape33 = shapeList29.getShape((int) (short) 1);
        boolean boolean35 = shapeList29.equals((java.lang.Object) (short) -1);
        java.lang.Object obj36 = null;
        boolean boolean37 = shapeList29.equals(obj36);
        int int38 = shapeList29.size();
        java.lang.Object obj39 = null;
        boolean boolean40 = shapeList29.equals(obj39);
        java.awt.Shape shape42 = shapeList29.getShape((int) 'a');
        int int43 = shapeList29.size();
        boolean boolean44 = shapeList12.equals((java.lang.Object) int43);
        boolean boolean45 = shapeList0.equals((java.lang.Object) boolean44);
        java.lang.Object obj46 = shapeList0.clone();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertNull(shape27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNull(shape33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(shape42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(obj46);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 0);
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape10 = shapeList0.getShape(101);
        java.awt.Shape shape12 = shapeList0.getShape((int) (short) 0);
        shapeList0.clear();
        java.awt.Shape shape15 = shapeList0.getShape((int) 'a');
        java.awt.Shape shape17 = shapeList0.getShape((int) (short) 0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertNull(shape17);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
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
        shapeList40.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(shape24);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNull(shape31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNull(shape38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNull(shape50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
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
        java.lang.Class<?> wildcardClass29 = shapeList0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) 0);
        java.lang.Object obj7 = shapeList0.clone();
        boolean boolean9 = shapeList0.equals((java.lang.Object) false);
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj12 = shapeList11.clone();
        shapeList11.clear();
        shapeList11.clear();
        java.awt.Shape shape16 = shapeList11.getShape((int) '#');
        shapeList11.clear();
        java.lang.Object obj18 = shapeList11.clone();
        java.awt.Shape shape20 = shapeList11.getShape(10);
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj22 = shapeList21.clone();
        shapeList21.clear();
        java.awt.Shape shape25 = shapeList21.getShape((int) (short) 1);
        boolean boolean27 = shapeList21.equals((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass28 = shapeList21.getClass();
        boolean boolean29 = shapeList11.equals((java.lang.Object) wildcardClass28);
        shapeList11.clear();
        boolean boolean31 = shapeList0.equals((java.lang.Object) shapeList11);
        org.jfree.chart.util.ShapeList shapeList32 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj33 = shapeList32.clone();
        shapeList32.clear();
        shapeList32.clear();
        java.lang.Object obj36 = shapeList32.clone();
        java.lang.Object obj37 = null;
        boolean boolean38 = shapeList32.equals(obj37);
        boolean boolean40 = shapeList32.equals((java.lang.Object) 0.0f);
        int int41 = shapeList32.size();
        java.lang.Object obj42 = shapeList32.clone();
        int int43 = shapeList32.size();
        shapeList32.clear();
        java.lang.Object obj45 = shapeList32.clone();
        org.jfree.chart.util.ShapeList shapeList46 = new org.jfree.chart.util.ShapeList();
        boolean boolean48 = shapeList46.equals((java.lang.Object) (short) 1);
        boolean boolean50 = shapeList46.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj51 = shapeList46.clone();
        java.awt.Shape shape53 = shapeList46.getShape((int) (short) -1);
        int int54 = shapeList46.size();
        int int55 = shapeList46.size();
        int int56 = shapeList46.size();
        java.awt.Shape shape58 = shapeList46.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList59 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj60 = shapeList59.clone();
        shapeList59.clear();
        java.lang.Object obj62 = shapeList59.clone();
        int int63 = shapeList59.size();
        java.lang.Object obj64 = shapeList59.clone();
        shapeList59.clear();
        org.jfree.chart.util.ShapeList shapeList66 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj67 = shapeList66.clone();
        shapeList66.clear();
        java.awt.Shape shape70 = shapeList66.getShape((int) (short) 1);
        boolean boolean72 = shapeList66.equals((java.lang.Object) 'a');
        java.lang.Object obj73 = shapeList66.clone();
        java.lang.Object obj74 = shapeList66.clone();
        boolean boolean75 = shapeList59.equals((java.lang.Object) shapeList66);
        boolean boolean76 = shapeList46.equals((java.lang.Object) boolean75);
        java.lang.Object obj77 = shapeList46.clone();
        boolean boolean78 = shapeList32.equals((java.lang.Object) shapeList46);
        boolean boolean79 = shapeList11.equals((java.lang.Object) shapeList46);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNull(shape53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNull(shape58);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertNull(shape70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(obj77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
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
        org.jfree.chart.util.ShapeList shapeList34 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj35 = shapeList34.clone();
        shapeList34.clear();
        java.awt.Shape shape38 = shapeList34.getShape((int) (short) 1);
        boolean boolean40 = shapeList34.equals((java.lang.Object) (short) -1);
        shapeList34.clear();
        shapeList34.clear();
        java.lang.Object obj43 = shapeList34.clone();
        org.jfree.chart.util.ShapeList shapeList44 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj45 = shapeList44.clone();
        shapeList44.clear();
        java.awt.Shape shape48 = shapeList44.getShape((int) (short) 1);
        boolean boolean50 = shapeList44.equals((java.lang.Object) 0L);
        boolean boolean51 = shapeList34.equals((java.lang.Object) 0L);
        shapeList34.clear();
        boolean boolean53 = shapeList0.equals((java.lang.Object) shapeList34);
        org.jfree.chart.util.ShapeList shapeList54 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj55 = shapeList54.clone();
        shapeList54.clear();
        java.awt.Shape shape58 = shapeList54.getShape((int) (short) 1);
        boolean boolean60 = shapeList54.equals((java.lang.Object) (short) -1);
        java.lang.Object obj61 = null;
        boolean boolean62 = shapeList54.equals(obj61);
        shapeList54.clear();
        int int64 = shapeList54.size();
        java.awt.Shape shape66 = shapeList54.getShape(53);
        boolean boolean67 = shapeList0.equals((java.lang.Object) shape66);
        int int68 = shapeList0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(shape27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(shape33);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNull(shape38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNull(shape48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNull(shape58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNull(shape66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
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
        java.awt.Shape shape15 = shapeList0.getShape((int) (byte) 10);
        shapeList0.clear();
        int int17 = shapeList0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        int int1 = shapeList0.size();
        shapeList0.clear();
        java.awt.Shape shape4 = null;
        shapeList0.setShape((int) (short) 100, shape4);
        java.lang.Object obj6 = shapeList0.clone();
        java.lang.Object obj7 = shapeList0.clone();
        java.awt.Shape shape9 = shapeList0.getShape(1);
        int int10 = shapeList0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        boolean boolean6 = shapeList0.equals((java.lang.Object) (short) -1);
        java.lang.Object obj7 = shapeList0.clone();
        java.lang.Object obj8 = shapeList0.clone();
        java.lang.Object obj9 = shapeList0.clone();
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        shapeList11.clear();
        int int13 = shapeList11.size();
        java.awt.Shape shape15 = shapeList11.getShape((-1));
        java.lang.Object obj16 = shapeList11.clone();
        boolean boolean17 = shapeList0.equals(obj16);
        java.awt.Shape shape19 = shapeList0.getShape((int) (short) 10);
        java.lang.Object obj20 = null;
        boolean boolean21 = shapeList0.equals(obj20);
        org.jfree.chart.util.ShapeList shapeList22 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj23 = shapeList22.clone();
        shapeList22.clear();
        java.lang.Object obj25 = shapeList22.clone();
        int int26 = shapeList22.size();
        java.lang.Object obj27 = shapeList22.clone();
        shapeList22.clear();
        shapeList22.clear();
        org.jfree.chart.util.ShapeList shapeList30 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj31 = shapeList30.clone();
        shapeList30.clear();
        shapeList30.clear();
        java.awt.Shape shape35 = shapeList30.getShape((int) '#');
        java.awt.Shape shape37 = shapeList30.getShape(1);
        java.awt.Shape shape39 = shapeList30.getShape((int) (byte) 0);
        boolean boolean40 = shapeList22.equals((java.lang.Object) shapeList30);
        shapeList30.clear();
        org.jfree.chart.util.ShapeList shapeList42 = new org.jfree.chart.util.ShapeList();
        shapeList42.clear();
        java.awt.Shape shape45 = shapeList42.getShape((int) (byte) 10);
        org.jfree.chart.util.ShapeList shapeList46 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj47 = shapeList46.clone();
        shapeList46.clear();
        shapeList46.clear();
        java.lang.Object obj50 = shapeList46.clone();
        boolean boolean52 = shapeList46.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList53 = new org.jfree.chart.util.ShapeList();
        shapeList53.clear();
        int int55 = shapeList53.size();
        int int56 = shapeList53.size();
        boolean boolean57 = shapeList46.equals((java.lang.Object) int56);
        boolean boolean58 = shapeList42.equals((java.lang.Object) int56);
        shapeList42.clear();
        java.lang.Object obj60 = shapeList42.clone();
        boolean boolean61 = shapeList30.equals(obj60);
        org.jfree.chart.util.ShapeList shapeList62 = new org.jfree.chart.util.ShapeList();
        shapeList62.clear();
        java.lang.Object obj64 = shapeList62.clone();
        org.jfree.chart.util.ShapeList shapeList65 = new org.jfree.chart.util.ShapeList();
        boolean boolean67 = shapeList65.equals((java.lang.Object) (short) 1);
        boolean boolean69 = shapeList65.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj70 = shapeList65.clone();
        java.awt.Shape shape72 = shapeList65.getShape((int) (short) -1);
        int int73 = shapeList65.size();
        boolean boolean74 = shapeList62.equals((java.lang.Object) int73);
        java.lang.Object obj75 = shapeList62.clone();
        java.lang.Class<?> wildcardClass76 = obj75.getClass();
        boolean boolean77 = shapeList30.equals(obj75);
        boolean boolean78 = shapeList0.equals((java.lang.Object) shapeList30);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNull(shape35);
        org.junit.Assert.assertNull(shape37);
        org.junit.Assert.assertNull(shape39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(shape45);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertNull(shape72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
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
        java.awt.Shape shape19 = shapeList0.getShape((int) (short) 0);
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj21 = shapeList20.clone();
        shapeList20.clear();
        java.awt.Shape shape24 = shapeList20.getShape((int) (short) 1);
        java.lang.Object obj25 = shapeList20.clone();
        java.awt.Shape shape27 = shapeList20.getShape((int) (short) 100);
        java.awt.Shape shape29 = shapeList20.getShape((int) '#');
        java.lang.Object obj30 = shapeList20.clone();
        boolean boolean31 = shapeList0.equals(obj30);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(shape24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNull(shape27);
        org.junit.Assert.assertNull(shape29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
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
        shapeList0.clear();
        java.awt.Shape shape32 = shapeList0.getShape((int) (byte) 100);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(shape32);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
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
        int int19 = shapeList0.size();
        int int20 = shapeList0.size();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
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
        org.jfree.chart.util.ShapeList shapeList20 = new org.jfree.chart.util.ShapeList();
        boolean boolean22 = shapeList20.equals((java.lang.Object) (short) 1);
        boolean boolean24 = shapeList20.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj25 = shapeList20.clone();
        java.awt.Shape shape27 = shapeList20.getShape((int) (short) -1);
        int int28 = shapeList20.size();
        int int29 = shapeList20.size();
        int int30 = shapeList20.size();
        java.awt.Shape shape32 = shapeList20.getShape((int) '#');
        org.jfree.chart.util.ShapeList shapeList33 = new org.jfree.chart.util.ShapeList();
        shapeList33.clear();
        java.lang.Object obj35 = shapeList33.clone();
        org.jfree.chart.util.ShapeList shapeList36 = new org.jfree.chart.util.ShapeList();
        boolean boolean38 = shapeList36.equals((java.lang.Object) (short) 1);
        boolean boolean40 = shapeList36.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj41 = shapeList36.clone();
        java.awt.Shape shape43 = shapeList36.getShape((int) (short) -1);
        int int44 = shapeList36.size();
        boolean boolean45 = shapeList33.equals((java.lang.Object) int44);
        java.awt.Shape shape47 = shapeList33.getShape(9);
        int int48 = shapeList33.size();
        java.lang.Object obj49 = shapeList33.clone();
        java.lang.Class<?> wildcardClass50 = obj49.getClass();
        boolean boolean51 = shapeList20.equals((java.lang.Object) wildcardClass50);
        int int52 = shapeList20.size();
        boolean boolean53 = shapeList8.equals((java.lang.Object) shapeList20);
        shapeList8.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNull(shape27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(shape32);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNull(shape43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(shape47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
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
        java.awt.Shape shape17 = shapeList0.getShape((int) 'a');
        shapeList0.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(shape17);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
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
        java.lang.Object obj61 = shapeList40.clone();
        org.jfree.chart.util.ShapeList shapeList62 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj63 = shapeList62.clone();
        shapeList62.clear();
        java.awt.Shape shape66 = shapeList62.getShape((int) (short) 1);
        java.lang.Object obj67 = shapeList62.clone();
        java.awt.Shape shape69 = shapeList62.getShape((int) (short) 100);
        java.lang.Object obj70 = shapeList62.clone();
        java.lang.Object obj71 = shapeList62.clone();
        java.lang.Object obj72 = shapeList62.clone();
        org.jfree.chart.util.ShapeList shapeList73 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj74 = shapeList73.clone();
        shapeList73.clear();
        java.lang.Object obj76 = shapeList73.clone();
        org.jfree.chart.util.ShapeList shapeList77 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj78 = shapeList77.clone();
        shapeList77.clear();
        java.awt.Shape shape81 = shapeList77.getShape((int) (short) 1);
        boolean boolean83 = shapeList77.equals((java.lang.Object) (short) -1);
        boolean boolean84 = shapeList73.equals((java.lang.Object) shapeList77);
        java.lang.Object obj85 = shapeList73.clone();
        boolean boolean86 = shapeList62.equals(obj85);
        boolean boolean87 = shapeList40.equals((java.lang.Object) shapeList62);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNull(shape32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(shape53);
        org.junit.Assert.assertNull(shape58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertNull(shape66);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertNull(shape69);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertNotNull(obj78);
        org.junit.Assert.assertNull(shape81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(obj85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.awt.Shape shape6 = null;
        shapeList0.setShape((int) (byte) 0, shape6);
        int int8 = shapeList0.size();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape12 = null;
        shapeList0.setShape(98, shape12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
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
        shapeList0.clear();
        boolean boolean27 = shapeList0.equals((java.lang.Object) (short) 10);
        java.awt.Shape shape29 = shapeList0.getShape(0);
        int int30 = shapeList0.size();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(shape29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.lang.Object obj4 = shapeList0.clone();
        boolean boolean6 = shapeList0.equals((java.lang.Object) ' ');
        org.jfree.chart.util.ShapeList shapeList7 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj8 = shapeList7.clone();
        shapeList7.clear();
        java.awt.Shape shape11 = shapeList7.getShape((int) (short) 1);
        java.lang.Object obj12 = shapeList7.clone();
        org.jfree.chart.util.ShapeList shapeList13 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj14 = shapeList13.clone();
        shapeList13.clear();
        java.awt.Shape shape17 = shapeList13.getShape((int) (short) 1);
        boolean boolean19 = shapeList13.equals((java.lang.Object) (short) -1);
        java.lang.Object obj20 = null;
        boolean boolean21 = shapeList13.equals(obj20);
        int int22 = shapeList13.size();
        boolean boolean23 = shapeList7.equals((java.lang.Object) shapeList13);
        java.awt.Shape shape25 = shapeList7.getShape(100);
        boolean boolean27 = shapeList7.equals((java.lang.Object) false);
        shapeList7.clear();
        boolean boolean29 = shapeList0.equals((java.lang.Object) shapeList7);
        int int30 = shapeList7.size();
        java.lang.Class<?> wildcardClass31 = shapeList7.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
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
        org.jfree.chart.util.ShapeList shapeList19 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj20 = shapeList19.clone();
        shapeList19.clear();
        java.awt.Shape shape23 = shapeList19.getShape((int) (short) 1);
        boolean boolean25 = shapeList19.equals((java.lang.Object) 'a');
        java.lang.Object obj26 = shapeList19.clone();
        org.jfree.chart.util.ShapeList shapeList27 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj28 = shapeList27.clone();
        java.lang.Object obj29 = shapeList27.clone();
        java.awt.Shape shape31 = shapeList27.getShape(1);
        shapeList27.clear();
        shapeList27.clear();
        org.jfree.chart.util.ShapeList shapeList34 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj35 = shapeList34.clone();
        shapeList34.clear();
        java.awt.Shape shape38 = shapeList34.getShape((int) (short) 1);
        boolean boolean40 = shapeList34.equals((java.lang.Object) 'a');
        java.lang.Object obj41 = shapeList34.clone();
        boolean boolean42 = shapeList27.equals(obj41);
        boolean boolean43 = shapeList19.equals((java.lang.Object) shapeList27);
        shapeList19.clear();
        java.lang.Object obj45 = shapeList19.clone();
        boolean boolean46 = shapeList0.equals(obj45);
        shapeList0.clear();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNull(shape31);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNull(shape38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        java.awt.Shape shape5 = shapeList0.getShape((int) '#');
        java.awt.Shape shape7 = shapeList0.getShape(1);
        java.awt.Shape shape9 = shapeList0.getShape((int) ' ');
        java.lang.Object obj10 = shapeList0.clone();
        java.awt.Shape shape12 = shapeList0.getShape((int) '#');
        shapeList0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(shape12);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
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
        int int38 = shapeList22.size();
        int int39 = shapeList22.size();
        org.jfree.chart.util.ShapeList shapeList40 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj41 = shapeList40.clone();
        shapeList40.clear();
        java.awt.Shape shape44 = shapeList40.getShape((int) (short) 1);
        boolean boolean46 = shapeList40.equals((java.lang.Object) (short) -1);
        shapeList40.clear();
        shapeList40.clear();
        java.lang.Object obj49 = shapeList40.clone();
        java.awt.Shape shape51 = shapeList40.getShape(1);
        shapeList40.clear();
        java.lang.Object obj53 = shapeList40.clone();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        boolean boolean55 = shapeList22.equals((java.lang.Object) wildcardClass54);
        shapeList22.clear();
        int int57 = shapeList22.size();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(shape35);
        org.junit.Assert.assertNull(shape37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNull(shape44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNull(shape51);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj1 = shapeList0.clone();
        shapeList0.clear();
        java.awt.Shape shape4 = shapeList0.getShape((int) (short) 1);
        java.lang.Object obj5 = shapeList0.clone();
        java.lang.Object obj6 = shapeList0.clone();
        shapeList0.clear();
        shapeList0.clear();
        int int9 = shapeList0.size();
        int int10 = shapeList0.size();
        org.jfree.chart.util.ShapeList shapeList11 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj12 = shapeList11.clone();
        shapeList11.clear();
        shapeList11.clear();
        java.lang.Object obj15 = shapeList11.clone();
        boolean boolean17 = shapeList11.equals((java.lang.Object) ' ');
        int int18 = shapeList11.size();
        int int19 = shapeList11.size();
        java.lang.Object obj20 = shapeList11.clone();
        boolean boolean21 = shapeList0.equals(obj20);
        java.lang.Class<?> wildcardClass22 = shapeList0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
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
        java.lang.Object obj28 = shapeList0.clone();
        java.lang.Object obj29 = shapeList0.clone();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(shape27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
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
        java.lang.Object obj17 = shapeList0.clone();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
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
        int int29 = shapeList28.size();
        shapeList28.clear();
        java.lang.Object obj31 = shapeList28.clone();
        java.awt.Shape shape33 = shapeList28.getShape((int) (short) -1);
        shapeList28.clear();
        org.jfree.chart.util.ShapeList shapeList35 = new org.jfree.chart.util.ShapeList();
        boolean boolean37 = shapeList35.equals((java.lang.Object) (short) 1);
        boolean boolean39 = shapeList35.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj40 = shapeList35.clone();
        java.awt.Shape shape42 = shapeList35.getShape((int) (short) -1);
        int int43 = shapeList35.size();
        int int44 = shapeList35.size();
        int int45 = shapeList35.size();
        java.awt.Shape shape47 = shapeList35.getShape((int) '#');
        int int48 = shapeList35.size();
        java.lang.Object obj49 = shapeList35.clone();
        int int50 = shapeList35.size();
        shapeList35.clear();
        java.lang.Object obj52 = shapeList35.clone();
        boolean boolean53 = shapeList28.equals(obj52);
        boolean boolean54 = shapeList8.equals(obj52);
        java.lang.Object obj55 = shapeList8.clone();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(shape21);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNull(shape33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNull(shape42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(shape47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(obj55);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
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
        shapeList0.clear();
        org.jfree.chart.util.ShapeList shapeList21 = new org.jfree.chart.util.ShapeList();
        boolean boolean23 = shapeList21.equals((java.lang.Object) (short) 1);
        java.awt.Shape shape25 = shapeList21.getShape((int) (short) 0);
        boolean boolean26 = shapeList0.equals((java.lang.Object) shapeList21);
        java.lang.Object obj27 = shapeList21.clone();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
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
        java.awt.Shape shape13 = shapeList0.getShape(101);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(shape13);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
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
        java.lang.Object obj24 = shapeList0.clone();
        java.lang.Object obj25 = shapeList0.clone();
        java.lang.Object obj26 = shapeList0.clone();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        shapeList0.clear();
        shapeList0.clear();
        int int3 = shapeList0.size();
        java.awt.Shape shape5 = null;
        shapeList0.setShape((int) (byte) 100, shape5);
        shapeList0.clear();
        java.lang.Class<?> wildcardClass8 = shapeList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
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
        java.lang.Object obj33 = shapeList14.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(shape9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNull(shape31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
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
        int int59 = shapeList0.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(shape37);
        org.junit.Assert.assertNull(shape39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(shape42);
        org.junit.Assert.assertNull(shape48);
        org.junit.Assert.assertNull(shape50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
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
        shapeList6.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(shape16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
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
        shapeList0.clear();
        shapeList0.clear();
        int int42 = shapeList0.size();
        int int43 = shapeList0.size();
        shapeList0.clear();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNull(shape22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNull(shape31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNull(shape34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        boolean boolean2 = shapeList0.equals((java.lang.Object) (short) 1);
        boolean boolean4 = shapeList0.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = shapeList0.clone();
        int int6 = shapeList0.size();
        java.lang.Object obj7 = null;
        boolean boolean8 = shapeList0.equals(obj7);
        java.awt.Shape shape10 = shapeList0.getShape(11);
        java.awt.Shape shape12 = shapeList0.getShape((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertNull(shape12);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
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
        shapeList0.clear();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
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
        org.jfree.chart.util.ShapeList shapeList45 = new org.jfree.chart.util.ShapeList();
        shapeList45.clear();
        java.lang.Object obj47 = shapeList45.clone();
        org.jfree.chart.util.ShapeList shapeList48 = new org.jfree.chart.util.ShapeList();
        boolean boolean50 = shapeList48.equals((java.lang.Object) (short) 1);
        boolean boolean52 = shapeList48.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj53 = shapeList48.clone();
        java.awt.Shape shape55 = shapeList48.getShape((int) (short) -1);
        int int56 = shapeList48.size();
        boolean boolean57 = shapeList45.equals((java.lang.Object) int56);
        java.lang.Object obj58 = shapeList45.clone();
        java.lang.Class<?> wildcardClass59 = obj58.getClass();
        boolean boolean60 = shapeList15.equals((java.lang.Object) wildcardClass59);
        shapeList15.clear();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(shape24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNull(shape30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(shape38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(shape42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNull(shape55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
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
        org.jfree.chart.util.ShapeList shapeList16 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj17 = shapeList16.clone();
        java.lang.Object obj18 = shapeList16.clone();
        java.awt.Shape shape20 = shapeList16.getShape(1);
        shapeList16.clear();
        shapeList16.clear();
        org.jfree.chart.util.ShapeList shapeList23 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj24 = shapeList23.clone();
        shapeList23.clear();
        java.awt.Shape shape27 = shapeList23.getShape((int) (short) 1);
        boolean boolean29 = shapeList23.equals((java.lang.Object) 'a');
        java.lang.Object obj30 = shapeList23.clone();
        boolean boolean31 = shapeList16.equals(obj30);
        org.jfree.chart.util.ShapeList shapeList32 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape34 = null;
        shapeList32.setShape(8, shape34);
        int int36 = shapeList32.size();
        shapeList32.clear();
        int int38 = shapeList32.size();
        org.jfree.chart.util.ShapeList shapeList39 = new org.jfree.chart.util.ShapeList();
        java.lang.Object obj40 = shapeList39.clone();
        shapeList39.clear();
        java.awt.Shape shape43 = shapeList39.getShape((int) (short) 1);
        java.lang.Object obj44 = shapeList39.clone();
        java.lang.Object obj45 = shapeList39.clone();
        boolean boolean46 = shapeList32.equals((java.lang.Object) shapeList39);
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
        boolean boolean64 = shapeList39.equals((java.lang.Object) shapeList47);
        boolean boolean65 = shapeList16.equals((java.lang.Object) shapeList47);
        boolean boolean66 = shapeList0.equals((java.lang.Object) boolean65);
        java.lang.Object obj67 = shapeList0.clone();
        java.awt.Shape shape69 = shapeList0.getShape((int) '#');
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(shape10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(shape15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNull(shape20);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNull(shape27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 9 + "'", int36 == 9);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNull(shape43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 9 + "'", int51 == 9);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertNull(shape58);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNull(shape63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertNull(shape69);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
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
        org.jfree.chart.util.ShapeList shapeList40 = new org.jfree.chart.util.ShapeList();
        shapeList40.clear();
        java.lang.Object obj42 = shapeList40.clone();
        boolean boolean44 = shapeList40.equals((java.lang.Object) (-1));
        int int45 = shapeList40.size();
        java.awt.Shape shape47 = shapeList40.getShape((int) (byte) -1);
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
        java.awt.Shape shape63 = shapeList48.getShape((int) (byte) 0);
        boolean boolean64 = shapeList40.equals((java.lang.Object) shapeList48);
        java.awt.Shape shape66 = shapeList48.getShape(33);
        org.jfree.chart.util.ShapeList shapeList67 = new org.jfree.chart.util.ShapeList();
        java.awt.Shape shape69 = null;
        shapeList67.setShape(8, shape69);
        java.awt.Shape shape72 = shapeList67.getShape((int) (byte) 100);
        java.awt.Shape shape74 = shapeList67.getShape((int) (byte) 100);
        java.awt.Shape shape76 = null;
        shapeList67.setShape(10, shape76);
        shapeList67.clear();
        boolean boolean79 = shapeList48.equals((java.lang.Object) shapeList67);
        java.lang.Object obj80 = shapeList67.clone();
        boolean boolean81 = shapeList27.equals((java.lang.Object) shapeList67);
        java.awt.Shape shape83 = null;
        // The following exception was thrown during execution in test generation
        try {
            shapeList27.setShape((-1), shape83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(shape7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(shape21);
        org.junit.Assert.assertNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(shape26);
        org.junit.Assert.assertNull(shape32);
        org.junit.Assert.assertNull(shape34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(shape47);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNull(shape52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(shape61);
        org.junit.Assert.assertNull(shape63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNull(shape66);
        org.junit.Assert.assertNull(shape72);
        org.junit.Assert.assertNull(shape74);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }
}

