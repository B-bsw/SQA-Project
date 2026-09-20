package org.jfree.chart.block;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrange(blockContainer19, graphics2D20, rectangleConstraint21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D18);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.Block block11 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement12.arrangeNN(blockContainer13, graphics2D14);
        borderArrangement12.clear();
        borderArrangement12.clear();
        boolean boolean19 = borderArrangement12.equals((java.lang.Object) true);
        boolean boolean21 = borderArrangement12.equals((java.lang.Object) (byte) 0);
        boolean boolean23 = borderArrangement12.equals((java.lang.Object) 100.0d);
        borderArrangement12.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block11, (java.lang.Object) borderArrangement12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        java.lang.Object obj14 = null;
        boolean boolean15 = borderArrangement0.equals(obj14);
        org.jfree.chart.block.Block block16 = null;
        java.lang.Object obj17 = null;
        borderArrangement0.add(block16, obj17);
        org.jfree.chart.block.Block block19 = null;
        java.lang.Object obj20 = null;
        borderArrangement0.add(block19, obj20);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D26 = borderArrangement0.arrangeFR(blockContainer23, graphics2D24, rectangleConstraint25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (-1));
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeFF(blockContainer19, graphics2D20, rectangleConstraint21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertNotNull(size2D18);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFN(blockContainer11, graphics2D12, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertNotNull(size2D10);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFN(blockContainer11, graphics2D12, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D10);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFF(blockContainer11, graphics2D12, rectangleConstraint13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeFN(blockContainer10, graphics2D11, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj7 = null;
        boolean boolean8 = borderArrangement0.equals(obj7);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrange(blockContainer9, graphics2D10, rectangleConstraint11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.Block block11 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) ' ');
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement12.arrangeNN(blockContainer19, graphics2D20);
        borderArrangement12.clear();
        boolean boolean24 = borderArrangement12.equals((java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass25 = borderArrangement12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block11, (java.lang.Object) borderArrangement12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(size2D21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        borderArrangement0.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) 0.0f);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeFR(blockContainer19, graphics2D20, rectangleConstraint21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '4');
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.Block block14 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement15.arrangeNN(blockContainer16, graphics2D17);
        java.lang.Class<?> wildcardClass19 = size2D18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block14, (java.lang.Object) wildcardClass19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(size2D18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.Block block14 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement15.arrangeNN(blockContainer16, graphics2D17);
        java.lang.Class<?> wildcardClass19 = size2D18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block14, (java.lang.Object) size2D18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(size2D18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        org.jfree.data.Range range12 = null;
        org.jfree.data.Range range13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeRR(blockContainer11, range12, range13, graphics2D14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block8 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement9.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement9.clear();
        borderArrangement9.clear();
        java.lang.Object obj16 = null;
        boolean boolean17 = borderArrangement9.equals(obj16);
        java.lang.Class<?> wildcardClass18 = borderArrangement9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block8, (java.lang.Object) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        org.jfree.data.Range range11 = null;
        org.jfree.data.Range range12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeRR(blockContainer10, range11, range12, graphics2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(size2D9);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block12 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) ' ');
        borderArrangement13.clear();
        borderArrangement13.clear();
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement13.arrangeNN(blockContainer19, graphics2D20);
        borderArrangement13.clear();
        borderArrangement13.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block12, (java.lang.Object) borderArrangement13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(size2D21);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFF(blockContainer16, graphics2D17, rectangleConstraint18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block11 = null;
        java.lang.Object obj12 = null;
        borderArrangement0.add(block11, obj12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.Block block17 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) ' ');
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        org.jfree.chart.block.BlockContainer blockContainer28 = null;
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.util.Size2D size2D30 = borderArrangement18.arrangeNN(blockContainer28, graphics2D29);
        java.lang.Class<?> wildcardClass31 = size2D30.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block17, (java.lang.Object) wildcardClass31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertNotNull(size2D16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(size2D30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeFR(blockContainer17, graphics2D18, rectangleConstraint19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D16);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block14 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) ' ');
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        boolean boolean23 = borderArrangement15.equals((java.lang.Object) (short) 10);
        boolean boolean25 = borderArrangement15.equals((java.lang.Object) '#');
        borderArrangement15.clear();
        borderArrangement15.clear();
        org.jfree.chart.block.BlockContainer blockContainer28 = null;
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.util.Size2D size2D30 = borderArrangement15.arrangeNN(blockContainer28, graphics2D29);
        boolean boolean32 = borderArrangement15.equals((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass33 = borderArrangement15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block14, (java.lang.Object) wildcardClass33);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(size2D30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeFN(blockContainer19, graphics2D20, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(size2D18);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) (short) 0);
        org.jfree.chart.block.Block block12 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) ' ');
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        boolean boolean21 = borderArrangement13.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.util.Size2D size2D24 = borderArrangement13.arrangeNN(blockContainer22, graphics2D23);
        org.jfree.chart.block.BlockContainer blockContainer25 = null;
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.util.Size2D size2D27 = borderArrangement13.arrangeNN(blockContainer25, graphics2D26);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block12, (java.lang.Object) size2D27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(size2D24);
        org.junit.Assert.assertNotNull(size2D27);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFN(blockContainer15, graphics2D16, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block17 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement18.arrangeNN(blockContainer20, graphics2D21);
        borderArrangement18.clear();
        boolean boolean25 = borderArrangement18.equals((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block17, (java.lang.Object) borderArrangement18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertNotNull(size2D22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        borderArrangement11.clear();
        java.lang.Object obj14 = null;
        boolean boolean15 = borderArrangement11.equals(obj14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement11.arrangeNN(blockContainer16, graphics2D17);
        borderArrangement11.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block10, (java.lang.Object) borderArrangement11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(size2D18);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 'a');
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrange(blockContainer16, graphics2D17, rectangleConstraint18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) '4');
        org.jfree.chart.block.Block block10 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean13 = borderArrangement11.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement11.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.Block block17 = null;
        java.lang.Object obj18 = null;
        borderArrangement11.add(block17, obj18);
        boolean boolean21 = borderArrangement11.equals((java.lang.Object) 1L);
        borderArrangement11.clear();
        borderArrangement11.clear();
        org.jfree.chart.block.Block block24 = null;
        java.lang.Object obj25 = null;
        borderArrangement11.add(block24, obj25);
        java.lang.Class<?> wildcardClass27 = borderArrangement11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block10, (java.lang.Object) wildcardClass27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(size2D16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeFN(blockContainer4, graphics2D5, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        org.jfree.data.Range range15 = null;
        org.jfree.data.Range range16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeRR(blockContainer14, range15, range16, graphics2D17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        java.lang.Class<?> wildcardClass10 = size2D9.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj15 = null;
        boolean boolean16 = borderArrangement0.equals(obj15);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeFF(blockContainer18, graphics2D19, rectangleConstraint20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrange(blockContainer8, graphics2D9, rectangleConstraint10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass9 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.Block block16 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        boolean boolean20 = borderArrangement17.equals((java.lang.Object) ' ');
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.util.Size2D size2D23 = borderArrangement17.arrangeNN(blockContainer21, graphics2D22);
        borderArrangement17.clear();
        java.lang.Class<?> wildcardClass25 = borderArrangement17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block16, (java.lang.Object) wildcardClass25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(size2D23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeNN(blockContainer18, graphics2D19);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertNotNull(size2D20);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj7 = null;
        boolean boolean8 = borderArrangement0.equals(obj7);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrange(blockContainer11, graphics2D12, rectangleConstraint13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) '4');
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrange(blockContainer10, graphics2D11, rectangleConstraint12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeFR(blockContainer10, graphics2D11, rectangleConstraint12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(size2D9);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.Block block11 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) ' ');
        borderArrangement12.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement12.arrangeNN(blockContainer17, graphics2D18);
        borderArrangement12.clear();
        boolean boolean22 = borderArrangement12.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement12.arrangeNN(blockContainer23, graphics2D24);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block11, (java.lang.Object) borderArrangement12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertNotNull(size2D10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(size2D19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(size2D25);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        org.jfree.data.Range range15 = null;
        org.jfree.data.Range range16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeRR(blockContainer14, range15, range16, graphics2D17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) '4');
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeFF(blockContainer19, graphics2D20, rectangleConstraint21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(size2D18);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        java.lang.Object obj14 = null;
        boolean boolean15 = borderArrangement0.equals(obj14);
        org.jfree.chart.block.Block block16 = null;
        java.lang.Object obj17 = null;
        borderArrangement0.add(block16, obj17);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeNN(blockContainer19, graphics2D20);
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D25 = borderArrangement0.arrangeFF(blockContainer22, graphics2D23, rectangleConstraint24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(size2D21);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrange(blockContainer14, graphics2D15, rectangleConstraint16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeNN(blockContainer19, graphics2D20);
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D25 = borderArrangement0.arrangeFF(blockContainer22, graphics2D23, rectangleConstraint24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(size2D21);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFN(blockContainer15, graphics2D16, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrange(blockContainer17, graphics2D18, rectangleConstraint19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFN(blockContainer16, graphics2D17, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        java.lang.Object obj14 = null;
        boolean boolean15 = borderArrangement0.equals(obj14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        org.jfree.data.Range range17 = null;
        org.jfree.data.Range range18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeRR(blockContainer16, range17, range18, graphics2D19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block11 = null;
        java.lang.Object obj12 = null;
        borderArrangement0.add(block11, obj12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFN(blockContainer16, graphics2D17, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj7 = null;
        boolean boolean8 = borderArrangement0.equals(obj7);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        org.jfree.data.Range range17 = null;
        org.jfree.data.Range range18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeRR(blockContainer16, range17, range18, graphics2D19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (short) 1);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block14 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean17 = borderArrangement15.equals((java.lang.Object) (byte) 1);
        boolean boolean19 = borderArrangement15.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement15.arrangeNN(blockContainer20, graphics2D21);
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block14, (java.lang.Object) borderArrangement15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(size2D22);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFR(blockContainer16, graphics2D17, rectangleConstraint18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        org.jfree.data.Range range17 = null;
        org.jfree.data.Range range18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeRR(blockContainer16, range17, range18, graphics2D19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block7 = null;
        java.lang.Object obj8 = null;
        borderArrangement0.add(block7, obj8);
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) "");
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFN(blockContainer12, graphics2D13, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFN(blockContainer11, graphics2D12, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertNotNull(size2D10);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block11 = null;
        java.lang.Object obj12 = null;
        borderArrangement0.add(block11, obj12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFN(blockContainer16, graphics2D17, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeFN(blockContainer8, graphics2D9, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.Block block14 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) ' ');
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        org.jfree.chart.block.BlockContainer blockContainer25 = null;
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.util.Size2D size2D27 = borderArrangement15.arrangeNN(blockContainer25, graphics2D26);
        org.jfree.chart.block.Block block28 = null;
        java.lang.Object obj29 = null;
        borderArrangement15.add(block28, obj29);
        boolean boolean32 = borderArrangement15.equals((java.lang.Object) (short) 1);
        borderArrangement15.clear();
        borderArrangement15.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block14, (java.lang.Object) borderArrangement15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(size2D27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) '4');
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeFN(blockContainer17, graphics2D18, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeFN(blockContainer10, graphics2D11, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D9);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrange(blockContainer14, graphics2D15, rectangleConstraint16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrange(blockContainer13, graphics2D14, rectangleConstraint15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFN(blockContainer13, graphics2D14, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D6);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        org.jfree.chart.block.Block block18 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        borderArrangement19.clear();
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.util.Size2D size2D24 = borderArrangement19.arrangeNN(blockContainer22, graphics2D23);
        borderArrangement19.clear();
        borderArrangement19.clear();
        borderArrangement19.clear();
        boolean boolean29 = borderArrangement19.equals((java.lang.Object) '4');
        java.lang.Object obj30 = null;
        boolean boolean31 = borderArrangement19.equals(obj30);
        borderArrangement19.clear();
        org.jfree.chart.block.BlockContainer blockContainer33 = null;
        java.awt.Graphics2D graphics2D34 = null;
        org.jfree.chart.util.Size2D size2D35 = borderArrangement19.arrangeNN(blockContainer33, graphics2D34);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block18, (java.lang.Object) borderArrangement19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(size2D17);
        org.junit.Assert.assertNotNull(size2D24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(size2D35);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFN(blockContainer13, graphics2D14, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj7 = null;
        boolean boolean8 = borderArrangement0.equals(obj7);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        org.jfree.data.Range range16 = null;
        org.jfree.data.Range range17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeRR(blockContainer15, range16, range17, graphics2D18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        java.lang.Class<?> wildcardClass9 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFR(blockContainer16, graphics2D17, rectangleConstraint18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFR(blockContainer16, graphics2D17, rectangleConstraint18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.jfree.chart.block.Block block15 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement16.arrangeNN(blockContainer17, graphics2D18);
        borderArrangement16.clear();
        boolean boolean22 = borderArrangement16.equals((java.lang.Object) 100.0d);
        boolean boolean24 = borderArrangement16.equals((java.lang.Object) '#');
        boolean boolean26 = borderArrangement16.equals((java.lang.Object) 10.0f);
        borderArrangement16.clear();
        borderArrangement16.clear();
        java.lang.Class<?> wildcardClass29 = borderArrangement16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block15, (java.lang.Object) borderArrangement16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertNotNull(size2D14);
        org.junit.Assert.assertNotNull(size2D19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFF(blockContainer13, graphics2D14, rectangleConstraint15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeNN(blockContainer18, graphics2D19);
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        org.jfree.data.Range range22 = null;
        org.jfree.data.Range range23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D25 = borderArrangement0.arrangeRR(blockContainer21, range22, range23, graphics2D24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(size2D20);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        org.jfree.data.Range range15 = null;
        org.jfree.data.Range range16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeRR(blockContainer14, range15, range16, graphics2D17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFN(blockContainer13, graphics2D14, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block7 = null;
        java.lang.Object obj8 = null;
        borderArrangement0.add(block7, obj8);
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) "");
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        org.jfree.data.Range range13 = null;
        org.jfree.data.Range range14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeRR(blockContainer12, range13, range14, graphics2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        org.jfree.data.Range range19 = null;
        org.jfree.data.Range range20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeRR(blockContainer18, range19, range20, graphics2D21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeNN(blockContainer17, graphics2D18);
        org.jfree.chart.block.Block block20 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean23 = borderArrangement21.equals((java.lang.Object) (byte) 1);
        boolean boolean25 = borderArrangement21.equals((java.lang.Object) 100.0f);
        borderArrangement21.clear();
        borderArrangement21.clear();
        borderArrangement21.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block20, (java.lang.Object) borderArrangement21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(size2D19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        borderArrangement0.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D24 = borderArrangement0.arrangeFF(blockContainer21, graphics2D22, rectangleConstraint23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block13 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) ' ');
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        boolean boolean22 = borderArrangement14.equals((java.lang.Object) (short) 10);
        boolean boolean24 = borderArrangement14.equals((java.lang.Object) (-1));
        java.lang.Object obj25 = null;
        boolean boolean26 = borderArrangement14.equals(obj25);
        java.lang.Object obj27 = null;
        boolean boolean28 = borderArrangement14.equals(obj27);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block13, (java.lang.Object) borderArrangement14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) '4');
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block17 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block17, (java.lang.Object) borderArrangement18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) ' ');
        org.jfree.chart.block.Block block15 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement16.arrangeNN(blockContainer17, graphics2D18);
        borderArrangement16.clear();
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.util.Size2D size2D23 = borderArrangement16.arrangeNN(blockContainer21, graphics2D22);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block15, (java.lang.Object) size2D23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(size2D19);
        org.junit.Assert.assertNotNull(size2D23);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block13 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean16 = borderArrangement14.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement14.arrangeNN(blockContainer17, graphics2D18);
        boolean boolean21 = borderArrangement14.equals((java.lang.Object) (-1));
        borderArrangement14.clear();
        borderArrangement14.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block13, (java.lang.Object) borderArrangement14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(size2D19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block15 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean18 = borderArrangement16.equals((java.lang.Object) (byte) 1);
        boolean boolean20 = borderArrangement16.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.util.Size2D size2D23 = borderArrangement16.arrangeNN(blockContainer21, graphics2D22);
        borderArrangement16.clear();
        borderArrangement16.clear();
        org.jfree.chart.block.BlockContainer blockContainer26 = null;
        java.awt.Graphics2D graphics2D27 = null;
        org.jfree.chart.util.Size2D size2D28 = borderArrangement16.arrangeNN(blockContainer26, graphics2D27);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block15, (java.lang.Object) borderArrangement16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(size2D23);
        org.junit.Assert.assertNotNull(size2D28);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        org.jfree.chart.block.Block block7 = null;
        java.lang.Object obj8 = null;
        borderArrangement0.add(block7, obj8);
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFR(blockContainer15, graphics2D16, rectangleConstraint17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D6);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrange(blockContainer10, graphics2D11, rectangleConstraint12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D8);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeFN(blockContainer17, graphics2D18, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFN(blockContainer12, graphics2D13, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFN(blockContainer11, graphics2D12, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (-1));
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        java.lang.Class<?> wildcardClass16 = size2D15.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeFF(blockContainer10, graphics2D11, rectangleConstraint12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D4);
        org.junit.Assert.assertNotNull(size2D9);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.jfree.chart.block.Block block15 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) ' ');
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement16.arrangeNN(blockContainer23, graphics2D24);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block15, (java.lang.Object) borderArrangement16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertNotNull(size2D14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(size2D25);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        java.lang.Object obj14 = null;
        boolean boolean15 = borderArrangement0.equals(obj14);
        org.jfree.chart.block.Block block16 = null;
        java.lang.Object obj17 = null;
        borderArrangement0.add(block16, obj17);
        org.jfree.chart.block.Block block19 = null;
        java.lang.Object obj20 = null;
        borderArrangement0.add(block19, obj20);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block23 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement24 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean26 = borderArrangement24.equals((java.lang.Object) (byte) 1);
        borderArrangement24.clear();
        org.jfree.chart.block.BlockContainer blockContainer28 = null;
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.util.Size2D size2D30 = borderArrangement24.arrangeNN(blockContainer28, graphics2D29);
        java.lang.Class<?> wildcardClass31 = borderArrangement24.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block23, (java.lang.Object) borderArrangement24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(size2D30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeFN(blockContainer17, graphics2D18, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeFR(blockContainer18, graphics2D19, rectangleConstraint20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D17);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFR(blockContainer11, graphics2D12, rectangleConstraint13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        org.jfree.data.Range range11 = null;
        org.jfree.data.Range range12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeRR(blockContainer10, range11, range12, graphics2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFF(blockContainer16, graphics2D17, rectangleConstraint18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeFR(blockContainer7, graphics2D8, rectangleConstraint9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D6);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        java.lang.Object obj14 = null;
        boolean boolean15 = borderArrangement0.equals(obj14);
        org.jfree.chart.block.Block block16 = null;
        java.lang.Object obj17 = null;
        borderArrangement0.add(block16, obj17);
        java.lang.Class<?> wildcardClass19 = borderArrangement0.getClass();
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        java.lang.Object obj14 = null;
        boolean boolean15 = borderArrangement0.equals(obj14);
        org.jfree.chart.block.Block block16 = null;
        java.lang.Object obj17 = null;
        borderArrangement0.add(block16, obj17);
        org.jfree.chart.block.Block block19 = null;
        java.lang.Object obj20 = null;
        borderArrangement0.add(block19, obj20);
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass23 = borderArrangement0.getClass();
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFN(blockContainer11, graphics2D12, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeFF(blockContainer9, graphics2D10, rectangleConstraint11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeFN(blockContainer10, graphics2D11, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeNN(blockContainer17, graphics2D18);
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D23 = borderArrangement0.arrangeFF(blockContainer20, graphics2D21, rectangleConstraint22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D14);
        org.junit.Assert.assertNotNull(size2D19);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeFF(blockContainer9, graphics2D10, rectangleConstraint11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D5);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block11 = null;
        java.lang.Object obj12 = null;
        borderArrangement0.add(block11, obj12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFN(blockContainer16, graphics2D17, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (short) 1);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block14 = null;
        java.lang.Object obj15 = null;
        borderArrangement0.add(block14, obj15);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrange(blockContainer17, graphics2D18, rectangleConstraint19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        org.jfree.data.Range range20 = null;
        org.jfree.data.Range range21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D23 = borderArrangement0.arrangeRR(blockContainer19, range20, range21, graphics2D22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertNotNull(size2D18);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj7 = null;
        boolean boolean8 = borderArrangement0.equals(obj7);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFF(blockContainer12, graphics2D13, rectangleConstraint14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) (short) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        org.jfree.data.Range range18 = null;
        org.jfree.data.Range range19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeRR(blockContainer17, range18, range19, graphics2D20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(size2D16);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) '4');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        org.jfree.data.Range range16 = null;
        org.jfree.data.Range range17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeRR(blockContainer15, range16, range17, graphics2D18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '4');
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) '4');
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeFR(blockContainer18, graphics2D19, rectangleConstraint20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(size2D17);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFF(blockContainer11, graphics2D12, rectangleConstraint13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D6);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '4');
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        org.jfree.data.Range range16 = null;
        org.jfree.data.Range range17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeRR(blockContainer15, range16, range17, graphics2D18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj7 = null;
        boolean boolean8 = borderArrangement0.equals(obj7);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFN(blockContainer13, graphics2D14, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFF(blockContainer15, graphics2D16, rectangleConstraint17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) '4');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFR(blockContainer14, graphics2D15, rectangleConstraint16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFF(blockContainer13, graphics2D14, rectangleConstraint15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D8);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFN(blockContainer12, graphics2D13, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D6);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFN(blockContainer13, graphics2D14, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block7 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) ' ');
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        boolean boolean17 = borderArrangement8.equals((java.lang.Object) "");
        borderArrangement8.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block7, (java.lang.Object) borderArrangement8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        org.jfree.data.Range range12 = null;
        org.jfree.data.Range range13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeRR(blockContainer11, range12, range13, graphics2D14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) "hi!");
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeNN(blockContainer20, graphics2D21);
        org.jfree.chart.block.Block block23 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement24 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean26 = borderArrangement24.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer27 = null;
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.util.Size2D size2D29 = borderArrangement24.arrangeNN(blockContainer27, graphics2D28);
        org.jfree.chart.block.Block block30 = null;
        java.lang.Object obj31 = null;
        borderArrangement24.add(block30, obj31);
        borderArrangement24.clear();
        borderArrangement24.clear();
        org.jfree.chart.block.BlockContainer blockContainer35 = null;
        java.awt.Graphics2D graphics2D36 = null;
        org.jfree.chart.util.Size2D size2D37 = borderArrangement24.arrangeNN(blockContainer35, graphics2D36);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block23, (java.lang.Object) borderArrangement24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(size2D22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(size2D29);
        org.junit.Assert.assertNotNull(size2D37);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.Block block11 = null;
        java.lang.Object obj12 = null;
        borderArrangement0.add(block11, obj12);
        java.lang.Class<?> wildcardClass14 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj7 = null;
        boolean boolean8 = borderArrangement0.equals(obj7);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeFF(blockContainer9, graphics2D10, rectangleConstraint11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) "hi!");
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D23 = borderArrangement0.arrangeFF(blockContainer20, graphics2D21, rectangleConstraint22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeFN(blockContainer4, graphics2D5, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFR(blockContainer11, graphics2D12, rectangleConstraint13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFN(blockContainer13, graphics2D14, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D9);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeFN(blockContainer17, graphics2D18, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(size2D16);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeFN(blockContainer18, graphics2D19, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(size2D17);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.Block block17 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean20 = borderArrangement18.equals((java.lang.Object) (byte) 1);
        borderArrangement18.clear();
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.util.Size2D size2D24 = borderArrangement18.arrangeNN(blockContainer22, graphics2D23);
        java.lang.Class<?> wildcardClass25 = borderArrangement18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block17, (java.lang.Object) borderArrangement18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(size2D24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block9 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        boolean boolean13 = borderArrangement10.equals((java.lang.Object) ' ');
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        boolean boolean18 = borderArrangement10.equals((java.lang.Object) (short) 10);
        boolean boolean20 = borderArrangement10.equals((java.lang.Object) '#');
        borderArrangement10.clear();
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.util.Size2D size2D24 = borderArrangement10.arrangeNN(blockContainer22, graphics2D23);
        borderArrangement10.clear();
        borderArrangement10.clear();
        org.jfree.chart.block.BlockContainer blockContainer27 = null;
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.util.Size2D size2D29 = borderArrangement10.arrangeNN(blockContainer27, graphics2D28);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block9, (java.lang.Object) size2D29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(size2D24);
        org.junit.Assert.assertNotNull(size2D29);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeFF(blockContainer17, graphics2D18, rectangleConstraint19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(size2D16);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        java.lang.Class<?> wildcardClass14 = size2D13.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        org.jfree.chart.block.Block block7 = null;
        java.lang.Object obj8 = null;
        borderArrangement0.add(block7, obj8);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrange(blockContainer13, graphics2D14, rectangleConstraint15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D6);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeFN(blockContainer10, graphics2D11, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D8);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) "");
        org.jfree.chart.block.Block block10 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) ' ');
        borderArrangement11.clear();
        borderArrangement11.clear();
        borderArrangement11.clear();
        boolean boolean19 = borderArrangement11.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement11.arrangeNN(blockContainer20, graphics2D21);
        borderArrangement11.clear();
        borderArrangement11.clear();
        borderArrangement11.clear();
        borderArrangement11.clear();
        borderArrangement11.clear();
        boolean boolean29 = borderArrangement11.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer30 = null;
        java.awt.Graphics2D graphics2D31 = null;
        org.jfree.chart.util.Size2D size2D32 = borderArrangement11.arrangeNN(blockContainer30, graphics2D31);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block10, (java.lang.Object) borderArrangement11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(size2D22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(size2D32);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block16 = null;
        java.lang.Object obj17 = null;
        borderArrangement0.add(block16, obj17);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeNN(blockContainer19, graphics2D20);
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D21);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.jfree.chart.block.Block block15 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement16.arrangeNN(blockContainer17, graphics2D18);
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        java.lang.Object obj23 = null;
        boolean boolean24 = borderArrangement16.equals(obj23);
        borderArrangement16.clear();
        org.jfree.chart.block.BlockContainer blockContainer26 = null;
        java.awt.Graphics2D graphics2D27 = null;
        org.jfree.chart.util.Size2D size2D28 = borderArrangement16.arrangeNN(blockContainer26, graphics2D27);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block15, (java.lang.Object) size2D28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertNotNull(size2D14);
        org.junit.Assert.assertNotNull(size2D19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(size2D28);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFN(blockContainer12, graphics2D13, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D8);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeNN(blockContainer17, graphics2D18);
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D23 = borderArrangement0.arrangeFF(blockContainer20, graphics2D21, rectangleConstraint22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertNotNull(size2D19);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFR(blockContainer14, graphics2D15, rectangleConstraint16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) 1);
        org.jfree.chart.block.Block block13 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement14.arrangeNN(blockContainer15, graphics2D16);
        borderArrangement14.clear();
        borderArrangement14.clear();
        boolean boolean21 = borderArrangement14.equals((java.lang.Object) true);
        boolean boolean23 = borderArrangement14.equals((java.lang.Object) (byte) 0);
        borderArrangement14.clear();
        boolean boolean26 = borderArrangement14.equals((java.lang.Object) (-1.0f));
        borderArrangement14.clear();
        java.lang.Object obj28 = null;
        boolean boolean29 = borderArrangement14.equals(obj28);
        org.jfree.chart.block.BlockContainer blockContainer30 = null;
        java.awt.Graphics2D graphics2D31 = null;
        org.jfree.chart.util.Size2D size2D32 = borderArrangement14.arrangeNN(blockContainer30, graphics2D31);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block13, (java.lang.Object) size2D32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(size2D32);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block9 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        borderArrangement10.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement10.equals(obj13);
        borderArrangement10.clear();
        borderArrangement10.clear();
        boolean boolean18 = borderArrangement10.equals((java.lang.Object) 'a');
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement10.arrangeNN(blockContainer19, graphics2D20);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block9, (java.lang.Object) borderArrangement10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(size2D21);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeFN(blockContainer18, graphics2D19, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(size2D17);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        java.lang.Object obj14 = null;
        boolean boolean15 = borderArrangement0.equals(obj14);
        java.lang.Object obj16 = new java.lang.Object();
        boolean boolean17 = borderArrangement0.equals(obj16);
        java.lang.Class<?> wildcardClass18 = borderArrangement0.getClass();
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) (short) 10);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D23 = borderArrangement0.arrangeFR(blockContainer20, graphics2D21, rectangleConstraint22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        org.jfree.data.Range range21 = null;
        org.jfree.data.Range range22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D24 = borderArrangement0.arrangeRR(blockContainer20, range21, range22, graphics2D23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block16 = null;
        java.lang.Object obj17 = null;
        borderArrangement0.add(block16, obj17);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block21 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement22 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement22.clear();
        boolean boolean25 = borderArrangement22.equals((java.lang.Object) ' ');
        borderArrangement22.clear();
        org.jfree.chart.block.BlockContainer blockContainer27 = null;
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.util.Size2D size2D29 = borderArrangement22.arrangeNN(blockContainer27, graphics2D28);
        org.jfree.chart.block.BlockContainer blockContainer30 = null;
        java.awt.Graphics2D graphics2D31 = null;
        org.jfree.chart.util.Size2D size2D32 = borderArrangement22.arrangeNN(blockContainer30, graphics2D31);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block21, (java.lang.Object) borderArrangement22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(size2D29);
        org.junit.Assert.assertNotNull(size2D32);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeFF(blockContainer17, graphics2D18, rectangleConstraint19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D16);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        org.jfree.chart.block.Block block15 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) ' ');
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        boolean boolean24 = borderArrangement16.equals((java.lang.Object) (short) 10);
        borderArrangement16.clear();
        org.jfree.chart.block.Block block26 = null;
        java.lang.Object obj27 = null;
        borderArrangement16.add(block26, obj27);
        org.jfree.chart.block.BlockContainer blockContainer29 = null;
        java.awt.Graphics2D graphics2D30 = null;
        org.jfree.chart.util.Size2D size2D31 = borderArrangement16.arrangeNN(blockContainer29, graphics2D30);
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block15, (java.lang.Object) borderArrangement16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(size2D31);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrange(blockContainer13, graphics2D14, rectangleConstraint15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10.0f);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFN(blockContainer11, graphics2D12, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement0.add(block15, obj16);
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrange(blockContainer18, graphics2D19, rectangleConstraint20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        org.jfree.data.Range range18 = null;
        org.jfree.data.Range range19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeRR(blockContainer17, range18, range19, graphics2D20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(size2D16);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeNN(blockContainer19, graphics2D20);
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D25 = borderArrangement0.arrangeFN(blockContainer22, graphics2D23, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(size2D21);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        org.jfree.data.Range range14 = null;
        org.jfree.data.Range range15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeRR(blockContainer13, range14, range15, graphics2D16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeNN(blockContainer17, graphics2D18);
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D23 = borderArrangement0.arrange(blockContainer20, graphics2D21, rectangleConstraint22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D14);
        org.junit.Assert.assertNotNull(size2D19);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.Block block3 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement4 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean6 = borderArrangement4.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement4.arrangeNN(blockContainer7, graphics2D8);
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement4.add(block10, obj11);
        boolean boolean14 = borderArrangement4.equals((java.lang.Object) 1L);
        borderArrangement4.clear();
        java.lang.Object obj16 = null;
        boolean boolean17 = borderArrangement4.equals(obj16);
        borderArrangement4.clear();
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement4.arrangeNN(blockContainer19, graphics2D20);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block3, (java.lang.Object) size2D21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(size2D21);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeFR(blockContainer7, graphics2D8, rectangleConstraint9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.Block block11 = null;
        java.lang.Object obj12 = null;
        borderArrangement0.add(block11, obj12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFR(blockContainer14, graphics2D15, rectangleConstraint16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D10);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block9 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement10.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        boolean boolean18 = borderArrangement10.equals((java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass19 = borderArrangement10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block9, (java.lang.Object) wildcardClass19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFF(blockContainer16, graphics2D17, rectangleConstraint18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFF(blockContainer15, graphics2D16, rectangleConstraint17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        org.jfree.data.Range range5 = null;
        org.jfree.data.Range range6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeRR(blockContainer4, range5, range6, graphics2D7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) (short) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeFN(blockContainer17, graphics2D18, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(size2D16);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeNN(blockContainer17, graphics2D18);
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D23 = borderArrangement0.arrangeFN(blockContainer20, graphics2D21, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertNotNull(size2D19);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block12 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement13.arrangeNN(blockContainer14, graphics2D15);
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block12, (java.lang.Object) borderArrangement13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertNotNull(size2D16);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFR(blockContainer13, graphics2D14, rectangleConstraint15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFF(blockContainer13, graphics2D14, rectangleConstraint15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFN(blockContainer16, graphics2D17, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        org.jfree.chart.block.Block block9 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        borderArrangement10.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement10.equals(obj13);
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.util.Size2D size2D23 = borderArrangement10.arrangeNN(blockContainer21, graphics2D22);
        borderArrangement10.clear();
        borderArrangement10.clear();
        org.jfree.chart.block.BlockContainer blockContainer26 = null;
        java.awt.Graphics2D graphics2D27 = null;
        org.jfree.chart.util.Size2D size2D28 = borderArrangement10.arrangeNN(blockContainer26, graphics2D27);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block9, (java.lang.Object) size2D28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(size2D23);
        org.junit.Assert.assertNotNull(size2D28);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFN(blockContainer11, graphics2D12, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D10);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFN(blockContainer16, graphics2D17, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        org.jfree.data.Range range6 = null;
        org.jfree.data.Range range7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeRR(blockContainer5, range6, range7, graphics2D8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block16 = null;
        java.lang.Object obj17 = null;
        borderArrangement0.add(block16, obj17);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D23 = borderArrangement0.arrangeFR(blockContainer20, graphics2D21, rectangleConstraint22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass7 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement0.add(block15, obj16);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeNN(blockContainer20, graphics2D21);
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D26 = borderArrangement0.arrange(blockContainer23, graphics2D24, rectangleConstraint25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertNotNull(size2D22);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block11 = null;
        java.lang.Object obj12 = null;
        borderArrangement0.add(block11, obj12);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block15 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) ' ');
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement16.arrangeNN(blockContainer20, graphics2D21);
        org.jfree.chart.block.Block block23 = null;
        java.lang.Object obj24 = null;
        borderArrangement16.add(block23, obj24);
        borderArrangement16.clear();
        java.lang.Class<?> wildcardClass27 = borderArrangement16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block15, (java.lang.Object) wildcardClass27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(size2D22);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block18 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        boolean boolean22 = borderArrangement19.equals((java.lang.Object) ' ');
        borderArrangement19.clear();
        borderArrangement19.clear();
        borderArrangement19.clear();
        boolean boolean27 = borderArrangement19.equals((java.lang.Object) (short) 10);
        boolean boolean29 = borderArrangement19.equals((java.lang.Object) (byte) 100);
        borderArrangement19.clear();
        org.jfree.chart.block.BlockContainer blockContainer31 = null;
        java.awt.Graphics2D graphics2D32 = null;
        org.jfree.chart.util.Size2D size2D33 = borderArrangement19.arrangeNN(blockContainer31, graphics2D32);
        borderArrangement19.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block18, (java.lang.Object) borderArrangement19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(size2D33);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrange(blockContainer13, graphics2D14, rectangleConstraint15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeFN(blockContainer17, graphics2D18, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block11 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement12.arrangeNN(blockContainer13, graphics2D14);
        borderArrangement12.clear();
        boolean boolean18 = borderArrangement12.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement12.arrangeNN(blockContainer19, graphics2D20);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block11, (java.lang.Object) borderArrangement12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(size2D21);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.Block block16 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement17.arrangeNN(blockContainer19, graphics2D20);
        org.jfree.chart.block.Block block22 = null;
        java.lang.Object obj23 = null;
        borderArrangement17.add(block22, obj23);
        borderArrangement17.clear();
        java.lang.Class<?> wildcardClass26 = borderArrangement17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block16, (java.lang.Object) wildcardClass26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertNotNull(size2D21);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFN(blockContainer11, graphics2D12, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass9 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        org.jfree.chart.block.Block block7 = null;
        java.lang.Object obj8 = null;
        borderArrangement0.add(block7, obj8);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        org.jfree.data.Range range14 = null;
        org.jfree.data.Range range15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeRR(blockContainer13, range14, range15, graphics2D16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D6);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.Block block17 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) ' ');
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        org.jfree.chart.block.BlockContainer blockContainer25 = null;
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.util.Size2D size2D27 = borderArrangement18.arrangeNN(blockContainer25, graphics2D26);
        borderArrangement18.clear();
        boolean boolean30 = borderArrangement18.equals((java.lang.Object) '4');
        java.lang.Object obj31 = null;
        boolean boolean32 = borderArrangement18.equals(obj31);
        borderArrangement18.clear();
        borderArrangement18.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block17, (java.lang.Object) borderArrangement18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(size2D16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(size2D27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeFN(blockContainer10, graphics2D11, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D9);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement0.add(block15, obj16);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block19 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        boolean boolean23 = borderArrangement20.equals((java.lang.Object) ' ');
        borderArrangement20.clear();
        org.jfree.chart.block.BlockContainer blockContainer25 = null;
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.util.Size2D size2D27 = borderArrangement20.arrangeNN(blockContainer25, graphics2D26);
        java.lang.Object obj28 = null;
        boolean boolean29 = borderArrangement20.equals(obj28);
        java.lang.Class<?> wildcardClass30 = borderArrangement20.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block19, (java.lang.Object) wildcardClass30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(size2D27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeFR(blockContainer19, graphics2D20, rectangleConstraint21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(size2D18);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.Block block11 = null;
        java.lang.Object obj12 = null;
        borderArrangement0.add(block11, obj12);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D10);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFR(blockContainer16, graphics2D17, rectangleConstraint18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block16 = null;
        java.lang.Object obj17 = null;
        borderArrangement0.add(block16, obj17);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D23 = borderArrangement0.arrange(blockContainer20, graphics2D21, rectangleConstraint22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block17 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement18.arrangeNN(blockContainer20, graphics2D21);
        java.lang.Class<?> wildcardClass23 = borderArrangement18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block17, (java.lang.Object) borderArrangement18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(size2D22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        org.jfree.data.Range range19 = null;
        org.jfree.data.Range range20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeRR(blockContainer18, range19, range20, graphics2D21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        java.lang.Class<?> wildcardClass7 = size2D6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        org.jfree.data.Range range16 = null;
        org.jfree.data.Range range17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeRR(blockContainer15, range16, range17, graphics2D18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrange(blockContainer14, graphics2D15, rectangleConstraint16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 0.0d);
        borderArrangement0.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFF(blockContainer14, graphics2D15, rectangleConstraint16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFF(blockContainer14, graphics2D15, rectangleConstraint16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block11 = null;
        java.lang.Object obj12 = null;
        borderArrangement0.add(block11, obj12);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFF(blockContainer15, graphics2D16, rectangleConstraint17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        org.jfree.data.Range range13 = null;
        org.jfree.data.Range range14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeRR(blockContainer12, range13, range14, graphics2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D6);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj7 = null;
        boolean boolean8 = borderArrangement0.equals(obj7);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFN(blockContainer12, graphics2D13, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFN(blockContainer16, graphics2D17, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) (short) 1);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj20 = null;
        boolean boolean21 = borderArrangement0.equals(obj20);
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.util.Size2D size2D24 = borderArrangement0.arrangeNN(blockContainer22, graphics2D23);
        org.jfree.chart.block.BlockContainer blockContainer25 = null;
        java.awt.Graphics2D graphics2D26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D28 = borderArrangement0.arrangeFN(blockContainer25, graphics2D26, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(size2D24);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeFF(blockContainer10, graphics2D11, rectangleConstraint12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D6);
        org.junit.Assert.assertNotNull(size2D9);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrange(blockContainer11, graphics2D12, rectangleConstraint13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D6);
        org.junit.Assert.assertNotNull(size2D10);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        java.lang.Object obj14 = null;
        boolean boolean15 = borderArrangement0.equals(obj14);
        org.jfree.chart.block.Block block16 = null;
        java.lang.Object obj17 = null;
        borderArrangement0.add(block16, obj17);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        org.jfree.data.Range range20 = null;
        org.jfree.data.Range range21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D23 = borderArrangement0.arrangeRR(blockContainer19, range20, range21, graphics2D22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFR(blockContainer15, graphics2D16, rectangleConstraint17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeFN(blockContainer10, graphics2D11, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.Block block8 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        borderArrangement9.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement9.equals(obj12);
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement9.arrangeNN(blockContainer20, graphics2D21);
        borderArrangement9.clear();
        borderArrangement9.clear();
        org.jfree.chart.block.BlockContainer blockContainer25 = null;
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.util.Size2D size2D27 = borderArrangement9.arrangeNN(blockContainer25, graphics2D26);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block8, (java.lang.Object) borderArrangement9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(size2D22);
        org.junit.Assert.assertNotNull(size2D27);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block16 = null;
        java.lang.Object obj17 = null;
        borderArrangement0.add(block16, obj17);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        org.jfree.data.Range range20 = null;
        org.jfree.data.Range range21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D23 = borderArrangement0.arrangeRR(blockContainer19, range20, range21, graphics2D22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.Block block3 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement4 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean6 = borderArrangement4.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement4.arrangeNN(blockContainer7, graphics2D8);
        boolean boolean11 = borderArrangement4.equals((java.lang.Object) (-1));
        borderArrangement4.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement4.arrangeNN(blockContainer13, graphics2D14);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block3, (java.lang.Object) size2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) ' ');
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(size2D18);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeFN(blockContainer10, graphics2D11, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D8);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass10 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFF(blockContainer11, graphics2D12, rectangleConstraint13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D8);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        org.jfree.data.Range range19 = null;
        org.jfree.data.Range range20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeRR(blockContainer18, range19, range20, graphics2D21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(size2D17);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement0.add(block15, obj16);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D23 = borderArrangement0.arrange(blockContainer20, graphics2D21, rectangleConstraint22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        org.jfree.data.Range range14 = null;
        org.jfree.data.Range range15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeRR(blockContainer13, range14, range15, graphics2D16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (-1));
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeNN(blockContainer17, graphics2D18);
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        org.jfree.data.Range range21 = null;
        org.jfree.data.Range range22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D24 = borderArrangement0.arrangeRR(blockContainer20, range21, range22, graphics2D23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertNotNull(size2D19);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeFN(blockContainer3, graphics2D4, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrange(blockContainer12, graphics2D13, rectangleConstraint14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D6);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        borderArrangement0.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) 0.0f);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeFN(blockContainer19, graphics2D20, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.Block block7 = null;
        java.lang.Object obj8 = null;
        borderArrangement0.add(block7, obj8);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFF(blockContainer13, graphics2D14, rectangleConstraint15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block9 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean12 = borderArrangement10.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement10.arrangeNN(blockContainer13, graphics2D14);
        java.lang.Object obj16 = null;
        boolean boolean17 = borderArrangement10.equals(obj16);
        borderArrangement10.clear();
        borderArrangement10.clear();
        org.jfree.chart.block.Block block20 = null;
        java.lang.Object obj21 = null;
        borderArrangement10.add(block20, obj21);
        java.lang.Object obj23 = null;
        boolean boolean24 = borderArrangement10.equals(obj23);
        borderArrangement10.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block9, (java.lang.Object) borderArrangement10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        org.jfree.data.Range range11 = null;
        org.jfree.data.Range range12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeRR(blockContainer10, range11, range12, graphics2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        org.jfree.data.Range range17 = null;
        org.jfree.data.Range range18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeRR(blockContainer16, range17, range18, graphics2D19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block16 = null;
        java.lang.Object obj17 = null;
        borderArrangement0.add(block16, obj17);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D24 = borderArrangement0.arrangeFN(blockContainer21, graphics2D22, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrange(blockContainer19, graphics2D20, rectangleConstraint21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeFN(blockContainer5, graphics2D6, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block8 = null;
        java.lang.Object obj9 = null;
        borderArrangement0.add(block8, obj9);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        org.jfree.data.Range range12 = null;
        org.jfree.data.Range range13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeRR(blockContainer11, range12, range13, graphics2D14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D4);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeFN(blockContainer17, graphics2D18, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D16);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block7 = null;
        java.lang.Object obj8 = null;
        borderArrangement0.add(block7, obj8);
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) "");
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFF(blockContainer12, graphics2D13, rectangleConstraint14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeFN(blockContainer17, graphics2D18, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D16);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeFF(blockContainer18, graphics2D19, rectangleConstraint20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        java.lang.Object obj4 = null;
        boolean boolean5 = borderArrangement0.equals(obj4);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(size2D9);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeFR(blockContainer9, graphics2D10, rectangleConstraint11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D8);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement0.add(block15, obj16);
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeFR(blockContainer18, graphics2D19, rectangleConstraint20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        java.lang.Object obj14 = null;
        boolean boolean15 = borderArrangement0.equals(obj14);
        org.jfree.chart.block.Block block16 = null;
        java.lang.Object obj17 = null;
        borderArrangement0.add(block16, obj17);
        org.jfree.chart.block.Block block19 = null;
        java.lang.Object obj20 = null;
        borderArrangement0.add(block19, obj20);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D27 = borderArrangement0.arrangeFN(blockContainer24, graphics2D25, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeFN(blockContainer9, graphics2D10, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D6);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeFN(blockContainer9, graphics2D10, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFR(blockContainer14, graphics2D15, rectangleConstraint16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D10);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFF(blockContainer13, graphics2D14, rectangleConstraint15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.Block block11 = null;
        java.lang.Object obj12 = null;
        borderArrangement0.add(block11, obj12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D10);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFN(blockContainer15, graphics2D16, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertNotNull(size2D14);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFN(blockContainer11, graphics2D12, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFR(blockContainer14, graphics2D15, rectangleConstraint16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        org.jfree.data.Range range13 = null;
        org.jfree.data.Range range14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeRR(blockContainer12, range13, range14, graphics2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        java.lang.Object obj14 = null;
        boolean boolean15 = borderArrangement0.equals(obj14);
        org.jfree.chart.block.Block block16 = null;
        java.lang.Object obj17 = null;
        borderArrangement0.add(block16, obj17);
        org.jfree.chart.block.Block block19 = null;
        java.lang.Object obj20 = null;
        borderArrangement0.add(block19, obj20);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D26 = borderArrangement0.arrangeFN(blockContainer23, graphics2D24, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj7 = null;
        boolean boolean8 = borderArrangement0.equals(obj7);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass12 = borderArrangement0.getClass();
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block8 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement9.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean16 = borderArrangement9.equals((java.lang.Object) true);
        boolean boolean18 = borderArrangement9.equals((java.lang.Object) (byte) 0);
        borderArrangement9.clear();
        boolean boolean21 = borderArrangement9.equals((java.lang.Object) (-1.0f));
        borderArrangement9.clear();
        borderArrangement9.clear();
        java.lang.Class<?> wildcardClass24 = borderArrangement9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block8, (java.lang.Object) borderArrangement9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D6);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeFN(blockContainer18, graphics2D19, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block14 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) ' ');
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        boolean boolean23 = borderArrangement15.equals((java.lang.Object) (short) 10);
        boolean boolean25 = borderArrangement15.equals((java.lang.Object) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block14, (java.lang.Object) boolean25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Boolean cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Boolean is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeNN(blockContainer18, graphics2D19);
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D24 = borderArrangement0.arrangeFR(blockContainer21, graphics2D22, rectangleConstraint23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(size2D20);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        java.lang.Object obj8 = null;
        boolean boolean9 = borderArrangement0.equals(obj8);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block11 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean14 = borderArrangement12.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement12.arrangeNN(blockContainer15, graphics2D16);
        org.jfree.chart.block.Block block18 = null;
        java.lang.Object obj19 = null;
        borderArrangement12.add(block18, obj19);
        boolean boolean22 = borderArrangement12.equals((java.lang.Object) 1L);
        borderArrangement12.clear();
        java.lang.Object obj24 = null;
        boolean boolean25 = borderArrangement12.equals(obj24);
        boolean boolean27 = borderArrangement12.equals((java.lang.Object) ' ');
        borderArrangement12.clear();
        borderArrangement12.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block11, (java.lang.Object) borderArrangement12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(size2D17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) '4');
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.Block block13 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) ' ');
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        boolean boolean22 = borderArrangement14.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement14.arrangeNN(blockContainer23, graphics2D24);
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        org.jfree.chart.block.Block block29 = null;
        java.lang.Object obj30 = null;
        borderArrangement14.add(block29, obj30);
        borderArrangement14.clear();
        borderArrangement14.clear();
        org.jfree.chart.block.BlockContainer blockContainer34 = null;
        java.awt.Graphics2D graphics2D35 = null;
        org.jfree.chart.util.Size2D size2D36 = borderArrangement14.arrangeNN(blockContainer34, graphics2D35);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block13, (java.lang.Object) borderArrangement14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(size2D25);
        org.junit.Assert.assertNotNull(size2D36);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '4');
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFN(blockContainer16, graphics2D17, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        java.lang.Object obj14 = null;
        boolean boolean15 = borderArrangement0.equals(obj14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeFF(blockContainer19, graphics2D20, rectangleConstraint21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(size2D18);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        org.jfree.chart.block.Block block5 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement6.arrangeNN(blockContainer7, graphics2D8);
        borderArrangement6.clear();
        borderArrangement6.clear();
        boolean boolean13 = borderArrangement6.equals((java.lang.Object) true);
        borderArrangement6.clear();
        java.lang.Object obj15 = null;
        boolean boolean16 = borderArrangement6.equals(obj15);
        borderArrangement6.clear();
        borderArrangement6.clear();
        borderArrangement6.clear();
        java.lang.Class<?> wildcardClass20 = borderArrangement6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block5, (java.lang.Object) borderArrangement6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block16 = null;
        java.lang.Object obj17 = null;
        borderArrangement0.add(block16, obj17);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.util.Size2D size2D23 = borderArrangement0.arrangeNN(blockContainer21, graphics2D22);
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        org.jfree.data.Range range25 = null;
        org.jfree.data.Range range26 = null;
        java.awt.Graphics2D graphics2D27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D28 = borderArrangement0.arrangeRR(blockContainer24, range25, range26, graphics2D27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(size2D23);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeFR(blockContainer18, graphics2D19, rectangleConstraint20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        org.jfree.data.Range range18 = null;
        org.jfree.data.Range range19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeRR(blockContainer17, range18, range19, graphics2D20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D16);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block8 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) ' ');
        borderArrangement9.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement9.arrangeNN(blockContainer14, graphics2D15);
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        java.lang.Object obj20 = null;
        boolean boolean21 = borderArrangement9.equals(obj20);
        borderArrangement9.clear();
        borderArrangement9.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block8, (java.lang.Object) borderArrangement9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block9 = null;
        java.lang.Object obj10 = null;
        borderArrangement0.add(block9, obj10);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFN(blockContainer15, graphics2D16, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D14);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFN(blockContainer12, graphics2D13, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeFR(blockContainer19, graphics2D20, rectangleConstraint21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(size2D18);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeFN(blockContainer9, graphics2D10, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFR(blockContainer15, graphics2D16, rectangleConstraint17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D14);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement0.add(block15, obj16);
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeNN(blockContainer18, graphics2D19);
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D24 = borderArrangement0.arrangeFF(blockContainer21, graphics2D22, rectangleConstraint23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(size2D20);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.jfree.chart.block.Block block19 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.util.Size2D size2D23 = borderArrangement20.arrangeNN(blockContainer21, graphics2D22);
        borderArrangement20.clear();
        borderArrangement20.clear();
        borderArrangement20.clear();
        borderArrangement20.clear();
        borderArrangement20.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block19, (java.lang.Object) borderArrangement20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D18);
        org.junit.Assert.assertNotNull(size2D23);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block16 = null;
        java.lang.Object obj17 = null;
        borderArrangement0.add(block16, obj17);
        java.lang.Class<?> wildcardClass19 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrange(blockContainer15, graphics2D16, rectangleConstraint17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D14);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFF(blockContainer14, graphics2D15, rectangleConstraint16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D9);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 'a');
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFR(blockContainer16, graphics2D17, rectangleConstraint18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass9 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        boolean boolean14 = borderArrangement0.equals((java.lang.Object) ' ');
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeFN(blockContainer18, graphics2D19, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(size2D17);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFF(blockContainer16, graphics2D17, rectangleConstraint18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) (short) 1);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj20 = null;
        boolean boolean21 = borderArrangement0.equals(obj20);
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.util.Size2D size2D24 = borderArrangement0.arrangeNN(blockContainer22, graphics2D23);
        org.jfree.chart.block.Block block25 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement26 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement26.clear();
        boolean boolean29 = borderArrangement26.equals((java.lang.Object) ' ');
        borderArrangement26.clear();
        borderArrangement26.clear();
        borderArrangement26.clear();
        borderArrangement26.clear();
        borderArrangement26.clear();
        borderArrangement26.clear();
        org.jfree.chart.block.BlockContainer blockContainer36 = null;
        java.awt.Graphics2D graphics2D37 = null;
        org.jfree.chart.util.Size2D size2D38 = borderArrangement26.arrangeNN(blockContainer36, graphics2D37);
        org.jfree.chart.block.BlockContainer blockContainer39 = null;
        java.awt.Graphics2D graphics2D40 = null;
        org.jfree.chart.util.Size2D size2D41 = borderArrangement26.arrangeNN(blockContainer39, graphics2D40);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block25, (java.lang.Object) borderArrangement26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(size2D24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(size2D38);
        org.junit.Assert.assertNotNull(size2D41);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFN(blockContainer11, graphics2D12, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block16 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement17.arrangeNN(blockContainer18, graphics2D19);
        borderArrangement17.clear();
        boolean boolean23 = borderArrangement17.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.Block block24 = null;
        java.lang.Object obj25 = null;
        borderArrangement17.add(block24, obj25);
        borderArrangement17.clear();
        org.jfree.chart.block.BlockContainer blockContainer28 = null;
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.util.Size2D size2D30 = borderArrangement17.arrangeNN(blockContainer28, graphics2D29);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block16, (java.lang.Object) size2D30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(size2D30);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        org.jfree.data.Range range11 = null;
        org.jfree.data.Range range12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeRR(blockContainer10, range11, range12, graphics2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (short) 1);
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass14 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFR(blockContainer12, graphics2D13, rectangleConstraint14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block11 = null;
        java.lang.Object obj12 = null;
        borderArrangement0.add(block11, obj12);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFF(blockContainer15, graphics2D16, rectangleConstraint17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block17 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        borderArrangement18.clear();
        java.lang.Object obj21 = null;
        boolean boolean22 = borderArrangement18.equals(obj21);
        borderArrangement18.clear();
        borderArrangement18.clear();
        org.jfree.chart.block.BlockContainer blockContainer25 = null;
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.util.Size2D size2D27 = borderArrangement18.arrangeNN(blockContainer25, graphics2D26);
        java.lang.Class<?> wildcardClass28 = borderArrangement18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block17, (java.lang.Object) wildcardClass28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(size2D27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        org.jfree.data.Range range14 = null;
        org.jfree.data.Range range15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeRR(blockContainer13, range14, range15, graphics2D16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D6);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block11 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) ' ');
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        boolean boolean20 = borderArrangement12.equals((java.lang.Object) (short) 10);
        boolean boolean22 = borderArrangement12.equals((java.lang.Object) (byte) 100);
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement12.arrangeNN(blockContainer23, graphics2D24);
        borderArrangement12.clear();
        org.jfree.chart.block.BlockContainer blockContainer27 = null;
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.util.Size2D size2D29 = borderArrangement12.arrangeNN(blockContainer27, graphics2D28);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block11, (java.lang.Object) size2D29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(size2D25);
        org.junit.Assert.assertNotNull(size2D29);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement0.add(block15, obj16);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeFN(blockContainer19, graphics2D20, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFF(blockContainer16, graphics2D17, rectangleConstraint18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement0.add(block15, obj16);
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeNN(blockContainer18, graphics2D19);
        org.jfree.chart.block.Block block21 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement22 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean24 = borderArrangement22.equals((java.lang.Object) (byte) 1);
        boolean boolean26 = borderArrangement22.equals((java.lang.Object) 100.0f);
        borderArrangement22.clear();
        org.jfree.chart.block.BlockContainer blockContainer28 = null;
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.util.Size2D size2D30 = borderArrangement22.arrangeNN(blockContainer28, graphics2D29);
        java.lang.Class<?> wildcardClass31 = borderArrangement22.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block21, (java.lang.Object) wildcardClass31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertNotNull(size2D20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(size2D30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (-1));
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrange(blockContainer17, graphics2D18, rectangleConstraint19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeFN(blockContainer10, graphics2D11, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D6);
        org.junit.Assert.assertNotNull(size2D9);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) (short) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFN(blockContainer13, graphics2D14, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block7 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) ' ');
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement8.arrangeNN(blockContainer15, graphics2D16);
        borderArrangement8.clear();
        boolean boolean20 = borderArrangement8.equals((java.lang.Object) (short) 1);
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.util.Size2D size2D23 = borderArrangement8.arrangeNN(blockContainer21, graphics2D22);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block7, (java.lang.Object) size2D23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(size2D17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(size2D23);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D6);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeFN(blockContainer9, graphics2D10, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D4);
        org.junit.Assert.assertNotNull(size2D8);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block9 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean12 = borderArrangement10.equals((java.lang.Object) (byte) 1);
        boolean boolean14 = borderArrangement10.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement10.arrangeNN(blockContainer15, graphics2D16);
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        org.jfree.chart.block.Block block21 = null;
        java.lang.Object obj22 = null;
        borderArrangement10.add(block21, obj22);
        java.lang.Class<?> wildcardClass24 = borderArrangement10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block9, (java.lang.Object) wildcardClass24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(size2D17);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass10 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        org.jfree.chart.block.Block block7 = null;
        java.lang.Object obj8 = null;
        borderArrangement0.add(block7, obj8);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        org.jfree.data.Range range16 = null;
        org.jfree.data.Range range17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeRR(blockContainer15, range16, range17, graphics2D18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D6);
        org.junit.Assert.assertNotNull(size2D14);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeFN(blockContainer17, graphics2D18, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeFF(blockContainer18, graphics2D19, rectangleConstraint20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(size2D17);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeFN(blockContainer18, graphics2D19, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(size2D17);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block17 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement18.arrangeNN(blockContainer19, graphics2D20);
        borderArrangement18.clear();
        borderArrangement18.clear();
        boolean boolean25 = borderArrangement18.equals((java.lang.Object) true);
        boolean boolean27 = borderArrangement18.equals((java.lang.Object) (byte) 0);
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        org.jfree.chart.block.BlockContainer blockContainer34 = null;
        java.awt.Graphics2D graphics2D35 = null;
        org.jfree.chart.util.Size2D size2D36 = borderArrangement18.arrangeNN(blockContainer34, graphics2D35);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block17, (java.lang.Object) size2D36);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(size2D21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(size2D36);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '4');
        borderArrangement0.clear();
        org.jfree.chart.block.Block block12 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        borderArrangement13.clear();
        java.lang.Object obj16 = null;
        boolean boolean17 = borderArrangement13.equals(obj16);
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement13.arrangeNN(blockContainer24, graphics2D25);
        borderArrangement13.clear();
        java.lang.Class<?> wildcardClass28 = borderArrangement13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block12, (java.lang.Object) borderArrangement13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(size2D26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block16 = null;
        java.lang.Object obj17 = null;
        borderArrangement0.add(block16, obj17);
        org.jfree.chart.block.Block block19 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        boolean boolean23 = borderArrangement20.equals((java.lang.Object) ' ');
        borderArrangement20.clear();
        borderArrangement20.clear();
        borderArrangement20.clear();
        boolean boolean28 = borderArrangement20.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer29 = null;
        java.awt.Graphics2D graphics2D30 = null;
        org.jfree.chart.util.Size2D size2D31 = borderArrangement20.arrangeNN(blockContainer29, graphics2D30);
        borderArrangement20.clear();
        borderArrangement20.clear();
        borderArrangement20.clear();
        org.jfree.chart.block.Block block35 = null;
        java.lang.Object obj36 = null;
        borderArrangement20.add(block35, obj36);
        org.jfree.chart.block.BlockContainer blockContainer38 = null;
        java.awt.Graphics2D graphics2D39 = null;
        org.jfree.chart.util.Size2D size2D40 = borderArrangement20.arrangeNN(blockContainer38, graphics2D39);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block19, (java.lang.Object) size2D40);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(size2D31);
        org.junit.Assert.assertNotNull(size2D40);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block17 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean20 = borderArrangement18.equals((java.lang.Object) (byte) 1);
        borderArrangement18.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block17, (java.lang.Object) borderArrangement18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj7 = null;
        boolean boolean8 = borderArrangement0.equals(obj7);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFN(blockContainer12, graphics2D13, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) (short) 1);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block20 = null;
        java.lang.Object obj21 = null;
        borderArrangement0.add(block20, obj21);
        java.lang.Class<?> wildcardClass23 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) '4');
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block16 = null;
        java.lang.Object obj17 = null;
        borderArrangement0.add(block16, obj17);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrange(blockContainer19, graphics2D20, rectangleConstraint21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '4');
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.Block block17 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement18.arrangeNN(blockContainer19, graphics2D20);
        borderArrangement18.clear();
        boolean boolean24 = borderArrangement18.equals((java.lang.Object) 100.0d);
        boolean boolean26 = borderArrangement18.equals((java.lang.Object) '#');
        boolean boolean28 = borderArrangement18.equals((java.lang.Object) 10.0f);
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        org.jfree.chart.block.BlockContainer blockContainer32 = null;
        java.awt.Graphics2D graphics2D33 = null;
        org.jfree.chart.util.Size2D size2D34 = borderArrangement18.arrangeNN(blockContainer32, graphics2D33);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block17, (java.lang.Object) borderArrangement18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(size2D16);
        org.junit.Assert.assertNotNull(size2D21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(size2D34);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeFN(blockContainer7, graphics2D8, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D5);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.Block block11 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) ' ');
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement12.arrangeNN(blockContainer19, graphics2D20);
        borderArrangement12.clear();
        boolean boolean24 = borderArrangement12.equals((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block11, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Short cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Short is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(size2D21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean19 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D23 = borderArrangement0.arrangeFF(blockContainer20, graphics2D21, rectangleConstraint22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFN(blockContainer12, graphics2D13, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeFN(blockContainer10, graphics2D11, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.chart.block.Block block14 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement15.arrangeNN(blockContainer16, graphics2D17);
        borderArrangement15.clear();
        boolean boolean21 = borderArrangement15.equals((java.lang.Object) 100.0d);
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block14, (java.lang.Object) borderArrangement15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(size2D18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeFN(blockContainer10, graphics2D11, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.Block block16 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement17.arrangeNN(blockContainer18, graphics2D19);
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        org.jfree.chart.block.BlockContainer blockContainer25 = null;
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.util.Size2D size2D27 = borderArrangement17.arrangeNN(blockContainer25, graphics2D26);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block16, (java.lang.Object) size2D27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertNotNull(size2D20);
        org.junit.Assert.assertNotNull(size2D27);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        org.jfree.data.Range range17 = null;
        org.jfree.data.Range range18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeRR(blockContainer16, range17, range18, graphics2D19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFF(blockContainer11, graphics2D12, rectangleConstraint13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D4);
        org.junit.Assert.assertNotNull(size2D10);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrange(blockContainer14, graphics2D15, rectangleConstraint16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrange(blockContainer18, graphics2D19, rectangleConstraint20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(size2D17);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.Block block17 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) ' ');
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        boolean boolean26 = borderArrangement18.equals((java.lang.Object) (short) 10);
        boolean boolean28 = borderArrangement18.equals((java.lang.Object) '#');
        borderArrangement18.clear();
        boolean boolean31 = borderArrangement18.equals((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass32 = borderArrangement18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block17, (java.lang.Object) wildcardClass32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass17 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFN(blockContainer12, graphics2D13, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        java.lang.Class<?> wildcardClass18 = size2D17.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(size2D17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeFN(blockContainer8, graphics2D9, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeFF(blockContainer18, graphics2D19, rectangleConstraint20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(size2D17);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block2 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean5 = borderArrangement3.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement3.arrangeNN(blockContainer6, graphics2D7);
        java.lang.Class<?> wildcardClass9 = size2D8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block2, (java.lang.Object) size2D8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(size2D8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.Block block11 = null;
        java.lang.Object obj12 = null;
        borderArrangement0.add(block11, obj12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFF(blockContainer14, graphics2D15, rectangleConstraint16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D10);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFN(blockContainer15, graphics2D16, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D14);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        java.lang.Object obj4 = null;
        boolean boolean5 = borderArrangement0.equals(obj4);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        org.jfree.data.Range range8 = null;
        org.jfree.data.Range range9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeRR(blockContainer7, range8, range9, graphics2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block16 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean19 = borderArrangement17.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement17.arrangeNN(blockContainer20, graphics2D21);
        org.jfree.chart.block.Block block23 = null;
        java.lang.Object obj24 = null;
        borderArrangement17.add(block23, obj24);
        boolean boolean27 = borderArrangement17.equals((java.lang.Object) 1L);
        borderArrangement17.clear();
        borderArrangement17.clear();
        java.lang.Object obj30 = null;
        boolean boolean31 = borderArrangement17.equals(obj30);
        borderArrangement17.clear();
        borderArrangement17.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block16, (java.lang.Object) borderArrangement17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(size2D22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(size2D17);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) (short) 0);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFF(blockContainer12, graphics2D13, rectangleConstraint14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D9);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        org.jfree.data.Range range12 = null;
        org.jfree.data.Range range13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeRR(blockContainer11, range12, range13, graphics2D14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) '4');
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeFF(blockContainer17, graphics2D18, rectangleConstraint19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrange(blockContainer12, graphics2D13, rectangleConstraint14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFN(blockContainer13, graphics2D14, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        org.jfree.chart.block.Block block7 = null;
        java.lang.Object obj8 = null;
        borderArrangement0.add(block7, obj8);
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D6);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFN(blockContainer16, graphics2D17, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeFF(blockContainer17, graphics2D18, rectangleConstraint19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D16);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeNN(blockContainer17, graphics2D18);
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D23 = borderArrangement0.arrangeFR(blockContainer20, graphics2D21, rectangleConstraint22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D14);
        org.junit.Assert.assertNotNull(size2D19);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (-1));
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrange(blockContainer15, graphics2D16, rectangleConstraint17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) (short) 0);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFF(blockContainer13, graphics2D14, rectangleConstraint15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeFR(blockContainer18, graphics2D19, rectangleConstraint20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFN(blockContainer12, graphics2D13, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrange(blockContainer15, graphics2D16, rectangleConstraint17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) '4');
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        java.lang.Class<?> wildcardClass15 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D16);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFN(blockContainer12, graphics2D13, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFN(blockContainer13, graphics2D14, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D9);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        org.jfree.chart.block.Block block7 = null;
        java.lang.Object obj8 = null;
        borderArrangement0.add(block7, obj8);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFN(blockContainer12, graphics2D13, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D6);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass18 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D14);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrange(blockContainer14, graphics2D15, rectangleConstraint16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D8);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        org.jfree.data.Range range19 = null;
        org.jfree.data.Range range20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeRR(blockContainer18, range19, range20, graphics2D21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(size2D17);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrange(blockContainer13, graphics2D14, rectangleConstraint15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D6);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        org.jfree.chart.block.Block block11 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement12.arrangeNN(blockContainer13, graphics2D14);
        borderArrangement12.clear();
        borderArrangement12.clear();
        boolean boolean19 = borderArrangement12.equals((java.lang.Object) true);
        boolean boolean21 = borderArrangement12.equals((java.lang.Object) (byte) 0);
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        java.lang.Class<?> wildcardClass28 = borderArrangement12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block11, (java.lang.Object) wildcardClass28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) '4');
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block16 = null;
        java.lang.Object obj17 = null;
        borderArrangement0.add(block16, obj17);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeNN(blockContainer19, graphics2D20);
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D25 = borderArrangement0.arrangeFF(blockContainer22, graphics2D23, rectangleConstraint24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(size2D21);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement0.add(block15, obj16);
        org.jfree.chart.block.Block block18 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        boolean boolean22 = borderArrangement19.equals((java.lang.Object) ' ');
        borderArrangement19.clear();
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement19.arrangeNN(blockContainer24, graphics2D25);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block18, (java.lang.Object) size2D26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(size2D26);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) '4');
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFF(blockContainer13, graphics2D14, rectangleConstraint15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeFF(blockContainer19, graphics2D20, rectangleConstraint21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(size2D18);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFR(blockContainer15, graphics2D16, rectangleConstraint17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(size2D14);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) "");
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFN(blockContainer13, graphics2D14, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFF(blockContainer11, graphics2D12, rectangleConstraint13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D10);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        org.jfree.chart.block.Block block8 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement9.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean16 = borderArrangement9.equals((java.lang.Object) (byte) 10);
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        java.lang.Class<?> wildcardClass20 = borderArrangement9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block8, (java.lang.Object) wildcardClass20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        org.jfree.data.Range range16 = null;
        org.jfree.data.Range range17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeRR(blockContainer15, range16, range17, graphics2D18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block11 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) ' ');
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        boolean boolean20 = borderArrangement12.equals((java.lang.Object) (short) 10);
        boolean boolean22 = borderArrangement12.equals((java.lang.Object) '#');
        borderArrangement12.clear();
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement12.arrangeNN(blockContainer24, graphics2D25);
        org.jfree.chart.block.BlockContainer blockContainer27 = null;
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.util.Size2D size2D29 = borderArrangement12.arrangeNN(blockContainer27, graphics2D28);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block11, (java.lang.Object) borderArrangement12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(size2D26);
        org.junit.Assert.assertNotNull(size2D29);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        org.jfree.chart.block.Block block7 = null;
        java.lang.Object obj8 = null;
        borderArrangement0.add(block7, obj8);
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        java.lang.Class<?> wildcardClass13 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeFF(blockContainer17, graphics2D18, rectangleConstraint19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D14);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.Block block14 = null;
        java.lang.Object obj15 = null;
        borderArrangement0.add(block14, obj15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement0.add(block15, obj16);
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeNN(blockContainer18, graphics2D19);
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D24 = borderArrangement0.arrangeFN(blockContainer21, graphics2D22, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(size2D20);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '4');
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeFN(blockContainer18, graphics2D19, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D17);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) 1.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFF(blockContainer12, graphics2D13, rectangleConstraint14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D4);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) '4');
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        org.jfree.data.Range range20 = null;
        org.jfree.data.Range range21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D23 = borderArrangement0.arrangeRR(blockContainer19, range20, range21, graphics2D22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D18);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) "hi!");
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeNN(blockContainer18, graphics2D19);
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D24 = borderArrangement0.arrangeFF(blockContainer21, graphics2D22, rectangleConstraint23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(size2D20);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block7 = null;
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block7, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Double is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeFN(blockContainer18, graphics2D19, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D17);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFN(blockContainer13, graphics2D14, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (-1));
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeNN(blockContainer17, graphics2D18);
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D23 = borderArrangement0.arrangeFF(blockContainer20, graphics2D21, rectangleConstraint22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertNotNull(size2D19);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrange(blockContainer10, graphics2D11, rectangleConstraint12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(size2D9);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement0.add(block15, obj16);
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeFN(blockContainer18, graphics2D19, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        boolean boolean15 = borderArrangement0.equals((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass16 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeFF(blockContainer19, graphics2D20, rectangleConstraint21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertNotNull(size2D18);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFN(blockContainer15, graphics2D16, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFF(blockContainer11, graphics2D12, rectangleConstraint13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFN(blockContainer13, graphics2D14, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        java.lang.Object obj14 = null;
        boolean boolean15 = borderArrangement0.equals(obj14);
        org.jfree.chart.block.Block block16 = null;
        java.lang.Object obj17 = null;
        borderArrangement0.add(block16, obj17);
        org.jfree.chart.block.Block block19 = null;
        java.lang.Object obj20 = null;
        borderArrangement0.add(block19, obj20);
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D25 = borderArrangement0.arrange(blockContainer22, graphics2D23, rectangleConstraint24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D16);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFF(blockContainer14, graphics2D15, rectangleConstraint16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeFN(blockContainer8, graphics2D9, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) (short) 1);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj20 = null;
        boolean boolean21 = borderArrangement0.equals(obj20);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        org.jfree.data.Range range24 = null;
        org.jfree.data.Range range25 = null;
        java.awt.Graphics2D graphics2D26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D27 = borderArrangement0.arrangeRR(blockContainer23, range24, range25, graphics2D26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFN(blockContainer12, graphics2D13, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrange(blockContainer16, graphics2D17, rectangleConstraint18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass11 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFN(blockContainer11, graphics2D12, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertNotNull(size2D10);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrange(blockContainer15, graphics2D16, rectangleConstraint17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean13 = borderArrangement11.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement11.arrangeNN(blockContainer14, graphics2D15);
        java.lang.Object obj17 = null;
        boolean boolean18 = borderArrangement11.equals(obj17);
        borderArrangement11.clear();
        borderArrangement11.clear();
        org.jfree.chart.block.Block block21 = null;
        java.lang.Object obj22 = null;
        borderArrangement11.add(block21, obj22);
        java.lang.Object obj24 = null;
        boolean boolean25 = borderArrangement11.equals(obj24);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block10, (java.lang.Object) borderArrangement11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(size2D16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block15 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement16.arrangeNN(blockContainer17, graphics2D18);
        borderArrangement16.clear();
        borderArrangement16.clear();
        boolean boolean23 = borderArrangement16.equals((java.lang.Object) true);
        borderArrangement16.clear();
        java.lang.Object obj25 = null;
        boolean boolean26 = borderArrangement16.equals(obj25);
        boolean boolean28 = borderArrangement16.equals((java.lang.Object) ' ');
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block15, (java.lang.Object) boolean28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Boolean cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Boolean is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        org.jfree.chart.block.Block block7 = null;
        java.lang.Object obj8 = null;
        borderArrangement0.add(block7, obj8);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFN(blockContainer11, graphics2D12, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D6);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        org.jfree.chart.block.Block block15 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement16.arrangeNN(blockContainer17, graphics2D18);
        borderArrangement16.clear();
        boolean boolean22 = borderArrangement16.equals((java.lang.Object) 100.0d);
        boolean boolean24 = borderArrangement16.equals((java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block15, (java.lang.Object) borderArrangement16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(size2D19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        java.lang.Object obj14 = null;
        boolean boolean15 = borderArrangement0.equals(obj14);
        org.jfree.chart.block.Block block16 = null;
        java.lang.Object obj17 = null;
        borderArrangement0.add(block16, obj17);
        org.jfree.chart.block.Block block19 = null;
        java.lang.Object obj20 = null;
        borderArrangement0.add(block19, obj20);
        borderArrangement0.clear();
        java.lang.Object obj23 = null;
        boolean boolean24 = borderArrangement0.equals(obj23);
        org.jfree.chart.block.BlockContainer blockContainer25 = null;
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D28 = borderArrangement0.arrange(blockContainer25, graphics2D26, rectangleConstraint27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj15 = null;
        boolean boolean16 = borderArrangement0.equals(obj15);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block18 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        boolean boolean22 = borderArrangement19.equals((java.lang.Object) ' ');
        borderArrangement19.clear();
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement19.arrangeNN(blockContainer24, graphics2D25);
        borderArrangement19.clear();
        borderArrangement19.clear();
        borderArrangement19.clear();
        java.lang.Object obj30 = null;
        boolean boolean31 = borderArrangement19.equals(obj30);
        borderArrangement19.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block18, (java.lang.Object) borderArrangement19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(size2D26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrange(blockContainer10, graphics2D11, rectangleConstraint12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '4');
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFN(blockContainer16, graphics2D17, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 'a');
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        org.jfree.data.Range range13 = null;
        org.jfree.data.Range range14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeRR(blockContainer12, range13, range14, graphics2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block21 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement22 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean24 = borderArrangement22.equals((java.lang.Object) (byte) 1);
        boolean boolean26 = borderArrangement22.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.BlockContainer blockContainer27 = null;
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.util.Size2D size2D29 = borderArrangement22.arrangeNN(blockContainer27, graphics2D28);
        java.lang.Class<?> wildcardClass30 = borderArrangement22.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block21, (java.lang.Object) wildcardClass30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(size2D29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeFF(blockContainer17, graphics2D18, rectangleConstraint19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(size2D16);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        org.jfree.chart.block.Block block9 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        borderArrangement10.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement10.arrangeNN(blockContainer13, graphics2D14);
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        boolean boolean20 = borderArrangement10.equals((java.lang.Object) '4');
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.util.Size2D size2D23 = borderArrangement10.arrangeNN(blockContainer21, graphics2D22);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block9, (java.lang.Object) size2D23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertNotNull(size2D8);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(size2D23);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        org.jfree.data.Range range9 = null;
        org.jfree.data.Range range10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeRR(blockContainer8, range9, range10, graphics2D11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj7 = null;
        boolean boolean8 = borderArrangement0.equals(obj7);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFN(blockContainer13, graphics2D14, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeFN(blockContainer10, graphics2D11, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        boolean boolean13 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeNN(blockContainer17, graphics2D18);
        org.jfree.chart.block.Block block20 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        borderArrangement21.clear();
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement21.arrangeNN(blockContainer24, graphics2D25);
        borderArrangement21.clear();
        borderArrangement21.clear();
        borderArrangement21.clear();
        boolean boolean31 = borderArrangement21.equals((java.lang.Object) '4');
        java.lang.Object obj32 = null;
        boolean boolean33 = borderArrangement21.equals(obj32);
        java.lang.Class<?> wildcardClass34 = borderArrangement21.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block20, (java.lang.Object) wildcardClass34);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(size2D16);
        org.junit.Assert.assertNotNull(size2D19);
        org.junit.Assert.assertNotNull(size2D26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) ' ');
        borderArrangement11.clear();
        borderArrangement11.clear();
        borderArrangement11.clear();
        boolean boolean19 = borderArrangement11.equals((java.lang.Object) (short) 10);
        boolean boolean21 = borderArrangement11.equals((java.lang.Object) '#');
        borderArrangement11.clear();
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement11.arrangeNN(blockContainer23, graphics2D24);
        java.lang.Class<?> wildcardClass26 = size2D25.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block10, (java.lang.Object) size2D25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(size2D25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        java.lang.Class<?> wildcardClass9 = size2D8.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block11 = null;
        java.lang.Object obj12 = null;
        borderArrangement0.add(block11, obj12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFR(blockContainer16, graphics2D17, rectangleConstraint18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        org.jfree.data.Range range13 = null;
        org.jfree.data.Range range14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeRR(blockContainer12, range13, range14, graphics2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block16 = null;
        java.lang.Object obj17 = null;
        borderArrangement0.add(block16, obj17);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D23 = borderArrangement0.arrangeFF(blockContainer20, graphics2D21, rectangleConstraint22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        java.lang.Class<?> wildcardClass9 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeNN(blockContainer17, graphics2D18);
        org.jfree.chart.block.Block block20 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        boolean boolean24 = borderArrangement21.equals((java.lang.Object) ' ');
        org.jfree.chart.block.BlockContainer blockContainer25 = null;
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.util.Size2D size2D27 = borderArrangement21.arrangeNN(blockContainer25, graphics2D26);
        borderArrangement21.clear();
        org.jfree.chart.block.BlockContainer blockContainer29 = null;
        java.awt.Graphics2D graphics2D30 = null;
        org.jfree.chart.util.Size2D size2D31 = borderArrangement21.arrangeNN(blockContainer29, graphics2D30);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block20, (java.lang.Object) borderArrangement21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(size2D19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(size2D27);
        org.junit.Assert.assertNotNull(size2D31);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) (byte) 100);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        java.lang.Class<?> wildcardClass16 = size2D15.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFF(blockContainer15, graphics2D16, rectangleConstraint17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D14);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeFF(blockContainer18, graphics2D19, rectangleConstraint20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeFR(blockContainer18, graphics2D19, rectangleConstraint20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '4');
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFN(blockContainer15, graphics2D16, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj7 = null;
        boolean boolean8 = borderArrangement0.equals(obj7);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrange(blockContainer10, graphics2D11, rectangleConstraint12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.Block block7 = null;
        java.lang.Object obj8 = null;
        borderArrangement0.add(block7, obj8);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeFF(blockContainer17, graphics2D18, rectangleConstraint19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D16);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFF(blockContainer11, graphics2D12, rectangleConstraint13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D10);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block7 = null;
        java.lang.Object obj8 = null;
        borderArrangement0.add(block7, obj8);
        java.lang.Class<?> wildcardClass10 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block7 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) ' ');
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) (short) 10);
        boolean boolean18 = borderArrangement8.equals((java.lang.Object) (byte) 100);
        borderArrangement8.clear();
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement8.arrangeNN(blockContainer20, graphics2D21);
        java.lang.Class<?> wildcardClass23 = size2D22.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block7, (java.lang.Object) size2D22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(size2D22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 100L);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeFF(blockContainer9, graphics2D10, rectangleConstraint11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.jfree.chart.block.Block block15 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) ' ');
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        org.jfree.chart.block.BlockContainer blockContainer25 = null;
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.util.Size2D size2D27 = borderArrangement16.arrangeNN(blockContainer25, graphics2D26);
        borderArrangement16.clear();
        borderArrangement16.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block15, (java.lang.Object) borderArrangement16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(size2D14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(size2D27);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        org.jfree.chart.block.Block block7 = null;
        java.lang.Object obj8 = null;
        borderArrangement0.add(block7, obj8);
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        org.jfree.chart.block.Block block13 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) ' ');
        borderArrangement14.clear();
        borderArrangement14.clear();
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement14.arrangeNN(blockContainer20, graphics2D21);
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement14.arrangeNN(blockContainer23, graphics2D24);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block13, (java.lang.Object) size2D25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D6);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(size2D22);
        org.junit.Assert.assertNotNull(size2D25);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        org.jfree.chart.block.Block block8 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) ' ');
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean17 = borderArrangement9.equals((java.lang.Object) (short) 10);
        borderArrangement9.clear();
        org.jfree.chart.block.Block block19 = null;
        java.lang.Object obj20 = null;
        borderArrangement9.add(block19, obj20);
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.util.Size2D size2D24 = borderArrangement9.arrangeNN(blockContainer22, graphics2D23);
        borderArrangement9.clear();
        borderArrangement9.clear();
        java.lang.Class<?> wildcardClass27 = borderArrangement9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block8, (java.lang.Object) wildcardClass27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(size2D24);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        java.lang.Object obj12 = null;
        boolean boolean13 = borderArrangement0.equals(obj12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.Block block17 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement18.arrangeNN(blockContainer19, graphics2D20);
        borderArrangement18.clear();
        borderArrangement18.clear();
        boolean boolean25 = borderArrangement18.equals((java.lang.Object) true);
        borderArrangement18.clear();
        java.lang.Class<?> wildcardClass27 = borderArrangement18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block17, (java.lang.Object) borderArrangement18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(size2D16);
        org.junit.Assert.assertNotNull(size2D21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFN(blockContainer15, graphics2D16, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D14);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFN(blockContainer15, graphics2D16, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1L);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement0.equals(obj13);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        org.jfree.data.Range range18 = null;
        org.jfree.data.Range range19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeRR(blockContainer17, range18, range19, graphics2D20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrange(blockContainer16, graphics2D17, rectangleConstraint18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D6);
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) (short) 1);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj20 = null;
        boolean boolean21 = borderArrangement0.equals(obj20);
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.util.Size2D size2D24 = borderArrangement0.arrangeNN(blockContainer22, graphics2D23);
        org.jfree.chart.block.Block block25 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement26 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer27 = null;
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.util.Size2D size2D29 = borderArrangement26.arrangeNN(blockContainer27, graphics2D28);
        borderArrangement26.clear();
        borderArrangement26.clear();
        borderArrangement26.clear();
        java.lang.Object obj33 = null;
        boolean boolean34 = borderArrangement26.equals(obj33);
        java.lang.Class<?> wildcardClass35 = borderArrangement26.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block25, (java.lang.Object) wildcardClass35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(size2D24);
        org.junit.Assert.assertNotNull(size2D29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeFN(blockContainer7, graphics2D8, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D6);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '#');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        borderArrangement0.clear();
        boolean boolean18 = borderArrangement0.equals((java.lang.Object) 0.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D23 = borderArrangement0.arrangeFN(blockContainer20, graphics2D21, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj7 = null;
        boolean boolean8 = borderArrangement0.equals(obj7);
        borderArrangement0.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement0.equals(obj10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(size2D17);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block7 = null;
        java.lang.Object obj8 = null;
        borderArrangement0.add(block7, obj8);
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass11 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) "");
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFN(blockContainer15, graphics2D16, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(size2D14);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeFR(blockContainer19, graphics2D20, rectangleConstraint21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertNotNull(size2D18);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFR(blockContainer14, graphics2D15, rectangleConstraint16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D9);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '4');
        java.lang.Object obj11 = null;
        boolean boolean12 = borderArrangement0.equals(obj11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFN(blockContainer16, graphics2D17, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFN(blockContainer12, graphics2D13, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        java.lang.Object obj8 = null;
        boolean boolean9 = borderArrangement0.equals(obj8);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeFR(blockContainer10, graphics2D11, rectangleConstraint12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block15 = null;
        java.lang.Object obj16 = null;
        borderArrangement0.add(block15, obj16);
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeFF(blockContainer18, graphics2D19, rectangleConstraint20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) (short) 1);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block19 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        borderArrangement20.clear();
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement20.arrangeNN(blockContainer23, graphics2D24);
        borderArrangement20.clear();
        java.lang.Class<?> wildcardClass27 = borderArrangement20.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block19, (java.lang.Object) borderArrangement20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(size2D25);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        boolean boolean17 = borderArrangement0.equals((java.lang.Object) (short) 1);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeNN(blockContainer19, graphics2D20);
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        org.jfree.data.Range range23 = null;
        org.jfree.data.Range range24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D26 = borderArrangement0.arrangeRR(blockContainer22, range23, range24, graphics2D25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(size2D21);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFN(blockContainer12, graphics2D13, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        org.jfree.chart.block.Block block11 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block11, (java.lang.Object) borderArrangement12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 'a');
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass14 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        org.jfree.chart.block.Block block7 = null;
        java.lang.Object obj8 = null;
        borderArrangement0.add(block7, obj8);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFN(blockContainer13, graphics2D14, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D6);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeFN(blockContainer9, graphics2D10, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block11 = null;
        java.lang.Object obj12 = null;
        borderArrangement0.add(block11, obj12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) (-1.0f));
        borderArrangement0.clear();
        java.lang.Object obj14 = null;
        boolean boolean15 = borderArrangement0.equals(obj14);
        org.jfree.chart.block.Block block16 = null;
        java.lang.Object obj17 = null;
        borderArrangement0.add(block16, obj17);
        org.jfree.chart.block.Block block19 = null;
        java.lang.Object obj20 = null;
        borderArrangement0.add(block19, obj20);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D27 = borderArrangement0.arrange(blockContainer24, graphics2D25, rectangleConstraint26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 10.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        org.jfree.data.Range range16 = null;
        org.jfree.data.Range range17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeRR(blockContainer15, range16, range17, graphics2D18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeFF(blockContainer6, graphics2D7, rectangleConstraint8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeFN(blockContainer5, graphics2D6, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        java.lang.Object obj11 = null;
        borderArrangement0.add(block10, obj11);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeFF(blockContainer19, graphics2D20, rectangleConstraint21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D18);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeFF(blockContainer10, graphics2D11, rectangleConstraint12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D4);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj7 = null;
        boolean boolean8 = borderArrangement0.equals(obj7);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.junit.Assert.assertNotNull(size2D4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.jfree.chart.block.Block block15 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) ' ');
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        boolean boolean24 = borderArrangement16.equals((java.lang.Object) (short) 10);
        borderArrangement16.clear();
        org.jfree.chart.block.Block block26 = null;
        java.lang.Object obj27 = null;
        borderArrangement16.add(block26, obj27);
        borderArrangement16.clear();
        borderArrangement16.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block15, (java.lang.Object) borderArrangement16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(size2D14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        borderArrangement0.clear();
        boolean boolean12 = borderArrangement0.equals((java.lang.Object) '4');
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        org.jfree.data.Range range18 = null;
        org.jfree.data.Range range19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeRR(blockContainer17, range18, range19, graphics2D20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFN(blockContainer12, graphics2D13, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D11);
    }
}

