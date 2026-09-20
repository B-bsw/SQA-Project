package org.jfree.chart.renderer.category;

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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        java.awt.Shape shape0 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        java.lang.Class<?> wildcardClass1 = shape0.getClass();
        org.junit.Assert.assertNotNull(shape0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.lang.Double double0 = org.jfree.chart.renderer.AbstractRenderer.ZERO;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        java.awt.Stroke stroke0 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        java.lang.Class<?> wildcardClass1 = stroke0.getClass();
        org.junit.Assert.assertNotNull(stroke0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        java.awt.Paint paint0 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        java.lang.Class<?> wildcardClass1 = paint0.getClass();
        org.junit.Assert.assertNotNull(paint0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        java.awt.Font font0 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        java.lang.Class<?> wildcardClass1 = font0.getClass();
        org.junit.Assert.assertNotNull(font0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test7");
        java.awt.Stroke stroke0 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.lang.Class<?> wildcardClass1 = stroke0.getClass();
        org.junit.Assert.assertNotNull(stroke0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test8");
        java.awt.Paint paint0 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        java.lang.Class<?> wildcardClass1 = paint0.getClass();
        org.junit.Assert.assertNotNull(paint0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test9");
        java.awt.Paint paint0 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        java.lang.Class<?> wildcardClass1 = paint0.getClass();
        org.junit.Assert.assertNotNull(paint0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

