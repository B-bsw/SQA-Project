package org.jfree.chart.block;

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
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFF(blockContainer16, graphics2D17, rectangleConstraint18);
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
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
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
        boolean boolean20 = borderArrangement12.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.util.Size2D size2D23 = borderArrangement12.arrangeNN(blockContainer21, graphics2D22);
        borderArrangement12.clear();
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
        org.junit.Assert.assertNotNull(size2D6);
        org.junit.Assert.assertNotNull(size2D10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(size2D23);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        borderArrangement15.clear();
        org.jfree.chart.block.BlockContainer blockContainer28 = null;
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.util.Size2D size2D30 = borderArrangement15.arrangeNN(blockContainer28, graphics2D29);
        borderArrangement15.clear();
        boolean boolean33 = borderArrangement15.equals((java.lang.Object) 0.0f);
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
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(size2D30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        org.junit.Assert.assertNotNull(size2D18);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D8);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.util.Size2D size2D23 = borderArrangement16.arrangeNN(blockContainer21, graphics2D22);
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        java.lang.Object obj27 = null;
        boolean boolean28 = borderArrangement16.equals(obj27);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block15, (java.lang.Object) boolean28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Boolean cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Boolean is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertNotNull(size2D14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(size2D23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        java.lang.Object obj4 = null;
        boolean boolean5 = borderArrangement0.equals(obj4);
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
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeFN(blockContainer19, graphics2D20, 0.0d);
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
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeFN(blockContainer4, graphics2D5, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFR(blockContainer14, graphics2D15, rectangleConstraint16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D6);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        org.jfree.chart.block.Block block28 = null;
        java.lang.Object obj29 = null;
        borderArrangement13.add(block28, obj29);
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
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(size2D24);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        org.junit.Assert.assertNotNull(size2D5);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFN(blockContainer11, graphics2D12, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeFR(blockContainer10, graphics2D11, rectangleConstraint12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D5);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        java.lang.Class<?> wildcardClass15 = borderArrangement0.getClass();
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
        java.lang.Class<?> wildcardClass26 = borderArrangement16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block15, (java.lang.Object) borderArrangement16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(size2D25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        java.lang.Class<?> wildcardClass13 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
            org.jfree.chart.util.Size2D size2D23 = borderArrangement0.arrangeFR(blockContainer20, graphics2D21, rectangleConstraint22);
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
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFN(blockContainer13, graphics2D14, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass13 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFN(blockContainer11, graphics2D12, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertNotNull(size2D10);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block6 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        borderArrangement7.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = borderArrangement7.equals(obj10);
        borderArrangement7.clear();
        borderArrangement7.clear();
        boolean boolean15 = borderArrangement7.equals((java.lang.Object) 'a');
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block6, (java.lang.Object) boolean15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Boolean cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Boolean is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFR(blockContainer12, graphics2D13, rectangleConstraint14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        borderArrangement0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D6);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        org.jfree.chart.block.Block block12 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean15 = borderArrangement13.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement13.arrangeNN(blockContainer16, graphics2D17);
        boolean boolean20 = borderArrangement13.equals((java.lang.Object) (-1));
        borderArrangement13.clear();
        borderArrangement13.clear();
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement13.arrangeNN(blockContainer23, graphics2D24);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block12, (java.lang.Object) borderArrangement13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(size2D18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(size2D25);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertNotNull(size2D16);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        java.lang.Class<?> wildcardClass15 = borderArrangement0.getClass();
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, 0.0d);
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
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeFN(blockContainer7, graphics2D8, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D4);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
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
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass15 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D17);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        borderArrangement16.clear();
        boolean boolean23 = borderArrangement16.equals((java.lang.Object) true);
        boolean boolean25 = borderArrangement16.equals((java.lang.Object) (byte) 0);
        borderArrangement16.clear();
        boolean boolean28 = borderArrangement16.equals((java.lang.Object) (-1.0f));
        borderArrangement16.clear();
        java.lang.Object obj30 = null;
        boolean boolean31 = borderArrangement16.equals(obj30);
        borderArrangement16.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block15, (java.lang.Object) borderArrangement16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(size2D19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
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
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        org.junit.Assert.assertNotNull(size2D18);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        org.jfree.chart.block.Block block21 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement22 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement22.clear();
        boolean boolean25 = borderArrangement22.equals((java.lang.Object) ' ');
        borderArrangement22.clear();
        borderArrangement22.clear();
        borderArrangement22.clear();
        org.jfree.chart.block.BlockContainer blockContainer29 = null;
        java.awt.Graphics2D graphics2D30 = null;
        org.jfree.chart.util.Size2D size2D31 = borderArrangement22.arrangeNN(blockContainer29, graphics2D30);
        borderArrangement22.clear();
        boolean boolean34 = borderArrangement22.equals((java.lang.Object) '4');
        java.lang.Object obj35 = null;
        boolean boolean36 = borderArrangement22.equals(obj35);
        borderArrangement22.clear();
        borderArrangement22.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block21, (java.lang.Object) borderArrangement22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(size2D20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(size2D31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFR(blockContainer14, graphics2D15, rectangleConstraint16);
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
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
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
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeFN(blockContainer10, graphics2D11, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D8);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
        java.lang.Class<?> wildcardClass11 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
        org.junit.Assert.assertNotNull(size2D14);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D8);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
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
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFN(blockContainer15, graphics2D16, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertNotNull(size2D14);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeFN(blockContainer6, graphics2D7, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeFR(blockContainer4, graphics2D5, rectangleConstraint6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
        java.lang.Class<?> wildcardClass15 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(size2D17);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
        java.lang.Class<?> wildcardClass14 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
        boolean boolean14 = borderArrangement12.equals((java.lang.Object) (byte) 1);
        boolean boolean16 = borderArrangement12.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement12.arrangeNN(blockContainer17, graphics2D18);
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(size2D19);
        org.junit.Assert.assertNotNull(size2D25);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.Block block8 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement9.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement9.clear();
        borderArrangement9.clear();
        boolean boolean16 = borderArrangement9.equals((java.lang.Object) true);
        borderArrangement9.clear();
        java.lang.Object obj18 = null;
        boolean boolean19 = borderArrangement9.equals(obj18);
        boolean boolean21 = borderArrangement9.equals((java.lang.Object) ' ');
        borderArrangement9.clear();
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
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        java.lang.Object obj4 = null;
        boolean boolean5 = borderArrangement0.equals(obj4);
        org.jfree.chart.block.Block block6 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement7.arrangeNN(blockContainer8, graphics2D9);
        borderArrangement7.clear();
        borderArrangement7.clear();
        borderArrangement7.clear();
        java.lang.Object obj14 = null;
        boolean boolean15 = borderArrangement7.equals(obj14);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block6, (java.lang.Object) boolean15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Boolean cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Boolean is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(size2D10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        org.jfree.data.Range range10 = null;
        org.jfree.data.Range range11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeRR(blockContainer9, range10, range11, graphics2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D4);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
        org.jfree.chart.block.Block block21 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement22 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement22.clear();
        boolean boolean25 = borderArrangement22.equals((java.lang.Object) ' ');
        borderArrangement22.clear();
        borderArrangement22.clear();
        org.jfree.chart.block.BlockContainer blockContainer28 = null;
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.util.Size2D size2D30 = borderArrangement22.arrangeNN(blockContainer28, graphics2D29);
        org.jfree.chart.block.BlockContainer blockContainer31 = null;
        java.awt.Graphics2D graphics2D32 = null;
        org.jfree.chart.util.Size2D size2D33 = borderArrangement22.arrangeNN(blockContainer31, graphics2D32);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block21, (java.lang.Object) borderArrangement22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(size2D20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(size2D30);
        org.junit.Assert.assertNotNull(size2D33);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeFN(blockContainer17, graphics2D18, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertNotNull(size2D16);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        java.lang.Object obj26 = null;
        boolean boolean27 = borderArrangement13.equals(obj26);
        borderArrangement13.clear();
        org.jfree.chart.block.BlockContainer blockContainer29 = null;
        java.awt.Graphics2D graphics2D30 = null;
        org.jfree.chart.util.Size2D size2D31 = borderArrangement13.arrangeNN(blockContainer29, graphics2D30);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block12, (java.lang.Object) borderArrangement13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(size2D22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(size2D31);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
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
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFN(blockContainer16, graphics2D17, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrange(blockContainer9, graphics2D10, rectangleConstraint11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFR(blockContainer14, graphics2D15, rectangleConstraint16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFR(blockContainer14, graphics2D15, rectangleConstraint16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeNN(blockContainer15, graphics2D16);
        org.jfree.chart.block.Block block18 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean21 = borderArrangement19.equals((java.lang.Object) (-1));
        borderArrangement19.clear();
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement19.arrangeNN(blockContainer23, graphics2D24);
        borderArrangement19.clear();
        org.jfree.chart.block.BlockContainer blockContainer27 = null;
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.util.Size2D size2D29 = borderArrangement19.arrangeNN(blockContainer27, graphics2D28);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block18, (java.lang.Object) size2D29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(size2D25);
        org.junit.Assert.assertNotNull(size2D29);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrange(blockContainer13, graphics2D14, rectangleConstraint15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFF(blockContainer12, graphics2D13, rectangleConstraint14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
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
            org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeFN(blockContainer8, graphics2D9, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
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
        java.lang.Class<?> wildcardClass14 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        borderArrangement0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
            org.jfree.chart.util.Size2D size2D23 = borderArrangement0.arrangeFF(blockContainer20, graphics2D21, rectangleConstraint22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 'a');
        org.jfree.chart.block.Block block9 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean12 = borderArrangement10.equals((java.lang.Object) (byte) 1);
        boolean boolean14 = borderArrangement10.equals((java.lang.Object) 100.0f);
        borderArrangement10.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block9, (java.lang.Object) borderArrangement10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFF(blockContainer12, graphics2D13, rectangleConstraint14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFR(blockContainer15, graphics2D16, rectangleConstraint17);
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
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
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
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeFN(blockContainer10, graphics2D11, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass10 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, 10.0d);
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
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
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
        java.lang.Class<?> wildcardClass14 = borderArrangement0.getClass();
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(size2D21);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFN(blockContainer12, graphics2D13, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D6);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
        org.junit.Assert.assertNotNull(size2D18);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
        org.jfree.chart.block.Block block16 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        borderArrangement17.clear();
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement17.arrangeNN(blockContainer20, graphics2D21);
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D14);
        org.junit.Assert.assertNotNull(size2D22);
        org.junit.Assert.assertNotNull(size2D27);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFN(blockContainer11, graphics2D12, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFR(blockContainer11, graphics2D12, rectangleConstraint13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
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
        boolean boolean18 = borderArrangement16.equals((java.lang.Object) (byte) 1);
        boolean boolean20 = borderArrangement16.equals((java.lang.Object) 100.0f);
        borderArrangement16.clear();
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.util.Size2D size2D24 = borderArrangement16.arrangeNN(blockContainer22, graphics2D23);
        org.jfree.chart.block.BlockContainer blockContainer25 = null;
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.util.Size2D size2D27 = borderArrangement16.arrangeNN(blockContainer25, graphics2D26);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block15, (java.lang.Object) size2D27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(size2D24);
        org.junit.Assert.assertNotNull(size2D27);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
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
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
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
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeFN(blockContainer10, graphics2D11, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrange(blockContainer13, graphics2D14, rectangleConstraint15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D9);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
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
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFN(blockContainer15, graphics2D16, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D14);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrange(blockContainer9, graphics2D10, rectangleConstraint11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D4);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFF(blockContainer11, graphics2D12, rectangleConstraint13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
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
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
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
        borderArrangement10.clear();
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.util.Size2D size2D24 = borderArrangement10.arrangeNN(blockContainer22, graphics2D23);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block9, (java.lang.Object) borderArrangement10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(size2D17);
        org.junit.Assert.assertNotNull(size2D24);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
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
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrange(blockContainer16, graphics2D17, rectangleConstraint18);
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
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
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
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        boolean boolean20 = borderArrangement17.equals((java.lang.Object) ' ');
        borderArrangement17.clear();
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.util.Size2D size2D24 = borderArrangement17.arrangeNN(blockContainer22, graphics2D23);
        borderArrangement17.clear();
        borderArrangement17.clear();
        java.lang.Class<?> wildcardClass27 = borderArrangement17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block16, (java.lang.Object) wildcardClass27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(size2D24);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
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
        java.lang.Class<?> wildcardClass17 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
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
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        borderArrangement14.clear();
        java.lang.Object obj17 = null;
        boolean boolean18 = borderArrangement14.equals(obj17);
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement14.arrangeNN(blockContainer19, graphics2D20);
        java.lang.Class<?> wildcardClass22 = borderArrangement14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block13, (java.lang.Object) borderArrangement14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(size2D21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
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
            org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrange(blockContainer8, graphics2D9, rectangleConstraint10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 0.0d);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block12 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement13.arrangeNN(blockContainer14, graphics2D15);
        borderArrangement13.clear();
        borderArrangement13.clear();
        boolean boolean20 = borderArrangement13.equals((java.lang.Object) true);
        borderArrangement13.clear();
        java.lang.Object obj22 = null;
        boolean boolean23 = borderArrangement13.equals(obj22);
        boolean boolean25 = borderArrangement13.equals((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass26 = borderArrangement13.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFN(blockContainer11, graphics2D12, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertNotNull(size2D10);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
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
        org.jfree.chart.block.Block block17 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement18.clear();
        boolean boolean21 = borderArrangement18.equals((java.lang.Object) ' ');
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        borderArrangement18.clear();
        boolean boolean27 = borderArrangement18.equals((java.lang.Object) "");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(size2D30);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeFN(blockContainer10, graphics2D11, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFR(blockContainer15, graphics2D16, rectangleConstraint17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeFN(blockContainer9, graphics2D10, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D8);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
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
        org.jfree.chart.block.Block block13 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean16 = borderArrangement14.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement14.arrangeNN(blockContainer17, graphics2D18);
        java.lang.Object obj20 = null;
        boolean boolean21 = borderArrangement14.equals(obj20);
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        org.jfree.chart.block.Block block25 = null;
        java.lang.Object obj26 = null;
        borderArrangement14.add(block25, obj26);
        java.lang.Class<?> wildcardClass28 = borderArrangement14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block13, (java.lang.Object) borderArrangement14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(size2D19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
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
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (double) 10.0f);
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
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
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
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertNotNull(size2D17);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
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
        org.jfree.chart.block.Block block15 = null;
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block15, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Float is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
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
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement9.arrangeNN(blockContainer16, graphics2D17);
        borderArrangement9.clear();
        boolean boolean21 = borderArrangement9.equals((java.lang.Object) '4');
        java.lang.Object obj22 = null;
        boolean boolean23 = borderArrangement9.equals(obj22);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block8, (java.lang.Object) boolean23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Boolean cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Boolean is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrange(blockContainer12, graphics2D13, rectangleConstraint14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
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
        borderArrangement14.clear();
        org.jfree.chart.block.Block block27 = null;
        java.lang.Object obj28 = null;
        borderArrangement14.add(block27, obj28);
        borderArrangement14.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block13, (java.lang.Object) borderArrangement14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(size2D19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
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
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFR(blockContainer15, graphics2D16, rectangleConstraint17);
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
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
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
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeFN(blockContainer10, graphics2D11, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D6);
        org.junit.Assert.assertNotNull(size2D9);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D10);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrange(blockContainer14, graphics2D15, rectangleConstraint16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) (byte) 0);
        boolean boolean11 = borderArrangement0.equals((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass12 = borderArrangement0.getClass();
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
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
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
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
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
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
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrange(blockContainer15, graphics2D16, rectangleConstraint17);
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
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean13 = borderArrangement11.equals((java.lang.Object) (-1));
        borderArrangement11.clear();
        java.lang.Class<?> wildcardClass15 = borderArrangement11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block10, (java.lang.Object) borderArrangement11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
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
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
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
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeFN(blockContainer19, graphics2D20, (double) 10.0f);
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
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
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
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFF(blockContainer14, graphics2D15, rectangleConstraint16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
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
        borderArrangement15.clear();
        java.lang.Class<?> wildcardClass20 = borderArrangement15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block14, (java.lang.Object) wildcardClass20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(size2D18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
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
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
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
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D10);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
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
        java.lang.Class<?> wildcardClass19 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) "");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
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
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFR(blockContainer13, graphics2D14, rectangleConstraint15);
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
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
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
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeNN(blockContainer16, graphics2D17);
        org.jfree.chart.block.Block block19 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement20.clear();
        boolean boolean23 = borderArrangement20.equals((java.lang.Object) ' ');
        borderArrangement20.clear();
        borderArrangement20.clear();
        borderArrangement20.clear();
        boolean boolean28 = borderArrangement20.equals((java.lang.Object) (short) 10);
        boolean boolean30 = borderArrangement20.equals((java.lang.Object) (-1));
        java.lang.Object obj31 = null;
        boolean boolean32 = borderArrangement20.equals(obj31);
        org.jfree.chart.block.BlockContainer blockContainer33 = null;
        java.awt.Graphics2D graphics2D34 = null;
        org.jfree.chart.util.Size2D size2D35 = borderArrangement20.arrangeNN(blockContainer33, graphics2D34);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(size2D18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(size2D35);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
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
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrange(blockContainer17, graphics2D18, rectangleConstraint19);
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
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeFN(blockContainer9, graphics2D10, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFN(blockContainer11, graphics2D12, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D10);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
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
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeFR(blockContainer19, graphics2D20, rectangleConstraint21);
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
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        org.jfree.chart.block.Block block9 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement10.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement10.clear();
        borderArrangement10.clear();
        boolean boolean17 = borderArrangement10.equals((java.lang.Object) true);
        boolean boolean19 = borderArrangement10.equals((java.lang.Object) (byte) 0);
        boolean boolean21 = borderArrangement10.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.util.Size2D size2D24 = borderArrangement10.arrangeNN(blockContainer22, graphics2D23);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block9, (java.lang.Object) borderArrangement10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D8);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(size2D24);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
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
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
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
        org.junit.Assert.assertNotNull(size2D14);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
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
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
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
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass14 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeFN(blockContainer8, graphics2D9, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeFN(blockContainer9, graphics2D10, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D8);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
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
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeFN(blockContainer10, graphics2D11, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D6);
        org.junit.Assert.assertNotNull(size2D9);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
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
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFN(blockContainer15, graphics2D16, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertNotNull(size2D10);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (double) '4');
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
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
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
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFR(blockContainer14, graphics2D15, rectangleConstraint16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
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
        org.junit.Assert.assertNotNull(size2D6);
        org.junit.Assert.assertNotNull(size2D10);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
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
        org.jfree.chart.block.Block block19 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean22 = borderArrangement20.equals((java.lang.Object) (byte) 1);
        boolean boolean24 = borderArrangement20.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.BlockContainer blockContainer25 = null;
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.util.Size2D size2D27 = borderArrangement20.arrangeNN(blockContainer25, graphics2D26);
        borderArrangement20.clear();
        borderArrangement20.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block19, (java.lang.Object) borderArrangement20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(size2D27);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFR(blockContainer11, graphics2D12, rectangleConstraint13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
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
        java.lang.Class<?> wildcardClass12 = size2D11.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        java.lang.Class<?> wildcardClass7 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
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
        org.junit.Assert.assertNotNull(size2D14);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(size2D17);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.chart.block.Block block11 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) ' ');
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.util.Size2D size2D23 = borderArrangement12.arrangeNN(blockContainer21, graphics2D22);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block11, (java.lang.Object) borderArrangement12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(size2D23);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
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
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.Block block14 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        borderArrangement15.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement15.arrangeNN(blockContainer18, graphics2D19);
        java.lang.Class<?> wildcardClass21 = borderArrangement15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block14, (java.lang.Object) borderArrangement15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D10);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(size2D20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrange(blockContainer15, graphics2D16, rectangleConstraint17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFN(blockContainer11, graphics2D12, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D10);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
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
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement15.arrangeNN(blockContainer16, graphics2D17);
        borderArrangement15.clear();
        borderArrangement15.clear();
        boolean boolean22 = borderArrangement15.equals((java.lang.Object) true);
        borderArrangement15.clear();
        java.lang.Object obj24 = null;
        boolean boolean25 = borderArrangement15.equals(obj24);
        boolean boolean27 = borderArrangement15.equals((java.lang.Object) ' ');
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block14, (java.lang.Object) boolean27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Boolean cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Boolean is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        org.jfree.chart.block.Block block7 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement8.clear();
        boolean boolean11 = borderArrangement8.equals((java.lang.Object) ' ');
        borderArrangement8.clear();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement8.arrangeNN(blockContainer13, graphics2D14);
        borderArrangement8.clear();
        borderArrangement8.clear();
        java.lang.Class<?> wildcardClass18 = borderArrangement8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block7, (java.lang.Object) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFR(blockContainer16, graphics2D17, rectangleConstraint18);
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
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFF(blockContainer11, graphics2D12, rectangleConstraint13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFN(blockContainer16, graphics2D17, (double) 0L);
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
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (double) (byte) 100);
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
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(size2D16);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
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
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeFF(blockContainer17, graphics2D18, rectangleConstraint19);
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
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
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
        org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeNN(blockContainer12, graphics2D13);
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFN(blockContainer15, graphics2D16, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertNotNull(size2D14);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
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
        java.lang.Class<?> wildcardClass15 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
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
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFF(blockContainer13, graphics2D14, rectangleConstraint15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeFR(blockContainer10, graphics2D11, rectangleConstraint12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D6);
        org.junit.Assert.assertNotNull(size2D9);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
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
        java.lang.Class<?> wildcardClass25 = size2D24.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block12, (java.lang.Object) size2D24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(size2D24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
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
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block5 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement6 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.util.Size2D size2D9 = borderArrangement6.arrangeNN(blockContainer7, graphics2D8);
        borderArrangement6.clear();
        boolean boolean12 = borderArrangement6.equals((java.lang.Object) 100.0d);
        boolean boolean14 = borderArrangement6.equals((java.lang.Object) '#');
        boolean boolean16 = borderArrangement6.equals((java.lang.Object) 10.0f);
        borderArrangement6.clear();
        borderArrangement6.clear();
        borderArrangement6.clear();
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement6.arrangeNN(blockContainer20, graphics2D21);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block5, (java.lang.Object) size2D22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(size2D22);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
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
        java.lang.Class<?> wildcardClass15 = borderArrangement0.getClass();
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
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
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFN(blockContainer15, graphics2D16, (double) '#');
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
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
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
        org.jfree.chart.block.Block block13 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement14.arrangeNN(blockContainer15, graphics2D16);
        borderArrangement14.clear();
        borderArrangement14.clear();
        boolean boolean21 = borderArrangement14.equals((java.lang.Object) true);
        borderArrangement14.clear();
        java.lang.Object obj23 = null;
        boolean boolean24 = borderArrangement14.equals(obj23);
        boolean boolean26 = borderArrangement14.equals((java.lang.Object) ' ');
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertNotNull(size2D17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(size2D32);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
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
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFN(blockContainer15, graphics2D16, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(size2D14);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
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
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeNN(blockContainer17, graphics2D18);
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D23 = borderArrangement0.arrangeFN(blockContainer20, graphics2D21, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(size2D19);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFR(blockContainer11, graphics2D12, rectangleConstraint13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeFN(blockContainer9, graphics2D10, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFR(blockContainer12, graphics2D13, rectangleConstraint14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
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
        java.lang.Class<?> wildcardClass23 = borderArrangement11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block10, (java.lang.Object) borderArrangement11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeFN(blockContainer8, graphics2D9, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D4);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFN(blockContainer11, graphics2D12, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D6);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
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
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFR(blockContainer12, graphics2D13, rectangleConstraint14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
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
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeFN(blockContainer17, graphics2D18, (double) (short) 10);
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
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
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
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrange(blockContainer13, graphics2D14, rectangleConstraint15);
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
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
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
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFN(blockContainer15, graphics2D16, 0.0d);
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
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
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
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(size2D17);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
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
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeFR(blockContainer17, graphics2D18, rectangleConstraint19);
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
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeFN(blockContainer9, graphics2D10, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
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
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeFR(blockContainer19, graphics2D20, rectangleConstraint21);
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
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
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
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
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
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFR(blockContainer11, graphics2D12, rectangleConstraint13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
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
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
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
        org.jfree.chart.block.Block block12 = null;
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block12, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.String is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
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
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrange(blockContainer13, graphics2D14, rectangleConstraint15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFR(blockContainer16, graphics2D17, rectangleConstraint18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
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
        org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeNN(blockContainer19, graphics2D20);
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D25 = borderArrangement0.arrangeFN(blockContainer22, graphics2D23, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(size2D21);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        org.jfree.chart.block.Block block8 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement9.arrangeNN(blockContainer10, graphics2D11);
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement9.arrangeNN(blockContainer17, graphics2D18);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block8, (java.lang.Object) borderArrangement9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertNotNull(size2D19);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
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
        java.lang.Class<?> wildcardClass12 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrange(blockContainer16, graphics2D17, rectangleConstraint18);
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
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
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
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
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
        org.junit.Assert.assertNotNull(size2D5);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrange(blockContainer9, graphics2D10, rectangleConstraint11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D6);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) 'a');
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        org.jfree.data.Range range10 = null;
        org.jfree.data.Range range11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeRR(blockContainer9, range10, range11, graphics2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
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
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block8, (java.lang.Object) borderArrangement9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
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
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeFR(blockContainer9, graphics2D10, rectangleConstraint11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D4);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
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
        org.jfree.chart.block.Block block16 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean19 = borderArrangement17.equals((java.lang.Object) (byte) 1);
        boolean boolean21 = borderArrangement17.equals((java.lang.Object) 100.0f);
        borderArrangement17.clear();
        org.jfree.chart.block.BlockContainer blockContainer23 = null;
        java.awt.Graphics2D graphics2D24 = null;
        org.jfree.chart.util.Size2D size2D25 = borderArrangement17.arrangeNN(blockContainer23, graphics2D24);
        borderArrangement17.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block16, (java.lang.Object) borderArrangement17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(size2D25);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFF(blockContainer14, graphics2D15, rectangleConstraint16);
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
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeFR(blockContainer9, graphics2D10, rectangleConstraint11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
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
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertNotNull(size2D17);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
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
            org.jfree.chart.util.Size2D size2D23 = borderArrangement0.arrange(blockContainer20, graphics2D21, rectangleConstraint22);
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
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
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
            org.jfree.chart.util.Size2D size2D23 = borderArrangement0.arrangeFR(blockContainer20, graphics2D21, rectangleConstraint22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFR(blockContainer13, graphics2D14, rectangleConstraint15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D17);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
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
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(size2D20);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
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
        org.jfree.chart.block.Block block18 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        borderArrangement19.clear();
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.util.Size2D size2D24 = borderArrangement19.arrangeNN(blockContainer22, graphics2D23);
        borderArrangement19.clear();
        org.jfree.chart.block.Block block26 = null;
        java.lang.Object obj27 = null;
        borderArrangement19.add(block26, obj27);
        java.lang.Class<?> wildcardClass29 = borderArrangement19.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block18, (java.lang.Object) wildcardClass29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertNotNull(size2D24);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
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
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrange(blockContainer10, graphics2D11, rectangleConstraint12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
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
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D10);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
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
        java.lang.Class<?> wildcardClass28 = size2D27.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block17, (java.lang.Object) size2D27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(size2D27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
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
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
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
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeFR(blockContainer18, graphics2D19, rectangleConstraint20);
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
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFN(blockContainer16, graphics2D17, 0.0d);
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
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
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
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block15, (java.lang.Object) borderArrangement16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
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
        org.jfree.chart.block.Block block12 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) ' ');
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        boolean boolean21 = borderArrangement13.equals((java.lang.Object) (short) 10);
        boolean boolean23 = borderArrangement13.equals((java.lang.Object) '#');
        borderArrangement13.clear();
        borderArrangement13.clear();
        org.jfree.chart.block.BlockContainer blockContainer26 = null;
        java.awt.Graphics2D graphics2D27 = null;
        org.jfree.chart.util.Size2D size2D28 = borderArrangement13.arrangeNN(blockContainer26, graphics2D27);
        boolean boolean30 = borderArrangement13.equals((java.lang.Object) "hi!");
        boolean boolean32 = borderArrangement13.equals((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block12, (java.lang.Object) borderArrangement13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(size2D28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
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
        borderArrangement4.clear();
        borderArrangement4.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement4.arrangeNN(blockContainer18, graphics2D19);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block3, (java.lang.Object) size2D20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(size2D20);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
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
        org.jfree.chart.block.Block block13 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean16 = borderArrangement14.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement14.arrangeNN(blockContainer17, graphics2D18);
        java.lang.Object obj20 = null;
        boolean boolean21 = borderArrangement14.equals(obj20);
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.util.Size2D size2D24 = borderArrangement14.arrangeNN(blockContainer22, graphics2D23);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block13, (java.lang.Object) borderArrangement14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(size2D19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(size2D24);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
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
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
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
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
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
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertNotNull(size2D17);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
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
        org.jfree.chart.block.Block block11 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        borderArrangement12.clear();
        java.lang.Object obj15 = null;
        boolean boolean16 = borderArrangement12.equals(obj15);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement12.arrangeNN(blockContainer17, graphics2D18);
        java.lang.Class<?> wildcardClass20 = borderArrangement12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block11, (java.lang.Object) borderArrangement12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(size2D19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
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
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) '#');
        boolean boolean10 = borderArrangement0.equals((java.lang.Object) 0.0d);
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
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
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
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
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
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
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFN(blockContainer13, graphics2D14, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.Block block1 = null;
        java.lang.Object obj2 = null;
        borderArrangement0.add(block1, obj2);
        org.jfree.chart.block.Block block4 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement5 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement5.clear();
        borderArrangement5.clear();
        java.lang.Object obj8 = null;
        boolean boolean9 = borderArrangement5.equals(obj8);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block4, (java.lang.Object) borderArrangement5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
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
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFN(blockContainer13, graphics2D14, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
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
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
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
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeNN(blockContainer11, graphics2D12);
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
        org.junit.Assert.assertNotNull(size2D10);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeFR(blockContainer17, graphics2D18, rectangleConstraint19);
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
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
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
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
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
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFN(blockContainer11, graphics2D12, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D10);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        java.lang.Object obj6 = null;
        boolean boolean7 = borderArrangement0.equals(obj6);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeNN(blockContainer8, graphics2D9);
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFN(blockContainer11, graphics2D12, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D10);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
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
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFR(blockContainer12, graphics2D13, rectangleConstraint14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D8);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrange(blockContainer18, graphics2D19, rectangleConstraint20);
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
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
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
        java.lang.Class<?> wildcardClass14 = size2D13.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
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
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFN(blockContainer12, graphics2D13, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
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
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeFN(blockContainer9, graphics2D10, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
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
        org.jfree.chart.block.Block block14 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        borderArrangement15.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement15.arrangeNN(blockContainer18, graphics2D19);
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
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(size2D20);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
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
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
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
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
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
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeFF(blockContainer18, graphics2D19, rectangleConstraint20);
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
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
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
        java.lang.Class<?> wildcardClass11 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        org.jfree.chart.block.BlockContainer blockContainer5 = null;
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.util.Size2D size2D7 = borderArrangement0.arrangeNN(blockContainer5, graphics2D6);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        org.jfree.data.Range range10 = null;
        org.jfree.data.Range range11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeRR(blockContainer9, range10, range11, graphics2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
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
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFN(blockContainer13, graphics2D14, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
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
        org.jfree.chart.block.Block block15 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) ' ');
        borderArrangement16.clear();
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.util.Size2D size2D23 = borderArrangement16.arrangeNN(blockContainer21, graphics2D22);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block15, (java.lang.Object) borderArrangement16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(size2D23);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
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
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFN(blockContainer11, graphics2D12, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
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
        org.jfree.chart.block.Block block13 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement14.arrangeNN(blockContainer15, graphics2D16);
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.util.Size2D size2D23 = borderArrangement14.arrangeNN(blockContainer21, graphics2D22);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block13, (java.lang.Object) size2D23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D17);
        org.junit.Assert.assertNotNull(size2D23);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D14);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
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
        borderArrangement12.clear();
        boolean boolean21 = borderArrangement12.equals((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block11, (java.lang.Object) borderArrangement12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D10);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
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
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrange(blockContainer13, graphics2D14, rectangleConstraint15);
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
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
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
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
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
        java.lang.Class<?> wildcardClass16 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFF(blockContainer15, graphics2D16, rectangleConstraint17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
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
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertNotNull(size2D8);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
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
        borderArrangement20.clear();
        borderArrangement20.clear();
        boolean boolean28 = borderArrangement20.equals((java.lang.Object) (short) 10);
        org.jfree.chart.block.BlockContainer blockContainer29 = null;
        java.awt.Graphics2D graphics2D30 = null;
        org.jfree.chart.util.Size2D size2D31 = borderArrangement20.arrangeNN(blockContainer29, graphics2D30);
        borderArrangement20.clear();
        borderArrangement20.clear();
        borderArrangement20.clear();
        java.lang.Object obj35 = null;
        boolean boolean36 = borderArrangement20.equals(obj35);
        java.lang.Class<?> wildcardClass37 = borderArrangement20.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block19, (java.lang.Object) borderArrangement20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(size2D31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
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
        org.jfree.chart.block.Block block16 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        boolean boolean20 = borderArrangement17.equals((java.lang.Object) ' ');
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement17.arrangeNN(blockContainer24, graphics2D25);
        borderArrangement17.clear();
        boolean boolean29 = borderArrangement17.equals((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block16, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Character cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Character is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(size2D26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
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
        org.junit.Assert.assertNotNull(size2D17);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        org.jfree.chart.util.Size2D size2D8 = borderArrangement0.arrangeNN(blockContainer6, graphics2D7);
        java.lang.Class<?> wildcardClass9 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        java.lang.Class<?> wildcardClass6 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
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
        boolean boolean17 = borderArrangement15.equals((java.lang.Object) (byte) 1);
        boolean boolean19 = borderArrangement15.equals((java.lang.Object) 100.0f);
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
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
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
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFN(blockContainer11, graphics2D12, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D6);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
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
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
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
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) "");
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
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement12.arrangeNN(blockContainer24, graphics2D25);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block11, (java.lang.Object) borderArrangement12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(size2D26);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
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
        org.junit.Assert.assertNotNull(size2D8);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
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
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
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
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (double) ' ');
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
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFN(blockContainer12, graphics2D13, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFF(blockContainer16, graphics2D17, rectangleConstraint18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
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
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.Block block6 = null;
        java.lang.Object obj7 = null;
        borderArrangement0.add(block6, obj7);
        borderArrangement0.clear();
        org.jfree.chart.block.Block block10 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) ' ');
        borderArrangement11.clear();
        borderArrangement11.clear();
        borderArrangement11.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement11.arrangeNN(blockContainer18, graphics2D19);
        borderArrangement11.clear();
        boolean boolean23 = borderArrangement11.equals((java.lang.Object) '4');
        borderArrangement11.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block10, (java.lang.Object) borderArrangement11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(size2D20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
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
        org.jfree.chart.block.Block block10 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) ' ');
        borderArrangement11.clear();
        borderArrangement11.clear();
        borderArrangement11.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement11.arrangeNN(blockContainer18, graphics2D19);
        borderArrangement11.clear();
        boolean boolean23 = borderArrangement11.equals((java.lang.Object) '4');
        java.lang.Class<?> wildcardClass24 = borderArrangement11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block10, (java.lang.Object) borderArrangement11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(size2D20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFN(blockContainer15, graphics2D16, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D14);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
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
        org.jfree.chart.block.Block block13 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean16 = borderArrangement14.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement14.arrangeNN(blockContainer17, graphics2D18);
        java.lang.Object obj20 = null;
        boolean boolean21 = borderArrangement14.equals(obj20);
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.util.Size2D size2D24 = borderArrangement14.arrangeNN(blockContainer22, graphics2D23);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block13, (java.lang.Object) size2D24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(size2D19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(size2D24);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
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
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeFN(blockContainer9, graphics2D10, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D6);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(size2D16);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeFN(blockContainer10, graphics2D11, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D4);
        org.junit.Assert.assertNotNull(size2D9);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertNotNull(size2D18);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
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
        org.junit.Assert.assertNotNull(size2D17);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
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
            org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeFR(blockContainer8, graphics2D9, rectangleConstraint10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
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
        org.jfree.chart.block.Block block17 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement18 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer19 = null;
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.util.Size2D size2D21 = borderArrangement18.arrangeNN(blockContainer19, graphics2D20);
        borderArrangement18.clear();
        borderArrangement18.clear();
        boolean boolean25 = borderArrangement18.equals((java.lang.Object) true);
        boolean boolean27 = borderArrangement18.equals((java.lang.Object) (byte) 0);
        boolean boolean29 = borderArrangement18.equals((java.lang.Object) 100.0d);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(size2D16);
        org.junit.Assert.assertNotNull(size2D21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
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
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrange(blockContainer13, graphics2D14, rectangleConstraint15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
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
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
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
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        java.lang.Object obj4 = null;
        boolean boolean5 = borderArrangement0.equals(obj4);
        org.jfree.chart.block.Block block6 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement7.clear();
        borderArrangement7.clear();
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement7.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement7.arrangeNN(blockContainer13, graphics2D14);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block6, (java.lang.Object) size2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
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
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFN(blockContainer11, graphics2D12, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.chart.block.Block block9 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement10 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement10.clear();
        boolean boolean13 = borderArrangement10.equals((java.lang.Object) ' ');
        borderArrangement10.clear();
        borderArrangement10.clear();
        borderArrangement10.clear();
        boolean boolean18 = borderArrangement10.equals((java.lang.Object) (short) 10);
        boolean boolean20 = borderArrangement10.equals((java.lang.Object) (byte) 100);
        borderArrangement10.clear();
        borderArrangement10.clear();
        java.lang.Class<?> wildcardClass23 = borderArrangement10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block9, (java.lang.Object) borderArrangement10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeFN(blockContainer10, graphics2D11, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.Block block1 = null;
        java.lang.Object obj2 = null;
        borderArrangement0.add(block1, obj2);
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
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFR(blockContainer12, graphics2D13, rectangleConstraint14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
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
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeFN(blockContainer9, graphics2D10, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(size2D16);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (double) '#');
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
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
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
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement11.clear();
        boolean boolean14 = borderArrangement11.equals((java.lang.Object) ' ');
        borderArrangement11.clear();
        borderArrangement11.clear();
        borderArrangement11.clear();
        borderArrangement11.clear();
        borderArrangement11.clear();
        borderArrangement11.clear();
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.util.Size2D size2D23 = borderArrangement11.arrangeNN(blockContainer21, graphics2D22);
        java.lang.Class<?> wildcardClass24 = borderArrangement11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block10, (java.lang.Object) borderArrangement11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(size2D23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeFN(blockContainer6, graphics2D7, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
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
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeFN(blockContainer17, graphics2D18, (double) 10.0f);
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
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
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
        boolean boolean19 = borderArrangement17.equals((java.lang.Object) (-1));
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block16, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Integer is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
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
        org.junit.Assert.assertNotNull(size2D8);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
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
        org.junit.Assert.assertNotNull(size2D10);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
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
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrange(blockContainer16, graphics2D17, rectangleConstraint18);
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
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block2 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement3 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean5 = borderArrangement3.equals((java.lang.Object) (-1));
        borderArrangement3.clear();
        borderArrangement3.clear();
        borderArrangement3.clear();
        java.lang.Class<?> wildcardClass9 = borderArrangement3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block2, (java.lang.Object) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
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
        org.jfree.chart.block.Block block11 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) ' ');
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block11, (java.lang.Object) borderArrangement12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
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
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
        org.jfree.chart.block.Block block7 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.util.Size2D size2D11 = borderArrangement8.arrangeNN(blockContainer9, graphics2D10);
        borderArrangement8.clear();
        boolean boolean14 = borderArrangement8.equals((java.lang.Object) 100.0d);
        boolean boolean16 = borderArrangement8.equals((java.lang.Object) '#');
        boolean boolean18 = borderArrangement8.equals((java.lang.Object) 10.0f);
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
        org.junit.Assert.assertNotNull(size2D6);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
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
        java.lang.Object obj26 = null;
        boolean boolean27 = borderArrangement13.equals(obj26);
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D8);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(size2D18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block6 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement7 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean9 = borderArrangement7.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer10 = null;
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.util.Size2D size2D12 = borderArrangement7.arrangeNN(blockContainer10, graphics2D11);
        java.lang.Object obj13 = null;
        boolean boolean14 = borderArrangement7.equals(obj13);
        borderArrangement7.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block6, (java.lang.Object) borderArrangement7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
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
        java.lang.Class<?> wildcardClass13 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
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
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFR(blockContainer15, graphics2D16, rectangleConstraint17);
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
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
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
        java.lang.Class<?> wildcardClass11 = borderArrangement0.getClass();
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrange(blockContainer16, graphics2D17, rectangleConstraint18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
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
        org.jfree.chart.block.Block block13 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement14.arrangeNN(blockContainer16, graphics2D17);
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        java.lang.Class<?> wildcardClass22 = borderArrangement14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block13, (java.lang.Object) wildcardClass22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(size2D18);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
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
        org.jfree.chart.block.Block block10 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement11 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer12 = null;
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.util.Size2D size2D14 = borderArrangement11.arrangeNN(blockContainer12, graphics2D13);
        borderArrangement11.clear();
        borderArrangement11.clear();
        borderArrangement11.clear();
        java.lang.Object obj18 = null;
        boolean boolean19 = borderArrangement11.equals(obj18);
        borderArrangement11.clear();
        java.lang.Object obj21 = null;
        boolean boolean22 = borderArrangement11.equals(obj21);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block10, (java.lang.Object) borderArrangement11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertNotNull(size2D14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
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
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
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
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(size2D21);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
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
        org.jfree.chart.block.BorderArrangement borderArrangement16 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement16.clear();
        boolean boolean19 = borderArrangement16.equals((java.lang.Object) ' ');
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        borderArrangement16.clear();
        org.jfree.chart.block.BlockContainer blockContainer27 = null;
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.util.Size2D size2D29 = borderArrangement16.arrangeNN(blockContainer27, graphics2D28);
        borderArrangement16.clear();
        org.jfree.chart.block.BlockContainer blockContainer31 = null;
        java.awt.Graphics2D graphics2D32 = null;
        org.jfree.chart.util.Size2D size2D33 = borderArrangement16.arrangeNN(blockContainer31, graphics2D32);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block15, (java.lang.Object) size2D33);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(size2D29);
        org.junit.Assert.assertNotNull(size2D33);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFN(blockContainer13, graphics2D14, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeFR(blockContainer18, graphics2D19, rectangleConstraint20);
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
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFF(blockContainer16, graphics2D17, rectangleConstraint18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
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
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
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
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
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
        org.junit.Assert.assertNotNull(size2D20);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeFN(blockContainer6, graphics2D7, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
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
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFN(blockContainer12, graphics2D13, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFF(blockContainer12, graphics2D13, rectangleConstraint14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
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
        org.jfree.chart.block.Block block13 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        borderArrangement14.clear();
        java.lang.Object obj17 = null;
        boolean boolean18 = borderArrangement14.equals(obj17);
        borderArrangement14.clear();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
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
        org.jfree.chart.block.Block block11 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement12.arrangeNN(blockContainer13, graphics2D14);
        borderArrangement12.clear();
        borderArrangement12.clear();
        boolean boolean19 = borderArrangement12.equals((java.lang.Object) true);
        borderArrangement12.clear();
        java.lang.Object obj21 = null;
        boolean boolean22 = borderArrangement12.equals(obj21);
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        java.lang.Class<?> wildcardClass26 = borderArrangement12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block11, (java.lang.Object) borderArrangement12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D6);
        org.junit.Assert.assertNotNull(size2D10);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
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
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFR(blockContainer11, graphics2D12, rectangleConstraint13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
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
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) "");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeFR(blockContainer19, graphics2D20, rectangleConstraint21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertNotNull(size2D18);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
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
        java.lang.Class<?> wildcardClass20 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeFN(blockContainer6, graphics2D7, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeFF(blockContainer10, graphics2D11, rectangleConstraint12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer7 = null;
        java.awt.Graphics2D graphics2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D10 = borderArrangement0.arrangeFN(blockContainer7, graphics2D8, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
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
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
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
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
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
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
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
        org.jfree.chart.block.Block block12 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean15 = borderArrangement13.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        org.jfree.chart.util.Size2D size2D18 = borderArrangement13.arrangeNN(blockContainer16, graphics2D17);
        boolean boolean20 = borderArrangement13.equals((java.lang.Object) (-1));
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement13.arrangeNN(blockContainer24, graphics2D25);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block12, (java.lang.Object) size2D26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(size2D18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(size2D26);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
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
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
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
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFF(blockContainer15, graphics2D16, rectangleConstraint17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
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
        org.jfree.chart.block.Block block14 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement15.clear();
        boolean boolean18 = borderArrangement15.equals((java.lang.Object) ' ');
        borderArrangement15.clear();
        borderArrangement15.clear();
        borderArrangement15.clear();
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.util.Size2D size2D24 = borderArrangement15.arrangeNN(blockContainer22, graphics2D23);
        borderArrangement15.clear();
        java.lang.Class<?> wildcardClass26 = borderArrangement15.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(size2D24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
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
        org.jfree.chart.block.Block block18 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement19.clear();
        boolean boolean22 = borderArrangement19.equals((java.lang.Object) ' ');
        borderArrangement19.clear();
        borderArrangement19.clear();
        borderArrangement19.clear();
        boolean boolean27 = borderArrangement19.equals((java.lang.Object) (short) 10);
        boolean boolean29 = borderArrangement19.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer30 = null;
        java.awt.Graphics2D graphics2D31 = null;
        org.jfree.chart.util.Size2D size2D32 = borderArrangement19.arrangeNN(blockContainer30, graphics2D31);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(size2D17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(size2D32);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
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
        org.junit.Assert.assertNotNull(size2D16);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
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
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeFN(blockContainer18, graphics2D19, (double) 100);
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
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
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
        java.lang.Class<?> wildcardClass14 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        boolean boolean6 = borderArrangement0.equals((java.lang.Object) 100.0d);
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) '#');
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        org.jfree.data.Range range10 = null;
        org.jfree.data.Range range11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeRR(blockContainer9, range10, range11, graphics2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFN(blockContainer11, graphics2D12, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
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
        org.junit.Assert.assertNotNull(size2D4);
        org.junit.Assert.assertNotNull(size2D9);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
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
        org.jfree.chart.block.Block block13 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean16 = borderArrangement14.equals((java.lang.Object) (byte) 1);
        boolean boolean18 = borderArrangement14.equals((java.lang.Object) 100.0f);
        borderArrangement14.clear();
        borderArrangement14.clear();
        java.lang.Class<?> wildcardClass21 = borderArrangement14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block13, (java.lang.Object) wildcardClass21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
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
        java.lang.Class<?> wildcardClass17 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer4 = null;
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.util.Size2D size2D6 = borderArrangement0.arrangeNN(blockContainer4, graphics2D5);
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D6);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
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
        org.jfree.chart.block.Block block18 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer20 = null;
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.util.Size2D size2D22 = borderArrangement19.arrangeNN(blockContainer20, graphics2D21);
        borderArrangement19.clear();
        boolean boolean25 = borderArrangement19.equals((java.lang.Object) 100.0d);
        boolean boolean27 = borderArrangement19.equals((java.lang.Object) '#');
        boolean boolean29 = borderArrangement19.equals((java.lang.Object) 10.0f);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D14);
        org.junit.Assert.assertNotNull(size2D17);
        org.junit.Assert.assertNotNull(size2D22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrange(blockContainer11, graphics2D12, rectangleConstraint13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
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
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (byte) 1);
        boolean boolean4 = borderArrangement0.equals((java.lang.Object) 100.0f);
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Class<?> wildcardClass8 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
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
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
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
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
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
        org.jfree.chart.block.Block block12 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement13 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement13.clear();
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) ' ');
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement13.arrangeNN(blockContainer17, graphics2D18);
        org.jfree.chart.block.Block block20 = null;
        java.lang.Object obj21 = null;
        borderArrangement13.add(block20, obj21);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block12, (java.lang.Object) borderArrangement13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(size2D19);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
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
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean8 = borderArrangement0.equals((java.lang.Object) (short) 10);
        java.lang.Object obj9 = null;
        boolean boolean10 = borderArrangement0.equals(obj9);
        org.jfree.chart.block.Block block11 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        org.jfree.chart.util.Size2D size2D15 = borderArrangement12.arrangeNN(blockContainer13, graphics2D14);
        borderArrangement12.clear();
        boolean boolean18 = borderArrangement12.equals((java.lang.Object) 100.0d);
        org.jfree.chart.block.Block block19 = null;
        java.lang.Object obj20 = null;
        borderArrangement12.add(block19, obj20);
        borderArrangement12.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block11, (java.lang.Object) borderArrangement12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
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
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block14, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Character cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Character is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
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
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block12, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Character cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Character is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(size2D22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
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
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(size2D17);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
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
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeFN(blockContainer10, graphics2D11, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D8);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
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
        org.jfree.chart.block.Block block20 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement21 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement21.clear();
        boolean boolean24 = borderArrangement21.equals((java.lang.Object) ' ');
        borderArrangement21.clear();
        borderArrangement21.clear();
        borderArrangement21.clear();
        org.jfree.chart.block.BlockContainer blockContainer28 = null;
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.util.Size2D size2D30 = borderArrangement21.arrangeNN(blockContainer28, graphics2D29);
        borderArrangement21.clear();
        boolean boolean33 = borderArrangement21.equals((java.lang.Object) '4');
        java.lang.Object obj34 = null;
        boolean boolean35 = borderArrangement21.equals(obj34);
        borderArrangement21.clear();
        org.jfree.chart.block.BlockContainer blockContainer37 = null;
        java.awt.Graphics2D graphics2D38 = null;
        org.jfree.chart.util.Size2D size2D39 = borderArrangement21.arrangeNN(blockContainer37, graphics2D38);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block20, (java.lang.Object) borderArrangement21);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(size2D30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(size2D39);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
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
        java.lang.Class<?> wildcardClass13 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFN(blockContainer11, graphics2D12, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
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
        org.jfree.chart.block.Block block11 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement12 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement12.clear();
        boolean boolean15 = borderArrangement12.equals((java.lang.Object) ' ');
        borderArrangement12.clear();
        borderArrangement12.clear();
        borderArrangement12.clear();
        boolean boolean20 = borderArrangement12.equals((java.lang.Object) (short) 10);
        boolean boolean22 = borderArrangement12.equals((java.lang.Object) (byte) 100);
        borderArrangement12.clear();
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement12.arrangeNN(blockContainer24, graphics2D25);
        java.lang.Class<?> wildcardClass27 = borderArrangement12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block11, (java.lang.Object) wildcardClass27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(size2D26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        borderArrangement0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = borderArrangement0.equals(obj3);
        borderArrangement0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
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
            org.jfree.chart.util.Size2D size2D26 = borderArrangement0.arrangeFN(blockContainer23, graphics2D24, (double) (short) 1);
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
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
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
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
        org.jfree.chart.block.BlockContainer blockContainer13 = null;
        java.awt.Graphics2D graphics2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFN(blockContainer13, graphics2D14, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFR(blockContainer11, graphics2D12, rectangleConstraint13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertNotNull(size2D10);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
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
        java.lang.Class<?> wildcardClass18 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(size2D17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
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
        org.jfree.chart.block.Block block18 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement19 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean21 = borderArrangement19.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer22 = null;
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.util.Size2D size2D24 = borderArrangement19.arrangeNN(blockContainer22, graphics2D23);
        org.jfree.chart.block.Block block25 = null;
        java.lang.Object obj26 = null;
        borderArrangement19.add(block25, obj26);
        boolean boolean29 = borderArrangement19.equals((java.lang.Object) 1L);
        borderArrangement19.clear();
        java.lang.Object obj31 = null;
        boolean boolean32 = borderArrangement19.equals(obj31);
        boolean boolean34 = borderArrangement19.equals((java.lang.Object) ' ');
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D14);
        org.junit.Assert.assertNotNull(size2D17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(size2D24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D24 = borderArrangement0.arrangeFN(blockContainer21, graphics2D22, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeFN(blockContainer9, graphics2D10, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
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
        borderArrangement11.clear();
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement11.arrangeNN(blockContainer24, graphics2D25);
        boolean boolean28 = borderArrangement11.equals((java.lang.Object) "hi!");
        boolean boolean30 = borderArrangement11.equals((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass31 = borderArrangement11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block10, (java.lang.Object) borderArrangement11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(size2D26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
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
        org.jfree.chart.block.BlockContainer blockContainer16 = null;
        java.awt.Graphics2D graphics2D17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFN(blockContainer16, graphics2D17, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
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
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFF(blockContainer12, graphics2D13, rectangleConstraint14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
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
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
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
        org.jfree.chart.block.BlockContainer blockContainer11 = null;
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.util.Size2D size2D13 = borderArrangement10.arrangeNN(blockContainer11, graphics2D12);
        borderArrangement10.clear();
        boolean boolean16 = borderArrangement10.equals((java.lang.Object) 100.0d);
        borderArrangement10.clear();
        java.lang.Class<?> wildcardClass18 = borderArrangement10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block9, (java.lang.Object) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
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
            org.jfree.chart.util.Size2D size2D24 = borderArrangement0.arrange(blockContainer21, graphics2D22, rectangleConstraint23);
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
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
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
        boolean boolean14 = borderArrangement12.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer15 = null;
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.util.Size2D size2D17 = borderArrangement12.arrangeNN(blockContainer15, graphics2D16);
        org.jfree.chart.block.Block block18 = null;
        java.lang.Object obj19 = null;
        borderArrangement12.add(block18, obj19);
        boolean boolean22 = borderArrangement12.equals((java.lang.Object) 1L);
        borderArrangement12.clear();
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
        org.junit.Assert.assertNotNull(size2D6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(size2D17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean2 = borderArrangement0.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer3 = null;
        java.awt.Graphics2D graphics2D4 = null;
        org.jfree.chart.util.Size2D size2D5 = borderArrangement0.arrangeNN(blockContainer3, graphics2D4);
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (-1));
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer9 = null;
        java.awt.Graphics2D graphics2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeFN(blockContainer9, graphics2D10, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
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
        org.junit.Assert.assertNotNull(size2D12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer2 = null;
        java.awt.Graphics2D graphics2D3 = null;
        org.jfree.chart.util.Size2D size2D4 = borderArrangement0.arrangeNN(blockContainer2, graphics2D3);
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) (byte) 10);
        org.jfree.chart.block.BlockContainer blockContainer8 = null;
        java.awt.Graphics2D graphics2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D11 = borderArrangement0.arrangeFN(blockContainer8, graphics2D9, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
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
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrange(blockContainer18, graphics2D19, rectangleConstraint20);
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
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
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
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.block.RectangleConstraint rectangleConstraint13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFF(blockContainer11, graphics2D12, rectangleConstraint13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
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
        boolean boolean20 = borderArrangement18.equals((java.lang.Object) (byte) 1);
        borderArrangement18.clear();
        borderArrangement18.clear();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
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
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFN(blockContainer16, graphics2D17, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
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
        org.junit.Assert.assertNotNull(size2D6);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D19 = borderArrangement0.arrangeFN(blockContainer16, graphics2D17, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
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
        org.jfree.chart.block.BlockContainer blockContainer29 = null;
        java.awt.Graphics2D graphics2D30 = null;
        org.jfree.chart.util.Size2D size2D31 = borderArrangement16.arrangeNN(blockContainer29, graphics2D30);
        borderArrangement16.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block15, (java.lang.Object) borderArrangement16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertNotNull(size2D14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(size2D31);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D18 = borderArrangement0.arrangeFN(blockContainer15, graphics2D16, 0.0d);
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
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
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
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFN(blockContainer13, graphics2D14, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
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
        org.jfree.chart.block.Block block13 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement14 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement14.clear();
        boolean boolean17 = borderArrangement14.equals((java.lang.Object) ' ');
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        borderArrangement14.clear();
        org.jfree.chart.block.BlockContainer blockContainer24 = null;
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.util.Size2D size2D26 = borderArrangement14.arrangeNN(blockContainer24, graphics2D25);
        org.jfree.chart.block.Block block27 = null;
        java.lang.Object obj28 = null;
        borderArrangement14.add(block27, obj28);
        boolean boolean31 = borderArrangement14.equals((java.lang.Object) (short) 1);
        borderArrangement14.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block13, (java.lang.Object) borderArrangement14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(size2D26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
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
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFN(blockContainer11, graphics2D12, (double) (byte) -1);
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
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
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
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFN(blockContainer12, graphics2D13, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
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
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.util.Size2D size2D23 = borderArrangement20.arrangeNN(blockContainer21, graphics2D22);
        borderArrangement20.clear();
        borderArrangement20.clear();
        boolean boolean27 = borderArrangement20.equals((java.lang.Object) true);
        borderArrangement20.clear();
        java.lang.Object obj29 = null;
        boolean boolean30 = borderArrangement20.equals(obj29);
        borderArrangement20.clear();
        borderArrangement20.clear();
        org.jfree.chart.block.BlockContainer blockContainer33 = null;
        java.awt.Graphics2D graphics2D34 = null;
        org.jfree.chart.util.Size2D size2D35 = borderArrangement20.arrangeNN(blockContainer33, graphics2D34);
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
        org.junit.Assert.assertNotNull(size2D23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(size2D35);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFN(blockContainer12, graphics2D13, 0.0d);
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
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D14 = borderArrangement0.arrangeFN(blockContainer11, graphics2D12, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        org.jfree.chart.block.Block block8 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) ' ');
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement9.arrangeNN(blockContainer17, graphics2D18);
        java.lang.Class<?> wildcardClass20 = borderArrangement9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block8, (java.lang.Object) wildcardClass20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Class is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D21 = borderArrangement0.arrangeFN(blockContainer18, graphics2D19, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
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
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeFN(blockContainer17, graphics2D18, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(size2D16);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
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
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D24 = borderArrangement0.arrangeFN(blockContainer21, graphics2D22, 10.0d);
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
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
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
        org.jfree.chart.block.Block block16 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement17 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement17.clear();
        boolean boolean20 = borderArrangement17.equals((java.lang.Object) ' ');
        borderArrangement17.clear();
        borderArrangement17.clear();
        borderArrangement17.clear();
        boolean boolean25 = borderArrangement17.equals((java.lang.Object) (short) 10);
        borderArrangement17.clear();
        org.jfree.chart.block.Block block27 = null;
        java.lang.Object obj28 = null;
        borderArrangement17.add(block27, obj28);
        org.jfree.chart.block.BlockContainer blockContainer30 = null;
        java.awt.Graphics2D graphics2D31 = null;
        org.jfree.chart.util.Size2D size2D32 = borderArrangement17.arrangeNN(blockContainer30, graphics2D31);
        borderArrangement17.clear();
        borderArrangement17.clear();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block16, (java.lang.Object) borderArrangement17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(size2D32);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
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
        org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeNN(blockContainer10, graphics2D11);
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
        org.junit.Assert.assertNotNull(size2D4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D12);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeFN(blockContainer10, graphics2D11, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
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
        org.junit.Assert.assertNotNull(size2D15);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrange(blockContainer14, graphics2D15, rectangleConstraint16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean9 = borderArrangement0.equals((java.lang.Object) "");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
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
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrangeFN(blockContainer19, graphics2D20, (double) 1L);
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
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
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
            org.jfree.chart.util.Size2D size2D12 = borderArrangement0.arrangeFN(blockContainer9, graphics2D10, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
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
            org.jfree.chart.util.Size2D size2D22 = borderArrangement0.arrange(blockContainer19, graphics2D20, rectangleConstraint21);
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
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.BlockContainer blockContainer6 = null;
        java.awt.Graphics2D graphics2D7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D9 = borderArrangement0.arrangeFN(blockContainer6, graphics2D7, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
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
        org.jfree.chart.block.Block block19 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement20 = new org.jfree.chart.block.BorderArrangement();
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block19, (java.lang.Object) borderArrangement20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(size2D18);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
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
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D17 = borderArrangement0.arrangeFN(blockContainer14, graphics2D15, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Range(double, double): require lower (0.0) <= upper (-1.0).");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
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
        boolean boolean16 = borderArrangement13.equals((java.lang.Object) ' ');
        borderArrangement13.clear();
        borderArrangement13.clear();
        borderArrangement13.clear();
        boolean boolean21 = borderArrangement13.equals((java.lang.Object) (short) 10);
        borderArrangement13.clear();
        org.jfree.chart.block.Block block23 = null;
        java.lang.Object obj24 = null;
        borderArrangement13.add(block23, obj24);
        org.jfree.chart.block.BlockContainer blockContainer26 = null;
        java.awt.Graphics2D graphics2D27 = null;
        org.jfree.chart.util.Size2D size2D28 = borderArrangement13.arrangeNN(blockContainer26, graphics2D27);
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
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(size2D28);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeFN(blockContainer13, graphics2D14, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D19);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        org.jfree.chart.block.BlockContainer blockContainer1 = null;
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.util.Size2D size2D3 = borderArrangement0.arrangeNN(blockContainer1, graphics2D2);
        borderArrangement0.clear();
        borderArrangement0.clear();
        boolean boolean7 = borderArrangement0.equals((java.lang.Object) true);
        org.jfree.chart.block.Block block8 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement9 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement9.clear();
        boolean boolean12 = borderArrangement9.equals((java.lang.Object) ' ');
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        borderArrangement9.clear();
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement9.arrangeNN(blockContainer18, graphics2D19);
        org.jfree.chart.block.BlockContainer blockContainer21 = null;
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.util.Size2D size2D23 = borderArrangement9.arrangeNN(blockContainer21, graphics2D22);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block8, (java.lang.Object) size2D23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.util.Size2D cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.util.Size2D and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D20);
        org.junit.Assert.assertNotNull(size2D23);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
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
        org.jfree.chart.block.Block block16 = null;
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block16, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class org.jfree.chart.util.RectangleEdge (java.lang.Byte is in module java.base of loader 'bootstrap'; org.jfree.chart.util.RectangleEdge is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(size2D7);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
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
        java.lang.Class<?> wildcardClass10 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        org.jfree.chart.block.BorderArrangement borderArrangement0 = new org.jfree.chart.block.BorderArrangement();
        borderArrangement0.clear();
        boolean boolean3 = borderArrangement0.equals((java.lang.Object) ' ');
        borderArrangement0.clear();
        borderArrangement0.clear();
        borderArrangement0.clear();
        org.jfree.chart.block.Block block7 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement8 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean10 = borderArrangement8.equals((java.lang.Object) (byte) 1);
        boolean boolean12 = borderArrangement8.equals((java.lang.Object) 100.0f);
        borderArrangement8.clear();
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement8.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.util.Size2D size2D19 = borderArrangement8.arrangeNN(blockContainer17, graphics2D18);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block7, (java.lang.Object) borderArrangement8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(size2D16);
        org.junit.Assert.assertNotNull(size2D19);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
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
        org.jfree.chart.block.RectangleConstraint rectangleConstraint14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D15 = borderArrangement0.arrangeFF(blockContainer12, graphics2D13, rectangleConstraint14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(size2D11);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
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
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D13 = borderArrangement0.arrangeFN(blockContainer10, graphics2D11, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(size2D4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
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
        org.jfree.chart.block.Block block14 = null;
        org.jfree.chart.block.BorderArrangement borderArrangement15 = new org.jfree.chart.block.BorderArrangement();
        boolean boolean17 = borderArrangement15.equals((java.lang.Object) (-1));
        org.jfree.chart.block.BlockContainer blockContainer18 = null;
        java.awt.Graphics2D graphics2D19 = null;
        org.jfree.chart.util.Size2D size2D20 = borderArrangement15.arrangeNN(blockContainer18, graphics2D19);
        org.jfree.chart.block.Block block21 = null;
        java.lang.Object obj22 = null;
        borderArrangement15.add(block21, obj22);
        boolean boolean25 = borderArrangement15.equals((java.lang.Object) 1L);
        borderArrangement15.clear();
        borderArrangement15.clear();
        org.jfree.chart.block.BlockContainer blockContainer28 = null;
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.util.Size2D size2D30 = borderArrangement15.arrangeNN(blockContainer28, graphics2D29);
        // The following exception was thrown during execution in test generation
        try {
            borderArrangement0.add(block14, (java.lang.Object) borderArrangement15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jfree.chart.block.BorderArrangement cannot be cast to class org.jfree.chart.util.RectangleEdge (org.jfree.chart.block.BorderArrangement and org.jfree.chart.util.RectangleEdge are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(size2D5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(size2D20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(size2D30);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
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
        org.jfree.chart.block.BlockContainer blockContainer14 = null;
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.Size2D size2D16 = borderArrangement0.arrangeNN(blockContainer14, graphics2D15);
        org.jfree.chart.block.BlockContainer blockContainer17 = null;
        java.awt.Graphics2D graphics2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.Size2D size2D20 = borderArrangement0.arrangeFN(blockContainer17, graphics2D18, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D13);
        org.junit.Assert.assertNotNull(size2D16);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
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
        java.lang.Class<?> wildcardClass16 = borderArrangement0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(size2D14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }
}

