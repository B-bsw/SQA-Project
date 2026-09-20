package org.jfree.chart.block;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
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
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D17);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertNotNull(size2D17);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
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
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) (short) 10);
        boolean boolean18 = borderArrangement8.equals((java.lang.Object) (byte) 100);
        borderArrangement8.clear();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
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
        org.junit.Assert.assertNotNull(size2D4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
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
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeFN(blockContainer10, graphics2D11, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
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
        org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeNN(blockContainer20, graphics2D21);
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D26 = borderArrangement0.arrangeFN(blockContainer23, graphics2D24, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(size2D22);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
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
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertNotNull(size2D19);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
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
        org.jfree.chart.block.Block block11 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        borderArrangement12.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement12.arrangeNN(blockContainer15, graphics2D16);
        borderArrangement12.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block11, (java.lang.Object) borderArrangement12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D6);
        org.junit.Assert.assertNotNull(size2D17);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
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
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrange(blockContainer10, graphics2D11, rectangleConstraint12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
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
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFN(blockContainer12, graphics2D13, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
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
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrange(blockContainer14, graphics2D15, rectangleConstraint16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(size2D17);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertNotNull(size2D16);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
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
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.Block block14 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement15.arrangeNN(blockContainer16, graphics2D17);
        borderArrangement15.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block14, (java.lang.Object) borderArrangement15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(size2D18);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
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
        java.lang.Class<?> wildcardClass16 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrange(blockContainer18, graphics2D19, rectangleConstraint20);
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
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
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
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertNotNull(size2D14);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
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
        org.jfree.chart.block.Block block15 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean18 = borderArrangement16.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement16.arrangeNN(blockContainer19, graphics2D20);
        org.jfree.chart.block.Block block22 = null;
        java.lang.Object obj23 = null;
        borderArrangement16.add(block22, obj23);
        boolean boolean26 = borderArrangement16.equals((java.lang.Object) 1L);
        borderArrangement16.clear();
        borderArrangement16.clear();
        org.jfree.chart.block.BlockContainer blockContainer29 = null;
        java.awt.Graphics2D graphics2D30 = null;
        org.jfree.chart.util.Size2D size2D31 = borderArrangement16.arrangeNN(blockContainer29, graphics2D30);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block15, (java.lang.Object) size2D31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(size2D21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(size2D31);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
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
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrange(blockContainer12, graphics2D13, rectangleConstraint14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
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
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFN(blockContainer15, graphics2D16, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1L);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.Block block14 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean17 = borderArrangement15.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement15.arrangeNN(blockContainer18, graphics2D19);
        java.lang.Object obj21 = null;
        boolean boolean22 = borderArrangement15.equals(obj21);
        borderArrangement15.clear();
        org.jfree.chart.block.Block block24 = null;
        java.lang.Object obj25 = null;
        borderArrangement15.add(block24, obj25);
        org.jfree.chart.block.BlockContainer blockContainer27 = null;
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.util.Size2D size2D29 = borderArrangement15.arrangeNN(blockContainer27, graphics2D28);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block14, (java.lang.Object) size2D29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(size2D20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(size2D29);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFN(blockContainer12, graphics2D13, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
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
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeFR(blockContainer17, graphics2D18, rectangleConstraint19);
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
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
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
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrange(blockContainer16, graphics2D17, rectangleConstraint18);
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
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
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
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
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
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(size2D16);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass9 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeFN(blockContainer8, graphics2D9, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D23 = borderArrangement0.arrangeFN(blockContainer20, graphics2D21, (double) 100L);
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
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeFN(blockContainer7, graphics2D8, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeFF(blockContainer8, graphics2D9, rectangleConstraint10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeFN(blockContainer18, graphics2D19, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.Block block12 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean15 = borderArrangement13.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement13.arrangeNN(blockContainer16, graphics2D17);
        java.lang.Object obj19 = null;
        boolean boolean20 = borderArrangement13.equals(obj19);
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        org.jfree.chart.block.Block block24 = null;
        java.lang.Object obj25 = null;
        borderArrangement13.add(block24, obj25);
        borderArrangement13.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block12, (java.lang.Object) borderArrangement13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(size2D18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
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
        borderArrangement10.clear();
        boolean boolean13 = borderArrangement10.equals((java.lang.Object) ' ');
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        boolean boolean18 = borderArrangement10.equals((java.lang.Object) (short) 10);
        boolean boolean20 = borderArrangement10.equals((java.lang.Object) '#');
        borderArrangement10.clear();
        borderArrangement10.clear();
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement10.arrangeNN(blockContainer23, graphics2D24);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(size2D25);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
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
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFR(blockContainer11, graphics2D12, rectangleConstraint13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D10);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
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
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.Block block13 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) ' ');
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.util.Size2D size2D23 = borderArrangement14.arrangeNN(blockContainer21, graphics2D22);
        borderArrangement14.clear();
        borderArrangement14.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block13, (java.lang.Object) borderArrangement14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(size2D23);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
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
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D23 = borderArrangement0.arrangeFN(blockContainer20, graphics2D21, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(size2D16);
        org.junit.Assert.assertNotNull(size2D19);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
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
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        java.lang.Class<?> wildcardClass13 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
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
        java.lang.Class<?> wildcardClass21 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
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
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
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
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass17 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
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
        org.jfree.chart.block.Block block13 = null;
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
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
        java.lang.Object obj16 = null;
        boolean boolean17 = borderArrangement0.equals(obj16);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block19 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        boolean boolean23 = borderArrangement20.equals((java.lang.Object) ' ');
        borderArrangement20.clear();
        borderArrangement20.clear();
        borderArrangement20.clear();
        borderArrangement20.clear();
        borderArrangement20.clear();
        borderArrangement20.clear();
        org.jfree.chart.block.BlockContainer blockContainer30 = null;
        java.awt.Graphics2D graphics2D31 = null;
        org.jfree.chart.util.Size2D size2D32 = borderArrangement20.arrangeNN(blockContainer30, graphics2D31);
        org.jfree.chart.block.Block block33 = null;
        java.lang.Object obj34 = null;
        borderArrangement20.add(block33, obj34);
        org.jfree.chart.block.BlockContainer blockContainer36 = null;
        java.awt.Graphics2D graphics2D37 = null;
        org.jfree.chart.util.Size2D size2D38 = borderArrangement20.arrangeNN(blockContainer36, graphics2D37);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block19, (java.lang.Object) borderArrangement20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(size2D32);
        org.junit.Assert.assertNotNull(size2D38);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrange(blockContainer13, graphics2D14, rectangleConstraint15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
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
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFR(blockContainer11, graphics2D12, rectangleConstraint13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
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
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFN(blockContainer12, graphics2D13, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
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
        org.jfree.chart.block.Block block24 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement25 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean27 = borderArrangement25.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer28 = null;
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.util.Size2D size2D30 = borderArrangement25.arrangeNN(blockContainer28, graphics2D29);
        java.lang.Object obj31 = null;
        boolean boolean32 = borderArrangement25.equals(obj31);
        borderArrangement25.clear();
        borderArrangement25.clear();
        borderArrangement25.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block24, (java.lang.Object) borderArrangement25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(size2D30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
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
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeFN(blockContainer19, graphics2D20, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertNotNull(size2D18);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(size2D20);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeFN(blockContainer8, graphics2D9, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D6);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
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
        org.jfree.chart.block.Block block18 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        boolean boolean22 = borderArrangement19.equals((java.lang.Object) ' ');
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement19.arrangeNN(blockContainer23, graphics2D24);
        org.jfree.chart.block.Block block26 = null;
        java.lang.Object obj27 = null;
        borderArrangement19.add(block26, obj27);
        org.jfree.chart.block.Block block29 = null;
        java.lang.Object obj30 = null;
        borderArrangement19.add(block29, obj30);
        borderArrangement19.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block18, (java.lang.Object) borderArrangement19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(size2D17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(size2D25);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
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
        boolean boolean28 = borderArrangement15.equals((java.lang.Object) '#');
        borderArrangement15.clear();
        borderArrangement15.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block14, (java.lang.Object) borderArrangement15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
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
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block7 = null;
        java.lang.Object obj8 = null;
        borderArrangement0.add(block7, obj8);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block7 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement8.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        borderArrangement8.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block7, (java.lang.Object) borderArrangement8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
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
            org.jfree.chart.util.Size2D size2D24 = borderArrangement0.arrange(blockContainer21, graphics2D22, rectangleConstraint23);
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
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
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
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass17 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
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
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeNN(blockContainer17, graphics2D18);
        org.jfree.chart.block.Block block20 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        boolean boolean24 = borderArrangement21.equals((java.lang.Object) ' ');
        borderArrangement21.clear();
        org.jfree.chart.block.BlockContainer blockContainer26 = null;
        java.awt.Graphics2D graphics2D27 = null;
        org.jfree.chart.util.Size2D size2D28 = borderArrangement21.arrangeNN(blockContainer26, graphics2D27);
        org.jfree.chart.block.BlockContainer blockContainer29 = null;
        java.awt.Graphics2D graphics2D30 = null;
        org.jfree.chart.util.Size2D size2D31 = borderArrangement21.arrangeNN(blockContainer29, graphics2D30);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block20, (java.lang.Object) size2D31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertNotNull(size2D19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(size2D28);
        org.junit.Assert.assertNotNull(size2D31);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
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
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeFN(blockContainer18, graphics2D19, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
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
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
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
        org.junit.Assert.assertNotNull(size2D17);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
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
        org.jfree.chart.block.Block block14 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement15.arrangeNN(blockContainer16, graphics2D17);
        borderArrangement15.clear();
        borderArrangement15.clear();
        boolean boolean22 = borderArrangement15.equals((java.lang.Object) true);
        borderArrangement15.clear();
        java.lang.Class<?> wildcardClass24 = borderArrangement15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block14, (java.lang.Object) borderArrangement15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(size2D18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.junit.Assert.assertNotNull(size2D4);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
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
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) ' ');
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
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
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D17);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
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
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFR(blockContainer12, graphics2D13, rectangleConstraint14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D6);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeFN(blockContainer9, graphics2D10, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
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
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeFF(blockContainer18, graphics2D19, rectangleConstraint20);
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
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
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
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
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
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.Block block12 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) ' ');
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement13.arrangeNN(blockContainer20, graphics2D21);
        borderArrangement13.clear();
        boolean boolean25 = borderArrangement13.equals((java.lang.Object) '4');
        org.jfree.chart.block.BlockContainer blockContainer26 = null;
        java.awt.Graphics2D graphics2D27 = null;
        org.jfree.chart.util.Size2D size2D28 = borderArrangement13.arrangeNN(blockContainer26, graphics2D27);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block12, (java.lang.Object) size2D28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D8);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(size2D22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(size2D28);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
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
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
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
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D6);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
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
        org.jfree.chart.block.Block block11 = null;
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block11, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Double is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
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
        java.lang.Object obj14 = null;
        borderArrangement0.add(block13, obj14);
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
        org.junit.Assert.assertNotNull(size2D6);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
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
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.util.Size2D size2D23 = borderArrangement14.arrangeNN(blockContainer21, graphics2D22);
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        org.jfree.chart.block.BlockContainer blockContainer28 = null;
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.util.Size2D size2D30 = borderArrangement14.arrangeNN(blockContainer28, graphics2D29);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block13, (java.lang.Object) size2D30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(size2D23);
        org.junit.Assert.assertNotNull(size2D30);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
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
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
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
        borderArrangement0.clear();
        org.junit.Assert.assertNotNull(size2D4);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
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
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrange(blockContainer11, graphics2D12, rectangleConstraint13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D10);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeFN(blockContainer19, graphics2D20, (double) 'a');
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
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
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
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFF(blockContainer16, graphics2D17, rectangleConstraint18);
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
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
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
        org.jfree.chart.util.Size2D size2D24 = borderArrangement0.arrangeNN(blockContainer22, graphics2D23);
        org.jfree.chart.block.BlockContainer blockContainer25 = null;
        org.jfree.data.Range range26 = null;
        org.jfree.data.Range range27 = null;
        java.awt.Graphics2D graphics2D28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D29 = borderArrangement0.arrangeRR(blockContainer25, range26, range27, graphics2D28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(size2D24);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
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
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFN(blockContainer16, graphics2D17, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
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
        borderArrangement0.clear();
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.Block block12 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) ' ');
        borderArrangement13.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement13.arrangeNN(blockContainer18, graphics2D19);
        borderArrangement13.clear();
        boolean boolean23 = borderArrangement13.equals((java.lang.Object) 100.0f);
        borderArrangement13.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block12, (java.lang.Object) borderArrangement13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(size2D20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
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
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeFN(blockContainer9, graphics2D10, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D4);
        org.junit.Assert.assertNotNull(size2D8);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
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
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFN(blockContainer15, graphics2D16, (double) (byte) 10);
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
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
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
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFN(blockContainer13, graphics2D14, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
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
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrange(blockContainer15, graphics2D16, rectangleConstraint17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
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
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertNotNull(size2D10);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFN(blockContainer13, graphics2D14, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
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
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertNotNull(size2D10);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
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
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
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
        java.lang.Object obj29 = null;
        boolean boolean30 = borderArrangement17.equals(obj29);
        boolean boolean32 = borderArrangement17.equals((java.lang.Object) ' ');
        borderArrangement17.clear();
        org.jfree.chart.block.BlockContainer blockContainer34 = null;
        java.awt.Graphics2D graphics2D35 = null;
        org.jfree.chart.util.Size2D size2D36 = borderArrangement17.arrangeNN(blockContainer34, graphics2D35);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block16, (java.lang.Object) size2D36);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(size2D22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(size2D36);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass9 = borderArrangement0.getClass();
        org.junit.Assert.assertNotNull(size2D4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        org.jfree.chart.block.Block block10 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) ' ');
        borderArrangement11.clear();
        borderArrangement11.clear();
        borderArrangement11.clear();
        boolean boolean19 = borderArrangement11.equals((java.lang.Object) (short) 10);
        borderArrangement11.clear();
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.util.Size2D size2D23 = borderArrangement11.arrangeNN(blockContainer21, graphics2D22);
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement11.arrangeNN(blockContainer24, graphics2D25);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block10, (java.lang.Object) borderArrangement11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(size2D23);
        org.junit.Assert.assertNotNull(size2D26);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
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
        org.jfree.chart.util.Size2D size2D24 = borderArrangement0.arrangeNN(blockContainer22, graphics2D23);
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
        org.junit.Assert.assertNotNull(size2D24);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D28 = borderArrangement0.arrange(blockContainer25, graphics2D26, rectangleConstraint27);
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
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D24 = borderArrangement0.arrangeFN(blockContainer21, graphics2D22, (double) 0);
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
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeFF(blockContainer8, graphics2D9, rectangleConstraint10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
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
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(size2D19);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeNN(blockContainer7, graphics2D8);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeFN(blockContainer10, graphics2D11, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D9);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
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
        borderArrangement0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
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
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(size2D18);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
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
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFN(blockContainer12, graphics2D13, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D6);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFN(blockContainer13, graphics2D14, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
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
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeFN(blockContainer10, graphics2D11, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D6);
        org.junit.Assert.assertNotNull(size2D9);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
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
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D14);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
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
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
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
        borderArrangement0.clear();
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
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFN(blockContainer11, graphics2D12, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
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
        borderArrangement0.clear();
        borderArrangement0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFN(blockContainer15, graphics2D16, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
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
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D14);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
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
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        org.jfree.chart.block.Block block18 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        borderArrangement19.clear();
        java.lang.Object obj22 = null;
        boolean boolean23 = borderArrangement19.equals(obj22);
        borderArrangement19.clear();
        borderArrangement19.clear();
        borderArrangement19.clear();
        borderArrangement19.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block18, (java.lang.Object) borderArrangement19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertNotNull(size2D17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
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
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
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
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D24 = borderArrangement0.arrangeFN(blockContainer21, graphics2D22, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
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
        org.jfree.chart.block.Block block13 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean16 = borderArrangement14.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement14.arrangeNN(blockContainer17, graphics2D18);
        org.jfree.chart.block.Block block20 = null;
        java.lang.Object obj21 = null;
        borderArrangement14.add(block20, obj21);
        boolean boolean24 = borderArrangement14.equals((java.lang.Object) 1L);
        borderArrangement14.clear();
        java.lang.Object obj26 = null;
        boolean boolean27 = borderArrangement14.equals(obj26);
        boolean boolean29 = borderArrangement14.equals((java.lang.Object) ' ');
        borderArrangement14.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block13, (java.lang.Object) borderArrangement14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(size2D19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
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
        org.junit.Assert.assertNotNull(size2D6);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
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
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D27 = borderArrangement0.arrangeFR(blockContainer24, graphics2D25, rectangleConstraint26);
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
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeFN(blockContainer18, graphics2D19, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(size2D17);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
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
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
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
        org.jfree.chart.block.Block block15 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        borderArrangement16.clear();
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement16.arrangeNN(blockContainer19, graphics2D20);
        java.lang.Class<?> wildcardClass22 = size2D21.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block15, (java.lang.Object) wildcardClass22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block7 = null;
        java.lang.Object obj8 = null;
        borderArrangement0.add(block7, obj8);
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFR(blockContainer14, graphics2D15, rectangleConstraint16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFF(blockContainer16, graphics2D17, rectangleConstraint18);
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
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
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
        borderArrangement0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(size2D21);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
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
        org.jfree.chart.block.Block block12 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean15 = borderArrangement13.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement13.arrangeNN(blockContainer16, graphics2D17);
        org.jfree.chart.block.Block block19 = null;
        java.lang.Object obj20 = null;
        borderArrangement13.add(block19, obj20);
        boolean boolean23 = borderArrangement13.equals((java.lang.Object) 1L);
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        java.lang.Class<?> wildcardClass27 = borderArrangement13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block12, (java.lang.Object) wildcardClass27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(size2D18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
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
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFN(blockContainer16, graphics2D17, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
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
        org.jfree.chart.util.Size2D size2D23 = borderArrangement0.arrangeNN(blockContainer21, graphics2D22);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(size2D23);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
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
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
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
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeFN(blockContainer9, graphics2D10, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D4);
        org.junit.Assert.assertNotNull(size2D8);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
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
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFN(blockContainer11, graphics2D12, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
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
        java.lang.Class<?> wildcardClass20 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.Block block1 = null;
        java.lang.Object obj2 = null;
        borderArrangement0.add(block1, obj2);
        java.lang.Class<?> wildcardClass4 = borderArrangement0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrange(blockContainer12, graphics2D13, rectangleConstraint14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(size2D14);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(size2D16);
        org.junit.Assert.assertNotNull(size2D19);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
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
        java.lang.Class<?> wildcardClass13 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
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
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
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
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
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
        borderArrangement0.clear();
        org.jfree.chart.block.Block block21 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement22 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement22.clear();
        boolean boolean25 = borderArrangement22.equals((java.lang.Object) ' ');
        borderArrangement22.clear();
        borderArrangement22.clear();
        borderArrangement22.clear();
        boolean boolean30 = borderArrangement22.equals((java.lang.Object) (short) 10);
        boolean boolean32 = borderArrangement22.equals((java.lang.Object) '#');
        borderArrangement22.clear();
        boolean boolean35 = borderArrangement22.equals((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass36 = borderArrangement22.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block21, (java.lang.Object) borderArrangement22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block7 = null;
        java.lang.Object obj8 = null;
        borderArrangement0.add(block7, obj8);
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeFN(blockContainer10, graphics2D11, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D4);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
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
        java.lang.Class<?> wildcardClass16 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeFN(blockContainer19, graphics2D20, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
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
        org.junit.Assert.assertNotNull(size2D8);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
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
        org.jfree.chart.block.Block block14 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        borderArrangement15.clear();
        java.lang.Object obj18 = null;
        boolean boolean19 = borderArrangement15.equals(obj18);
        borderArrangement15.clear();
        borderArrangement15.clear();
        boolean boolean23 = borderArrangement15.equals((java.lang.Object) 'a');
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement15.arrangeNN(blockContainer24, graphics2D25);
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
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(size2D26);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D16);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
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
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrange(blockContainer17, graphics2D18, rectangleConstraint19);
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
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
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
        org.jfree.chart.block.Block block16 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        borderArrangement17.clear();
        java.lang.Object obj20 = null;
        boolean boolean21 = borderArrangement17.equals(obj20);
        borderArrangement17.clear();
        borderArrangement17.clear();
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement17.arrangeNN(blockContainer24, graphics2D25);
        org.jfree.chart.block.BlockContainer blockContainer27 = null;
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.util.Size2D size2D29 = borderArrangement17.arrangeNN(blockContainer27, graphics2D28);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block16, (java.lang.Object) size2D29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(size2D26);
        org.junit.Assert.assertNotNull(size2D29);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
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
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrange(blockContainer15, graphics2D16, rectangleConstraint17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement11.arrangeNN(blockContainer12, graphics2D13);
        borderArrangement11.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement11.arrangeNN(blockContainer16, graphics2D17);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block10, (java.lang.Object) borderArrangement11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D14);
        org.junit.Assert.assertNotNull(size2D18);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
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
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D18);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
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
        java.awt.Graphics2D graphics2D20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeFN(blockContainer19, graphics2D20, 0.0d);
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
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFN(blockContainer13, graphics2D14, (double) '4');
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
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
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
        java.lang.Class<?> wildcardClass12 = borderArrangement0.getClass();
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
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
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeFR(blockContainer18, graphics2D19, rectangleConstraint20);
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
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
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
        borderArrangement19.clear();
        borderArrangement19.clear();
        borderArrangement19.clear();
        org.jfree.chart.block.BlockContainer blockContainer29 = null;
        java.awt.Graphics2D graphics2D30 = null;
        org.jfree.chart.util.Size2D size2D31 = borderArrangement19.arrangeNN(blockContainer29, graphics2D30);
        org.jfree.chart.block.Block block32 = null;
        java.lang.Object obj33 = null;
        borderArrangement19.add(block32, obj33);
        boolean boolean36 = borderArrangement19.equals((java.lang.Object) (short) 1);
        borderArrangement19.clear();
        borderArrangement19.clear();
        java.lang.Object obj39 = null;
        boolean boolean40 = borderArrangement19.equals(obj39);
        org.jfree.chart.block.BlockContainer blockContainer41 = null;
        java.awt.Graphics2D graphics2D42 = null;
        org.jfree.chart.util.Size2D size2D43 = borderArrangement19.arrangeNN(blockContainer41, graphics2D42);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block18, (java.lang.Object) size2D43);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(size2D31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(size2D43);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
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
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrange(blockContainer10, graphics2D11, rectangleConstraint12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D9);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
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
        org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeNN(blockContainer18, graphics2D19);
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D24 = borderArrangement0.arrange(blockContainer21, graphics2D22, rectangleConstraint23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(size2D20);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
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
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass17 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
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
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFF(blockContainer14, graphics2D15, rectangleConstraint16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
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
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass19 = borderArrangement0.getClass();
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
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
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D23 = borderArrangement0.arrangeFN(blockContainer20, graphics2D21, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(size2D19);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
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
        org.jfree.chart.block.Block block16 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        boolean boolean20 = borderArrangement17.equals((java.lang.Object) ' ');
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        org.jfree.chart.block.BlockContainer blockContainer28 = null;
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.util.Size2D size2D30 = borderArrangement17.arrangeNN(blockContainer28, graphics2D29);
        borderArrangement17.clear();
        java.lang.Class<?> wildcardClass32 = borderArrangement17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block16, (java.lang.Object) wildcardClass32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(size2D30);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertNotNull(size2D14);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
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
        java.lang.Class<?> wildcardClass16 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
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
        org.jfree.chart.block.Block block13 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean16 = borderArrangement14.equals((java.lang.Object) (byte) 1);
        borderArrangement14.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement14.arrangeNN(blockContainer18, graphics2D19);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block13, (java.lang.Object) borderArrangement14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(size2D20);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
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
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass16 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
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
        java.lang.Object obj16 = null;
        boolean boolean17 = borderArrangement0.equals(obj16);
        java.lang.Class<?> wildcardClass18 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(size2D14);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeFN(blockContainer19, graphics2D20, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D18);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
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
        org.junit.Assert.assertNotNull(size2D6);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFN(blockContainer11, graphics2D12, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
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
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
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
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFN(blockContainer13, graphics2D14, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
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
        borderArrangement0.clear();
        org.jfree.chart.block.Block block12 = null;
        java.lang.Object obj13 = null;
        borderArrangement0.add(block12, obj13);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D10);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
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
        org.jfree.chart.block.Block block14 = null;
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block14, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Long is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeFR(blockContainer8, graphics2D9, rectangleConstraint10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFN(blockContainer12, graphics2D13, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        java.lang.Object obj8 = null;
        boolean boolean9 = borderArrangement0.equals(obj8);
        borderArrangement0.clear();
        org.junit.Assert.assertNotNull(size2D4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
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
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeFN(blockContainer9, graphics2D10, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeFN(blockContainer6, graphics2D7, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
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
        java.lang.Class<?> wildcardClass23 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 'a');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
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
        java.lang.Class<?> wildcardClass16 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
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
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFN(blockContainer12, graphics2D13, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeFN(blockContainer19, graphics2D20, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
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
        boolean boolean18 = borderArrangement16.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement16.arrangeNN(blockContainer19, graphics2D20);
        org.jfree.chart.block.Block block22 = null;
        java.lang.Object obj23 = null;
        borderArrangement16.add(block22, obj23);
        borderArrangement16.clear();
        borderArrangement16.clear();
        java.lang.Class<?> wildcardClass27 = borderArrangement16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block15, (java.lang.Object) wildcardClass27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertNotNull(size2D14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(size2D21);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
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
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
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
        java.lang.Class<?> wildcardClass15 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
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
        java.lang.Class<?> wildcardClass14 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
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
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrange(blockContainer11, graphics2D12, rectangleConstraint13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D6);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
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
        org.jfree.chart.block.Block block14 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) ' ');
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        boolean boolean23 = borderArrangement15.equals((java.lang.Object) (short) 10);
        boolean boolean25 = borderArrangement15.equals((java.lang.Object) (byte) 100);
        borderArrangement15.clear();
        org.jfree.chart.block.BlockContainer blockContainer27 = null;
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.util.Size2D size2D29 = borderArrangement15.arrangeNN(blockContainer27, graphics2D28);
        org.jfree.chart.block.BlockContainer blockContainer30 = null;
        java.awt.Graphics2D graphics2D31 = null;
        org.jfree.chart.util.Size2D size2D32 = borderArrangement15.arrangeNN(blockContainer30, graphics2D31);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block14, (java.lang.Object) borderArrangement15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(size2D29);
        org.junit.Assert.assertNotNull(size2D32);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeNN(blockContainer9, graphics2D10);
        org.jfree.chart.block.Block block12 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean15 = borderArrangement13.equals((java.lang.Object) (-1));
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement13.arrangeNN(blockContainer19, graphics2D20);
        borderArrangement13.clear();
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement13.arrangeNN(blockContainer23, graphics2D24);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block12, (java.lang.Object) size2D25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D8);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(size2D21);
        org.junit.Assert.assertNotNull(size2D25);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFN(blockContainer13, graphics2D14, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D8);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
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
        boolean boolean20 = borderArrangement18.equals((java.lang.Object) (-1));
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement18.arrangeNN(blockContainer24, graphics2D25);
        borderArrangement18.clear();
        org.jfree.chart.block.BlockContainer blockContainer28 = null;
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.util.Size2D size2D30 = borderArrangement18.arrangeNN(blockContainer28, graphics2D29);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block17, (java.lang.Object) size2D30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(size2D26);
        org.junit.Assert.assertNotNull(size2D30);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block7 = null;
        java.lang.Object obj8 = null;
        borderArrangement0.add(block7, obj8);
        borderArrangement0.clear();
        org.junit.Assert.assertNotNull(size2D4);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
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
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        java.lang.Class<?> wildcardClass13 = size2D12.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
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
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block9 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean12 = borderArrangement10.equals((java.lang.Object) (-1));
        borderArrangement10.clear();
        borderArrangement10.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement10.arrangeNN(blockContainer15, graphics2D16);
        java.lang.Class<?> wildcardClass18 = borderArrangement10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block9, (java.lang.Object) borderArrangement10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
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
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFR(blockContainer16, graphics2D17, rectangleConstraint18);
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
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeFF(blockContainer7, graphics2D8, rectangleConstraint9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrange(blockContainer7, graphics2D8, rectangleConstraint9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D6);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
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
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block19 = null;
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block19, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Character cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Character is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFF(blockContainer16, graphics2D17, rectangleConstraint18);
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
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
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
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrange(blockContainer18, graphics2D19, rectangleConstraint20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
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
        java.lang.Class<?> wildcardClass17 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
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
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 1);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeFN(blockContainer9, graphics2D10, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block7 = null;
        java.lang.Object obj8 = null;
        borderArrangement0.add(block7, obj8);
        org.jfree.chart.block.Block block10 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean13 = borderArrangement11.equals((java.lang.Object) (byte) 1);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement11.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement11.arrangeNN(blockContainer17, graphics2D18);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block10, (java.lang.Object) borderArrangement11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(size2D16);
        org.junit.Assert.assertNotNull(size2D19);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
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
        java.lang.Class<?> wildcardClass22 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
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
        java.lang.Class<?> wildcardClass15 = borderArrangement0.getClass();
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFN(blockContainer13, graphics2D14, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D8);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
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
        boolean boolean13 = borderArrangement10.equals((java.lang.Object) ' ');
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement10.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.Block block17 = null;
        java.lang.Object obj18 = null;
        borderArrangement10.add(block17, obj18);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block9, (java.lang.Object) borderArrangement10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(size2D16);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(size2D20);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
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
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block23, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.String is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
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
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        java.lang.Class<?> wildcardClass13 = borderArrangement11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block10, (java.lang.Object) wildcardClass13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
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
        org.junit.Assert.assertNotNull(size2D6);
        org.junit.Assert.assertNotNull(size2D14);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
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
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D6);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertNotNull(size2D10);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFR(blockContainer14, graphics2D15, rectangleConstraint16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
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
        org.jfree.chart.block.Block block13 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement14.arrangeNN(blockContainer15, graphics2D16);
        borderArrangement14.clear();
        borderArrangement14.clear();
        boolean boolean21 = borderArrangement14.equals((java.lang.Object) true);
        java.lang.Class<?> wildcardClass22 = borderArrangement14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block13, (java.lang.Object) wildcardClass22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
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
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeNN(blockContainer13, graphics2D14);
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFN(blockContainer16, graphics2D17, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
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
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFN(blockContainer16, graphics2D17, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
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
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D16);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
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
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeFN(blockContainer7, graphics2D8, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertNotNull(size2D6);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
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
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.util.Size2D size2D24 = borderArrangement21.arrangeNN(blockContainer22, graphics2D23);
        borderArrangement21.clear();
        borderArrangement21.clear();
        boolean boolean28 = borderArrangement21.equals((java.lang.Object) true);
        boolean boolean30 = borderArrangement21.equals((java.lang.Object) (byte) 0);
        borderArrangement21.clear();
        borderArrangement21.clear();
        borderArrangement21.clear();
        borderArrangement21.clear();
        org.jfree.chart.block.BlockContainer blockContainer35 = null;
        java.awt.Graphics2D graphics2D36 = null;
        org.jfree.chart.util.Size2D size2D37 = borderArrangement21.arrangeNN(blockContainer35, graphics2D36);
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
        org.junit.Assert.assertNotNull(size2D24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(size2D37);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
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
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) ' ');
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        boolean boolean24 = borderArrangement16.equals((java.lang.Object) (short) 10);
        boolean boolean26 = borderArrangement16.equals((java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block15, (java.lang.Object) boolean26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Boolean cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Boolean is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFF(blockContainer13, graphics2D14, rectangleConstraint15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
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
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D16);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass9 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
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
        borderArrangement0.clear();
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(size2D17);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D8);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
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
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
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
        borderArrangement0.clear();
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
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFN(blockContainer15, graphics2D16, (double) 1);
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
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFN(blockContainer16, graphics2D17, 0.0d);
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
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
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
        org.jfree.chart.block.Block block16 = null;
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block16, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Long is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D8);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFN(blockContainer11, graphics2D12, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
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
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D14);
        org.junit.Assert.assertNotNull(size2D17);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFN(blockContainer15, graphics2D16, 1.0d);
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
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
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
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement0.arrangeNN(blockContainer23, graphics2D24);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(size2D25);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        org.jfree.chart.block.Block block5 = null;
        java.lang.Object obj6 = null;
        borderArrangement0.add(block5, obj6);
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass9 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 'a');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFN(blockContainer11, graphics2D12, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeFN(blockContainer8, graphics2D9, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
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
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D26 = borderArrangement0.arrangeFF(blockContainer23, graphics2D24, rectangleConstraint25);
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
        org.junit.Assert.assertNotNull(size2D22);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeFN(blockContainer7, graphics2D8, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
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
        org.junit.Assert.assertNotNull(size2D16);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
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
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
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
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFN(blockContainer15, graphics2D16, (double) (-1L));
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
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.junit.Assert.assertNotNull(size2D5);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
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
        org.junit.Assert.assertNotNull(size2D10);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
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
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
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
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(size2D21);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 1L);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.Block block14 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement15.arrangeNN(blockContainer16, graphics2D17);
        borderArrangement15.clear();
        boolean boolean21 = borderArrangement15.equals((java.lang.Object) 100.0d);
        boolean boolean23 = borderArrangement15.equals((java.lang.Object) '#');
        boolean boolean25 = borderArrangement15.equals((java.lang.Object) 10.0f);
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        java.lang.Class<?> wildcardClass29 = borderArrangement15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block14, (java.lang.Object) wildcardClass29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(size2D18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
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
        java.lang.Class<?> wildcardClass12 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
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
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D6);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
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
            org.jfree.chart.util.Size2D size2D25 = borderArrangement0.arrangeFR(blockContainer22, graphics2D23, rectangleConstraint24);
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
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
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
            org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrange(blockContainer7, graphics2D8, rectangleConstraint9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
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
        org.junit.Assert.assertNotNull(size2D6);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
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
        org.jfree.chart.block.BlockContainer blockContainer25 = null;
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.util.Size2D size2D27 = borderArrangement16.arrangeNN(blockContainer25, graphics2D26);
        java.lang.Class<?> wildcardClass28 = size2D27.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block15, (java.lang.Object) wildcardClass28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(size2D27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
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
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeFN(blockContainer19, graphics2D20, (double) 10.0f);
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
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
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
        org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeNN(blockContainer17, graphics2D18);
        org.jfree.chart.block.Block block20 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        boolean boolean24 = borderArrangement21.equals((java.lang.Object) ' ');
        borderArrangement21.clear();
        borderArrangement21.clear();
        borderArrangement21.clear();
        boolean boolean29 = borderArrangement21.equals((java.lang.Object) (short) 10);
        borderArrangement21.clear();
        org.jfree.chart.block.Block block31 = null;
        java.lang.Object obj32 = null;
        borderArrangement21.add(block31, obj32);
        borderArrangement21.clear();
        borderArrangement21.clear();
        java.lang.Class<?> wildcardClass36 = borderArrangement21.getClass();
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
        org.junit.Assert.assertNotNull(size2D19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
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
        org.jfree.chart.block.Block block22 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement23 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement23.clear();
        boolean boolean26 = borderArrangement23.equals((java.lang.Object) ' ');
        borderArrangement23.clear();
        borderArrangement23.clear();
        borderArrangement23.clear();
        boolean boolean31 = borderArrangement23.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer32 = null;
        java.awt.Graphics2D graphics2D33 = null;
        org.jfree.chart.util.Size2D size2D34 = borderArrangement23.arrangeNN(blockContainer32, graphics2D33);
        borderArrangement23.clear();
        borderArrangement23.clear();
        borderArrangement23.clear();
        org.jfree.chart.block.Block block38 = null;
        java.lang.Object obj39 = null;
        borderArrangement23.add(block38, obj39);
        borderArrangement23.clear();
        org.jfree.chart.block.BlockContainer blockContainer42 = null;
        java.awt.Graphics2D graphics2D43 = null;
        org.jfree.chart.util.Size2D size2D44 = borderArrangement23.arrangeNN(blockContainer42, graphics2D43);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block22, (java.lang.Object) borderArrangement23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(size2D21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(size2D34);
        org.junit.Assert.assertNotNull(size2D44);
    }
}

