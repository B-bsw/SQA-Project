package org.jfree.chart.axis;

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
        boolean boolean0 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_VISIBLE;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.awt.Stroke stroke0 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LINE_STROKE;
        java.lang.Class<?> wildcardClass1 = stroke0.getClass();
        org.junit.Assert.assertNotNull(stroke0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        boolean boolean0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABELS_VISIBLE;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        float float0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_INSIDE_LENGTH;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.awt.Font font0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        java.lang.Class<?> wildcardClass1 = font0.getClass();
        org.junit.Assert.assertNotNull(font0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        java.lang.Class<?> wildcardClass1 = rectangleInsets0.getClass();
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        boolean boolean0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARKS_VISIBLE;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        float float0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_OUTSIDE_LENGTH;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 2.0f + "'", float0 == 2.0f);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.awt.Stroke stroke0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_STROKE;
        java.lang.Class<?> wildcardClass1 = stroke0.getClass();
        org.junit.Assert.assertNotNull(stroke0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_INSETS;
        java.lang.Class<?> wildcardClass1 = rectangleInsets0.getClass();
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.awt.Paint paint0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_PAINT;
        java.lang.Class<?> wildcardClass1 = paint0.getClass();
        org.junit.Assert.assertNotNull(paint0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.awt.Paint paint0 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LINE_PAINT;
        java.lang.Class<?> wildcardClass1 = paint0.getClass();
        org.junit.Assert.assertNotNull(paint0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.awt.Paint paint0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_PAINT;
        java.lang.Class<?> wildcardClass1 = paint0.getClass();
        org.junit.Assert.assertNotNull(paint0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.awt.Paint paint0 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_PAINT;
        java.lang.Class<?> wildcardClass1 = paint0.getClass();
        org.junit.Assert.assertNotNull(paint0);
        org.junit.Assert.assertNotNull(wildcardClass1);
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
        java.awt.Font font0 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_FONT;
        java.lang.Class<?> wildcardClass1 = font0.getClass();
        org.junit.Assert.assertNotNull(font0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

